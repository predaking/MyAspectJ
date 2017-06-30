package com.example.lw.appweb.com.opera.mini.android;

import ap;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p;

public final class u
  extends Inflater
  implements p
{
  private byte[] Code;
  private int I;
  
  public u()
  {
    super(true);
  }
  
  public final void Code()
  {
    Code(new byte[32768]);
  }
  
  public final void Code(ap paramap) {}
  
  public final void Code(byte[] paramArrayOfByte)
  {
    this.Code = paramArrayOfByte;
    this.I = 0;
  }
  
  public final int I()
  {
    return this.I;
  }
  
  public final void end()
  {
    super.end();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.I = 0;
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      try
      {
        this.I = super.inflate(paramArrayOfByte, paramInt1, paramInt2);
        return this.I;
      }
      catch (DataFormatException paramArrayOfByte)
      {
        continue;
      }
      this.I = super.inflate(this.Code, paramInt1, paramInt2);
    }
  }
  
  public final void setInput(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    super.setInput(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.u
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */