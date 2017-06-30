package com.example.lw.appweb;

public class f
{
  public static int Code(int paramInt)
  {
    if (paramInt <= 127) {
      return 1;
    }
    if (paramInt <= 2047) {
      return 2;
    }
    if (paramInt <= 65535) {
      return 3;
    }
    return 4;
  }
  
  public static int Code(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if (paramInt1 <= 127)
    {
      paramArrayOfByte[paramInt2] = ((byte)paramInt1);
      return 1;
    }
    if (paramInt1 <= 2047)
    {
      paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >> 6 | 0xC0));
      paramArrayOfByte[(paramInt2 + 1)] = ((byte)(paramInt1 & 0x3F | 0x80));
      return 2;
    }
    if (paramInt1 <= 65535)
    {
      i = paramInt2 + 1;
      paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >> 12 | 0xE0));
      paramArrayOfByte[i] = ((byte)(paramInt1 >> 6 & 0x3F | 0x80));
      paramArrayOfByte[(i + 1)] = ((byte)(paramInt1 & 0x3F | 0x80));
      return 3;
    }
    int i = paramInt2 + 1;
    paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >> 18 | 0xF0));
    paramInt2 = i + 1;
    paramArrayOfByte[i] = ((byte)(paramInt1 >> 12 & 0x3F | 0x80));
    paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >> 6 & 0x3F | 0x80));
    paramArrayOfByte[(paramInt2 + 1)] = ((byte)(paramInt1 & 0x3F | 0x80));
    return 4;
  }
  
  public static int Code(String paramString)
  {
    int i = 0;
    int j = 0;
    if (i < paramString.length())
    {
      int k = paramString.charAt(i);
      if ((k >= 55296) && (k <= 56319))
      {
        j += 4;
        i += 1;
      }
      for (;;)
      {
        i += 1;
        break;
        j += Code(k);
      }
    }
    return j;
  }
  
  public static int Code(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    int j = 0;
    int k;
    if (i < paramString.length())
    {
      k = paramString.charAt(i);
      if ((k < 55296) || (k > 56319)) {
        break label94;
      }
      i += 1;
      k = paramString.charAt(i) - 56320 + (65536 + (k - 55296 << 10));
    }
    label94:
    for (;;)
    {
      j += Code(k, paramArrayOfByte, paramInt + j + 2);
      i += 1;
      break;
      I(j, paramArrayOfByte, paramInt);
      return j;
    }
  }
  
  public static String Code(byte[] paramArrayOfByte, int paramInt)
  {
    int i = Z(paramArrayOfByte, paramInt);
    paramInt += 2;
    return Code(paramArrayOfByte, paramInt, i + paramInt);
  }
  
  public static String Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new String(Z(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static int I(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[paramInt] << 8) + (paramArrayOfByte[(paramInt + 1)] & 0xFF);
  }
  
  public static void I(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >> 8));
    paramArrayOfByte[(paramInt2 + 1)] = ((byte)paramInt1);
  }
  
  private static boolean I(int paramInt)
  {
    return (paramInt > 0) && (paramInt <= 1114111) && ((paramInt < 55296) || (paramInt > 57343)) && ((paramInt < 64976) || (paramInt > 65007)) && ((paramInt & 0xFFFE) != 65534);
  }
  
  public static boolean I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt2 = paramInt1 + paramInt2;
    for (;;)
    {
      if (paramInt1 < paramInt2) {
        switch ((paramArrayOfByte[paramInt1] & 0xFF) >> 4)
        {
        default: 
          if (paramArrayOfByte[paramInt1] != 0) {
            break;
          }
        case 8: 
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
          int i;
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
                  } while ((paramInt1 + 2 > paramInt2) || ((paramArrayOfByte[(paramInt1 + 1)] & 0xC0) != 128) || ((paramArrayOfByte[paramInt1] & 0x1F) < 2));
                  paramInt1 = paramInt1 + 1 + 1;
                  break;
                } while ((paramInt1 + 3 > paramInt2) || ((paramArrayOfByte[(paramInt1 + 1)] & 0xC0) != 128) || ((paramArrayOfByte[(paramInt1 + 2)] & 0xC0) != 128));
                k = paramInt1 + 1;
                i = paramArrayOfByte[paramInt1];
                j = k + 1;
                k = paramArrayOfByte[k];
                paramInt1 = j + 1;
                i = (k & 0x3F) << 6 | (i & 0xF) << 12 | paramArrayOfByte[j] & 0x3F;
              } while (i < 2048);
              if (I(i)) {
                break;
              }
              return false;
            } while ((paramInt1 + 4 > paramInt2) || ((paramArrayOfByte[(paramInt1 + 1)] & 0xC0) != 128) || ((paramArrayOfByte[(paramInt1 + 2)] & 0xC0) != 128) || ((paramArrayOfByte[(paramInt1 + 3)] & 0xC0) != 128) || ((paramArrayOfByte[paramInt1] & 0x8) != 0));
            int j = paramInt1 + 1;
            i = paramArrayOfByte[paramInt1];
            paramInt1 = j + 1;
            j = paramArrayOfByte[j];
            int k = paramInt1 + 1;
            int m = paramArrayOfByte[paramInt1];
            paramInt1 = k + 1;
            i = (j & 0x3F) << 12 | (i & 0x7) << 18 | (m & 0x3F) << 6 | paramArrayOfByte[k] & 0x3F;
          } while (i < 65536);
          if (I(i)) {
            continue;
          }
          return false;
        }
      } else {
        return true;
      }
      paramInt1 += 1;
    }
  }
  
  public static int J(byte[] paramArrayOfByte, int paramInt)
  {
    return (paramArrayOfByte[paramInt] << 24) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 2)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 3)] & 0xFF);
  }
  
  public static int Z(byte[] paramArrayOfByte, int paramInt)
  {
    return ((paramArrayOfByte[paramInt] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 1)] & 0xFF);
  }
  
  public static void Z(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    paramArrayOfByte[paramInt2] = ((byte)(paramInt1 >> 24));
    paramArrayOfByte[(paramInt2 + 1)] = ((byte)(paramInt1 >> 16));
    paramArrayOfByte[(paramInt2 + 2)] = ((byte)(paramInt1 >> 8));
    paramArrayOfByte[(paramInt2 + 3)] = ((byte)paramInt1);
  }
  
  private static char[] Z(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int k = 0;
    int i = 0;
    int m;
    for (int j = paramInt1; j < paramInt2; j = m)
    {
      int n = az.I(paramArrayOfByte[j]);
      m = j + n;
      j = i;
      if (n == 4) {
        j = i + 1;
      }
      i = j + 1;
    }
    char[] arrayOfChar = new char[i];
    i = paramInt1;
    paramInt1 = k;
    if (i < paramInt2)
    {
      k = az.B(paramArrayOfByte, i);
      if (k <= 65535)
      {
        j = paramInt1 + 1;
        arrayOfChar[paramInt1] = ((char)k);
        paramInt1 = j;
      }
      for (;;)
      {
        i += az.I(paramArrayOfByte[i]);
        break;
        j = paramInt1 + 1;
        arrayOfChar[paramInt1] = ((char)(0xD800 | k - 65536 >> 10));
        paramInt1 = j + 1;
        arrayOfChar[j] = ((char)(0xDC00 | k & 0x3FF));
      }
    }
    return arrayOfChar;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     f
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */