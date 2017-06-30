package com.example.lw.appweb;

final class ae
{
  int B;
  int C;
  int[] Code = new int[1536];
  br[] I = new br[256];
  int J;
  br[] Z = new br[256];
  private int a;
  private int b;
  
  private boolean Code(br[] paramArrayOfbr, int paramInt, br parambr)
  {
    br localbr = paramArrayOfbr[paramInt];
    if (localbr != null)
    {
      this.b -= localbr.Z();
      paramArrayOfbr[paramInt] = null;
    }
    int i = parambr.Z();
    if (!I(i)) {
      return false;
    }
    paramArrayOfbr[paramInt] = parambr;
    this.b = (i + this.b);
    return true;
  }
  
  final void Code(int paramInt)
  {
    this.a = paramInt;
  }
  
  final void Code(int paramInt1, int paramInt2)
  {
    if (paramInt1 <= 0)
    {
      this.B = 0;
      this.C = 0;
      return;
    }
    this.B = Math.max(1, paramInt1 - paramInt2);
    this.C = paramInt2;
  }
  
  final void Code(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    br localbr;
    if (paramBoolean1)
    {
      localbr = this.Z[paramInt];
      if (localbr != null)
      {
        this.b -= localbr.Z();
        this.Z[paramInt] = null;
      }
    }
    if (paramBoolean2)
    {
      localbr = this.I[paramInt];
      if (localbr != null)
      {
        this.b -= localbr.Z();
        this.I[paramInt] = null;
      }
    }
  }
  
  final boolean Code(int paramInt1, int paramInt2, ae paramae, int paramInt3)
  {
    boolean bool = false;
    int i = Z(paramInt1);
    if (I(i, paramInt1))
    {
      br localbr = this.I[i];
      if (localbr != null)
      {
        paramInt1 = localbr.Z();
        paramae.I[paramInt3] = localbr;
        paramae.b += paramInt1;
        if (paramae.B > 0)
        {
          paramae.B += paramInt1;
          paramae.C -= paramInt1;
        }
      }
      if (paramInt2 == this.a)
      {
        localbr = this.Z[i];
        if (localbr != null)
        {
          paramInt1 = localbr.Z();
          paramae.Z[paramInt3] = localbr;
          paramae.b += paramInt1;
          if (paramae.B > 0)
          {
            paramae.B += paramInt1;
            paramae.C -= paramInt1;
          }
        }
      }
      if (paramae.C < 0) {
        paramae.C = 0;
      }
      paramae = paramae.Code;
      paramInt1 = paramInt3 * 6 + 2;
      paramInt2 = paramae[paramInt1];
      paramae[paramInt1] = (this.Code[(i * 6 + 2)] & 0x80000000 | paramInt2);
      bool = true;
    }
    return bool;
  }
  
  final boolean Code(int paramInt, boolean paramBoolean, br parambr1, br parambr2)
  {
    br[] arrayOfbr2;
    if (paramBoolean) {
      arrayOfbr2 = this.I;
    }
    for (br[] arrayOfbr1 = this.Z; !Code(arrayOfbr2, paramInt, parambr1); arrayOfbr1 = this.I)
    {
      return false;
      arrayOfbr2 = this.Z;
    }
    if (parambr2 != null) {
      Code(arrayOfbr1, paramInt, parambr2);
    }
    return true;
  }
  
  final boolean I(int paramInt)
  {
    if (this.B == 0) {}
    while (this.b + paramInt < this.B) {
      return true;
    }
    return false;
  }
  
  final boolean I(int paramInt1, int paramInt2)
  {
    return (paramInt1 < this.J) && (this.Code[(paramInt1 * 6 + 0)] == paramInt2);
  }
  
  final int Z(int paramInt)
  {
    return b.Code(this.Code, this.J, 6, paramInt);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ae
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */