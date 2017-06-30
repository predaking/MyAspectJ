package com.example.lw.appkeys.com.google.ads;

import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.util.a;
import com.google.ads.util.b;

class k
  implements MediationInterstitialListener
{
  private final h a;
  
  k(h paramh)
  {
    this.a = paramh;
  }
  
  public void onDismissScreen(MediationInterstitialAdapter<?, ?> arg1)
  {
    synchronized (this.a)
    {
      this.a.j().b(this.a);
      return;
    }
  }
  
  public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter, AdRequest.ErrorCode paramErrorCode)
  {
    for (;;)
    {
      synchronized (this.a)
      {
        a.a(paramMediationInterstitialAdapter, this.a.i());
        b.a("Mediation adapter " + paramMediationInterstitialAdapter.getClass().getName() + " failed to receive ad with error code: " + paramErrorCode);
        if (this.a.c())
        {
          b.b("Got an onFailedToReceiveAd() callback after loadAdTask is done from an interstitial adapter.  Ignoring callback.");
          return;
        }
        h localh2 = this.a;
        if (paramErrorCode == AdRequest.ErrorCode.NO_FILL)
        {
          paramMediationInterstitialAdapter = g.a.b;
          localh2.a(false, paramMediationInterstitialAdapter);
        }
      }
      paramMediationInterstitialAdapter = g.a.c;
    }
  }
  
  public void onLeaveApplication(MediationInterstitialAdapter<?, ?> arg1)
  {
    synchronized (this.a)
    {
      this.a.j().c(this.a);
      return;
    }
  }
  
  public void onPresentScreen(MediationInterstitialAdapter<?, ?> arg1)
  {
    synchronized (this.a)
    {
      this.a.j().a(this.a);
      return;
    }
  }
  
  public void onReceivedAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter)
  {
    synchronized (this.a)
    {
      a.a(paramMediationInterstitialAdapter, this.a.i());
      if (this.a.c())
      {
        b.b("Got an onReceivedAd() callback after loadAdTask is done from an interstitial adapter. Ignoring callback.");
        return;
      }
      this.a.a(true, g.a.a);
    }
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.k
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */