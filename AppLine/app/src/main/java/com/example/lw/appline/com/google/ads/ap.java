package com.example.lw.appline.com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import com.google.ads.e.k.d;

public class ap
  extends com.google.ads.e.k
{
  public final k.b<a> a;
  public final k.b<com.google.ads.b.g> b;
  public final k.d<Activity> c;
  public final k.b<ao> d;
  public final k.b<com.google.ads.b.a> e;
  public final k.b<Context> f;
  public final k.b<com.google.ads.b.k> g;
  public final k.b<String> h;
  public final k.b<ViewGroup> i;
  public final k.b<AdView> j;
  public final k.b<f> k;
  public final k.c<an> l = new k.c(this, "currentAd", null);
  public final k.c<an> m = new k.c(this, "nextAd", null);
  public final k.c<d[]> n;
  public final k.c<b> o = new k.c(this, "adListener");
  public final k.c<e> p = new k.c(this, "appEventListener");
  public final k.c<g> q = new k.c(this, "swipeableEventListener");
  public final k.c<r> r = new k.c(this, "spamSignals", null);
  public final k.c<s> s = new k.c(this, "spamSignalsUtil", null);
  public final k.c<Boolean> t = new k.c(this, "usesManualImpressions", Boolean.valueOf(false));
  
  public ap(ao paramao, a parama, AdView paramAdView, f paramf, String paramString, Activity paramActivity, Context paramContext, ViewGroup paramViewGroup, com.google.ads.b.k paramk, com.google.ads.b.g paramg)
  {
    this.d = new k.b(this, "appState", paramao);
    this.a = new k.b(this, "ad", parama);
    this.j = new k.b(this, "adView", paramAdView);
    this.g = new k.b(this, "adType", paramk);
    this.h = new k.b(this, "adUnitId", paramString);
    this.c = new k.d(this, "activity", paramActivity);
    this.k = new k.b(this, "interstitialAd", paramf);
    this.i = new k.b(this, "bannerContainer", paramViewGroup);
    this.f = new k.b(this, "applicationContext", paramContext);
    this.n = new k.c(this, "adSizes", null);
    this.b = new k.b(this, "adManager", paramg);
    paramao = localObject;
    if (paramk != null)
    {
      paramao = localObject;
      if (paramk.b()) {
        paramao = new com.google.ads.b.a(this);
      }
    }
    this.e = new k.b(this, "activationOverlay", paramao);
  }
  
  public boolean a()
  {
    return !b();
  }
  
  public boolean b()
  {
    return ((com.google.ads.b.k)this.g.a()).a();
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ap
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */