package com.example.lw.appweb.com.opera.mini.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.analytics.AnalyticsReceiver;

public class OpMiniInstallReferrerReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      new AnalyticsReceiver().onReceive(paramContext, paramIntent);
      return;
    }
    catch (Throwable paramContext) {}
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.OpMiniInstallReferrerReceiver
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */