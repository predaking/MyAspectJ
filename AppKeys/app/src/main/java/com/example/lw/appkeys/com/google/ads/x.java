package com.example.lw.appkeys.com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class x
  implements n
{
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramd = (String)paramHashMap.get("string");
    paramHashMap = (String)paramHashMap.get("afma_notify_dt");
    b.c("Received log message: <\"string\": \"" + paramd + "\", \"afmaNotifyDt\": \"" + paramHashMap + "\">");
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.x
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */