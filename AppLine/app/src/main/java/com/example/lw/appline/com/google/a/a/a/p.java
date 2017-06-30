package com.example.lw.appline.com.google.a.a.a;

import android.content.Context;
import com.google.android.gms.analytics.internal.Command;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

class p
  implements ad, d.b, d.c
{
  private volatile long a;
  private volatile a b;
  private volatile c c;
  private e d;
  private e e;
  private final g f;
  private final Context g;
  private final Queue<d> h = new ConcurrentLinkedQueue();
  private volatile int i;
  private volatile Timer j;
  private volatile Timer k;
  private volatile Timer l;
  private boolean m;
  private boolean n;
  private h o;
  private long p = 300000L;
  
  p(Context paramContext, g paramg)
  {
    this(paramContext, paramg, null);
  }
  
  p(Context paramContext, g paramg, e parame)
  {
    this.e = parame;
    this.g = paramContext;
    this.f = paramg;
    this.o = new h()
    {
      public long a()
      {
        return System.currentTimeMillis();
      }
    };
    this.i = 0;
    this.b = a.g;
  }
  
  private Timer a(Timer paramTimer)
  {
    if (paramTimer != null) {
      paramTimer.cancel();
    }
    return null;
  }
  
  private void f()
  {
    this.j = a(this.j);
    this.k = a(this.k);
    this.l = a(this.l);
  }
  
  private void g()
  {
    for (;;)
    {
      try
      {
        if (!Thread.currentThread().equals(this.f.c()))
        {
          this.f.b().add(new Runnable()
          {
            public void run()
            {
              p.a(p.this);
            }
          });
          return;
        }
        if (this.n) {
          d();
        }
        switch (3.a[this.b.ordinal()])
        {
        case 1: 
          if (!this.h.isEmpty())
          {
            d locald1 = (d)this.h.poll();
            w.e("Sending hit to store");
            this.d.a(locald1.a(), locald1.b(), locald1.c(), locald1.d());
            continue;
          }
          if (!this.m) {
            continue;
          }
        }
      }
      finally {}
      h();
      continue;
      while (!this.h.isEmpty())
      {
        d locald2 = (d)this.h.peek();
        w.e("Sending hit to service");
        this.c.a(locald2.a(), locald2.b(), locald2.c(), locald2.d());
        this.h.poll();
      }
      this.a = this.o.a();
      continue;
      w.e("Need to reconnect");
      if (!this.h.isEmpty()) {
        j();
      }
    }
  }
  
  private void h()
  {
    this.d.a();
    this.m = false;
  }
  
  private void i()
  {
    for (;;)
    {
      try
      {
        a locala1 = this.b;
        a locala2 = a.c;
        if (locala1 == locala2) {
          return;
        }
        f();
        w.e("falling back to local store");
        if (this.e != null)
        {
          this.d = this.e;
          this.b = a.c;
          g();
          continue;
        }
        localo = o.a();
      }
      finally {}
      o localo;
      localo.a(this.g, this.f);
      this.d = localo.b();
    }
  }
  
  private void j()
  {
    for (;;)
    {
      try
      {
        if (this.c != null)
        {
          a locala1 = this.b;
          a locala2 = a.c;
          if (locala1 != locala2) {
            try
            {
              this.i += 1;
              a(this.k);
              this.b = a.a;
              this.k = new Timer("Failed Connect");
              this.k.schedule(new c(null), 3000L);
              w.e("connecting to Analytics service");
              this.c.b();
              return;
            }
            catch (SecurityException localSecurityException)
            {
              w.h("security exception on connectToService");
              i();
              continue;
            }
          }
        }
        w.h("client not initialized.");
      }
      finally {}
      i();
    }
  }
  
  private void k()
  {
    try
    {
      if ((this.c != null) && (this.b == a.b))
      {
        this.b = a.f;
        this.c.c();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void l()
  {
    this.j = a(this.j);
    this.j = new Timer("Service Reconnect");
    this.j.schedule(new e(null), 5000L);
  }
  
  public void a()
  {
    try
    {
      this.k = a(this.k);
      this.i = 0;
      w.e("Connected to service");
      this.b = a.b;
      g();
      this.l = a(this.l);
      this.l = new Timer("disconnect check");
      this.l.schedule(new b(null), this.p);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public void a(int paramInt, android.content.Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getstatic 274	com/google/a/a/a/p$a:e	Lcom/google/a/a/a/p$a;
    //   6: putfield 89	com/google/a/a/a/p:b	Lcom/google/a/a/a/p$a;
    //   9: aload_0
    //   10: getfield 85	com/google/a/a/a/p:i	I
    //   13: iconst_2
    //   14: if_icmpge +40 -> 54
    //   17: new 276	java/lang/StringBuilder
    //   20: dup
    //   21: invokespecial 277	java/lang/StringBuilder:<init>	()V
    //   24: ldc_w 279
    //   27: invokevirtual 283	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: iload_1
    //   31: invokevirtual 286	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   34: ldc_w 288
    //   37: invokevirtual 283	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: invokevirtual 291	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   43: invokestatic 254	com/google/a/a/a/w:h	(Ljava/lang/String;)I
    //   46: pop
    //   47: aload_0
    //   48: invokespecial 293	com/google/a/a/a/p:l	()V
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: new 276	java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial 277	java/lang/StringBuilder:<init>	()V
    //   61: ldc_w 279
    //   64: invokevirtual 283	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: iload_1
    //   68: invokevirtual 286	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   71: ldc_w 295
    //   74: invokevirtual 283	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: invokevirtual 291	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokestatic 254	com/google/a/a/a/w:h	(Ljava/lang/String;)I
    //   83: pop
    //   84: aload_0
    //   85: invokespecial 100	com/google/a/a/a/p:i	()V
    //   88: goto -37 -> 51
    //   91: astore_2
    //   92: aload_0
    //   93: monitorexit
    //   94: aload_2
    //   95: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	96	0	this	p
    //   0	96	1	paramInt	int
    //   0	96	2	paramIntent	android.content.Intent
    // Exception table:
    //   from	to	target	type
    //   2	51	91	finally
    //   54	88	91	finally
  }
  
  public void a(Map<String, String> paramMap, long paramLong, String paramString, List<Command> paramList)
  {
    w.e("putHit called");
    this.h.add(new d(paramMap, paramLong, paramString, paramList));
    g();
  }
  
  public void b()
  {
    for (;;)
    {
      try
      {
        if (this.b == a.f)
        {
          w.e("Disconnected from service");
          f();
          this.b = a.g;
          return;
        }
        w.e("Unexpected disconnect.");
        this.b = a.e;
        if (this.i < 2) {
          l();
        } else {
          i();
        }
      }
      finally {}
    }
  }
  
  public void c()
  {
    switch (3.a[this.b.ordinal()])
    {
    default: 
      this.m = true;
    case 2: 
      return;
    }
    h();
  }
  
  public void d()
  {
    w.e("clearHits called");
    this.h.clear();
    switch (3.a[this.b.ordinal()])
    {
    default: 
      this.n = true;
      return;
    case 1: 
      this.d.a(0L);
      this.n = false;
      return;
    }
    this.c.a();
    this.n = false;
  }
  
  public void e()
  {
    if (this.c != null) {
      return;
    }
    this.c = new d(this.g, this, this);
    j();
  }
  
  private static enum a
  {
    private a() {}
  }
  
  private class b
    extends TimerTask
  {
    private b() {}
    
    public void run()
    {
      if ((p.b(p.this) == p.a.b) && (p.e(p.this).isEmpty()) && (p.f(p.this) + p.g(p.this) < p.h(p.this).a()))
      {
        w.e("Disconnecting due to inactivity");
        p.i(p.this);
        return;
      }
      p.j(p.this).schedule(new b(p.this), p.g(p.this));
    }
  }
  
  private class c
    extends TimerTask
  {
    private c() {}
    
    public void run()
    {
      if (p.b(p.this) == p.a.a) {
        p.c(p.this);
      }
    }
  }
  
  private static class d
  {
    private final Map<String, String> a;
    private final long b;
    private final String c;
    private final List<Command> d;
    
    public d(Map<String, String> paramMap, long paramLong, String paramString, List<Command> paramList)
    {
      this.a = paramMap;
      this.b = paramLong;
      this.c = paramString;
      this.d = paramList;
    }
    
    public Map<String, String> a()
    {
      return this.a;
    }
    
    public long b()
    {
      return this.b;
    }
    
    public String c()
    {
      return this.c;
    }
    
    public List<Command> d()
    {
      return this.d;
    }
  }
  
  private class e
    extends TimerTask
  {
    private e() {}
    
    public void run()
    {
      p.d(p.this);
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.p
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */