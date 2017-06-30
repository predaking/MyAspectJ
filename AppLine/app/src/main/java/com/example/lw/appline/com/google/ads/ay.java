package com.example.lw.appline.com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.b.f;
import com.google.ads.b.f.d;
import com.google.ads.b.g;
import com.google.ads.e.a;
import com.google.ads.e.d;
import com.google.ads.e.k.c;
import com.google.ads.e.k.d;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

public class ay
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("url");
    paramWebView = (String)paramHashMap.get("type");
    Object localObject2 = (String)paramHashMap.get("afma_notify_dt");
    String str2 = (String)paramHashMap.get("activation_overlay_url");
    Object localObject1 = (String)paramHashMap.get("check_packages");
    boolean bool1 = "1".equals(paramHashMap.get("drt_include"));
    String str3 = (String)paramHashMap.get("request_scenario");
    boolean bool2 = "1".equals(paramHashMap.get("use_webview_loadurl"));
    if (f.d.d.e.equals(str3)) {
      paramHashMap = f.d.d;
    }
    for (;;)
    {
      d.c("Received ad url: <url: \"" + str1 + "\" type: \"" + paramWebView + "\" afmaNotifyDt: \"" + (String)localObject2 + "\" activationOverlayUrl: \"" + str2 + "\" useWebViewLoadUrl: \"" + bool2 + "\">");
      paramWebView = str1;
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label386;
      }
      paramWebView = str1;
      if (TextUtils.isEmpty(str1)) {
        break label386;
      }
      paramWebView = new BigInteger(new byte[1]);
      localObject2 = ((String)localObject1).split(",");
      int i = 0;
      while (i < localObject2.length)
      {
        localObject1 = paramWebView;
        if (a.a((Context)paramg.i().c.a(), localObject2[i])) {
          localObject1 = paramWebView.setBit(i);
        }
        i += 1;
        paramWebView = (WebView)localObject1;
      }
      if (f.d.c.e.equals(str3)) {
        paramHashMap = f.d.c;
      } else if (f.d.a.e.equals(str3)) {
        paramHashMap = f.d.a;
      } else {
        paramHashMap = f.d.b;
      }
    }
    localObject1 = String.format(Locale.US, "%X", new Object[] { paramWebView });
    paramWebView = str1.replaceAll("%40installed_markets%40", (String)localObject1);
    ao.a().a.a(localObject1);
    d.c("Ad url modified to " + paramWebView);
    label386:
    paramg = paramg.k();
    if (paramg != null)
    {
      paramg.d(bool1);
      paramg.a(paramHashMap);
      paramg.e(bool2);
      paramg.e(str2);
      paramg.d(paramWebView);
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ay
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */