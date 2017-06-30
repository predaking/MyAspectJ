package com.example.lw.appweb;

public final class bb
{
  public final int B;
  public final String C;
  public final int Code;
  public final int I;
  public final int J;
  public final String Z;
  public final String a;
  
  bb(int paramInt1, int paramInt2, String paramString1, int paramInt3, int paramInt4, String paramString2, String paramString3)
  {
    this.Code = paramInt1;
    this.I = paramInt2;
    this.Z = paramString1;
    this.J = paramInt3;
    this.B = paramInt4;
    this.C = paramString2;
    this.a = paramString3;
  }
  
  final boolean Code()
  {
    return (this.I & 0x1) != 0;
  }
  
  final boolean I()
  {
    return this.B == 0;
  }
  
  public final String Z()
  {
    return this.a + this.C.substring(0, 8);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append("{slot: ").append(this.Code).append(", flags: ").append(Integer.toBinaryString(this.I)).append(", domain: ").append(this.Z).append(":").append(this.J).append("/").append(this.B).append(", key: ");
    if ((this.C == null) || (this.C.length() == 0))
    {
      str = "<none>";
      localStringBuilder = localStringBuilder.append(str).append("...");
      if (!this.a.equals(this.Z)) {
        break label152;
      }
    }
    label152:
    for (String str = "";; str = ", clusterDomain: " + this.a)
    {
      return str + "}";
      str = this.C.substring(0, 8);
      break;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bb
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */