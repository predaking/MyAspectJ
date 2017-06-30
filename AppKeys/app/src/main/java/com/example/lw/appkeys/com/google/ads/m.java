package com.example.lw.appkeys.com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.internal.h;
import com.google.ads.util.i;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;
import com.google.ads.util.i.d;

public class m
  extends i
{
  public final i.b<l> a;
  public final i.b<String> b;
  public final i.d<Activity> c;
  public final i.b<Context> d;
  public final i.b<ViewGroup> e;
  public final i.b<Ad> f;
  public final i.b<AdView> g;
  public final i.b<InterstitialAd> h;
  public final i.b<h> i;
  public final i.c<AdSize[]> j;
  public final i.c<AdListener> k = new i.c(this, "adListener");
  public final i.c<AppEventListener> l = new i.c(this, "appEventListener");
  
  public m(l paraml, Ad paramAd, AdView paramAdView, InterstitialAd paramInterstitialAd, String paramString, Activity paramActivity, Context paramContext, ViewGroup paramViewGroup, h paramh)
  {
    this.a = new i.b(this, "appState", paraml);
    this.f = new i.b(this, "ad", paramAd);
    this.g = new i.b(this, "adView", paramAdView);
    this.i = new i.b(this, "adType", paramh);
    this.b = new i.b(this, "adUnitId", paramString);
    this.c = new i.d(this, "activity", paramActivity);
    this.h = new i.b(this, "interstitialAd", paramInterstitialAd);
    this.e = new i.b(this, "bannerContainer", paramViewGroup);
    this.d = new i.b(this, "applicationContext", paramContext);
    this.j = new i.c(this, "adSizes", null);
  }
  
  public static m a(Ad paramAd, String paramString, Activity paramActivity, ViewGroup paramViewGroup, AdSize paramAdSize)
  {
    InterstitialAd localInterstitialAd = null;
    l locall = l.a();
    AdView localAdView;
    String str;
    Context localContext;
    if ((paramAd instanceof AdView))
    {
      localAdView = (AdView)paramAd;
      if ((paramAd instanceof InterstitialAd)) {
        localInterstitialAd = (InterstitialAd)paramAd;
      }
      str = paramString.trim();
      localContext = paramActivity.getApplicationContext();
      if (paramAdSize != null) {
        break label83;
      }
    }
    label83:
    for (paramString = h.a;; paramString = h.a(paramAdSize, paramActivity.getApplicationContext()))
    {
      return new m(locall, paramAd, localAdView, localInterstitialAd, str, paramActivity, localContext, paramViewGroup, paramString);
      localAdView = null;
      break;
    }
  }
  
  public boolean a()
  {
    return !b();
  }
  
  public boolean b()
  {
    return ((h)this.i.a()).a();
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.m
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */