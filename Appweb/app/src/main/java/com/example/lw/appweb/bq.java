package com.example.lw.appweb;

public final class bq
{
  private z Code = new z();
  private byte[] I = new byte[64];
  private byte[] J = new byte[32];
  private byte[] Z = new byte[64];
  
  public bq(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    int j = paramInt1;
    int i = paramInt2;
    if (paramInt2 > 64)
    {
      this.Code.Code(paramArrayOfByte, paramInt1, paramInt2);
      arrayOfByte = new byte[64];
      this.Code.Code(arrayOfByte);
      this.Code.Code();
      i = 64;
      j = 0;
    }
    System.arraycopy(arrayOfByte, j, this.I, 0, i);
    System.arraycopy(arrayOfByte, j, this.Z, 0, i);
    paramInt1 = 0;
    while (paramInt1 < 64)
    {
      paramArrayOfByte = this.Z;
      paramArrayOfByte[paramInt1] = ((byte)(paramArrayOfByte[paramInt1] ^ 0x36));
      paramArrayOfByte = this.I;
      paramArrayOfByte[paramInt1] = ((byte)(paramArrayOfByte[paramInt1] ^ 0x5C));
      paramInt1 += 1;
    }
    this.Code.Code(this.Z, 0, 64);
  }
  
  public final void Code(int paramInt)
  {
    this.Code.Code(paramInt);
  }
  
  public final void Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.Code.Code(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.Code.Code(this.J);
    this.Code.Code(this.I, 0, 64);
    this.Code.Code(this.J, 0, 32);
    this.Code.Code(this.J);
    System.arraycopy(this.J, 0, paramArrayOfByte, paramInt1, paramInt2);
    this.Code.Code(this.Z, 0, 64);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bq
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */