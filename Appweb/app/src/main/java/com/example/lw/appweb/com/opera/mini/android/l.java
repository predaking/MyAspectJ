package com.example.lw.appweb.com.opera.mini.android;

import ab;
import android.os.Looper;
import android.os.SystemClock;
import aw;
import bj;
import e;
import g;
import java.util.Vector;
import k;
import q;

public class l
  extends g
{
  public l(e parame)
  {
    super(parame);
    b = 2;
    J();
  }
  
  private static native void Code(ab paramab, int paramInt1, int paramInt2, int paramInt3);
  
  private native void Code(aw paramaw, q paramq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  private static boolean Code(q paramq, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return !((ab)paramObject).b().Code(paramq, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private static native void I(ab paramab);
  
  private static k z()
  {
    return ((l)I).B.b();
  }
  
  public void C(int paramInt)
  {
    Object localObject3 = null;
    switch (paramInt)
    {
    }
    Object localObject2;
    for (;;)
    {
      try
      {
        super.C(paramInt);
        Object localObject1 = null;
        localObject2 = localObject3;
        switch (paramInt)
        {
        default: 
          localObject2 = localObject1;
        case -188: 
        case -64: 
          if (localObject2 == null) {
            break label291;
          }
          throw localObject2;
        }
      }
      catch (Throwable localThrowable)
      {
        continue;
        paramInt = Z.h();
        i = Z.h();
        j = Z.h();
        Code((ab)Z.v(Z.f()), j, i, paramInt);
        localObject2 = localObject3;
        continue;
        paramInt = Z.h();
        i = Z.h();
        j = Z.h();
        k = Z.h();
        m = Z.h();
        n = Z.f();
        i1 = Z.f();
        if (i1 == 0) {
          break label292;
        }
      }
      if (g.g()) {
        bj.Code();
      }
    }
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    label291:
    label292:
    for (ab localab = (ab)Z.v(i1);; localab = null)
    {
      z.Code(localab, m, k, j, i, paramInt, Z, n);
      localObject2 = localObject3;
      break;
      if (Z.h() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        z.I(bool);
        localObject2 = localObject3;
        break;
      }
      return;
    }
  }
  
  final void Code(ab paramab)
  {
    I(paramab);
    paramab.Code(null);
  }
  
  public void Code(boolean paramBoolean)
  {
    if (paramBoolean) {
      o();
    }
    int j = this.J.size();
    int i = 0;
    if (i < j)
    {
      localObject = (ab)this.J.elementAt(i);
      if (localObject != this.B) {
        ((ab)localObject).b().I(paramBoolean);
      }
      for (;;)
      {
        i += 1;
        break;
        ((ab)localObject).b().I(false);
      }
    }
    Object localObject = Z;
    if (paramBoolean) {}
    for (i = 99;; i = 0)
    {
      ((aw)localObject).z(i);
      System.gc();
      System.runFinalization();
      System.gc();
      t();
      return;
    }
  }
  
  public final void I()
  {
    super.I();
    bj.I();
  }
  
  protected final void b(int paramInt)
  {
    Code(Z, this.f, paramInt, this.f.Code(), this.f.I(), this.f.Z(), this.f.J());
  }
  
  protected final boolean b()
  {
    return ((I)Code).d();
  }
  
  public void run()
  {
    Looper.prepare();
    super.run();
  }
  
  public final int s()
  {
    return (int)SystemClock.uptimeMillis();
  }
  
  protected final void w() {}
  
  final void y()
  {
    if (this.B != null) {
      ((l)I).Code(this.B);
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.l
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */