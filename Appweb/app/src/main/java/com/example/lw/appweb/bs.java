package com.example.lw.appweb;

import java.io.DataInput;

public final class bs
  extends ac
{
  private int B;
  public byte Code;
  public byte I;
  public int J;
  public boolean Z;
  
  public bs()
  {
    this.B = -1;
    this.I = 0;
    this.Code = 0;
    this.J = 0;
  }
  
  public bs(int paramInt1, byte paramByte1, boolean paramBoolean, byte paramByte2, int paramInt2)
  {
    this.B = paramInt1;
    this.Code = paramByte1;
    this.Z = paramBoolean;
    this.I = paramByte2;
    this.J = paramInt2;
  }
  
  public final byte Code()
  {
    return 2;
  }
  
  public final int Code(DataInput paramDataInput, int paramInt)
  {
    this.B = (paramDataInput.readInt() + paramInt);
    paramInt = paramDataInput.readUnsignedByte();
    this.Code = ((byte)(paramInt & 0x7));
    if ((paramInt & 0x8) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.Z = bool;
      this.I = ((byte)((paramInt & 0x70) >> 4));
      this.J = paramDataInput.readInt();
      return this.B;
    }
  }
  
  public final int I()
  {
    return this.B;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bs
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */