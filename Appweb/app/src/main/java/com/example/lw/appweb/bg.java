package com.example.lw.appweb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public final class bg
{
  private static final long Code(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    long l1 = 0L;
    int i = 0;
    while (i < paramInt)
    {
      l1 = l1 << 8 | paramArrayOfByte[(i + 0)] & 0xFF;
      i += 1;
    }
    long l2 = l1;
    if (!paramBoolean) {
      l2 = l1;
    }
    switch (paramInt)
    {
    case 5: 
    case 6: 
    case 7: 
    default: 
      l2 = -1L;
    case 8: 
      return l2;
    case 1: 
      return (byte)(int)l1;
    case 2: 
      return (short)(int)l1;
    case 3: 
      return -((l1 ^ 0xFFFFFFFF) + 1L & 0xFFFFFF);
    }
    return (int)l1;
  }
  
  public static void Code(InputStream paramInputStream, OutputStream paramOutputStream, aa paramaa)
  {
    DataInputStream localDataInputStream = new DataInputStream(paramInputStream);
    paramOutputStream = new DataOutputStream(paramOutputStream);
    int i = 0;
    paramInputStream = null;
    byte[] arrayOfByte = new byte[1024];
    C localC = new C();
    localC.Code();
    paramaa = paramaa.Code();
    int m = 0;
    int j = i;
    Object localObject;
    int k;
    label200:
    int n;
    if (m < paramaa.size())
    {
      localObject = (ac)paramaa.elementAt(m);
      j = i;
      if (((ac)localObject).Code() == 0) {
        paramInputStream = (aj)localObject;
      }
      for (;;)
      {
        m += 1;
        break;
        while (j < ((ac)localObject).I())
        {
          k = ((ac)localObject).I() - j;
          i = k;
          if (k > arrayOfByte.length) {
            i = arrayOfByte.length;
          }
          localDataInputStream.readFully(arrayOfByte, 0, i);
          localC.Code(arrayOfByte, 0, i);
          paramOutputStream.write(arrayOfByte, 0, i);
          j += i;
        }
        switch (((ac)localObject).Code())
        {
        default: 
          i = j;
        }
      }
      localObject = (bp)localObject;
      n = ((bp)localObject).Code;
      k = 0;
      if (n <= ((bp)localObject).I) {
        break label751;
      }
      n = ((bp)localObject).I;
      i = j;
    }
    for (;;)
    {
      if (k < n)
      {
        int i1 = n - k;
        j = i1;
        if (i1 > arrayOfByte.length) {
          j = arrayOfByte.length;
        }
        localDataInputStream.readFully(arrayOfByte, 0, j);
        localC.Code(arrayOfByte, 0, j);
        i1 = 0;
        while (i1 < j)
        {
          arrayOfByte[i1] = ((byte)(arrayOfByte[i1] ^ localObject.Z[k]));
          i1 += 1;
          k += 1;
        }
        paramOutputStream.write(arrayOfByte, 0, j);
        i += j;
      }
      else
      {
        if (k < ((bp)localObject).I)
        {
          paramOutputStream.write(((bp)localObject).Z, k, ((bp)localObject).I - k);
          break;
        }
        for (;;)
        {
          label388:
          j = i;
          if (k >= ((bp)localObject).Code) {
            break label200;
          }
          j = ((bp)localObject).Code - k;
          if (j > arrayOfByte.length) {
            j = arrayOfByte.length;
          }
          for (;;)
          {
            localDataInputStream.readFully(arrayOfByte, 0, j);
            localC.Code(arrayOfByte, 0, j);
            k += j;
            i += j;
            break label388;
            localObject = (bs)localObject;
            localDataInputStream.readFully(arrayOfByte, 0, ((bs)localObject).Code);
            localC.Code(arrayOfByte, 0, ((bs)localObject).Code);
            j += ((bs)localObject).Code;
            long l = Code(arrayOfByte, ((bs)localObject).Code, ((bs)localObject).Z) + ((bs)localObject).J;
            switch (((bs)localObject).I)
            {
            default: 
              break;
            case 1: 
              paramOutputStream.writeByte((int)l);
              i = j;
              break;
            case 2: 
              paramOutputStream.writeShort((short)(int)l);
              i = j;
              break;
            case 3: 
              paramOutputStream.writeShort((int)(l >> 8));
              paramOutputStream.writeByte((int)(l & 0xFF));
              i = j;
              break;
            case 4: 
              paramOutputStream.writeInt((int)l);
              break label200;
              for (;;)
              {
                i = localDataInputStream.read(arrayOfByte);
                if (i < 0) {
                  break;
                }
                localC.Code(arrayOfByte, 0, i);
                paramOutputStream.write(arrayOfByte, 0, i);
                j += i;
              }
              paramOutputStream = localC.I();
              if (paramInputStream.Code != j) {
                throw new IOException();
              }
              if (paramInputStream.I.length != paramOutputStream.length) {
                throw new IOException();
              }
              i = 0;
              while (i < paramInputStream.I.length)
              {
                if (paramInputStream.I[i] != paramOutputStream[i]) {
                  throw new IOException();
                }
                i += 1;
              }
              return;
            }
          }
        }
        label751:
        i = j;
      }
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bg
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */