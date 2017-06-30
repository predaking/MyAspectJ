package com.example.lw.appline.com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.google.ads.b.g;
import com.google.ads.b.j;
import com.google.ads.b.k;
import com.google.ads.e.d;
import com.google.ads.e.k.b;
import com.google.ads.e.k.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ag
{
  private final g a;
  private aj b = null;
  private final Object c = new Object();
  private Thread d = null;
  private final Object e = new Object();
  private boolean f = false;
  private final Object g = new Object();
  
  protected ag()
  {
    this.a = null;
  }
  
  public ag(g paramg)
  {
    com.google.ads.e.c.a(paramg);
    this.a = paramg;
  }
  
  public static boolean a(ae paramae, g paramg)
  {
    if (paramae.j() == null) {
      return true;
    }
    if (paramg.i().b())
    {
      if (!paramae.j().a())
      {
        d.e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
        return false;
      }
      return true;
    }
    paramg = ((k)paramg.i().g.a()).c();
    if (paramae.j().a())
    {
      d.e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + paramg + ") in the ad-type field in the mediation UI.");
      return false;
    }
    paramae = paramae.j().c();
    if (paramae != paramg)
    {
      d.e("Mediation server returned ad size: '" + paramae + "', while the AdView was created with ad size: '" + paramg + "'. Using the ad-size passed to the AdView on creation.");
      return false;
    }
    return true;
  }
  
  private boolean a(final String paramString, Activity paramActivity, c arg3, final ah paramah, HashMap<String, String> paramHashMap, long paramLong)
  {
    synchronized (new aj(this, (k)this.a.i().g.a(), paramah, paramString, ???, paramHashMap))
    {
      ???.a(paramActivity);
      try
      {
        while ((!???.b()) && (paramLong > 0L))
        {
          long l1 = SystemClock.elapsedRealtime();
          ???.wait(paramLong);
          long l2 = SystemClock.elapsedRealtime();
          paramLong -= l2 - l1;
        }
        paramString = finally;
      }
      catch (InterruptedException paramActivity)
      {
        d.a("Interrupted while waiting for ad network to load ad using adapter class: " + paramString);
        this.a.n().a(???.d());
        if ((???.b()) && (???.c()))
        {
          if (this.a.i().b()) {}
          for (paramString = null;; paramString = ???.e())
          {
            ((Handler)ao.a().c.a()).post(new Runnable()
            {
              public void run()
              {
                if (ag.a(ag.this, paramc))
                {
                  d.a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
                  return;
                }
                ag.b(ag.this).a(paramString, paramc, paramah, false);
              }
            }());
            return true;
          }
        }
        if (!???.b()) {
          d.a("Timeout occurred in adapter class: " + ???.f());
        }
        ???.a();
        return false;
      }
    }
  }
  
  private void b(final ae paramae, c paramc)
  {
    label243:
    do
    {
      long l;
      Object localObject3;
      HashMap localHashMap;
      String str1;
      do
      {
        for (;;)
        {
          synchronized (this.e)
          {
            com.google.ads.e.c.a(Thread.currentThread(), this.d);
            ??? = paramae.f();
            if (paramae.a())
            {
              l = paramae.b();
              Iterator localIterator = ((List)???).iterator();
              if (!localIterator.hasNext()) {
                break label293;
              }
              localObject3 = (h)localIterator.next();
              d.a("Looking to fetch ads from network: " + ((h)localObject3).b());
              Object localObject2 = ((h)localObject3).c();
              localHashMap = ((h)localObject3).e();
              ??? = ((h)localObject3).d();
              str1 = ((h)localObject3).a();
              localObject3 = ((h)localObject3).b();
              String str2 = paramae.c();
              if (??? == null) {
                break label243;
              }
              ??? = new ah(str1, (String)localObject3, str2, (List)???, paramae.h(), paramae.i());
              localObject2 = ((List)localObject2).iterator();
              if (!((Iterator)localObject2).hasNext()) {
                continue;
              }
              str1 = (String)((Iterator)localObject2).next();
              localObject3 = (Activity)this.a.i().c.a();
              if (localObject3 != null) {
                break;
              }
              d.a("Activity is null while mediating.  Terminating mediation thread.");
              return;
            }
          }
          l = 10000L;
          continue;
          ??? = paramae.g();
        }
        this.a.n().c();
      } while (a(str1, (Activity)localObject3, paramc, (ah)???, localHashMap, l));
    } while (!c());
    d.a("GWController.destroy() called. Terminating mediation thread.");
    return;
    label293:
    ((Handler)ao.a().c.a()).post(new Runnable()
    {
      public void run()
      {
        ag.b(ag.this).b(paramae);
      }
    }());
  }
  
  private boolean b(aj paramaj)
  {
    synchronized (this.g)
    {
      if (c())
      {
        paramaj.a();
        return true;
      }
      return false;
    }
  }
  
  private boolean c()
  {
    synchronized (this.g)
    {
      boolean bool = this.f;
      return bool;
    }
  }
  
  public void a(final ae paramae, final c paramc)
  {
    for (;;)
    {
      synchronized (this.e)
      {
        if (a())
        {
          d.c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
          return;
        }
        if (paramae.d())
        {
          this.a.a(paramae.e());
          if (!this.a.s()) {
            this.a.g();
          }
          a(paramae, this.a);
          this.d = (new Runnable()
          {
            public void run()
            {
              ag.a(ag.this, paramae, paramc);
              synchronized (ag.a(ag.this))
              {
                ag.a(ag.this, null);
                return;
              }
            }
          });
          this.d.start();
          return;
        }
      }
      if (this.a.s()) {
        this.a.f();
      }
    }
  }
  
  public void a(aj paramaj)
  {
    synchronized (this.c)
    {
      if (this.b != paramaj)
      {
        if (this.b != null) {
          this.b.a();
        }
        this.b = paramaj;
      }
      return;
    }
  }
  
  public boolean a()
  {
    for (;;)
    {
      synchronized (this.e)
      {
        if (this.d != null)
        {
          bool = true;
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public void b()
  {
    synchronized (this.g)
    {
      this.f = true;
      a(null);
      synchronized (this.e)
      {
        if (this.d != null) {
          this.d.interrupt();
        }
        return;
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ag
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */