package com.example.lw.appline.com.google.a.a.a;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

public class o
  implements ac
{
  private static final Object a = new Object();
  private static o m;
  private Context b;
  private e c;
  private volatile g d;
  private int e = 1800;
  private boolean f = true;
  private boolean g = true;
  private boolean h = true;
  private f i = new f()
  {
    public void a(boolean paramAnonymousBoolean)
    {
      o.this.a(paramAnonymousBoolean, o.a(o.this));
    }
  };
  private Handler j;
  private n k;
  private boolean l = false;
  
  public static o a()
  {
    if (m == null) {
      m = new o();
    }
    return m;
  }
  
  private void e()
  {
    this.k = new n(this);
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    this.b.registerReceiver(this.k, localIntentFilter);
  }
  
  private void f()
  {
    this.j = (this.b.getMainLooper(), new Callback()
    {
      public boolean handleMessage(Message paramAnonymousMessage)
      {
        if ((1 == paramAnonymousMessage.what) && (o.d().equals(paramAnonymousMessage.obj)))
        {
          r.a().a(true);
          o.this.c();
          r.a().a(false);
          if ((o.b(o.this) > 0) && (!o.c(o.this))) {
            o.d(o.this).sendMessageDelayed(o.d(o.this).obtainMessage(1, o.d()), o.b(o.this) * 1000);
          }
        }
        return true;
      }
    });
    if (this.e > 0) {
      this.j.sendMessageDelayed(this.j.obtainMessage(1, a), this.e * 1000);
    }
  }
  
  /* Error */
  public void a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	com/google/a/a/a/o:j	Landroid/os/Handler;
    //   6: ifnonnull +17 -> 23
    //   9: ldc 111
    //   11: invokestatic 116	com/google/a/a/a/w:h	(Ljava/lang/String;)I
    //   14: pop
    //   15: aload_0
    //   16: iload_1
    //   17: putfield 43	com/google/a/a/a/o:e	I
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: invokestatic 121	com/google/a/a/a/r:a	()Lcom/google/a/a/a/r;
    //   26: getstatic 127	com/google/a/a/a/r$a:T	Lcom/google/a/a/a/r$a;
    //   29: invokevirtual 130	com/google/a/a/a/r:a	(Lcom/google/a/a/a/r$a;)V
    //   32: aload_0
    //   33: getfield 56	com/google/a/a/a/o:l	Z
    //   36: ifne +28 -> 64
    //   39: aload_0
    //   40: getfield 47	com/google/a/a/a/o:g	Z
    //   43: ifeq +21 -> 64
    //   46: aload_0
    //   47: getfield 43	com/google/a/a/a/o:e	I
    //   50: ifle +14 -> 64
    //   53: aload_0
    //   54: getfield 65	com/google/a/a/a/o:j	Landroid/os/Handler;
    //   57: iconst_1
    //   58: getstatic 40	com/google/a/a/a/o:a	Ljava/lang/Object;
    //   61: invokevirtual 134	android/os/Handler:removeMessages	(ILjava/lang/Object;)V
    //   64: aload_0
    //   65: iload_1
    //   66: putfield 43	com/google/a/a/a/o:e	I
    //   69: iload_1
    //   70: ifle -50 -> 20
    //   73: aload_0
    //   74: getfield 56	com/google/a/a/a/o:l	Z
    //   77: ifne -57 -> 20
    //   80: aload_0
    //   81: getfield 47	com/google/a/a/a/o:g	Z
    //   84: ifeq -64 -> 20
    //   87: aload_0
    //   88: getfield 65	com/google/a/a/a/o:j	Landroid/os/Handler;
    //   91: aload_0
    //   92: getfield 65	com/google/a/a/a/o:j	Landroid/os/Handler;
    //   95: iconst_1
    //   96: getstatic 40	com/google/a/a/a/o:a	Ljava/lang/Object;
    //   99: invokevirtual 104	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
    //   102: iload_1
    //   103: sipush 1000
    //   106: imul
    //   107: i2l
    //   108: invokevirtual 108	android/os/Handler:sendMessageDelayed	(Landroid/os/Message;J)Z
    //   111: pop
    //   112: goto -92 -> 20
    //   115: astore_2
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_2
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	o
    //   0	120	1	paramInt	int
    //   115	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	115	finally
    //   23	64	115	finally
    //   64	69	115	finally
    //   73	112	115	finally
  }
  
  /* Error */
  void a(Context paramContext, g paramg)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 84	com/google/a/a/a/o:b	Landroid/content/Context;
    //   6: astore_3
    //   7: aload_3
    //   8: ifnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: aload_1
    //   16: invokevirtual 139	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   19: putfield 84	com/google/a/a/a/o:b	Landroid/content/Context;
    //   22: aload_0
    //   23: getfield 141	com/google/a/a/a/o:d	Lcom/google/a/a/a/g;
    //   26: ifnonnull -15 -> 11
    //   29: aload_0
    //   30: aload_2
    //   31: putfield 141	com/google/a/a/a/o:d	Lcom/google/a/a/a/g;
    //   34: aload_0
    //   35: getfield 45	com/google/a/a/a/o:f	Z
    //   38: ifeq -27 -> 11
    //   41: aload_2
    //   42: invokeinterface 145 1 0
    //   47: goto -36 -> 11
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	o
    //   0	55	1	paramContext	Context
    //   0	55	2	paramg	g
    //   6	2	3	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	7	50	finally
    //   14	47	50	finally
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      a(this.l, paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    for (;;)
    {
      StringBuilder localStringBuilder;
      String str1;
      try
      {
        if (this.l == paramBoolean1)
        {
          boolean bool = this.g;
          if (bool == paramBoolean2) {
            return;
          }
        }
        if (((paramBoolean1) || (!paramBoolean2)) && (this.e > 0)) {
          this.j.removeMessages(1, a);
        }
        if ((!paramBoolean1) && (paramBoolean2) && (this.e > 0)) {
          this.j.sendMessageDelayed(this.j.obtainMessage(1, a), this.e * 1000);
        }
        localStringBuilder = new StringBuilder().append("PowerSaveMode ");
        if (paramBoolean1) {
          break label158;
        }
        if (paramBoolean2) {
          break label151;
        }
      }
      finally {}
      w.e(str1);
      this.l = paramBoolean1;
      this.g = paramBoolean2;
      continue;
      label151:
      String str2 = "terminated.";
      continue;
      label158:
      str2 = "initiated.";
    }
  }
  
  e b()
  {
    try
    {
      if (this.c != null) {
        break label50;
      }
      if (this.b == null) {
        throw new IllegalStateException("Cant get a store unless we have a context");
      }
    }
    finally {}
    this.c = new ab(this.i, this.b);
    label50:
    if (this.j == null) {
      f();
    }
    if ((this.k == null) && (this.h)) {
      e();
    }
    e locale = this.c;
    return locale;
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 141	com/google/a/a/a/o:d	Lcom/google/a/a/a/g;
    //   6: ifnonnull +17 -> 23
    //   9: ldc 188
    //   11: invokestatic 116	com/google/a/a/a/w:h	(Ljava/lang/String;)I
    //   14: pop
    //   15: aload_0
    //   16: iconst_1
    //   17: putfield 45	com/google/a/a/a/o:f	Z
    //   20: aload_0
    //   21: monitorexit
    //   22: return
    //   23: invokestatic 121	com/google/a/a/a/r:a	()Lcom/google/a/a/a/r;
    //   26: getstatic 191	com/google/a/a/a/r$a:S	Lcom/google/a/a/a/r$a;
    //   29: invokevirtual 130	com/google/a/a/a/r:a	(Lcom/google/a/a/a/r$a;)V
    //   32: aload_0
    //   33: getfield 141	com/google/a/a/a/o:d	Lcom/google/a/a/a/g;
    //   36: invokeinterface 145 1 0
    //   41: goto -21 -> 20
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	49	0	this	o
    //   44	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	20	44	finally
    //   23	41	44	finally
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.o
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */