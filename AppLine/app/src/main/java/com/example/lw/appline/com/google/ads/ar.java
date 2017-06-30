package com.example.lw.appline.com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.g;
import com.google.ads.e.d;
import java.util.HashMap;

public class ar
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramWebView = (String)paramHashMap.get("name");
    if (paramWebView == null)
    {
      d.b("Error: App event with no name parameter.");
      return;
    }
    paramg.a(paramWebView, (String)paramHashMap.get("info"));
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ar
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */