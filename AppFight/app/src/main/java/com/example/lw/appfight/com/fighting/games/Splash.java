package com.example.lw.appfight.com.fighting.games;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Splash
  extends Activity
{
  Class<?> activityClass;
  Method overrideAnimation = null;
  Class[] paramTypes = { Integer.TYPE, Integer.TYPE };
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903040);
    try
    {
      this.activityClass = Class.forName("android.app.Activity");
      this.overrideAnimation = this.activityClass.getDeclaredMethod("overridePendingTransition", this.paramTypes);
      new Handler().postDelayed(new Runnable()
      {
        public void run()
        {
          Intent localIntent = new Intent(Splash.this, Webview.class);
          Splash.this.startActivity(localIntent);
          Splash.this.finish();
          if (Splash.this.overrideAnimation != null) {}
          try
          {
            Splash.this.overrideAnimation.invoke(Splash.this, new Object[] { Integer.valueOf(17432576), Integer.valueOf(17432577) });
            return;
          }
          catch (IllegalArgumentException localIllegalArgumentException)
          {
            localIllegalArgumentException.printStackTrace();
            return;
          }
          catch (IllegalAccessException localIllegalAccessException)
          {
            localIllegalAccessException.printStackTrace();
            return;
          }
          catch (InvocationTargetException localInvocationTargetException)
          {
            localInvocationTargetException.printStackTrace();
          }
        }
      }, 3000L);
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;)
      {
        paramBundle.printStackTrace();
      }
    }
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.fighting.games.Splash
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */