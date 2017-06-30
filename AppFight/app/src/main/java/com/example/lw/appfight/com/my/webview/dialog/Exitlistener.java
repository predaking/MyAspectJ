package com.example.lw.appfight.com.my.webview.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class Exitlistener
  implements DialogInterface.OnClickListener
{
  Activity activity;
  
  public Exitlistener(Activity paramActivity)
  {
    this.activity = paramActivity;
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    }
    this.activity.finish();
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.my.webview.dialog.Exitlistener
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */