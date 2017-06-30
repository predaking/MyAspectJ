package com.example.lw.appweb;

final class x
{
  private static final byte[] Code = new byte[256];
  private static final byte[] I = new byte[366];
  private static final int[] Z = new int[366];
  
  private static int Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt3;
    if (paramInt1 == paramInt2 - 1) {
      i = paramInt3 - paramInt4;
    }
    return Math.max(0, i);
  }
  
  /* Error */
  public static void Code()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 31	java/io/DataInputStream
    //   5: dup
    //   6: ldc 33
    //   8: invokestatic 39	b:J	(Ljava/lang/String;)Ljava/io/InputStream;
    //   11: invokespecial 42	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   14: astore_1
    //   15: aload_1
    //   16: getstatic 13	x:Code	[B
    //   19: invokevirtual 46	java/io/DataInputStream:readFully	([B)V
    //   22: aload_1
    //   23: getstatic 15	x:I	[B
    //   26: invokevirtual 46	java/io/DataInputStream:readFully	([B)V
    //   29: iconst_0
    //   30: istore_0
    //   31: iload_0
    //   32: sipush 366
    //   35: if_icmpge +22 -> 57
    //   38: getstatic 17	x:Z	[I
    //   41: iload_0
    //   42: aload_1
    //   43: invokevirtual 50	java/io/DataInputStream:readShort	()S
    //   46: ldc 51
    //   48: iand
    //   49: iastore
    //   50: iload_0
    //   51: iconst_1
    //   52: iadd
    //   53: istore_0
    //   54: goto -23 -> 31
    //   57: aload_1
    //   58: invokestatic 53	b:Code	(Ljava/io/InputStream;)V
    //   61: return
    //   62: astore_1
    //   63: aconst_null
    //   64: astore_1
    //   65: aload_1
    //   66: invokestatic 53	b:Code	(Ljava/io/InputStream;)V
    //   69: return
    //   70: astore_3
    //   71: aload_2
    //   72: astore_1
    //   73: aload_3
    //   74: astore_2
    //   75: aload_1
    //   76: invokestatic 53	b:Code	(Ljava/io/InputStream;)V
    //   79: aload_2
    //   80: athrow
    //   81: astore_2
    //   82: goto -7 -> 75
    //   85: astore_2
    //   86: goto -21 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   30	24	0	i	int
    //   14	44	1	localDataInputStream	java.io.DataInputStream
    //   62	1	1	localException1	java.lang.Exception
    //   64	12	1	localObject1	Object
    //   1	79	2	localObject2	Object
    //   81	1	2	localObject3	Object
    //   85	1	2	localException2	java.lang.Exception
    //   70	4	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	15	62	java/lang/Exception
    //   2	15	70	finally
    //   15	29	81	finally
    //   38	50	81	finally
    //   15	29	85	java/lang/Exception
    //   38	50	85	java/lang/Exception
  }
  
  public static void Code(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, ax paramax, B paramB)
  {
    int i = 0;
    int i6 = paramArrayOfChar.length;
    int m = 0;
    int n = 0;
    int j = 0;
    int k = 0;
    char c2;
    char c1;
    int i1;
    label76:
    label110:
    int i2;
    if (i < i6)
    {
      c2 = paramArrayOfChar[i];
      c1 = '\000';
      if (i + 1 < i6) {
        c1 = paramArrayOfChar[(i + 1)];
      }
      if (((I(c2) & 0x8) != 0) || ((I(c1) & 0x4) != 0))
      {
        i1 = 0;
        if ((i1 == 0) && (!Code(c2)) && (i != i6 - 1)) {
          break label670;
        }
        if (!Code(c2)) {
          break label293;
        }
        char c3 = c2;
        if ((c2 != '\r') || (c1 != '\n')) {
          break label299;
        }
        i1 = i + 1;
        i = 2;
        i2 = -1;
      }
    }
    for (;;)
    {
      label136:
      int i4 = i1 - m + 1;
      int i7 = i1 - j + 1;
      int i5 = paramax.Code(paramArrayOfChar, j, i7);
      if (i != 0) {}
      for (int i3 = paramax.Code(paramArrayOfChar, j, i7 - i);; i3 = i5)
      {
        if (i3 + k > Code(n, paramInt2, paramInt1, paramInt3)) {
          if (m != j) {
            i = j - m;
          }
        }
        for (;;)
        {
          if (!Code(paramB, paramArrayOfChar, m, i, n, paramInt2, paramInt3, 0))
          {
            n += 1;
            i = m + i;
            j = i;
            k = 0;
            m = i;
            break;
            if ((I(c2) == 0) && (I(c1) == 0))
            {
              i1 = 0;
              break label76;
            }
            i1 = 1;
            break label76;
            label293:
            i2 = 0;
            break label110;
            label299:
            if ((c2 != ' ') && (!Code(c2))) {
              break label693;
            }
            i3 = 1;
            i1 = i;
            i = i3;
            break label136;
            if ((i7 - i == 1) || ((b.B(c2)) && (i7 - i == 2))) {
              break label679;
            }
            i3 = Code(n, paramInt2, paramInt1, paramInt3);
            if (Code(paramArrayOfChar, j)) {}
            for (i2 = 2;; i2 = 1)
            {
              i4 = i2 + j;
              for (i = i1 - i;; i = i1 - 1)
              {
                i2 = i;
                if (i <= i4) {
                  break;
                }
                i1 = i;
                if (Code(paramArrayOfChar, i - 1)) {
                  i1 = i - 1;
                }
                i2 = i1;
                if (paramax.Code(paramArrayOfChar, j, i1 - j) <= i3 - k) {
                  break;
                }
                i2 = i1;
                if (i1 <= i4) {
                  break;
                }
              }
            }
            i = Math.max(i2, i4) - m;
            continue;
            if ((!Code(c2)) && (i1 != i6 - 1)) {
              break label647;
            }
            if ((!Code(c2)) || (m + i4 != i6)) {
              break label621;
            }
            j = 1;
            k = i;
            if (paramInt3 == 0)
            {
              k = i;
              if (paramB == null) {
                k = 0;
              }
            }
            if ((i1 != i6 - 1) || (j != 0)) {
              break label627;
            }
          }
          label621:
          label627:
          for (i = 0;; i = paramInt3)
          {
            if (!Code(paramB, paramArrayOfChar, m, i4 - k, n, paramInt2, i, i2))
            {
              n += 1;
              i = m + i4;
              if (j == 0) {
                break label633;
              }
              Code(paramB, paramArrayOfChar, 0, 0, n, paramInt2, 0, 0);
            }
            return;
            j = 0;
            break;
          }
          label633:
          j = i;
          k = 0;
          m = i;
          break;
          label647:
          j += i7;
          k += i5;
          i = i1 + 1;
          break;
          label670:
          i += 1;
          break;
          label679:
          i = i4;
        }
      }
      label693:
      i3 = 0;
      i1 = i;
      i = i3;
    }
  }
  
  public static boolean Code(char paramChar)
  {
    return (paramChar == '\n') || (paramChar == '\r') || (paramChar == '\013') || (paramChar == '') || (paramChar == '\f') || (paramChar == ' ') || (paramChar == ' ');
  }
  
  private static boolean Code(B paramB, char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    if ((paramInt4 > 0) && (paramInt3 >= paramInt4 - 1)) {}
    for (boolean bool = true;; bool = false)
    {
      paramInt4 = paramInt2;
      if (bool)
      {
        paramInt4 = paramInt2;
        if (paramInt5 != 0)
        {
          paramInt4 = paramInt2;
          if (paramInt2 > 0)
          {
            paramInt4 = paramInt2;
            if (paramArrayOfChar[(paramInt1 + paramInt2 - 1)] == ' ') {
              paramInt4 = paramInt2 - 1;
            }
          }
        }
      }
      if (paramB == null) {
        break;
      }
      paramB.Code(paramArrayOfChar, paramInt3, paramInt1, paramInt1 + paramInt4, paramInt6);
      if ((bool) && (paramInt5 != 0)) {
        paramB.Code(paramInt3);
      }
      return bool;
    }
    g.Code(paramArrayOfChar, paramInt1, paramInt1 + paramInt4);
    return bool;
  }
  
  private static boolean Code(char[] paramArrayOfChar, int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < paramArrayOfChar.length)) {
      return b.B(paramArrayOfChar[paramInt]);
    }
    return false;
  }
  
  private static int I(char paramChar)
  {
    int i = 0;
    if (paramChar < 'Ā') {
      i = Code[paramChar];
    }
    while (paramChar >= 65533) {
      return i;
    }
    int j = Z.length;
    i = 0;
    for (;;)
    {
      int k = (j + i) / 2;
      if (Z[k] <= paramChar)
      {
        if (Z[(k + 1)] > paramChar) {
          return I[k];
        }
        i = k;
      }
      else
      {
        j = k;
      }
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     x
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */