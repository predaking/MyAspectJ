package com.example.lw.appline.com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.f;
import com.google.ads.b.g;
import com.google.ads.e.d;
import java.util.HashMap;

public class ax
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramWebView = (String)paramHashMap.get("type");
    paramHashMap = (String)paramHashMap.get("errors");
    d.e("Invalid " + paramWebView + " request error: " + paramHashMap);
    paramg = paramg.k();
    if (paramg != null) {
      paramg.a(c.a.a);
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ax
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */