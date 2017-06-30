package com.example.lw.appweb;

public final class c
{
  private static int Code(int paramInt, int[] paramArrayOfInt)
  {
    while (paramArrayOfInt[paramInt] == 0)
    {
      int i = paramInt + 1;
      paramInt = i;
      if (i == paramArrayOfInt.length) {
        return 0;
      }
    }
    return paramArrayOfInt.length - paramInt;
  }
  
  public static int[] Code(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int[] arrayOfInt1 = new int[paramArrayOfInt2.length];
    int[] arrayOfInt2 = new int[paramArrayOfInt2.length * 2];
    Code(arrayOfInt2, paramArrayOfInt1, paramArrayOfInt1);
    I(arrayOfInt2, paramArrayOfInt2);
    System.arraycopy(arrayOfInt2, arrayOfInt2.length - arrayOfInt1.length, arrayOfInt1, 0, arrayOfInt1.length);
    int i = 0;
    while (i < arrayOfInt2.length)
    {
      arrayOfInt2[i] = 0;
      i += 1;
    }
    Code(arrayOfInt2, arrayOfInt1, paramArrayOfInt1);
    I(arrayOfInt2, paramArrayOfInt2);
    System.arraycopy(arrayOfInt2, arrayOfInt2.length - arrayOfInt1.length, arrayOfInt1, 0, arrayOfInt1.length);
    return arrayOfInt1;
  }
  
  private static int[] Code(int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
  {
    int i = paramArrayOfInt3.length - 1;
    while (i >= 0)
    {
      long l2 = paramArrayOfInt3[i];
      long l1 = 0L;
      int j = paramArrayOfInt2.length - 1;
      while (j >= 0)
      {
        l1 += (paramArrayOfInt2[j] & 0xFFFFFFFF) * (l2 & 0xFFFFFFFF) + (paramArrayOfInt1[(i + j + 1)] & 0xFFFFFFFF);
        paramArrayOfInt1[(i + j + 1)] = ((int)l1);
        l1 >>>= 32;
        j -= 1;
      }
      paramArrayOfInt1[i] = ((int)l1);
      i -= 1;
    }
    return paramArrayOfInt1;
  }
  
  private static void I(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    int i2 = paramArrayOfInt1.length - Code(0, paramArrayOfInt1);
    int i3 = paramArrayOfInt2.length - Code(0, paramArrayOfInt2);
    int i = paramArrayOfInt1.length - i2 - (paramArrayOfInt2.length - i3);
    int[] arrayOfInt = new int[paramArrayOfInt2.length - i3 + i];
    int k = i * 32;
    int j;
    int i5;
    int i4;
    label98:
    int m;
    int n;
    label165:
    label185:
    int i1;
    int i6;
    if (k >= 0)
    {
      j = k >>> 5;
      i5 = k & 0x1F;
      i4 = paramArrayOfInt2.length - i3;
      if (i5 == 0)
      {
        System.arraycopy(paramArrayOfInt2, i3, arrayOfInt, arrayOfInt.length - i4 - j, i4);
        i = j;
        i4 = arrayOfInt.length - i4 - i;
        for (;;)
        {
          m = paramArrayOfInt1.length - Code(i2, paramArrayOfInt1);
          n = arrayOfInt.length - Code(i4, arrayOfInt);
          i = n;
          j = m;
          if (paramArrayOfInt1.length - m == arrayOfInt.length - n) {
            break;
          }
          i = paramArrayOfInt1.length - m - (arrayOfInt.length - n);
          if (i < 0) {
            break label470;
          }
          i = paramArrayOfInt1.length;
          m = arrayOfInt.length - 1;
          j = 0;
          i -= 1;
          long l = paramArrayOfInt1[i];
          i1 = m - 1;
          l = (l & 0xFFFFFFFF) - (arrayOfInt[m] & 0xFFFFFFFF) + j;
          j = i - 1;
          paramArrayOfInt1[i] = ((int)l);
          n = (int)(l >> 63);
          if (i1 >= i4) {
            break label480;
          }
          while ((j >= i2) && (l < 0L))
          {
            l = (paramArrayOfInt1[j] & 0xFFFFFFFF) + n;
            paramArrayOfInt1[j] = ((int)l);
            j -= 1;
          }
        }
      }
      i6 = 32 - i5;
      n = paramArrayOfInt2[i3] >>> i6;
      i = j;
      if (n != 0) {
        i = j + 1;
      }
      j = arrayOfInt.length - i4 - i;
      if (n == 0) {
        break label492;
      }
      m = j + 1;
      arrayOfInt[j] = n;
      j = m;
    }
    label470:
    label480:
    label492:
    for (;;)
    {
      n = paramArrayOfInt2[i3];
      m = i3 + 1;
      while (m < i4)
      {
        i1 = paramArrayOfInt2[m];
        arrayOfInt[j] = (n << i5 | i1 >>> i6);
        m += 1;
        n = i1;
        j += 1;
      }
      arrayOfInt[j] = (paramArrayOfInt2[(i4 + i3 - 1)] << i5);
      break label98;
      while ((j < paramArrayOfInt1.length - 1) && (paramArrayOfInt1[j] == arrayOfInt[i]))
      {
        j += 1;
        i += 1;
      }
      i = (int)((paramArrayOfInt1[j] & 0xFFFFFFFF) - (arrayOfInt[i] & 0xFFFFFFFF) >> 63);
      break label165;
      k -= 1;
      break;
      return;
      i = j;
      m = i1;
      j = n;
      break label185;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     c
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */