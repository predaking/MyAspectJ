package com.google.ads.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.l;
import com.google.ads.n;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public final class f
  implements Runnable
{
  private final l a;
  private final a b;
  private volatile boolean c;
  private boolean d;
  private String e;
  private Thread f = null;
  
  f(l paraml)
  {
    this(paraml, new a()
    {
      public HttpURLConnection a(URL paramAnonymousURL)
        throws IOException
      {
        return (HttpURLConnection)paramAnonymousURL.openConnection();
      }
    });
  }
  
  f(l paraml, a parama)
  {
    this.a = paraml;
    this.b = parama;
  }
  
  private void a(Context paramContext, HttpURLConnection paramHttpURLConnection)
  {
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext).getString("drt", "");
    if ((this.d) && (!TextUtils.isEmpty(paramContext)))
    {
      if (AdUtil.a == 8) {
        paramHttpURLConnection.addRequestProperty("X-Afma-drt-Cookie", paramContext);
      }
    }
    else {
      return;
    }
    paramHttpURLConnection.addRequestProperty("Cookie", paramContext);
  }
  
  private void a(HttpURLConnection paramHttpURLConnection)
  {
    b(paramHttpURLConnection);
    f(paramHttpURLConnection);
    g(paramHttpURLConnection);
    h(paramHttpURLConnection);
    i(paramHttpURLConnection);
    e(paramHttpURLConnection);
    j(paramHttpURLConnection);
    k(paramHttpURLConnection);
    l(paramHttpURLConnection);
    d(paramHttpURLConnection);
    c(paramHttpURLConnection);
    m(paramHttpURLConnection);
    n(paramHttpURLConnection);
  }
  
  private void a(HttpURLConnection paramHttpURLConnection, int paramInt)
    throws IOException
  {
    if ((300 <= paramInt) && (paramInt < 400))
    {
      String str = paramHttpURLConnection.getHeaderField("Location");
      if (str == null)
      {
        b.c("Could not get redirect location from a " + paramInt + " redirect.");
        ((c)this.a.b.a()).a(AdRequest.ErrorCode.INTERNAL_ERROR);
        a();
        return;
      }
      a(paramHttpURLConnection);
      this.e = str;
      return;
    }
    if (paramInt == 200)
    {
      a(paramHttpURLConnection);
      paramHttpURLConnection = AdUtil.a(new InputStreamReader(paramHttpURLConnection.getInputStream())).trim();
      b.a("Response content is: " + paramHttpURLConnection);
      if (TextUtils.isEmpty(paramHttpURLConnection))
      {
        b.a("Response message is null or zero length: " + paramHttpURLConnection);
        ((c)this.a.b.a()).a(AdRequest.ErrorCode.NO_FILL);
        a();
        return;
      }
      ((c)this.a.b.a()).a(paramHttpURLConnection, this.e);
      a();
      return;
    }
    if (paramInt == 400)
    {
      b.c("Bad request");
      ((c)this.a.b.a()).a(AdRequest.ErrorCode.INVALID_REQUEST);
      a();
      return;
    }
    b.c("Invalid response code: " + paramInt);
    ((c)this.a.b.a()).a(AdRequest.ErrorCode.INTERNAL_ERROR);
    a();
  }
  
  private void b()
    throws MalformedURLException, IOException
  {
    while (!this.c)
    {
      Object localObject1 = new URL(this.e);
      localObject1 = this.b.a((URL)localObject1);
      try
      {
        a((Context)((n)this.a.a.a()).f.a(), (HttpURLConnection)localObject1);
        AdUtil.a((HttpURLConnection)localObject1, (Context)((n)this.a.a.a()).f.a());
        ((HttpURLConnection)localObject1).setInstanceFollowRedirects(false);
        ((HttpURLConnection)localObject1).connect();
        a((HttpURLConnection)localObject1, ((HttpURLConnection)localObject1).getResponseCode());
        ((HttpURLConnection)localObject1).disconnect();
      }
      finally
      {
        ((HttpURLConnection)localObject1).disconnect();
      }
    }
  }
  
  private void b(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Debug-Dialog");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((c)this.a.b.a()).f(paramHttpURLConnection);
    }
  }
  
  private void c(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Content-Type");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((c)this.a.b.a()).b(paramHttpURLConnection);
    }
  }
  
  private void d(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Mediation");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((c)this.a.b.a()).b(Boolean.valueOf(paramHttpURLConnection).booleanValue());
    }
  }
  
  private void e(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {}
    try
    {
      float f1 = Float.parseFloat(paramHttpURLConnection);
      ((d)((n)this.a.a.a()).b.a()).a((f1 * 1000.0F));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      b.d("Could not get timeout value: " + paramHttpURLConnection, localNumberFormatException);
    }
  }
  
  private void f(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      paramHttpURLConnection = paramHttpURLConnection.trim().split("\\s+");
      int j = paramHttpURLConnection.length;
      int i = 0;
      while (i < j)
      {
        String str = paramHttpURLConnection[i];
        ((d)((n)this.a.a.a()).b.a()).b(str);
        i += 1;
      }
    }
  }
  
  private void g(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      paramHttpURLConnection = paramHttpURLConnection.trim().split("\\s+");
      int j = paramHttpURLConnection.length;
      int i = 0;
      while (i < j)
      {
        String str = paramHttpURLConnection[i];
        ((d)((n)this.a.a.a()).b.a()).c(str);
        i += 1;
      }
    }
  }
  
  private void h(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      paramHttpURLConnection = paramHttpURLConnection.trim().split("\\s+");
      int j = paramHttpURLConnection.length;
      int i = 0;
      while (i < j)
      {
        String str = paramHttpURLConnection[i];
        ((c)this.a.b.a()).a(str);
        i += 1;
      }
    }
  }
  
  private void i(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {}
    do
    {
      try
      {
        float f1 = Float.parseFloat(paramHttpURLConnection);
        paramHttpURLConnection = (d)((n)this.a.a.a()).b.a();
        if (f1 > 0.0F)
        {
          paramHttpURLConnection.a(f1);
          if (!paramHttpURLConnection.t()) {
            paramHttpURLConnection.g();
          }
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        b.d("Could not get refresh value: " + paramHttpURLConnection, localNumberFormatException);
        return;
      }
    } while (!paramHttpURLConnection.t());
    paramHttpURLConnection.f();
  }
  
  private void j(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Orientation");
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      if (!paramHttpURLConnection.equals("portrait")) {
        break label45;
      }
      ((c)this.a.b.a()).a(AdUtil.b());
    }
    label45:
    while (!paramHttpURLConnection.equals("landscape")) {
      return;
    }
    ((c)this.a.b.a()).a(AdUtil.a());
  }
  
  private void k(HttpURLConnection paramHttpURLConnection)
  {
    if (!TextUtils.isEmpty(paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {}
    try
    {
      long l = Long.parseLong(paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"));
      ((d)((n)this.a.a.a()).b.a()).b(l);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      b.e("Got bad value of Doritos cookie cache life from header: " + paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
    }
  }
  
  private void l(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Cache-Control");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((c)this.a.b.a()).c(paramHttpURLConnection);
    }
  }
  
  private void m(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Ad-Size");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      try
      {
        String[] arrayOfString = paramHttpURLConnection.split("x", 2);
        if (arrayOfString.length != 2)
        {
          b.e("Could not parse size header: " + paramHttpURLConnection);
          return;
        }
        int i = Integer.parseInt(arrayOfString[0]);
        int j = Integer.parseInt(arrayOfString[1]);
        ((c)this.a.b.a()).a(new AdSize(i, j));
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        b.e("Could not parse size header: " + paramHttpURLConnection);
      }
    }
  }
  
  private void n(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((c)this.a.b.a()).a(paramHttpURLConnection.equals("1"));
    }
  }
  
  void a()
  {
    this.c = true;
  }
  
  void a(String paramString)
  {
    try
    {
      if (this.f == null)
      {
        this.e = paramString;
        this.c = false;
        this.f = new Thread(this);
        this.f.start();
      }
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void run()
  {
    try
    {
      b();
      return;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      b.b("Received malformed ad url from javascript.", localMalformedURLException);
      ((c)this.a.b.a()).a(AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    catch (IOException localIOException)
    {
      b.b("IOException connecting to ad url.", localIOException);
      ((c)this.a.b.a()).a(AdRequest.ErrorCode.NETWORK_ERROR);
      return;
    }
    catch (Throwable localThrowable)
    {
      b.b("An unknown error occurred in AdResponseLoader.", localThrowable);
      ((c)this.a.b.a()).a(AdRequest.ErrorCode.INTERNAL_ERROR);
    }
  }
  
  public static abstract interface a
  {
    public abstract HttpURLConnection a(URL paramURL)
      throws IOException;
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.internal.f
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */