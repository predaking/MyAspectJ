package com.example.lw.appkeys.com.google.ads;

import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.internal.e;
import com.google.ads.util.b;
import java.util.HashMap;

public class y
  implements n
{
  private AdActivity.StaticMethodWrapper a;
  
  public y()
  {
    this(new AdActivity.StaticMethodWrapper());
  }
  
  public y(AdActivity.StaticMethodWrapper paramStaticMethodWrapper)
  {
    this.a = paramStaticMethodWrapper;
  }
  
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramWebView = (String)paramHashMap.get("a");
    if (paramWebView == null)
    {
      b.a("Could not get the action parameter for open GMSG.");
      return;
    }
    if (paramWebView.equals("webapp"))
    {
      this.a.launchAdActivity(paramd, new e("webapp", paramHashMap));
      return;
    }
    if (paramWebView.equals("expand"))
    {
      this.a.launchAdActivity(paramd, new e("expand", paramHashMap));
      return;
    }
    this.a.launchAdActivity(paramd, new e("intent", paramHashMap));
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.y
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */