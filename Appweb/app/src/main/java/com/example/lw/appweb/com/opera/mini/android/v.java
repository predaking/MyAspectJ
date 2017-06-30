package com.example.lw.appweb.com.opera.mini.android;

import android.graphics.Paint;

final class v
{
  private static int[] B = new int[32];
  private static int[] C = new int[32];
  private static char[] Code;
  private static float[] I;
  private static n J;
  private static int Z = -64;
  
  public static int Code(n paramn, char paramChar)
  {
    char c2 = '\000';
    char c3 = '\001';
    char c1;
    int j;
    int k;
    label154:
    int i;
    for (;;)
    {
      try
      {
        n localn = J;
        if (localn != paramn)
        {
          paramChar = '����';
          return paramChar;
        }
        c1 = Z;
        if ((paramChar >= Z) && (paramChar < c1 + '@')) {
          break label300;
        }
        paramn = J.J();
        Z = paramChar / '@' * 64;
        c1 = '\000';
        if (c1 < '@')
        {
          Code[c1] = ((char)(Z + c1));
          c1 += '\001';
          continue;
        }
        j = paramChar / '@' / 32;
        k = paramChar / '@' % 32;
        if ((B[j] >> k & 0x1) != 1) {
          break label371;
        }
        c1 = '\001';
      }
      finally {}
      if (c1 < '@')
      {
        I[c1] = paramn.measureText(Code, c1, 1);
        c1 += '\001';
        continue;
        if ((C[j] >> k & 0x1) == 1)
        {
          i = 1;
          break label376;
        }
      }
    }
    for (;;)
    {
      if (c1 < '@')
      {
        i = Character.getDirectionality(paramChar + c1);
        if ((i == 1) || (i == 2) || (i == 6) || (i == 16) || (i == 17))
        {
          C[j] = (1 << k | C[j]);
          c1 = c3;
          break label362;
          i = 0;
          break label376;
        }
        else
        {
          c1 += '\001';
        }
      }
      else
      {
        B[j] = (1 << k | B[j]);
        c1 = '\000';
        label286:
        label300:
        label362:
        label371:
        label374:
        label376:
        do
        {
          break label362;
          paramn.getTextWidths(Code, 0, 64, I);
          float f = I[(paramChar % '@')];
          paramChar = c2;
          if (f < 0.0F) {
            break;
          }
          if (f > 1024.0F)
          {
            paramChar = 'Ѐ';
            break;
          }
          if (f - (int)f > 0.0F)
          {
            paramChar = (int)f + 1;
            break;
          }
          paramChar = (int)f;
          break;
          for (;;)
          {
            if (c1 == 0) {
              break label374;
            }
            c1 = '\000';
            if (c1 == 0) {
              break label286;
            }
            c1 = '\000';
            break;
            c1 = '\000';
          }
          break label154;
          c1 = c3;
        } while (i != 0);
        c1 = '\000';
      }
    }
  }
  
  public static void Code()
  {
    try
    {
      J = null;
      Z = -64;
      Code = null;
      I = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static void Code(n paramn)
  {
    try
    {
      if (J != paramn)
      {
        J = paramn;
        Z = -64;
        if (Code == null) {
          Code = new char[64];
        }
        if (I == null) {
          I = new float[64];
        }
      }
      return;
    }
    finally {}
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.v
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */