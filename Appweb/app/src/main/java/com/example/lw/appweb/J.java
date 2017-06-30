package com.example.lw.appweb;

final class J
{
  private String B = null;
  private char[] C = null;
  private final k Code;
  private final int I;
  private final int J;
  private final int Z;
  private boolean a = false;
  
  J(k paramk, int paramInt1, int paramInt2, int paramInt3)
  {
    this.Code = paramk;
    this.I = paramInt1;
    this.Z = paramInt2;
    this.J = paramInt3;
  }
  
  private boolean B(J paramJ)
  {
    return this.Z < paramJ.Z;
  }
  
  private boolean C(J paramJ)
  {
    return this.J > paramJ.J;
  }
  
  static boolean Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return (paramInt1 < paramInt3 + paramInt4) && (paramInt1 + paramInt2 > paramInt3);
  }
  
  static boolean Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (!Code(paramInt2, paramInt4, paramInt6, paramInt8)) {}
    do
    {
      do
      {
        return true;
        if (paramInt1 >= paramInt5) {
          break;
        }
      } while (paramInt1 + paramInt3 != paramInt5);
      return false;
    } while (paramInt1 != paramInt5 + paramInt7);
    return false;
  }
  
  private boolean a(J paramJ)
  {
    return this.J < paramJ.J;
  }
  
  private boolean b(J paramJ)
  {
    return this.Z > paramJ.Z;
  }
  
  private J m()
  {
    return this.Code.B(this.I);
  }
  
  final int B()
  {
    return this.Code.Code(this.I + 8);
  }
  
  final int C()
  {
    return this.Code.I(this.I + 15);
  }
  
  final int Code()
  {
    return this.I;
  }
  
  final int Code(J paramJ)
  {
    return this.I - paramJ.I;
  }
  
  final int Code(boolean paramBoolean)
  {
    return a().length() - I(paramBoolean);
  }
  
  final boolean Code(int paramInt1, int paramInt2)
  {
    return b.Code(paramInt1, paramInt2, 1, 1, this.Z, this.J, J(), B());
  }
  
  final int I()
  {
    return this.Z;
  }
  
  final int I(boolean paramBoolean)
  {
    if (c())
    {
      if (paramBoolean) {
        return 1;
      }
      return 0;
    }
    if (paramBoolean) {
      return a().length() - 1;
    }
    return a().length();
  }
  
  final boolean I(J paramJ)
  {
    return Code(this.J, B(), paramJ.J, paramJ.B());
  }
  
  final int J()
  {
    return this.Code.I(this.I + 6);
  }
  
  final boolean J(J paramJ)
  {
    return b.Code(this.Z, this.J, J(), B(), paramJ.Z, paramJ.J, paramJ.J(), paramJ.B());
  }
  
  final int Z()
  {
    return this.J;
  }
  
  final boolean Z(J paramJ)
  {
    return Code(this.Z, this.J, J(), B(), paramJ.Z, paramJ.J, paramJ.J(), paramJ.B());
  }
  
  final String a()
  {
    if (this.B == null)
    {
      int i = this.I + 17;
      int j = this.Code.Z(i);
      i += 1;
      if (j > 0)
      {
        k localk = this.Code;
        int k = i + 1;
        switch (localk.Z(i))
        {
        }
        for (i = this.Code.I(k) + 2 + k;; i = k + 2)
        {
          j -= 1;
          break;
          this.a = true;
        }
      }
      this.B = this.Code.J(i);
    }
    return this.B;
  }
  
  final char[] b()
  {
    if (this.C == null) {
      this.C = a().toCharArray();
    }
    return this.C;
  }
  
  final boolean c()
  {
    boolean bool = false;
    if (!b.Code(a().charAt(0))) {
      bool = true;
    }
    return bool;
  }
  
  final boolean d()
  {
    if (this.B == null) {
      a();
    }
    return !this.a;
  }
  
  final J e()
  {
    return this.Code.Code(this.I, this.Z, this.J);
  }
  
  final J f()
  {
    int i = this.J;
    int j = B();
    for (J localJ = e(); localJ != null; localJ = localJ.e()) {
      if (localJ.J >= j + i) {
        return localJ;
      }
    }
    return null;
  }
  
  final J g()
  {
    int i = this.J;
    for (J localJ = m(); localJ != null; localJ = localJ.m()) {
      if (localJ.J + localJ.B() - 1 < i) {
        return localJ;
      }
    }
    return null;
  }
  
  final J h()
  {
    J localJ2 = m();
    J localJ1 = localJ2;
    if (localJ2 != null)
    {
      localJ1 = localJ2;
      if (!I(localJ2)) {
        localJ1 = null;
      }
    }
    return localJ1;
  }
  
  final J i()
  {
    J localJ2 = e();
    J localJ1;
    if (localJ2 != null) {
      if (localJ2.I(this))
      {
        localJ1 = localJ2;
        if (localJ2.b(this)) {}
      }
      else
      {
        if (!localJ2.C(this)) {
          break label39;
        }
        localJ1 = localJ2;
      }
    }
    label39:
    do
    {
      do
      {
        return localJ1;
        localJ2 = m();
        if (localJ2 == null) {
          break label76;
        }
        if (!localJ2.I(this)) {
          break;
        }
        localJ1 = localJ2;
      } while (localJ2.b(this));
      localJ1 = localJ2;
    } while (localJ2.C(this));
    label76:
    return null;
  }
  
  final J j()
  {
    J localJ2 = e();
    J localJ1;
    if (localJ2 != null) {
      if (localJ2.I(this))
      {
        localJ1 = localJ2;
        if (localJ2.B(this)) {}
      }
      else
      {
        if (!localJ2.C(this)) {
          break label39;
        }
        localJ1 = localJ2;
      }
    }
    label39:
    do
    {
      do
      {
        return localJ1;
        localJ2 = m();
        if (localJ2 == null) {
          break label76;
        }
        if (!localJ2.I(this)) {
          break;
        }
        localJ1 = localJ2;
      } while (localJ2.B(this));
      localJ1 = localJ2;
    } while (localJ2.C(this));
    label76:
    return null;
  }
  
  final J k()
  {
    J localJ2 = e();
    J localJ1;
    if (localJ2 != null) {
      if (localJ2.I(this))
      {
        localJ1 = localJ2;
        if (localJ2.B(this)) {}
      }
      else
      {
        if (!localJ2.a(this)) {
          break label39;
        }
        localJ1 = localJ2;
      }
    }
    label39:
    do
    {
      do
      {
        return localJ1;
        localJ2 = m();
        if (localJ2 == null) {
          break label76;
        }
        if (!localJ2.I(this)) {
          break;
        }
        localJ1 = localJ2;
      } while (localJ2.B(this));
      localJ1 = localJ2;
    } while (localJ2.a(this));
    label76:
    return null;
  }
  
  final J l()
  {
    J localJ2 = e();
    J localJ1;
    if (localJ2 != null) {
      if (localJ2.I(this))
      {
        localJ1 = localJ2;
        if (localJ2.b(this)) {}
      }
      else
      {
        if (!localJ2.a(this)) {
          break label39;
        }
        localJ1 = localJ2;
      }
    }
    label39:
    do
    {
      do
      {
        return localJ1;
        localJ2 = m();
        if (localJ2 == null) {
          break label76;
        }
        if (!localJ2.I(this)) {
          break;
        }
        localJ1 = localJ2;
      } while (localJ2.b(this));
      localJ1 = localJ2;
    } while (localJ2.a(this));
    label76:
    return null;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("offset=").append(this.I).append(" (\"");
    if (a().length() < 7) {}
    for (String str = a();; str = a().substring(0, 5) + "…") {
      return str + "\")";
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     J
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */