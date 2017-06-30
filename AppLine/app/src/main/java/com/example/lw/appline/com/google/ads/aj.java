package com.example.lw.appline.com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.b.k;
import com.google.ads.c.b;
import com.google.ads.e.d;
import com.google.ads.e.k.b;
import java.util.HashMap;

public class aj
{
  final k a;
  private final ah b;
  private boolean c;
  private boolean d;
  private ai.a e;
  private final ag f;
  private b<?, ?> g;
  private boolean h;
  private boolean i;
  private View j;
  private final String k;
  private final c l;
  private final HashMap<String, String> m;
  
  public aj(ag paramag, k paramk, ah paramah, String paramString, c paramc, HashMap<String, String> paramHashMap)
  {
    com.google.ads.e.c.a(TextUtils.isEmpty(paramString));
    this.f = paramag;
    this.a = paramk;
    this.b = paramah;
    this.k = paramString;
    this.l = paramc;
    this.m = paramHashMap;
    this.c = false;
    this.d = false;
    this.e = null;
    this.g = null;
    this.h = false;
    this.i = false;
    this.j = null;
  }
  
  public void a()
  {
    try
    {
      com.google.ads.e.c.a(this.h, "destroy() called but startLoadAdTask has not been called.");
      ((Handler)ao.a().c.a()).post(new Runnable()
      {
        public void run()
        {
          if (aj.this.h()) {
            com.google.ads.e.c.a(aj.a(aj.this));
          }
          try
          {
            aj.a(aj.this).a();
            d.a("Called destroy() for adapter with class: " + aj.a(aj.this).getClass().getName());
            return;
          }
          catch (Throwable localThrowable)
          {
            d.b("Error while destroying adapter (" + aj.this.f() + "):", localThrowable);
          }
        }
      }());
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
    try
    {
      com.google.ads.e.c.b(this.h, "startLoadAdTask has already been called.");
      this.h = true;
      ((Handler)ao.a().c.a()).post(new ak(this, paramActivity, this.k, this.l, this.m));
      return;
    }
    finally
    {
      paramActivity = finally;
      throw paramActivity;
    }
  }
  
  void a(b<?, ?> paramb)
  {
    try
    {
      this.g = paramb;
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  void a(boolean paramBoolean, ai.a parama)
  {
    try
    {
      this.d = paramBoolean;
      this.c = true;
      this.e = parama;
      notify();
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public boolean b()
  {
    try
    {
      boolean bool = this.c;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean c()
  {
    try
    {
      com.google.ads.e.c.a(this.c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
      boolean bool = this.d;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public ai.a d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	com/google/ads/aj:e	Lcom/google/ads/ai$a;
    //   6: ifnonnull +11 -> 17
    //   9: getstatic 128	com/google/ads/ai$a:d	Lcom/google/ads/ai$a;
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: aload_0
    //   18: getfield 65	com/google/ads/aj:e	Lcom/google/ads/ai$a;
    //   21: astore_1
    //   22: goto -9 -> 13
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	30	0	this	aj
    //   12	10	1	locala	ai.a
    //   25	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	13	25	finally
    //   17	22	25	finally
  }
  
  public View e()
  {
    try
    {
      com.google.ads.e.c.a(this.c, "getAdView() called when isLoadAdTaskDone() is false.");
      View localView = this.j;
      return localView;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public String f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 67	com/google/ads/aj:g	Lcom/google/ads/c/b;
    //   6: ifnull +18 -> 24
    //   9: aload_0
    //   10: getfield 67	com/google/ads/aj:g	Lcom/google/ads/c/b;
    //   13: invokevirtual 136	java/lang/Object:getClass	()Ljava/lang/Class;
    //   16: invokevirtual 141	java/lang/Class:getName	()Ljava/lang/String;
    //   19: astore_1
    //   20: aload_0
    //   21: monitorexit
    //   22: aload_1
    //   23: areturn
    //   24: ldc 143
    //   26: astore_1
    //   27: goto -7 -> 20
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	35	0	this	aj
    //   19	8	1	str	String
    //   30	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	30	finally
  }
  
  void g()
  {
    try
    {
      this.i = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  boolean h()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.aj
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */