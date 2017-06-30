package com.example.lw.appline.com.google.ads.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.DisplayMetrics;

@TargetApi(4)
public final class g
{
  private static int a(Context paramContext, float paramFloat, int paramInt)
  {
    int i = paramInt;
    if ((paramContext.getApplicationInfo().flags & 0x2000) != 0) {
      i = (int)(paramInt / paramFloat);
    }
    return i;
  }
  
  public static int a(Context paramContext, DisplayMetrics paramDisplayMetrics)
  {
    return a(paramContext, paramDisplayMetrics.density, paramDisplayMetrics.heightPixels);
  }
  
  public static void a(Intent paramIntent, String paramString)
  {
    paramIntent.setPackage(paramString);
  }
  
  public static int b(Context paramContext, DisplayMetrics paramDisplayMetrics)
  {
    return a(paramContext, paramDisplayMetrics.density, paramDisplayMetrics.widthPixels);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.e.g
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */