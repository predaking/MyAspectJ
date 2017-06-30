package com.example.lw.appline.com.google.ads;

import android.app.Activity;
import android.webkit.WebView;
import com.google.ads.b.g;
import com.google.ads.e.d;
import com.google.ads.e.k.c;
import com.google.ads.e.k.d;
import java.util.HashMap;

public class j
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    if ((Activity)paramg.i().c.a() == null) {
      d.e("Activity was null while responding to touch gmsg.");
    }
    for (;;)
    {
      return;
      paramWebView = (String)paramHashMap.get("tx");
      String str = (String)paramHashMap.get("ty");
      paramHashMap = (String)paramHashMap.get("td");
      try
      {
        int i = Integer.parseInt(paramWebView);
        int j = Integer.parseInt(str);
        int k = Integer.parseInt(paramHashMap);
        paramg = (r)paramg.i().r.a();
        if (paramg != null)
        {
          paramg.a(i, j, k);
          return;
        }
      }
      catch (NumberFormatException paramg)
      {
        d.e("Could not parse touch parameters from gmsg.");
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.j
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */