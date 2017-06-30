package com.example.lw.appweb;

final class y
{
  private final k Code;
  private final bk I;
  private boolean J;
  private final bk Z;
  
  y(k paramk)
  {
    this.Code = paramk;
    this.I = new bk(paramk);
    this.Z = new bk(paramk);
    this.J = false;
  }
  
  final void B()
  {
    if (!this.J) {
      return;
    }
    String str = C();
    g.Code.w().Code(str);
  }
  
  final String C()
  {
    if ((!this.J) || (this.I.Code()) || (this.Z.Code())) {
      return "";
    }
    bk localbk2 = bk.Code(this.I, this.Z);
    if (localbk2 != this.I) {}
    for (bk localbk1 = this.I;; localbk1 = this.Z)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      localbk2 = new bk(localbk2);
      do
      {
        if (localbk2.I(localbk1) >= 0) {
          break;
        }
        localStringBuffer.append(localbk2.Z());
      } while (!localbk2.J());
      return localStringBuffer.toString();
    }
  }
  
  final bk Code()
  {
    return this.I;
  }
  
  final void Code(int paramInt1, int paramInt2, int paramInt3)
  {
    this.I.Code(paramInt1, paramInt2, paramInt3);
  }
  
  final void Code(bk parambk)
  {
    this.I.Code(parambk);
  }
  
  final void Code(q paramq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, char[] paramArrayOfChar, int paramInt9, int paramInt10, int paramInt11, boolean paramBoolean)
  {
    if ((!this.J) || (this.I.Code()) || (this.Z.Code())) {
      return;
    }
    int k = b.C(paramInt10);
    int m = paramInt11 / k;
    int i = 1;
    int j = 0;
    label48:
    if ((j < paramInt9) && (i <= m))
    {
      if (paramArrayOfChar[j] != '\n') {
        break label572;
      }
      i += 1;
    }
    label288:
    label565:
    label572:
    for (;;)
    {
      j += 1;
      break label48;
      int i3 = this.Code.a(k);
      m = 0;
      j = 0;
      label104:
      int n;
      int i1;
      int i2;
      J localJ;
      int i4;
      if (m < i)
      {
        n = 0;
        k = j;
        while ((k < paramInt9) && (paramArrayOfChar[k] != '\n'))
        {
          k += 1;
          n += 1;
        }
        if (bk.Code(this.I, this.Z, paramInt8, j, n))
        {
          i1 = paramInt4 + this.Code.a(paramInt11 * m / i);
          i2 = bk.Code(this.I, this.Z, paramInt8, j);
          k = b.Code(paramInt10, paramArrayOfChar, j, i2);
          i2 = b.Code(paramInt10, paramArrayOfChar, j + i2, bk.I(this.I, this.Z, paramInt8, j, n) - i2);
          k = this.Code.a(k);
          i2 = this.Code.a(i2);
          if (!paramBoolean) {
            break label509;
          }
          k += paramInt3;
          paramq.Z(k, i1, i2, i3, -5189377);
          if ((m + 1 == i) && (bk.I(this.I, this.Z, paramInt8)))
          {
            localJ = this.Code.Code(paramInt8, paramInt6, paramInt7);
            if (J.Code(paramInt11 * m / i + paramInt7, b.C(paramInt10), localJ.Z(), localJ.B()))
            {
              if (!paramBoolean) {
                break label525;
              }
              k += i2;
              i2 = localJ.Z();
              i4 = localJ.B();
              if (paramInt11 >= i4) {
                break label565;
              }
              i1 = this.Code.a(i4 + i2);
              i4 = this.Code.a(i2);
              i2 = i1 - i4;
              i1 = i4 + paramInt2;
            }
          }
        }
      }
      for (;;)
      {
        i4 = this.Code.a(localJ.I()) + paramInt1;
        if (k < i4) {
          paramq.Z(k, i1, i4 - k + 1, i2, -5189377);
        }
        for (;;)
        {
          m += 1;
          j += n + 1;
          break label104;
          break;
          label509:
          k = paramInt3 + paramInt5 - k - i2;
          break label288;
          break label388;
          int i5 = localJ.J();
          paramq.Z(i4 + i5, i1, k - (i5 + i4) + 1, i2, -5189377);
        }
        i2 = i3;
      }
    }
  }
  
  final void Code(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  final boolean Code(int paramInt)
  {
    return bk.Code(this.I, this.Z, paramInt);
  }
  
  final bk I()
  {
    return this.Z;
  }
  
  final void I(int paramInt1, int paramInt2, int paramInt3)
  {
    this.I.I(paramInt1, paramInt2, paramInt3);
  }
  
  final void I(bk parambk)
  {
    this.Z.Code(parambk);
  }
  
  final void J()
  {
    this.I.I();
    this.Z.I();
  }
  
  final void J(int paramInt1, int paramInt2, int paramInt3)
  {
    this.Z.Z(paramInt1, paramInt2, paramInt3);
  }
  
  final void Z(int paramInt1, int paramInt2, int paramInt3)
  {
    this.Z.Code(paramInt1, paramInt2, paramInt3);
  }
  
  final boolean Z()
  {
    return this.J;
  }
  
  final boolean a()
  {
    boolean bool = true;
    if ((!this.J) || (this.I.Code()) || (this.Z.Code())) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      bk localbk1 = this.I;
      bk localbk2 = this.Z;
      int i;
      if ((localbk1.Code()) || (localbk2.Code())) {
        if (localbk1.Code() == localbk2.Code()) {
          i = 1;
        }
      }
      while (i != 0)
      {
        return false;
        i = 0;
        continue;
        if (localbk1.I(localbk2) == 0) {
          i = 1;
        } else {
          i = 0;
        }
      }
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     y
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */