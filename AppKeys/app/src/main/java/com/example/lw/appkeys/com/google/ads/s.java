package com.example.lw.appkeys.com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.a;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import com.google.ads.util.f;
import java.util.HashMap;

public class s
  implements n
{
  private static final a a = (a)a.a.b();
  
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramd = (String)paramHashMap.get("js");
    if (paramd == null)
    {
      b.b("Could not get the JS to evaluate.");
      return;
    }
    if ((paramWebView instanceof AdWebView))
    {
      paramHashMap = ((AdWebView)paramWebView).d();
      if (paramHashMap == null) {
        b.b("Could not get the AdActivity from the AdWebView.");
      }
    }
    else
    {
      b.b("Trying to evaluate JS in a WebView that isn't an AdWebView");
      return;
    }
    paramHashMap = paramHashMap.getOpeningAdWebView();
    if (paramHashMap == null)
    {
      b.b("Could not get the opening WebView.");
      return;
    }
    a.a(paramHashMap, paramd);
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.s
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */