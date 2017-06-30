package com.example.lw.appline.com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.a.b;
import com.google.ads.c.h;
import com.google.ads.e.d;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class c
{
  public static final String a;
  private static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd");
  private static Method c = null;
  private static Method d = null;
  private b e = null;
  private Date f = null;
  private Set<String> g = null;
  private Map<String, Object> h = null;
  private final Map<Class<?>, h> i = new HashMap();
  private Location j = null;
  private boolean k = false;
  private boolean l = false;
  private Set<String> m = null;
  
  static
  {
    for (;;)
    {
      int n;
      try
      {
        Method[] arrayOfMethod = Class.forName("com.google.a.a.a.b").getMethods();
        int i1 = arrayOfMethod.length;
        n = 0;
        if (n < i1)
        {
          Method localMethod = arrayOfMethod[n];
          if ((localMethod.getName().equals("getInstance")) && (localMethod.getParameterTypes().length == 0)) {
            c = localMethod;
          } else if ((localMethod.getName().equals("getJoinIds")) && (localMethod.getParameterTypes().length == 0)) {
            d = localMethod;
          }
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        d.a("No Google Analytics: Library Not Found.");
        a = com.google.ads.e.a.b("emulator");
        return;
        if ((c != null) && (d != null)) {
          continue;
        }
        c = null;
        d = null;
        d.e("No Google Analytics: Library Incompatible.");
        continue;
      }
      catch (Throwable localThrowable)
      {
        d.a("No Google Analytics: Error Loading Library");
        continue;
      }
      n += 1;
    }
  }
  
  public c a(h paramh)
  {
    if (paramh != null) {
      this.i.put(paramh.getClass(), paramh);
    }
    return this;
  }
  
  public c a(Set<String> paramSet)
  {
    this.g = paramSet;
    return this;
  }
  
  public <T> T a(Class<T> paramClass)
  {
    return this.i.get(paramClass);
  }
  
  public Map<String, Object> a(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    if (this.g != null) {
      localHashMap.put("kw", this.g);
    }
    if (this.e != null) {
      localHashMap.put("cust_gender", Integer.valueOf(this.e.ordinal()));
    }
    if (this.f != null) {
      localHashMap.put("cust_age", b.format(this.f));
    }
    if (this.j != null) {
      localHashMap.put("uule", com.google.ads.e.a.a(this.j));
    }
    if (this.k) {
      localHashMap.put("testing", Integer.valueOf(1));
    }
    b localb;
    if (b(paramContext))
    {
      localHashMap.put("adtest", "on");
      paramContext = (com.google.ads.c.a.a)a(com.google.ads.c.a.a.class);
      localb = (b)a(b.class);
      if ((localb == null) || (localb.d() == null) || (localb.d().isEmpty())) {
        break label384;
      }
      localHashMap.put("extras", localb.d());
    }
    for (;;)
    {
      if (localb != null)
      {
        paramContext = localb.a();
        if (!TextUtils.isEmpty(paramContext)) {
          localHashMap.put("ppid", paramContext);
        }
      }
      if (this.h != null) {
        localHashMap.put("mediation_extras", this.h);
      }
      try
      {
        if (c != null)
        {
          paramContext = c.invoke(null, new Object[0]);
          paramContext = (Map)d.invoke(paramContext, new Object[0]);
          if ((paramContext != null) && (paramContext.size() > 0)) {
            localHashMap.put("analytics_join_id", paramContext);
          }
        }
        return localHashMap;
      }
      catch (Throwable paramContext)
      {
        d.c("Internal Analytics Error:", paramContext);
      }
      if (this.l) {
        break;
      }
      if (com.google.ads.e.a.c()) {}
      for (paramContext = "AdRequest.TEST_EMULATOR";; paramContext = "\"" + com.google.ads.e.a.a(paramContext) + "\"")
      {
        d.c("To get test ads on this device, call adRequest.addTestDevice(" + paramContext + ");");
        this.l = true;
        break;
      }
      label384:
      if ((paramContext != null) && (paramContext.d() != null) && (!paramContext.d().isEmpty())) {
        localHashMap.put("extras", paramContext.d());
      }
    }
    return localHashMap;
  }
  
  public c b(Set<String> paramSet)
  {
    this.m = paramSet;
    return this;
  }
  
  public boolean b(Context paramContext)
  {
    if (this.m != null)
    {
      paramContext = com.google.ads.e.a.a(paramContext);
      if (paramContext != null) {
        break label18;
      }
    }
    label18:
    while (!this.m.contains(paramContext)) {
      return false;
    }
    return true;
  }
  
  public static enum a
  {
    private final String e;
    
    private a(String paramString)
    {
      this.e = paramString;
    }
    
    public String toString()
    {
      return this.e;
    }
  }
  
  public static enum b
  {
    private b() {}
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.c
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */