package com.example.lw.appweb;

import java.io.DataInput;

public final class n
  extends ac
{
  public int B = 0;
  public int[] Code = null;
  public byte I = 0;
  public boolean J;
  public byte Z = 0;
  
  public final byte Code()
  {
    return 4;
  }
  
  public final int Code(DataInput paramDataInput, int paramInt)
  {
    int i = 1;
    int j = paramDataInput.readUnsignedByte();
    this.I = ((byte)(j & 0x7));
    if ((j & 0x8) == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.J = bool;
      this.Z = ((byte)((j & 0x70) >> 4));
      this.B = paramDataInput.readInt();
      j = paramDataInput.readShort();
      this.Code = new int[j];
      this.Code[0] = (paramDataInput.readInt() + paramInt);
      paramInt = i;
      while (paramInt < j)
      {
        this.Code[paramInt] = (paramDataInput.readInt() + this.Code[(paramInt - 1)]);
        paramInt += 1;
      }
    }
    return this.Code[0];
  }
  
  protected final int I()
  {
    return -1;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     n
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */