package com.example.lw.appweb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;

final class bc
  extends InputStream
{
  private Hashtable B;
  private int C;
  private ap Code;
  private bc I;
  private int[] J;
  private Object[] Z;
  private boolean a;
  private int b;
  private boolean c;
  private int d;
  private byte[] e;
  private int f;
  private int g;
  private int h;
  private int i;
  private final boolean j;
  private int k = 0;
  private byte[] l = new byte[1];
  private long m;
  
  bc(Object[] paramArrayOfObject, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    this.Z = paramArrayOfObject;
    this.J = paramArrayOfInt;
    this.i = paramInt;
    this.j = paramBoolean;
    paramArrayOfInt[46] = 0;
    this.B = ((Hashtable)paramArrayOfObject[9]);
    paramArrayOfObject[9] = null;
  }
  
  final bc B()
  {
    return this.I;
  }
  
  final int C()
  {
    return this.C;
  }
  
  final int Code()
  {
    return this.i;
  }
  
  final Hashtable Code(boolean paramBoolean)
  {
    Hashtable localHashtable = this.B;
    if (paramBoolean) {
      this.B = null;
    }
    return localHashtable;
  }
  
  final void Code(int paramInt)
  {
    try
    {
      this.g = paramInt;
      this.e = null;
      notifyAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void Code(ap paramap, int paramInt)
  {
    this.Code = paramap;
    this.C = paramInt;
  }
  
  final void Code(bc parambc)
  {
    this.I = parambc;
  }
  
  final boolean Code(String paramString)
  {
    if (this.k >= 3) {
      return false;
    }
    this.k += 1;
    this.i = ba.Code(paramString, null);
    this.Code = null;
    if (this.k == 1) {
      this.Z[90] = this.Z[53];
    }
    this.Z[53] = paramString;
    this.J[46] = 0;
    return true;
  }
  
  final bc I(bc parambc)
  {
    bc localbc1;
    if (parambc == this)
    {
      localbc1 = this.I;
      this.I = null;
      return localbc1;
    }
    for (bc localbc2 = this;; localbc2 = localbc2.I)
    {
      localbc1 = this;
      if (localbc2.I == null) {
        break;
      }
      if (localbc2.I == parambc)
      {
        localbc2.I = parambc.I;
        parambc.I = null;
        return this;
      }
    }
  }
  
  final void I(int paramInt)
  {
    this.a = true;
    this.d = paramInt;
    b.Code(this);
  }
  
  final boolean I()
  {
    return this.j;
  }
  
  final void J()
  {
    this.Code = null;
  }
  
  final void J(int paramInt)
  {
    this.h += paramInt;
  }
  
  final ap Z()
  {
    return this.Code;
  }
  
  final void Z(int paramInt)
  {
    this.b = paramInt;
  }
  
  final Object[] a()
  {
    return this.Z;
  }
  
  final int[] b()
  {
    return this.J;
  }
  
  final byte[] c()
  {
    return this.e;
  }
  
  public final void close()
  {
    ap.Code(this, false);
  }
  
  final int d()
  {
    return this.f;
  }
  
  final int e()
  {
    return this.g;
  }
  
  final void f()
  {
    this.Z = null;
    this.J = null;
  }
  
  final boolean g()
  {
    return this.Z == null;
  }
  
  final boolean h()
  {
    return this.J[46] != 0;
  }
  
  final void i()
  {
    this.J[46] = 1;
  }
  
  final void j()
  {
    this.c = true;
    b.Code(this);
  }
  
  public final boolean k()
  {
    return this.a;
  }
  
  final int l()
  {
    return this.b;
  }
  
  public final int m()
  {
    return this.d;
  }
  
  public final int n()
  {
    return this.h;
  }
  
  public final boolean o()
  {
    if (this.Code == null) {
      return false;
    }
    return this.Code.b();
  }
  
  final void p()
  {
    this.m = System.currentTimeMillis();
  }
  
  public final int q()
  {
    return (int)(System.currentTimeMillis() - this.m);
  }
  
  public final boolean r()
  {
    return this.Code.B();
  }
  
  public final int read()
  {
    if (read(this.l, 0, 1) < 0) {
      return -1;
    }
    return this.l[0] & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.e = paramArrayOfByte;
    b.Code(this);
    for (;;)
    {
      if (this.a)
      {
        if (this.c) {
          return -1;
        }
        throw new IOException();
      }
      ap localap = this.Code;
      if (localap != null) {
        localap.Code(this);
      }
      if (this.e == null)
      {
        if (this.g == 0) {
          break;
        }
        return this.g;
      }
      b.Code(this, 1000);
    }
  }
  
  final bb s()
  {
    return this.Code.Code();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bc
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */