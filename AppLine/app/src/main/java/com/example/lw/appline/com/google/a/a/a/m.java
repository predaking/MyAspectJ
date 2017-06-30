package com.example.lw.appline.com.google.a.a.a;

import android.os.Build.VERSION;
import java.io.File;

class m
{
  public static int a()
  {
    try
    {
      int i = Integer.parseInt(Build.VERSION.SDK);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      w.c("Invalid version number: " + Build.VERSION.SDK);
    }
    return 0;
  }
  
  static boolean a(String paramString)
  {
    if (a() < 9) {
      return false;
    }
    paramString = new File(paramString);
    paramString.setReadable(false, false);
    paramString.setWritable(false, false);
    paramString.setReadable(true, true);
    paramString.setWritable(true, true);
    return true;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.m
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */