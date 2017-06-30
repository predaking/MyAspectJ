package com.example.lw.appweb.com.opera.mini.android;

import ab;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import aw;
import ax;
import br;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import q;

public class z
  implements q
{
  private static Paint B;
  private static Rect C;
  private static char[] Code = new char[1];
  private static n I;
  private static FontMetricsInt J;
  private static float Z;
  private static Canvas a;
  private static Bitmap b;
  private static ByteBuffer c;
  private static byte[] d;
  private static int e;
  private static int f;
  private long g;
  private al h;
  
  static
  {
    B = new Paint();
    C = new Rect();
    a = new Canvas();
    h();
  }
  
  private static Rect Code(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, n paramn, boolean paramBoolean)
  {
    if (I != paramn)
    {
      B.set(paramn.J());
      f = (int)Math.ceil(B.measureText(" "));
      I = paramn;
      Z = 0.0F;
    }
    if (paramFloat != Z)
    {
      B.setTextSize(paramn.I() * paramFloat);
      f = (int)Math.ceil(B.measureText(" "));
      paramn = B.getFontMetricsInt();
      J = paramn;
      paramn.top -= 1;
      Z = paramFloat;
    }
    int i = paramInt2;
    if (paramInt2 > 2048) {
      i = 2048;
    }
    int j = Math.min(paramInt4, n.Code(B, f, paramArrayOfChar, paramInt1, i));
    int k = J.bottom - J.top;
    if ((b == null) || (b.getWidth() < j) || (b.getHeight() < k))
    {
      if (b == null) {
        break label405;
      }
      paramInt4 = Math.max(b.getWidth(), j);
      paramInt2 = Math.max(b.getHeight(), k);
      b.recycle();
    }
    for (;;)
    {
      b = null;
      c = null;
      d = null;
      e = paramInt4;
      paramn = new byte[paramInt4 * paramInt2];
      d = paramn;
      c = ByteBuffer.wrap(paramn);
      b = Bitmap.createBitmap(paramInt4, paramInt2, Config.ALPHA_8);
      a.setBitmap(b);
      a.clipRect(0.0F, 0.0F, j, k, Region.Op.REPLACE);
      a.drawColor(0, PorterDuff.Mode.SRC);
      a.drawText(paramArrayOfChar, paramInt1, i, -paramInt3, -J.top, B);
      if (paramBoolean)
      {
        c.position(0);
        b.copyPixelsToBuffer(c);
      }
      C.top = J.top;
      C.bottom = J.bottom;
      C.left = 0;
      C.right = j;
      return C;
      label405:
      paramInt2 = k;
      paramInt4 = j;
    }
  }
  
  public static n Code(int paramInt)
  {
    return (n)b.X[paramInt];
  }
  
  public static z Code(t paramt)
  {
    z localz = new z();
    localz.I(paramt);
    return localz;
  }
  
  public static native void Code(ab paramab, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, aw paramaw, int paramInt6);
  
  private native void Code(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, n paramn, int paramInt5, int paramInt6, int paramInt7);
  
  public static z I(int paramInt1, int paramInt2)
  {
    z localz = new z();
    localz.h = new s();
    localz.Z(paramInt1, paramInt2);
    return localz;
  }
  
  public static z I(Bitmap paramBitmap)
  {
    z localz = new z();
    if (d()) {}
    for (localz.h = new m(localz, paramBitmap);; localz.h = new am(localz, ByteBuffer.allocateDirect(paramBitmap.getRowBytes() * paramBitmap.getHeight())))
    {
      localz.Code(paramBitmap.getWidth(), paramBitmap.getHeight());
      return localz;
    }
  }
  
  public static native void I(boolean paramBoolean);
  
  private native void I(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, ax paramax, int paramInt5);
  
  public static native boolean d();
  
  private static native void h();
  
  native void B();
  
  native void C();
  
  public native int Code();
  
  public void Code(char paramChar, int paramInt1, int paramInt2, ax paramax, int paramInt3)
  {
    Code[0] = paramChar;
    Code(Code, 0, 1, paramInt1, paramInt2, paramax, paramInt3);
  }
  
  native void Code(int paramInt1, int paramInt2);
  
  public native void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    System.err.println("TODO: drawLine");
  }
  
  public void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    System.err.println("TODO: fillRectGradient");
  }
  
  public void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    System.err.println("TODO: fillArc");
  }
  
  public void Code(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, int paramInt7, int paramInt8, int paramInt9)
  {
    Code(paramArrayOfChar, paramInt2, paramInt3, paramInt4, paramInt5, (n)b.X[paramInt1], paramInt6, paramInt8, paramInt9);
  }
  
  public final void Code(Bitmap paramBitmap)
  {
    this.h.Code(paramBitmap);
  }
  
  public native void Code(br parambr, int paramInt1, int paramInt2);
  
  public native void Code(br parambr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public native void Code(br parambr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
  
  public void Code(br parambr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    I(parambr, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
  
  public void Code(br parambr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11)
  {
    Code(parambr, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public native void Code(String paramString, int paramInt1, int paramInt2, ax paramax, int paramInt3);
  
  public native void Code(boolean paramBoolean);
  
  public void Code(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, ax paramax, int paramInt5)
  {
    I(paramArrayOfChar, paramInt1, paramInt2, paramInt3, paramInt4, paramax, paramInt5);
  }
  
  public void Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean)
  {
    System.err.println("TODO: drawRGB");
  }
  
  public native int I();
  
  public native void I(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public void I(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    System.err.println("TODO: drawRect");
  }
  
  public native void I(br parambr, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  native void I(t paramt);
  
  public native int J();
  
  native void J(int paramInt1, int paramInt2);
  
  public native void J(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public native int Z();
  
  native void Z(int paramInt1, int paramInt2);
  
  public native void Z(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  final boolean a()
  {
    if (!this.h.Code()) {
      return false;
    }
    B();
    return true;
  }
  
  final void b()
  {
    C();
    this.h.I();
  }
  
  native void c();
  
  native void e();
  
  public native void f();
  
  protected native void finalize();
  
  public native void g();
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.z
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */