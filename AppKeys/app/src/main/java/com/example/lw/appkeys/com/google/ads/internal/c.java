package com.example.lw.appkeys.com.google.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.l;
import com.google.ads.l.a;
import com.google.ads.m;
import com.google.ads.searchads.SearchAdRequest;
import com.google.ads.util.AdUtil;
import com.google.ads.util.AdUtil.a;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;
import com.google.ads.util.i.d;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

public class c
  implements Runnable
{
  private String a;
  private String b;
  private String c;
  private String d;
  private boolean e;
  private f f;
  private d g;
  private AdRequest h;
  private WebView i;
  private String j;
  private LinkedList<String> k;
  private String l;
  private AdSize m;
  private volatile boolean n;
  private boolean o;
  private AdRequest.ErrorCode p;
  private boolean q;
  private int r;
  private Thread s;
  private boolean t;
  
  protected c() {}
  
  public c(d paramd)
  {
    this.g = paramd;
    this.j = null;
    this.a = null;
    this.b = null;
    this.c = null;
    this.k = new LinkedList();
    this.p = null;
    this.q = false;
    this.r = -1;
    this.e = false;
    this.o = false;
    this.l = null;
    this.m = null;
    if ((Activity)paramd.h().c.a() != null)
    {
      this.i = new AdWebView(paramd.h(), null);
      this.i.setWebViewClient(i.a(paramd, a.b, false, false));
      this.i.setVisibility(8);
      this.i.setWillNotDraw(true);
      this.f = new f(this, paramd);
      return;
    }
    this.i = null;
    this.f = null;
    com.google.ads.util.b.e("activity was null while trying to create an AdLoader.");
  }
  
  static void a(String paramString, com.google.ads.c paramc, com.google.ads.d paramd)
  {
    if (paramString == null) {}
    while ((paramString.contains("no-store")) || (paramString.contains("no-cache"))) {
      return;
    }
    Matcher localMatcher = Pattern.compile("max-age\\s*=\\s*(\\d+)").matcher(paramString);
    if (localMatcher.find()) {
      try
      {
        int i1 = Integer.parseInt(localMatcher.group(1));
        paramd.a(paramc, i1);
        com.google.ads.util.b.c(String.format(Locale.US, "Caching gWhirl configuration for: %d seconds", new Object[] { Integer.valueOf(i1) }));
        return;
      }
      catch (NumberFormatException paramString)
      {
        com.google.ads.util.b.b("Caught exception trying to parse cache control directive. Overflow?", paramString);
        return;
      }
    }
    com.google.ads.util.b.c("Unrecognized cacheControlDirective: '" + paramString + "'. Not caching configuration.");
  }
  
  private String d()
  {
    if ((this.h instanceof SearchAdRequest)) {
      return "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>";
    }
    return "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>";
  }
  
  private void e()
  {
    AdWebView localAdWebView = this.g.k();
    this.g.l().c(true);
    this.g.m().h();
    this.g.a(new c(localAdWebView, this.a, this.b));
  }
  
  private void f()
  {
    this.g.a(new e(this.g, this.i, this.k, this.r, this.o, this.l, this.m));
  }
  
  private void f(String paramString)
  {
    this.g.a(new c(this.i, null, paramString));
  }
  
  public String a(Map<String, Object> paramMap, Activity paramActivity)
    throws c.b, c.d
  {
    int i1 = 0;
    Context localContext = paramActivity.getApplicationContext();
    Object localObject1 = this.g.m();
    long l1 = ((g)localObject1).m();
    if (l1 > 0L) {
      paramMap.put("prl", Long.valueOf(l1));
    }
    l1 = ((g)localObject1).n();
    if (l1 > 0L) {
      paramMap.put("prnl", Long.valueOf(l1));
    }
    Object localObject2 = ((g)localObject1).l();
    if (localObject2 != null) {
      paramMap.put("ppcl", localObject2);
    }
    localObject2 = ((g)localObject1).k();
    if (localObject2 != null) {
      paramMap.put("pcl", localObject2);
    }
    l1 = ((g)localObject1).j();
    if (l1 > 0L) {
      paramMap.put("pcc", Long.valueOf(l1));
    }
    paramMap.put("preqs", Long.valueOf(((g)localObject1).o()));
    paramMap.put("toar", Long.valueOf(((g)localObject1).p()));
    localObject2 = ((g)localObject1).r();
    if (localObject2 != null) {
      paramMap.put("pai", localObject2);
    }
    if (((g)localObject1).s()) {
      paramMap.put("aoi_timeout", "true");
    }
    if (((g)localObject1).u()) {
      paramMap.put("aoi_nofill", "true");
    }
    localObject2 = ((g)localObject1).x();
    if (localObject2 != null) {
      paramMap.put("pit", localObject2);
    }
    paramMap.put("ptime", Long.valueOf(g.y()));
    ((g)localObject1).a();
    ((g)localObject1).i();
    if (this.g.h().b()) {
      paramMap.put("format", "interstitial_mb");
    }
    int i2;
    for (;;)
    {
      paramMap.put("slotname", this.g.h().b.a());
      paramMap.put("js", "afma-sdk-a-v6.1.0");
      localObject1 = localContext.getPackageName();
      try
      {
        localObject1 = localContext.getPackageManager().getPackageInfo((String)localObject1, 0);
        i2 = ((PackageInfo)localObject1).versionCode;
        localObject1 = AdUtil.f(localContext);
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          paramMap.put("mv", localObject1);
        }
        paramMap.put("msid", localContext.getPackageName());
        paramMap.put("app_name", i2 + ".android." + localContext.getPackageName());
        paramMap.put("isu", AdUtil.a(localContext));
        localObject1 = AdUtil.d(localContext);
        if (localObject1 != null) {
          break;
        }
        throw new d("NETWORK_ERROR");
      }
      catch (NameNotFoundException paramMap)
      {
        throw new b("NameNotFoundException");
      }
      localObject1 = ((h)this.g.h().i.a()).b();
      if (((AdSize)localObject1).isFullWidth()) {
        paramMap.put("smart_w", "full");
      }
      if (((AdSize)localObject1).isAutoHeight()) {
        paramMap.put("smart_h", "auto");
      }
      if (!((AdSize)localObject1).isCustomAdSize())
      {
        paramMap.put("format", ((AdSize)localObject1).toString());
      }
      else
      {
        localObject2 = new HashMap();
        ((Map)localObject2).put("w", Integer.valueOf(((AdSize)localObject1).getWidth()));
        ((Map)localObject2).put("h", Integer.valueOf(((AdSize)localObject1).getHeight()));
        paramMap.put("ad_frame", localObject2);
      }
    }
    paramMap.put("net", localObject1);
    localObject1 = AdUtil.e(localContext);
    if ((localObject1 != null) && (((String)localObject1).length() != 0)) {
      paramMap.put("cap", localObject1);
    }
    paramMap.put("u_audio", Integer.valueOf(AdUtil.g(localContext).ordinal()));
    paramActivity = AdUtil.a(paramActivity);
    paramMap.put("u_sd", Float.valueOf(paramActivity.density));
    paramMap.put("u_h", Integer.valueOf(AdUtil.a(localContext, paramActivity)));
    paramMap.put("u_w", Integer.valueOf(AdUtil.b(localContext, paramActivity)));
    paramMap.put("hl", Locale.getDefault().getLanguage());
    paramActivity = new StringBuilder();
    localObject1 = (AdSize[])this.g.h().j.a();
    if (localObject1 != null)
    {
      i2 = localObject1.length;
      while (i1 < i2)
      {
        localObject2 = localObject1[i1];
        if (paramActivity.length() != 0) {
          paramActivity.append("|");
        }
        paramActivity.append(((AdSize)localObject2).getWidth() + "x" + ((AdSize)localObject2).getHeight());
        i1 += 1;
      }
      paramMap.put("sz", paramActivity.toString());
    }
    paramMap.put("carrier", ((TelephonyManager)localContext.getSystemService("phone")).getNetworkOperator());
    if (AdUtil.c()) {
      paramMap.put("simulator", Integer.valueOf(1));
    }
    paramMap.put("session_id", com.google.ads.b.a().b().toString());
    paramMap.put("seq_num", com.google.ads.b.a().c().toString());
    paramMap = AdUtil.a(paramMap);
    if (((Boolean)((l.a)((l)this.g.h().a.a()).a.a()).l.a()).booleanValue()) {}
    for (paramMap = d() + "AFMA_buildAdURL" + "(" + paramMap + ");" + "</script></head><body></body></html>";; paramMap = d() + "AFMA_getSdkConstants();" + "AFMA_buildAdURL" + "(" + paramMap + ");" + "</script></head><body></body></html>")
    {
      com.google.ads.util.b.c("adRequestUrlHtml: " + paramMap);
      return paramMap;
    }
  }
  
  protected void a()
  {
    com.google.ads.util.b.a("AdLoader cancelled.");
    if (this.i != null)
    {
      this.i.stopLoading();
      this.i.destroy();
    }
    if (this.s != null)
    {
      this.s.interrupt();
      this.s = null;
    }
    if (this.f != null) {
      this.f.a();
    }
    this.n = true;
  }
  
  public void a(int paramInt)
  {
    try
    {
      this.r = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(AdRequest.ErrorCode paramErrorCode)
  {
    try
    {
      this.p = paramErrorCode;
      notify();
      return;
    }
    finally
    {
      paramErrorCode = finally;
      throw paramErrorCode;
    }
  }
  
  protected void a(AdRequest.ErrorCode paramErrorCode, boolean paramBoolean)
  {
    this.g.a(new a(this.g, this.i, this.f, paramErrorCode, paramBoolean));
  }
  
  protected void a(AdRequest paramAdRequest)
  {
    this.h = paramAdRequest;
    this.n = false;
    this.s = new Thread(this);
    this.s.start();
  }
  
  public void a(AdSize paramAdSize)
  {
    try
    {
      this.m = paramAdSize;
      return;
    }
    finally
    {
      paramAdSize = finally;
      throw paramAdSize;
    }
  }
  
  protected void a(String paramString)
  {
    try
    {
      this.k.add(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  protected void a(String paramString1, String paramString2)
  {
    try
    {
      this.a = paramString2;
      this.b = paramString1;
      notify();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    try
    {
      this.e = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void b()
  {
    try
    {
      if (TextUtils.isEmpty(this.d))
      {
        com.google.ads.util.b.b("Got a mediation response with no content type. Aborting mediation.");
        a(AdRequest.ErrorCode.INTERNAL_ERROR, false);
        return;
      }
      if (!this.d.startsWith("application/json"))
      {
        com.google.ads.util.b.b("Got a mediation response with a content type: '" + this.d + "'. Expected something starting with 'application/json'. Aborting mediation.");
        a(AdRequest.ErrorCode.INTERNAL_ERROR, false);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      com.google.ads.util.b.b("AdLoader can't parse gWhirl server configuration.", localJSONException);
      a(AdRequest.ErrorCode.INTERNAL_ERROR, false);
      return;
    }
    final com.google.ads.c localc = com.google.ads.c.a(this.b);
    a(this.c, localc, this.g.i());
    this.g.a(new Runnable()
    {
      public void run()
      {
        if (c.a(c.this) != null)
        {
          c.a(c.this).stopLoading();
          c.a(c.this).destroy();
        }
        c.c(c.this).a(c.b(c.this));
        if (c.d(c.this) != null) {
          ((h)c.c(c.this).h().i.a()).b(c.d(c.this));
        }
        c.c(c.this).a(localc);
      }
    });
  }
  
  protected void b(String paramString)
  {
    try
    {
      this.d = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void b(boolean paramBoolean)
  {
    try
    {
      this.o = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void c()
  {
    try
    {
      this.q = true;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected void c(String paramString)
  {
    try
    {
      this.c = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void c(boolean paramBoolean)
  {
    this.t = paramBoolean;
  }
  
  public void d(String paramString)
  {
    try
    {
      this.j = paramString;
      notify();
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void e(String paramString)
  {
    try
    {
      this.l = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 109	com/google/ads/internal/c:i	Landroid/webkit/WebView;
    //   6: ifnull +10 -> 16
    //   9: aload_0
    //   10: getfield 140	com/google/ads/internal/c:f	Lcom/google/ads/internal/f;
    //   13: ifnonnull +20 -> 33
    //   16: ldc_w 681
    //   19: invokestatic 147	com/google/ads/util/b:e	(Ljava/lang/String;)V
    //   22: aload_0
    //   23: getstatic 645	com/google/ads/AdRequest$ErrorCode:INTERNAL_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   26: iconst_0
    //   27: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: aload_0
    //   34: getfield 58	com/google/ads/internal/c:g	Lcom/google/ads/internal/d;
    //   37: invokevirtual 90	com/google/ads/internal/d:h	()Lcom/google/ads/m;
    //   40: getfield 95	com/google/ads/m:c	Lcom/google/ads/util/i$d;
    //   43: invokevirtual 100	com/google/ads/util/i$d:a	()Ljava/lang/Object;
    //   46: checkcast 102	android/app/Activity
    //   49: astore 8
    //   51: aload 8
    //   53: ifnonnull +27 -> 80
    //   56: ldc_w 683
    //   59: invokestatic 147	com/google/ads/util/b:e	(Ljava/lang/String;)V
    //   62: aload_0
    //   63: getstatic 645	com/google/ads/AdRequest$ErrorCode:INTERNAL_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   66: iconst_0
    //   67: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   70: aload_0
    //   71: monitorexit
    //   72: return
    //   73: astore 8
    //   75: aload_0
    //   76: monitorexit
    //   77: aload 8
    //   79: athrow
    //   80: aload_0
    //   81: getfield 58	com/google/ads/internal/c:g	Lcom/google/ads/internal/d;
    //   84: invokevirtual 684	com/google/ads/internal/d:o	()J
    //   87: lstore_1
    //   88: invokestatic 689	android/os/SystemClock:elapsedRealtime	()J
    //   91: lstore_3
    //   92: aload_0
    //   93: getfield 237	com/google/ads/internal/c:h	Lcom/google/ads/AdRequest;
    //   96: aload_0
    //   97: getfield 58	com/google/ads/internal/c:g	Lcom/google/ads/internal/d;
    //   100: invokevirtual 90	com/google/ads/internal/d:h	()Lcom/google/ads/m;
    //   103: getfield 691	com/google/ads/m:d	Lcom/google/ads/util/i$b;
    //   106: invokevirtual 356	com/google/ads/util/i$b:a	()Ljava/lang/Object;
    //   109: checkcast 362	android/content/Context
    //   112: invokevirtual 697	com/google/ads/AdRequest:getRequestMap	(Landroid/content/Context;)Ljava/util/Map;
    //   115: astore 9
    //   117: aload 9
    //   119: ldc_w 699
    //   122: invokeinterface 703 2 0
    //   127: astore 10
    //   129: aload 10
    //   131: instanceof 286
    //   134: ifeq +142 -> 276
    //   137: aload 10
    //   139: checkcast 286	java/util/Map
    //   142: astore 10
    //   144: aload 10
    //   146: ldc_w 705
    //   149: invokeinterface 703 2 0
    //   154: astore 11
    //   156: aload 11
    //   158: instanceof 155
    //   161: ifeq +12 -> 173
    //   164: aload_0
    //   165: aload 11
    //   167: checkcast 155	java/lang/String
    //   170: putfield 62	com/google/ads/internal/c:a	Ljava/lang/String;
    //   173: aload 10
    //   175: ldc_w 707
    //   178: invokeinterface 703 2 0
    //   183: astore 11
    //   185: aload 11
    //   187: instanceof 155
    //   190: ifeq +12 -> 202
    //   193: aload_0
    //   194: aload 11
    //   196: checkcast 155	java/lang/String
    //   199: putfield 60	com/google/ads/internal/c:j	Ljava/lang/String;
    //   202: aload 10
    //   204: ldc_w 709
    //   207: invokeinterface 703 2 0
    //   212: astore 11
    //   214: aload 11
    //   216: instanceof 155
    //   219: ifeq +19 -> 238
    //   222: aload 11
    //   224: ldc_w 710
    //   227: invokevirtual 713	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   230: ifeq +120 -> 350
    //   233: aload_0
    //   234: iconst_1
    //   235: putfield 77	com/google/ads/internal/c:r	I
    //   238: aload 10
    //   240: ldc_w 715
    //   243: invokeinterface 703 2 0
    //   248: astore 10
    //   250: aload 10
    //   252: instanceof 155
    //   255: ifeq +21 -> 276
    //   258: aload 10
    //   260: ldc_w 716
    //   263: invokevirtual 713	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   266: ifeq +10 -> 276
    //   269: aload_0
    //   270: getfield 58	com/google/ads/internal/c:g	Lcom/google/ads/internal/d;
    //   273: invokevirtual 718	com/google/ads/internal/d:d	()V
    //   276: aload_0
    //   277: getfield 62	com/google/ads/internal/c:a	Ljava/lang/String;
    //   280: ifnonnull +562 -> 842
    //   283: aload_0
    //   284: getfield 60	com/google/ads/internal/c:j	Ljava/lang/String;
    //   287: astore 10
    //   289: aload 10
    //   291: ifnonnull +268 -> 559
    //   294: aload_0
    //   295: aload 9
    //   297: aload 8
    //   299: invokevirtual 720	com/google/ads/internal/c:a	(Ljava/util/Map;Landroid/app/Activity;)Ljava/lang/String;
    //   302: astore 8
    //   304: aload_0
    //   305: aload 8
    //   307: invokespecial 722	com/google/ads/internal/c:f	(Ljava/lang/String;)V
    //   310: invokestatic 689	android/os/SystemClock:elapsedRealtime	()J
    //   313: lstore 5
    //   315: lload_1
    //   316: lload 5
    //   318: lload_3
    //   319: lsub
    //   320: lsub
    //   321: lstore 5
    //   323: lload 5
    //   325: lconst_0
    //   326: lcmp
    //   327: ifle +9 -> 336
    //   330: aload_0
    //   331: lload 5
    //   333: invokevirtual 726	java/lang/Object:wait	(J)V
    //   336: aload_0
    //   337: getfield 612	com/google/ads/internal/c:n	Z
    //   340: istore 7
    //   342: iload 7
    //   344: ifeq +149 -> 493
    //   347: aload_0
    //   348: monitorexit
    //   349: return
    //   350: aload 11
    //   352: ldc_w 727
    //   355: invokevirtual 713	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   358: ifeq -120 -> 238
    //   361: aload_0
    //   362: iconst_0
    //   363: putfield 77	com/google/ads/internal/c:r	I
    //   366: goto -128 -> 238
    //   369: astore 8
    //   371: ldc_w 729
    //   374: aload 8
    //   376: invokestatic 217	com/google/ads/util/b:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   379: aload_0
    //   380: getstatic 645	com/google/ads/AdRequest$ErrorCode:INTERNAL_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   383: iconst_1
    //   384: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   387: aload_0
    //   388: monitorexit
    //   389: return
    //   390: astore 8
    //   392: new 219	java/lang/StringBuilder
    //   395: dup
    //   396: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   399: ldc_w 731
    //   402: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   405: aload 8
    //   407: invokevirtual 734	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   410: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   413: invokestatic 212	com/google/ads/util/b:c	(Ljava/lang/String;)V
    //   416: aload_0
    //   417: getstatic 736	com/google/ads/AdRequest$ErrorCode:NETWORK_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   420: iconst_0
    //   421: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   424: aload_0
    //   425: monitorexit
    //   426: return
    //   427: astore 8
    //   429: new 219	java/lang/StringBuilder
    //   432: dup
    //   433: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   436: ldc_w 738
    //   439: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   442: aload 8
    //   444: invokevirtual 734	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   447: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   450: invokestatic 212	com/google/ads/util/b:c	(Ljava/lang/String;)V
    //   453: aload_0
    //   454: getstatic 645	com/google/ads/AdRequest$ErrorCode:INTERNAL_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   457: iconst_0
    //   458: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   461: aload_0
    //   462: monitorexit
    //   463: return
    //   464: astore 8
    //   466: new 219	java/lang/StringBuilder
    //   469: dup
    //   470: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   473: ldc_w 740
    //   476: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   479: aload 8
    //   481: invokevirtual 734	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   484: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   487: invokestatic 596	com/google/ads/util/b:a	(Ljava/lang/String;)V
    //   490: aload_0
    //   491: monitorexit
    //   492: return
    //   493: aload_0
    //   494: getfield 73	com/google/ads/internal/c:p	Lcom/google/ads/AdRequest$ErrorCode;
    //   497: ifnull +15 -> 512
    //   500: aload_0
    //   501: aload_0
    //   502: getfield 73	com/google/ads/internal/c:p	Lcom/google/ads/AdRequest$ErrorCode;
    //   505: iconst_0
    //   506: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   509: aload_0
    //   510: monitorexit
    //   511: return
    //   512: aload_0
    //   513: getfield 60	com/google/ads/internal/c:j	Ljava/lang/String;
    //   516: ifnonnull +43 -> 559
    //   519: new 219	java/lang/StringBuilder
    //   522: dup
    //   523: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   526: ldc_w 742
    //   529: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   532: lload_1
    //   533: invokevirtual 745	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   536: ldc_w 747
    //   539: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   542: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   545: invokestatic 212	com/google/ads/util/b:c	(Ljava/lang/String;)V
    //   548: aload_0
    //   549: getstatic 736	com/google/ads/AdRequest$ErrorCode:NETWORK_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   552: iconst_0
    //   553: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   556: aload_0
    //   557: monitorexit
    //   558: return
    //   559: aload_0
    //   560: getfield 140	com/google/ads/internal/c:f	Lcom/google/ads/internal/f;
    //   563: aload_0
    //   564: getfield 674	com/google/ads/internal/c:t	Z
    //   567: invokevirtual 749	com/google/ads/internal/f:a	(Z)V
    //   570: aload_0
    //   571: getfield 140	com/google/ads/internal/c:f	Lcom/google/ads/internal/f;
    //   574: aload_0
    //   575: getfield 60	com/google/ads/internal/c:j	Ljava/lang/String;
    //   578: invokevirtual 750	com/google/ads/internal/f:a	(Ljava/lang/String;)V
    //   581: invokestatic 689	android/os/SystemClock:elapsedRealtime	()J
    //   584: lstore 5
    //   586: lload_1
    //   587: lload 5
    //   589: lload_3
    //   590: lsub
    //   591: lsub
    //   592: lstore 5
    //   594: lload 5
    //   596: lconst_0
    //   597: lcmp
    //   598: ifle +9 -> 607
    //   601: aload_0
    //   602: lload 5
    //   604: invokevirtual 726	java/lang/Object:wait	(J)V
    //   607: aload_0
    //   608: getfield 612	com/google/ads/internal/c:n	Z
    //   611: istore 7
    //   613: iload 7
    //   615: ifeq +35 -> 650
    //   618: aload_0
    //   619: monitorexit
    //   620: return
    //   621: astore 8
    //   623: new 219	java/lang/StringBuilder
    //   626: dup
    //   627: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   630: ldc_w 752
    //   633: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   636: aload 8
    //   638: invokevirtual 734	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   641: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   644: invokestatic 596	com/google/ads/util/b:a	(Ljava/lang/String;)V
    //   647: aload_0
    //   648: monitorexit
    //   649: return
    //   650: aload_0
    //   651: getfield 73	com/google/ads/internal/c:p	Lcom/google/ads/AdRequest$ErrorCode;
    //   654: ifnull +15 -> 669
    //   657: aload_0
    //   658: aload_0
    //   659: getfield 73	com/google/ads/internal/c:p	Lcom/google/ads/AdRequest$ErrorCode;
    //   662: iconst_0
    //   663: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   666: aload_0
    //   667: monitorexit
    //   668: return
    //   669: aload_0
    //   670: getfield 64	com/google/ads/internal/c:b	Ljava/lang/String;
    //   673: ifnonnull +43 -> 716
    //   676: new 219	java/lang/StringBuilder
    //   679: dup
    //   680: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   683: ldc_w 742
    //   686: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   689: lload_1
    //   690: invokevirtual 745	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   693: ldc_w 754
    //   696: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   699: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   702: invokestatic 212	com/google/ads/util/b:c	(Ljava/lang/String;)V
    //   705: aload_0
    //   706: getstatic 736	com/google/ads/AdRequest$ErrorCode:NETWORK_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   709: iconst_0
    //   710: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   713: aload_0
    //   714: monitorexit
    //   715: return
    //   716: aload_0
    //   717: getfield 58	com/google/ads/internal/c:g	Lcom/google/ads/internal/d;
    //   720: invokevirtual 90	com/google/ads/internal/d:h	()Lcom/google/ads/m;
    //   723: getfield 513	com/google/ads/m:j	Lcom/google/ads/util/i$c;
    //   726: invokevirtual 516	com/google/ads/util/i$c:a	()Ljava/lang/Object;
    //   729: ifnull +95 -> 824
    //   732: aload_0
    //   733: getfield 85	com/google/ads/internal/c:m	Lcom/google/ads/AdSize;
    //   736: ifnonnull +20 -> 756
    //   739: ldc_w 756
    //   742: invokestatic 640	com/google/ads/util/b:b	(Ljava/lang/String;)V
    //   745: aload_0
    //   746: getstatic 645	com/google/ads/AdRequest$ErrorCode:INTERNAL_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   749: iconst_0
    //   750: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   753: aload_0
    //   754: monitorexit
    //   755: return
    //   756: aload_0
    //   757: getfield 58	com/google/ads/internal/c:g	Lcom/google/ads/internal/d;
    //   760: invokevirtual 90	com/google/ads/internal/d:h	()Lcom/google/ads/m;
    //   763: getfield 513	com/google/ads/m:j	Lcom/google/ads/util/i$c;
    //   766: invokevirtual 516	com/google/ads/util/i$c:a	()Ljava/lang/Object;
    //   769: checkcast 758	[Ljava/lang/Object;
    //   772: invokestatic 764	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   775: aload_0
    //   776: getfield 85	com/google/ads/internal/c:m	Lcom/google/ads/AdSize;
    //   779: invokeinterface 768 2 0
    //   784: ifne +58 -> 842
    //   787: new 219	java/lang/StringBuilder
    //   790: dup
    //   791: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   794: ldc_w 770
    //   797: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   800: aload_0
    //   801: getfield 85	com/google/ads/internal/c:m	Lcom/google/ads/AdSize;
    //   804: invokevirtual 734	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   807: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   810: invokestatic 640	com/google/ads/util/b:b	(Ljava/lang/String;)V
    //   813: aload_0
    //   814: getstatic 645	com/google/ads/AdRequest$ErrorCode:INTERNAL_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   817: iconst_0
    //   818: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   821: aload_0
    //   822: monitorexit
    //   823: return
    //   824: aload_0
    //   825: getfield 85	com/google/ads/internal/c:m	Lcom/google/ads/AdSize;
    //   828: ifnull +14 -> 842
    //   831: ldc_w 772
    //   834: invokestatic 147	com/google/ads/util/b:e	(Ljava/lang/String;)V
    //   837: aload_0
    //   838: aconst_null
    //   839: putfield 85	com/google/ads/internal/c:m	Lcom/google/ads/AdSize;
    //   842: aload_0
    //   843: getfield 79	com/google/ads/internal/c:e	Z
    //   846: ifeq +18 -> 864
    //   849: aload_0
    //   850: getfield 58	com/google/ads/internal/c:g	Lcom/google/ads/internal/d;
    //   853: iconst_1
    //   854: invokevirtual 774	com/google/ads/internal/d:b	(Z)V
    //   857: aload_0
    //   858: invokevirtual 776	com/google/ads/internal/c:b	()V
    //   861: aload_0
    //   862: monitorexit
    //   863: return
    //   864: aload_0
    //   865: getfield 636	com/google/ads/internal/c:d	Ljava/lang/String;
    //   868: ifnull +72 -> 940
    //   871: aload_0
    //   872: getfield 636	com/google/ads/internal/c:d	Ljava/lang/String;
    //   875: ldc_w 649
    //   878: invokevirtual 653	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   881: ifne +16 -> 897
    //   884: aload_0
    //   885: getfield 636	com/google/ads/internal/c:d	Ljava/lang/String;
    //   888: ldc_w 778
    //   891: invokevirtual 653	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   894: ifeq +46 -> 940
    //   897: new 219	java/lang/StringBuilder
    //   900: dup
    //   901: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   904: ldc_w 780
    //   907: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   910: aload_0
    //   911: getfield 636	com/google/ads/internal/c:d	Ljava/lang/String;
    //   914: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   917: ldc_w 782
    //   920: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   923: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   926: invokestatic 640	com/google/ads/util/b:b	(Ljava/lang/String;)V
    //   929: aload_0
    //   930: getstatic 645	com/google/ads/AdRequest$ErrorCode:INTERNAL_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   933: iconst_0
    //   934: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   937: aload_0
    //   938: monitorexit
    //   939: return
    //   940: aload_0
    //   941: getfield 58	com/google/ads/internal/c:g	Lcom/google/ads/internal/d;
    //   944: iconst_0
    //   945: invokevirtual 774	com/google/ads/internal/d:b	(Z)V
    //   948: aload_0
    //   949: invokespecial 784	com/google/ads/internal/c:e	()V
    //   952: invokestatic 689	android/os/SystemClock:elapsedRealtime	()J
    //   955: lstore 5
    //   957: lload_1
    //   958: lload 5
    //   960: lload_3
    //   961: lsub
    //   962: lsub
    //   963: lstore_3
    //   964: lload_3
    //   965: lconst_0
    //   966: lcmp
    //   967: ifle +8 -> 975
    //   970: aload_0
    //   971: lload_3
    //   972: invokevirtual 726	java/lang/Object:wait	(J)V
    //   975: aload_0
    //   976: getfield 75	com/google/ads/internal/c:q	Z
    //   979: ifeq +39 -> 1018
    //   982: aload_0
    //   983: invokespecial 786	com/google/ads/internal/c:f	()V
    //   986: goto -599 -> 387
    //   989: astore 8
    //   991: new 219	java/lang/StringBuilder
    //   994: dup
    //   995: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   998: ldc_w 788
    //   1001: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1004: aload 8
    //   1006: invokevirtual 734	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1009: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1012: invokestatic 596	com/google/ads/util/b:a	(Ljava/lang/String;)V
    //   1015: aload_0
    //   1016: monitorexit
    //   1017: return
    //   1018: new 219	java/lang/StringBuilder
    //   1021: dup
    //   1022: invokespecial 220	java/lang/StringBuilder:<init>	()V
    //   1025: ldc_w 742
    //   1028: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1031: lload_1
    //   1032: invokevirtual 745	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1035: ldc_w 790
    //   1038: invokevirtual 226	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1041: invokevirtual 232	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1044: invokestatic 212	com/google/ads/util/b:c	(Ljava/lang/String;)V
    //   1047: aload_0
    //   1048: getstatic 736	com/google/ads/AdRequest$ErrorCode:NETWORK_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   1051: iconst_1
    //   1052: invokevirtual 647	com/google/ads/internal/c:a	(Lcom/google/ads/AdRequest$ErrorCode;Z)V
    //   1055: goto -668 -> 387
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1058	0	this	c
    //   87	945	1	l1	long
    //   91	881	3	l2	long
    //   313	646	5	l3	long
    //   340	274	7	bool	boolean
    //   49	3	8	localActivity1	Activity
    //   73	225	8	localActivity2	Activity
    //   302	4	8	str	String
    //   369	6	8	localThrowable	java.lang.Throwable
    //   390	16	8	locald	d
    //   427	16	8	localb	b
    //   464	16	8	localInterruptedException1	java.lang.InterruptedException
    //   621	16	8	localInterruptedException2	java.lang.InterruptedException
    //   989	16	8	localInterruptedException3	java.lang.InterruptedException
    //   115	181	9	localMap	Map
    //   127	163	10	localObject1	Object
    //   154	197	11	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	73	finally
    //   16	30	73	finally
    //   30	32	73	finally
    //   33	51	73	finally
    //   56	70	73	finally
    //   70	72	73	finally
    //   75	77	73	finally
    //   80	173	73	finally
    //   173	202	73	finally
    //   202	238	73	finally
    //   238	276	73	finally
    //   276	289	73	finally
    //   294	304	73	finally
    //   304	315	73	finally
    //   330	336	73	finally
    //   336	342	73	finally
    //   347	349	73	finally
    //   350	366	73	finally
    //   371	387	73	finally
    //   387	389	73	finally
    //   392	424	73	finally
    //   424	426	73	finally
    //   429	461	73	finally
    //   461	463	73	finally
    //   466	490	73	finally
    //   490	492	73	finally
    //   493	509	73	finally
    //   509	511	73	finally
    //   512	556	73	finally
    //   556	558	73	finally
    //   559	586	73	finally
    //   601	607	73	finally
    //   607	613	73	finally
    //   618	620	73	finally
    //   623	647	73	finally
    //   647	649	73	finally
    //   650	666	73	finally
    //   666	668	73	finally
    //   669	713	73	finally
    //   713	715	73	finally
    //   716	753	73	finally
    //   753	755	73	finally
    //   756	821	73	finally
    //   821	823	73	finally
    //   824	842	73	finally
    //   842	861	73	finally
    //   861	863	73	finally
    //   864	897	73	finally
    //   897	937	73	finally
    //   937	939	73	finally
    //   940	957	73	finally
    //   970	975	73	finally
    //   975	986	73	finally
    //   991	1015	73	finally
    //   1015	1017	73	finally
    //   1018	1055	73	finally
    //   2	16	369	java/lang/Throwable
    //   16	30	369	java/lang/Throwable
    //   33	51	369	java/lang/Throwable
    //   56	70	369	java/lang/Throwable
    //   80	173	369	java/lang/Throwable
    //   173	202	369	java/lang/Throwable
    //   202	238	369	java/lang/Throwable
    //   238	276	369	java/lang/Throwable
    //   276	289	369	java/lang/Throwable
    //   294	304	369	java/lang/Throwable
    //   304	315	369	java/lang/Throwable
    //   330	336	369	java/lang/Throwable
    //   336	342	369	java/lang/Throwable
    //   350	366	369	java/lang/Throwable
    //   392	424	369	java/lang/Throwable
    //   429	461	369	java/lang/Throwable
    //   466	490	369	java/lang/Throwable
    //   493	509	369	java/lang/Throwable
    //   512	556	369	java/lang/Throwable
    //   559	586	369	java/lang/Throwable
    //   601	607	369	java/lang/Throwable
    //   607	613	369	java/lang/Throwable
    //   623	647	369	java/lang/Throwable
    //   650	666	369	java/lang/Throwable
    //   669	713	369	java/lang/Throwable
    //   716	753	369	java/lang/Throwable
    //   756	821	369	java/lang/Throwable
    //   824	842	369	java/lang/Throwable
    //   842	861	369	java/lang/Throwable
    //   864	897	369	java/lang/Throwable
    //   897	937	369	java/lang/Throwable
    //   940	957	369	java/lang/Throwable
    //   970	975	369	java/lang/Throwable
    //   975	986	369	java/lang/Throwable
    //   991	1015	369	java/lang/Throwable
    //   1018	1055	369	java/lang/Throwable
    //   294	304	390	com/google/ads/internal/c$d
    //   294	304	427	com/google/ads/internal/c$b
    //   330	336	464	java/lang/InterruptedException
    //   601	607	621	java/lang/InterruptedException
    //   970	975	989	java/lang/InterruptedException
  }
  
  private static class a
    implements Runnable
  {
    private final d a;
    private final WebView b;
    private final f c;
    private final AdRequest.ErrorCode d;
    private final boolean e;
    
    public a(d paramd, WebView paramWebView, f paramf, AdRequest.ErrorCode paramErrorCode, boolean paramBoolean)
    {
      this.a = paramd;
      this.b = paramWebView;
      this.c = paramf;
      this.d = paramErrorCode;
      this.e = paramBoolean;
    }
    
    public void run()
    {
      if (this.b != null)
      {
        this.b.stopLoading();
        this.b.destroy();
      }
      if (this.c != null) {
        this.c.a();
      }
      if (this.e)
      {
        AdWebView localAdWebView = this.a.k();
        localAdWebView.stopLoading();
        localAdWebView.setVisibility(8);
      }
      this.a.a(this.d);
    }
  }
  
  private class b
    extends Exception
  {
    public b(String paramString)
    {
      super();
    }
  }
  
  private class c
    implements Runnable
  {
    private final String b;
    private final String c;
    private final WebView d;
    
    public c(WebView paramWebView, String paramString1, String paramString2)
    {
      this.d = paramWebView;
      this.b = paramString1;
      this.c = paramString2;
    }
    
    public void run()
    {
      if (this.c != null)
      {
        this.d.loadDataWithBaseURL(this.b, this.c, "text/html", "utf-8", null);
        return;
      }
      this.d.loadUrl(this.b);
    }
  }
  
  private class d
    extends Exception
  {
    public d(String paramString)
    {
      super();
    }
  }
  
  private static class e
    implements Runnable
  {
    private final d a;
    private final WebView b;
    private final LinkedList<String> c;
    private final int d;
    private final boolean e;
    private final String f;
    private final AdSize g;
    
    public e(d paramd, WebView paramWebView, LinkedList<String> paramLinkedList, int paramInt, boolean paramBoolean, String paramString, AdSize paramAdSize)
    {
      this.a = paramd;
      this.b = paramWebView;
      this.c = paramLinkedList;
      this.d = paramInt;
      this.e = paramBoolean;
      this.f = paramString;
      this.g = paramAdSize;
    }
    
    public void run()
    {
      if (this.b != null)
      {
        this.b.stopLoading();
        this.b.destroy();
      }
      this.a.a(this.c);
      this.a.a(this.d);
      this.a.a(this.e);
      this.a.a(this.f);
      if (this.g != null)
      {
        ((h)this.a.h().i.a()).b(this.g);
        this.a.k().setAdSize(this.g);
      }
      this.a.C();
    }
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.internal.c
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */