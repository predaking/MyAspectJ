package com.example.lw.appweb;

import java.io.DataInput;
import java.io.EOFException;
import java.io.InputStream;

final class bh
  extends InputStream
  implements DataInput
{
  private final InputStream Code;
  
  bh(InputStream paramInputStream)
  {
    this.Code = paramInputStream;
  }
  
  private int Code()
  {
    int i = this.Code.read();
    if (i == -1) {
      throw new EOFException();
    }
    return i;
  }
  
  private int I()
  {
    int j = Code();
    for (int i = j & 0x7F; (j & 0x80) != 0; i = i << 7 | j & 0x7F) {
      j = Code();
    }
    return i;
  }
  
  public final int read()
  {
    return this.Code.read();
  }
  
  public final boolean readBoolean()
  {
    return Code() != 0;
  }
  
  public final byte readByte()
  {
    return (byte)Code();
  }
  
  public final char readChar()
  {
    return (char)I();
  }
  
  public final double readDouble()
  {
    return 0.0D;
  }
  
  public final float readFloat()
  {
    return 0.0F;
  }
  
  public final void readFully(byte[] paramArrayOfByte)
  {
    if (this.Code.read(paramArrayOfByte) < paramArrayOfByte.length) {
      throw new EOFException();
    }
  }
  
  public final void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.Code.read(paramArrayOfByte, paramInt1, paramInt2) < paramInt2) {
      throw new EOFException();
    }
  }
  
  public final int readInt()
  {
    return I();
  }
  
  public final String readLine()
  {
    return null;
  }
  
  public final long readLong()
  {
    return -1L;
  }
  
  public final short readShort()
  {
    return (short)I();
  }
  
  public final String readUTF()
  {
    return null;
  }
  
  public final int readUnsignedByte()
  {
    return Code();
  }
  
  public final int readUnsignedShort()
  {
    return I();
  }
  
  public final int skipBytes(int paramInt)
  {
    return (int)skip(paramInt);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bh
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */