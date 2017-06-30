package com.google.ads;

import android.app.Activity;
import com.google.ads.internal.d;
import com.google.ads.util.i.c;

public class InterstitialAd
  implements Ad
{
  private d a;
  
  public InterstitialAd(Activity paramActivity, String paramString)
  {
    this(paramActivity, paramString, false);
  }
  
  public InterstitialAd(Activity paramActivity, String paramString, boolean paramBoolean)
  {
    this.a = new d(this, paramActivity, null, paramString, null, paramBoolean);
  }
  
  public boolean isReady()
  {
    return this.a.s();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    this.a.a(paramAdRequest);
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.a.i().o.a(paramAdListener);
  }
  
  protected void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.a.i().p.a(paramAppEventListener);
  }
  
  public void show()
  {
    this.a.B();
  }
  
  public void stopLoading()
  {
    this.a.C();
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.InterstitialAd
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */