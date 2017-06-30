package com.example.lw.appkeys.com.google.ads.mediation.admob;

import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.MediationServerParameters.Parameter;

public final class AdMobAdapterServerParameters
  extends MediationServerParameters
{
  @MediationServerParameters.Parameter(name="pubid")
  public String adUnitId;
  @MediationServerParameters.Parameter(name="mad_hac", required=false)
  public String allowHouseAds = null;
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.admob.AdMobAdapterServerParameters
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */