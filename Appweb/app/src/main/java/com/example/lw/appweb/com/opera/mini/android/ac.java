package com.example.lw.appweb.com.opera.mini.android;

import al;
import an;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import b;
import br;

public final class ac
  extends an
{
  private static Paint Code = new Paint();
  
  public ac()
  {
    Code.setFilterBitmap(true);
  }
  
  private static void Code(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int j = 0;
    int i = 0;
    while (j < paramInt2)
    {
      int k = 0;
      while (k < paramInt1)
      {
        int i1 = paramArrayOfInt[i];
        int i2 = i1 >> 16 & 0xFF;
        int n = i1 >> 8 & 0xFF;
        int m = i1 & 0xFF;
        int i4 = i2 & 0xFFFFFFF8;
        int i5 = n & 0xFFFFFFFC;
        int i3 = m & 0xFFFFFFF8;
        i4 |= i4 >> 5;
        i5 |= i5 >> 6;
        i3 |= i3 >> 5;
        paramArrayOfInt[i] = (i1 & 0xFF000000 | i4 << 16 | i5 << 8 | i3);
        i1 = i2 - i4;
        n -= i5;
        m -= i3;
        i2 = i1 / 2;
        i3 = n / 2;
        i4 = m / 2;
        if (k < paramInt1 - 1) {
          Code(paramArrayOfInt, i + 1, i1 - i2, n - i3, m - i4);
        }
        if (j < paramInt2 - 1) {
          Code(paramArrayOfInt, i + paramInt1, i2, i3, i4);
        }
        i += 1;
        k += 1;
      }
      j += 1;
    }
  }
  
  private static void Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
      return;
    }
    int n = paramArrayOfInt[paramInt1];
    int m = n >> 16 & 0xFF;
    int k = n >> 8 & 0xFF;
    int j = n & 0xFF;
    int i;
    if (paramInt2 > 0)
    {
      i = Math.min(255, m + paramInt2);
      if (paramInt3 <= 0) {
        break label140;
      }
      paramInt2 = Math.min(255, k + paramInt3);
      label80:
      if (paramInt4 <= 0) {
        break label159;
      }
      paramInt3 = Math.min(255, j + paramInt4);
    }
    for (;;)
    {
      paramArrayOfInt[paramInt1] = (paramInt3 | (paramInt2 << 8 | (i << 16 | n & 0xFF000000)));
      return;
      i = m;
      if (paramInt2 >= 0) {
        break;
      }
      i = Math.max(0, m + paramInt2);
      break;
      label140:
      paramInt2 = k;
      if (paramInt3 >= 0) {
        break label80;
      }
      paramInt2 = Math.max(0, k + paramInt3);
      break label80;
      label159:
      paramInt3 = j;
      if (paramInt4 < 0) {
        paramInt3 = Math.max(0, j + paramInt4);
      }
    }
  }
  
  protected final al Code()
  {
    return new a();
  }
  
  public final br Code(int paramInt1, int paramInt2)
  {
    return new t(paramInt1, paramInt2);
  }
  
  protected final br Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    paramArrayOfByte = BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2);
    int[] arrayOfInt = new int[paramArrayOfByte.getWidth() * paramArrayOfByte.getHeight()];
    paramArrayOfByte.getPixels(arrayOfInt, 0, paramArrayOfByte.getWidth(), 0, 0, paramArrayOfByte.getWidth(), paramArrayOfByte.getHeight());
    if (paramBoolean) {
      Code(arrayOfInt, paramArrayOfByte.getWidth(), paramArrayOfByte.getHeight());
    }
    return new t(arrayOfInt, paramArrayOfByte.getWidth(), paramArrayOfByte.getHeight(), true);
  }
  
  public final br Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    return new t(paramArrayOfInt, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public final br Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      Code(paramArrayOfInt, paramInt1, paramInt2);
    }
    return new t(paramArrayOfInt, paramInt1, paramInt2, paramBoolean1);
  }
  
  public final Object Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte.length < paramInt1 + paramInt2) {
      return null;
    }
    if ((b.v) && (I(paramArrayOfByte, paramInt1, paramInt2)))
    {
      localObject = (a)new a();
      if (((a)localObject).Code(paramArrayOfByte, paramInt1, paramInt2)) {
        return new af(((a)localObject).Code());
      }
      return null;
    }
    Object localObject = BitmapFactory.decodeByteArray(paramArrayOfByte, paramInt1, paramInt2);
    if (localObject == null) {
      return null;
    }
    if (((Bitmap)localObject).getConfig() == null) {
      if (((Bitmap)localObject).hasAlpha()) {
        paramArrayOfByte = Config.ARGB_8888;
      }
    }
    for (paramArrayOfByte = ((Bitmap)localObject).copy(paramArrayOfByte, false);; paramArrayOfByte = (byte[])localObject)
    {
      return new af(paramArrayOfByte);
      paramArrayOfByte = Config.RGB_565;
      break;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ac
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */