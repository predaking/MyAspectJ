package com.example.lw.appweb;

import java.io.DataInput;

public final class aj
  extends ac
{
  public int Code = -1;
  public byte[] I;
  
  public final byte Code()
  {
    return 0;
  }
  
  public final int Code(DataInput paramDataInput, int paramInt)
  {
    this.Code = paramDataInput.readInt();
    this.I = new byte[4];
    paramDataInput.readFully(this.I);
    return 0;
  }
  
  public final int I()
  {
    return -1;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     aj
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */