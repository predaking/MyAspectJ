package com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import java.util.HashMap;

public class p
  implements o
{
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramWebView = (String)paramHashMap.get("name");
    if (paramWebView == null)
    {
      b.b("Error: App event with no name parameter.");
      return;
    }
    paramd.a(paramWebView, (String)paramHashMap.get("info"));
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.p
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */