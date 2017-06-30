package com.example.lw.appweb;

public final class at
{
  private bq Code;
  private byte[] I = new byte[64];
  private byte[] Z = new byte[32];
  
  public final void Code(byte[] paramArrayOfByte, int paramInt)
  {
    this.Code = new bq(paramArrayOfByte, paramInt, 32);
  }
  
  public final void I(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    while (i < 64)
    {
      this.I[i] = 0;
      i += 1;
    }
    System.arraycopy(paramArrayOfByte, 0, this.I, 0, Math.min(64, paramInt));
    this.Code.Code(this.I, 0, 64);
    this.Code.I(this.Z, 0, 32);
  }
  
  public final void Z(byte[] paramArrayOfByte, int paramInt)
  {
    this.Code.Code(this.Z, 0, 32);
    this.Code.Code(this.I, 0, 64);
    this.Code.I(paramArrayOfByte, paramInt, 32);
    this.Code.Code(this.Z, 0, 32);
    this.Code.I(this.Z, 0, 32);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     at
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */