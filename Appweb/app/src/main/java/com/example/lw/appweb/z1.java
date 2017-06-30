package com.example.lw.appweb;

public final class z
{
  private static final int[] Code = b.Code(b.Z("428a2f9871374491b5c0fbcfe9b5dba53956c25b59f111f1923f82a4ab1c5ed5d807aa9812835b01243185be550c7dc372be5d7480deb1fe9bdc06a7c19bf174e49b69c1efbe47860fc19dc6240ca1cc2de92c6f4a7484aa5cb0a9dc76f988da983e5152a831c66db00327c8bf597fc7c6e00bf3d5a7914706ca63511429296727b70a852e1b21384d2c6dfc53380d13650a7354766a0abb81c2c92e92722c85a2bfe8a1a81a664bc24b8b70c76c51a3d192e819d6990624f40e3585106aa07019a4c1161e376c082748774c34b0bcb5391c0cb34ed8aa4a5b9cca4f682e6ff3748f82ee78a5636f84c878148cc7020890befffaa4506cebbef9a3f7c67178f2"), 0, 256);
  private int B;
  private int C;
  private int I;
  private int J;
  private int Z;
  private int a;
  private int b;
  private int c;
  private byte[] d = new byte[4];
  private int e;
  private int[] f = new int[64];
  private int g;
  private int h;
  
  public z()
  {
    Code();
  }
  
  private static int Code(int paramInt1, int paramInt2, int paramInt3)
  {
    return ((paramInt1 >>> 6 | paramInt1 << 26) ^ (paramInt1 >>> 11 | paramInt1 << 21) ^ (paramInt1 >>> 25 | paramInt1 << 7)) + (paramInt1 & paramInt2 ^ (paramInt1 ^ 0xFFFFFFFF) & paramInt3);
  }
  
  private void Code(byte paramByte)
  {
    byte[] arrayOfByte = this.d;
    int i = this.e;
    this.e = (i + 1);
    arrayOfByte[i] = paramByte;
    if (this.e == this.d.length)
    {
      Code(this.d, 0);
      this.e = 0;
    }
    this.h += 1;
  }
  
  private static void Code(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >>> 24));
    paramArrayOfByte[(paramInt2 + 1)] = ((byte)(paramInt1 >>> 16));
    paramArrayOfByte[(paramInt2 + 2)] = ((byte)(paramInt1 >>> 8));
    paramArrayOfByte[(paramInt2 + 3)] = ((byte)paramInt1);
  }
  
  private void Code(byte[] paramArrayOfByte, int paramInt)
  {
    int[] arrayOfInt = this.f;
    int i = this.g;
    this.g = (i + 1);
    arrayOfInt[i] = ((paramArrayOfByte[paramInt] & 0xFF) << 24 | (paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt + 3)] & 0xFF);
    if (this.g == 16) {
      I();
    }
  }
  
  private static int I(int paramInt1, int paramInt2, int paramInt3)
  {
    return ((paramInt1 >>> 2 | paramInt1 << 30) ^ (paramInt1 >>> 13 | paramInt1 << 19) ^ (paramInt1 >>> 22 | paramInt1 << 10)) + (paramInt1 & paramInt2 ^ paramInt1 & paramInt3 ^ paramInt2 & paramInt3);
  }
  
  private void I()
  {
    int i = 16;
    int[] arrayOfInt;
    while (i <= 63)
    {
      arrayOfInt = this.f;
      j = this.f[(i - 2)];
      k = this.f[(i - 7)];
      m = this.f[(i - 15)];
      arrayOfInt[i] = ((j >>> 10 ^ ((j >>> 17 | j << 15) ^ (j >>> 19 | j << 13))) + k + (m >>> 3 ^ ((m >>> 7 | m << 25) ^ (m >>> 18 | m << 14))) + this.f[(i - 16)]);
      i += 1;
    }
    int j = this.I;
    int m = this.Z;
    int i1 = this.J;
    int i3 = this.B;
    int k = this.C;
    int n = this.a;
    int i2 = this.b;
    int i5 = this.c;
    i = 0;
    int i4 = 0;
    while (i < 8)
    {
      int i7 = Code(k, n, i2);
      int i8 = Code[i4];
      arrayOfInt = this.f;
      int i6 = i4 + 1;
      i4 = arrayOfInt[i4] + (i7 + i8) + i5;
      i3 += i4;
      i4 += I(j, m, i1);
      i7 = Code(i3, k, n);
      i8 = Code[i6];
      arrayOfInt = this.f;
      i5 = i6 + 1;
      i2 += i7 + i8 + arrayOfInt[i6];
      i1 += i2;
      i2 += I(i4, j, m);
      i7 = Code(i1, i3, k);
      i8 = Code[i5];
      arrayOfInt = this.f;
      i6 = i5 + 1;
      n += i7 + i8 + arrayOfInt[i5];
      m += n;
      n += I(i2, i4, j);
      i7 = Code(m, i1, i3);
      i8 = Code[i6];
      arrayOfInt = this.f;
      i5 = i6 + 1;
      k += i7 + i8 + arrayOfInt[i6];
      j += k;
      k += I(n, i2, i4);
      i7 = Code(j, m, i1);
      i8 = Code[i5];
      arrayOfInt = this.f;
      i6 = i5 + 1;
      i3 = i7 + i8 + arrayOfInt[i5] + i3;
      i5 = i4 + i3;
      i3 += I(k, n, i2);
      i7 = Code(i5, j, m);
      i8 = Code[i6];
      arrayOfInt = this.f;
      i4 = i6 + 1;
      i1 = i7 + i8 + arrayOfInt[i6] + i1;
      i2 += i1;
      i1 = I(i3, k, n) + i1;
      i7 = Code(i2, i5, j);
      i8 = Code[i4];
      arrayOfInt = this.f;
      i6 = i4 + 1;
      m = i7 + i8 + arrayOfInt[i4] + m;
      n += m;
      m = I(i1, i3, k) + m;
      i7 = Code(n, i2, i5);
      i8 = Code[i6];
      arrayOfInt = this.f;
      i4 = i6 + 1;
      j += i8 + i7 + arrayOfInt[i6];
      k += j;
      j += I(m, i1, i3);
      i += 1;
    }
    this.I += j;
    this.Z += m;
    this.J += i1;
    this.B += i3;
    this.C += k;
    this.a += n;
    this.b += i2;
    this.c += i5;
    this.g = 0;
    i = 0;
    while (i < 16)
    {
      this.f[i] = 0;
      i += 1;
    }
  }
  
  public final void Code()
  {
    this.h = 0;
    this.e = 0;
    int i = 0;
    while (i < this.d.length)
    {
      this.d[i] = 0;
      i += 1;
    }
    this.g = 0;
    i = 0;
    while (i < this.f.length)
    {
      this.f[i] = 0;
      i += 1;
    }
    this.I = 1779033703;
    this.Z = -1150833019;
    this.J = 1013904242;
    this.B = -1521486534;
    this.C = 1359893119;
    this.a = -1694144372;
    this.b = 528734635;
    this.c = 1541459225;
  }
  
  public final void Code(int paramInt)
  {
    Code((byte)(paramInt >>> 24));
    Code((byte)(paramInt >>> 16));
    Code((byte)(paramInt >>> 8));
    Code((byte)paramInt);
  }
  
  public final void Code(byte[] paramArrayOfByte)
  {
    int i = this.h;
    Code((byte)-128);
    while (this.e != 0) {
      Code((byte)0);
    }
    if (this.g > 14) {
      I();
    }
    this.f[15] = (i * 8);
    I();
    Code(this.I, paramArrayOfByte, 0);
    Code(this.Z, paramArrayOfByte, 4);
    Code(this.J, paramArrayOfByte, 8);
    Code(this.B, paramArrayOfByte, 12);
    Code(this.C, paramArrayOfByte, 16);
    Code(this.a, paramArrayOfByte, 20);
    Code(this.b, paramArrayOfByte, 24);
    Code(this.c, paramArrayOfByte, 28);
    Code();
  }
  
  public final void Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    int j = paramInt1;
    for (;;)
    {
      paramInt1 = j;
      paramInt2 = i;
      if (this.e == 0) {
        break;
      }
      paramInt1 = j;
      paramInt2 = i;
      if (i <= 0) {
        break;
      }
      Code(paramArrayOfByte[j]);
      j += 1;
      i -= 1;
    }
    for (;;)
    {
      i = paramInt1;
      j = paramInt2;
      if (paramInt2 <= this.d.length) {
        break;
      }
      Code(paramArrayOfByte, paramInt1);
      paramInt1 += this.d.length;
      paramInt2 -= this.d.length;
      this.h += this.d.length;
    }
    while (j > 0)
    {
      Code(paramArrayOfByte[i]);
      i += 1;
      j -= 1;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     z
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */