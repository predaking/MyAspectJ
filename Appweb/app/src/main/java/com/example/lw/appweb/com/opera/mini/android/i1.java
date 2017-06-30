package com.example.lw.appweb.com.opera.mini.android;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Date;

public class i
  implements Thread.UncaughtExceptionHandler
{
  private static i I = null;
  private static final String J = "LAST_CRASH_TIMESTAMP";
  private Thread.UncaughtExceptionHandler Code;
  private long Z = 0L;
  
  public static void Code()
  {
    Editor localEditor = Browser.I.getPreferences(0).edit();
    long l = new Date().getTime();
    localEditor.putLong("LAST_CRASH_TIMESTAMP", l);
    localEditor.commit();
    I.Z = l;
  }
  
  public static void I()
  {
    if (I == null)
    {
      I = new i();
      J();
      I.Code = Thread.getDefaultUncaughtExceptionHandler();
      Thread.setDefaultUncaughtExceptionHandler(I);
      SharedPreferences localSharedPreferences = Browser.I.getPreferences(0);
      if (localSharedPreferences.contains("LAST_CRASH_TIMESTAMP")) {
        I.Z = localSharedPreferences.getLong("LAST_CRASH_TIMESTAMP", 0L);
      }
    }
  }
  
  private static native void J();
  
  public static long Z()
  {
    return I.Z;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    
    if (this.Code != null) {
      this.Code.uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.i
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */