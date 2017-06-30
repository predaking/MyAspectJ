package com.example.lw.appweb;

final class bm
{
  static byte[] c = new byte[0];
  static long d;
  static boolean e;
  byte[] B;
  byte[] C = new byte[0];
  final int[] Code;
  long I;
  int[] J;
  int[] Z;
  byte[] a = new byte[8];
  byte[] b = new byte[32];
  private at f = new at();
  private int g;
  
  public bm(int[] paramArrayOfInt)
  {
    this.Code = paramArrayOfInt;
  }
  
  private boolean Code(long paramLong)
  {
    return (this.I < paramLong) || (this.I - 1814400000L > paramLong);
  }
  
  /* Error */
  final int Code(ap paramap)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 49	bm:B	[B
    //   6: astore_3
    //   7: aload_3
    //   8: ifnonnull +9 -> 17
    //   11: iconst_m1
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ireturn
    //   17: aload_1
    //   18: getfield 53	ap:I	[B
    //   21: astore_3
    //   22: aload_3
    //   23: iconst_0
    //   24: aload_0
    //   25: getfield 55	bm:g	I
    //   28: bipush 16
    //   30: ishr
    //   31: i2b
    //   32: bastore
    //   33: aload_3
    //   34: iconst_1
    //   35: aload_0
    //   36: getfield 55	bm:g	I
    //   39: sipush 255
    //   42: iand
    //   43: i2b
    //   44: bastore
    //   45: aload_0
    //   46: getfield 33	bm:f	Lat;
    //   49: aload_3
    //   50: iconst_2
    //   51: invokevirtual 58	at:I	([BI)V
    //   54: aload_0
    //   55: getfield 33	bm:f	Lat;
    //   58: aload_3
    //   59: iconst_0
    //   60: invokevirtual 60	at:Z	([BI)V
    //   63: aload_1
    //   64: new 62	bq
    //   67: dup
    //   68: aload_3
    //   69: iconst_0
    //   70: bipush 32
    //   72: invokespecial 65	bq:<init>	([BII)V
    //   75: putfield 68	ap:J	Lbq;
    //   78: aload_1
    //   79: getfield 68	ap:J	Lbq;
    //   82: aload_0
    //   83: getfield 37	bm:a	[B
    //   86: iconst_0
    //   87: bipush 8
    //   89: invokevirtual 70	bq:Code	([BII)V
    //   92: aload_0
    //   93: getfield 33	bm:f	Lat;
    //   96: aload_3
    //   97: iconst_0
    //   98: invokevirtual 60	at:Z	([BI)V
    //   101: aload_1
    //   102: new 62	bq
    //   105: dup
    //   106: aload_3
    //   107: iconst_0
    //   108: bipush 32
    //   110: invokespecial 65	bq:<init>	([BII)V
    //   113: putfield 72	ap:B	Lbq;
    //   116: aload_1
    //   117: getfield 72	ap:B	Lbq;
    //   120: aload_0
    //   121: getfield 37	bm:a	[B
    //   124: iconst_0
    //   125: bipush 8
    //   127: invokevirtual 70	bq:Code	([BII)V
    //   130: aload_0
    //   131: getfield 33	bm:f	Lat;
    //   134: aload_3
    //   135: iconst_0
    //   136: invokevirtual 60	at:Z	([BI)V
    //   139: aload_1
    //   140: new 74	u
    //   143: dup
    //   144: aload_3
    //   145: invokespecial 77	u:<init>	([B)V
    //   148: putfield 80	ap:C	Lu;
    //   151: aload_1
    //   152: getfield 80	ap:C	Lu;
    //   155: aload_3
    //   156: iconst_0
    //   157: sipush 1024
    //   160: invokevirtual 81	u:Code	([BII)V
    //   163: aload_0
    //   164: getfield 33	bm:f	Lat;
    //   167: aload_3
    //   168: iconst_0
    //   169: invokevirtual 60	at:Z	([BI)V
    //   172: aload_1
    //   173: new 74	u
    //   176: dup
    //   177: aload_3
    //   178: invokespecial 77	u:<init>	([B)V
    //   181: putfield 83	ap:a	Lu;
    //   184: aload_1
    //   185: getfield 83	ap:a	Lu;
    //   188: aload_3
    //   189: iconst_0
    //   190: sipush 1024
    //   193: invokevirtual 81	u:Code	([BII)V
    //   196: aload_0
    //   197: getfield 55	bm:g	I
    //   200: istore_2
    //   201: aload_0
    //   202: iload_2
    //   203: iconst_1
    //   204: iadd
    //   205: putfield 55	bm:g	I
    //   208: goto -195 -> 13
    //   211: astore_1
    //   212: aload_0
    //   213: monitorexit
    //   214: aload_1
    //   215: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	this	bm
    //   0	216	1	paramap	ap
    //   12	193	2	i	int
    //   6	183	3	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   2	7	211	finally
    //   17	208	211	finally
  }
  
  final void Code()
  {
    try
    {
      this.J = null;
      this.Z = null;
      this.B = null;
      System.arraycopy(this.b, 0, this.a, 0, 8);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final boolean I()
  {
    if (!b.D) {}
    long l;
    do
    {
      return false;
      l = System.currentTimeMillis();
    } while ((!Code(l)) || (!Code(l - d)));
    return true;
  }
  
  final void Z()
  {
    int j = 2;
    int k = 0;
    label104:
    do
    {
      for (;;)
      {
        try
        {
          if ((I()) || (this.J == null))
          {
            Code();
            return;
          }
          if (this.Z == null) {
            break;
          }
          z localz = new z();
          arrayOfByte = b.Code(c.Code(this.Z, this.Code));
          if ((arrayOfByte[0] != 0) || (arrayOfByte[1] != 1) || (arrayOfByte[(arrayOfByte.length - 32 - 1)] != 0))
          {
            Code();
            continue;
          }
          i = 2;
        }
        finally {}
        if (i < arrayOfByte.length - 32 - 2)
        {
          if (arrayOfByte[i] == -1) {
            break label383;
          }
          Code();
        }
        else
        {
          localObject.Code((int)(this.I >> 32));
          localObject.Code((int)this.I);
          localObject.Code(b.Code(this.J), 0, this.J.length * 4);
          localObject.Code(arrayOfByte);
          i = k;
          if (i < 32)
          {
            if (arrayOfByte[i] == arrayOfByte[(arrayOfByte.length + i - 32)]) {
              break label390;
            }
            Code();
          }
          else
          {
            this.Z = null;
            if (b.K[1] != null) {
              b.C("md");
            }
          }
        }
      }
    } while (this.B != null);
    label183:
    at localat = b.I(this.b);
    byte[] arrayOfByte = new byte[this.J.length * 4];
    int i = j;
    for (;;)
    {
      if (i < arrayOfByte.length - 32) {
        while (arrayOfByte[i] == 0) {
          localat.Z(arrayOfByte, i);
        }
      }
      arrayOfByte[0] = 0;
      arrayOfByte[1] = 2;
      arrayOfByte[(arrayOfByte.length - 32 - 1)] = 0;
      localat.Z(arrayOfByte, arrayOfByte.length - 32);
      this.f.Code(arrayOfByte, arrayOfByte.length - 32);
      localat.Code(arrayOfByte, arrayOfByte.length - 32);
      this.B = b.Code(c.Code(b.Code(arrayOfByte, 0, arrayOfByte.length), this.J));
      this.g = 0;
      break;
      label383:
      i += 1;
      break label104;
      label390:
      i += 1;
      break label183;
      i += 1;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bm
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */