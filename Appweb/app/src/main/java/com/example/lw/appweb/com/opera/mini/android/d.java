package com.example.lw.appweb.com.opera.mini.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.MotionEvent;
import aw;
import g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public abstract class d
{
  private static boolean B;
  private static final Integer[] C = { new Integer(1) };
  private static Method I;
  private static Method J;
  private static Method Z;
  protected int Code;
  
  public static boolean Code(Context paramContext)
  {
    try
    {
      if ("HTC Legend".equals(Build.MODEL)) {
        return true;
      }
      if ("ZTE_GV821".equals(Build.MODEL)) {
        return false;
      }
      boolean bool = ((Boolean)PackageManager.class.getDeclaredMethod("hasSystemFeature", new Class[] { String.class }).invoke(paramContext.getPackageManager(), new String[] { "android.hardware.touchscreen.multitouch" })).booleanValue();
      if (!bool) {
        return false;
      }
    }
    catch (Exception paramContext)
    {
      return false;
    }
    return I(paramContext) != null;
  }
  
  public static d I(Context paramContext)
  {
    try
    {
      Method localMethod = MotionEvent.class.getDeclaredMethod("getPointerCount", null);
      J = localMethod;
      if (localMethod != null)
      {
        B = true;
        I = MotionEvent.class.getDeclaredMethod("getX", new Class[] { Integer.TYPE });
        Z = MotionEvent.class.getDeclaredMethod("getY", new Class[] { Integer.TYPE });
      }
      try
      {
        paramContext = Z(paramContext);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        return null;
      }
      return null;
    }
    catch (Exception paramContext) {}
  }
  
  private static d Z(Context paramContext)
  {
    return (d)Class.forName("com.opera.mini.android.aa").getConstructor(new Class[] { Context.class }).newInstance(new Object[] { paramContext });
  }
  
  protected void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    g.I.B();
    g.Z.c(paramInt2);
    g.Z.c(paramInt3);
    g.Z.c(paramInt4);
    g.Z.c(this.Code);
    g.I.Code(paramInt1);
  }
  
  public abstract boolean Code(MotionEvent paramMotionEvent);
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.d
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */