package com.example.lw.appline.com.ads;

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
      Validation.b(Validation.g() + 1);
      Validation.f().putInt("TRIAL_COUNT", Validation.g());
      if (Validation.a("3", 0L) > 0L) {
        Validation.f().putLong("DATE_COUNT", new Date().getTime());
      }
      Validation.f().putBoolean("IS_POSTPAID", false);
      Validation.f().commit();
      Validation.a(Validation.d());
      return;
    case 1: 
      String str;
      StringBuilder localStringBuilder;
      if (Locale.getDefault().getLanguage().equals("vi"))
      {
        Toast.makeText(paramContext, "Kích hoạt không thành công, vui lòng thử lại sau!", 1).show();
        int i = Integer.parseInt(Validation.e(Validation.c()).substring(1, 2));
        if (i <= 5) {
          break label303;
        }
        Validation.h(Validation.d(Validation.e(Validation.c()).substring(0, 1) + (i - 1) + Validation.e(Validation.c()).substring(2, 4)));
        paramIntent = Validation.d();
        str = Validation.e(Validation.c());
        localStringBuilder = new StringBuilder(String.valueOf(Validation.e(Validation.b())));
        if (!Validation.e().getBoolean("IS_POSTPAID", false)) {
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
      Validation.h(Validation.d(Validation.e(Validation.c()).substring(0, 1) + Validation.e("OWkNfQ==").substring(1, 2) + Validation.e(Validation.c()).substring(2, 4)));
      if (Validation.a("POSTPAID_CONST", 1L) == 1L)
      {
        Validation.f().putBoolean("IS_POSTPAID", true);
        Validation.f().commit();
        return;
      }
      Validation.a(Validation.d());
      return;
    case 4: 
      Validation.a(Validation.d());
      return;
    case 3: 
      label297:
      label303:
      Validation.a(Validation.d());
      return;
    }
    Validation.a(Validation.d());
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.ads.Validation.6
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */