package com.example.lw.appline.com.google.a.a.a;

import android.util.Log;

public class w
{
  private static boolean a;
  
  public static int a(String paramString)
  {
    return Log.d("GAV2", j(paramString));
  }
  
  public static void a(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public static boolean a()
  {
    return a;
  }
  
  public static int b(String paramString)
  {
    if (a) {
      return a(paramString);
    }
    return 0;
  }
  
  public static int c(String paramString)
  {
    return Log.e("GAV2", j(paramString));
  }
  
  public static int d(String paramString)
  {
    return Log.i("GAV2", j(paramString));
  }
  
  public static int e(String paramString)
  {
    if (a) {
      return d(paramString);
    }
    return 0;
  }
  
  public static int f(String paramString)
  {
    return Log.v("GAV2", j(paramString));
  }
  
  public static int g(String paramString)
  {
    if (a) {
      return f(paramString);
    }
    return 0;
  }
  
  public static int h(String paramString)
  {
    return Log.w("GAV2", j(paramString));
  }
  
  public static int i(String paramString)
  {
    if (a) {
      return h(paramString);
    }
    return 0;
  }
  
  private static String j(String paramString)
  {
    return Thread.currentThread().toString() + ": " + paramString;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.w
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */