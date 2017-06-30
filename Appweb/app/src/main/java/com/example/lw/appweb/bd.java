package com.example.lw.appweb;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;

public final class bd
  extends InputStream
{
  public DataInputStream Code;
  public int I;
  private int Z;
  
  public static bd Code(int paramInt)
  {
    int i = -1;
    bd localbd = new bd();
    int j = paramInt & 0x7FFF;
    localbd.Code = new DataInputStream(new ByteArrayInputStream(g.d()));
    r localr = g.c();
    paramInt = localbd.Code.readShort();
    b.Code(localbd.Code, paramInt);
    localbd.Code.readShort();
    if (localr.Z) {}
    for (paramInt = localr.Code[j];; paramInt = -1)
    {
      if (localr.Z) {
        i = localr.I[j];
      }
      localbd.I = i;
      b.Code(localbd.Code, paramInt + (j * 6 + 6));
      return localbd;
    }
  }
  
  public static bd Code(InputStream paramInputStream, int paramInt)
  {
    bd localbd = new bd();
    localbd.Code = new DataInputStream(paramInputStream);
    localbd.I = paramInt;
    return localbd;
  }
  
  public final int Code()
  {
    if (this.Z == this.I) {
      throw new EOFException();
    }
    this.Z += 1;
    return this.Code.readByte();
  }
  
  public final int I()
  {
    if (this.Z + 2 > this.I) {
      throw new EOFException();
    }
    this.Z += 2;
    return this.Code.readShort();
  }
  
  public final int I(int paramInt)
  {
    int i = Math.min(paramInt, this.I - this.Z);
    b.Code(this.Code, i);
    this.Z += i;
    if (paramInt != i) {
      throw new EOFException();
    }
    return paramInt;
  }
  
  public final long J()
  {
    if (this.Z + 8 > this.I) {
      throw new EOFException();
    }
    this.Z += 8;
    return this.Code.readLong();
  }
  
  public final int Z()
  {
    if (this.Z + 4 > this.I) {
      throw new EOFException();
    }
    this.Z += 4;
    return this.Code.readInt();
  }
  
  public final void close()
  {
    b.Code(this.Code);
    this.Code = null;
  }
  
  public final int read()
  {
    int i = this.Code.read();
    if (i < 0) {
      return -1;
    }
    this.Z += 1;
    return i;
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((this.Z == this.I) && (paramInt2 > 0)) {
      throw new EOFException();
    }
    paramInt1 = this.Code.read(paramArrayOfByte, paramInt1, Math.min(paramInt2, this.I - this.Z));
    if (paramInt1 < 0) {
      throw new EOFException();
    }
    this.Z += paramInt1;
    return paramInt1;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bd
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */