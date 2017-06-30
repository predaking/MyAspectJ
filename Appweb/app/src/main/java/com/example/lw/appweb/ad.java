package com.example.lw.appweb;

public final class ad
{
  private int B = 0;
  private ag[] C = new ag[10];
  private String Code;
  private bl I;
  private int J = 0;
  private Object[] Z = null;
  
  public ad(bl parambl)
  {
    this.I = parambl;
  }
  
  private String B()
  {
    Object localObject3 = null;
    if ((this.Code != null) && (!"".equals(this.Code))) {}
    for (Object localObject2 = this.Code;; localObject2 = null)
    {
      Object localObject1;
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (!"".equals(localObject2)) {}
      }
      else
      {
        localObject1 = this.I.Z();
      }
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (!"".equals(localObject1)) {}
      }
      else
      {
        localObject2 = Z();
        if (localObject2.length > 0) {
          localObject3 = localObject2[0];
        }
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          localObject2 = localObject3.I();
          localObject1 = localObject2;
          if (!((String)localObject2).endsWith("/")) {
            localObject1 = (String)localObject2 + "/";
          }
          localObject2 = (String)localObject1 + "OperaSavedPages/";
        }
      }
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (!"".equals(localObject2)) {}
      }
      else
      {
        localObject1 = "OperaSavedPages/";
      }
      this.Code = Code((String)localObject1);
      return this.Code;
    }
  }
  
  /* Error */
  private Object[] B(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iload_1
    //   6: aload_0
    //   7: getfield 24	ad:J	I
    //   10: if_icmpne +12 -> 22
    //   13: aload_0
    //   14: getfield 22	ad:Z	[Ljava/lang/Object;
    //   17: astore 4
    //   19: aload 4
    //   21: areturn
    //   22: iload_2
    //   23: invokestatic 79	ad:Code	(I)Z
    //   26: ifeq -7 -> 19
    //   29: aload_0
    //   30: iload_1
    //   31: putfield 24	ad:J	I
    //   34: aload_0
    //   35: aconst_null
    //   36: putfield 22	ad:Z	[Ljava/lang/Object;
    //   39: aload_0
    //   40: iload_1
    //   41: iload_2
    //   42: invokevirtual 82	ad:Code	(II)Ljava/lang/String;
    //   45: astore 4
    //   47: aload_0
    //   48: getfield 32	ad:I	Lbl;
    //   51: aload 4
    //   53: iconst_0
    //   54: iconst_1
    //   55: invokeinterface 85 4 0
    //   60: astore 4
    //   62: aload 4
    //   64: invokeinterface 90 1 0
    //   69: astore 5
    //   71: new 92	java/io/DataInputStream
    //   74: dup
    //   75: aload 5
    //   77: invokespecial 95	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   80: astore 7
    //   82: iconst_4
    //   83: newarray byte
    //   85: astore 6
    //   87: iload_3
    //   88: istore_1
    //   89: iload_1
    //   90: aload 7
    //   92: aload 6
    //   94: iload_1
    //   95: iconst_4
    //   96: iload_1
    //   97: isub
    //   98: invokevirtual 99	java/io/DataInputStream:read	([BII)I
    //   101: iadd
    //   102: istore_3
    //   103: iload_3
    //   104: istore_1
    //   105: iload_3
    //   106: iconst_4
    //   107: if_icmplt -18 -> 89
    //   110: aload 6
    //   112: iconst_0
    //   113: invokestatic 104	az:J	([BI)I
    //   116: istore_1
    //   117: iload_1
    //   118: ldc 105
    //   120: if_icmpeq +20 -> 140
    //   123: aload 7
    //   125: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   128: aload 5
    //   130: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   133: aload 4
    //   135: invokestatic 112	b:Code	(Lbu;)V
    //   138: aconst_null
    //   139: areturn
    //   140: aload 7
    //   142: iconst_3
    //   143: invokestatic 115	b:Code	(Ljava/io/InputStream;I)V
    //   146: aload 7
    //   148: invokevirtual 118	java/io/DataInputStream:read	()I
    //   151: istore_1
    //   152: iload_1
    //   153: iload_2
    //   154: if_icmpeq +20 -> 174
    //   157: aload 7
    //   159: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   162: aload 5
    //   164: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   167: aload 4
    //   169: invokestatic 112	b:Code	(Lbu;)V
    //   172: aconst_null
    //   173: areturn
    //   174: iload_2
    //   175: bipush 15
    //   177: if_icmpne +165 -> 342
    //   180: bipush 10
    //   182: istore_1
    //   183: aload 7
    //   185: iload_1
    //   186: invokestatic 115	b:Code	(Ljava/io/InputStream;I)V
    //   189: aload 7
    //   191: invokevirtual 121	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   194: astore 10
    //   196: aload 7
    //   198: invokevirtual 125	java/io/DataInputStream:readShort	()S
    //   201: istore_1
    //   202: iload_1
    //   203: newarray byte
    //   205: astore 6
    //   207: aload 7
    //   209: aload 6
    //   211: iconst_0
    //   212: iload_1
    //   213: invokevirtual 129	java/io/DataInputStream:readFully	([BII)V
    //   216: iload_1
    //   217: ifne +267 -> 484
    //   220: aconst_null
    //   221: astore 6
    //   223: aload 7
    //   225: invokevirtual 121	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   228: astore 9
    //   230: aload 7
    //   232: invokevirtual 121	java/io/DataInputStream:readUTF	()Ljava/lang/String;
    //   235: astore 8
    //   237: aload 8
    //   239: ifnull +242 -> 481
    //   242: aload 8
    //   244: invokevirtual 132	java/lang/String:length	()I
    //   247: ifle +234 -> 481
    //   250: aload 8
    //   252: iconst_0
    //   253: invokevirtual 136	java/lang/String:charAt	(I)C
    //   256: ifne +225 -> 481
    //   259: new 60	java/lang/StringBuilder
    //   262: dup
    //   263: invokespecial 61	java/lang/StringBuilder:<init>	()V
    //   266: aload 9
    //   268: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: aload 8
    //   273: iconst_1
    //   274: aload 8
    //   276: invokevirtual 132	java/lang/String:length	()I
    //   279: invokevirtual 139	java/lang/String:substring	(II)Ljava/lang/String;
    //   282: invokevirtual 65	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   288: astore 8
    //   290: iconst_3
    //   291: anewarray 4	java/lang/Object
    //   294: astore 9
    //   296: aload 9
    //   298: iconst_0
    //   299: aload 10
    //   301: aastore
    //   302: aload 9
    //   304: iconst_1
    //   305: aload 8
    //   307: aastore
    //   308: aload 9
    //   310: iconst_2
    //   311: aload 6
    //   313: aastore
    //   314: aload 7
    //   316: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   319: aload 5
    //   321: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   324: aload 4
    //   326: invokestatic 112	b:Code	(Lbu;)V
    //   329: aload 9
    //   331: astore 4
    //   333: aload_0
    //   334: aload 4
    //   336: putfield 22	ad:Z	[Ljava/lang/Object;
    //   339: aload 4
    //   341: areturn
    //   342: bipush 7
    //   344: istore_1
    //   345: goto -162 -> 183
    //   348: astore 4
    //   350: aconst_null
    //   351: astore 4
    //   353: aconst_null
    //   354: astore 5
    //   356: aconst_null
    //   357: astore 6
    //   359: aload 4
    //   361: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   364: aload 5
    //   366: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   369: aload 6
    //   371: invokestatic 112	b:Code	(Lbu;)V
    //   374: aconst_null
    //   375: astore 4
    //   377: goto -44 -> 333
    //   380: astore 6
    //   382: aconst_null
    //   383: astore 7
    //   385: aconst_null
    //   386: astore 5
    //   388: aconst_null
    //   389: astore 4
    //   391: aload 7
    //   393: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   396: aload 5
    //   398: invokestatic 109	b:Code	(Ljava/io/InputStream;)V
    //   401: aload 4
    //   403: invokestatic 112	b:Code	(Lbu;)V
    //   406: aload 6
    //   408: athrow
    //   409: astore 6
    //   411: aconst_null
    //   412: astore 7
    //   414: aconst_null
    //   415: astore 5
    //   417: goto -26 -> 391
    //   420: astore 6
    //   422: aconst_null
    //   423: astore 7
    //   425: goto -34 -> 391
    //   428: astore 6
    //   430: goto -39 -> 391
    //   433: astore 5
    //   435: aconst_null
    //   436: astore 7
    //   438: aconst_null
    //   439: astore 5
    //   441: aload 4
    //   443: astore 6
    //   445: aload 7
    //   447: astore 4
    //   449: goto -90 -> 359
    //   452: astore 6
    //   454: aconst_null
    //   455: astore 7
    //   457: aload 4
    //   459: astore 6
    //   461: aload 7
    //   463: astore 4
    //   465: goto -106 -> 359
    //   468: astore 6
    //   470: aload 4
    //   472: astore 6
    //   474: aload 7
    //   476: astore 4
    //   478: goto -119 -> 359
    //   481: goto -191 -> 290
    //   484: goto -261 -> 223
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	487	0	this	ad
    //   0	487	1	paramInt1	int
    //   0	487	2	paramInt2	int
    //   1	107	3	i	int
    //   3	337	4	localObject1	Object
    //   348	1	4	localThrowable1	Throwable
    //   351	126	4	localObject2	Object
    //   69	347	5	localInputStream	java.io.InputStream
    //   433	1	5	localThrowable2	Throwable
    //   439	1	5	localObject3	Object
    //   85	285	6	arrayOfByte	byte[]
    //   380	27	6	localObject4	Object
    //   409	1	6	localObject5	Object
    //   420	1	6	localObject6	Object
    //   428	1	6	localObject7	Object
    //   443	1	6	localObject8	Object
    //   452	1	6	localThrowable3	Throwable
    //   459	1	6	localObject9	Object
    //   468	1	6	localThrowable4	Throwable
    //   472	1	6	localObject10	Object
    //   80	395	7	localDataInputStream	java.io.DataInputStream
    //   235	71	8	str1	String
    //   228	102	9	localObject11	Object
    //   194	106	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   47	62	348	java/lang/Throwable
    //   47	62	380	finally
    //   62	71	409	finally
    //   71	82	420	finally
    //   82	87	428	finally
    //   89	103	428	finally
    //   110	117	428	finally
    //   140	152	428	finally
    //   183	216	428	finally
    //   223	237	428	finally
    //   242	290	428	finally
    //   290	296	428	finally
    //   62	71	433	java/lang/Throwable
    //   71	82	452	java/lang/Throwable
    //   82	87	468	java/lang/Throwable
    //   89	103	468	java/lang/Throwable
    //   110	117	468	java/lang/Throwable
    //   140	152	468	java/lang/Throwable
    //   183	216	468	java/lang/Throwable
    //   223	237	468	java/lang/Throwable
    //   242	290	468	java/lang/Throwable
    //   290	296	468	java/lang/Throwable
  }
  
  public static String Code(String paramString)
  {
    if (paramString == null) {
      str = null;
    }
    do
    {
      return str;
      str = paramString;
    } while (paramString.startsWith("file://"));
    String str = paramString;
    if (!paramString.startsWith("/")) {
      str = "/" + paramString;
    }
    return "file://" + str;
  }
  
  private static boolean Code(int paramInt)
  {
    return (paramInt == 15) || (paramInt == 16);
  }
  
  public static int c(String paramString)
  {
    if ((paramString.length() > ".obml".length() + 2) && (paramString.indexOf(".obml") == paramString.length() - ".obml".length() - 2))
    {
      paramString = paramString.substring(paramString.length() - 2);
      try
      {
        int i = Integer.parseInt(paramString);
        boolean bool = Code(i);
        if (bool) {
          return i;
        }
      }
      catch (Exception paramString) {}
    }
    return 0;
  }
  
  public static int d(String paramString)
  {
    if (c(paramString) == 0) {
      return 0;
    }
    paramString = paramString.substring(0, paramString.length() - ".obml".length() - 2);
    try
    {
      int i = Integer.parseInt(paramString);
      return i;
    }
    catch (Exception paramString) {}
    return 0;
  }
  
  public final boolean B(String paramString)
  {
    return this.I.Code(paramString);
  }
  
  public final long C(String paramString)
  {
    return this.I.I(paramString);
  }
  
  final int Code(byte[] paramArrayOfByte, String paramString)
  {
    return this.I.Code(paramArrayOfByte, paramString);
  }
  
  public final bu Code(String paramString, boolean paramBoolean, int paramInt)
  {
    return this.I.Code(paramString, paramBoolean, paramInt);
  }
  
  public final String Code(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (paramInt2 == -1) {
      i = 16;
    }
    String str2 = B();
    String str1 = str2;
    if (!str2.endsWith("/")) {
      str1 = str2 + "/";
    }
    return str1 + paramInt1 + ".obml" + i;
  }
  
  final void Code()
  {
    J(B());
  }
  
  public final void Code(String paramString1, String paramString2)
  {
    int i = this.C.length;
    if (this.B >= i)
    {
      arrayOfag = new ag[i + 5];
      i = 0;
      while (i < this.B)
      {
        arrayOfag[i] = this.C[i];
        i += 1;
      }
      this.C = arrayOfag;
    }
    ag[] arrayOfag = this.C;
    i = this.B;
    this.B = (i + 1);
    arrayOfag[i] = new ag(paramString1, paramString2);
  }
  
  public final String I()
  {
    return this.I.I();
  }
  
  final String I(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = B(paramInt1, paramInt2);
    if (arrayOfObject != null) {
      return (String)arrayOfObject[0];
    }
    return null;
  }
  
  final byte[] I(String paramString)
  {
    return this.I.J(paramString);
  }
  
  final boolean J(String paramString)
  {
    return this.I.C(paramString);
  }
  
  final byte[] J(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = B(paramInt1, paramInt2);
    if (arrayOfObject != null) {
      return (byte[])arrayOfObject[2];
    }
    return null;
  }
  
  final int[] J()
  {
    return this.I.J();
  }
  
  final String Z(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = B(paramInt1, paramInt2);
    if (arrayOfObject != null) {
      return (String)arrayOfObject[1];
    }
    return null;
  }
  
  final boolean Z(String paramString)
  {
    return this.I.B(paramString);
  }
  
  final ag[] Z()
  {
    try
    {
      this.I.Code();
      label9:
      return this.C;
    }
    catch (Throwable localThrowable)
    {
      break label9;
    }
  }
  
  final String a(String paramString)
  {
    if ((paramString != null) && (!"".equals(paramString)))
    {
      this.Code = paramString;
      return null;
    }
    this.Code = null;
    this.Code = B();
    String str = this.I.Z();
    paramString = str;
    if (str == null) {
      paramString = "";
    }
    return "" + paramString;
  }
  
  public final ag b(String paramString)
  {
    int i = 0;
    while (i < this.B)
    {
      ag localag = this.C[i];
      if (localag.Code(paramString)) {
        return localag;
      }
      i += 1;
    }
    return null;
  }
  
  final long e(String paramString)
  {
    return this.I.Z(paramString);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ad
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */