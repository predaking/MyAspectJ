package com.example.lw.appkeys.com.google.ads;

import android.app.Activity;
import com.google.ads.internal.d;
import com.google.ads.util.i.c;

public class InterstitialAd
  implements Ad
{
  private d a;
  private m b;
  
  public InterstitialAd(Activity paramActivity, String paramString)
  {
    this(paramActivity, paramString, false);
  }
  
  public InterstitialAd(Activity paramActivity, String paramString, boolean paramBoolean)
  {
    this.b = m.a(this, paramString, paramActivity, null, null);
    this.a = new d(this.b, paramBoolean);
  }
  
  public boolean isReady()
  {
    return this.a.r();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    this.a.a(paramAdRequest);
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.b.k.a(paramAdListener);
  }
  
  protected void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.b.l.a(paramAppEventListener);
  }
  
  public void show()
  {
    this.a.z();
  }
  
  public void stopLoading()
  {
    this.a.A();
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.InterstitialAd
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */