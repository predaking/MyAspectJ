package com.example.lw.appweb;

final class bf
{
  private final k Code;
  private final bk I;
  private boolean Z = false;
  
  bf(k paramk)
  {
    this.Code = paramk;
    this.I = new bk(paramk);
  }
  
  final int Code()
  {
    return this.I.B();
  }
  
  final void Code(int paramInt)
  {
    this.I.Code(paramInt);
  }
  
  final void Code(int paramInt1, int paramInt2, int paramInt3)
  {
    this.I.Code(paramInt1, paramInt2, paramInt3);
  }
  
  final void Code(bk parambk)
  {
    this.I.Code(parambk);
  }
  
  final void Code(q paramq, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.Z) {
      return;
    }
    int k = this.I.B();
    int j = this.I.C();
    int i = this.I.a();
    paramInt1 = this.Code.a(k) + paramInt1;
    paramInt2 = this.Code.a(j) + paramInt2;
    i = this.Code.a(i);
    paramq.Z(paramInt1 - 1, paramInt2, 3, 1, paramInt3);
    paramq.Z(paramInt1, paramInt2, 1, i, paramInt3);
    paramq.Z(paramInt1 - 1, paramInt2 + i - 1, 3, 1, paramInt3);
  }
  
  final void Code(boolean paramBoolean)
  {
    this.Z = paramBoolean;
  }
  
  final int I()
  {
    return this.I.C();
  }
  
  final boolean I(int paramInt)
  {
    return this.I.I(paramInt);
  }
  
  final boolean J()
  {
    return this.Z;
  }
  
  final bk Z()
  {
    return this.I;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bf
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */