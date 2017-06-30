package com.example.lw.appweb.com.opera.mini.android;

import al;

public class a
  implements al
{
  private long Code;
  private int I;
  private int Z;
  
  private native boolean Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private native boolean Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt);
  
  public final long Code()
  {
    return this.Code;
  }
  
  public final boolean Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[2];
    if (!Code(paramArrayOfByte, paramInt1, paramInt2, arrayOfInt)) {}
    do
    {
      return false;
      this.I = arrayOfInt[0];
      this.Z = arrayOfInt[1];
    } while (this.I * this.Z == 0);
    return Code(paramArrayOfByte, paramInt1, paramInt2, this.I, this.Z);
  }
  
  public final int I()
  {
    return this.I;
  }
  
  public final int Z()
  {
    return this.Z;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.a
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */