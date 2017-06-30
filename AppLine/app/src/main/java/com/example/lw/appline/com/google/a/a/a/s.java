package com.example.lw.appline.com.google.a.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class s
  implements ah
{
  private static s j;
  private boolean a;
  private g b;
  private Context c;
  private ag d;
  private a e;
  private volatile String f;
  private volatile Boolean g;
  private final Map<String, ag> h = new HashMap();
  private String i;
  
  s() {}
  
  private s(Context paramContext)
  {
    this(paramContext, q.a(paramContext));
  }
  
  private s(Context paramContext, g paramg)
  {
    if (paramContext == null) {
      throw new IllegalArgumentException("context cannot be null");
    }
    this.c = paramContext.getApplicationContext();
    this.b = paramg;
    this.e = new a();
    this.b.a(new a()
    {
      public void a(boolean paramAnonymousBoolean)
      {
        s.a(s.this, Boolean.valueOf(paramAnonymousBoolean));
      }
    });
    this.b.a(new g.a()
    {
      public void a(String paramAnonymousString)
      {
        s.a(s.this, paramAnonymousString);
      }
    });
  }
  
  public static s a(Context paramContext)
  {
    try
    {
      if (j == null) {
        j = new s(paramContext);
      }
      paramContext = j;
      return paramContext;
    }
    finally {}
  }
  
  public ag a(String paramString)
  {
    if (paramString == null) {
      try
      {
        throw new IllegalArgumentException("trackingId cannot be null");
      }
      finally {}
    }
    ag localag2 = (ag)this.h.get(paramString);
    ag localag1 = localag2;
    if (localag2 == null)
    {
      localag2 = new ag(paramString, this);
      this.h.put(paramString, localag2);
      localag1 = localag2;
      if (this.d == null)
      {
        this.d = localag2;
        localag1 = localag2;
      }
    }
    r.a().a(r.a.N);
    return localag1;
  }
  
  public void a(Map<String, String> paramMap)
  {
    if (paramMap == null) {
      try
      {
        throw new IllegalArgumentException("hit cannot be null");
      }
      finally {}
    }
    paramMap.put("language", ai.a(Locale.getDefault()));
    paramMap.put("adSenseAdMobHitId", Integer.toString(this.e.a()));
    paramMap.put("screenResolution", this.c.getResources().getDisplayMetrics().widthPixels + "x" + this.c.getResources().getDisplayMetrics().heightPixels);
    paramMap.put("usage", r.a().c());
    r.a().b();
    this.b.a(paramMap);
    this.i = ((String)paramMap.get("trackingId"));
  }
  
  public void a(boolean paramBoolean)
  {
    r.a().a(r.a.L);
    this.a = paramBoolean;
    w.a(paramBoolean);
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.s
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */