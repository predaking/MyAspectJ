package com.example.lw.appweb;

public abstract class an
{
  private br Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, br[] paramArrayOfbr, boolean paramBoolean)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0) || (paramInt5 == 0))
    {
      paramArrayOfbr = null;
      return paramArrayOfbr;
    }
    Object localObject1 = null;
    int i;
    int j;
    if ((b.v) && (I(paramArrayOfByte, paramInt1, paramInt2)))
    {
      paramArrayOfbr = Code();
      if (!paramArrayOfbr.Code(paramArrayOfByte, paramInt1, paramInt2)) {
        return null;
      }
      i = paramArrayOfbr.I();
      j = paramArrayOfbr.Z();
      if (paramInt5 == 256)
      {
        paramInt2 = j;
        paramInt1 = i;
      }
    }
    for (;;)
    {
      if ((j != paramInt2) || (i != paramInt1))
      {
        if (g.Code.t())
        {
          return null;
          if (paramInt5 >= 0)
          {
            paramInt2 = j * paramInt5 * 256 + 65535 >> 16;
            paramInt1 = Math.max(1, i * paramInt2 / j);
          }
        }
        else
        {
          paramInt3 = 0;
          if ((paramInt2 > j) || (paramInt1 > i)) {
            paramInt3 = 1;
          }
          paramArrayOfByte = Code(null, i, j, paramInt1, paramInt2, paramInt3);
        }
      }
      else
      {
        Object localObject2;
        for (;;)
        {
          paramArrayOfbr = paramArrayOfByte;
          if (paramArrayOfByte == null) {
            break;
          }
          paramArrayOfbr = paramArrayOfByte;
          if (paramArrayOfByte.I() != 0) {
            break;
          }
          throw new OutOfMemoryError("");
          paramArrayOfByte = Code(null, i, j, false, paramBoolean);
          continue;
          if ((paramArrayOfByte[paramInt1] != 82) && (paramArrayOfByte[paramInt1] != 67) && (paramArrayOfByte[paramInt1] != 88)) {
            break label850;
          }
          if (paramArrayOfByte[paramInt1] == 88) {
            paramInt3 = paramArrayOfByte[(paramInt1 + 1)] << 3 | paramArrayOfByte[(paramInt1 + 2)] >>> 5 & 0x7;
          }
          for (paramInt4 = (paramArrayOfByte[(paramInt1 + 2)] & 0x1F) << 6 | paramArrayOfByte[(paramInt1 + 3)] >>> 2 & 0x3F;; paramInt4 = paramArrayOfByte[(paramInt1 + 2)])
          {
            paramArrayOfbr = new int[paramInt3 * paramInt4];
            if (paramArrayOfByte[paramInt1] != 82) {
              break;
            }
            paramInt1 += 3;
            paramInt2 = 0;
            while (paramInt2 < paramInt3 * paramInt4)
            {
              paramArrayOfbr[paramInt2] = (((paramArrayOfByte[paramInt1] & 0xFF) << 24) + ((paramArrayOfByte[(paramInt1 + 1)] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt1 + 2)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt1 + 3)] & 0xFF));
              paramInt2 += 1;
              paramInt1 += 4;
            }
            paramInt3 = paramArrayOfByte[(paramInt1 + 1)];
          }
          if (paramArrayOfByte[paramInt1] == 67)
          {
            localObject1 = new byte[paramInt3 * paramInt4 * 2];
            localObject2 = g.Code.x();
            ((p)localObject2).Code((byte[])localObject1);
            ((p)localObject2).setInput(paramArrayOfByte, paramInt1 + 3, paramInt2 - 3);
            ((p)localObject2).read(null, 0, localObject1.length);
            ((p)localObject2).end();
            paramInt1 = 0;
            while (paramInt1 < paramInt3 * paramInt4 * 2)
            {
              paramInt2 = localObject1[paramInt1];
              paramInt5 = localObject1[paramInt1];
              i = localObject1[paramInt1];
              j = localObject1[paramInt1];
              paramInt1 += 1;
              paramArrayOfbr[(paramInt1 >> 1)] = ((((paramInt2 & 0xF0) >>> 4 | paramInt5 & 0xF0) << 24) + (((i & 0xF) << 4 | j & 0xF) << 16) + (((localObject1[paramInt1] & 0xF0) >>> 4 | localObject1[paramInt1] & 0xF0) << 8) + ((localObject1[paramInt1] & 0xF) << 4 | localObject1[paramInt1] & 0xF));
              paramInt1 += 1;
            }
          }
          localObject1 = new byte[paramInt3 * paramInt4 * 3];
          localObject2 = g.Code.x();
          ((p)localObject2).Code((byte[])localObject1);
          ((p)localObject2).setInput(paramArrayOfByte, paramInt1 + 4, paramInt2 - 4);
          ((p)localObject2).read(null, 0, localObject1.length);
          ((p)localObject2).end();
          for (paramInt1 = 0; paramInt1 < paramInt3 * paramInt4 * 3; paramInt1 = paramInt5 + 1)
          {
            paramInt2 = localObject1[paramInt1] & 0xFC;
            i = localObject1[paramInt1];
            paramInt5 = paramInt1 + 1;
            paramInt1 = i << 6 & 0xF0 | localObject1[paramInt5] >> 2 & 0x3C;
            i = localObject1[paramInt5];
            paramInt5 += 1;
            i = i << 4 & 0xF0 | localObject1[paramInt5] >> 4 & 0xC;
            j = (localObject1[paramInt5] & 0x3F) << 2;
            paramArrayOfbr[(paramInt5 / 3)] = (((paramInt2 | paramInt2 >> 6) << 24) + ((paramInt1 | paramInt1 >> 6) << 16) + ((i | i >> 6) << 8) + (j | j >> 6));
          }
          paramArrayOfByte = Code(paramArrayOfbr, paramInt3, paramInt4, true, paramBoolean);
        }
        label850:
        if ((b.s) || (paramArrayOfByte[paramInt1] == -119))
        {
          i = 0;
          localObject1 = Code(paramArrayOfByte, paramInt1, paramInt2, paramBoolean);
          if (paramInt5 == 256)
          {
            paramInt2 = ((br)localObject1).I();
            paramInt1 = ((br)localObject1).Code();
          }
        }
        for (;;)
        {
          if (((br)localObject1).I() == paramInt2)
          {
            paramArrayOfByte = (byte[])localObject1;
            if (((br)localObject1).Code() == paramInt1) {
              break;
            }
          }
          if (paramArrayOfbr != null) {
            paramArrayOfbr[0] = localObject1;
          }
          if (g.Code.t())
          {
            return null;
            if (paramInt5 >= 0)
            {
              paramInt2 = ((br)localObject1).I() * paramInt5 * 256 + 65535 >> 16;
              paramInt1 = Math.max(1, ((br)localObject1).Code() * paramInt2 / ((br)localObject1).I());
            }
          }
          else
          {
            if (paramInt2 <= ((br)localObject1).I())
            {
              paramInt3 = i;
              if (paramInt1 <= ((br)localObject1).Code()) {}
            }
            else
            {
              paramInt3 = 1;
            }
            paramArrayOfByte = ((br)localObject1).Code(0, 0, ((br)localObject1).Code(), ((br)localObject1).I(), paramInt1, paramInt2, 0, 0, 0, 0, paramInt3, false);
            break;
            i = paramInt5;
            if (paramInt5 == -1)
            {
              b.Code(paramArrayOfByte, paramInt1, paramInt2, new int[3]);
              paramInt5 = b.i();
              i = b.j();
              if (paramInt5 <= 0) {
                return null;
              }
              i = Math.max(Math.min(256, paramInt3 * 256 / paramInt5), Math.min(256, paramInt4 * 256 / i));
            }
            localObject2 = new ah();
            if (i == 256)
            {
              if ((((ah)localObject2).Code(paramArrayOfByte, paramInt1, paramInt2, 0, false) != 0) || (((ah)localObject2).Code == 0) || (((ah)localObject2).I == 0)) {
                break label1443;
              }
              if ((((ah)localObject2).Code < paramInt3) || (((ah)localObject2).I < paramInt4))
              {
                paramArrayOfByte = Code(((ah)localObject2).Z, ((ah)localObject2).Code, ((ah)localObject2).I, paramInt3, paramInt4, 1);
                break;
              }
              paramArrayOfByte = Code(((ah)localObject2).Z, ((ah)localObject2).Code, ((ah)localObject2).I, false, paramBoolean);
              break;
            }
            if (g.Code.t()) {
              return null;
            }
            paramInt5 = ((ah)localObject2).Code(paramArrayOfByte, paramInt1, paramInt2, 0, true);
            j = (0xFFFF0000 & paramInt5) >> 16;
            int k = paramInt5 & 0xFFFF;
            paramInt5 = 3;
            while (256 >> paramInt5 <= i) {
              paramInt5 -= 1;
            }
            if ((j >> paramInt5 != 0) && (k >> paramInt5 != 0))
            {
              paramArrayOfbr = (br[])localObject1;
              if (((ah)localObject2).Code(paramArrayOfByte, paramInt1, paramInt2, paramInt5, false) == 0)
              {
                if ((paramInt3 != -1) && (paramInt4 != -1)) {
                  break label1434;
                }
                paramInt2 = k * i * 256 + 65535 >> 16;
              }
            }
            for (paramInt1 = j * i * 256 + 65535 >> 16;; paramInt1 = paramInt3)
            {
              paramInt3 = 0;
              if ((((ah)localObject2).Code < paramInt1) || (((ah)localObject2).I < paramInt2)) {
                paramInt3 = 1;
              }
              paramArrayOfbr = Code(((ah)localObject2).Z, ((ah)localObject2).Code, ((ah)localObject2).I, paramInt1, paramInt2, paramInt3);
              paramArrayOfByte = paramArrayOfbr;
              break;
              return null;
              label1434:
              paramInt2 = paramInt4;
            }
            label1443:
            paramArrayOfByte = null;
            break;
            paramInt2 = paramInt4;
            paramInt1 = paramInt3;
          }
        }
        paramInt2 = paramInt4;
        paramInt1 = paramInt3;
      }
    }
  }
  
  private static void Code(int[] paramArrayOfInt1, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt2, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, boolean paramBoolean)
  {
    if ((paramInt3 == 0) || (paramInt4 == 0) || (paramInt8 == 0) || (paramInt9 == 0)) {}
    for (;;)
    {
      return;
      if ((paramInt3 == paramInt8) && (paramInt4 == paramInt9))
      {
        Code(paramArrayOfInt1, paramInt1, paramInt2, paramInt5, paramArrayOfInt2, paramInt6, paramInt7, paramInt10, paramInt3, paramInt4);
        return;
      }
      int j = paramInt1 + paramInt2 * paramInt5;
      paramInt6 += paramInt7 * paramInt10;
      int i;
      int k;
      int m;
      int n;
      int i1;
      if ((paramInt4 == 2) && (paramInt9 >= 2) && (paramInt3 == paramInt8))
      {
        paramInt1 = paramInt6;
        paramInt2 = j;
        while (paramInt2 < j + paramInt3)
        {
          paramInt6 = paramArrayOfInt1[paramInt2];
          paramInt4 = paramArrayOfInt1[(paramInt2 + paramInt5)];
          i = paramInt6 >> 8 & 0xFF0000;
          paramInt11 = paramInt6 & 0xFF0000;
          paramInt8 = 0xFF0000 & paramInt6 << 8;
          paramInt7 = 0xFF0000 & paramInt6 << 16;
          k = ((paramInt4 >> 8 & 0xFF0000) - i) / (paramInt9 - 1);
          m = ((0xFF0000 & paramInt4) - paramInt11) / (paramInt9 - 1);
          n = ((paramInt4 << 8 & 0xFF0000) - paramInt8) / (paramInt9 - 1);
          i1 = ((paramInt4 << 16 & 0xFF0000) - paramInt7) / (paramInt9 - 1);
          paramInt6 = 0;
          paramInt4 = paramInt1;
          while (paramInt6 < paramInt9)
          {
            paramArrayOfInt2[paramInt4] = ((0xFF0000 & i) << 8 | 0xFF0000 & paramInt11 | (0xFF0000 & paramInt8) >> 8 | paramInt7 >> 16);
            i += k;
            paramInt11 += m;
            paramInt8 += n;
            paramInt7 += i1;
            paramInt6 += 1;
            paramInt4 += paramInt10;
          }
          paramInt1 += 1;
          paramInt2 += 1;
        }
      }
      else
      {
        i = paramInt3 * 256 / paramInt8;
        k = paramInt4 * 256 / paramInt9;
        if ((i > 512) || (k > 512))
        {
          paramInt1 = 0;
          paramInt7 = paramInt3 - 1;
          paramInt4 -= 1;
          if ((paramInt7 == 0) || (paramInt4 == 0) || (paramInt8 == 1) || (paramInt9 == 1)) {
            paramInt1 = 0;
          }
          if (paramInt1 == 1) {
            paramInt1 = 0;
          }
        }
        else
        {
          for (;;)
          {
            if (paramInt1 >= paramInt9) {
              break label926;
            }
            paramInt2 = (paramInt1 * paramInt4 << 8) / (paramInt9 - 1);
            paramInt11 = paramInt2 & 0xFF;
            i = paramInt2 >>> 8;
            paramInt2 = 0;
            label439:
            if (paramInt2 < paramInt8)
            {
              paramInt3 = (paramInt2 * paramInt7 << 8) / (paramInt8 - 1);
              k = paramInt3 & 0xFF;
              int i2 = paramInt3 >>> 8;
              m = paramInt10 * paramInt1 + paramInt6 + paramInt2;
              paramInt3 = Math.min(i2 + 1, paramInt7);
              int i3 = Math.min(i + 1, paramInt4);
              n = paramArrayOfInt1[(paramInt5 * i + j + i2)];
              i1 = paramArrayOfInt1[(paramInt5 * i + j + paramInt3)];
              i2 = paramArrayOfInt1[(i2 + (paramInt5 * i3 + j))];
              i3 = paramArrayOfInt1[(paramInt5 * i3 + j + paramInt3)];
              if (paramBoolean) {}
              for (paramInt3 = (n >>> 24) * (256 - k) * (256 - paramInt11) + (i1 >>> 24) * k * (256 - paramInt11) + (i2 >>> 24) * (256 - k) * paramInt11 + (i3 >>> 24) * k * paramInt11 >>> 16 << 24;; paramInt3 = 0)
              {
                paramArrayOfInt2[m] = (paramInt3 + ((n >> 16 & 0xFF) * (256 - k) * (256 - paramInt11) + (i1 >> 16 & 0xFF) * k * (256 - paramInt11) + (i2 >> 16 & 0xFF) * (256 - k) * paramInt11 + (i3 >> 16 & 0xFF) * k * paramInt11 >>> 16 << 16) + ((n >> 8 & 0xFF) * (256 - k) * (256 - paramInt11) + (i1 >> 8 & 0xFF) * k * (256 - paramInt11) + (i2 >> 8 & 0xFF) * (256 - k) * paramInt11 + (i3 >> 8 & 0xFF) * k * paramInt11 >>> 16 << 8) + (k * (i3 & 0xFF) * paramInt11 + ((n & 0xFF) * (256 - k) * (256 - paramInt11) + (i1 & 0xFF) * k * (256 - paramInt11) + (i2 & 0xFF) * (256 - k) * paramInt11) >>> 16));
                if (!paramBoolean) {
                  paramArrayOfInt2[m] |= -16777216;
                }
                paramInt2 += 1;
                break label439;
                paramInt1 = paramInt11;
                break;
              }
            }
            paramInt1 += 1;
          }
          label926:
          continue;
        }
        paramInt1 = 0;
        while (paramInt1 < paramInt9)
        {
          paramInt3 = Math.min(paramInt1 * k >>> 8, paramInt4);
          paramInt2 = 0;
          while (paramInt2 < paramInt8)
          {
            paramInt11 = Math.min(paramInt2 * i >>> 8, paramInt7);
            m = paramInt10 * paramInt1 + paramInt6 + paramInt2;
            paramArrayOfInt2[m] = paramArrayOfInt1[(paramInt11 + (paramInt5 * paramInt3 + j))];
            if (!paramBoolean) {
              paramArrayOfInt2[m] |= -16777216;
            }
            paramInt2 += 1;
          }
          paramInt1 += 1;
        }
      }
    }
  }
  
  private static void Code(int[] paramArrayOfInt1, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt2, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (paramInt7 == 0) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < paramInt8)
      {
        System.arraycopy(paramArrayOfInt1, (paramInt2 + i) * paramInt3 + paramInt1, paramArrayOfInt2, (paramInt5 + i) * paramInt6 + paramInt4, paramInt7);
        i += 1;
      }
    }
  }
  
  public static int[] Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, boolean paramBoolean)
  {
    if (paramInt9 == 2) {
      paramInt9 = 1;
    }
    for (;;)
    {
      int[] arrayOfInt = new int[paramInt3 * paramInt4];
      Code(paramArrayOfInt, paramInt5, 0, paramInt1 - paramInt5 - paramInt7, paramInt6, paramInt1, arrayOfInt, paramInt5, 0, paramInt3 - paramInt5 - paramInt7, paramInt6, paramInt3, paramInt9, paramBoolean);
      Code(paramArrayOfInt, paramInt5, paramInt6, paramInt1 - paramInt5 - paramInt7, paramInt2 - paramInt6 - paramInt8, paramInt1, arrayOfInt, paramInt5, paramInt6, paramInt3 - paramInt5 - paramInt7, paramInt4 - paramInt6 - paramInt8, paramInt3, paramInt9, paramBoolean);
      Code(paramArrayOfInt, paramInt5, paramInt2 - paramInt8, paramInt1 - paramInt5 - paramInt7, paramInt8, paramInt1, arrayOfInt, paramInt5, paramInt4 - paramInt8, paramInt3 - paramInt5 - paramInt7, paramInt8, paramInt3, paramInt9, paramBoolean);
      Code(paramArrayOfInt, 0, paramInt6, paramInt5, paramInt2 - paramInt6 - paramInt8, paramInt1, arrayOfInt, 0, paramInt6, paramInt5, paramInt4 - paramInt6 - paramInt8, paramInt3, paramInt9, paramBoolean);
      Code(paramArrayOfInt, paramInt1 - paramInt7, paramInt6, paramInt7, paramInt2 - paramInt6 - paramInt8, paramInt1, arrayOfInt, paramInt3 - paramInt7, paramInt6, paramInt7, paramInt4 - paramInt6 - paramInt8, paramInt3, paramInt9, paramBoolean);
      Code(paramArrayOfInt, 0, 0, paramInt1, arrayOfInt, 0, 0, paramInt3, paramInt5, paramInt6);
      Code(paramArrayOfInt, 0, paramInt2 - paramInt8, paramInt1, arrayOfInt, 0, paramInt4 - paramInt8, paramInt3, paramInt5, paramInt8);
      Code(paramArrayOfInt, paramInt1 - paramInt7, 0, paramInt1, arrayOfInt, paramInt3 - paramInt7, 0, paramInt3, paramInt7, paramInt6);
      Code(paramArrayOfInt, paramInt1 - paramInt7, paramInt2 - paramInt8, paramInt1, arrayOfInt, paramInt3 - paramInt7, paramInt4 - paramInt8, paramInt3, paramInt7, paramInt8);
      return arrayOfInt;
    }
  }
  
  protected static boolean I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return (paramInt2 >= 20) && (paramArrayOfByte[paramInt1] == 82) && (paramArrayOfByte[(paramInt1 + 1)] == 73) && (paramArrayOfByte[(paramInt1 + 2)] == 70) && (paramArrayOfByte[(paramInt1 + 3)] == 70) && (paramArrayOfByte[(paramInt1 + 8)] == 87) && (paramArrayOfByte[(paramInt1 + 9)] == 69) && (paramArrayOfByte[(paramInt1 + 10)] == 66) && (paramArrayOfByte[(paramInt1 + 11)] == 80);
  }
  
  protected al Code()
  {
    return null;
  }
  
  public abstract br Code(int paramInt1, int paramInt2);
  
  public final br Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, br[] paramArrayOfbr)
  {
    return Code(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4, -1, paramArrayOfbr, false);
  }
  
  public final br Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, br[] paramArrayOfbr, boolean paramBoolean)
  {
    return Code(paramArrayOfByte, paramInt1, paramInt2, -1, -1, paramInt3, paramArrayOfbr, paramBoolean);
  }
  
  protected abstract br Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public final br Code(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    return Code(paramArrayOfByte, 0, paramInt, 256, null, paramBoolean);
  }
  
  public br Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    paramArrayOfInt = Code(paramArrayOfInt, paramInt1, paramInt2, paramInt3, paramInt4, 0, 0, 0, 0, paramInt5, false);
    return Code(paramArrayOfInt, paramArrayOfInt.length / paramInt4, paramInt4, true, true);
  }
  
  public abstract br Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract Object Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     an
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */