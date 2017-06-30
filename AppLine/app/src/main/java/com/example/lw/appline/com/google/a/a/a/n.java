package com.example.lw.appline.com.google.a.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

class n
  extends BroadcastReceiver
{
  private final ac a;
  
  n(ac paramac)
  {
    this.a = paramac;
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
    {
      Bundle localBundle = paramIntent.getExtras();
      paramContext = Boolean.FALSE;
      if (localBundle != null) {
        paramContext = Boolean.valueOf(paramIntent.getExtras().getBoolean("noConnectivity"));
      }
      paramIntent = this.a;
      if (paramContext.booleanValue()) {
        break label62;
      }
    }
    label62:
    for (boolean bool = true;; bool = false)
    {
      paramIntent.a(bool);
      return;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.n
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */