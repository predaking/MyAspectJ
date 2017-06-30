package com.example.lw.appkeys.com.google.ads;

import android.content.Context;
import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class t
  implements n
{
  protected Runnable a(String paramString, WebView paramWebView)
  {
    return new ab(paramString, paramWebView.getContext().getApplicationContext());
  }
  
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramd = (String)paramHashMap.get("u");
    if (paramd == null)
    {
      b.e("Could not get URL from click gmsg.");
      return;
    }
    new Thread(a(paramd, paramWebView)).start();
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.t
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */