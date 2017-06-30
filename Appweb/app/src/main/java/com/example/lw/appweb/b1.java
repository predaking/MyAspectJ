package com.example.lw.appweb;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Random;

public class b
{
  public static int A;
  public static long B = 500000L;
  public static int C = -1;
  public static boolean Code;
  public static boolean D;
  public static int E;
  protected static byte[] F;
  protected static byte[] G;
  static boolean H;
  protected static boolean I;
  public static long J;
  static String[] K;
  static boolean L;
  static int M;
  static String N;
  static boolean O;
  static boolean P;
  static byte Q;
  static Object R;
  static byte[] S;
  static byte[] T;
  static byte[] U;
  protected static int V;
  protected static int W;
  public static ax[] X;
  static int Y;
  protected static boolean Z;
  public static int a = 4;
  private static int aa;
  private static int ab;
  private static boolean ac;
  private static z ad;
  private static boolean ae;
  private static int af;
  private static int ag;
  private static long ah;
  private static long ai;
  private static long aj;
  private static Object ak;
  private static int[] al;
  private static int am;
  private static w an;
  private static int ao;
  private static int ap;
  private static int aq;
  private static int ar;
  private static final byte[] as;
  private static final byte[] at;
  private static int au;
  private static int av;
  private static final Hashtable aw;
  private static Integer ax = new Integer(0);
  public static boolean b = true;
  public static int c;
  public static int d;
  public static int e = -1;
  protected static int f;
  public static boolean g;
  public static String h;
  public static int i = -1;
  protected static int j;
  public static boolean k;
  public static boolean l;
  protected static int m = -1;
  protected static boolean n;
  protected static boolean o;
  protected static boolean p;
  protected static int q = 0;
  public static int r;
  static boolean s = true;
  static int t = 2;
  protected static int u = 2;
  public static boolean v;
  public static char w = '*';
  public static boolean x;
  public static boolean y;
  public static boolean z;
  
  static
  {
    aa = -1;
    ab = -1;
    A = 512;
    ad = new z();
    ae = true;
    K = new String[4];
    ak = new Object();
    R = new Object();
    as = new byte[] { 34, 34, 35, 35, 37, 37, 39, 39 };
    at = new byte[] { 33, 34, 34, 35, 35, 36, 36, 37, 37, 38, 38, 38, 38, 39, 39, 40, 40, 40, 40, 41, 41, 42, 42, 42, 42, 43, 43, 43, 43, 44, 44, 44, 44, 45, 45, 45, 45, 46, 46, 46, 46, 47, 47, 48, 48, 49, 49, 50, 50, 51, 51, 51, 51, 52, 52, 52, 52, 53, 53, 53, 53, 54, 54, 54, 54, 55, 55, 55, 55, 56, 56, 56, 56, 57, 57, 57, 57, 58, 58, 58, 58, 65, 65, 65, 65, 66, 66, 66, 66, 67, 67, 67, 67, 68, 68, 68, 68, 69, 69, 69, 69, 70, 70, 70, 70, 71, 71, 71, 71, 72, 72, 73, 73, 74, 74, 74, 74 };
    au = -1;
    av = -1;
    Hashtable localHashtable = new Hashtable(6);
    aw = localHashtable;
    localHashtable.put("http", new Integer(80));
    aw.put("https", new Integer(443));
    aw.put("ftp", new Integer(21));
    aw.put("rtsp", new Integer(554));
  }
  
  protected static String B(String arg0)
  {
    String str1 = System.getProperty(???);
    if (str1 != null)
    {
      byte[] arrayOfByte = str1.getBytes();
      synchronized (ad)
      {
        ad.Code(arrayOfByte, 0, arrayOfByte.length);
        return str1;
      }
    }
    return str2;
  }
  
  static void B()
  {
    try
    {
      if (!C()) {
        break label85;
      }
      g.I.B();
      g.Z.c(160);
      g.Z.c(E);
      g.Z.c(1);
      g.I.Code(32);
      while (E < 160) {
        Code(ad, 5000);
      }
      C("mc");
    }
    finally {}
    C("md");
    label85:
    if ((E >= 160) && (K[1] == null))
    {
      byte[] arrayOfByte = new byte[32];
      I(arrayOfByte);
      Code(1, Code(arrayOfByte, arrayOfByte.length), true);
    }
  }
  
  public static boolean B(char paramChar)
  {
    return (0xF800 & paramChar) == 55296;
  }
  
  public static byte[] B(int paramInt)
  {
    int i1;
    for (;;)
    {
      synchronized (R)
      {
        if (S != null) {
          break label463;
        }
        return null;
        if (i1 >= S.length) {
          break label458;
        }
        if (S[i1] == (byte)paramInt)
        {
          i1 /= 3;
          label41:
          if (i1 >= 0) {
            break;
          }
          return null;
        }
      }
      i1 += 3;
    }
    int i2 = 0;
    label67:
    Object localObject4;
    int i3;
    try
    {
      Object localObject3 = j.Code.Code("mo", i1 + 2);
      paramInt = localObject3[0];
      if (paramInt != 1) {
        return null;
      }
      if (localObject3[1] != 16) {
        return null;
      }
      if ((T == null) && ((S[(i1 * 3)] != localObject3[2]) || (S[(i1 * 3 + 1)] != localObject3[3]) || (S[(i1 * 3 + 2)] != localObject3[4])))
      {
        T = new byte[S.length];
        System.arraycopy(S, 0, T, 0, S.length);
      }
      if (T != null)
      {
        T[(i1 * 3)] = localObject3[2];
        T[(i1 * 3 + 1)] = localObject3[3];
        T[(i1 * 3 + 2)] = localObject3[4];
      }
      U[i1] = localObject3[5];
      if (localObject3.length == 6) {
        return new byte[0];
      }
      localObject4 = new as();
      ((as)localObject4).Code(new DataInputStream(new ByteArrayInputStream((byte[])localObject3, 6, localObject3.length - 6)));
      localObject3 = new DataInputStream((InputStream)localObject4);
      int i4 = k.Code((DataInput)localObject3);
      paramInt = 0;
      label345:
      do
      {
        if (paramInt >= i4) {
          break label425;
        }
        if ((((DataInputStream)localObject3).read() & 0xFF & 0x80) != 0) {
          break;
        }
        i3 = ((DataInputStream)localObject3).readUnsignedShort();
        paramInt += i3 + 3;
      } while (((DataInputStream)localObject3).skipBytes(i3) >= i3);
      throw new EOFException();
    }
    catch (Throwable localThrowable)
    {
      if (i2 >= g.b) {
        break label447;
      }
    }
    g.I.B();
    g localg = g.I;
    if (i2 > 0) {}
    for (boolean bool = true;; bool = false)
    {
      localg.Code(bool);
      g.I.C();
      i2 += 1;
      break label67;
      i3 = localg.readInt();
      paramInt += i3 + 5;
      break label345;
      label425:
      localObject4 = new byte[k.Code(localg)];
      localg.readFully((byte[])localObject4);
      return localObject4;
      label447:
      a();
      e();
      return null;
      label458:
      i1 = -1;
      break label41;
      label463:
      i1 = 0;
      break;
    }
  }
  
  static int C(int paramInt)
  {
    return X[paramInt].c();
  }
  
  /* Error */
  public static void C(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: new 341	w
    //   5: dup
    //   6: invokespecial 342	w:<init>	()V
    //   9: astore_3
    //   10: new 344	java/io/DataOutputStream
    //   13: dup
    //   14: aload_3
    //   15: invokespecial 347	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   18: astore 4
    //   20: ldc 246
    //   22: aload_0
    //   23: invokevirtual 351	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   26: ifeq +46 -> 72
    //   29: aload 4
    //   31: iconst_1
    //   32: invokevirtual 354	java/io/DataOutputStream:write	(I)V
    //   35: aload 4
    //   37: iconst_1
    //   38: invokestatic 357	b:J	(I)Ljava/lang/String;
    //   41: invokevirtual 360	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   44: aload 4
    //   46: iconst_0
    //   47: invokevirtual 363	java/io/DataOutputStream:writeBoolean	(Z)V
    //   50: aload_3
    //   51: invokevirtual 366	w:toByteArray	()[B
    //   54: astore_2
    //   55: getstatic 272	j:Code	Lj;
    //   58: aload_0
    //   59: invokevirtual 368	j:Z	(Ljava/lang/String;)V
    //   62: getstatic 272	j:Code	Lj;
    //   65: aload_0
    //   66: aload_2
    //   67: invokevirtual 371	j:Code	(Ljava/lang/String;[B)I
    //   70: pop
    //   71: return
    //   72: ldc 251
    //   74: aload_0
    //   75: invokevirtual 351	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   78: ifeq -28 -> 50
    //   81: aload 4
    //   83: bipush 8
    //   85: invokevirtual 354	java/io/DataOutputStream:write	(I)V
    //   88: bipush 32
    //   90: newarray byte
    //   92: astore 5
    //   94: getstatic 130	b:ad	Lz;
    //   97: astore_2
    //   98: aload_2
    //   99: monitorenter
    //   100: getstatic 130	b:ad	Lz;
    //   103: aload 5
    //   105: invokevirtual 373	z:Code	([B)V
    //   108: getstatic 130	b:ad	Lz;
    //   111: aload 5
    //   113: iconst_0
    //   114: bipush 32
    //   116: invokevirtual 222	z:Code	([BII)V
    //   119: aload_2
    //   120: monitorexit
    //   121: aload 4
    //   123: aload 5
    //   125: invokevirtual 375	java/io/DataOutputStream:write	([B)V
    //   128: getstatic 239	b:E	I
    //   131: sipush 160
    //   134: if_icmplt +139 -> 273
    //   137: aload 4
    //   139: iload_1
    //   140: invokevirtual 363	java/io/DataOutputStream:writeBoolean	(Z)V
    //   143: aload 4
    //   145: invokestatic 379	ap:Code	(Ljava/io/DataOutputStream;)V
    //   148: aload 4
    //   150: getstatic 381	b:L	Z
    //   153: invokevirtual 363	java/io/DataOutputStream:writeBoolean	(Z)V
    //   156: aload 4
    //   158: getstatic 383	b:ag	I
    //   161: invokevirtual 386	java/io/DataOutputStream:writeInt	(I)V
    //   164: aload 4
    //   166: getstatic 114	b:t	I
    //   169: invokevirtual 386	java/io/DataOutputStream:writeInt	(I)V
    //   172: aload 4
    //   174: getstatic 120	b:aa	I
    //   177: invokevirtual 389	java/io/DataOutputStream:writeShort	(I)V
    //   180: aload 4
    //   182: getstatic 122	b:ab	I
    //   185: invokevirtual 389	java/io/DataOutputStream:writeShort	(I)V
    //   188: getstatic 392	g:Code	Le;
    //   191: aload 4
    //   193: invokeinterface 394 2 0
    //   198: aload 4
    //   200: getstatic 396	b:M	I
    //   203: invokevirtual 386	java/io/DataOutputStream:writeInt	(I)V
    //   206: getstatic 398	b:N	Ljava/lang/String;
    //   209: ifnull +69 -> 278
    //   212: getstatic 398	b:N	Ljava/lang/String;
    //   215: astore_2
    //   216: aload 4
    //   218: aload_2
    //   219: invokevirtual 360	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   222: aload 4
    //   224: getstatic 400	b:Q	B
    //   227: invokevirtual 403	java/io/DataOutputStream:writeByte	(I)V
    //   230: getstatic 405	b:D	Z
    //   233: ifeq +33 -> 266
    //   236: getstatic 136	b:K	[Ljava/lang/String;
    //   239: iconst_3
    //   240: aaload
    //   241: ifnull +25 -> 266
    //   244: getstatic 136	b:K	[Ljava/lang/String;
    //   247: iconst_3
    //   248: aaload
    //   249: astore_2
    //   250: aload 4
    //   252: aload_2
    //   253: invokevirtual 360	java/io/DataOutputStream:writeUTF	(Ljava/lang/String;)V
    //   256: goto -206 -> 50
    //   259: astore_0
    //   260: return
    //   261: astore_0
    //   262: aload_2
    //   263: monitorexit
    //   264: aload_0
    //   265: athrow
    //   266: ldc_w 407
    //   269: astore_2
    //   270: goto -20 -> 250
    //   273: iconst_0
    //   274: istore_1
    //   275: goto -138 -> 137
    //   278: ldc_w 407
    //   281: astore_2
    //   282: goto -66 -> 216
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	285	0	paramString	String
    //   1	274	1	bool	boolean
    //   9	42	3	localw	w
    //   18	233	4	localDataOutputStream	DataOutputStream
    //   92	32	5	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   2	50	259	java/lang/Throwable
    //   50	71	259	java/lang/Throwable
    //   72	100	259	java/lang/Throwable
    //   121	137	259	java/lang/Throwable
    //   137	216	259	java/lang/Throwable
    //   216	250	259	java/lang/Throwable
    //   250	256	259	java/lang/Throwable
    //   264	266	259	java/lang/Throwable
    //   100	121	261	finally
    //   262	264	261	finally
  }
  
  static boolean C()
  {
    return (E < 160) && (D);
  }
  
  private static boolean C(char paramChar)
  {
    return ('؀' <= paramChar) && (paramChar <= 'ۿ');
  }
  
  private static int Code(int paramInt, char paramChar)
  {
    return X[paramInt].Code(paramChar);
  }
  
  public static int Code(int paramInt1, int paramInt2, int paramInt3)
  {
    return Math.max(Math.min(paramInt1, paramInt3), paramInt2);
  }
  
  private static int Code(int paramInt, DataInputStream paramDataInputStream)
  {
    Code(paramDataInputStream, (paramInt & 0x7FFF) * 4);
    paramInt = paramDataInputStream.readInt();
    int i1 = paramDataInputStream.readInt();
    Code(paramDataInputStream, paramInt);
    return i1 + 4 - paramInt;
  }
  
  static int Code(int paramInt, String paramString)
  {
    return X[paramInt].Code(paramString);
  }
  
  static int Code(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    return X[paramInt1].Code(paramArrayOfChar, paramInt2, paramInt3);
  }
  
  public static int Code(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3, int paramInt4)
  {
    int i4 = 0;
    if (paramInt4 <= 0) {
      return 0;
    }
    int i1;
    if (paramInt3 > 0)
    {
      i1 = paramInt2 + paramInt3;
      if (Code(paramInt1, paramArrayOfChar, paramInt2, paramInt3) <= paramInt4) {
        paramInt1 = i1;
      }
    }
    for (;;)
    {
      return paramInt1 - paramInt2;
      i1 -= 1;
      paramInt3 = i1;
      if (b(paramArrayOfChar[i1])) {
        paramInt3 = i1 - 1;
      }
      int i3 = paramInt2;
      i1 = paramInt2;
      int i2 = paramInt3;
      paramInt3 = i4;
      for (;;)
      {
        i4 = paramInt3;
        if (i3 >= i2) {
          break label200;
        }
        i1 = (i3 + i2) / 2;
        paramInt3 = i1;
        if (b(paramArrayOfChar[i1])) {
          paramInt3 = i1 - 1;
        }
        i1 = Code(paramInt1, paramArrayOfChar, paramInt2, paramInt3 - paramInt2);
        if (i1 < paramInt4)
        {
          if (B(paramArrayOfChar[paramInt3])) {}
          for (i3 = 2;; i3 = 1)
          {
            i4 = i3 + paramInt3;
            i3 = i1;
            i1 = paramInt3;
            paramInt3 = i3;
            i3 = i4;
            break;
          }
        }
        if (i1 == paramInt4) {
          break;
        }
        i2 = paramInt3;
        i4 = i1;
        i1 = paramInt3;
        paramInt3 = i4;
      }
      i4 = i1;
      i1 = paramInt3;
      label200:
      paramInt1 = i1;
      if (i4 > paramInt4)
      {
        paramInt3 = i1 - 1;
        paramInt1 = paramInt3;
        if (b(paramArrayOfChar[paramInt3]))
        {
          paramInt1 = paramInt3 - 1;
          continue;
          paramInt1 = paramInt2;
        }
      }
    }
  }
  
  private static int Code(ax paramax)
  {
    int i4 = 0;
    int i1;
    int i2;
    if (paramax.C())
    {
      i1 = 1;
      if (!paramax.B()) {
        break label63;
      }
      i2 = 2;
      label25:
      if (!paramax.a()) {
        break label68;
      }
    }
    label63:
    label68:
    for (int i3 = 4;; i3 = 0)
    {
      if (paramax.b()) {
        i4 = 8;
      }
      return i3 | (i2 | i1) | i4;
      i1 = 0;
      break;
      i2 = 0;
      break label25;
    }
  }
  
  static int Code(String paramString, int paramInt)
  {
    return az.Code(paramString.substring(0, paramInt));
  }
  
  public static int Code(String paramString1, String paramString2)
  {
    int i1 = paramString1.length();
    if ((paramString2.length() != i1 + 2) || (!paramString2.startsWith(paramString1))) {
      return -1;
    }
    int i2 = paramString2.charAt(i1);
    return paramString2.charAt(i1 + 1) - 'A' + (i2 - 65) * 26;
  }
  
  public static int Code(char[] paramArrayOfChar, boolean paramBoolean, int paramInt1, int paramInt2, ax paramax)
  {
    int i2 = 0;
    int i1 = 0;
    if (paramax.Code(paramArrayOfChar, 0, paramArrayOfChar.length) <= paramInt1)
    {
      i2 = i1;
      if (paramBoolean) {
        i2 = paramArrayOfChar.length;
      }
      return i2;
    }
    int i3 = paramArrayOfChar.length;
    if (paramBoolean)
    {
      for (i1 = i3;; i1 = i3)
      {
        i2 = i1;
        if (i1 <= 0) {
          break;
        }
        i3 = i1 / 2;
        i2 = i1;
        if (paramax.Code(paramArrayOfChar, 0, i3 + 0) + paramInt2 <= paramInt1) {
          break;
        }
      }
      while ((i2 > 0) && (paramax.Code(paramArrayOfChar, 0, i2 + 0) + paramInt2 > paramInt1)) {
        i2 -= 1;
      }
      return i2;
    }
    for (;;)
    {
      i1 = i2;
      if (i2 >= i3) {
        break;
      }
      int i4 = (i3 - i2) / 2 + i2 + 1;
      i1 = i2;
      if (paramax.Code(paramArrayOfChar, i4, i3 - i4) + paramInt2 <= paramInt1) {
        break;
      }
      i2 = i4;
    }
    for (;;)
    {
      i2 = i1;
      if (i1 >= i3) {
        break;
      }
      i2 = i1;
      if (paramax.Code(paramArrayOfChar, i1, i3 - i1) + paramInt2 <= paramInt1) {
        break;
      }
      i1 += 1;
    }
  }
  
  public static int Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    return Code(paramArrayOfInt, 0, paramInt1, paramInt2, -1, paramInt3);
  }
  
  public static int Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i1 = -1;
    while (paramInt2 - i1 > 1)
    {
      int i2 = i1 + paramInt2 >>> 1;
      if ((paramArrayOfInt[(i2 * paramInt3 + paramInt1 + 0)] & paramInt4) < paramInt5) {
        i1 = i2;
      } else {
        paramInt2 = i2;
      }
    }
    return paramInt2;
  }
  
  static br Code(int paramInt, boolean paramBoolean)
  {
    byte[] arrayOfByte = b(paramInt);
    return g.Code.q().Code(arrayOfByte, arrayOfByte.length, paramBoolean);
  }
  
  static String Code(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i1 = 0;
    if (i1 < paramString.length())
    {
      char c1 = paramString.charAt(i1);
      if (c1 == 0) {
        localStringBuffer.append("%00");
      }
      for (;;)
      {
        i1 += 1;
        break;
        if ("%&=;".indexOf(c1) >= 0) {
          localStringBuffer.append('%').append(Integer.toString(c1, 16));
        } else {
          localStringBuffer.append(c1);
        }
      }
    }
    return localStringBuffer.toString();
  }
  
  public static String Code(byte[] paramArrayOfByte)
  {
    z localz = new z();
    localz.Code(paramArrayOfByte, 0, paramArrayOfByte.length);
    paramArrayOfByte = new byte[32];
    localz.Code(paramArrayOfByte);
    return Code(paramArrayOfByte, paramArrayOfByte.length);
  }
  
  private static String Code(byte[] paramArrayOfByte, int paramInt)
  {
    int i1 = Math.min(paramInt, 128);
    StringBuffer localStringBuffer = new StringBuffer();
    paramInt = 0;
    while (paramInt < i1 + 0)
    {
      if ((paramArrayOfByte[paramInt] & 0xFF) < 16) {
        localStringBuffer.append('0');
      }
      localStringBuffer.append(Integer.toString(paramArrayOfByte[paramInt] & 0xFF, 16));
      paramInt += 1;
    }
    return localStringBuffer.toString();
  }
  
  public static void Code()
  {
    try
    {
      Thread.sleep(200L);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  public static void Code(int paramInt)
  {
    E += paramInt;
    if (ae)
    {
      g.I.a();
      if (E >= 160)
      {
        ae = false;
        Code(ad);
      }
    }
  }
  
  private static void Code(int paramInt1, int paramInt2)
  {
    int i1 = ap << paramInt2;
    ap = i1;
    ap = i1 | (1 << paramInt2) - 1 & paramInt1;
    ao += paramInt2;
    while (ao >= 8)
    {
      ao -= 8;
      an.write(ap >> ao);
    }
  }
  
  public static void Code(int paramInt, String paramString, boolean paramBoolean)
  {
    if ((K[paramInt] == null) || (!K[paramInt].equals(paramString)))
    {
      K[paramInt] = paramString;
      if ((paramInt != 1) || (!paramBoolean)) {
        break label41;
      }
      C("mc");
    }
    label41:
    while ((paramInt != 3) || (!paramBoolean)) {
      return;
    }
    C("md");
  }
  
  static void Code(long paramLong1, long paramLong2, long paramLong3)
  {
    synchronized (ak)
    {
      ai += paramLong1;
      aj += paramLong2;
      ah += paramLong3;
      return;
    }
  }
  
  public static void Code(bu parambu)
  {
    try
    {
      parambu.C();
      return;
    }
    catch (Throwable parambu) {}
  }
  
  private static void Code(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    byte[] arrayOfByte = new byte[az.Code(paramString) + 2];
    int i1 = az.Code(paramString, arrayOfByte, 0);
    paramByteArrayOutputStream.write(paramInt1 >> 8 & 0xFF);
    paramByteArrayOutputStream.write(paramInt1 & 0xFF);
    paramByteArrayOutputStream.write(paramInt2 >> 8 & 0xFF);
    paramByteArrayOutputStream.write(paramInt2 & 0xFF);
    paramByteArrayOutputStream.write(paramInt3);
    paramByteArrayOutputStream.write(i1);
    paramByteArrayOutputStream.write(arrayOfByte, 2, i1);
  }
  
  private static void Code(DataInputStream paramDataInputStream, int paramInt)
  {
    while (paramInt > 0)
    {
      I(paramDataInputStream.readInt());
      paramInt -= 1;
    }
  }
  
  static void Code(DataOutputStream paramDataOutputStream, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      paramDataOutputStream.writeShort(paramArrayOfInt.length);
      paramDataOutputStream.write(Code(paramArrayOfInt));
      return;
    }
    paramDataOutputStream.writeShort(0);
  }
  
  public static void Code(InputStream paramInputStream)
  {
    try
    {
      paramInputStream.close();
      return;
    }
    catch (Throwable paramInputStream) {}
  }
  
  public static void Code(InputStream paramInputStream, int paramInt)
  {
    while (paramInt > 0) {
      paramInt = (int)(paramInt - paramInputStream.skip(paramInt));
    }
  }
  
  public static void Code(OutputStream paramOutputStream)
  {
    try
    {
      paramOutputStream.close();
      return;
    }
    catch (Throwable paramOutputStream) {}
  }
  
  public static void Code(Object paramObject)
  {
    try
    {
      paramObject.notifyAll();
      return;
    }
    finally {}
  }
  
  /* Error */
  public static void Code(Object paramObject, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: i2l
    //   4: lstore_2
    //   5: aload_0
    //   6: lload_2
    //   7: invokevirtual 574	java/lang/Object:wait	(J)V
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: astore 4
    //   15: aload_0
    //   16: monitorexit
    //   17: aload 4
    //   19: athrow
    //   20: astore 4
    //   22: goto -12 -> 10
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	25	0	paramObject	Object
    //   0	25	1	paramInt	int
    //   4	3	2	l1	long
    //   13	5	4	localObject	Object
    //   20	1	4	localInterruptedException	InterruptedException
    // Exception table:
    //   from	to	target	type
    //   5	10	13	finally
    //   10	12	13	finally
    //   15	17	13	finally
    //   5	10	20	java/lang/InterruptedException
  }
  
  public static void Code(Runnable paramRunnable)
  {
    new Thread(paramRunnable).start();
  }
  
  public static void Code(q paramq, int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    paramq.Code(paramInt1, paramArrayOfChar, paramInt2, paramInt3, paramInt4, paramInt5 + 0, paramInt6, true, paramInt7, paramInt8, paramInt9);
  }
  
  static void Code(boolean paramBoolean)
  {
    int i1;
    Object localObject1;
    char[] arrayOfChar;
    label190:
    int i2;
    int i3;
    int i4;
    label715:
    label735:
    try
    {
      Y = 0;
      if ((!paramBoolean) && (F != null))
      {
        i1 = F.length;
        if (i1 == 32) {
          return;
        }
      }
      localObject1 = new z();
      arrayOfChar = new char[13];
      tmp49_47 = arrayOfChar;
      tmp49_47[0] = 32;
      tmp55_49 = tmp49_47;
      tmp55_49[1] = 109;
      tmp61_55 = tmp55_49;
      tmp61_55[2] = 105;
      tmp67_61 = tmp61_55;
      tmp67_61[3] = 48;
      tmp72_67 = tmp67_61;
      tmp72_67[4] = 88;
      tmp78_72 = tmp72_67;
      tmp78_72[5] = 229;
      tmp84_78 = tmp78_72;
      tmp84_78[6] = 1575;
      tmp91_84 = tmp84_78;
      tmp91_84[7] = 1503;
      tmp98_91 = tmp91_84;
      tmp98_91[8] = 936;
      tmp105_98 = tmp98_91;
      tmp105_98[9] = 12354;
      tmp112_105 = tmp105_98;
      tmp112_105[10] = 1102;
      tmp119_112 = tmp112_105;
      tmp119_112[11] = 19968;
      tmp126_119 = tmp119_112;
      tmp126_119[12] = 13071;
      tmp126_119;
      an = new w(32);
      am = (V - W) * 16454;
      if (!paramBoolean) {
        break label1047;
      }
      g.I.B();
      g.Z.c(am);
      g.I.Code(30);
    }
    finally {}
    if (i1 < V)
    {
      if (!g.Code.a(i1))
      {
        i2 = Math.max(0, X[i1].c() - c(i1) + 0);
        i3 = X[i1].c();
        an.write(i3 - i2);
        an.write(X[i1].c());
        i2 = 0;
        while (i2 < arrayOfChar.length)
        {
          an.write(Code(i1, arrayOfChar[i2]));
          i2 += 1;
        }
        Code(an, i1, 1, Code(X[i1]), X[i1].d());
        ((z)localObject1).Code(an.Code(), 0, an.size());
        an.reset();
      }
    }
    else
    {
      ((z)localObject1).Code(1);
      an.Code(32);
      ((z)localObject1).Code(an.Code());
      if (paramBoolean) {
        i4 = 0;
      }
    }
    for (;;)
    {
      int i5;
      int i7;
      if (i4 < V)
      {
        if (!g.Code.a(i4))
        {
          i1 = Math.max(0, X[i4].c() - c(i4) + 0);
          i2 = X[i4].c();
          an.write(i4 >> 8 & 0xFF);
          an.write(i4 & 0xFF);
          an.write(i2 - i1);
          an.write(i1);
          X[i4].e();
          ao = 0;
          aq = 4;
          ar = 1 << aq - 1;
          localObject1 = new int[17];
          Object tmp519_517 = localObject1;
          tmp519_517[0] = 1;
          Object tmp523_519 = tmp519_517;
          tmp523_519[1] = 31;
          Object tmp528_523 = tmp523_519;
          tmp528_523[2] = 2043;
          Object tmp534_528 = tmp528_523;
          tmp534_528[3] = 2303;
          Object tmp540_534 = tmp534_528;
          tmp540_534[4] = 7037;
          Object tmp546_540 = tmp540_534;
          tmp546_540[5] = 7423;
          Object tmp552_546 = tmp546_540;
          tmp552_546[6] = 13312;
          Object tmp559_552 = tmp552_546;
          tmp559_552[7] = 19903;
          Object tmp566_559 = tmp559_552;
          tmp566_559[8] = 19968;
          Object tmp573_566 = tmp566_559;
          tmp573_566[9] = 40895;
          Object tmp580_573 = tmp573_566;
          tmp580_573[10] = 42183;
          Object tmp587_580 = tmp580_573;
          tmp587_580[11] = 42751;
          Object tmp594_587 = tmp587_580;
          tmp594_587[12] = 44032;
          Object tmp601_594 = tmp594_587;
          tmp601_594[13] = 55203;
          Object tmp608_601 = tmp601_594;
          tmp608_601[14] = 55296;
          Object tmp615_608 = tmp608_601;
          tmp615_608[15] = 64255;
          Object tmp622_615 = tmp615_608;
          tmp622_615[16] = 65536;
          tmp622_615;
          i5 = 0;
          i1 = 0;
          i7 = 2147483647;
          i3 = 1;
          i2 = 0;
        }
      }
      else {
        for (;;)
        {
          int i8;
          int i6;
          int i9;
          if (i3 <= 65535)
          {
            i8 = i3 + 1;
            i6 = Code(i4, (char)i3);
            Y += 1;
            i3 = i6 - i2;
            i9 = Math.abs(i3);
            if ((i3 == i7) && (i8 - 1 != localObject1[i5]))
            {
              i1 += 1;
              i2 = i6;
              i3 = i8;
              continue;
              for (;;)
              {
                if (i2 < i1)
                {
                  Code(i7, aq);
                  i2 += 1;
                  continue;
                  Code(ar, aq);
                  if (i1 <= 1 << aq * 2 - 1) {
                    Code(i1, aq * 2);
                  }
                }
              }
            }
          }
          else
          {
            for (;;)
            {
              if (i9 >>> aq - 1 != 0)
              {
                Code(ar, aq);
                Code(1, aq * 2);
                aq += 1;
                ar = 1 << aq - 1;
                continue;
                Code(2, aq * 2);
                Code(i1, 16);
              }
              else
              {
                Code(i3, aq);
                i7 = i5;
                i1 = i2;
                i2 = i8;
                if (i8 - 1 != localObject2[i5]) {
                  break label1080;
                }
                Code(0, aq);
                i1 = localObject2[(i5 + 1)];
                i3 = localObject2[i5];
                i2 = localObject2[(i5 + 1)];
                i7 = i5 + 2;
                i2 += 1;
                i1 = i1 - i3 - 1;
                i3 = 0;
                break label1080;
                if (i1 > 0)
                {
                  Code(ar, aq);
                  Code(2, aq * 2);
                  Code(i1, 16);
                }
                Code(ar, aq);
                Code(3, aq * 2);
                if (ao == 0) {
                  break label1099;
                }
                an.write(ap << 8 - ao);
                break label1099;
                g.Code.aa();
                F = an.toByteArray();
                an = null;
                G = null;
                if (paramBoolean) {
                  k();
                }
                if (!paramBoolean) {
                  break;
                }
                g.I.B();
                g.I.Code(31);
                break;
                label1047:
                i1 = 0;
                break label190;
                i1 += 1;
                break label190;
                i2 = i1;
                if (i1 > 0)
                {
                  if (i1 >= 4) {
                    break label735;
                  }
                  i2 = 0;
                  break label715;
                  i2 = 0;
                }
              }
            }
            label1080:
            i8 = i3;
            i3 = i2;
            i2 = i6;
            i5 = i7;
            i7 = i8;
          }
        }
      }
      label1099:
      i4 += 1;
    }
  }
  
  static void Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    paramArrayOfByte[0] = 1;
    paramArrayOfByte[1] = 16;
    paramArrayOfByte[2] = ((byte)paramInt1);
    paramArrayOfByte[3] = ((byte)(paramInt2 >> 8));
    paramArrayOfByte[4] = ((byte)paramInt2);
    paramArrayOfByte[5] = ((byte)paramInt3);
  }
  
  static void Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    int i2;
    if ((paramInt4 != -1) && (paramInt5 != -1))
    {
      i2 = 1;
      if (((paramInt2 < 4) || (paramArrayOfByte[paramInt1] != 82)) && (paramArrayOfByte[paramInt1] != 67) && (paramArrayOfByte[paramInt1] != 88)) {
        break label153;
      }
      if (paramArrayOfByte[paramInt1] != 88) {
        break label131;
      }
      paramArrayOfInt[0] = (paramArrayOfByte[(paramInt1 + 1)] << 3 | (paramArrayOfByte[(paramInt1 + 2)] >>> 5 & 0x7) * ((paramArrayOfByte[(paramInt1 + 2)] & 0x1F) << 6) | (paramArrayOfByte[(paramInt1 + 3)] >>> 2 & 0x3F) * a);
    }
    for (;;)
    {
      paramInt1 = paramArrayOfInt[0];
      paramArrayOfInt[2] = paramInt1;
      paramArrayOfInt[1] = paramInt1;
      au = 0;
      av = 0;
      return;
      i2 = 0;
      break;
      label131:
      paramArrayOfInt[0] = (paramArrayOfByte[(paramInt1 + 1)] * paramArrayOfByte[(paramInt1 + 2)] * a);
    }
    label153:
    int i1;
    if ((paramInt2 >= 23) && (paramArrayOfByte[paramInt1] == -119))
    {
      i1 = az.J(paramArrayOfByte, paramInt1 + 16);
      paramInt1 = az.J(paramArrayOfByte, paramInt1 + 20);
      paramInt2 = 0;
    }
    for (;;)
    {
      au = paramInt5;
      av = paramInt4;
      paramArrayOfInt[1] = (paramInt5 * paramInt4 * a);
      int i3;
      if (paramInt3 != 256)
      {
        paramArrayOfInt[0] = (((paramInt5 * paramInt3 - 1) / 256 + 1) * ((paramInt4 * paramInt3 - 1) / 256 + 1) * a);
        if (paramInt2 > 0)
        {
          paramInt3 = paramArrayOfInt[0];
          paramArrayOfInt[2] = (paramInt1 * i1 * a / paramInt2 + paramInt3);
          return;
          if ((paramArrayOfByte[paramInt1] != -1) || (paramArrayOfByte[(paramInt1 + 1)] != -40)) {
            break label581;
          }
          i1 = 2;
          for (;;)
          {
            if ((i1 < paramInt2) && (paramArrayOfByte[(paramInt1 + i1)] == -1))
            {
              i3 = i1 + 1;
              i1 = i3;
              if (paramArrayOfByte[(paramInt1 + i3)] != -1) {
                if (paramArrayOfByte[(paramInt1 + i3)] != 0) {
                  if ((paramArrayOfByte[(paramInt1 + i3)] == 1) || ((paramArrayOfByte[(paramInt1 + i3)] >= -48) && (paramArrayOfByte[(paramInt1 + i3)] <= -41)))
                  {
                    i1 = i3 + 1;
                  }
                  else if ((paramArrayOfByte[(paramInt1 + i3)] == -64) || (paramArrayOfByte[(paramInt1 + i3)] == -62))
                  {
                    paramInt2 = az.Z(paramArrayOfByte, paramInt1 + i3 + 6);
                    i1 = az.Z(paramArrayOfByte, i3 + paramInt1 + 4);
                    paramInt1 = paramInt2;
                    paramInt2 = i1;
                  }
                }
              }
            }
          }
        }
      }
      for (;;)
      {
        if (i2 != 0) {
          i2 = paramInt5 * 256 / paramInt1;
        }
        for (;;)
        {
          label449:
          if ((!s) && (i2 < 256))
          {
            i1 = 8;
            for (;;)
            {
              if (256 / i1 <= i2)
              {
                i1 /= 2;
                continue;
                i1 = i3 + 1;
                i1 += az.Z(paramArrayOfByte, paramInt1 + i1);
                break;
                i2 = paramInt3;
                break label449;
                paramArrayOfInt[2] = (paramArrayOfInt[0] + paramArrayOfInt[1]);
                return;
                paramInt1 = paramArrayOfInt[1];
                paramArrayOfInt[2] = paramInt1;
                paramArrayOfInt[0] = paramInt1;
                return;
              }
            }
            i2 = paramInt1;
            paramInt1 = paramInt2;
            paramInt2 = i1;
            i1 = i2;
            break;
          }
        }
        i2 = 0;
        i1 = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = i2;
        break;
        paramInt2 = 0;
        paramInt1 = 0;
      }
      label581:
      paramInt2 = 0;
      paramInt1 = 0;
      i1 = 0;
    }
  }
  
  static void Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (((paramInt2 >= 4) && (paramArrayOfByte[paramInt1] == 82)) || (paramArrayOfByte[paramInt1] == 67) || (paramArrayOfByte[paramInt1] == 88))
    {
      if (paramArrayOfByte[paramInt1] == 88) {
        paramArrayOfInt[0] = (paramArrayOfByte[(paramInt1 + 1)] << 3 | (paramArrayOfByte[(paramInt1 + 2)] >>> 5 & 0x7) * ((paramArrayOfByte[(paramInt1 + 2)] & 0x1F) << 6) | (paramArrayOfByte[(paramInt1 + 3)] >>> 2 & 0x3F) * a);
      }
      for (;;)
      {
        paramInt1 = paramArrayOfInt[0];
        paramArrayOfInt[2] = paramInt1;
        paramArrayOfInt[1] = paramInt1;
        au = 0;
        av = 0;
        return;
        paramArrayOfInt[0] = (paramArrayOfByte[(paramInt1 + 1)] * paramArrayOfByte[(paramInt1 + 2)] * a);
      }
    }
    if ((paramInt2 >= 23) && (paramArrayOfByte[paramInt1] == -119))
    {
      paramInt2 = az.J(paramArrayOfByte, paramInt1 + 16);
      paramInt1 = az.J(paramArrayOfByte, paramInt1 + 20);
    }
    for (;;)
    {
      paramArrayOfInt[1] = (paramInt2 * paramInt1 * a);
      au = paramInt2;
      av = paramInt1;
      paramInt1 = paramArrayOfInt[1];
      paramArrayOfInt[2] = paramInt1;
      paramArrayOfInt[0] = paramInt1;
      return;
      if ((paramArrayOfByte[paramInt1] == -1) && (paramArrayOfByte[(paramInt1 + 1)] == -40))
      {
        int i1 = 2;
        for (;;)
        {
          if ((i1 >= paramInt2) || (paramArrayOfByte[(paramInt1 + i1)] != -1)) {
            break label366;
          }
          int i2 = i1 + 1;
          i1 = i2;
          if (paramArrayOfByte[(paramInt1 + i2)] != -1)
          {
            if (paramArrayOfByte[(paramInt1 + i2)] == 0) {
              break label366;
            }
            if ((paramArrayOfByte[(paramInt1 + i2)] == 1) || ((paramArrayOfByte[(paramInt1 + i2)] >= -48) && (paramArrayOfByte[(paramInt1 + i2)] <= -41)))
            {
              i1 = i2 + 1;
            }
            else
            {
              if ((paramArrayOfByte[(paramInt1 + i2)] == -64) || (paramArrayOfByte[(paramInt1 + i2)] == -62))
              {
                paramInt2 = az.Z(paramArrayOfByte, paramInt1 + i2 + 6);
                paramInt1 = az.Z(paramArrayOfByte, i2 + paramInt1 + 4);
                break;
              }
              i1 = i2 + 1;
              i1 += az.Z(paramArrayOfByte, paramInt1 + i1);
            }
          }
        }
      }
      label366:
      paramInt1 = 0;
      paramInt2 = 0;
    }
  }
  
  static boolean Code(char paramChar)
  {
    return (I(paramChar)) || (Z(paramChar));
  }
  
  public static boolean Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    return (paramInt1 < paramInt5 + paramInt7) && (paramInt1 + paramInt3 > paramInt5) && (paramInt2 < paramInt6 + paramInt8) && (paramInt2 + paramInt4 > paramInt6);
  }
  
  public static boolean Code(int paramInt, byte[] paramArrayOfByte)
  {
    synchronized (R)
    {
      try
      {
        byte[] arrayOfByte1 = j.Code.Code("mo", 1);
        int i1;
        if (arrayOfByte1.length == 1)
        {
          i1 = arrayOfByte1[0];
          if (i1 == -1) {
            j.Code.Z("mo");
          }
          if (paramInt >= i1) {
            break label73;
          }
        }
        label73:
        byte[] arrayOfByte2;
        j.Code.Code("mo", paramArrayOfByte);
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          try
          {
            j.Code.Code("mo", paramInt + 2, paramArrayOfByte);
            return true;
          }
          catch (Throwable paramArrayOfByte)
          {
            c();
            a();
            return false;
          }
          localThrowable = localThrowable;
          i1 = -1;
        }
        arrayOfByte2 = new byte[1];
        arrayOfByte2[0] = ((byte)(paramInt + 1));
        if (i1 == -1)
        {
          j.Code.Code("mo", arrayOfByte2);
          i1 = 0;
        }
        while (i1 < paramInt)
        {
          j.Code.Code("mo", new byte[0]);
          i1 += 1;
          continue;
          j.Code.Code("mo", 1, arrayOfByte2);
        }
      }
    }
  }
  
  public static boolean Code(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramArrayOfByte1 == paramArrayOfByte2) {
      bool1 = true;
    }
    do
    {
      do
      {
        do
        {
          return bool1;
          bool1 = bool2;
        } while (paramArrayOfByte1 == null);
        bool1 = bool2;
      } while (paramArrayOfByte2 == null);
      bool1 = bool2;
    } while (paramArrayOfByte1.length != paramArrayOfByte2.length);
    int i1 = 0;
    for (;;)
    {
      if (i1 >= paramArrayOfByte1.length) {
        break label63;
      }
      bool1 = bool2;
      if (paramArrayOfByte1[i1] != paramArrayOfByte2[i1]) {
        break;
      }
      i1 += 1;
    }
    label63:
    return true;
  }
  
  static byte[] Code(int[] paramArrayOfInt)
  {
    byte[] arrayOfByte = new byte[paramArrayOfInt.length * 4];
    int i1 = arrayOfByte.length;
    for (;;)
    {
      i1 -= 1;
      if (i1 < 0) {
        break;
      }
      arrayOfByte[i1] = ((byte)(paramArrayOfInt[(i1 / 4)] >> (3 - i1 % 4) * 8));
    }
    return arrayOfByte;
  }
  
  static int[] Code(DataInputStream paramDataInputStream)
  {
    int i1 = paramDataInputStream.readUnsignedShort();
    if (i1 == 0) {
      return null;
    }
    byte[] arrayOfByte = new byte[i1 * 4];
    paramDataInputStream.readFully(arrayOfByte);
    return Code(arrayOfByte, 0, arrayOfByte.length);
  }
  
  static int[] Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[paramInt2 / 4];
    paramInt2 = arrayOfInt.length;
    for (;;)
    {
      paramInt2 -= 1;
      if (paramInt2 < 0) {
        break;
      }
      arrayOfInt[paramInt2] = (paramArrayOfByte[(paramInt2 * 4 + paramInt1)] << 24 | (paramArrayOfByte[(paramInt2 * 4 + paramInt1 + 1)] & 0xFF) << 16 | (paramArrayOfByte[(paramInt2 * 4 + paramInt1 + 2)] & 0xFF) << 8 | paramArrayOfByte[(paramInt2 * 4 + paramInt1 + 3)] & 0xFF);
    }
    return arrayOfInt;
  }
  
  static int[] Code(int[] paramArrayOfInt, int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, paramArrayOfInt.length);
    return arrayOfInt;
  }
  
  static br[] Code(br[] paramArrayOfbr, int paramInt)
  {
    br[] arrayOfbr = new br[paramInt];
    System.arraycopy(paramArrayOfbr, 0, arrayOfbr, 0, paramArrayOfbr.length);
    return arrayOfbr;
  }
  
  static at I(byte[] paramArrayOfByte)
  {
    synchronized (ad)
    {
      int i1 = af;
      af = i1 + 1;
      I(i1);
      ad.Code(paramArrayOfByte);
      ad.Code(paramArrayOfByte, 0, 32);
      ??? = new at();
      ((at)???).Code(paramArrayOfByte, 0);
      byte[] arrayOfByte = bm.c;
      ((at)???).I(arrayOfByte, arrayOfByte.length);
      ((at)???).Z(paramArrayOfByte, 0);
      return ???;
    }
  }
  
  static String I(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.ensureCapacity(paramString.length());
    for (;;)
    {
      int i1 = paramString.indexOf('%');
      if ((i1 < 0) || (i1 + 3 > paramString.length())) {
        return paramString;
      }
      localStringBuffer.append(paramString.substring(0, i1)).append((char)Integer.parseInt(paramString.substring(i1 + 1, i1 + 3), 16));
      paramString = paramString.substring(i1 + 3, paramString.length());
    }
  }
  
  public static void I()
  {
    I((int)System.currentTimeMillis());
  }
  
  public static void I(int paramInt)
  {
    synchronized (ad)
    {
      ad.Code(paramInt);
      return;
    }
  }
  
  public static boolean I(char paramChar)
  {
    return ('֐' <= paramChar) && (paramChar <= '׿');
  }
  
  public static boolean I(String paramString1, String paramString2)
  {
    boolean bool2 = false;
    int i5 = paramString2.length();
    int i6 = paramString1.length();
    boolean bool1;
    if ((i6 == 0) && (i5 == 0)) {
      bool1 = true;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while (i6 == 0);
    int i2 = -1;
    int i1 = 0;
    for (;;)
    {
      int i4 = paramString1.indexOf('*', i2 + 1);
      String str;
      if (i4 != -1)
      {
        str = paramString1.substring(i2 + 1, i4);
        label72:
        if ((str.length() != 0) || (i1 != paramString2.length())) {
          break label146;
        }
      }
      label146:
      for (int i3 = i1;; i3 = paramString2.indexOf(str, i1))
      {
        bool1 = bool2;
        if (i3 == -1) {
          break;
        }
        if ((i1 == 0) && (i3 > 0))
        {
          bool1 = bool2;
          if (paramString1.charAt(0) != '*') {
            break;
          }
        }
        if (i2 != i6 - 1) {
          break label158;
        }
        return true;
        str = paramString1.substring(i2 + 1);
        break label72;
      }
      label158:
      i1 = str.length() + i3;
      if ((i1 >= i5) && (i4 == -1)) {
        return true;
      }
      i2 = i4;
    }
  }
  
  static boolean I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 8) {}
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return false;
                paramInt2 = paramInt1 + 1;
              } while (paramArrayOfByte[paramInt1] != -119);
              paramInt1 = paramInt2 + 1;
            } while (paramArrayOfByte[paramInt2] != 80);
            paramInt2 = paramInt1 + 1;
          } while (paramArrayOfByte[paramInt1] != 78);
          paramInt1 = paramInt2 + 1;
        } while (paramArrayOfByte[paramInt2] != 71);
        paramInt2 = paramInt1 + 1;
      } while (paramArrayOfByte[paramInt1] != 13);
      paramInt1 = paramInt2 + 1;
    } while ((paramArrayOfByte[paramInt2] != 10) || (paramArrayOfByte[paramInt1] != 26) || (paramArrayOfByte[(paramInt1 + 1)] != 10));
    return true;
  }
  
  static InputStream J(String paramString)
  {
    return g.Code.Z(paramString);
  }
  
  public static String J(int paramInt)
  {
    if (K[paramInt] != null) {
      return K[paramInt];
    }
    return "";
  }
  
  static void J()
  {
    synchronized (ak)
    {
      long l1 = ai;
      long l2 = aj;
      long l3 = ah;
      ah = 0L;
      aj = 0L;
      ai = 0L;
      long l4 = l1 - l3;
      g.I.B();
      g.Z.Z(g.Z.I(10, 55));
      g.Z.B(g.Z.Z(), 0, (int)l1);
      g.Z.B(g.Z.Z(), 1, (int)(l1 >> 32));
      g.Z.B(g.Z.Z(), 2, (int)l2);
      g.Z.B(g.Z.Z(), 3, (int)(l2 >> 32));
      g.Z.B(g.Z.Z(), 4, (int)l4);
      g.Z.B(g.Z.Z(), 5, (int)(l4 >> 32));
      g.Z.B(g.Z.Z(), 8, (int)l3);
      g.Z.B(g.Z.Z(), 9, (int)(l3 >> 32));
      g.Z.b(g.Z.Z());
      g.Z.Z(0);
      g.I.Code(8);
      return;
    }
  }
  
  public static boolean J(char paramChar)
  {
    boolean bool = false;
    int i1;
    if (I(paramChar)) {
      i1 = 2;
    }
    for (;;)
    {
      if ((i1 & r) != 0) {
        bool = true;
      }
      return bool;
      if (C(paramChar)) {
        i1 = 4;
      } else if (a(paramChar)) {
        i1 = 8;
      } else {
        i1 = 0;
      }
    }
  }
  
  static DataInputStream Z()
  {
    DataInputStream localDataInputStream = new DataInputStream(J("/t"));
    Code(1, localDataInputStream);
    return localDataInputStream;
  }
  
  /* Error */
  static void Z(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 747
    //   5: iload_0
    //   6: iand
    //   7: ifne +55 -> 62
    //   10: new 289	java/io/DataInputStream
    //   13: dup
    //   14: ldc_w 740
    //   17: invokestatic 742	b:J	(Ljava/lang/String;)Ljava/io/InputStream;
    //   20: invokespecial 296	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   23: astore_2
    //   24: aload_2
    //   25: astore_1
    //   26: iload_0
    //   27: aload_2
    //   28: invokestatic 744	b:Code	(ILjava/io/DataInputStream;)I
    //   31: istore_0
    //   32: aload_2
    //   33: astore_1
    //   34: getstatic 234	g:Z	Law;
    //   37: iload_0
    //   38: newarray byte
    //   40: putfield 749	aw:Code	[B
    //   43: aload_2
    //   44: astore_1
    //   45: aload_2
    //   46: getstatic 234	g:Z	Law;
    //   49: getfield 749	aw:Code	[B
    //   52: iconst_0
    //   53: iload_0
    //   54: invokevirtual 751	java/io/DataInputStream:readFully	([BII)V
    //   57: aload_2
    //   58: invokevirtual 561	java/io/InputStream:close	()V
    //   61: return
    //   62: iload_0
    //   63: invokestatic 756	bd:Code	(I)Lbd;
    //   66: astore_3
    //   67: new 289	java/io/DataInputStream
    //   70: dup
    //   71: aload_3
    //   72: invokespecial 296	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   75: astore_2
    //   76: aload_2
    //   77: astore_1
    //   78: aload_3
    //   79: getfield 758	bd:I	I
    //   82: istore_0
    //   83: goto -51 -> 32
    //   86: astore_1
    //   87: aconst_null
    //   88: astore_1
    //   89: aload_1
    //   90: invokevirtual 561	java/io/InputStream:close	()V
    //   93: return
    //   94: astore_1
    //   95: return
    //   96: astore_3
    //   97: aload_1
    //   98: astore_2
    //   99: aload_3
    //   100: astore_1
    //   101: aload_2
    //   102: invokevirtual 561	java/io/InputStream:close	()V
    //   105: aload_1
    //   106: athrow
    //   107: astore_1
    //   108: return
    //   109: astore_2
    //   110: goto -5 -> 105
    //   113: astore_1
    //   114: goto -13 -> 101
    //   117: astore_1
    //   118: goto -17 -> 101
    //   121: astore_1
    //   122: goto -21 -> 101
    //   125: astore_2
    //   126: goto -37 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	paramInt	int
    //   1	77	1	localObject1	Object
    //   86	1	1	localException1	java.lang.Exception
    //   88	2	1	localObject2	Object
    //   94	4	1	localThrowable1	Throwable
    //   100	6	1	localObject3	Object
    //   107	1	1	localThrowable2	Throwable
    //   113	1	1	localObject4	Object
    //   117	1	1	localObject5	Object
    //   121	1	1	localObject6	Object
    //   23	79	2	localObject7	Object
    //   109	1	2	localThrowable3	Throwable
    //   125	1	2	localException2	java.lang.Exception
    //   66	13	3	localbd	bd
    //   96	4	3	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   10	24	86	java/lang/Exception
    //   62	76	86	java/lang/Exception
    //   89	93	94	java/lang/Throwable
    //   10	24	96	finally
    //   62	76	96	finally
    //   57	61	107	java/lang/Throwable
    //   101	105	109	java/lang/Throwable
    //   26	32	113	finally
    //   78	83	117	finally
    //   34	43	121	finally
    //   45	57	121	finally
    //   26	32	125	java/lang/Exception
    //   34	43	125	java/lang/Exception
    //   45	57	125	java/lang/Exception
    //   78	83	125	java/lang/Exception
  }
  
  public static boolean Z(char paramChar)
  {
    return (C(paramChar)) || (a(paramChar));
  }
  
  static byte[] Z(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    int i1 = 0;
    while (i1 < arrayOfByte.length)
    {
      arrayOfByte[i1] = ((byte)Integer.parseInt(paramString.substring(i1 * 2, i1 * 2 + 2), 16));
      i1 += 1;
    }
    return arrayOfByte;
  }
  
  public static void a()
  {
    if (Q < 3)
    {
      Q = (byte)(Q + 1);
      c();
    }
  }
  
  static void a(int paramInt)
  {
    if ((al == null) || (al.length < paramInt * 2))
    {
      al = null;
      al = new int[new int[paramInt * 2].length];
      Random localRandom = new Random(4711L);
      paramInt = 0;
      while (paramInt < al.length >> 1)
      {
        al[paramInt] = (localRandom.nextInt() & 0x7F);
        al[((al.length >> 1) + paramInt)] = (al[paramInt] + 64);
        paramInt += 1;
      }
    }
  }
  
  public static void a(String paramString)
  {
    try
    {
      DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(j.Code.I(paramString)));
      if ("mc".equals(paramString))
      {
        if (localDataInputStream.readByte() == 1)
        {
          paramString = localDataInputStream.readUTF();
          if (paramString.length() >= 64) {
            Code(1, paramString, false);
          }
          ac = localDataInputStream.readBoolean();
        }
      }
      else if ("md".equals(paramString))
      {
        int i1 = localDataInputStream.readByte();
        if (i1 <= 8) {
          try
          {
            Code(localDataInputStream, 8);
            if (i1 >= 8) {
              ac = localDataInputStream.readBoolean();
            }
            if (ac) {
              E = 160;
            }
            ap.Code(localDataInputStream, i1);
            L = localDataInputStream.readBoolean();
            ag = localDataInputStream.readInt();
            t = localDataInputStream.readInt();
            if (i1 >= 5)
            {
              aa = localDataInputStream.readShort();
              ab = localDataInputStream.readShort();
            }
            g.Code.Code(localDataInputStream, i1);
            M = localDataInputStream.readInt();
            N = localDataInputStream.readUTF();
            Q = (byte)(localDataInputStream.readByte() & 0x3);
            paramString = localDataInputStream.readUTF();
            if (!paramString.equals(""))
            {
              Code(3, paramString, false);
              return;
            }
          }
          catch (IOException paramString) {}
        }
      }
      return;
    }
    catch (Throwable paramString) {}
  }
  
  private static boolean a(char paramChar)
  {
    return ((64336 <= paramChar) && (paramChar <= 65023)) || ((65136 <= paramChar) && (paramChar <= 65278));
  }
  
  public static String b(String paramString)
  {
    Object localObject1 = null;
    int i1 = 0;
    if (i1 < paramString.length())
    {
      int i3 = paramString.charAt(i1);
      int i2 = i1;
      Object localObject2 = localObject1;
      if (65152 <= i3)
      {
        i2 = i1;
        localObject2 = localObject1;
        if (i3 <= 65276)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new StringBuffer(paramString);
          }
          if (i3 >= 65269) {
            break label108;
          }
          ((StringBuffer)localObject2).setCharAt(i1, (char)((at[(i3 - 65152)] & 0xFF) + 1536));
          i2 = i1;
        }
      }
      for (;;)
      {
        i1 = i2 + 1;
        localObject1 = localObject2;
        break;
        label108:
        ((StringBuffer)localObject2).setCharAt(i1, 'ل');
        i2 = i1 + 1;
        ((StringBuffer)localObject2).insert(i2, (char)((as[(i3 - 65269)] & 0xFF) + 1536));
      }
    }
    if (localObject1 == null) {
      return paramString;
    }
    return localObject1.toString();
  }
  
  public static void b()
  {
    byte[] arrayOfByte1;
    int i1;
    synchronized (R)
    {
      if ((S == null) || (U == null)) {
        if (!j.Code.Code("mo")) {
          return;
        }
      }
    }
    label128:
    int i2;
    label142:
    g localg;
    if (T == null)
    {
      T = new byte[S.length];
      System.arraycopy(S, 0, T, 0, S.length);
      break label291;
      for (;;)
      {
        i2 = T.length / 3;
        if (i1 >= i2) {
          break label280;
        }
        i2 = 0;
        try
        {
          byte[] arrayOfByte2 = j.Code.Code("mo", i1 + 2);
          if (arrayOfByte2[0] != 1)
          {
            c();
            return;
          }
          if (arrayOfByte2[1] != 16)
          {
            c();
            return;
          }
          T[(i1 * 3)] = arrayOfByte2[2];
          T[(i1 * 3 + 1)] = arrayOfByte2[3];
          T[(i1 * 3 + 2)] = arrayOfByte2[4];
          U[i1] = arrayOfByte2[5];
          i1 += 1;
        }
        catch (Throwable localThrowable2)
        {
          if (i2 >= g.b) {
            break label271;
          }
        }
      }
      localg = g.I;
      if (i2 <= 0) {
        break label296;
      }
    }
    label271:
    label280:
    label291:
    label296:
    for (boolean bool = true;; bool = false)
    {
      localg.Code(bool);
      i2 += 1;
      break label142;
      a();
      c();
      return;
      e();
      return;
      i1 = 0;
      break;
      i1 = 0;
      break label128;
    }
  }
  
  private static boolean b(char paramChar)
  {
    return (0xFC00 & paramChar) == 56320;
  }
  
  /* Error */
  private static byte[] b(int paramInt)
  {
    // Byte code:
    //   0: ldc_w 747
    //   3: iload_0
    //   4: iand
    //   5: ifne +46 -> 51
    //   8: new 289	java/io/DataInputStream
    //   11: dup
    //   12: ldc_w 740
    //   15: invokestatic 742	b:J	(Ljava/lang/String;)Ljava/io/InputStream;
    //   18: invokespecial 296	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   21: astore_3
    //   22: aload_3
    //   23: astore_1
    //   24: aload_3
    //   25: astore_2
    //   26: iload_0
    //   27: aload_3
    //   28: invokestatic 744	b:Code	(ILjava/io/DataInputStream;)I
    //   31: istore_0
    //   32: aload_3
    //   33: astore_1
    //   34: iload_0
    //   35: newarray byte
    //   37: astore_2
    //   38: aload_1
    //   39: aload_2
    //   40: iconst_0
    //   41: iload_0
    //   42: invokevirtual 751	java/io/DataInputStream:readFully	([BII)V
    //   45: aload_1
    //   46: invokevirtual 561	java/io/InputStream:close	()V
    //   49: aload_2
    //   50: areturn
    //   51: iload_0
    //   52: invokestatic 756	bd:Code	(I)Lbd;
    //   55: astore 4
    //   57: new 289	java/io/DataInputStream
    //   60: dup
    //   61: aload 4
    //   63: invokespecial 296	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   66: astore_3
    //   67: aload_3
    //   68: astore_1
    //   69: aload_3
    //   70: astore_2
    //   71: aload 4
    //   73: getfield 758	bd:I	I
    //   76: istore_0
    //   77: aload_3
    //   78: astore_1
    //   79: goto -45 -> 34
    //   82: astore_1
    //   83: aconst_null
    //   84: astore_2
    //   85: aload_2
    //   86: invokevirtual 561	java/io/InputStream:close	()V
    //   89: aconst_null
    //   90: areturn
    //   91: astore_1
    //   92: aconst_null
    //   93: areturn
    //   94: astore_2
    //   95: aconst_null
    //   96: astore_1
    //   97: aload_1
    //   98: invokevirtual 561	java/io/InputStream:close	()V
    //   101: aload_2
    //   102: athrow
    //   103: astore_1
    //   104: goto -55 -> 49
    //   107: astore_1
    //   108: goto -7 -> 101
    //   111: astore_2
    //   112: goto -15 -> 97
    //   115: astore_2
    //   116: goto -19 -> 97
    //   119: astore_1
    //   120: goto -35 -> 85
    //   123: astore_2
    //   124: aload_1
    //   125: astore_2
    //   126: goto -41 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	129	0	paramInt	int
    //   23	56	1	localDataInputStream1	DataInputStream
    //   82	1	1	localException1	java.lang.Exception
    //   91	1	1	localThrowable1	Throwable
    //   96	2	1	localObject1	Object
    //   103	1	1	localThrowable2	Throwable
    //   107	1	1	localThrowable3	Throwable
    //   119	6	1	localException2	java.lang.Exception
    //   25	61	2	localObject2	Object
    //   94	8	2	localObject3	Object
    //   111	1	2	localObject4	Object
    //   115	1	2	localObject5	Object
    //   123	1	2	localException3	java.lang.Exception
    //   125	1	2	localException4	java.lang.Exception
    //   21	57	3	localDataInputStream2	DataInputStream
    //   55	17	4	localbd	bd
    // Exception table:
    //   from	to	target	type
    //   8	22	82	java/lang/Exception
    //   51	67	82	java/lang/Exception
    //   85	89	91	java/lang/Throwable
    //   8	22	94	finally
    //   51	67	94	finally
    //   45	49	103	java/lang/Throwable
    //   97	101	107	java/lang/Throwable
    //   26	32	111	finally
    //   71	77	111	finally
    //   34	45	115	finally
    //   26	32	119	java/lang/Exception
    //   71	77	119	java/lang/Exception
    //   34	45	123	java/lang/Exception
  }
  
  private static int c(int paramInt)
  {
    if (X[paramInt].Z() > 0) {
      return X[paramInt].Z();
    }
    return X[paramInt].c() + 0;
  }
  
  public static String c(String paramString)
  {
    String str = paramString;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.startsWith("http://"))
      {
        str = paramString;
        if (paramString.indexOf("&url=rtsp://") >= 0) {
          str = paramString.substring(paramString.indexOf("rtsp://"));
        }
      }
    }
    return str;
  }
  
  public static void c()
  {
    synchronized (R)
    {
      S = null;
      T = null;
      U = null;
      j.Code.Z("mo");
      return;
    }
  }
  
  public static int d()
  {
    for (;;)
    {
      int i2;
      int i3;
      synchronized (R)
      {
        if (U == null) {
          break label149;
        }
        byte[] arrayOfByte2 = new byte[6];
        byte[] arrayOfByte1 = new byte[U.length];
        i2 = 0;
        i1 = 0;
        if (i2 >= U.length) {
          break label146;
        }
        if ((U[i2] & 0x1) == 0) {
          break label143;
        }
        i3 = i1 + 1;
        arrayOfByte1[i1] = S[(i2 * 3)];
        S[(i2 * 3 + 1)] = 0;
        S[(i2 * 3 + 2)] = 0;
        Code(arrayOfByte2, S[(i2 * 3)], 0, U[i2]);
        if (!Code(i2, arrayOfByte2)) {
          break label163;
        }
        i1 = i3;
        break label156;
        e();
        if (i1 > 0) {
          return g.Z.I(arrayOfByte1, 0, i1);
        }
      }
      return 0;
      label143:
      break label156;
      label146:
      continue;
      label149:
      Object localObject2 = null;
      int i1 = 0;
      continue;
      label156:
      i2 += 1;
      continue;
      label163:
      i1 = i3;
    }
  }
  
  public static Object[] d(String paramString)
  {
    for (paramString = paramString.toLowerCase(); paramString.startsWith("<"); paramString = paramString.substring(paramString.indexOf('>') + 1)) {}
    int i1 = paramString.indexOf(':');
    String str;
    if (i1 != -1)
    {
      str = paramString.substring(0, i1);
      if (str.indexOf('.') == -1) {
        paramString = paramString.substring(i1 + 1);
      }
    }
    Object localObject2;
    while (!aw.containsKey(str))
    {
      localObject2 = "";
      localObject1 = ax;
      return new Object[] { str, localObject2, localObject1, paramString };
      str = "http";
    }
    Object localObject1 = paramString;
    if (paramString.startsWith("//")) {
      localObject1 = paramString.substring(2);
    }
    i1 = ((String)localObject1).indexOf('?');
    paramString = (String)localObject1;
    if (i1 != -1) {
      paramString = ((String)localObject1).substring(0, i1);
    }
    i1 = paramString.indexOf('/');
    if (i1 != -1)
    {
      localObject1 = paramString.substring(0, i1);
      paramString = paramString.substring(i1);
      label182:
      i1 = ((String)localObject1).indexOf('@');
      localObject2 = localObject1;
      if (i1 != -1) {
        localObject2 = ((String)localObject1).substring(i1 + 1);
      }
      if (!((String)localObject2).startsWith("www.")) {
        break label279;
      }
      localObject2 = ((String)localObject2).substring(4);
    }
    label279:
    for (;;)
    {
      i1 = ((String)localObject2).indexOf(':');
      if (i1 != -1)
      {
        localObject1 = Integer.valueOf(((String)localObject2).substring(i1 + 1));
        localObject2 = ((String)localObject2).substring(0, i1);
        break;
        localObject2 = "";
        localObject1 = paramString;
        paramString = (String)localObject2;
        break label182;
      }
      localObject1 = (Integer)aw.get(str);
      break;
    }
  }
  
  public static void e()
  {
    synchronized (R)
    {
      if (T != null)
      {
        S = T;
        T = null;
      }
      return;
    }
  }
  
  static int f()
  {
    try
    {
      int i1 = ag + 1;
      ag = i1;
      C("md");
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  static int g()
  {
    int i1 = g.Code.N();
    if ((i1 != aa) && (i1 != -1))
    {
      aa = i1;
      C("md");
    }
    return aa;
  }
  
  static int h()
  {
    int i1 = g.Code.O();
    if ((i1 != ab) && (i1 != -1))
    {
      ab = i1;
      C("md");
    }
    return ab;
  }
  
  static int i()
  {
    return au;
  }
  
  static int j()
  {
    return av;
  }
  
  private static void k()
  {
    int i1 = 0;
    for (;;)
    {
      Object localObject3;
      String str3;
      int i4;
      String str2;
      try
      {
        w localw = new w(32);
        i3 = 0;
        i2 = 0;
        String str1 = null;
        if (i1 < V)
        {
          localObject3 = str1;
          if (!g.Code.a(i1))
          {
            localObject3 = X[i1];
            str3 = ((ax)localObject3).d();
            i4 = Code((ax)localObject3);
            str2 = str1;
            if (str1 == null) {
              break label160;
            }
            if (str1.equals(str3))
            {
              str2 = str1;
              if (i4 == i2) {
                break label160;
              }
            }
            Code(localw, i3, i1 - i3, i2, str1);
            str2 = null;
            break label160;
          }
        }
        else
        {
          if (str1 != null) {
            Code(localw, i3, V - i3, i2, str1);
          }
          G = localw.toByteArray();
          return;
        }
      }
      finally {}
      label160:
      do
      {
        localObject2 = localObject3;
        break;
        localObject3 = str2;
      } while (str2 != null);
      int i3 = i1;
      Object localObject2 = str3;
      int i2 = i4;
      i1 += 1;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     b
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */