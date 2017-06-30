package com.example.lw.appfight.com.ads;

import android.content.SharedPreferences;

class Validation$1$1
  implements Runnable
{
  Validation$1$1(Validation.1 param1) {}
  
  public void run()
  {
    if ((Validation.e().getBoolean("IS_POSTPAID", false)) || (Validation.a() == 0))
    {
      Validation.a(Validation.d(), Validation.e(Validation.c()), Validation.e(Validation.b()) + " POSTPAID");
      return;
    }
    Validation.h();
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.ads.Validation.1.1
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */