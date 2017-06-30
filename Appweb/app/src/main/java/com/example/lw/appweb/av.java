package com.example.lw.appweb;

import java.io.DataInputStream;

class av
  extends t
{
  private String B;
  private boolean C;
  private String J;
  protected bc Z;
  private int a;
  private int b;
  private int c;
  
  av(String paramString1, int paramInt1, int paramInt2, String paramString2, boolean paramBoolean, int paramInt3, int paramInt4)
  {
    this(paramString1, paramInt1, I(paramInt2), paramString2, paramBoolean, paramInt3, paramInt4, 0);
  }
  
  av(String paramString1, int paramInt1, String paramString2, String paramString3, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramString1, paramInt1);
    this.J = paramString2;
    this.B = paramString3;
    this.C = paramBoolean;
    this.a = paramInt3;
    this.c = paramInt2;
    this.b = paramInt4;
  }
  
  protected final int Code(Exception paramException)
  {
    if ((this.Z != null) && (this.Z.k())) {
      return this.Z.m();
    }
    return super.Code(paramException);
  }
  
  protected void Code(DataInputStream paramDataInputStream)
  {
    g.I.B();
    if (this.I)
    {
      g.I.C();
      return;
    }
    g.Z.c(-1);
    g.Z.b(0);
    g.Z.b(0);
    Code(11);
    I(paramDataInputStream);
  }
  
  protected final String I(Exception paramException)
  {
    if ((this.Z != null) && (this.Z.k())) {}
    switch (this.Z.m())
    {
    default: 
      return super.I(paramException);
    case 0: 
      return "Unknown error";
    case 1: 
      return "Key expired";
    }
    return "Timeout";
  }
  
  protected final void I()
  {
    Object[] arrayOfObject = new Object[110];
    int[] arrayOfInt = new int[110];
    if (this.J == null) {
      this.J = "";
    }
    arrayOfObject[64] = this.J.getBytes();
    if (this.C)
    {
      i = 1;
      arrayOfInt[65] = i;
      if (this.B == null) {
        break label165;
      }
      i = 3;
      label58:
      arrayOfInt[29] = i;
      arrayOfObject[42] = this.B;
      arrayOfInt[37] = this.a;
      arrayOfObject[53] = this.Code;
      arrayOfInt[93] = this.c;
      arrayOfObject[97] = g.Code.ab();
      if (this.b == 0) {
        break label170;
      }
    }
    label165:
    label170:
    for (int i = this.b;; i = ba.Code(this.Code, null))
    {
      this.Z = ap.Code(arrayOfObject, arrayOfInt, i, true);
      try
      {
        if (!this.I) {
          Code(new DataInputStream(this.Z));
        }
        return;
      }
      finally
      {
        b.Code(this.Z);
      }
      i = 0;
      break;
      i = 1;
      break label58;
    }
  }
  
  public void run()
  {
    b.B();
    super.run();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     av
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */