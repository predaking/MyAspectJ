package com.example.lw.appline.com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.b.a;
import com.google.ads.b.g;
import com.google.ads.e.d;
import java.util.HashMap;

public class i
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    int m = -1;
    if ((paramWebView instanceof a)) {}
    for (;;)
    {
      try
      {
        if (TextUtils.isEmpty((CharSequence)paramHashMap.get("w"))) {
          break label247;
        }
        i = Integer.parseInt((String)paramHashMap.get("w"));
        if (TextUtils.isEmpty((CharSequence)paramHashMap.get("h"))) {
          break label241;
        }
        j = Integer.parseInt((String)paramHashMap.get("h"));
        if (TextUtils.isEmpty((CharSequence)paramHashMap.get("x"))) {
          break label235;
        }
        k = Integer.parseInt((String)paramHashMap.get("x"));
        if (!TextUtils.isEmpty((CharSequence)paramHashMap.get("y"))) {
          m = Integer.parseInt((String)paramHashMap.get("y"));
        }
        if ((paramHashMap.get("a") != null) && (((String)paramHashMap.get("a")).equals("1")))
        {
          paramg.a(null, true, k, m, i, j);
          return;
        }
      }
      catch (NumberFormatException paramg)
      {
        d.d("Invalid number format in activation overlay response.", paramg);
        return;
      }
      if ((paramHashMap.get("a") != null) && (((String)paramHashMap.get("a")).equals("0")))
      {
        paramg.a(null, false, k, m, i, j);
        return;
      }
      paramg.a(k, m, i, j);
      return;
      d.b("Trying to activate an overlay when this is not an overlay.");
      return;
      label235:
      int k = -1;
      continue;
      label241:
      int j = -1;
      continue;
      label247:
      int i = -1;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.i
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */