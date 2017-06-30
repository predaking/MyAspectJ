package com.example.lw.appline.com.google.ads.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.ap;
import com.google.ads.aq;
import com.google.ads.c.a;
import com.google.ads.e.a;
import com.google.ads.e.i.b;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import com.google.ads.s;
import com.google.ads.t;
import java.util.HashMap;
import java.util.Map;

public class l
  extends WebViewClient
{
  private static final d c = (d)d.a.b();
  protected g a;
  protected boolean b;
  private final Map<String, aq> d;
  private final boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  
  public l(g paramg, Map<String, aq> paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.a = paramg;
    this.d = paramMap;
    this.e = paramBoolean1;
    this.g = paramBoolean2;
    this.b = false;
    this.h = false;
    this.i = false;
  }
  
  public static l a(g paramg, Map<String, aq> paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (a.a >= 11) {
      return new i.b(paramg, paramMap, paramBoolean1, paramBoolean2);
    }
    return new l(paramg, paramMap, paramBoolean1, paramBoolean2);
  }
  
  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public boolean a()
  {
    return this.f;
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void d(boolean paramBoolean)
  {
    this.i = paramBoolean;
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    this.f = false;
    if (this.h)
    {
      paramString = this.a.k();
      if (paramString == null) {
        break label53;
      }
      paramString.c();
    }
    for (;;)
    {
      this.h = false;
      if (this.i)
      {
        c.a(paramWebView);
        this.i = false;
      }
      return;
      label53:
      com.google.ads.e.d.a("adLoader was null while trying to setFinishedLoadingHtml().");
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    this.f = true;
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    this.f = false;
    paramWebView = this.a.k();
    if (paramWebView != null) {
      paramWebView.a(c.a.c);
    }
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    try
    {
      com.google.ads.e.d.a("shouldOverrideUrlLoading(\"" + paramString + "\")");
      localUri = Uri.parse(paramString);
      if (c.a(localUri))
      {
        c.a(this.a, this.d, localUri, paramWebView);
        return true;
      }
      if (this.g)
      {
        if (a.a(localUri)) {
          return super.shouldOverrideUrlLoading(paramWebView, paramString);
        }
        paramWebView = new HashMap();
        paramWebView.put("u", paramString);
        AdActivity.a(this.a, new h("intent", paramWebView));
        return true;
      }
      boolean bool = this.e;
      if (bool)
      {
        try
        {
          Object localObject = this.a.i();
          paramWebView = (Context)((ap)localObject).f.a();
          localObject = (s)((ap)localObject).s.a();
          if ((localObject == null) || (!((s)localObject).a(localUri))) {
            break label285;
          }
          paramWebView = ((s)localObject).a(localUri, paramWebView);
          paramString = new HashMap();
          paramString.put("u", paramWebView.toString());
          AdActivity.a(this.a, new h("intent", paramString));
          return true;
        }
        catch (t paramWebView)
        {
          com.google.ads.e.d.e("Unable to append parameter to URL: " + paramString);
        }
      }
      else
      {
        com.google.ads.e.d.e("URL is not a GMSG and can't handle URL: " + paramString);
        return true;
      }
    }
    catch (Throwable paramWebView)
    {
      for (;;)
      {
        Uri localUri;
        com.google.ads.e.d.d("An unknown error occurred in shouldOverrideUrlLoading.", paramWebView);
        continue;
        label285:
        paramWebView = localUri;
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.l
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */