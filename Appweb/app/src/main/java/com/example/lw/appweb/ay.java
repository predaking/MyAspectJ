package com.example.lw.appweb;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;

final class ay
  extends Code
{
  int B;
  String C;
  int J;
  byte[] a;
  private String b;
  
  ay(String paramString1, String paramString2)
  {
    super(paramString1 + "/res/7.5.33361/" + paramString2);
  }
  
  protected final void Code(int paramInt, String paramString)
  {
    this.b = paramString;
    this.J = -1;
  }
  
  protected final boolean Code(String paramString1, String paramString2)
  {
    if (paramString1.equals("content-length")) {
      this.J = Integer.parseInt(paramString2);
    }
    for (;;)
    {
      return true;
      if (paramString1.equals("update-digest")) {
        this.C = paramString2;
      }
    }
  }
  
  protected final void I(DataInputStream paramDataInputStream)
  {
    if (this.J > 0)
    {
      arrayOfByte = new byte[1024];
      localByteArrayOutputStream = new ByteArrayOutputStream(this.J);
      while (this.B < this.J)
      {
        i = paramDataInputStream.read(arrayOfByte);
        if (i < 0) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
        this.B = (i + this.B);
      }
      this.a = localByteArrayOutputStream.toByteArray();
    }
    while (this.b != null)
    {
      byte[] arrayOfByte;
      ByteArrayOutputStream localByteArrayOutputStream;
      int i;
      return;
    }
    Code(0, "Invalid content length");
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ay
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */