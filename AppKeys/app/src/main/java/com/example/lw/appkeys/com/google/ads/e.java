package com.example.lw.appkeys.com.google.ads;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.google.ads.internal.d;
import com.google.ads.internal.g;
import com.google.ads.util.b;
import com.google.ads.util.i.b;
import com.google.ads.util.i.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class e
{
  private final d a;
  private h b = null;
  private Object c = new Object();
  private Thread d = null;
  private Object e = new Object();
  private boolean f = false;
  private Object g = new Object();
  
  protected e()
  {
    this.a = null;
  }
  
  public e(d paramd)
  {
    com.google.ads.util.a.b(paramd);
    this.a = paramd;
  }
  
  public static boolean a(c paramc, d paramd)
  {
    if (paramc.j() == null) {
      return true;
    }
    if (paramd.h().b())
    {
      if (!paramc.j().a())
      {
        b.e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
        return false;
      }
      return true;
    }
    paramd = ((com.google.ads.internal.h)paramd.h().i.a()).b();
    if (paramc.j().a())
    {
      b.e("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (" + paramd + ") in the ad-type field in the mediation UI.");
      return false;
    }
    paramc = paramc.j().b();
    if (paramc != paramd)
    {
      b.e("Mediation server returned ad size: '" + paramc + "', while the AdView was created with ad size: '" + paramd + "'. Using the ad-size passed to the AdView on creation.");
      return false;
    }
    return true;
  }
  
  private boolean a(h paramh, String paramString)
  {
    if (e() != paramh)
    {
      b.c("GWController: ignoring callback to " + paramString + " from non showing ambassador with adapter class: '" + paramh.h() + "'.");
      return false;
    }
    return true;
  }
  
  private boolean a(final String paramString, Activity paramActivity, AdRequest arg3, final f paramf, HashMap<String, String> paramHashMap, long paramLong)
  {
    synchronized (new h(this, (com.google.ads.internal.h)this.a.h().i.a(), paramf, paramString, ???, paramHashMap))
    {
      ???.a(paramActivity);
      try
      {
        while ((!???.c()) && (paramLong > 0L))
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
        b.a("Interrupted while waiting for ad network to load ad using adapter class: " + paramString);
        this.a.m().a(???.e());
        if ((???.c()) && (???.d()))
        {
          if (this.a.h().b()) {}
          for (paramString = null;; paramString = ???.f())
          {
            this.a.a(new Runnable()
            {
              public void run()
              {
                if (e.a(e.this, paramAdRequest))
                {
                  b.a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
                  return;
                }
                e.b(e.this).a(paramString, paramAdRequest, paramf, false);
              }
            });
            return true;
          }
        }
        ???.b();
        return false;
      }
    }
  }
  
  private void b(final c paramc, AdRequest paramAdRequest)
  {
    do
    {
      long l;
      Object localObject2;
      HashMap localHashMap;
      String str;
      Activity localActivity;
      do
      {
        for (;;)
        {
          synchronized (this.e)
          {
            com.google.ads.util.a.a(Thread.currentThread(), this.d);
            ??? = paramc.f();
            if (paramc.a())
            {
              l = paramc.b();
              ??? = ((List)???).iterator();
              if (!((Iterator)???).hasNext()) {
                break label262;
              }
              localObject2 = (a)((Iterator)???).next();
              b.a("Looking to fetch ads from network: " + ((a)localObject2).b());
              Object localObject3 = ((a)localObject2).c();
              localHashMap = ((a)localObject2).d();
              localObject2 = new f(((a)localObject2).a(), ((a)localObject2).b(), paramc.c(), paramc.g(), paramc.h(), paramc.i());
              localObject3 = ((List)localObject3).iterator();
              if (!((Iterator)localObject3).hasNext()) {
                continue;
              }
              str = (String)((Iterator)localObject3).next();
              localActivity = (Activity)this.a.h().c.a();
              if (localActivity != null) {
                break;
              }
              b.a("Activity is null while mediating.  Terminating mediation thread.");
              return;
            }
          }
          l = 10000L;
        }
        this.a.m().c();
      } while (a(str, localActivity, paramAdRequest, (f)localObject2, localHashMap, l));
    } while (!d());
    b.a("GWController.destroy() called. Terminating mediation thread.");
    return;
    label262:
    this.a.a(new Runnable()
    {
      public void run()
      {
        e.b(e.this).b(paramc);
      }
    });
  }
  
  private boolean d()
  {
    synchronized (this.g)
    {
      boolean bool = this.f;
      return bool;
    }
  }
  
  private h e()
  {
    synchronized (this.c)
    {
      h localh = this.b;
      return localh;
    }
  }
  
  private boolean e(h paramh)
  {
    synchronized (this.g)
    {
      if (d())
      {
        paramh.b();
        return true;
      }
      return false;
    }
  }
  
  public void a(final c paramc, final AdRequest paramAdRequest)
  {
    synchronized (this.e)
    {
      if (a())
      {
        b.c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
        return;
      }
      a(paramc, this.a);
      this.d = (new Runnable()
      {
        public void run()
        {
          e.a(e.this, paramc, paramAdRequest);
          synchronized (e.a(e.this))
          {
            e.a(e.this, null);
            return;
          }
        }
      });
      this.d.start();
      return;
    }
  }
  
  public void a(h paramh)
  {
    if (!a(paramh, "onPresentScreen")) {
      return;
    }
    this.a.a(new Runnable()
    {
      public void run()
      {
        e.b(e.this).u();
      }
    });
  }
  
  public void a(final h paramh, final View paramView)
  {
    if (e() != paramh)
    {
      b.c("GWController: ignoring onAdRefreshed() callback from non-showing ambassador (adapter class name is '" + paramh.h() + "').");
      return;
    }
    this.a.m().a(g.a.a);
    paramh = this.b.a();
    this.a.a(new Runnable()
    {
      public void run()
      {
        e.b(e.this).a(paramView, e.c(e.this), paramh, true);
      }
    });
  }
  
  public void a(final h paramh, final boolean paramBoolean)
  {
    if (!a(paramh, "onAdClicked()")) {
      return;
    }
    paramh = paramh.a();
    this.a.a(new Runnable()
    {
      public void run()
      {
        e.b(e.this).a(paramh, paramBoolean);
      }
    });
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
      d(null);
      synchronized (this.e)
      {
        if (this.d != null) {
          this.d.interrupt();
        }
        return;
      }
    }
  }
  
  public void b(h paramh)
  {
    if (!a(paramh, "onDismissScreen")) {
      return;
    }
    this.a.a(new Runnable()
    {
      public void run()
      {
        e.b(e.this).t();
      }
    });
  }
  
  public void c(h paramh)
  {
    if (!a(paramh, "onLeaveApplication")) {
      return;
    }
    this.a.a(new Runnable()
    {
      public void run()
      {
        e.b(e.this).v();
      }
    });
  }
  
  public boolean c()
  {
    com.google.ads.util.a.a(this.a.h().b());
    h localh = e();
    if (localh != null)
    {
      localh.g();
      return true;
    }
    b.b("There is no ad ready to show.");
    return false;
  }
  
  public void d(h paramh)
  {
    synchronized (this.c)
    {
      if (this.b != paramh)
      {
        if (this.b != null) {
          this.b.b();
        }
        this.b = paramh;
      }
      return;
    }
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.e
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */