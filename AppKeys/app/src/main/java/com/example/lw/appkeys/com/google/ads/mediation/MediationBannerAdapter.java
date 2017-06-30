package com.example.lw.appkeys.com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdSize;

public abstract interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
  extends MediationAdapter<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS>
{
  public abstract View getBannerView();
  
  public abstract void requestBannerAd(MediationBannerListener paramMediationBannerListener, Activity paramActivity, SERVER_PARAMETERS paramSERVER_PARAMETERS, AdSize paramAdSize, MediationAdRequest paramMediationAdRequest, ADDITIONAL_PARAMETERS paramADDITIONAL_PARAMETERS);
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.MediationBannerAdapter
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */