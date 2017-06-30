package com.example.lw.appline.com.google.ads.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.an;
import com.google.ads.ap;
import com.google.ads.c.a;
import com.google.ads.e.a;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public final class i
  implements Runnable
{
  private final an a;
  private final a b;
  private volatile boolean c;
  private boolean d;
  private String e;
  private Thread f = null;
  
  i(an paraman)
  {
    this(paraman, new a()
    {
      public HttpURLConnection a(URL paramAnonymousURL)
        throws IOException
      {
        return (HttpURLConnection)paramAnonymousURL.openConnection();
      }
    });
  }
  
  i(an paraman, a parama)
  {
    this.a = paraman;
    this.b = parama;
  }
  
  private void a(Context paramContext, HttpURLConnection paramHttpURLConnection)
  {
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext).getString("drt", "");
    if ((this.d) && (!TextUtils.isEmpty(paramContext)))
    {
      if (a.a == 8) {
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
        com.google.ads.e.d.c("Could not get redirect location from a " + paramInt + " redirect.");
        ((f)this.a.b.a()).a(c.a.d);
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
      paramHttpURLConnection = a.a(new InputStreamReader(paramHttpURLConnection.getInputStream())).trim();
      com.google.ads.e.d.a("Response content is: " + paramHttpURLConnection);
      if (TextUtils.isEmpty(paramHttpURLConnection))
      {
        com.google.ads.e.d.a("Response message is null or zero length: " + paramHttpURLConnection);
        ((f)this.a.b.a()).a(c.a.b);
        a();
        return;
      }
      ((f)this.a.b.a()).a(paramHttpURLConnection, this.e);
      a();
      return;
    }
    if (paramInt == 400)
    {
      com.google.ads.e.d.c("Bad request");
      ((f)this.a.b.a()).a(c.a.a);
      a();
      return;
    }
    com.google.ads.e.d.c("Invalid response code: " + paramInt);
    ((f)this.a.b.a()).a(c.a.d);
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
        a((Context)((ap)this.a.a.a()).f.a(), (HttpURLConnection)localObject1);
        a.a((HttpURLConnection)localObject1, (Context)((ap)this.a.a.a()).f.a());
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
      ((f)this.a.b.a()).f(paramHttpURLConnection);
    }
  }
  
  private void c(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Content-Type");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((f)this.a.b.a()).b(paramHttpURLConnection);
    }
  }
  
  private void d(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Mediation");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((f)this.a.b.a()).b(Boolean.valueOf(paramHttpURLConnection).booleanValue());
    }
  }
  
  private void e(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {}
    try
    {
      float f1 = Float.parseFloat(paramHttpURLConnection);
      ((g)((ap)this.a.a.a()).b.a()).a((f1 * 1000.0F));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      com.google.ads.e.d.d("Could not get timeout value: " + paramHttpURLConnection, localNumberFormatException);
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
        ((g)((ap)this.a.a.a()).b.a()).b(str);
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
        ((g)((ap)this.a.a.a()).b.a()).c(str);
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
        ((f)this.a.b.a()).a(str);
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
        paramHttpURLConnection = (g)((ap)this.a.a.a()).b.a();
        if (f1 > 0.0F)
        {
          paramHttpURLConnection.a(f1);
          if (!paramHttpURLConnection.s()) {
            paramHttpURLConnection.g();
          }
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        com.google.ads.e.d.d("Could not get refresh value: " + paramHttpURLConnection, localNumberFormatException);
        return;
      }
    } while (!paramHttpURLConnection.s());
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
      ((f)this.a.b.a()).a(a.b());
    }
    label45:
    while (!paramHttpURLConnection.equals("landscape")) {
      return;
    }
    ((f)this.a.b.a()).a(a.a());
  }
  
  private void k(HttpURLConnection paramHttpURLConnection)
  {
    if (!TextUtils.isEmpty(paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"))) {}
    try
    {
      long l = Long.parseLong(paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life"));
      ((g)((ap)this.a.a.a()).b.a()).b(l);
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      com.google.ads.e.d.e("Got bad value of Doritos cookie cache life from header: " + paramHttpURLConnection.getHeaderField("X-Afma-Doritos-Cache-Life") + ". Using default value instead.");
    }
  }
  
  private void l(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("Cache-Control");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((f)this.a.b.a()).c(paramHttpURLConnection);
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
          com.google.ads.e.d.e("Could not parse size header: " + paramHttpURLConnection);
          return;
        }
        int i = Integer.parseInt(arrayOfString[0]);
        int j = Integer.parseInt(arrayOfString[1]);
        ((f)this.a.b.a()).a(new com.google.ads.d(i, j));
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        com.google.ads.e.d.e("Could not parse size header: " + paramHttpURLConnection);
      }
    }
  }
  
  private void n(HttpURLConnection paramHttpURLConnection)
  {
    paramHttpURLConnection = paramHttpURLConnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
    if (!TextUtils.isEmpty(paramHttpURLConnection)) {
      ((f)this.a.b.a()).a(paramHttpURLConnection.equals("1"));
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
      com.google.ads.e.d.b("Received malformed ad url from javascript.", localMalformedURLException);
      ((f)this.a.b.a()).a(c.a.d);
      return;
    }
    catch (IOException localIOException)
    {
      com.google.ads.e.d.b("IOException connecting to ad url.", localIOException);
      ((f)this.a.b.a()).a(c.a.c);
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.ads.e.d.b("An unknown error occurred in AdResponseLoader.", localThrowable);
      ((f)this.a.b.a()).a(c.a.d);
    }
  }
  
  public static abstract interface a
  {
    public abstract HttpURLConnection a(URL paramURL)
      throws IOException;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.i
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */