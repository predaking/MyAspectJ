package com.example.lw.appline.com.google.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.b.g;
import com.google.ads.e.h;
import java.util.HashMap;

public class as
  implements aq
{
  private static final com.google.ads.b.d a = (com.google.ads.b.d)com.google.ads.b.d.a.b();
  
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramg = (String)paramHashMap.get("urls");
    if (paramg == null)
    {
      com.google.ads.e.d.e("Could not get the urls param from canOpenURLs gmsg.");
      return;
    }
    paramHashMap = paramg.split(",");
    HashMap localHashMap = new HashMap();
    PackageManager localPackageManager = paramWebView.getContext().getPackageManager();
    int j = paramHashMap.length;
    int i = 0;
    if (i < j)
    {
      Object localObject = paramHashMap[i];
      paramg = localObject.split(";", 2);
      String str = paramg[0];
      if (paramg.length >= 2)
      {
        paramg = paramg[1];
        label89:
        if (localPackageManager.resolveActivity(new Intent(paramg, Uri.parse(str)), 65536) == null) {
          break label143;
        }
      }
      label143:
      for (boolean bool = true;; bool = false)
      {
        localHashMap.put(localObject, Boolean.valueOf(bool));
        i += 1;
        break;
        paramg = "android.intent.action.VIEW";
        break label89;
      }
    }
    a.a(paramWebView, localHashMap);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.as
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */