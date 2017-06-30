package com.example.lw.appweb.com.google.android.apps.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AnalyticsReceiver
  extends BroadcastReceiver
{
  static final String INSTALL_ACTION = "com.android.vending.INSTALL_REFERRER";
  static final String REFERRER_KEY = "referrer";
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("referrer");
    if ((!"com.android.vending.INSTALL_REFERRER".equals(paramIntent.getAction())) || (str == null)) {
      return;
    }
    Log.i("GoogleAnalyticsTracker", "referrer=" + str);
    if (new PersistentHitStore(paramContext).setReferrer(str))
    {
      Log.d("GoogleAnalyticsTracker", "Referrer store attemped succeeded.");
      return;
    }
    Log.w("GoogleAnalyticsTracker", "Referrer store attempt failed.");
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.analytics.AnalyticsReceiver
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */