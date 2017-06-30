package com.example.lw.appweb.com.opera.mini.android;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

final class h
  extends ResultReceiver
{
  h(Handler paramHandler)
  {
    super(paramHandler);
  }
  
  protected final void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
    case 2: 
      Browser.I.Code(false);
      return;
    }
    Browser.I.Code(true);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.h
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */