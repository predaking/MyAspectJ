package com.example.lw.appkeys.com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.c;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class u
  implements n
{
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramWebView = (String)paramHashMap.get("type");
    paramHashMap = (String)paramHashMap.get("errors");
    b.e("Invalid " + paramWebView + " request error: " + paramHashMap);
    paramd = paramd.j();
    if (paramd != null) {
      paramd.a(AdRequest.ErrorCode.INVALID_REQUEST);
    }
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.u
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */