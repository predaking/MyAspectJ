package com.example.lw.appweb;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;

public class aw
{
  private RuntimeException B = new RuntimeException();
  private int C;
  public byte[] Code;
  public int[] I;
  private boolean J = false;
  private long Z;
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  
  public aw(am paramam)
  {
    Code(this, paramam);
  }
  
  private native void A(int paramInt);
  
  private native void Code(int paramInt, int[] paramArrayOfInt);
  
  private static native void Code(aw paramaw, am paramam);
  
  private native void Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private native void Code(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, boolean paramBoolean);
  
  private native void Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private native void I(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private native int Z(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  private native int Z(int[] paramArrayOfInt, int paramInt1, int paramInt2);
  
  private native int a(int paramInt1, int paramInt2);
  
  private native int[] a(int paramInt1, int paramInt2, int paramInt3);
  
  private native byte[] b(int paramInt1, int paramInt2, int paramInt3);
  
  private native void v();
  
  public final int B()
  {
    return this.f;
  }
  
  public native int B(int paramInt1, int paramInt2);
  
  public final void B(int paramInt)
  {
    this.f = paramInt;
  }
  
  public native void B(int paramInt1, int paramInt2, int paramInt3);
  
  public native String C(int paramInt1, int paramInt2);
  
  public native void C();
  
  public native void C(int paramInt);
  
  public native void C(int paramInt1, int paramInt2, int paramInt3);
  
  public final int Code()
  {
    return this.a;
  }
  
  public native int Code(int paramInt1, int paramInt2, Object paramObject);
  
  public native int Code(long paramLong);
  
  public final int Code(String paramString)
  {
    int m = az.Code(paramString);
    byte[] arrayOfByte = new byte[m];
    int i = 0;
    int j = 0;
    int k;
    if (i < paramString.length())
    {
      k = paramString.charAt(i);
      if ((k < 55296) || (k > 56319)) {
        break label99;
      }
      i += 1;
      k = paramString.charAt(i) - 56320 + (65536 + (k - 55296 << 10));
    }
    label99:
    for (;;)
    {
      j += az.Code(k, arrayOfByte, j);
      i += 1;
      break;
      return Code(arrayOfByte, 0, m);
    }
  }
  
  public final int Code(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return 0;
    }
    return Z(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public native int Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public native int Code(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4);
  
  public final int Code(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    if (i < paramInt2)
    {
      k = paramArrayOfChar[(paramInt1 + i)];
      if ((k >= 55296) && (k <= 56319))
      {
        j += 4;
        k = i + 1;
        i = j;
        j = k;
      }
      for (;;)
      {
        k = j + 1;
        j = i;
        i = k;
        break;
        k = f.Code(k) + j;
        j = i;
        i = k;
      }
    }
    byte[] arrayOfByte = new byte[j];
    i = 0;
    int n;
    for (int k = 0; i < paramInt2; k = n + k)
    {
      int i1 = paramArrayOfChar[(paramInt1 + i)];
      n = i1;
      int m = i;
      if (i1 >= 55296)
      {
        n = i1;
        m = i;
        if (i1 <= 56319)
        {
          m = i + 1;
          n = (i1 - 55296 << 10) + 65536 + (paramArrayOfChar[(paramInt1 + m)] - 56320);
        }
      }
      n = az.Code(n, arrayOfByte, k);
      i = m + 1;
    }
    return Code(arrayOfByte, 0, j);
  }
  
  public native String Code(int paramInt1, int paramInt2, int paramInt3);
  
  public final void Code(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final void Code(int paramInt1, int paramInt2)
  {
    this.g = 0;
    this.h = 0;
    this.I = a(paramInt1, 0, paramInt2);
  }
  
  public final void Code(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    if (paramBoolean) {}
    for (int[] arrayOfInt = I(paramInt1, paramInt2, paramInt3);; arrayOfInt = new int[paramInt3])
    {
      this.I = arrayOfInt;
      return;
    }
  }
  
  public native void Code(DataInputStream paramDataInputStream, DataOutputStream paramDataOutputStream, boolean paramBoolean);
  
  public final void Code(InputStream paramInputStream)
  {
    Object localObject = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[paramInputStream.available()];
    for (int i = paramInputStream.read(arrayOfByte); i != -1; i = paramInputStream.read(arrayOfByte)) {
      ((ByteArrayOutputStream)localObject).write(arrayOfByte, 0, i);
    }
    paramInputStream = ((ByteArrayOutputStream)localObject).toByteArray();
    ((ByteArrayOutputStream)localObject).reset();
    localObject = new byte[0];
    Code(paramInputStream, paramInputStream.length, (byte[])localObject, localObject.length, false);
  }
  
  public final void Code(int[] paramArrayOfInt)
  {
    Code(0, paramArrayOfInt);
  }
  
  public native void Code(int[] paramArrayOfInt, int paramInt1, int paramInt2);
  
  public native boolean Code(Object paramObject);
  
  public final int I()
  {
    return this.b;
  }
  
  public native int I(int paramInt1, int paramInt2);
  
  public final int I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return Z(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void I(int paramInt)
  {
    this.b = paramInt;
  }
  
  public final void I(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    if (paramBoolean) {}
    for (byte[] arrayOfByte = b(paramInt1, paramInt2, paramInt3);; arrayOfByte = new byte[paramInt3])
    {
      this.Code = arrayOfByte;
      return;
    }
  }
  
  public final void I(String paramString)
  {
    A(Code(paramString));
  }
  
  public native void I(int[] paramArrayOfInt, int paramInt1, int paramInt2);
  
  public native int[] I(int paramInt1, int paramInt2, int paramInt3);
  
  public final int J()
  {
    return this.e;
  }
  
  public final void J(int paramInt)
  {
    this.e = paramInt;
  }
  
  public native void J(int paramInt1, int paramInt2);
  
  public native void J(int paramInt1, int paramInt2, int paramInt3);
  
  public final int Z()
  {
    return this.d;
  }
  
  public final void Z(int paramInt)
  {
    this.d = paramInt;
  }
  
  public native void Z(int paramInt1, int paramInt2);
  
  public native void Z(int paramInt1, int paramInt2, int paramInt3);
  
  public native int a(int paramInt);
  
  public native void a();
  
  public native void b();
  
  public native void b(int paramInt);
  
  public native void c(int paramInt);
  
  public native Object[] c();
  
  public native int d(int paramInt);
  
  public native long d();
  
  public native int e();
  
  public final RuntimeException e(int paramInt)
  {
    this.C = paramInt;
    return this.B;
  }
  
  public native int f();
  
  public native String f(int paramInt);
  
  protected void finalize()
  {
    try
    {
      v();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public native int g();
  
  public final char[] g(int paramInt)
  {
    String str = f(paramInt);
    if (str != null) {
      return str.toCharArray();
    }
    return null;
  }
  
  public native int h();
  
  public native long h(int paramInt);
  
  public final int i()
  {
    return Code("");
  }
  
  public final void i(int paramInt)
  {
    this.Code = new byte[paramInt];
  }
  
  public final int j()
  {
    return Code(this.Code, 0, this.Code.length);
  }
  
  public native void j(int paramInt);
  
  public native int k(int paramInt);
  
  public final void k()
  {
    this.a = a(0, this.a);
  }
  
  public native int l();
  
  public native void l(int paramInt);
  
  public final void m()
  {
    this.I = new int[4];
  }
  
  public final void m(int paramInt)
  {
    A(paramInt);
  }
  
  public final int n()
  {
    return Z(this.I, 0, this.I.length);
  }
  
  public native int n(int paramInt);
  
  public native int o(int paramInt);
  
  public final void o()
  {
    I(this.I, 0, this.g, this.h, this.I.length);
  }
  
  public final int p()
  {
    return Code(this.Code);
  }
  
  public final void p(int paramInt)
  {
    Code(this.Code, 0, this.g, this.h + 0, paramInt);
  }
  
  public native int q();
  
  public final byte[] q(int paramInt)
  {
    return b(paramInt, 0, r(paramInt));
  }
  
  public native int r();
  
  public native int r(int paramInt);
  
  public native int s(int paramInt);
  
  public native boolean s();
  
  public native int t(int paramInt);
  
  public native void t();
  
  public native int u(int paramInt);
  
  public final RuntimeException u()
  {
    return this.B;
  }
  
  public native Object v(int paramInt);
  
  public native void w(int paramInt);
  
  public native void x(int paramInt);
  
  public native int y(int paramInt);
  
  public final void z(int paramInt)
  {
    Code(paramInt, null);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     aw
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */