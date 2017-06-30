package com.example.lw.appweb;

import java.io.DataInputStream;

abstract class Code
  extends av
{
  Code(String paramString)
  {
    super(paramString, 0, null, null, true, 0, 0, 1);
  }
  
  protected final void Code(DataInputStream paramDataInputStream)
  {
    int i = 1;
    if (paramDataInputStream.readByte() != 1) {
      Code(0, "Unknown version");
    }
    do
    {
      return;
      int j = paramDataInputStream.readUnsignedShort();
      paramDataInputStream.readUTF();
      String str = paramDataInputStream.readUTF();
      if (j != 200)
      {
        Code(j, str);
        i = 0;
      }
    } while (i == 0);
    i = paramDataInputStream.readUnsignedShort();
    while (i > 0)
    {
      Code(paramDataInputStream.readUTF(), paramDataInputStream.readUTF());
      i -= 1;
    }
    i = paramDataInputStream.readByte();
    if (i == 0)
    {
      I(paramDataInputStream);
      return;
    }
    if (i == 6)
    {
      Code(0, paramDataInputStream.readUTF());
      return;
    }
    Code(0, "Bad data");
  }
  
  protected abstract boolean Code(String paramString1, String paramString2);
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     Code
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */