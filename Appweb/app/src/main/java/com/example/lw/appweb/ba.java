package com.example.lw.appweb;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public final class ba
{
  private static final s B = new s("server", "*", 0, "setup", 1);
  private static final bb C = new bb(0, 0, "mini5.opera-mini.net", 80, 1080, "c1dd7ab77e2c967746fe10681026c920f864811321bcb8be6bbfa5a03fda4e16c9c8db3af280f7703366e778e93c55e7159a8852d2b1381e521a337f22b1406cddf41a3114aecb4f4bfe79e0c5aa2ba8824fc989cb8bdcbf8ec5cef5176bfd4059f229b91bfa025126b295f9c409e75f6f6415ee094fd7f5dfd395a1f431668c5a08e88de891dc4dd38d4e9aa9b9c00dc604a0428e3aa5a28ccfa75af099147b", "mini5.opera-mini.net");
  static int Code = 0;
  private static s[] I;
  private static final s J = new s("i", "*", 0, "/firsttime/*", 1);
  private static bb[] Z;
  private static bb a;
  
  public static int Code(String paramString1, String paramString2)
  {
    for (;;)
    {
      try
      {
        paramString1 = b.d(paramString1);
        int i = 0;
        if (i < I.length)
        {
          s locals = I[i];
          String str1 = (String)paramString1[0];
          String str2 = (String)paramString1[1];
          j = ((Integer)paramString1[2]).intValue();
          String str3 = (String)paramString1[3];
          if ((!b.I(locals.Code, str1)) || (!b.I(locals.I, str2)) || ((locals.Z != 0) && (j != locals.Z)) || (!b.I(locals.J, str3))) {
            break label159;
          }
          j = 1;
          if (j != 0)
          {
            if (I[i].B == 255) {
              return Code(paramString2, null);
            }
            i = I[i].B;
            return i;
          }
          i += 1;
          continue;
        }
        return 0;
      }
      catch (Throwable paramString1) {}
      label159:
      int j = 0;
    }
  }
  
  public static bb Code(int paramInt)
  {
    bb localbb2 = C;
    bb localbb3 = a;
    int i = 0;
    if (i < Z.length) {
      if (Z[i].Code != paramInt) {}
    }
    int j;
    int k;
    int m;
    Object localObject3;
    Object localObject2;
    int n;
    Object localObject1;
    for (bb localbb1 = Z[i];; localbb1 = null)
    {
      i = 0;
      j = 0;
      k = 0;
      m = 0;
      localObject3 = null;
      localObject2 = null;
      n = 0;
      localObject1 = null;
      while (i < 3)
      {
        bb localbb4 = new bb[] { localbb2, localbb3, localbb1 }[i];
        int i1 = j;
        Object localObject6 = localObject1;
        Object localObject5 = localObject2;
        Object localObject4 = localObject3;
        if (localbb4 != null)
        {
          if (localbb4.Z.length() != 0)
          {
            localObject1 = localbb4.Z;
            j = i;
            localObject2 = localObject1;
          }
          if (localbb4.C.length() != 0) {
            localObject3 = localbb4.C;
          }
          n = localbb4.I;
          m = localbb4.J;
          k = localbb4.B;
          localObject4 = localObject3;
          localObject5 = localObject2;
          localObject6 = localObject1;
          i1 = j;
        }
        i += 1;
        j = i1;
        localObject1 = localObject6;
        localObject2 = localObject5;
        localObject3 = localObject4;
      }
      i += 1;
      break;
    }
    if (j == 2) {
      localObject1 = Code((String)localObject1);
    }
    for (;;)
    {
      return new bb(paramInt, n, (String)localObject2, m, k, (String)localObject3, (String)localObject1);
      if (paramInt != 0) {
        localObject2 = Code((String)localObject2, paramInt);
      }
    }
  }
  
  private static String Code(String paramString)
  {
    int i = paramString.indexOf('.');
    int j = paramString.lastIndexOf('-', i - 1);
    try
    {
      int k = Integer.parseInt(paramString.substring(j, i));
      String str = paramString;
      if (k >= -255)
      {
        str = paramString;
        if (k < 0) {
          str = paramString.substring(0, j) + paramString.substring(i);
        }
      }
      return str;
    }
    catch (Throwable localThrowable) {}
    return paramString;
  }
  
  private static String Code(String paramString, int paramInt)
  {
    int i = paramString.indexOf('.');
    String str = paramString;
    if (i > 0) {
      str = paramString.substring(0, i) + '-' + paramInt + paramString.substring(i);
    }
    return str;
  }
  
  static void Code()
  {
    j.Code.Z("zerorating");
    try
    {
      I(az.J(j.Code.Code("trafficrouting", 1), 0), j.Code.Code("trafficrouting", 2));
      return;
    }
    catch (Throwable localThrowable)
    {
      Z();
    }
  }
  
  /* Error */
  static void Code(int paramInt, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: iload_0
    //   4: aload_1
    //   5: invokestatic 170	ba:I	(I[B)V
    //   8: getstatic 152	j:Code	Lj;
    //   11: ldc 159
    //   13: invokevirtual 157	j:Z	(Ljava/lang/String;)V
    //   16: iconst_4
    //   17: newarray byte
    //   19: astore_2
    //   20: getstatic 19	ba:Code	I
    //   23: aload_2
    //   24: iconst_0
    //   25: invokestatic 175	az:Z	(I[BI)V
    //   28: getstatic 152	j:Code	Lj;
    //   31: ldc 159
    //   33: aload_2
    //   34: invokevirtual 178	j:Code	(Ljava/lang/String;[B)I
    //   37: pop
    //   38: getstatic 152	j:Code	Lj;
    //   41: ldc 159
    //   43: aload_1
    //   44: invokevirtual 178	j:Code	(Ljava/lang/String;[B)I
    //   47: pop
    //   48: ldc 2
    //   50: monitorexit
    //   51: return
    //   52: astore_1
    //   53: ldc 2
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    //   58: astore_1
    //   59: goto -11 -> 48
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	paramInt	int
    //   0	62	1	paramArrayOfByte	byte[]
    //   19	15	2	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   3	48	52	finally
    //   3	48	58	java/lang/Throwable
  }
  
  public static bb I(int paramInt)
  {
    return new bb(paramInt, C.I, Code(C.Z, 1), C.J, C.B, C.C, C.Z);
  }
  
  private static void I(int paramInt, byte[] paramArrayOfByte)
  {
    for (;;)
    {
      try
      {
        DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
        int i;
        try
        {
          Z();
          paramArrayOfByte = null;
          int j = localDataInputStream.readUnsignedByte();
          bb[] arrayOfbb = new bb[j];
          i = 0;
          Object localObject;
          if (i < j)
          {
            int k = localDataInputStream.readUnsignedByte();
            int m = localDataInputStream.readUnsignedByte();
            localObject = localDataInputStream.readUTF();
            arrayOfbb[i] = new bb(k, m, (String)localObject, localDataInputStream.readUnsignedShort(), localDataInputStream.readUnsignedShort(), localDataInputStream.readUTF(), (String)localObject);
            if (arrayOfbb[i].Code == 255) {
              paramArrayOfByte = arrayOfbb[i];
            }
          }
          else
          {
            j = localDataInputStream.readUnsignedByte();
            localObject = new s[j + 2];
            localObject[0] = B;
            i = 1;
            if (i <= j)
            {
              localObject[i] = new s(localDataInputStream.readUTF(), localDataInputStream.readUTF(), localDataInputStream.readUnsignedShort(), localDataInputStream.readUTF(), localDataInputStream.readUnsignedByte());
              i += 1;
              continue;
            }
            localObject[(j + 1)] = J;
            a = paramArrayOfByte;
            Z = arrayOfbb;
            I = (s[])localObject;
            Code = paramInt;
            return;
          }
        }
        catch (IOException paramArrayOfByte)
        {
          throw paramArrayOfByte;
        }
        i += 1;
      }
      finally {}
    }
  }
  
  /* Error */
  public static boolean I()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 152	j:Code	Lj;
    //   6: ldc 159
    //   8: invokevirtual 157	j:Z	(Ljava/lang/String;)V
    //   11: getstatic 19	ba:Code	I
    //   14: ifeq +13 -> 27
    //   17: invokestatic 172	ba:Z	()V
    //   20: iconst_1
    //   21: istore_0
    //   22: ldc 2
    //   24: monitorexit
    //   25: iload_0
    //   26: ireturn
    //   27: iconst_0
    //   28: istore_0
    //   29: goto -7 -> 22
    //   32: astore_1
    //   33: ldc 2
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   21	8	0	bool	boolean
    //   32	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	20	32	finally
  }
  
  private static void Z()
  {
    I = new s[] { J, B };
    Z = new bb[0];
    a = null;
    Code = 0;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ba
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */