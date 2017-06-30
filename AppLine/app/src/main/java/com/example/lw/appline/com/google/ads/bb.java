package com.example.lw.appline.com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.g;
import com.google.ads.b.h;
import com.google.ads.e.d;
import java.util.HashMap;

public class bb
  implements aq
{
  private AdActivity.a a;
  
  public bb()
  {
    this(new AdActivity.a());
  }
  
  public bb(AdActivity.a parama)
  {
    this.a = parama;
  }
  
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramWebView = (String)paramHashMap.get("a");
    if (paramWebView == null)
    {
      d.a("Could not get the action parameter for open GMSG.");
      return;
    }
    if (paramWebView.equals("webapp"))
    {
      this.a.a(paramg, new h("webapp", paramHashMap));
      return;
    }
    if (paramWebView.equals("expand"))
    {
      this.a.a(paramg, new h("expand", paramHashMap));
      return;
    }
    this.a.a(paramg, new h("intent", paramHashMap));
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.bb
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */