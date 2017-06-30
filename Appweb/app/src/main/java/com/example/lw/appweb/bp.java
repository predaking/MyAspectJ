package com.example.lw.appweb;

import java.io.DataInput;

public final class bp
  extends ac
{
  public int Code = -1;
  public int I = -1;
  private int J = -1;
  public byte[] Z;
  
  public final byte Code()
  {
    return 1;
  }
  
  public final int Code(DataInput paramDataInput, int paramInt)
  {
    this.J = (paramDataInput.readInt() + paramInt);
    this.Code = paramDataInput.readUnsignedShort();
    this.I = paramDataInput.readUnsignedShort();
    if (this.Code > this.I) {}
    for (paramInt = this.Code;; paramInt = this.I)
    {
      this.Z = new byte[paramInt];
      paramDataInput.readFully(this.Z);
      return this.J;
    }
  }
  
  public final int I()
  {
    return this.J;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bp
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */