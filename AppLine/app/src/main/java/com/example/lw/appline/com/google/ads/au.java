package com.example.lw.appline.com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.c;
import com.google.ads.b.g;
import com.google.ads.e.d;
import java.util.HashMap;

public class au
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    if ((paramWebView instanceof c))
    {
      ((c)paramWebView).f();
      return;
    }
    d.b("Trying to close WebView that isn't an AdWebView");
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.au
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */