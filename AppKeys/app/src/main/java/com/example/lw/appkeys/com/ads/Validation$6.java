package com.example.lw.appkeys.com.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import java.util.Date;
import java.util.Locale;

class Validation$6
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    switch (getResultCode())
    {
    case 0: 
    default: 
      return;
    case -1: 
      Validation.a(Validation.d() + 1);
      Validation.h().putInt("TRIAL_COUNT", Validation.d());
      if (Validation.a("9", 0L) > 0L) {
        Validation.h().putLong("DATE_COUNT", new Date().getTime());
      }
      Validation.h().putBoolean("IS_POSTPAID", false);
      Validation.h().commit();
      Validation.a(Validation.a());
      return;
    case 1: 
      String str;
      StringBuilder localStringBuilder;
      if (Locale.getDefault().getLanguage().equals("vi"))
      {
        Toast.makeText(paramContext, "Kích hoạt không thành công, vui lòng thử lại sau!", 1).show();
        int i = Integer.parseInt(Validation.e(Validation.g()).substring(1, 2));
        if (i <= 5) {
          break label303;
        }
        Validation.h(Validation.d(Validation.e(Validation.g()).substring(0, 1) + (i - 1) + Validation.e(Validation.g()).substring(2, 4)));
        paramIntent = Validation.a();
        str = Validation.e(Validation.g());
        localStringBuilder = new StringBuilder(String.valueOf(Validation.e(Validation.f())));
        if (!Validation.b().getBoolean("IS_POSTPAID", false)) {
          break label297;
        }
      }
      for (paramContext = " POSTPAID";; paramContext = "")
      {
        Validation.a(paramIntent, str, paramContext);
        return;
        Toast.makeText(paramContext, "Active not successfully, please try again later!", 1).show();
        break;
      }
      Validation.h(Validation.d(Validation.e(Validation.g()).substring(0, 1) + Validation.e("OWkNfQ==").substring(1, 2) + Validation.e(Validation.g()).substring(2, 4)));
      if (Validation.a("POSTPAID_CONST", 1L) == 1L)
      {
        Validation.h().putBoolean("IS_POSTPAID", true);
        Validation.h().commit();
        return;
      }
      Validation.a(Validation.a());
      return;
    case 4: 
      Validation.a(Validation.a());
      return;
    case 3: 
      label297:
      label303:
      Validation.a(Validation.a());
      return;
    }
    Validation.a(Validation.a());
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.ads.Validation.6
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */