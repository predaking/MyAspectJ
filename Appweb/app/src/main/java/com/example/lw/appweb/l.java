package com.example.lw.appweb;

import java.util.Enumeration;
import java.util.Vector;

public final class l
{
  private String B;
  private Enumeration C;
  Vector Code;
  int I = 0;
  private String J;
  private ad Z;
  private bu a;
  
  public l(ad paramad, String paramString1, String paramString2)
  {
    paramString1 = ad.Code(paramString1);
    this.Z = paramad;
    this.J = paramString1;
    this.B = paramString2;
    I();
  }
  
  private static void Code(Vector paramVector, Object paramObject)
  {
    String str = ((String)((Object[])paramObject)[2]).toLowerCase();
    int i = paramVector.size() - 1;
    if ((i < 0) || (str.compareTo(((String)((Object[])paramVector.lastElement())[2]).toLowerCase()) >= 0))
    {
      paramVector.addElement(paramObject);
      return;
    }
    while ((i > 0) && (str.compareTo(((String)((Object[])paramVector.elementAt(i - 1))[2]).toLowerCase()) < 0)) {
      i -= 1;
    }
    paramVector.insertElementAt(paramObject, i);
  }
  
  /* Error */
  private void I()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield 23	l:I	I
    //   5: aload_0
    //   6: getfield 32	l:J	Ljava/lang/String;
    //   9: ldc 75
    //   11: invokevirtual 79	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   14: ifne +29 -> 43
    //   17: aload_0
    //   18: new 81	java/lang/StringBuilder
    //   21: dup
    //   22: invokespecial 82	java/lang/StringBuilder:<init>	()V
    //   25: aload_0
    //   26: getfield 32	l:J	Ljava/lang/String;
    //   29: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: ldc 75
    //   34: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: putfield 32	l:J	Ljava/lang/String;
    //   43: aload_0
    //   44: getfield 32	l:J	Ljava/lang/String;
    //   47: ldc 91
    //   49: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   52: ifne +15 -> 67
    //   55: aload_0
    //   56: getfield 32	l:J	Ljava/lang/String;
    //   59: ldc 97
    //   61: invokevirtual 95	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   64: ifeq +8 -> 72
    //   67: aload_0
    //   68: invokespecial 99	l:Z	()V
    //   71: return
    //   72: aload_0
    //   73: getstatic 104	g:c	Lad;
    //   76: aload_0
    //   77: getfield 32	l:J	Ljava/lang/String;
    //   80: iconst_0
    //   81: iconst_1
    //   82: invokevirtual 107	ad:Code	(Ljava/lang/String;ZI)Lbu;
    //   85: putfield 109	l:a	Lbu;
    //   88: aload_0
    //   89: aload_0
    //   90: getfield 109	l:a	Lbu;
    //   93: aload_0
    //   94: getfield 34	l:B	Ljava/lang/String;
    //   97: invokeinterface 114 2 0
    //   102: putfield 116	l:C	Ljava/util/Enumeration;
    //   105: aload_0
    //   106: getfield 109	l:a	Lbu;
    //   109: invokestatic 121	b:Code	(Lbu;)V
    //   112: aload_0
    //   113: getfield 116	l:C	Ljava/util/Enumeration;
    //   116: ifnull -45 -> 71
    //   119: aload_0
    //   120: new 47	java/util/Vector
    //   123: dup
    //   124: invokespecial 122	java/util/Vector:<init>	()V
    //   127: putfield 124	l:Code	Ljava/util/Vector;
    //   130: new 47	java/util/Vector
    //   133: dup
    //   134: invokespecial 122	java/util/Vector:<init>	()V
    //   137: astore_3
    //   138: aload_0
    //   139: getfield 116	l:C	Ljava/util/Enumeration;
    //   142: invokeinterface 130 1 0
    //   147: ifeq +131 -> 278
    //   150: aload_0
    //   151: getfield 116	l:C	Ljava/util/Enumeration;
    //   154: invokeinterface 133 1 0
    //   159: checkcast 41	java/lang/String
    //   162: astore 4
    //   164: aload 4
    //   166: ldc 75
    //   168: invokevirtual 79	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   171: ifeq +97 -> 268
    //   174: iconst_4
    //   175: istore_1
    //   176: iload_1
    //   177: iconst_3
    //   178: ior
    //   179: istore_1
    //   180: iload_1
    //   181: iconst_4
    //   182: iand
    //   183: ifne +90 -> 273
    //   186: aload_0
    //   187: getfield 124	l:Code	Ljava/util/Vector;
    //   190: astore_2
    //   191: aload_2
    //   192: iconst_4
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: new 81	java/lang/StringBuilder
    //   201: dup
    //   202: invokespecial 82	java/lang/StringBuilder:<init>	()V
    //   205: aload_0
    //   206: getfield 32	l:J	Ljava/lang/String;
    //   209: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: aload 4
    //   214: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   217: invokevirtual 89	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   220: aastore
    //   221: dup
    //   222: iconst_1
    //   223: new 135	java/lang/Integer
    //   226: dup
    //   227: iload_1
    //   228: invokespecial 138	java/lang/Integer:<init>	(I)V
    //   231: aastore
    //   232: dup
    //   233: iconst_2
    //   234: aload 4
    //   236: aastore
    //   237: dup
    //   238: iconst_3
    //   239: aconst_null
    //   240: aastore
    //   241: invokestatic 140	l:Code	(Ljava/util/Vector;Ljava/lang/Object;)V
    //   244: goto -106 -> 138
    //   247: astore_2
    //   248: aload_0
    //   249: getfield 109	l:a	Lbu;
    //   252: invokestatic 121	b:Code	(Lbu;)V
    //   255: goto -143 -> 112
    //   258: astore_2
    //   259: aload_0
    //   260: getfield 109	l:a	Lbu;
    //   263: invokestatic 121	b:Code	(Lbu;)V
    //   266: aload_2
    //   267: athrow
    //   268: iconst_0
    //   269: istore_1
    //   270: goto -94 -> 176
    //   273: aload_3
    //   274: astore_2
    //   275: goto -84 -> 191
    //   278: iconst_0
    //   279: istore_1
    //   280: iload_1
    //   281: aload_0
    //   282: getfield 124	l:Code	Ljava/util/Vector;
    //   285: invokevirtual 51	java/util/Vector:size	()I
    //   288: if_icmpge +22 -> 310
    //   291: aload_3
    //   292: aload_0
    //   293: getfield 124	l:Code	Ljava/util/Vector;
    //   296: iload_1
    //   297: invokevirtual 67	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   300: invokevirtual 63	java/util/Vector:addElement	(Ljava/lang/Object;)V
    //   303: iload_1
    //   304: iconst_1
    //   305: iadd
    //   306: istore_1
    //   307: goto -27 -> 280
    //   310: aload_0
    //   311: aload_3
    //   312: putfield 124	l:Code	Ljava/util/Vector;
    //   315: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	316	0	this	l
    //   175	132	1	i	int
    //   190	2	2	localVector1	Vector
    //   247	1	2	localIOException	java.io.IOException
    //   258	9	2	localObject	Object
    //   274	1	2	localVector2	Vector
    //   137	175	3	localVector3	Vector
    //   162	73	4	str	String
    // Exception table:
    //   from	to	target	type
    //   72	105	247	java/io/IOException
    //   72	105	258	finally
  }
  
  private void Z()
  {
    this.Code = new Vector();
    ag[] arrayOfag = this.Z.Z();
    int i = 0;
    while (i < arrayOfag.length)
    {
      if (arrayOfag[i] != null) {
        Code(this.Code, new Object[] { arrayOfag[i].I(), new Integer(7), arrayOfag[i].Code(), null });
      }
      i += 1;
    }
  }
  
  public final boolean Code()
  {
    return (this.Code != null) && (this.I < this.Code.size());
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     l
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */