package com.example.lw.appweb.com.opera.mini.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ap;

public class DataSettingReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((Browser.I != null) && (!Browser.I.I())) {
      ap.I();
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.DataSettingReceiver
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */