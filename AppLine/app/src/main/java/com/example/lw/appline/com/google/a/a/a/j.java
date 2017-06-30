package com.example.lw.appline.com.google.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class j
{
  private static j a;
  private boolean b = false;
  private String c;
  private String d;
  private String e;
  private int f = 1800;
  private boolean g;
  private Double h;
  private boolean i;
  private boolean j;
  private Thread.UncaughtExceptionHandler k;
  private boolean l = false;
  private int m = 0;
  private long n;
  private long o;
  private Context p;
  private final Map<String, String> q = new HashMap();
  private ag r = null;
  private z s;
  private s t;
  private ac u;
  private h v = new h()
  {
    public long a()
    {
      return System.currentTimeMillis();
    }
  };
  private Timer w;
  private TimerTask x;
  private boolean y = false;
  
  public static j a()
  {
    if (a == null) {
      a = new j();
    }
    return a;
  }
  
  private String c(Activity paramActivity)
  {
    String str1 = paramActivity.getClass().getCanonicalName();
    if (this.q.containsKey(str1)) {
      return (String)this.q.get(str1);
    }
    String str2 = this.s.a(str1);
    paramActivity = str2;
    if (str2 == null) {
      paramActivity = str1;
    }
    this.q.put(str1, paramActivity);
    return paramActivity;
  }
  
  private void c()
  {
    boolean bool2 = true;
    this.c = this.s.a("ga_trackingId");
    if (TextUtils.isEmpty(this.c))
    {
      this.c = this.s.a("ga_api_key");
      if (TextUtils.isEmpty(this.c))
      {
        w.c("EasyTracker requested, but missing required ga_trackingId");
        this.r = new a();
        return;
      }
    }
    this.b = true;
    this.d = this.s.a("ga_appName");
    this.e = this.s.a("ga_appVersion");
    this.g = this.s.c("ga_debug");
    this.h = this.s.b("ga_sampleFrequency");
    if (this.h == null) {
      this.h = new Double(this.s.a("ga_sampleRate", 100));
    }
    this.f = this.s.a("ga_dispatchPeriod", 1800);
    this.n = (this.s.a("ga_sessionTimeout", 30) * 1000);
    boolean bool1 = bool2;
    if (!this.s.c("ga_autoActivityTracking")) {
      if (!this.s.c("ga_auto_activity_tracking")) {
        break label449;
      }
    }
    label449:
    for (bool1 = bool2;; bool1 = false)
    {
      this.l = bool1;
      this.i = this.s.c("ga_anonymizeIp");
      this.j = this.s.c("ga_reportUncaughtExceptions");
      this.r = this.t.a(this.c);
      if (!TextUtils.isEmpty(this.d))
      {
        w.d("setting appName to " + this.d);
        this.r.a(this.d);
      }
      if (this.e != null) {
        this.r.b(this.e);
      }
      this.r.b(this.i);
      this.r.a(this.h.doubleValue());
      this.t.a(this.g);
      this.u.a(this.f);
      if (!this.j) {
        break;
      }
      Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = this.k;
      Object localObject = localUncaughtExceptionHandler;
      if (localUncaughtExceptionHandler == null) {
        localObject = new l(this.r, this.u, Thread.getDefaultUncaughtExceptionHandler());
      }
      Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject);
      return;
    }
  }
  
  private void d()
  {
    try
    {
      if (this.w != null)
      {
        this.w.cancel();
        this.w = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(Activity paramActivity)
  {
    a(paramActivity);
    if (!this.b) {}
    do
    {
      return;
      d();
      if ((!this.y) && (this.m == 0) && (b()))
      {
        this.r.a(true);
        if (this.l) {}
      }
      this.y = true;
      this.m += 1;
    } while (!this.l);
    this.r.c(c(paramActivity));
  }
  
  public void a(Context paramContext)
  {
    if (paramContext == null)
    {
      w.c("Context cannot be null");
      return;
    }
    o localo = o.a();
    a(paramContext, new aa(paramContext.getApplicationContext()), s.a(paramContext.getApplicationContext()), localo);
  }
  
  void a(Context paramContext, z paramz, s params, ac paramac)
  {
    if (paramContext == null) {
      w.c("Context cannot be null");
    }
    if (this.p == null)
    {
      this.p = paramContext.getApplicationContext();
      this.t = params;
      this.u = paramac;
      this.s = paramz;
      c();
    }
  }
  
  public void b(Activity paramActivity)
  {
    a(paramActivity);
    if (!this.b) {}
    do
    {
      return;
      this.m -= 1;
      this.m = Math.max(0, this.m);
      this.o = this.v.a();
    } while (this.m != 0);
    d();
    this.x = new b(null);
    this.w = new Timer("waitForActivityStart");
    this.w.schedule(this.x, 1000L);
  }
  
  boolean b()
  {
    return (this.n == 0L) || ((this.n > 0L) && (this.v.a() > this.o + this.n));
  }
  
  class a
    extends ag
  {
    private double b = 100.0D;
    private boolean c;
    
    a() {}
    
    public void a(double paramDouble)
    {
      this.b = paramDouble;
    }
    
    public void a(String paramString) {}
    
    public void a(String paramString, boolean paramBoolean) {}
    
    public void a(boolean paramBoolean) {}
    
    public Map<String, String> b(String paramString, boolean paramBoolean)
    {
      return new HashMap();
    }
    
    public void b(String paramString) {}
    
    public void b(boolean paramBoolean)
    {
      this.c = paramBoolean;
    }
    
    public void c(String paramString) {}
  }
  
  private class b
    extends TimerTask
  {
    private b() {}
    
    public void run()
    {
      j.a(j.this, false);
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.j
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */