package com.example.lw.appweb;

final class af
{
  static String Code(byte[] paramArrayOfByte, int paramInt)
  {
    int n = 0;
    int i1 = (paramInt * 4 + 2) / 3;
    int i2 = (4 - i1 % 4) % 4;
    byte[] arrayOfByte = new byte[i1 + i2];
    int j = 0;
    int i = n;
    int k;
    label47:
    int i3;
    if (j < i1)
    {
      k = 0;
      i = 0;
      if (k < 6)
      {
        i3 = j * 6 + k;
        if (i3 / 8 >= paramInt) {
          break label221;
        }
      }
    }
    label221:
    for (int m = paramArrayOfByte[(i3 / 8 + 0)];; m = 0)
    {
      k += 1;
      i = i << 1 | m >> 7 - i3 % 8 & 0x1;
      break label47;
      if (i < 26) {
        i = (char)(i + 65);
      }
      for (;;)
      {
        arrayOfByte[j] = ((byte)i);
        j += 1;
        break;
        if (i < 52) {
          i = (char)(i - 26 + 97);
        } else if (i < 62) {
          i = (char)(i - 52 + 48);
        } else if (i == 62) {
          i = 43;
        } else {
          i = 47;
        }
      }
      while (i < i2)
      {
        arrayOfByte[(i1 + i)] = 61;
        i += 1;
      }
      return new String(arrayOfByte);
    }
  }
  
  static byte[] Code(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length() * 3 / 4];
    int k = 0;
    int m = 0;
    int j = 0;
    int n = 0;
    int i;
    if (k < paramString.length())
    {
      i = paramString.charAt(k);
      if ((i >= 65) && (i <= 90))
      {
        i -= 65;
        label53:
        i |= n << 6;
        j += 6;
        if (j < 8) {
          break label224;
        }
        arrayOfByte[m] = ((byte)(i >> j - 8));
        i ^= arrayOfByte[m] << j - 8;
        m += 1;
        j -= 8;
      }
    }
    label224:
    for (;;)
    {
      k += 1;
      n = i;
      break;
      if ((i >= 97) && (i <= 122))
      {
        i = i - 97 + 26;
        break label53;
      }
      if ((i >= 48) && (i <= 57))
      {
        i = i - 48 + 52;
        break label53;
      }
      if (i == 43)
      {
        i = 62;
        break label53;
      }
      if (i == 47)
      {
        i = 63;
        break label53;
      }
      if (i != 61) {
        return null;
      }
      if (m == arrayOfByte.length) {
        return arrayOfByte;
      }
      paramString = new byte[m];
      System.arraycopy(arrayOfByte, 0, paramString, 0, m);
      return paramString;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     af
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */