package com.example.lw.appline.com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.b.g;
import com.google.ads.e.d;
import com.google.ads.e.k.b;
import java.util.HashMap;

public class aw
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramHashMap = (String)paramHashMap.get("u");
    if (TextUtils.isEmpty(paramHashMap))
    {
      d.e("Could not get URL from track gmsg.");
      return;
    }
    new Thread(new l(paramHashMap, (Context)paramg.i().f.a())).start();
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.aw
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */