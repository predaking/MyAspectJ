package com.example.lw.appline.vi.linhcoder.mline;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class b
{
  public static Bitmap a(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    float f1 = paramInt1 / i;
    float f2 = paramInt2 / j;
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(f1, f2);
    paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, i, j, localMatrix, true);
    if (paramBitmap != null) {
      return paramBitmap;
    }
    return null;
  }
  
  public static Bitmap[] a(Context paramContext)
  {
    int i = 1;
    Bitmap[] arrayOfBitmap = new Bitmap[15];
    arrayOfBitmap[0] = null;
    arrayOfBitmap[1] = BitmapFactory.decodeResource(paramContext.getResources(), 2130837504);
    arrayOfBitmap[2] = BitmapFactory.decodeResource(paramContext.getResources(), 2130837505);
    arrayOfBitmap[3] = BitmapFactory.decodeResource(paramContext.getResources(), 2130837506);
    arrayOfBitmap[4] = BitmapFactory.decodeResource(paramContext.getResources(), 2130837507);
    arrayOfBitmap[5] = BitmapFactory.decodeResource(paramContext.getResources(), 2130837508);
    arrayOfBitmap[6] = BitmapFactory.decodeResource(paramContext.getResources(), 2130837509);
    arrayOfBitmap[7] = BitmapFactory.decodeResource(paramContext.getResources(), 2130837510);
    int j = arrayOfBitmap[1].getWidth();
    int k = arrayOfBitmap[1].getHeight();
    for (;;)
    {
      if (i >= 8) {
        return arrayOfBitmap;
      }
      arrayOfBitmap[(i + 7)] = Bitmap.createBitmap(j, k, Config.ARGB_8888);
      new Canvas(arrayOfBitmap[(i + 7)]).drawBitmap(a(arrayOfBitmap[i], 10, 10), 10.0F, 10.0F, new Paint());
      i += 1;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     vi.linhcoder.mline.b
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */