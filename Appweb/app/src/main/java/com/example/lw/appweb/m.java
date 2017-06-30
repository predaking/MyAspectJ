package com.example.lw.appweb;

import java.io.DataOutputStream;
import java.io.OutputStream;

final class m
  extends OutputStream
{
  private w Code;
  private DataOutputStream I;
  private int J;
  private String Z;
  
  public static m Code(int paramInt, String paramString)
  {
    m localm = new m();
    localm.Code = new w();
    localm.I = new DataOutputStream(localm.Code);
    localm.Z = paramString;
    localm.J = paramInt;
    return localm;
  }
  
  public static m Code(OutputStream paramOutputStream)
  {
    m localm = new m();
    localm.Code = new w();
    localm.I = new DataOutputStream(paramOutputStream);
    return localm;
  }
  
  final void Code(int paramInt)
  {
    this.I.writeByte(paramInt);
  }
  
  final void Code(long paramLong)
  {
    this.I.writeLong(paramLong);
  }
  
  final void I(int paramInt)
  {
    this.I.writeShort(paramInt);
  }
  
  final void Z(int paramInt)
  {
    this.I.writeInt(paramInt);
  }
  
  /* Error */
  public final void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 33	m:J	I
    //   4: invokestatic 57	g:a	(I)Ljava/lang/String;
    //   7: astore_1
    //   8: aload_0
    //   9: aload_0
    //   10: getfield 33	m:J	I
    //   13: aload_0
    //   14: getfield 31	m:Z	Ljava/lang/String;
    //   17: invokestatic 60	g:Code	(ILjava/lang/String;)Ljava/lang/String;
    //   20: putfield 31	m:Z	Ljava/lang/String;
    //   23: getstatic 65	j:Code	Lj;
    //   26: aload_1
    //   27: aload_0
    //   28: getfield 31	m:Z	Ljava/lang/String;
    //   31: aload_0
    //   32: getfield 22	m:Code	Lw;
    //   35: invokevirtual 68	w:Code	()[B
    //   38: aload_0
    //   39: getfield 22	m:Code	Lw;
    //   42: invokevirtual 72	w:size	()I
    //   45: invokevirtual 75	j:Code	(Ljava/lang/String;Ljava/lang/String;[BI)V
    //   48: aload_0
    //   49: getfield 29	m:I	Ljava/io/DataOutputStream;
    //   52: invokestatic 79	b:Code	(Ljava/io/OutputStream;)V
    //   55: aload_0
    //   56: aconst_null
    //   57: putfield 29	m:I	Ljava/io/DataOutputStream;
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 22	m:Code	Lw;
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield 31	m:Z	Ljava/lang/String;
    //   70: aload_0
    //   71: iconst_0
    //   72: putfield 33	m:J	I
    //   75: return
    //   76: astore_1
    //   77: aload_0
    //   78: getfield 29	m:I	Ljava/io/DataOutputStream;
    //   81: invokestatic 79	b:Code	(Ljava/io/OutputStream;)V
    //   84: aload_0
    //   85: aconst_null
    //   86: putfield 29	m:I	Ljava/io/DataOutputStream;
    //   89: aload_0
    //   90: aconst_null
    //   91: putfield 22	m:Code	Lw;
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 31	m:Z	Ljava/lang/String;
    //   99: aload_0
    //   100: iconst_0
    //   101: putfield 33	m:J	I
    //   104: return
    //   105: astore_1
    //   106: aload_0
    //   107: getfield 29	m:I	Ljava/io/DataOutputStream;
    //   110: invokestatic 79	b:Code	(Ljava/io/OutputStream;)V
    //   113: aload_0
    //   114: aconst_null
    //   115: putfield 29	m:I	Ljava/io/DataOutputStream;
    //   118: aload_0
    //   119: aconst_null
    //   120: putfield 22	m:Code	Lw;
    //   123: aload_0
    //   124: aconst_null
    //   125: putfield 31	m:Z	Ljava/lang/String;
    //   128: aload_0
    //   129: iconst_0
    //   130: putfield 33	m:J	I
    //   133: aload_1
    //   134: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	this	m
    //   7	20	1	str	String
    //   76	1	1	localIOException	java.io.IOException
    //   105	29	1	localObject	java.lang.Object
    // Exception table:
    //   from	to	target	type
    //   0	48	76	java/io/IOException
    //   0	48	105	finally
  }
  
  public final void flush()
  {
    this.I.flush();
  }
  
  public final void write(int paramInt)
  {
    this.I.write(paramInt);
  }
  
  public final void write(byte[] paramArrayOfByte)
  {
    this.I.write(paramArrayOfByte);
  }
  
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.I.write(paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     m
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */