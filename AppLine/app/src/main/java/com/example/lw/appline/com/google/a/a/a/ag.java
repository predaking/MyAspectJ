package com.example.lw.appline.com.google.a.a.a;

import android.text.TextUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ag
{
  private static final DecimalFormat a = new DecimalFormat("0.######", new DecimalFormatSymbols(Locale.US));
  private final ah b;
  private final a c;
  private volatile boolean d = false;
  private volatile boolean e = false;
  private long f = 120000L;
  private long g;
  private boolean h = true;
  
  ag()
  {
    this.b = null;
    this.c = null;
  }
  
  ag(String paramString, ah paramah)
  {
    if (paramString == null) {
      throw new IllegalArgumentException("trackingId cannot be null");
    }
    this.b = paramah;
    this.c = new a(null);
    this.c.b("trackingId", paramString);
    this.c.b("sampleRate", "100");
    this.c.a("sessionControl", "start");
    this.c.b("useSecure", Boolean.toString(true));
  }
  
  private void a(String paramString, Map<String, String> paramMap)
  {
    this.e = true;
    Object localObject = paramMap;
    if (paramMap == null) {
      localObject = new HashMap();
    }
    ((Map)localObject).put("hitType", paramString);
    this.c.a((Map)localObject, Boolean.valueOf(true));
    if (!a()) {
      w.i("Too many hits sent too quickly, throttling invoked.");
    }
    for (;;)
    {
      this.c.a();
      return;
      this.b.a(this.c.b());
    }
  }
  
  private void b()
  {
    if (this.d) {
      throw new IllegalStateException("Tracker closed");
    }
  }
  
  public void a(double paramDouble)
  {
    r.a().a(r.a.w);
    this.c.b("sampleRate", Double.toString(paramDouble));
  }
  
  public void a(String paramString)
  {
    if (this.e)
    {
      w.i("Tracking already started, setAppName call ignored");
      return;
    }
    if (TextUtils.isEmpty(paramString))
    {
      w.i("setting appName to empty value not allowed, call ignored");
      return;
    }
    r.a().a(r.a.o);
    this.c.b("appName", paramString);
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    b();
    r.a().a(r.a.e);
    r.a().a(true);
    a("exception", b(paramString, paramBoolean));
    r.a().a(false);
  }
  
  public void a(boolean paramBoolean)
  {
    b();
    r.a().a(r.a.m);
    a locala = this.c;
    if (paramBoolean) {}
    for (String str = "start";; str = null)
    {
      locala.a("sessionControl", str);
      return;
    }
  }
  
  boolean a()
  {
    boolean bool1 = true;
    for (;;)
    {
      try
      {
        boolean bool2 = this.h;
        if (!bool2) {
          return bool1;
        }
        long l1 = System.currentTimeMillis();
        if (this.f < 120000L)
        {
          long l2 = l1 - this.g;
          if (l2 > 0L) {
            this.f = Math.min(120000L, l2 + this.f);
          }
        }
        this.g = l1;
        if (this.f >= 2000L)
        {
          this.f -= 2000L;
          continue;
        }
        w.i("Excessive tracking detected.  Tracking call ignored.");
      }
      finally {}
      bool1 = false;
    }
  }
  
  public Map<String, String> b(String paramString, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("exDescription", paramString);
    localHashMap.put("exFatal", Boolean.toString(paramBoolean));
    r.a().a(r.a.H);
    return localHashMap;
  }
  
  public void b(String paramString)
  {
    if (this.e)
    {
      w.i("Tracking already started, setAppVersion call ignored");
      return;
    }
    r.a().a(r.a.q);
    this.c.b("appVersion", paramString);
  }
  
  public void b(boolean paramBoolean)
  {
    r.a().a(r.a.u);
    this.c.b("anonymizeIp", Boolean.toString(paramBoolean));
  }
  
  public void c(String paramString)
  {
    b();
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalStateException("trackView requires a appScreen to be set");
    }
    r.a().a(r.a.b);
    this.c.b("description", paramString);
    a("appview", null);
  }
  
  private static class a
  {
    private Map<String, String> a = new HashMap();
    private Map<String, String> b = new HashMap();
    
    public void a()
    {
      try
      {
        this.a.clear();
        return;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
    
    public void a(String paramString1, String paramString2)
    {
      try
      {
        this.a.put(paramString1, paramString2);
        return;
      }
      finally
      {
        paramString1 = finally;
        throw paramString1;
      }
    }
    
    /* Error */
    public void a(Map<String, String> paramMap, Boolean paramBoolean)
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_2
      //   3: invokevirtual 41	java/lang/Boolean:booleanValue	()Z
      //   6: ifeq +16 -> 22
      //   9: aload_0
      //   10: getfield 19	com/google/a/a/a/ag$a:a	Ljava/util/Map;
      //   13: aload_1
      //   14: invokeinterface 45 2 0
      //   19: aload_0
      //   20: monitorexit
      //   21: return
      //   22: aload_0
      //   23: getfield 21	com/google/a/a/a/ag$a:b	Ljava/util/Map;
      //   26: aload_1
      //   27: invokeinterface 45 2 0
      //   32: goto -13 -> 19
      //   35: astore_1
      //   36: aload_0
      //   37: monitorexit
      //   38: aload_1
      //   39: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	40	0	this	a
      //   0	40	1	paramMap	Map<String, String>
      //   0	40	2	paramBoolean	Boolean
      // Exception table:
      //   from	to	target	type
      //   2	19	35	finally
      //   22	32	35	finally
    }
    
    public Map<String, String> b()
    {
      try
      {
        HashMap localHashMap = new HashMap(this.b);
        localHashMap.putAll(this.a);
        return localHashMap;
      }
      finally
      {
        localObject = finally;
        throw localObject;
      }
    }
    
    public void b(String paramString1, String paramString2)
    {
      try
      {
        this.b.put(paramString1, paramString2);
        return;
      }
      finally
      {
        paramString1 = finally;
        throw paramString1;
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.ag
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */