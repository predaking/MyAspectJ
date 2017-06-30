package com.example.lw.appline.com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.e.k;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;

public class ao
  extends k
{
  private static final ao d = new ao();
  public final k.c<String> a = new k.c(this, "marketPackages", null);
  public final k.b<a> b = new k.b(this, "constants", new a());
  public final k.b<Handler> c = new k.b(this, "uiHandler", new Handler(Looper.getMainLooper()));
  
  public static ao a()
  {
    return d;
  }
  
  public static final class a
    extends k
  {
    public final k.c<String> a = new k.c(this, "ASDomains", null);
    public final k.c<Integer> b = new k.c(this, "minHwAccelerationVersionBanner", Integer.valueOf(18));
    public final k.c<Integer> c = new k.c(this, "minHwAccelerationVersionOverlay", Integer.valueOf(18));
    public final k.c<Integer> d = new k.c(this, "minHwAccelerationVersionOverlay", Integer.valueOf(14));
    public final k.c<String> e = new k.c(this, "mraidBannerPath", "http://media.admob.com/mraid/v1/mraid_app_banner.js");
    public final k.c<String> f = new k.c(this, "mraidExpandedBannerPath", "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
    public final k.c<String> g = new k.c(this, "mraidInterstitialPath", "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
    public final k.c<String> h = new k.c(this, "badAdReportPath", "https://badad.googleplex.com/s/reportAd");
    public final k.c<Long> i = new k.c(this, "appCacheMaxSize", Long.valueOf(0L));
    public final k.c<Long> j = new k.c(this, "appCacheMaxSizePaddingInBytes", Long.valueOf(131072L));
    public final k.c<Long> k = new k.c(this, "maxTotalAppCacheQuotaInBytes", Long.valueOf(5242880L));
    public final k.c<Long> l = new k.c(this, "maxTotalDatabaseQuotaInBytes", Long.valueOf(5242880L));
    public final k.c<Long> m = new k.c(this, "maxDatabaseQuotaPerOriginInBytes", Long.valueOf(1048576L));
    public final k.c<Long> n = new k.c(this, "databaseQuotaIncreaseStepInBytes", Long.valueOf(131072L));
    public final k.c<Boolean> o = new k.c(this, "isInitialized", Boolean.valueOf(false));
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ao
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */