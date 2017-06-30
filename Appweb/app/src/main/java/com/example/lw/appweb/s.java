package com.example.lw.appweb;

final class s
{
  final int B;
  final String Code;
  final String I;
  final String J;
  final int Z;
  
  s(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2)
  {
    this.Code = paramString1;
    this.I = paramString2;
    this.Z = paramInt1;
    this.J = paramString3;
    this.B = paramInt2;
  }
  
  public final String toString()
  {
    return "{" + this.Code + ", " + this.I + ", " + this.Z + ", " + this.J + "} -> slot " + this.B;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     s
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */