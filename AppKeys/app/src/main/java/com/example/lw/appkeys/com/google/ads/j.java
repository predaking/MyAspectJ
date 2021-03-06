package com.example.lw.appkeys.com.google.ads;

import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.util.a;
import com.google.ads.util.b;

class j
  implements MediationBannerListener
{
  private final h a;
  private boolean b;
  
  public j(h paramh)
  {
    this.a = paramh;
  }
  
  public void onClick(MediationBannerAdapter<?, ?> arg1)
  {
    synchronized (this.a)
    {
      a.a(this.a.c());
      this.a.j().a(this.a, this.b);
      return;
    }
  }
  
  public void onDismissScreen(MediationBannerAdapter<?, ?> arg1)
  {
    synchronized (this.a)
    {
      this.a.j().b(this.a);
      return;
    }
  }
  
  public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter, AdRequest.ErrorCode paramErrorCode)
  {
    synchronized (this.a)
    {
      a.a(paramMediationBannerAdapter, this.a.i());
      b.a("Mediation adapter " + paramMediationBannerAdapter.getClass().getName() + " failed to receive ad with error code: " + paramErrorCode);
      if (!this.a.c())
      {
        h localh2 = this.a;
        if (paramErrorCode == AdRequest.ErrorCode.NO_FILL)
        {
          paramMediationBannerAdapter = g.a.b;
          localh2.a(false, paramMediationBannerAdapter);
        }
      }
      else
      {
        return;
      }
      paramMediationBannerAdapter = g.a.c;
    }
  }
  
  public void onLeaveApplication(MediationBannerAdapter<?, ?> arg1)
  {
    synchronized (this.a)
    {
      this.a.j().c(this.a);
      return;
    }
  }
  
  public void onPresentScreen(MediationBannerAdapter<?, ?> arg1)
  {
    synchronized (this.a)
    {
      this.a.j().a(this.a);
      return;
    }
  }
  
  public void onReceivedAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter)
  {
    synchronized (this.a)
    {
      a.a(paramMediationBannerAdapter, this.a.i());
      try
      {
        this.a.a(paramMediationBannerAdapter.getBannerView());
        if (!this.a.c())
        {
          this.b = false;
          this.a.a(true, g.a.a);
          return;
        }
      }
      catch (Throwable paramMediationBannerAdapter)
      {
        b.b("Error while getting banner View from adapter (" + this.a.h() + "): ", paramMediationBannerAdapter);
        if (!this.a.c()) {
          this.a.a(false, g.a.f);
        }
        return;
      }
    }
    this.b = true;
    this.a.j().a(this.a, this.a.f());
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.j
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */