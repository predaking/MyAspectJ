package com.example.lw.appweb;

import java.io.ByteArrayOutputStream;

public final class w
  extends ByteArrayOutputStream
{
  w() {}
  
  w(int paramInt)
  {
    super(paramInt);
  }
  
  final void Code(int paramInt)
  {
    this.count = paramInt;
  }
  
  public final byte[] Code()
  {
    return this.buf;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     w
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */