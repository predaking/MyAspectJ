package com.example.lw.appkeys.com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.c;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class v
  implements n
{
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramWebView = (String)paramHashMap.get("url");
    String str1 = (String)paramHashMap.get("type");
    String str2 = (String)paramHashMap.get("afma_notify_dt");
    boolean bool = "1".equals(paramHashMap.get("drt_include"));
    b.c("Received ad url: <url: \"" + paramWebView + "\" type: \"" + str1 + "\" afmaNotifyDt: \"" + str2 + "\">");
    paramd = paramd.j();
    if (paramd != null)
    {
      paramd.c(bool);
      paramd.d(paramWebView);
    }
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.v
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */