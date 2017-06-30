package com.example.lw.appweb;

import java.io.DataInputStream;

public final class r
{
  int[] Code;
  int[] I;
  public boolean Z;
  
  public final void Code(DataInputStream paramDataInputStream)
  {
    b.Code(paramDataInputStream, paramDataInputStream.readShort());
    int k = paramDataInputStream.readShort();
    this.Code = new int[k];
    this.I = new int[k];
    int j = k * 6 - 6;
    int i = 0;
    while (i < k)
    {
      paramDataInputStream.readShort();
      this.I[i] = paramDataInputStream.readInt();
      this.Code[i] = j;
      j += this.I[i] - 6;
      i += 1;
    }
    this.Z = true;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     r
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */