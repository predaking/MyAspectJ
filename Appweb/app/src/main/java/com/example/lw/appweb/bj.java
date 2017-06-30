package com.example.lw.appweb;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public final class bj
{
  private static String B;
  private static int C;
  static int Code;
  private static final Object I = new Object();
  private static boolean J;
  private static boolean Z;
  private static int a;
  private static int b;
  private static int c;
  private static ax d;
  private static int e;
  private static br f;
  private static br g;
  private static br h;
  private static br i;
  private static e j;
  private static int k;
  private static int l;
  private static int m;
  private static int n;
  private static int o;
  private static int p;
  
  static boolean B()
  {
    synchronized (I)
    {
      boolean bool = Z;
      return bool;
    }
  }
  
  private static void C()
  {
    if ((m == j.J()) && (n == j.B())) {
      return;
    }
    m = j.J();
    n = j.B();
    if (m > 225) {}
    for (int i1 = n * 80 / 100;; i1 = n - 45)
    {
      p = i1;
      i1 += k / 2;
      o = i1;
      o = i1 + Math.min(15, (n - o - e) / 2);
      l = p - k / 2;
      return;
    }
  }
  
  public static void Code()
  {
    synchronized (I)
    {
      J = false;
      return;
    }
  }
  
  static void Code(int paramInt)
  {
    synchronized (I)
    {
      if ((Z) && (!J))
      {
        C();
        b = Math.min(C + (a - C) * paramInt / 100, 1000);
      }
    }
  }
  
  static void Code(int paramInt1, int paramInt2)
  {
    synchronized (I)
    {
      C = paramInt1 * 10;
      a = paramInt2 * 10;
      Code(0);
      return;
    }
  }
  
  static void Code(int paramInt, byte[] paramArrayOfByte)
  {
    j.Code.Z("splash");
    byte[] arrayOfByte = new byte[4];
    f.Z(paramInt, arrayOfByte, 0);
    try
    {
      j.Code.Code("splash", arrayOfByte);
      Code = paramInt;
      j.Code.Code("splash", paramArrayOfByte);
      return;
    }
    catch (IOException paramArrayOfByte) {}
  }
  
  static void Code(String paramString)
  {
    synchronized (I)
    {
      if ((Z) && (!J))
      {
        C();
        char[] arrayOfChar = paramString.toCharArray();
        int i1 = new B(arrayOfChar, 0, 0, 0, null, d).C(0);
        if ((i1 & 0xE) != 0)
        {
          B = new String(arrayOfChar, 0, B.Code(arrayOfChar, i1));
          c = d.Code(B);
          j.Code(0, o, m, e);
        }
      }
      else
      {
        return;
      }
      B = paramString;
    }
  }
  
  static void Code(q paramq)
  {
    synchronized (I)
    {
      if ((!Z) || (J)) {
        return;
      }
      paramq.Z(paramq.Code(), paramq.I(), paramq.Z(), paramq.J(), 16777215);
      C();
      int i2 = p - k / 2 - 15 - i.I();
      int i1 = i2;
      if (f != null)
      {
        i1 = i2;
        if (f.I() <= i2)
        {
          i1 = b.Code(n * 40 / 100 - f.I() / 2, 0, i2 - 15 - f.I());
          paramq.Code(f, (m - f.Code()) / 2, i1);
          int i3 = i2 - i1 - f.I();
          i1 = i2;
          if (i3 < 15) {
            i1 = i2 + (15 - i3) / 2;
          }
        }
      }
      paramq.Code(i, (m - i.Code()) / 2, i1);
      i1 = Math.min(180, m * 95 / 100);
      i2 = (m - i1) / 2;
      Code(paramq, g, i2, l, i1, k);
      Code(paramq, h, i2, l, b * i1 / 1000, k);
      if (B != null) {
        paramq.Code(B, (m - c) / 2, o, d, 0);
      }
      ap.Code(paramq);
      return;
    }
  }
  
  private static void Code(q paramq, br parambr, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt4 > parambr.I()) {
      paramInt2 += (paramInt4 - parambr.I()) / 2;
    }
    for (;;)
    {
      paramInt4 = parambr.Code();
      paramInt4 = Math.min(parambr.Code() / 3, Math.min(paramInt3 / 2, paramInt4));
      paramq.Code(parambr, 0, 0, paramInt4, parambr.I(), paramInt1, paramInt2);
      paramq.Code(parambr, parambr.Code() - paramInt4, 0, paramInt4, parambr.I(), paramInt1 + paramInt3 - paramInt4, paramInt2);
      paramq.Code(parambr, paramInt4, 0, parambr.Code() - paramInt4 * 2, parambr.I(), paramInt1 + paramInt4, paramInt2, paramInt3 - paramInt4 * 2, parambr.I());
      return;
    }
  }
  
  public static void I()
  {
    synchronized (I)
    {
      J = true;
      return;
    }
  }
  
  static void J()
  {
    synchronized (I)
    {
      Z = false;
      f = null;
      i = null;
      g = null;
      h = null;
      return;
    }
  }
  
  static void Z()
  {
    j = g.Code();
    for (;;)
    {
      int i1;
      try
      {
        if (j.Code.Code("splash"))
        {
          Code = f.J(j.Code.Code("splash", 1), 0);
          DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(j.Code.Code("splash", 2)));
          if (localDataInputStream.readInt() == 1397764400)
          {
            int i3 = localDataInputStream.readShort();
            Object localObject1 = "";
            i1 = 0;
            Object localObject2;
            if (i1 < i3)
            {
              String str1 = localDataInputStream.readUTF();
              int i4 = localDataInputStream.readShort();
              i2 = 0;
              if (i2 >= i4) {
                continue;
              }
              String str2 = localDataInputStream.readUTF();
              localObject2 = localDataInputStream.readUTF();
              if ((!str1.equals("brand-logo")) || (!str2.equals("bitmap"))) {
                continue;
              }
              localObject1 = localObject2;
              continue;
            }
            i2 = localDataInputStream.readShort();
            i1 = 0;
            if (i1 < i2)
            {
              localObject2 = localDataInputStream.readUTF();
              i3 = localDataInputStream.readInt();
              if (((String)localObject2).equals(localObject1))
              {
                localObject2 = new byte[i3];
                localDataInputStream.readFully((byte[])localObject2);
                f = j.q().Code((byte[])localObject2, localObject2.length, true);
              }
              else
              {
                b.Code(localDataInputStream, i3);
              }
            }
          }
        }
      }
      catch (Throwable localThrowable1)
      {
        int i2;
        try
        {
          i = b.Code(32771, true);
          g = b.Code(32772, true);
          h = b.Code(32773, true);
          if (f == null) {
            f = b.Code(32770, true);
          }
          ax localax = j.s().Code(64);
          d = localax;
          e = localax.Code();
          k = Math.max(g.I(), h.I());
          Z = true;
          return;
        }
        catch (Throwable localThrowable2)
        {
          continue;
        }
        i2 += 1;
        continue;
        i1 += 1;
        continue;
      }
      i1 += 1;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bj
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */