package com.example.lw.appweb;

import java.io.DataInputStream;
import java.io.InputStream;

public final class as
  extends InputStream
  implements p
{
  private static final int[] k = new int[29];
  private static final int[] l = new int[30];
  private int B;
  private int C;
  private int Code = 6;
  private int I;
  private int J;
  private byte[] Z;
  private int a;
  private int b;
  private int c = 0;
  private ap d;
  private DataInputStream e;
  private byte[] f;
  private int g;
  private int h;
  private int i;
  private int j = 0;
  private short[] m = new short[574];
  private short[] n = new short[62];
  private byte[] o = new byte[288];
  
  private boolean B()
  {
    if ((this.a > 0) && (J())) {
      return true;
    }
    do
    {
      int i1 = Code(this.m);
      if (i1 == 256) {
        break;
      }
      int i2;
      if (i1 > 256)
      {
        i1 -= 257;
        this.a = k[i1];
        if ((i1 > 7) && (i1 != 28))
        {
          i2 = this.a;
          this.a = (Code(i1 / 4 - 1) + i2);
        }
        int i3 = Code(this.n);
        i2 = l[i3];
        i1 = i2;
        if (i3 > 3) {
          i1 = i2 + Code(i3 / 2 - 1);
        }
        this.B = (this.J - i1);
        if (this.B < 0) {
          this.B = (this.I + this.B);
        }
        if (J()) {
          return true;
        }
      }
      else
      {
        byte[] arrayOfByte = this.Z;
        i2 = this.J;
        this.J = (i2 + 1);
        arrayOfByte[i2] = ((byte)i1);
      }
    } while (this.C != this.J);
    return true;
    return false;
  }
  
  private final int Code(int paramInt)
  {
    int i1 = 0;
    int i2 = 0;
    while (i1 < paramInt)
    {
      if (this.j == 0)
      {
        this.i = Z();
        this.j = 8;
      }
      i2 |= (this.i & 0x1) << i1;
      this.i >>>= 1;
      this.j -= 1;
      i1 += 1;
    }
    return i2;
  }
  
  private int Code(short[] paramArrayOfShort)
  {
    int i1 = 0;
    while (i1 >= 0)
    {
      if (this.j == 0)
      {
        this.i = Z();
        this.j = 8;
      }
      i1 = paramArrayOfShort[(i1 + (this.i & 0x1))];
      this.i >>>= 1;
      this.j -= 1;
    }
    return i1 & 0xFFF;
  }
  
  private static final void Code(byte[] paramArrayOfByte, int paramInt, short[] paramArrayOfShort)
  {
    int i3 = 0;
    while (i3 < paramArrayOfShort.length)
    {
      paramArrayOfShort[i3] = 0;
      i3 += 1;
    }
    int i1 = 2;
    int i6 = 1;
    int i4 = 0;
    int i7;
    if (i6 <= 16)
    {
      i7 = 0;
      label42:
      if (i7 < paramInt)
      {
        if (paramArrayOfByte[i7] != i6) {
          break label195;
        }
        int i8 = i6 - 1;
        i3 = 0;
        int i9 = i3;
        if (i8 >= 0)
        {
          int i5 = i3;
          if ((1 << i8 & i4) != 0) {
            i5 = i3 + 1;
          }
          i9 = i5;
          if (i8 != 0)
          {
            int i2;
            if (paramArrayOfShort[i5] == 0)
            {
              paramArrayOfShort[i5] = i1;
              i2 = (short)(i1 + 2);
              i3 = i1;
            }
            for (;;)
            {
              i8 -= 1;
              i1 = i2;
              break;
              i3 = paramArrayOfShort[i5];
              i2 = i1;
            }
          }
        }
        paramArrayOfShort[i9] = ((short)(0x8000 | i7));
      }
    }
    label195:
    for (i3 = i4 + 1;; i3 = i4)
    {
      i7 = (short)(i7 + 1);
      i4 = i3;
      break label42;
      i4 <<= 1;
      i6 += 1;
      break;
      return;
    }
  }
  
  private byte[] Code(short[] paramArrayOfShort, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i1 = 0;
    label135:
    while (i1 < paramInt)
    {
      int i4 = Code(paramArrayOfShort);
      if (i4 < 16)
      {
        arrayOfByte[i1] = ((byte)i4);
        i1 += 1;
      }
      else
      {
        int i2;
        int i3;
        if (i4 == 18)
        {
          i2 = 7;
          i3 = Code(i2) + 3;
          i2 = i3;
          if (i4 == 18) {
            i2 = i3 + 8;
          }
          if (i4 <= 16) {
            break label124;
          }
          i3 = 0;
        }
        for (;;)
        {
          if (i2 <= 0) {
            break label135;
          }
          arrayOfByte[i1] = ((byte)i3);
          i1 += 1;
          i2 -= 1;
          continue;
          i2 = i4 - 14;
          break;
          label124:
          i3 = arrayOfByte[(i1 - 1)];
        }
      }
    }
    return arrayOfByte;
  }
  
  private boolean J()
  {
    boolean bool2 = false;
    do
    {
      int i1 = this.a;
      this.a = (i1 - 1);
      bool1 = bool2;
      if (i1 <= 0) {
        break;
      }
      byte[] arrayOfByte1 = this.Z;
      i1 = this.J;
      this.J = (i1 + 1);
      byte[] arrayOfByte2 = this.Z;
      int i2 = this.B;
      this.B = (i2 + 1);
      arrayOfByte1[i1] = arrayOfByte2[i2];
      if (this.B == this.I) {
        this.B = 0;
      }
    } while (this.C != this.J);
    boolean bool1 = true;
    return bool1;
  }
  
  private int Z()
  {
    if (this.e != null) {
      return this.e.readByte();
    }
    while (this.g >= this.h) {
      this.d.I(true);
    }
    this.b += 1;
    byte[] arrayOfByte = this.f;
    int i1 = this.g;
    this.g = (i1 + 1);
    return arrayOfByte[i1] & 0xFF;
  }
  
  public final void Code()
  {
    Code(new byte[32768]);
  }
  
  public final void Code(ap paramap)
  {
    this.d = paramap;
  }
  
  public final void Code(DataInputStream paramDataInputStream)
  {
    Code();
    this.e = paramDataInputStream;
  }
  
  public final void Code(byte[] paramArrayOfByte)
  {
    this.Z = paramArrayOfByte;
    this.I = paramArrayOfByte.length;
    if (l[0] == 0)
    {
      l[0] = 1;
      l[1] = 2;
      int i1 = 1;
      while (i1 < 29)
      {
        l[(i1 + 1)] = ((1 << i1 / 2) + (1 << (i1 - 1) / 2) + 1);
        i1 += 1;
      }
      int i2 = 0;
      i1 = 3;
      if (i2 < 28)
      {
        k[i2] = i1;
        if (i2 < 8) {}
        for (int i3 = 1;; i3 = 1 << (i2 - 4) / 4)
        {
          i2 += 1;
          i1 = i3 + i1;
          break;
        }
      }
      k[28] = 258;
    }
  }
  
  public final int I()
  {
    return this.b;
  }
  
  public final void end() {}
  
  public final int read()
  {
    if (read(null, 0, 1) == 0) {
      return -1;
    }
    return this.Z[(this.J - 1)] & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.b = 0;
    if (this.J == this.I) {
      this.J = 0;
    }
    int i2 = this.I - this.J;
    int i3;
    if (paramInt2 < i2)
    {
      this.C = (this.J + paramInt2);
      i3 = this.J;
    }
    for (;;)
    {
      if ((this.C != this.J) && ((this.e != null) || (this.g < this.h))) {
        switch (this.Code)
        {
        }
      }
      label132:
      label573:
      for (;;)
      {
        if (this.c != 1) {
          break label645;
        }
        this.Code = 7;
        label490:
        do
        {
          for (;;)
          {
            if (paramArrayOfByte != null) {
              System.arraycopy(this.Z, i3, paramArrayOfByte, paramInt1, this.J - i3);
            }
            return this.J - i3;
            paramInt2 = i2;
            break;
            return 0;
            this.j = 0;
            this.a = Code(16);
            Code(16);
            this.Code = 3;
            do
            {
              if (this.a <= 0) {
                break;
              }
              this.a -= 1;
              localObject = this.Z;
              paramInt2 = this.J;
              this.J = (paramInt2 + 1);
              localObject[paramInt2] = ((byte)Z());
            } while (this.C != this.J);
            continue;
            i2 = 0;
            for (;;)
            {
              paramInt2 = i2;
              if (i2 >= 144) {
                break;
              }
              this.o[i2] = 8;
              i2 += 1;
            }
            for (;;)
            {
              i2 = paramInt2;
              if (paramInt2 >= 256) {
                break;
              }
              this.o[paramInt2] = 9;
              paramInt2 += 1;
            }
            for (;;)
            {
              paramInt2 = i2;
              if (i2 >= 280) {
                break;
              }
              this.o[i2] = 7;
              i2 += 1;
            }
            while (paramInt2 < 288)
            {
              this.o[paramInt2] = 8;
              paramInt2 += 1;
            }
            Code(this.o, 288, this.m);
            paramInt2 = 0;
            while (paramInt2 < 32)
            {
              this.o[paramInt2] = 5;
              paramInt2 += 1;
            }
            Code(this.o, 32, this.n);
            this.Code = 4;
            if (!B()) {
              break label132;
            }
          }
          int i4 = Code(5) + 257;
          int i5 = Code(5) + 1;
          int i6 = Code(4);
          i2 = 0;
          if (i2 < 19)
          {
            if (i2 < 3)
            {
              paramInt2 = i2 + 16;
              localObject = this.o;
              if (i2 >= i6 + 4) {
                break label573;
              }
            }
            for (int i1 = (byte)Code(3);; i1 = 0)
            {
              localObject[paramInt2] = i1;
              i2 += 1;
              break;
              if (i2 == 3)
              {
                paramInt2 = 0;
                break label490;
              }
              if ((i2 & 0x1) == 1)
              {
                paramInt2 = 7 - (i2 - 5 >>> 1);
                break label490;
              }
              paramInt2 = (i2 - 4 >>> 1) + 8;
              break label490;
            }
          }
          Object localObject = new short[36];
          Code(this.o, 19, (short[])localObject);
          Code(Code((short[])localObject, i4), i4, this.m);
          Code(Code((short[])localObject, i5), i5, this.n);
          this.Code = 5;
        } while (B());
      }
      label645:
      this.c = Code(1);
      this.Code = Code(2);
    }
  }
  
  public final void setInput(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.f = paramArrayOfByte;
    this.g = paramInt1;
    this.h = (paramInt1 + paramInt2);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     as
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */