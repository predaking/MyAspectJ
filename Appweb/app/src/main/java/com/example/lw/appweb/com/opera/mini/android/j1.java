package com.example.lw.appweb.com.opera.mini.android;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

public class j
{
  public static native void Code();
  
  private static native void Code(int paramInt1, int paramInt2, int[] paramArrayOfInt);
  
  public static void Code(AssetManager paramAssetManager)
  {
    try
    {
      paramAssetManager = BitmapFactory.decodeStream(paramAssetManager.open("elements.png"));
      if (paramAssetManager == null) {
        return;
      }
      int i = paramAssetManager.getWidth();
      int j = paramAssetManager.getHeight();
      int[] arrayOfInt = new int[i * j];
      paramAssetManager.getPixels(arrayOfInt, 0, i, 0, 0, i, j);
      Code(i, j, arrayOfInt);
      paramAssetManager.recycle();
      return;
    }
    catch (IllegalArgumentException paramAssetManager) {}catch (IOException paramAssetManager) {}catch (ArrayIndexOutOfBoundsException paramAssetManager) {}
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.j
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */