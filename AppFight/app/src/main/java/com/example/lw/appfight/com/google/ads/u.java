package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.util.b;
import com.google.ads.util.i.b;
import java.util.HashMap;

public class u
  implements o
{
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramHashMap = (String)paramHashMap.get("u");
    if (TextUtils.isEmpty(paramHashMap))
    {
      b.e("Could not get URL from track gmsg.");
      return;
    }
    new Thread(new ae(paramHashMap, (Context)paramd.i().f.a())).start();
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.u
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */