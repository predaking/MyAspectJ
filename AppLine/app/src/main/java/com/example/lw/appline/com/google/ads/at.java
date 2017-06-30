package com.example.lw.appline.com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.b.g;
import com.google.ads.b.j;
import com.google.ads.e.d;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import java.util.HashMap;
import java.util.Locale;

public class at
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("u");
    if (str == null)
    {
      d.e("Could not get URL from click gmsg.");
      return;
    }
    j localj = paramg.n();
    if (localj != null)
    {
      paramHashMap = Uri.parse(str);
      paramWebView = paramHashMap.getHost();
      if ((paramWebView != null) && (paramWebView.toLowerCase(Locale.US).endsWith(".admob.com")))
      {
        paramWebView = null;
        Object localObject = paramHashMap.getPath();
        paramHashMap = paramWebView;
        if (localObject != null)
        {
          localObject = ((String)localObject).split("/");
          paramHashMap = paramWebView;
          if (localObject.length >= 4) {
            paramHashMap = localObject[2] + "/" + localObject[3];
          }
        }
        localj.a(paramHashMap);
      }
    }
    paramHashMap = paramg.i();
    paramWebView = (Context)paramHashMap.f.a();
    paramg = Uri.parse(str);
    try
    {
      paramHashMap = (s)paramHashMap.s.a();
      if ((paramHashMap != null) && (paramHashMap.a(paramg)))
      {
        paramHashMap = paramHashMap.a(paramg, paramWebView);
        paramg = paramHashMap;
        new Thread(new l(paramg.toString(), paramWebView)).start();
        return;
      }
    }
    catch (t paramHashMap)
    {
      for (;;)
      {
        d.e("Unable to append parameter to URL: " + str);
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.at
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */