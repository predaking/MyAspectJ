package com.example.lw.appweb;

import java.util.Stack;
import java.util.Vector;

final class B
{
  private final Vector B = new Vector();
  private char[] Code;
  private byte I = -1;
  private byte[] J;
  private final ax Z;
  
  B(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, String paramString, ax paramax)
  {
    this.Code = paramArrayOfChar;
    this.Z = paramax;
    int i = 0;
    if (i < this.Code.length)
    {
      int k = I(this.Code[i]);
      if (k == 1) {
        this.I = 0;
      }
      while ((k & 0x6) <= 0)
      {
        i += 1;
        break;
      }
      if (this.I < 0) {
        this.I = 1;
      }
      this.J = I(this.I);
    }
    if (this.I < 0)
    {
      this.I = 0;
      this.J = null;
    }
    if (paramInt1 == 0) {
      paramInt1 = 2147483647;
    }
    for (;;)
    {
      boolean bool;
      if ((paramInt3 & 0x1) == 0)
      {
        paramInt2 = this.Code.length;
        if ((paramInt3 & 0x6) == 0) {
          break label322;
        }
        if ((paramInt3 & 0x4) != 0)
        {
          bool = true;
          paramInt1 = b.Code(this.Code, bool, paramInt1, paramax.Code(paramString), paramax);
          if (!bool) {
            break label243;
          }
          paramInt3 = 0;
          paramInt2 = paramInt1;
          paramInt1 = paramInt3;
        }
      }
      for (;;)
      {
        if (paramInt1 > 0) {
          Code(0);
        }
        Code(this.Code, 0, paramInt1, paramInt2, 0);
        if (paramInt2 < this.Code.length) {
          Code(0);
        }
        return;
        bool = false;
        break;
        label243:
        continue;
        if ((paramInt3 & 0x4) != 0)
        {
          paramInt3 = j;
          paramArrayOfChar = this.Code;
          if (paramInt3 == 0) {
            break label311;
          }
          paramInt2 /= paramax.c();
          label277:
          if (paramInt3 == 0) {
            break label316;
          }
        }
        label311:
        label316:
        for (paramInt3 = paramax.Code(paramString);; paramInt3 = 0)
        {
          x.Code(paramArrayOfChar, paramInt1, paramInt2, paramInt3, paramax, this);
          return;
          paramInt3 = 0;
          break;
          paramInt2 = 0;
          break label277;
        }
        label322:
        paramInt1 = 0;
      }
    }
  }
  
  private static byte Code(byte paramByte)
  {
    if ((paramByte & 0x1) == 0) {
      return 1;
    }
    return 2;
  }
  
  public static int Code(char[] paramArrayOfChar, int paramInt)
  {
    int m = 0;
    int j;
    if ((paramInt & 0x8) != 0)
    {
      j = 0;
      if (j < paramArrayOfChar.length)
      {
        k = "()<>[]{}«»‘’“”‹›".indexOf(paramArrayOfChar[j]);
        if (k >= 0)
        {
          if ((k & 0x1) != 0) {
            break label63;
          }
          k += 1;
        }
        for (;;)
        {
          paramArrayOfChar[j] = "()<>[]{}«»‘’“”‹›".charAt(k);
          j += 1;
          break;
          label63:
          k -= 1;
        }
      }
    }
    if ((paramInt & 0x4) != 0)
    {
      k = paramArrayOfChar.length;
      int n = k / 2;
      j = 0;
      while (j < n)
      {
        int i = paramArrayOfChar[j];
        paramArrayOfChar[j] = paramArrayOfChar[(k - j - 1)];
        paramArrayOfChar[(k - j - 1)] = i;
        j += 1;
      }
    }
    int k = paramArrayOfChar.length;
    if ((paramInt & 0x2) != 0)
    {
      paramInt = 0;
      j = m;
      k = paramInt;
      if (j < paramArrayOfChar.length)
      {
        if (Code(paramArrayOfChar[paramInt])) {
          System.arraycopy(paramArrayOfChar, paramInt + 1, paramArrayOfChar, paramInt, paramArrayOfChar.length - (paramInt + 1));
        }
        for (;;)
        {
          j += 1;
          break;
          paramInt += 1;
        }
      }
    }
    return k;
  }
  
  private static void Code(byte[] paramArrayOfByte, byte paramByte1, int paramInt1, int paramInt2, byte paramByte2, byte paramByte3)
  {
    int m;
    label128:
    label163:
    for (int j = paramInt1; j < paramInt2; j = m + 1)
    {
      if (paramArrayOfByte[j] == -128)
      {
        m = j;
        int k;
        do
        {
          k = m + 1;
          if (k >= paramInt2) {
            break;
          }
          m = k;
        } while (paramArrayOfByte[k] == -128);
        int n;
        label73:
        int i;
        if (j > paramInt1)
        {
          m = paramArrayOfByte[(j - 1)];
          if (k >= paramInt2) {
            break label121;
          }
          n = paramArrayOfByte[k];
          if ((m != 1) || (n != 1)) {
            break label128;
          }
          i = 1;
        }
        for (;;)
        {
          m = k;
          if (j >= k) {
            break label163;
          }
          paramArrayOfByte[j] = i;
          j += 1;
          continue;
          m = paramByte2;
          break;
          label121:
          n = paramByte3;
          break label73;
          if (((m & 0x1A) != 0) && ((n & 0x1A) != 0)) {
            i = 2;
          } else {
            i = Code(paramByte1);
          }
        }
      }
      m = j;
    }
  }
  
  private static void Code(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 < paramInt2) {
      if (((paramArrayOfByte1[paramInt1] == 1) && ((paramArrayOfByte2[paramInt1] & 0x1) != 0)) || ((paramArrayOfByte1[paramInt1] == 2) && ((paramArrayOfByte2[paramInt1] & 0x1) == 0))) {
        i = paramArrayOfByte2[paramInt1];
      }
    }
    label121:
    for (;;)
    {
      byte[] arrayOfByte = paramArrayOfByte2;
      int k = paramInt1;
      int m = 1;
      int j = i;
      for (i = m;; i = 2)
      {
        arrayOfByte[k] = ((byte)(i + j));
        do
        {
          paramInt1 += 1;
          break;
        } while ((paramArrayOfByte1[paramInt1] != 16) && (paramArrayOfByte1[paramInt1] != 8));
        i = paramArrayOfByte2[paramInt1];
        if ((paramArrayOfByte2[paramInt1] & 0x1) != 0) {
          break label121;
        }
        j = i;
        k = paramInt1;
        arrayOfByte = paramArrayOfByte2;
      }
      return;
    }
  }
  
  private static boolean Code(char paramChar)
  {
    return (x.Code(paramChar)) || (paramChar == '‎') || (paramChar == '‏');
  }
  
  private static byte I(char paramChar)
  {
    byte b2 = 2;
    byte b1;
    if ((" -=_/|\\:;.,،!?&$#'`´\"\t\n".indexOf(paramChar) >= 0) || ("()<>[]{}«»‘’“”‹›".indexOf(paramChar) >= 0)) {
      b1 = -128;
    }
    do
    {
      do
      {
        return b1;
        if (('‪' <= paramChar) && (paramChar <= '‮')) {
          return 64;
        }
        b1 = b2;
      } while (paramChar == '‏');
      b1 = b2;
    } while (b.I(paramChar));
    if (('٠' <= paramChar) && (paramChar <= '٩')) {
      return 16;
    }
    if (b.Z(paramChar)) {
      return 4;
    }
    if (('0' <= paramChar) && (paramChar <= '9')) {
      return 8;
    }
    return 1;
  }
  
  private byte[] I(byte paramByte)
  {
    int i1 = 1;
    Object localObject2 = new byte[this.Code.length];
    Object localObject1 = new byte[this.Code.length];
    int k = 0;
    while (k < this.Code.length)
    {
      j = I(this.Code[k]);
      i = j;
      if (j == 4) {
        i = 2;
      }
      localObject1[k] = i;
      localObject2[k] = paramByte;
      k += 1;
    }
    Object localObject3 = new Stack();
    k = 0;
    int m = 0;
    int i = -128;
    int j = paramByte;
    if (k < this.Code.length) {
      switch (this.Code[k])
      {
      default: 
        localObject2[k] = j;
        if (i != -128) {
          localObject1[k] = i;
        }
        m += 1;
      }
    }
    for (;;)
    {
      k += 1;
      break;
      ((Stack)localObject3).push(new byte[] { j, i });
      if ((j & 0x1) == 0) {}
      for (byte b = 1;; b = 2)
      {
        j = (byte)(b + j);
        i = -128;
        break;
      }
      ((Stack)localObject3).push(new byte[] { j, i });
      if ((j & 0x1) == 0) {}
      for (b = 2;; b = 1)
      {
        j = (byte)(b + j);
        i = -128;
        break;
      }
      ((Stack)localObject3).push(new byte[] { j, i });
      if ((j & 0x1) == 0) {}
      for (b = 1;; b = 2)
      {
        j = (byte)(b + j);
        i = 2;
        break;
      }
      ((Stack)localObject3).push(new byte[] { j, i });
      if ((j & 0x1) == 0) {}
      for (b = 2;; b = 1)
      {
        j = (byte)(b + j);
        i = 1;
        break;
      }
      if (!((Stack)localObject3).empty())
      {
        byte[] arrayOfByte = (byte[])((Stack)localObject3).pop();
        j = arrayOfByte[0];
        i = arrayOfByte[1];
        continue;
        int n;
        if (m < this.Code.length)
        {
          char[] arrayOfChar = new char[m];
          localObject3 = new byte[m];
          arrayOfByte = new byte[m];
          m = 0;
          k = 0;
          while (k < this.Code.length)
          {
            if (this.Code[k] >= '‪')
            {
              b = m;
              if (this.Code[k] <= '‮') {}
            }
            else
            {
              arrayOfChar[m] = this.Code[k];
              localObject3[m] = localObject2[k];
              arrayOfByte[m] = localObject1[k];
              n = m + 1;
            }
            k += 1;
            m = n;
          }
          this.Code = arrayOfChar;
          localObject1 = arrayOfByte;
          localObject2 = localObject3;
        }
        for (;;)
        {
          n = paramByte;
          m = 0;
          k = i1;
          if (m < localObject2.length)
          {
            i = localObject2[m];
            while ((k < localObject2.length) && (localObject2[k] == i)) {
              k += 1;
            }
            j = Code((byte)Math.max(n, i));
            if (k < localObject2.length) {}
            for (n = localObject2[k];; n = paramByte)
            {
              Code((byte[])localObject1, i, m, k, j, Code((byte)Math.max(n, i)));
              Code((byte[])localObject1, (byte[])localObject2, m, k);
              n = i;
              i1 = k;
              m = k;
              k = i1;
              break;
            }
          }
          return localObject2;
        }
      }
    }
  }
  
  private int d(int paramInt)
  {
    return ((ar)this.B.elementAt(paramInt)).Z;
  }
  
  public final int B(int paramInt)
  {
    return ((ar)this.B.elementAt(paramInt)).J;
  }
  
  public final int C(int paramInt)
  {
    return ((ar)this.B.elementAt(paramInt)).B;
  }
  
  public final int Code()
  {
    return this.B.size();
  }
  
  public final void Code(int paramInt)
  {
    this.B.addElement(new bn(paramInt));
  }
  
  public final void Code(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt2 == paramInt3) {
      this.B.addElement(new ar(0, paramInt2, paramInt3, paramInt1, 0, paramInt4));
    }
    do
    {
      return;
      if (this.J != null) {
        break;
      }
    } while (paramInt2 >= paramInt3);
    int k = 0;
    int i = paramInt2;
    for (;;)
    {
      j = k;
      if (i < paramInt3)
      {
        if (Code(paramArrayOfChar[i])) {
          j = 2;
        }
      }
      else
      {
        this.B.addElement(new ar(0, paramInt2, paramInt3, paramInt1, j, paramInt4));
        return;
      }
      i += 1;
    }
    label105:
    int m;
    if (paramInt2 < paramInt3)
    {
      if ((this.J[paramInt2] & 0x1) == 1) {}
      for (int i1 = 1;; i1 = 0)
      {
        m = 0;
        k = 1;
        j = 0;
        i = paramInt2;
        while ((i < paramInt3) && (this.J[i] == this.J[paramInt2]))
        {
          int n = j;
          if (j == 0)
          {
            n = j;
            if (i1 != 0)
            {
              n = j;
              if ("()<>[]{}«»‘’“”‹›".indexOf(this.Code[i]) >= 0) {
                n = 1;
              }
            }
          }
          j = k;
          if (k != 0)
          {
            j = k;
            if (i1 == b.J(this.Code[i])) {
              j = 0;
            }
          }
          k = m;
          if (m == 0)
          {
            k = m;
            if (Code(this.Code[i])) {
              k = 1;
            }
          }
          i += 1;
          m = k;
          k = j;
          j = n;
        }
      }
      if (m == 0) {
        break label353;
      }
      m = 2;
      label296:
      if (k == 0) {
        break label359;
      }
      k = 4;
      label304:
      if (j == 0) {
        break label365;
      }
    }
    label353:
    label359:
    label365:
    for (int j = 8;; j = 0)
    {
      this.B.addElement(new ar(this.J[paramInt2], paramInt2, i, paramInt1, m | k | j, paramInt4));
      paramInt2 = i;
      break label105;
      break;
      m = 0;
      break label296;
      k = 0;
      break label304;
    }
  }
  
  public final int I(int paramInt)
  {
    return ((ar)this.B.elementAt(paramInt)).Code;
  }
  
  public final char[] I()
  {
    return this.Code;
  }
  
  public final int J(int paramInt)
  {
    return d(paramInt) - Z(paramInt);
  }
  
  public final int Z(int paramInt)
  {
    return ((ar)this.B.elementAt(paramInt)).I;
  }
  
  public final boolean Z()
  {
    return this.I == 1;
  }
  
  public final int a(int paramInt)
  {
    return ((ar)this.B.elementAt(paramInt)).C;
  }
  
  public final int b(int paramInt)
  {
    if ((C(paramInt) & 0x2) != 0)
    {
      char[] arrayOfChar = new char[this.Code.length];
      int i = Z(paramInt);
      int k;
      for (int j = 0; i < d(paramInt); j = k)
      {
        k = j;
        if (!Code(this.Code[i]))
        {
          arrayOfChar[j] = this.Code[i];
          k = j + 1;
        }
        i += 1;
      }
      return this.Z.Code(arrayOfChar, 0, j);
    }
    return this.Z.Code(this.Code, Z(paramInt), J(paramInt));
  }
  
  public final boolean c(int paramInt)
  {
    return this.B.elementAt(paramInt) instanceof bn;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     B
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */