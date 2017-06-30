package com.example.lw.appweb;

public final class C
{
  private int Code;
  private int I;
  private int J;
  private int Z;
  
  public final void Code()
  {
    this.Code = 1;
    this.I = 0;
    this.Z = 0;
    this.J = 0;
  }
  
  public final void Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.J += paramInt2;
    while (paramInt2 > 0)
    {
      int i = this.Z;
      this.Z = (i + 1);
      if (i == 2775)
      {
        this.Code %= 65521;
        this.I %= 65521;
        this.Z = 0;
      }
      this.Code += (paramArrayOfByte[paramInt1] & 0xFF);
      this.I += this.Code;
      paramInt2 -= 1;
      paramInt1 += 1;
    }
  }
  
  public final byte[] I()
  {
    this.Code %= 65521;
    this.I %= 65521;
    int m = this.I << 16 | this.Code;
    int i = (byte)(m & 0xFF);
    int j = (byte)(m >>> 8 & 0xFF);
    int k = (byte)(m >>> 16 & 0xFF);
    return new byte[] { (byte)(m >>> 24 & 0xFF), k, j, i };
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     C
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */