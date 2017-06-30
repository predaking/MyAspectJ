package com.example.lw.appline.com.google.ads.b;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.aq;
import com.google.ads.ar;
import com.google.ads.as;
import com.google.ads.at;
import com.google.ads.au;
import com.google.ads.av;
import com.google.ads.aw;
import com.google.ads.ax;
import com.google.ads.ay;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bb;
import com.google.ads.e.a;
import com.google.ads.e.h;
import com.google.ads.i;
import com.google.ads.j;
import com.google.ads.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d
{
  public static final h<d> a = new h()
  {
    public d a()
    {
      return d.a();
    }
  };
  public static final Map<String, aq> b = Collections.unmodifiableMap(new HashMap() {});
  public static final Map<String, aq> c = Collections.unmodifiableMap(new HashMap() {});
  public static final Map<String, aq> d = Collections.unmodifiableMap(new HashMap() {});
  private static final d e = new d();
  
  public String a(Uri paramUri, HashMap<String, String> paramHashMap)
  {
    if (c(paramUri))
    {
      String str = paramUri.getHost();
      if (str == null)
      {
        com.google.ads.e.d.e("An error occurred while parsing the AMSG parameters.");
        return null;
      }
      if (str.equals("launch"))
      {
        paramHashMap.put("a", "intent");
        paramHashMap.put("u", paramHashMap.get("url"));
        paramHashMap.remove("url");
        return "/open";
      }
      if (str.equals("closecanvas")) {
        return "/close";
      }
      if (str.equals("log")) {
        return "/log";
      }
      com.google.ads.e.d.e("An error occurred while parsing the AMSG: " + paramUri.toString());
      return null;
    }
    if (b(paramUri)) {
      return paramUri.getPath();
    }
    com.google.ads.e.d.e("Message was neither a GMSG nor an AMSG.");
    return null;
  }
  
  public void a(WebView paramWebView)
  {
    a(paramWebView, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
  }
  
  public void a(WebView paramWebView, String paramString)
  {
    com.google.ads.e.d.a("Sending JS to a WebView: " + paramString);
    paramWebView.loadUrl("javascript:" + paramString);
  }
  
  public void a(WebView paramWebView, String paramString1, String paramString2)
  {
    if (paramString2 != null)
    {
      a(paramWebView, "AFMA_ReceiveMessage" + "('" + paramString1 + "', " + paramString2 + ");");
      return;
    }
    a(paramWebView, "AFMA_ReceiveMessage" + "('" + paramString1 + "');");
  }
  
  public void a(WebView paramWebView, Map<String, Boolean> paramMap)
  {
    a(paramWebView, "openableURLs", new JSONObject(paramMap).toString());
  }
  
  public void a(g paramg, Map<String, aq> paramMap, Uri paramUri, WebView paramWebView)
  {
    HashMap localHashMap = a.b(paramUri);
    if (localHashMap == null)
    {
      com.google.ads.e.d.e("An error occurred while parsing the message parameters.");
      return;
    }
    paramUri = a(paramUri, localHashMap);
    if (paramUri == null)
    {
      com.google.ads.e.d.e("An error occurred while parsing the message.");
      return;
    }
    paramMap = (aq)paramMap.get(paramUri);
    if (paramMap == null)
    {
      com.google.ads.e.d.e("No AdResponse found, <message: " + paramUri + ">");
      return;
    }
    paramMap.a(paramg, localHashMap, paramWebView);
  }
  
  public boolean a(Uri paramUri)
  {
    if ((paramUri == null) || (!paramUri.isHierarchical())) {}
    while ((!b(paramUri)) && (!c(paramUri))) {
      return false;
    }
    return true;
  }
  
  public void b(WebView paramWebView)
  {
    a(paramWebView, "onhide", null);
  }
  
  public boolean b(Uri paramUri)
  {
    String str = paramUri.getScheme();
    if ((str == null) || (!str.equals("gmsg"))) {}
    do
    {
      return false;
      paramUri = paramUri.getAuthority();
    } while ((paramUri == null) || (!paramUri.equals("mobileads.google.com")));
    return true;
  }
  
  public boolean c(Uri paramUri)
  {
    paramUri = paramUri.getScheme();
    return (paramUri != null) && (paramUri.equals("admob"));
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.d
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */