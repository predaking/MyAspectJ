package com.example.lw.appweb;

public final class ah
{
  private static short[] C = null;
  private static short[] a = null;
  private static short[] b = null;
  private static int[] c = null;
  private static int[] d = null;
  private int A;
  private int[] B;
  public int Code;
  private int D;
  private byte[][] E = new byte[3][];
  private int F;
  private int G;
  private int H;
  public int I;
  private int J;
  private int[] K = new int[6];
  private int[][] L = new int[16][];
  private int[][] M = new int[16][];
  private short[][] N = new short[16][];
  private byte[][] O = new byte[16][];
  private byte[][] P = new byte[16][];
  private short[] Q = new short[3];
  private int R;
  private int S;
  private int[] T = new int[3];
  private int[][] U = new int[4][];
  private int V = -1;
  private int W;
  int[] Z;
  private byte[] e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int[] l = new int[3];
  private int[] m = new int[3];
  private int[] n = new int[3];
  private int o;
  private int p;
  private int q;
  private int r;
  private int[] s = new int[3];
  private int t;
  private int[] u = new int[3];
  private int v;
  private int w;
  private int x;
  private int y;
  private int[] z = new int[3];
  
  public ah()
  {
    Code();
    this.h = 0;
    this.i = 0;
    this.k = 0;
    this.y = 0;
    while (i1 < 3)
    {
      this.E[i1] = null;
      this.L[i1] = null;
      this.M[i1] = null;
      this.N[i1] = null;
      this.O[i1] = null;
      this.P[i1] = null;
      i1 += 1;
    }
  }
  
  private int Code(int paramInt)
  {
    if (paramInt == 0) {
      return 0;
    }
    if (this.S < paramInt)
    {
      J();
      if (this.S < paramInt) {
        return -2;
      }
    }
    int i1 = this.R;
    this.R <<= paramInt;
    this.S -= paramInt;
    return i1 >>> 32 - paramInt;
  }
  
  private static int Code(int paramInt1, int paramInt2)
  {
    int i1 = paramInt2;
    if (paramInt2 < 1 << paramInt1 - 1) {
      i1 = (-1 << paramInt1) + paramInt2 + 1;
    }
    return i1;
  }
  
  /* Error */
  private static void Code()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: ldc 2
    //   4: monitorenter
    //   5: getstatic 65	ah:C	[S
    //   8: astore 4
    //   10: aload 4
    //   12: ifnonnull +287 -> 299
    //   15: aconst_null
    //   16: astore 5
    //   18: invokestatic 137	b:Z	()Ljava/io/DataInputStream;
    //   21: astore 4
    //   23: aload 4
    //   25: astore 5
    //   27: sipush 768
    //   30: newarray short
    //   32: putstatic 65	ah:C	[S
    //   35: aload 4
    //   37: astore 5
    //   39: sipush 256
    //   42: newarray short
    //   44: putstatic 67	ah:a	[S
    //   47: aload 4
    //   49: astore 5
    //   51: sipush 256
    //   54: newarray short
    //   56: putstatic 69	ah:b	[S
    //   59: aload 4
    //   61: astore 5
    //   63: bipush 64
    //   65: newarray int
    //   67: putstatic 71	ah:c	[I
    //   70: aload 4
    //   72: astore 5
    //   74: bipush 64
    //   76: newarray int
    //   78: putstatic 73	ah:d	[I
    //   81: iconst_0
    //   82: istore_1
    //   83: iconst_0
    //   84: istore_2
    //   85: iload_1
    //   86: sipush 768
    //   89: if_icmpge +258 -> 347
    //   92: aload 4
    //   94: astore 5
    //   96: getstatic 65	ah:C	[S
    //   99: astore 6
    //   101: aload 4
    //   103: astore 5
    //   105: iload_2
    //   106: aload 4
    //   108: invokevirtual 143	java/io/DataInputStream:readShort	()S
    //   111: iadd
    //   112: i2s
    //   113: istore_0
    //   114: aload 6
    //   116: iload_1
    //   117: iload_0
    //   118: sastore
    //   119: iload_1
    //   120: iconst_1
    //   121: iadd
    //   122: istore_1
    //   123: iload_0
    //   124: istore_2
    //   125: goto -40 -> 85
    //   128: iload_1
    //   129: sipush 256
    //   132: if_icmpge +222 -> 354
    //   135: aload 4
    //   137: astore 5
    //   139: getstatic 67	ah:a	[S
    //   142: astore 6
    //   144: aload 4
    //   146: astore 5
    //   148: iload_2
    //   149: aload 4
    //   151: invokevirtual 143	java/io/DataInputStream:readShort	()S
    //   154: iadd
    //   155: i2s
    //   156: istore_0
    //   157: aload 6
    //   159: iload_1
    //   160: iload_0
    //   161: sastore
    //   162: iload_1
    //   163: iconst_1
    //   164: iadd
    //   165: istore_1
    //   166: iload_0
    //   167: istore_2
    //   168: goto -40 -> 128
    //   171: iload_1
    //   172: sipush 256
    //   175: if_icmpge +186 -> 361
    //   178: aload 4
    //   180: astore 5
    //   182: getstatic 69	ah:b	[S
    //   185: astore 6
    //   187: aload 4
    //   189: astore 5
    //   191: iload_2
    //   192: aload 4
    //   194: invokevirtual 143	java/io/DataInputStream:readShort	()S
    //   197: iadd
    //   198: i2s
    //   199: istore_0
    //   200: aload 6
    //   202: iload_1
    //   203: iload_0
    //   204: sastore
    //   205: iload_1
    //   206: iconst_1
    //   207: iadd
    //   208: istore_1
    //   209: iload_0
    //   210: istore_2
    //   211: goto -40 -> 171
    //   214: iload_1
    //   215: bipush 64
    //   217: if_icmpge +151 -> 368
    //   220: aload 4
    //   222: astore 5
    //   224: getstatic 71	ah:c	[I
    //   227: astore 6
    //   229: aload 4
    //   231: astore 5
    //   233: iload_2
    //   234: aload 4
    //   236: invokevirtual 143	java/io/DataInputStream:readShort	()S
    //   239: iadd
    //   240: i2s
    //   241: istore_2
    //   242: aload 6
    //   244: iload_1
    //   245: iload_2
    //   246: iastore
    //   247: iload_1
    //   248: iconst_1
    //   249: iadd
    //   250: istore_1
    //   251: goto -37 -> 214
    //   254: iload_1
    //   255: bipush 64
    //   257: if_icmpge +37 -> 294
    //   260: aload 4
    //   262: astore 5
    //   264: getstatic 73	ah:d	[I
    //   267: astore 6
    //   269: aload 4
    //   271: astore 5
    //   273: iload_2
    //   274: aload 4
    //   276: invokevirtual 143	java/io/DataInputStream:readShort	()S
    //   279: iadd
    //   280: i2s
    //   281: istore_2
    //   282: aload 6
    //   284: iload_1
    //   285: iload_2
    //   286: iastore
    //   287: iload_1
    //   288: iconst_1
    //   289: iadd
    //   290: istore_1
    //   291: goto -37 -> 254
    //   294: aload 4
    //   296: invokestatic 146	b:Code	(Ljava/io/InputStream;)V
    //   299: ldc 2
    //   301: monitorexit
    //   302: return
    //   303: astore 4
    //   305: aload 5
    //   307: invokestatic 146	b:Code	(Ljava/io/InputStream;)V
    //   310: goto -11 -> 299
    //   313: astore 4
    //   315: ldc 2
    //   317: monitorexit
    //   318: aload 4
    //   320: athrow
    //   321: astore 4
    //   323: aconst_null
    //   324: astore 6
    //   326: aload 4
    //   328: astore 5
    //   330: aload 6
    //   332: invokestatic 146	b:Code	(Ljava/io/InputStream;)V
    //   335: aload 5
    //   337: athrow
    //   338: astore 5
    //   340: aload 4
    //   342: astore 6
    //   344: goto -14 -> 330
    //   347: iconst_0
    //   348: istore_1
    //   349: iconst_0
    //   350: istore_2
    //   351: goto -223 -> 128
    //   354: iconst_0
    //   355: istore_1
    //   356: iconst_0
    //   357: istore_2
    //   358: goto -187 -> 171
    //   361: iconst_0
    //   362: istore_1
    //   363: iconst_0
    //   364: istore_2
    //   365: goto -151 -> 214
    //   368: iconst_0
    //   369: istore_2
    //   370: iload_3
    //   371: istore_1
    //   372: goto -118 -> 254
    // Local variable table:
    //   start	length	slot	name	signature
    //   113	97	0	i1	int
    //   82	290	1	i2	int
    //   84	286	2	i3	int
    //   1	370	3	i4	int
    //   8	287	4	localObject1	Object
    //   303	1	4	localThrowable	java.lang.Throwable
    //   313	6	4	localObject2	Object
    //   321	20	4	localObject3	Object
    //   16	320	5	localObject4	Object
    //   338	1	5	localObject5	Object
    //   99	244	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   18	23	303	java/lang/Throwable
    //   27	35	303	java/lang/Throwable
    //   39	47	303	java/lang/Throwable
    //   51	59	303	java/lang/Throwable
    //   63	70	303	java/lang/Throwable
    //   74	81	303	java/lang/Throwable
    //   96	101	303	java/lang/Throwable
    //   105	114	303	java/lang/Throwable
    //   139	144	303	java/lang/Throwable
    //   148	157	303	java/lang/Throwable
    //   182	187	303	java/lang/Throwable
    //   191	200	303	java/lang/Throwable
    //   224	229	303	java/lang/Throwable
    //   233	242	303	java/lang/Throwable
    //   264	269	303	java/lang/Throwable
    //   273	282	303	java/lang/Throwable
    //   5	10	313	finally
    //   294	299	313	finally
    //   305	310	313	finally
    //   330	338	313	finally
    //   18	23	321	finally
    //   27	35	338	finally
    //   39	47	338	finally
    //   51	59	338	finally
    //   63	70	338	finally
    //   74	81	338	finally
    //   96	101	338	finally
    //   105	114	338	finally
    //   139	144	338	finally
    //   148	157	338	finally
    //   182	187	338	finally
    //   191	200	338	finally
    //   224	229	338	finally
    //   233	242	338	finally
    //   264	269	338	finally
    //   273	282	338	finally
  }
  
  private void Code(int paramInt1, short[] paramArrayOfShort, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int[] arrayOfInt = new int[64];
    int i2 = 0;
    int i3;
    int i5;
    int i7;
    int i8;
    int i6;
    int i4;
    int i11;
    int i9;
    int i10;
    if (i2 < 8)
    {
      if ((paramArrayOfShort[c[(i2 + 8)]] == 0) && (paramArrayOfShort[c[(i2 + 16)]] == 0) && (paramArrayOfShort[c[(i2 + 24)]] == 0) && (paramArrayOfShort[c[(i2 + 32)]] == 0) && (paramArrayOfShort[c[(i2 + 40)]] == 0) && (paramArrayOfShort[c[(i2 + 48)]] == 0) && (paramArrayOfShort[c[(i2 + 56)]] == 0))
      {
        i3 = paramArrayOfShort[c[i2]] * this.U[this.T[paramInt1]][i2];
        arrayOfInt[i2] = i3;
        arrayOfInt[(i2 + 8)] = i3;
        arrayOfInt[(i2 + 16)] = i3;
        arrayOfInt[(i2 + 24)] = i3;
        arrayOfInt[(i2 + 32)] = i3;
        arrayOfInt[(i2 + 40)] = i3;
        arrayOfInt[(i2 + 48)] = i3;
        arrayOfInt[(i2 + 56)] = i3;
      }
      for (;;)
      {
        i2 += 1;
        break;
        arrayOfInt[i2] = (paramArrayOfShort[c[i2]] * this.U[this.T[paramInt1]][i2]);
        arrayOfInt[(i2 + 8)] = (paramArrayOfShort[c[(i2 + 8)]] * this.U[this.T[paramInt1]][(i2 + 8)]);
        arrayOfInt[(i2 + 16)] = (paramArrayOfShort[c[(i2 + 16)]] * this.U[this.T[paramInt1]][(i2 + 16)]);
        arrayOfInt[(i2 + 24)] = (paramArrayOfShort[c[(i2 + 24)]] * this.U[this.T[paramInt1]][(i2 + 24)]);
        arrayOfInt[(i2 + 32)] = (paramArrayOfShort[c[(i2 + 32)]] * this.U[this.T[paramInt1]][(i2 + 32)]);
        arrayOfInt[(i2 + 40)] = (paramArrayOfShort[c[(i2 + 40)]] * this.U[this.T[paramInt1]][(i2 + 40)]);
        arrayOfInt[(i2 + 48)] = (paramArrayOfShort[c[(i2 + 48)]] * this.U[this.T[paramInt1]][(i2 + 48)]);
        arrayOfInt[(i2 + 56)] = (paramArrayOfShort[c[(i2 + 56)]] * this.U[this.T[paramInt1]][(i2 + 56)]);
        i5 = arrayOfInt[i2];
        i7 = arrayOfInt[(i2 + 32)];
        i3 = arrayOfInt[(i2 + 16)];
        i8 = arrayOfInt[(i2 + 48)];
        i6 = arrayOfInt[(i2 + 16)] + arrayOfInt[(i2 + 48)];
        i4 = i5 - i7;
        i8 = (i3 - i8 >> 8) * 362 - i6;
        i3 = i4 - i8;
        i4 = i8 + i4;
        i7 = i5 + i7;
        i5 = i7 - i6;
        i6 = i7 + i6;
        i11 = arrayOfInt[(i2 + 40)] - arrayOfInt[(i2 + 24)];
        i9 = arrayOfInt[(i2 + 8)] + arrayOfInt[(i2 + 56)];
        i10 = arrayOfInt[(i2 + 24)] + arrayOfInt[(i2 + 40)];
        i7 = i9 + i10;
        int i12 = arrayOfInt[(i2 + 8)] - arrayOfInt[(i2 + 56)];
        i8 = (i11 + i12 >> 8) * 196;
        i11 = -i11;
        i12 = (i12 >> 8) * 669 - i8 - i7;
        i9 = i12 - (i9 - i10 >> 8) * 362;
        i8 = (i11 >> 8) * 277 - i8 - i9;
        arrayOfInt[i2] = (i6 + i7);
        arrayOfInt[(i2 + 8)] = (i4 + i12);
        arrayOfInt[(i2 + 16)] = (i3 - i9);
        arrayOfInt[(i2 + 24)] = (i5 - i8);
        arrayOfInt[(i2 + 32)] = (i5 + i8);
        arrayOfInt[(i2 + 40)] = (i3 + i9);
        arrayOfInt[(i2 + 48)] = (i4 - i12);
        arrayOfInt[(i2 + 56)] = (i6 - i7);
      }
    }
    paramInt1 = 0;
    if (paramInt1 < 64)
    {
      if ((arrayOfInt[(paramInt1 + 1)] == 0) && (arrayOfInt[(paramInt1 + 2)] == 0) && (arrayOfInt[(paramInt1 + 3)] == 0) && (arrayOfInt[(paramInt1 + 4)] == 0) && (arrayOfInt[(paramInt1 + 5)] == 0) && (arrayOfInt[(paramInt1 + 6)] == 0) && (arrayOfInt[(paramInt1 + 7)] == 0))
      {
        int i1 = (byte)C[((arrayOfInt[paramInt1] + 1024 >> 11) + 128 + 256)];
        paramArrayOfByte[paramInt2] = i1;
        paramArrayOfByte[(paramInt2 + 1)] = i1;
        paramArrayOfByte[(paramInt2 + 2)] = i1;
        paramArrayOfByte[(paramInt2 + 3)] = i1;
        paramArrayOfByte[(paramInt2 + 4)] = i1;
        paramArrayOfByte[(paramInt2 + 5)] = i1;
        paramArrayOfByte[(paramInt2 + 6)] = i1;
        paramArrayOfByte[(paramInt2 + 7)] = i1;
      }
      for (;;)
      {
        paramInt2 += paramInt3;
        paramInt1 += 8;
        break;
        i4 = arrayOfInt[paramInt1];
        i6 = arrayOfInt[(paramInt1 + 4)];
        i2 = arrayOfInt[(paramInt1 + 2)];
        i7 = arrayOfInt[(paramInt1 + 6)];
        i5 = arrayOfInt[(paramInt1 + 2)] + arrayOfInt[(paramInt1 + 6)];
        i3 = i4 - i6;
        i7 = (i2 - i7 >> 8) * 362 - i5;
        i2 = i3 - i7;
        i3 = i7 + i3;
        i6 = i4 + i6;
        i4 = i6 - i5;
        i5 = i6 + i5;
        i10 = arrayOfInt[(paramInt1 + 5)] - arrayOfInt[(paramInt1 + 3)];
        i8 = arrayOfInt[(paramInt1 + 1)] + arrayOfInt[(paramInt1 + 7)];
        i9 = arrayOfInt[(paramInt1 + 3)] + arrayOfInt[(paramInt1 + 5)];
        i6 = i8 + i9;
        i11 = arrayOfInt[(paramInt1 + 1)] - arrayOfInt[(paramInt1 + 7)];
        i7 = (i10 + i11 >> 8) * 196;
        i10 = -i10;
        i11 = (i11 >> 8) * 669 - i7 - i6;
        i8 = i11 - (i8 - i9 >> 8) * 362;
        i7 = (i10 >> 8) * 277 - i7 - i8;
        paramArrayOfByte[paramInt2] = ((byte)C[((i5 + i6 + 1024 >> 11) + 128 + 256)]);
        paramArrayOfByte[(paramInt2 + 1)] = ((byte)C[((i3 + i11 + 1024 >> 11) + 128 + 256)]);
        paramArrayOfByte[(paramInt2 + 2)] = ((byte)C[((i2 - i8 + 1024 >> 11) + 128 + 256)]);
        paramArrayOfByte[(paramInt2 + 3)] = ((byte)C[((i4 - i7 + 1024 >> 11) + 128 + 256)]);
        paramArrayOfByte[(paramInt2 + 4)] = ((byte)C[((i4 + i7 + 1024 >> 11) + 128 + 256)]);
        paramArrayOfByte[(paramInt2 + 5)] = ((byte)C[((i8 + i2 + 1024 >> 11) + 128 + 256)]);
        paramArrayOfByte[(paramInt2 + 6)] = ((byte)C[((i3 - i11 + 1024 >> 11) + 128 + 256)]);
        paramArrayOfByte[(paramInt2 + 7)] = ((byte)C[((i5 - i6 + 1024 >> 11) + 128 + 256)]);
      }
    }
  }
  
  private void Code(boolean paramBoolean)
  {
    int i4 = this.o * 8;
    int i5 = i4 * this.F;
    int[] arrayOfInt2 = new int[3];
    int[] arrayOfInt3 = new int[3];
    int[] arrayOfInt4 = new int[3];
    int[] arrayOfInt5 = new int[3];
    if (this.k == 3)
    {
      arrayOfInt2[0] = 0;
      arrayOfInt3[0] = ((this.m[0] << 11) / this.o);
      arrayOfInt5[0] = ((this.n[0] << 11) / this.p);
      arrayOfInt2[1] = 0;
      arrayOfInt3[1] = ((this.m[1] << 11) / this.o);
      arrayOfInt5[1] = ((this.n[1] << 11) / this.p);
      arrayOfInt2[2] = 0;
      arrayOfInt3[2] = ((this.m[2] << 11) / this.o);
      arrayOfInt5[2] = ((this.n[2] << 11) / this.p);
    }
    int[] arrayOfInt1;
    label191:
    int i2;
    int i1;
    int i6;
    int i7;
    label326:
    label375:
    int i8;
    if (!paramBoolean)
    {
      this.W = this.G;
      if (!paramBoolean) {
        break label819;
      }
      arrayOfInt1 = this.B;
      i2 = 0;
      if (i2 >= i4) {
        return;
      }
      if ((i5 + i2 >= this.H) || (this.k != 3)) {
        break label1064;
      }
      i3 = (i5 + i2) * this.G;
      i1 = i3;
      if (paramBoolean)
      {
        i1 = this.s[0];
        i6 = this.A / this.D;
        i7 = this.p;
        if (this.V == -1) {
          this.V = (i3 + ((i1 + 1 & 0xFFFFFFFE) * 8 - (i6 + 1) * i7 * 8));
        }
        i1 = this.p * i2 * 8;
      }
      i6 = arrayOfInt2[0];
      if (!paramBoolean) {
        break label828;
      }
      i3 = this.n[0] * 8;
      i6 = (i6 >> 11) * i3;
      arrayOfInt2[0] += arrayOfInt3[0];
      arrayOfInt4[0] = 0;
      i7 = arrayOfInt2[1];
      if (!paramBoolean) {
        break label842;
      }
      i3 = this.n[1] * 8;
      i7 = (i7 >> 11) * i3;
      arrayOfInt2[1] += arrayOfInt3[1];
      arrayOfInt4[1] = 0;
      i8 = arrayOfInt2[2];
      if (!paramBoolean) {
        break label856;
      }
    }
    int i10;
    int i12;
    int i11;
    int i9;
    label819:
    label828:
    label842:
    label856:
    for (int i3 = this.n[2] * 8;; i3 = this.s[2] * 8)
    {
      i8 = (i8 >> 11) * i3;
      arrayOfInt2[2] += arrayOfInt3[2];
      arrayOfInt4[2] = 0;
      if ((this.n[0] != 2) || (this.n[1] != 1) || (this.n[2] != 1)) {
        break label1080;
      }
      i3 = 0;
      while (i3 < this.W >> 1)
      {
        i10 = this.E[0][((i3 << 1) + i6)] & 0xFF;
        i12 = this.E[1][(i7 + i3)] & 0xFF;
        int i13 = this.E[2][(i8 + i3)] & 0xFF;
        i11 = a[i13];
        i9 = b[i12];
        i12 = (i12 - 128) * 705 + (i13 - 128) * 1463 + 1024 >> 11;
        i13 = C[(i10 + i11 + 256)];
        int i14 = C[(i10 - i12 + 256)];
        int i15 = C[(i10 + i9 + 256)];
        i10 = i1 + 1;
        arrayOfInt1[i1] = (i15 | (i13 << 16 | i14 << 8));
        i1 = this.E[0][((i3 << 1) + i6 + 1)] & 0xFF;
        i11 = C[(i1 + i11 + 256)];
        i12 = C[(i1 - i12 + 256)];
        i9 = C[(i1 + i9 + 256)];
        i1 = i10 + 1;
        arrayOfInt1[i10] = (i11 << 16 | i12 << 8 | i9);
        i3 += 1;
      }
      if (this.A == 0) {}
      for (i1 = this.G % (this.p * 8);; i1 = this.p * 8)
      {
        this.W = i1;
        if (this.W != 0) {
          break;
        }
        this.W = (this.p * 8);
        break;
      }
      arrayOfInt1 = this.Z;
      break label191;
      i3 = this.s[0] * 8;
      break label326;
      i3 = this.s[1] * 8;
      break label375;
    }
    if (((this.G & 0x1) != 0) && (this.A == 0))
    {
      if (!paramBoolean) {
        break label1071;
      }
      i3 = this.p * 8;
      label899:
      i6 = this.E[0][(i6 + i3 - 1)] & 0xFF;
      i7 = this.E[1][(i7 + (i3 - 1 >> 1))] & 0xFF;
      i8 = this.E[2][((i3 - 1 >> 1) + i8)];
      i3 = C[(b[i7] + i6 + 256)];
      i8 = (i8 & 0xFF) - 128;
      i7 = C[(i6 - ((i7 - 128) * 705 + i8 * 1463 + 1024 >> 11) + 256)];
      arrayOfInt1[i1] = (C[(a[(i8 + 128)] + i6 + 256)] << 16 | i7 << 8 | i3);
    }
    for (;;)
    {
      label1064:
      i2 += 1;
      break;
      label1071:
      i3 = this.G;
      break label899;
      label1080:
      if ((this.n[0] == 1) && (this.n[1] == 1) && (this.n[2] == 1))
      {
        i3 = 0;
        while (i3 < this.W)
        {
          i9 = this.E[0][(i6 + i3)] & 0xFF;
          i10 = this.E[1][(i7 + i3)] & 0xFF;
          i12 = this.E[2][(i8 + i3)];
          i11 = C[(b[i10] + i9 + 256)];
          i12 = (i12 & 0xFF) - 128;
          arrayOfInt1[i1] = (C[(i9 - ((i10 - 128) * 705 + i12 * 1463 + 1024 >> 11) + 256)] << 8 | C[(i9 + a[(i12 + 128)] + 256)] << 16 | i11);
          i3 += 1;
          i1 += 1;
        }
      }
      else
      {
        i3 = 0;
        while (i3 < this.W)
        {
          i9 = arrayOfInt4[0];
          arrayOfInt4[0] += arrayOfInt5[0];
          i9 = this.E[0][((i9 >> 11) + i6)];
          i10 = arrayOfInt4[1];
          arrayOfInt4[1] += arrayOfInt5[1];
          i10 = this.E[1][((i10 >> 11) + i7)];
          i11 = arrayOfInt4[2];
          arrayOfInt4[2] += arrayOfInt5[2];
          i12 = this.E[2][((i11 >> 11) + i8)];
          i11 = C[(b[i10] + i9 + 256)];
          i12 -= 128;
          arrayOfInt1[i1] = (C[(i9 - ((i10 - 128) * 705 + i12 * 1463 + 1024 >> 11) + 256)] << 8 | C[(i9 + a[(i12 + 128)] + 256)] << 16 | i11);
          i3 += 1;
          i1 += 1;
        }
      }
    }
  }
  
  private int I(int paramInt)
  {
    if (this.S < 8)
    {
      J();
      if (this.S < 8) {
        return I(paramInt, 1);
      }
    }
    int i1 = this.R >>> 24;
    int i2 = this.P[paramInt][i1];
    if (i2 <= 8)
    {
      this.R <<= i2;
      this.S -= i2;
      return this.P[paramInt][(i1 + 256)] & 0xFF;
    }
    return I(paramInt, 9);
  }
  
  private int I(int paramInt1, int paramInt2)
  {
    int i1 = Code(paramInt2);
    int i2;
    if (i1 < 0)
    {
      return i1;
      i1 = i2 | i1 << 1;
      paramInt2 += 1;
    }
    for (;;)
    {
      if ((paramInt2 < 16) && (i1 > this.L[paramInt1][paramInt2]))
      {
        i2 = Code(1);
        if (i2 >= 0) {
          break;
        }
        return i2;
      }
      i2 = this.N[paramInt1][paramInt2];
      paramInt2 = this.M[paramInt1][paramInt2];
      return this.O[paramInt1][(i1 - paramInt2 + i2)] & 0xFF;
      paramInt2 -= 1;
    }
  }
  
  private void I()
  {
    if (this.t == 1)
    {
      i1 = this.u[this.v];
      this.A = (((this.n[i1] * this.G + this.p - 1) / this.p + 7) / 8);
      this.z[this.u[this.v]] = 0;
      return;
    }
    this.A = 0;
    int i1 = 0;
    while (i1 < this.t)
    {
      this.A += this.m[this.u[i1]] * this.n[this.u[i1]];
      this.z[this.u[i1]] = 0;
      i1 += 1;
    }
    this.D = this.A;
    this.A *= this.q / (this.p * 8);
  }
  
  private void J()
  {
    for (;;)
    {
      int i1;
      if ((this.S <= 24) && (this.g > 0))
      {
        i1 = this.e[this.f] & 0xFF;
        if (i1 != 255) {
          break label80;
        }
        if ((this.g >= 2) && (this.e[(this.f + 1)] == 0)) {}
      }
      else
      {
        return;
      }
      this.f += 1;
      this.g -= 1;
      label80:
      this.f += 1;
      this.g -= 1;
      int i2 = this.R;
      this.R = (i1 << 24 - this.S | i2);
      this.S += 8;
    }
  }
  
  private void Z()
  {
    int i1 = 0;
    while (i1 < 3)
    {
      this.Q[i1] = 0;
      i1 += 1;
    }
    this.R = 0;
    this.S = 0;
  }
  
  public final int Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.e = paramArrayOfByte;
    this.f = paramInt1;
    this.g = paramInt2;
    this.J = paramInt3;
    paramInt1 = 0;
    label23:
    while (paramInt1 == 0)
    {
      while (this.i > 0)
      {
        if (this.i >= this.g)
        {
          this.i -= this.g;
          paramInt2 = 0;
          label60:
          return paramInt2;
        }
        this.f += this.i;
        this.g -= this.i;
        this.i = 0;
      }
      switch (this.h)
      {
      default: 
        paramInt2 = paramInt1;
        paramInt1 = paramInt2;
        break;
      case 1: 
      case 2: 
        if (this.g >= 2) {
          break label4116;
        }
        return this.g;
      }
    }
    label144:
    label146:
    label4116:
    for (;;)
    {
      paramInt2 = paramInt1;
      if (this.g < 2) {
        break label146;
      }
      paramInt2 = paramInt1;
      if (paramInt1 != 0) {
        break label146;
      }
      paramInt2 = paramInt1;
      if (this.i != 0) {
        break label146;
      }
      if (this.h != 1)
      {
        paramInt2 = paramInt1;
        if (this.h != 2) {
          break label146;
        }
      }
      if ((this.e[this.f] & 0xFF) != 255)
      {
        this.f += 1;
        this.g -= 1;
      }
      else
      {
        int i2;
        int i1;
        int i6;
        int[] arrayOfInt1;
        int i4;
        int i3;
        int i5;
        switch (this.e[(this.f + 1)] & 0xFF)
        {
        default: 
          if (this.g < 4) {
            return this.g;
          }
        case 192: 
        case 193: 
          if (this.g < 4) {
            return this.g;
          }
          this.j = ((this.e[(this.f + 2)] & 0xFF) << 8 | this.e[(this.f + 3)] & 0xFF);
          if (this.g < 10) {
            return this.g;
          }
          this.f += 4;
          this.g -= 4;
          this.j -= 2;
          this.G = ((this.e[(this.f + 3)] & 0xFF) << 8 | this.e[(this.f + 4)] & 0xFF);
          this.H = ((this.e[(this.f + 1)] & 0xFF) << 8 | this.e[(this.f + 2)] & 0xFF);
          if (paramBoolean)
          {
            this.h = 0;
            return this.G << 16 | this.H;
          }
          this.Code = (this.G >> this.J);
          this.I = (this.H >> this.J);
          this.Z = new int[this.Code * this.I];
          this.k = (this.e[(this.f + 5)] & 0xFF);
          paramInt2 = 0;
          while (paramInt2 < 3)
          {
            this.K[(paramInt2 * 2)] = 0;
            this.K[(paramInt2 * 2 + 1)] = 4;
            paramInt2 += 1;
          }
          Z();
          this.f += 6;
          this.g -= 6;
          this.j -= 6;
          this.h = 3;
          break;
        case 218: 
          if (this.g < 4) {
            return this.g;
          }
          this.j = ((this.e[(this.f + 2)] & 0xFF) << 8 | this.e[(this.f + 3)] & 0xFF);
          if (this.g < this.j + 2) {
            return this.g;
          }
          this.t = (this.e[(this.f + 4)] & 0xFF);
          this.f += 5;
          this.g -= 5;
          this.j -= 3;
          paramInt3 = 0;
          while (paramInt3 < this.t)
          {
            i2 = this.e[this.f];
            this.u[paramInt3] = paramInt3;
            for (paramInt2 = 0; paramInt2 < this.k; paramInt2 = i1 + 1)
            {
              i1 = paramInt2;
              if ((i2 & 0xFF) == this.l[paramInt2])
              {
                this.u[paramInt3] = paramInt2;
                i1 = this.k;
              }
            }
            paramInt2 = this.e[(this.f + 1)] & 0xFF;
            this.K[(this.u[paramInt3] * 2)] = (paramInt2 >> 4);
            this.K[(this.u[paramInt3] * 2 + 1)] = ((paramInt2 & 0xF) + 4);
            this.f += 2;
            this.g -= 2;
            this.j -= 2;
            paramInt3 += 1;
          }
          Z();
          this.w = 0;
          this.v = 0;
          this.x = 0;
          this.F = 0;
          I();
          this.f += this.j;
          this.g -= this.j;
          this.h = 4;
          break;
        case 196: 
          if (this.g < 4) {
            paramInt1 = -2;
          }
          for (;;)
          {
            break;
            paramInt1 = (this.e[(this.f + 2)] & 0xFF) << 8 | this.e[(this.f + 3)] & 0xFF;
            if (this.g < paramInt1 + 2)
            {
              paramInt1 = -2;
            }
            else
            {
              paramInt3 = paramInt1 - 2;
              this.f += 4;
              this.g -= 4;
              while (paramInt3 > 0)
              {
                i6 = this.e[this.f] & 0xF | (this.e[this.f] & 0x10) >> 2;
                this.f += 1;
                this.g -= 1;
                i1 = 0;
                paramArrayOfByte = new short[16];
                paramInt2 = 0;
                paramInt1 = 0;
                while (paramInt1 < 16)
                {
                  paramArrayOfByte[paramInt1] = ((short)(this.e[(this.f + paramInt1)] & 0xFF));
                  paramInt2 += paramArrayOfByte[paramInt1];
                  paramInt1 += 1;
                }
                arrayOfInt1 = new int[paramInt2 + 1];
                int[] arrayOfInt2 = new int[paramInt2];
                paramInt1 = 0;
                while (paramInt1 < 16)
                {
                  paramInt2 = 1;
                  while (paramInt2 <= paramArrayOfByte[paramInt1])
                  {
                    arrayOfInt1[i1] = (paramInt1 + 1);
                    paramInt2 += 1;
                    i1 += 1;
                  }
                  paramInt1 += 1;
                }
                arrayOfInt1[i1] = 0;
                i4 = 0;
                paramInt1 = 0;
                i3 = arrayOfInt1[0];
                while (arrayOfInt1[i4] != 0)
                {
                  i2 = i4;
                  paramInt2 = paramInt1;
                  while (arrayOfInt1[i2] == i3)
                  {
                    arrayOfInt2[i2] = paramInt2;
                    paramInt2 += 1;
                    i2 += 1;
                  }
                  paramInt1 = paramInt2;
                  i4 = i2;
                  if (arrayOfInt1[i2] != 0)
                  {
                    i5 = i3;
                    for (;;)
                    {
                      i3 = i5;
                      paramInt1 = paramInt2;
                      i4 = i2;
                      if (arrayOfInt1[i2] == i5) {
                        break;
                      }
                      paramInt2 <<= 1;
                      i5 += 1;
                    }
                  }
                }
                this.M[i6] = new int[16];
                this.L[i6] = new int[16];
                this.N[i6] = new short[16];
                paramInt2 = 0;
                paramInt1 = 0;
                if (paramInt1 < 16)
                {
                  if (paramArrayOfByte[paramInt1] == 0) {
                    this.L[i6][paramInt1] = -1;
                  }
                  for (;;)
                  {
                    paramInt1 += 1;
                    break;
                    this.N[i6][paramInt1] = ((short)paramInt2);
                    this.M[i6][paramInt1] = arrayOfInt2[paramInt2];
                    paramInt2 += paramArrayOfByte[paramInt1] - 1;
                    this.L[i6][paramInt1] = arrayOfInt2[paramInt2];
                    paramInt2 += 1;
                  }
                }
                this.f += 16;
                this.g -= 16;
                this.O[i6] = new byte[i1];
                paramInt1 = 0;
                while (paramInt1 < i1)
                {
                  this.O[i6][paramInt1] = this.e[(this.f + paramInt1)];
                  paramInt1 += 1;
                }
                this.f += i1;
                this.g -= i1;
                this.P[i6] = new byte[512];
                paramInt1 = 0;
                while (paramInt1 < 256)
                {
                  this.P[i6][paramInt1] = 9;
                  paramInt1 += 1;
                }
                paramInt2 = 0;
                paramInt1 = 1;
                while (paramInt1 <= 8)
                {
                  i2 = 0;
                  while (i2 < paramArrayOfByte[(paramInt1 - 1)])
                  {
                    i4 = arrayOfInt2[paramInt2] << 8 - paramInt1;
                    i3 = 0;
                    while (i3 < 1 << 8 - paramInt1)
                    {
                      this.P[i6][(i4 | i3)] = ((byte)paramInt1);
                      this.P[i6][((i4 | i3) + 256)] = this.O[i6][paramInt2];
                      i3 += 1;
                    }
                    paramInt2 += 1;
                    i2 += 1;
                  }
                  paramInt1 += 1;
                }
                paramInt3 = paramInt3 - 1 - 16 - i1;
              }
              paramInt1 = 0;
            }
          }
        case 219: 
          if (this.g < 4) {
            paramInt1 = -2;
          }
          for (;;)
          {
            break;
            paramInt1 = (this.e[(this.f + 2)] & 0xFF) << 8 | this.e[(this.f + 3)] & 0xFF;
            if (this.g < paramInt1 + 2)
            {
              paramInt1 = -2;
            }
            else
            {
              this.f += 4;
              this.g -= 4;
              paramInt1 -= 2;
              while (paramInt1 > 0)
              {
                if ((this.e[this.f] & 0xF0) != 0) {}
                for (paramInt2 = 1;; paramInt2 = 0)
                {
                  paramInt3 = this.e[this.f] & 0xF;
                  this.f += 1;
                  this.g -= 1;
                  i1 = paramInt1 - 1;
                  this.U[paramInt3] = new int[64];
                  if (paramInt2 == 0) {
                    break label2083;
                  }
                  paramInt1 = 0;
                  while (paramInt1 < 64)
                  {
                    paramInt2 = c[paramInt1];
                    paramArrayOfByte = this.U[paramInt3];
                    i2 = this.e[(this.f + paramInt2 * 2)];
                    paramArrayOfByte[paramInt1] = ((this.e[(paramInt2 * 2 + this.f + 1)] & 0xFF | (i2 & 0xFF) << 8) * d[paramInt1]);
                    paramInt1 += 1;
                  }
                }
                this.f += 128;
                this.g -= 128;
                paramInt1 = i1 - 128;
                continue;
                paramInt1 = 0;
                while (paramInt1 < 64)
                {
                  paramInt2 = c[paramInt1];
                  this.U[paramInt3][paramInt1] = ((this.e[(paramInt2 + this.f)] & 0xFF) * d[paramInt1]);
                  paramInt1 += 1;
                }
                this.f += 64;
                this.g -= 64;
                paramInt1 = i1 - 64;
              }
              paramInt1 = 0;
            }
          }
        case 221: 
          if (this.g < 4) {
            return this.g;
          }
          this.i = ((this.e[(this.f + 2)] & 0xFF) << 8 | this.e[(this.f + 3)] & 0xFF);
          if (this.g < 6) {
            return this.g;
          }
          this.y = ((this.e[(this.f + 4)] & 0xFF) << 8 | this.e[(this.f + 5)] & 0xFF);
          this.x = 0;
          this.f += 6;
          this.g -= 6;
          this.i -= 4;
          break;
        case 217: 
          this.f += 2;
          this.g -= 2;
          this.h = 6;
          break;
        case 0: 
        case 255: 
          label2083:
          this.f += 1;
          this.g -= 1;
          continue;
          this.i = ((this.e[(this.f + 2)] & 0xFF) << 8 | this.e[(this.f + 3)] & 0xFF);
          this.f += 4;
          this.g -= 4;
          this.i -= 2;
          continue;
          if (this.g < this.k * 3) {
            return this.g;
          }
          paramInt2 = 0;
          while (paramInt2 < this.k)
          {
            this.l[paramInt2] = (this.e[this.f] & 0xFF);
            i1 = this.e[(this.f + 1)] & 0xFF;
            paramInt3 = i1 & 0xF;
            i1 >>>= 4;
            if (i1 > this.p) {
              this.p = i1;
            }
            if (paramInt3 > this.o) {
              this.o = paramInt3;
            }
            this.n[paramInt2] = i1;
            this.m[paramInt2] = paramInt3;
            this.T[paramInt2] = (this.e[(this.f + 2)] & 0xFF);
            this.f += 3;
            this.g -= 3;
            this.j -= 3;
            paramInt2 += 1;
          }
          if (this.j > 0) {
            this.i = this.j;
          }
          paramInt2 = 0;
          if (paramInt2 < this.k)
          {
            this.s[paramInt2] = (((this.G * this.n[paramInt2] + this.p - 1) / this.p + 7) / 8);
            if (this.J == 0) {
              this.E[paramInt2] = new byte[this.s[paramInt2] * 64 * this.m[paramInt2]];
            }
            for (;;)
            {
              paramInt2 += 1;
              break;
              this.E[paramInt2] = new byte[this.m[paramInt2] * 64 * this.n[paramInt2]];
            }
          }
          this.F = 0;
          if (this.k > 1)
          {
            this.q = (this.p * 8 * ((this.G + this.p * 8 - 1) / (this.p * 8)));
            this.r = (this.o * 8 * ((this.H + this.o * 8 - 1) / (this.o * 8)));
          }
          this.h = 2;
          break label23;
          if (((this.e[this.f] & 0xFF) == 255) && (this.e[(this.f + 1)] != 0)) {
            if (((this.e[(this.f + 1)] & 0xFF) >= 208) && ((this.e[(this.f + 1)] & 0xFF) <= 215))
            {
              this.h = 4;
              this.f += 2;
              this.g -= 2;
            }
          }
          while (this.h == 5)
          {
            if (this.g >= 2) {
              break label2831;
            }
            return this.g;
            this.h = 2;
            continue;
            this.f += 1;
            this.g -= 1;
          }
          paramArrayOfByte = new short[64];
          if ((this.J != 0) && (this.B == null)) {
            this.B = new int[this.o * this.p * 64];
          }
          label3267:
          label3533:
          label3818:
          label3823:
          do
          {
            i2 = this.u[this.v];
            paramInt1 = 0;
            while (paramInt1 < 64)
            {
              paramArrayOfByte[paramInt1] = 0;
              paramInt1 += 1;
            }
            i1 = this.g;
            i3 = this.R;
            i4 = this.S;
            paramInt2 = I(this.K[(i2 * 2)]);
            if (paramInt2 < 0)
            {
              this.f -= i1 - this.g;
              this.g = i1;
              this.R = i3;
              this.S = i4;
              paramInt1 = paramInt2;
              if (paramInt2 != 0) {
                break;
              }
              paramInt2 = this.z[i2] / (this.m[i2] * this.n[i2]);
              paramInt1 = this.z[i2] % (this.m[i2] * this.n[i2]);
              paramInt2 = paramInt2 * this.n[i2] + paramInt1 % this.n[i2];
              if (paramInt2 < this.s[i2])
              {
                if (this.J != 0) {
                  break label3717;
                }
                paramInt1 /= this.n[i2];
                paramInt3 = this.s[i2];
                Code(i2, paramArrayOfByte, this.E[i2], (paramInt2 + paramInt1 * paramInt3 * 8) * 8, this.s[i2] * 8);
              }
              arrayOfInt1 = this.z;
              arrayOfInt1[i2] += 1;
              this.A -= 1;
              if ((this.A % this.D != 0) || (this.J == 0)) {
                break label3823;
              }
              Code(true);
              paramInt1 = this.V;
              paramInt2 = this.G;
              i1 = this.V / this.G;
              paramInt3 = this.J;
              i3 = i1 >> this.J;
              paramInt3 = this.Code * i3 + (paramInt1 % paramInt2 >> paramInt3);
              paramInt2 = 0;
              paramInt1 = 0;
            }
            for (;;)
            {
              if ((paramInt1 >= this.o * 8 >> this.J) || (paramInt1 + i3 >= this.I)) {
                break label3818;
              }
              i1 = 0;
              for (;;)
              {
                if (i1 < this.W >> this.J)
                {
                  this.Z[(paramInt3 + i1)] = this.B[((i1 << this.J) + paramInt2)];
                  i1 += 1;
                  continue;
                  paramInt1 = Code(paramInt2);
                  if (paramInt1 < 0)
                  {
                    this.f -= i1 - this.g;
                    this.g = i1;
                    this.R = i3;
                    this.S = i4;
                    paramInt2 = paramInt1;
                    break;
                  }
                  paramArrayOfByte[0] = ((short)(Code(paramInt2, paramInt1) + this.Q[i2]));
                  i5 = this.K[(i2 * 2 + 1)];
                  paramInt1 = 1;
                  if (paramInt1 < 64)
                  {
                    paramInt2 = I(i5);
                    if (paramInt2 < 0)
                    {
                      this.f -= i1 - this.g;
                      this.g = i1;
                      this.R = i3;
                      this.S = i4;
                      break;
                    }
                    i6 = paramInt2 & 0xF;
                    paramInt3 = paramInt2 >> 4;
                    if (i6 == 0)
                    {
                      if (paramInt3 == 15) {
                        paramInt1 = paramInt3 + paramInt1;
                      }
                    }
                    else {
                      for (;;)
                      {
                        paramInt1 += 1;
                        break label3533;
                        paramInt2 = Code(i6);
                        if (paramInt2 < 0)
                        {
                          this.f -= i1 - this.g;
                          this.g = i1;
                          this.R = i3;
                          this.S = i4;
                          break;
                        }
                        paramInt3 += paramInt1;
                        paramInt1 = paramInt3;
                        if (paramInt3 >= 64) {
                          paramInt1 = 63;
                        }
                        paramArrayOfByte[paramInt1] = ((short)Code(i6, paramInt2));
                      }
                    }
                  }
                  this.Q[i2] = paramArrayOfByte[0];
                  paramInt2 = 0;
                  break;
                  paramInt2 = paramInt1 / this.n[i2];
                  paramInt3 = this.n[i2];
                  i1 = this.n[i2];
                  Code(i2, paramArrayOfByte, this.E[i2], paramInt2 * (paramInt3 * 64) + paramInt1 % i1 * 8, this.n[i2] * 8);
                  break label3267;
                }
              }
              paramInt3 += this.Code;
              paramInt2 += (this.p * 8 << this.J);
              paramInt1 += 1;
            }
            this.V = -1;
            if (this.A == 0)
            {
              if (this.J == 0) {
                Code(false);
              }
              this.F += 1;
              if (((this.t > 1) && (this.F >= this.r / (this.o * 8))) || ((this.t == 1) && (this.F >= ((this.m[i2] * this.H + this.o - 1) / this.o + 7) / 8)))
              {
                this.h = 2;
                paramInt1 = 0;
                break;
              }
              I();
            }
            this.w += 1;
            paramInt1 = this.w;
            paramInt2 = this.m[i2];
            if ((paramInt1 >= this.n[i2] * paramInt2) || (this.t == 1))
            {
              this.w = 0;
              this.v += 1;
              if (this.v >= this.t)
              {
                this.v = 0;
                this.x += 1;
              }
            }
          } while ((this.x != this.y) || (this.y <= 0));
          this.x = 0;
          Z();
          this.h = 5;
          paramInt1 = 0;
          break label23;
          return 0;
          if (this.g < 2) {
            return this.g;
          }
          this.f += 2;
          this.g -= 2;
          this.h = 1;
          break label144;
          paramInt2 = paramInt1;
          if (paramInt1 != -2) {
            break label60;
          }
          return this.g;
        }
      }
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ah
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */