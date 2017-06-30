package com.example.lw.appweb;

public final class u
{
  private byte[] Code = new byte[256];
  private int I = 0;
  private int Z = 0;
  
  public u(byte[] paramArrayOfByte)
  {
    int j = 0;
    while (j < 256)
    {
      this.Code[j] = ((byte)j);
      j += 1;
    }
    int m = 0;
    j = 0;
    while (k < 256)
    {
      m = m + (paramArrayOfByte[j] + this.Code[k]) & 0xFF;
      int i = this.Code[k];
      this.Code[k] = this.Code[m];
      this.Code[m] = i;
      j = (j + 1) % 32;
      k += 1;
    }
  }
  
  public final void Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int j = 0;
    while (j < paramInt2)
    {
      this.I = (this.I + 1 & 0xFF);
      this.Z = (this.Code[this.I] + this.Z & 0xFF);
      int i = this.Code[this.I];
      this.Code[this.I] = this.Code[this.Z];
      this.Code[this.Z] = i;
      paramArrayOfByte[(paramInt1 + j)] = ((byte)(paramArrayOfByte[(paramInt1 + j)] ^ this.Code[(this.Code[this.I] + this.Code[this.Z] & 0xFF)]));
      j += 1;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     u
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */