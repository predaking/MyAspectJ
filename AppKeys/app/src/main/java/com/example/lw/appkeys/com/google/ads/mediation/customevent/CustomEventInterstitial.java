package com.example.lw.appkeys.com.google.ads.mediation.customevent;

import android.app.Activity;
import com.google.ads.mediation.MediationAdRequest;

public abstract interface CustomEventInterstitial
{
  public abstract void requestInterstitialAd(CustomEventInterstitialListener paramCustomEventInterstitialListener, Activity paramActivity, String paramString1, String paramString2, MediationAdRequest paramMediationAdRequest);
  
  public abstract void showInterstitial();
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventInterstitial
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */