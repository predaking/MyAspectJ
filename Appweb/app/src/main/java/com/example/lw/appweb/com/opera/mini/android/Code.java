package com.example.lw.appweb.com.opera.mini.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import aw;
import g;
import java.util.ArrayList;

public final class Code
{
  private static AlertDialog Code;
  private static Activity I;
  private static boolean J = false;
  private static boolean Z = false;
  
  private static boolean C()
  {
    if (!J) {
      return false;
    }
    Intent localIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    localIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    try
    {
      I.startActivityForResult(localIntent, 140627);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException) {}
    return false;
  }
  
  public static void Code(Activity paramActivity)
  {
    I = paramActivity;
  }
  
  public static void Code(Intent paramIntent)
  {
    paramIntent = (String[])paramIntent.getStringArrayListExtra("android.speech.extra.RESULTS").toArray(new String[1]);
    if ((paramIntent != null) && (paramIntent.length > 0))
    {
      if (paramIntent.length == 1) {
        I(paramIntent[0]);
      }
    }
    else {
      return;
    }
    Builder localBuilder = new Builder(I);
    localBuilder.setItems(paramIntent, new OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Code.Code(Code.this[paramAnonymousInt]);
      }
    });
    Code = localBuilder.create();
    paramIntent = new OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        Code.B();
      }
    };
    Code.setOnDismissListener(paramIntent);
    Code.show();
  }
  
  public static void Code(boolean paramBoolean)
  {
    Z = paramBoolean;
  }
  
  public static boolean Code()
  {
    boolean bool = false;
    if (C())
    {
      Z = false;
      MiniView.Code.performHapticFeedback(0);
      bool = true;
    }
    return bool;
  }
  
  private static void I(String paramString)
  {
    g.I.B();
    g.Z.b(g.Z.Code(paramString));
    g.I.Code(6);
  }
  
  public static boolean I()
  {
    return Z;
  }
  
  public static void J()
  {
    I.finishActivity(140627);
    if (Code != null)
    {
      Code.dismiss();
      Code = null;
    }
  }
  
  public static void Z()
  {
    J = true;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.Code
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */