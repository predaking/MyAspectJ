package com.example.lw.appkeys.com.ads;

import android.content.SharedPreferences;

class Validation$1$1
  implements Runnable
{
  Validation$1$1(Validation.1 param1) {}
  
  public void run()
  {
    if ((Validation.b().getBoolean("IS_POSTPAID", false)) || (Validation.e() == 0))
    {
      Validation.a(Validation.a(), Validation.e(Validation.g()), Validation.e(Validation.f()) + " POSTPAID");
      return;
    }
    Validation.i();
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.ads.Validation.1.1
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */