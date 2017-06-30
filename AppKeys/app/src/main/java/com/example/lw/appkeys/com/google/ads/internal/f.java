package com.example.lw.appkeys.com.google.ads.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.m;
import com.google.ads.util.AdUtil;
import com.google.ads.util.b;
import com.google.ads.util.i.b;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public final class f
  implements Runnable
{
  private final c a;
  private final d b;
  private final a c;
  private volatile boolean d;
  private boolean e;
  private String f;
  private Thread g = null;
  
  f(c paramc, d paramd)
  {
    this(paramc, paramd, new a()
    {
      public HttpURLConnection a(URL paramAnonymousURL)
        throws IOException
      {
        return (HttpURLConnection)paramAnonymousURL.openConnection();
      }
    });
  }
  
  f(c paramc, d paramd, a parama)
  {
    this.a = paramc;
    this.b = paramd;
    this.c = parama;
  }
  
  private void a(Context paramContext, HttpURLConnection paramHttpURLConnection)
  {
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext).getString("drt", "");
    if ((this.e) && (!TextUtils.isEmpty(paramContext)))
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
    e(paramHttpURLConnection);
    i(paramHttpURLConnection);
    j(paramHttpURLConnection);
    k(paramHttpURLConnection);
    d(paramHttpURLConnection);
    c(paramHttpURLConnection);
    l(paramHttpURLConnection);
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
        this.a.a(AdRequest.ErrorCode.INTERNAL_ERROR);
        a();
        return;
      }
      a(paramHttpURLConnection);
      this.f = str;
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
        this.a.a(AdRequest.ErrorCode.NO_FILL);
        a();
        return;
      }
      this.a.a(paramHttpURLConnection, this.f);
      a();
      return;
    }
    if (paramInt == 400)
    {
      b.c("Bad request");
      this.a.a(AdRequest.ErrorCode.INVALID_REQUEST);
      a();
      return;
    }
    b.c("Invalid response code: " + paramInt);
    this.a.a(AdRequest.ErrorCode.INTERNAL_ERROR);
    a();
  }
  
  private void b()
    throws MalformedURLException, IOException
  {
    while (!this.d)
    {
      Object localObject1 = new URL(this.f);
      localObject1 = this.c.a((URL)localObject1);
      try
      {
        a((Context)this.b.h().d.a(), (HttpURLConnection)localObject1);
        AdUtil.a((HttpURLConnection)localObject1, (Context)this.b.h().d.a());
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
      this.a.e(paramHttpURLConnection);
    }
  }
  
  private void c(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Content-Type");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      this.a.b(paramHttpURLConnection);
    }
  }
  
  private void d(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Mediation");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      this.a.a(Boolean.valueOf(paramHttpURLConnection).booleanValue());
    }
  }
  
  private void e(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {}
    try
    {
      float f1 = Float.parseFloat(paramHttpURLConnection);
      this.b.a((f1 * 1000.0F));
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
        this.b.b(str);
        i += 1;
      }
    }
  }
  
  private void g(HttpURLConnection paramHttpURLConnection)
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
        this.a.a(str);
        i += 1;
      }
    }
  }
  
  private void h(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {}
    do
    {
      try
      {
        float f1 = Float.parseFloat(paramHttpURLConnection);
        if (f1 > 0.0F)
        {
          this.b.a(f1);
          if (!this.b.s()) {
            this.b.f();
          }
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        b.d("Could not get refresh value: " + paramHttpURLConnection, localNumberFormatException);
        return;
      }
    } while (!this.b.s());
    this.b.e();
  }
  
  private void i(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Orientation");
    if (!TextUtils.isEmpty(paramHttpURLConnection))
    {
      if (!paramHttpURLConnection.equals("portrait")) {
        break label36;
      }
      this.a.a(AdUtil.b());
    }
    label36:
    while (!paramHttpURLConnection.equals("landscape")) {
      return;
    }
    this.a.a(AdUtil.a());
  }
  
  private void j(HttpURLConnection paramHttpURLConnection)
  {
    if (!TextUtils.isEmpty(paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {}
    try
    {
      long l = Long.parseLong(paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"));
      this.b.b(l);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      b.e("Got bad value of Doritos cookie cache life from header: " + paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
    }
  }
  
  private void k(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Cache-Control");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      this.a.c(paramHttpURLConnection);
    }
  }
  
  private void l(HttpURLConnection paramHttpURLConnection)
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
        this.a.a(new AdSize(i, j));
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        b.e("Could not parse size header: " + paramHttpURLConnection);
      }
    }
  }
  
  void a()
  {
    this.d = true;
  }
  
  void a(String paramString)
  {
    try
    {
      if (this.g == null)
      {
        this.f = paramString;
        this.d = false;
        this.g = new Thread(this);
        this.g.start();
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
    this.e = paramBoolean;
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
      this.a.a(AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    catch (IOException localIOException)
    {
      b.d("IOException connecting to ad url.", localIOException);
      this.a.a(AdRequest.ErrorCode.NETWORK_ERROR);
      return;
    }
    catch (Throwable localThrowable)
    {
      b.b("An unknown error occurred in AdResponseLoader.", localThrowable);
      this.a.a(AdRequest.ErrorCode.INTERNAL_ERROR);
    }
  }
  
  public static abstract interface a
  {
    public abstract HttpURLConnection a(URL paramURL)
      throws IOException;
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.internal.f
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */