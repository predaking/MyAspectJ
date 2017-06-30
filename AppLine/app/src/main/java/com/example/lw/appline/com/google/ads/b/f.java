package com.example.lw.appline.com.google.ads.b;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.AdView;
import com.google.ads.ad;
import com.google.ads.ae;
import com.google.ads.af;
import com.google.ads.an;
import com.google.ads.ao;
import com.google.ads.ao.a;
import com.google.ads.ap;
import com.google.ads.c.a;
import com.google.ads.e.a.b;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import com.google.ads.e.k.d;
import com.google.ads.p;
import com.google.ads.r;
import com.google.ads.s;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

public class f
  implements Runnable
{
  boolean a;
  private String b;
  private String c;
  private String d;
  private String e;
  private boolean f;
  private i g;
  private com.google.ads.c h;
  private WebView i;
  private an j;
  private String k;
  private String l;
  private LinkedList<String> m;
  private String n;
  private com.google.ads.d o;
  private boolean p = false;
  private volatile boolean q;
  private boolean r;
  private c.a s;
  private boolean t;
  private int u;
  private Thread v;
  private boolean w;
  private d x = d.b;
  
  protected f() {}
  
  public f(an paraman)
  {
    this.j = paraman;
    this.k = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.m = new LinkedList();
    this.s = null;
    this.t = false;
    this.u = -1;
    this.f = false;
    this.r = false;
    this.n = null;
    this.o = null;
    if ((Activity)((ap)paraman.a.a()).c.a() != null)
    {
      this.i = new c((ap)paraman.a.a(), null);
      this.i.setWebViewClient(l.a((g)((ap)paraman.a.a()).b.a(), d.b, false, false));
      this.i.setVisibility(8);
      this.i.setWillNotDraw(true);
      this.g = new i(paraman);
      return;
    }
    this.i = null;
    this.g = null;
    com.google.ads.e.d.e("activity was null while trying to create an AdLoader.");
  }
  
  static void a(String paramString, ae paramae, af paramaf)
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
        paramaf.a(paramae, i1);
        com.google.ads.e.d.c(String.format(Locale.US, "Caching gWhirl configuration for: %d seconds", new Object[] { Integer.valueOf(i1) }));
        return;
      }
      catch (NumberFormatException paramString)
      {
        com.google.ads.e.d.b("Caught exception trying to parse cache control directive. Overflow?", paramString);
        return;
      }
    }
    com.google.ads.e.d.c("Unrecognized cacheControlDirective: '" + paramString + "'. Not caching configuration.");
  }
  
  private void b(String paramString1, String paramString2)
  {
    ((Handler)ao.a().c.a()).post(new c(this.i, paramString2, paramString1));
  }
  
  private String d()
  {
    if ((this.h instanceof com.google.ads.d.a)) {
      return "AFMA_buildAdURL";
    }
    return "AFMA_buildAdURL";
  }
  
  private String e()
  {
    if ((this.h instanceof com.google.ads.d.a)) {
      return "AFMA_getSdkConstants();";
    }
    return "AFMA_getSdkConstants();";
  }
  
  private String f()
  {
    if ((this.h instanceof com.google.ads.d.a)) {
      return "http://www.gstatic.com/safa/";
    }
    return "http://media.admob.com/";
  }
  
  private String g()
  {
    if ((this.h instanceof com.google.ads.d.a)) {
      return "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>";
    }
    return "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>";
  }
  
  private String h()
  {
    if ((this.h instanceof com.google.ads.d.a)) {
      return "</script></head><body></body></html>";
    }
    return "</script></head><body></body></html>";
  }
  
  private void i()
  {
    c localc = ((g)((ap)this.j.a.a()).b.a()).l();
    ((g)((ap)this.j.a.a()).b.a()).m().c(true);
    ((g)((ap)this.j.a.a()).b.a()).n().h();
    ((Handler)ao.a().c.a()).post(new c(localc, this.b, this.c));
  }
  
  private void j()
  {
    ((Handler)ao.a().c.a()).post(new e((g)((ap)this.j.a.a()).b.a(), this.i, this.m, this.u, this.r, this.n, this.o));
  }
  
  public String a(Map<String, Object> paramMap, Activity paramActivity)
    throws f.b
  {
    int i2 = 0;
    Context localContext = paramActivity.getApplicationContext();
    Object localObject1 = ((g)((ap)this.j.a.a()).b.a()).n();
    long l1 = ((j)localObject1).m();
    if (l1 > 0L) {
      paramMap.put("prl", Long.valueOf(l1));
    }
    l1 = ((j)localObject1).n();
    if (l1 > 0L) {
      paramMap.put("prnl", Long.valueOf(l1));
    }
    Object localObject2 = ((j)localObject1).l();
    if (localObject2 != null) {
      paramMap.put("ppcl", localObject2);
    }
    localObject2 = ((j)localObject1).k();
    if (localObject2 != null) {
      paramMap.put("pcl", localObject2);
    }
    l1 = ((j)localObject1).j();
    if (l1 > 0L) {
      paramMap.put("pcc", Long.valueOf(l1));
    }
    paramMap.put("preqs", Long.valueOf(((j)localObject1).o()));
    paramMap.put("oar", Long.valueOf(((j)localObject1).p()));
    paramMap.put("bas_on", Long.valueOf(((j)localObject1).s()));
    paramMap.put("bas_off", Long.valueOf(((j)localObject1).v()));
    if (((j)localObject1).y()) {
      paramMap.put("aoi_timeout", "true");
    }
    if (((j)localObject1).A()) {
      paramMap.put("aoi_nofill", "true");
    }
    localObject2 = ((j)localObject1).D();
    if (localObject2 != null) {
      paramMap.put("pit", localObject2);
    }
    paramMap.put("ptime", Long.valueOf(j.E()));
    ((j)localObject1).a();
    ((j)localObject1).i();
    if (((ap)this.j.a.a()).b())
    {
      paramMap.put("format", "interstitial_mb");
      paramMap.put("slotname", ((ap)this.j.a.a()).h.a());
      paramMap.put("js", "afma-sdk-a-v6.4.1");
      localObject1 = localContext.getPackageName();
    }
    for (;;)
    {
      try
      {
        localObject1 = localContext.getPackageManager().getPackageInfo((String)localObject1, 0);
        i1 = ((PackageInfo)localObject1).versionCode;
        localObject1 = com.google.ads.e.a.f(localContext);
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          paramMap.put("mv", localObject1);
        }
        localObject1 = (String)ao.a().a.a();
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {
          paramMap.put("imbf", localObject1);
        }
        paramMap.put("msid", localContext.getPackageName());
        paramMap.put("app_name", i1 + ".android." + localContext.getPackageName());
        paramMap.put("isu", com.google.ads.e.a.a(localContext));
        localObject2 = com.google.ads.e.a.d(localContext);
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = "null";
        }
        paramMap.put("net", localObject1);
        localObject1 = com.google.ads.e.a.e(localContext);
        if ((localObject1 != null) && (((String)localObject1).length() != 0)) {
          paramMap.put("cap", localObject1);
        }
        paramMap.put("u_audio", Integer.valueOf(com.google.ads.e.a.g(localContext).ordinal()));
        localObject1 = com.google.ads.e.a.a(paramActivity);
        paramMap.put("u_sd", Float.valueOf(((DisplayMetrics)localObject1).density));
        paramMap.put("u_h", Integer.valueOf(com.google.ads.e.a.a(localContext, (DisplayMetrics)localObject1)));
        paramMap.put("u_w", Integer.valueOf(com.google.ads.e.a.b(localContext, (DisplayMetrics)localObject1)));
        paramMap.put("hl", Locale.getDefault().getLanguage());
        ap localap = (ap)this.j.a.a();
        localObject2 = (r)localap.r.a();
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = r.a("afma-sdk-a-v6.4.1", paramActivity);
          localap.r.a(localObject1);
          localap.s.a(new s((p)localObject1));
        }
        paramMap.put("ms", ((r)localObject1).a(localContext));
        if ((((ap)this.j.a.a()).j != null) && (((ap)this.j.a.a()).j.a() != null))
        {
          paramActivity = (AdView)((ap)this.j.a.a()).j.a();
          if (paramActivity.getParent() != null)
          {
            localObject1 = new int[2];
            paramActivity.getLocationOnScreen((int[])localObject1);
            i3 = localObject1[0];
            int i4 = localObject1[1];
            localObject1 = ((Context)((ap)this.j.a.a()).f.a()).getResources().getDisplayMetrics();
            i1 = ((DisplayMetrics)localObject1).widthPixels;
            int i5 = ((DisplayMetrics)localObject1).heightPixels;
            if ((!paramActivity.isShown()) || (paramActivity.getWidth() + i3 <= 0) || (paramActivity.getHeight() + i4 <= 0) || (i3 > i1) || (i4 > i5)) {
              break label1799;
            }
            i1 = 1;
            localObject1 = new HashMap();
            ((Map)localObject1).put("x", Integer.valueOf(i3));
            ((Map)localObject1).put("y", Integer.valueOf(i4));
            ((Map)localObject1).put("width", Integer.valueOf(paramActivity.getWidth()));
            ((Map)localObject1).put("height", Integer.valueOf(paramActivity.getHeight()));
            ((Map)localObject1).put("visible", Integer.valueOf(i1));
            paramMap.put("ad_pos", localObject1);
          }
        }
        paramActivity = new StringBuilder();
        localObject1 = (com.google.ads.d[])((ap)this.j.a.a()).n.a();
        if (localObject1 == null) {
          break label1403;
        }
        int i3 = localObject1.length;
        i1 = i2;
        if (i1 < i3)
        {
          localObject2 = localObject1[i1];
          if (paramActivity.length() != 0) {
            paramActivity.append("|");
          }
          paramActivity.append(((com.google.ads.d)localObject2).a() + "x" + ((com.google.ads.d)localObject2).b());
          i1 += 1;
          continue;
          localObject1 = ((k)((ap)this.j.a.a()).g.a()).c();
          if (((com.google.ads.d)localObject1).c()) {
            paramMap.put("smart_w", "full");
          }
          if (((com.google.ads.d)localObject1).d()) {
            paramMap.put("smart_h", "auto");
          }
          if (!((com.google.ads.d)localObject1).e())
          {
            paramMap.put("format", ((com.google.ads.d)localObject1).toString());
            break;
          }
          localObject2 = new HashMap();
          ((Map)localObject2).put("w", Integer.valueOf(((com.google.ads.d)localObject1).a()));
          ((Map)localObject2).put("h", Integer.valueOf(((com.google.ads.d)localObject1).b()));
          paramMap.put("ad_frame", localObject2);
        }
      }
      catch (NameNotFoundException paramMap)
      {
        throw new b("NameNotFoundException");
      }
      paramMap.put("sz", paramActivity.toString());
      label1403:
      paramActivity = (TelephonyManager)localContext.getSystemService("phone");
      localObject1 = paramActivity.getNetworkOperator();
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        paramMap.put("carrier", localObject1);
      }
      paramMap.put("pt", Integer.valueOf(paramActivity.getPhoneType()));
      paramMap.put("gnt", Integer.valueOf(paramActivity.getNetworkType()));
      if (com.google.ads.e.a.c()) {
        paramMap.put("simulator", Integer.valueOf(1));
      }
      paramMap.put("session_id", ad.a().b().toString());
      paramMap.put("seq_num", ad.a().c().toString());
      if (((k)((ap)this.j.a.a()).g.a()).b()) {
        paramMap.put("swipeable", Integer.valueOf(1));
      }
      if (((Boolean)((ap)this.j.a.a()).t.a()).booleanValue()) {
        paramMap.put("d_imp_hdr", Integer.valueOf(1));
      }
      paramMap = com.google.ads.e.a.a(paramMap);
      if (((Boolean)((ao.a)((ao)((ap)this.j.a.a()).d.a()).b.a()).o.a()).booleanValue()) {}
      for (paramMap = g() + d() + "(" + paramMap + ");" + h();; paramMap = g() + e() + d() + "(" + paramMap + ");" + h())
      {
        com.google.ads.e.d.c("adRequestUrlHtml: " + paramMap);
        return paramMap;
      }
      label1799:
      int i1 = 0;
    }
  }
  
  protected void a()
  {
    com.google.ads.e.d.a("AdLoader cancelled.");
    if (this.i != null)
    {
      this.i.stopLoading();
      this.i.destroy();
    }
    if (this.v != null)
    {
      this.v.interrupt();
      this.v = null;
    }
    if (this.g != null) {
      this.g.a();
    }
    this.q = true;
  }
  
  public void a(int paramInt)
  {
    try
    {
      this.u = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(d paramd)
  {
    try
    {
      this.x = paramd;
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public void a(c.a parama)
  {
    try
    {
      this.s = parama;
      notify();
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  protected void a(c.a parama, boolean paramBoolean)
  {
    ((Handler)ao.a().c.a()).post(new a((g)((ap)this.j.a.a()).b.a(), this.i, this.g, parama, paramBoolean));
  }
  
  protected void a(com.google.ads.c paramc)
  {
    this.h = paramc;
    this.q = false;
    this.v = new Thread(this);
    this.v.start();
  }
  
  public void a(com.google.ads.d paramd)
  {
    try
    {
      this.o = paramd;
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  protected void a(String paramString)
  {
    try
    {
      this.m.add(paramString);
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
      this.b = paramString2;
      this.c = paramString1;
      notify();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.p = paramBoolean;
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
      if (TextUtils.isEmpty(this.e))
      {
        com.google.ads.e.d.b("Got a mediation response with no content type. Aborting mediation.");
        a(c.a.d, false);
        return;
      }
      if (!this.e.startsWith("application/json"))
      {
        com.google.ads.e.d.b("Got a mediation response with a content type: '" + this.e + "'. Expected something starting with 'application/json'. Aborting mediation.");
        a(c.a.d, false);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      com.google.ads.e.d.b("AdLoader can't parse gWhirl server configuration.", localJSONException);
      a(c.a.d, false);
      return;
    }
    final ae localae = ae.a(this.c);
    a(this.d, localae, ((g)((ap)this.j.a.a()).b.a()).j());
    ((Handler)ao.a().c.a()).post(new Runnable()
    {
      public void run()
      {
        if (f.d(f.this) != null)
        {
          f.d(f.this).stopLoading();
          f.d(f.this).destroy();
        }
        ((g)((ap)f.b(f.this).a.a()).b.a()).a(f.e(f.this));
        if (f.f(f.this) != null) {
          ((k)((ap)f.b(f.this).a.a()).g.a()).b(f.f(f.this));
        }
        ((g)((ap)f.b(f.this).a.a()).b.a()).a(localae);
      }
    }());
  }
  
  protected void b(String paramString)
  {
    try
    {
      this.e = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  protected void b(boolean paramBoolean)
  {
    try
    {
      this.f = paramBoolean;
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
      this.t = true;
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
      this.d = paramString;
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
    try
    {
      this.r = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void d(String paramString)
  {
    try
    {
      this.k = paramString;
      notify();
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public void d(boolean paramBoolean)
  {
    try
    {
      this.w = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
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
  
  public void e(boolean paramBoolean)
  {
    try
    {
      this.a = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void f(String paramString)
  {
    try
    {
      this.n = paramString;
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
    //   3: getfield 127	com/google/ads/b/f:i	Landroid/webkit/WebView;
    //   6: ifnull +10 -> 16
    //   9: aload_0
    //   10: getfield 161	com/google/ads/b/f:g	Lcom/google/ads/b/i;
    //   13: ifnonnull +20 -> 33
    //   16: ldc_w 808
    //   19: invokestatic 168	com/google/ads/e/d:e	(Ljava/lang/String;)V
    //   22: aload_0
    //   23: getstatic 770	com/google/ads/c$a:d	Lcom/google/ads/c$a;
    //   26: iconst_0
    //   27: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   30: aload_0
    //   31: monitorexit
    //   32: return
    //   33: aload_0
    //   34: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   37: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   40: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   43: checkcast 112	com/google/ads/ap
    //   46: getfield 115	com/google/ads/ap:c	Lcom/google/ads/e/k$d;
    //   49: invokevirtual 118	com/google/ads/e/k$d:a	()Ljava/lang/Object;
    //   52: checkcast 120	android/app/Activity
    //   55: astore 8
    //   57: aload 8
    //   59: ifnonnull +27 -> 86
    //   62: ldc_w 810
    //   65: invokestatic 168	com/google/ads/e/d:e	(Ljava/lang/String;)V
    //   68: aload_0
    //   69: getstatic 770	com/google/ads/c$a:d	Lcom/google/ads/c$a;
    //   72: iconst_0
    //   73: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   76: aload_0
    //   77: monitorexit
    //   78: return
    //   79: astore 8
    //   81: aload_0
    //   82: monitorexit
    //   83: aload 8
    //   85: athrow
    //   86: aload_0
    //   87: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   90: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   93: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   96: checkcast 112	com/google/ads/ap
    //   99: getfield 129	com/google/ads/ap:b	Lcom/google/ads/e/k$b;
    //   102: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   105: checkcast 131	com/google/ads/b/g
    //   108: invokevirtual 811	com/google/ads/b/g:p	()J
    //   111: lstore_1
    //   112: invokestatic 816	android/os/SystemClock:elapsedRealtime	()J
    //   115: lstore_3
    //   116: aload_0
    //   117: getfield 277	com/google/ads/b/f:h	Lcom/google/ads/c;
    //   120: aload_0
    //   121: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   124: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   127: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   130: checkcast 112	com/google/ads/ap
    //   133: getfield 551	com/google/ads/ap:f	Lcom/google/ads/e/k$b;
    //   136: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   139: checkcast 408	android/content/Context
    //   142: invokevirtual 821	com/google/ads/c:a	(Landroid/content/Context;)Ljava/util/Map;
    //   145: astore 9
    //   147: aload 9
    //   149: ldc_w 823
    //   152: invokeinterface 827 2 0
    //   157: astore 10
    //   159: aload 10
    //   161: instanceof 331
    //   164: ifeq +189 -> 353
    //   167: aload 10
    //   169: checkcast 331	java/util/Map
    //   172: astore 10
    //   174: aload 10
    //   176: ldc_w 829
    //   179: invokeinterface 827 2 0
    //   184: astore 11
    //   186: aload 11
    //   188: instanceof 175
    //   191: ifeq +12 -> 203
    //   194: aload_0
    //   195: aload 11
    //   197: checkcast 175	java/lang/String
    //   200: putfield 77	com/google/ads/b/f:b	Ljava/lang/String;
    //   203: aload 10
    //   205: ldc_w 831
    //   208: invokeinterface 827 2 0
    //   213: astore 11
    //   215: aload 11
    //   217: instanceof 175
    //   220: ifeq +12 -> 232
    //   223: aload_0
    //   224: aload 11
    //   226: checkcast 175	java/lang/String
    //   229: putfield 75	com/google/ads/b/f:k	Ljava/lang/String;
    //   232: aload 10
    //   234: ldc_w 833
    //   237: invokeinterface 827 2 0
    //   242: astore 11
    //   244: aload 11
    //   246: instanceof 175
    //   249: ifeq +12 -> 261
    //   252: aload_0
    //   253: aload 11
    //   255: checkcast 175	java/lang/String
    //   258: putfield 274	com/google/ads/b/f:l	Ljava/lang/String;
    //   261: aload 10
    //   263: ldc_w 835
    //   266: invokeinterface 827 2 0
    //   271: astore 11
    //   273: aload 11
    //   275: instanceof 175
    //   278: ifeq +19 -> 297
    //   281: aload 11
    //   283: ldc_w 836
    //   286: invokevirtual 839	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   289: ifeq +142 -> 431
    //   292: aload_0
    //   293: iconst_1
    //   294: putfield 92	com/google/ads/b/f:u	I
    //   297: aload 10
    //   299: ldc_w 841
    //   302: invokeinterface 827 2 0
    //   307: astore 10
    //   309: aload 10
    //   311: instanceof 175
    //   314: ifeq +39 -> 353
    //   317: aload 10
    //   319: ldc_w 842
    //   322: invokevirtual 839	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   325: ifeq +28 -> 353
    //   328: aload_0
    //   329: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   332: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   335: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   338: checkcast 112	com/google/ads/ap
    //   341: getfield 129	com/google/ads/ap:b	Lcom/google/ads/e/k$b;
    //   344: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   347: checkcast 131	com/google/ads/b/g
    //   350: invokevirtual 844	com/google/ads/b/g:e	()V
    //   353: aload_0
    //   354: getfield 77	com/google/ads/b/f:b	Ljava/lang/String;
    //   357: ifnonnull +1229 -> 1586
    //   360: aload_0
    //   361: getfield 75	com/google/ads/b/f:k	Ljava/lang/String;
    //   364: astore 10
    //   366: aload 10
    //   368: ifnonnull +290 -> 658
    //   371: aload_0
    //   372: aload 9
    //   374: aload 8
    //   376: invokevirtual 846	com/google/ads/b/f:a	(Ljava/util/Map;Landroid/app/Activity;)Ljava/lang/String;
    //   379: astore 8
    //   381: aload_0
    //   382: aload 8
    //   384: aload_0
    //   385: invokespecial 848	com/google/ads/b/f:f	()Ljava/lang/String;
    //   388: invokespecial 850	com/google/ads/b/f:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   391: invokestatic 816	android/os/SystemClock:elapsedRealtime	()J
    //   394: lstore 5
    //   396: lload_1
    //   397: lload 5
    //   399: lload_3
    //   400: lsub
    //   401: lsub
    //   402: lstore 5
    //   404: lload 5
    //   406: lconst_0
    //   407: lcmp
    //   408: ifle +9 -> 417
    //   411: aload_0
    //   412: lload 5
    //   414: invokevirtual 854	java/lang/Object:wait	(J)V
    //   417: aload_0
    //   418: getfield 737	com/google/ads/b/f:q	Z
    //   421: istore 7
    //   423: iload 7
    //   425: ifeq +112 -> 537
    //   428: aload_0
    //   429: monitorexit
    //   430: return
    //   431: aload 11
    //   433: ldc_w 855
    //   436: invokevirtual 839	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   439: ifeq -142 -> 297
    //   442: aload_0
    //   443: iconst_0
    //   444: putfield 92	com/google/ads/b/f:u	I
    //   447: goto -150 -> 297
    //   450: astore 8
    //   452: ldc_w 857
    //   455: aload 8
    //   457: invokestatic 237	com/google/ads/e/d:b	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   460: aload_0
    //   461: getstatic 770	com/google/ads/c$a:d	Lcom/google/ads/c$a;
    //   464: iconst_1
    //   465: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   468: aload_0
    //   469: monitorexit
    //   470: return
    //   471: astore 8
    //   473: new 239	java/lang/StringBuilder
    //   476: dup
    //   477: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   480: ldc_w 859
    //   483: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: aload 8
    //   488: invokevirtual 862	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   491: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   494: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   497: aload_0
    //   498: getstatic 770	com/google/ads/c$a:d	Lcom/google/ads/c$a;
    //   501: iconst_0
    //   502: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   505: aload_0
    //   506: monitorexit
    //   507: return
    //   508: astore 8
    //   510: new 239	java/lang/StringBuilder
    //   513: dup
    //   514: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   517: ldc_w 864
    //   520: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: aload 8
    //   525: invokevirtual 862	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   528: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   531: invokestatic 721	com/google/ads/e/d:a	(Ljava/lang/String;)V
    //   534: aload_0
    //   535: monitorexit
    //   536: return
    //   537: aload_0
    //   538: getfield 88	com/google/ads/b/f:s	Lcom/google/ads/c$a;
    //   541: ifnull +15 -> 556
    //   544: aload_0
    //   545: aload_0
    //   546: getfield 88	com/google/ads/b/f:s	Lcom/google/ads/c$a;
    //   549: iconst_0
    //   550: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   553: aload_0
    //   554: monitorexit
    //   555: return
    //   556: aload_0
    //   557: getfield 75	com/google/ads/b/f:k	Ljava/lang/String;
    //   560: ifnonnull +43 -> 603
    //   563: new 239	java/lang/StringBuilder
    //   566: dup
    //   567: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   570: ldc_w 866
    //   573: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   576: lload_1
    //   577: invokevirtual 869	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   580: ldc_w 871
    //   583: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   586: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   589: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   592: aload_0
    //   593: getstatic 873	com/google/ads/c$a:c	Lcom/google/ads/c$a;
    //   596: iconst_0
    //   597: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   600: aload_0
    //   601: monitorexit
    //   602: return
    //   603: aload_0
    //   604: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   607: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   610: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   613: checkcast 112	com/google/ads/ap
    //   616: getfield 604	com/google/ads/ap:g	Lcom/google/ads/e/k$b;
    //   619: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   622: checkcast 606	com/google/ads/b/k
    //   625: invokevirtual 679	com/google/ads/b/k:b	()Z
    //   628: ifeq +30 -> 658
    //   631: aload_0
    //   632: getfield 274	com/google/ads/b/f:l	Ljava/lang/String;
    //   635: invokestatic 436	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   638: ifeq +20 -> 658
    //   641: ldc_w 875
    //   644: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   647: aload_0
    //   648: getstatic 770	com/google/ads/c$a:d	Lcom/google/ads/c$a;
    //   651: iconst_0
    //   652: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   655: aload_0
    //   656: monitorexit
    //   657: return
    //   658: aload_0
    //   659: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   662: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   665: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   668: checkcast 112	com/google/ads/ap
    //   671: getfield 129	com/google/ads/ap:b	Lcom/google/ads/e/k$b;
    //   674: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   677: checkcast 131	com/google/ads/b/g
    //   680: invokevirtual 305	com/google/ads/b/g:n	()Lcom/google/ads/b/j;
    //   683: astore 8
    //   685: getstatic 878	com/google/ads/b/f$3:a	[I
    //   688: aload_0
    //   689: getfield 69	com/google/ads/b/f:x	Lcom/google/ads/b/f$d;
    //   692: invokevirtual 879	com/google/ads/b/f$d:ordinal	()I
    //   695: iaload
    //   696: tableswitch	default:+887 -> 1583, 1:+227->923, 2:+251->947, 3:+265->961, 4:+284->980
    //   729: getfield 801	com/google/ads/b/f:a	Z
    //   732: ifne +356 -> 1088
    //   735: ldc_w 881
    //   738: invokestatic 721	com/google/ads/e/d:a	(Ljava/lang/String;)V
    //   741: aload_0
    //   742: getfield 161	com/google/ads/b/f:g	Lcom/google/ads/b/i;
    //   745: aload_0
    //   746: getfield 799	com/google/ads/b/f:w	Z
    //   749: invokevirtual 883	com/google/ads/b/i:a	(Z)V
    //   752: aload_0
    //   753: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   756: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   759: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   762: checkcast 112	com/google/ads/ap
    //   765: getfield 604	com/google/ads/ap:g	Lcom/google/ads/e/k$b;
    //   768: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   771: checkcast 606	com/google/ads/b/k
    //   774: invokevirtual 679	com/google/ads/b/k:b	()Z
    //   777: ifeq +800 -> 1577
    //   780: aload_0
    //   781: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   784: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   787: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   790: checkcast 112	com/google/ads/ap
    //   793: getfield 885	com/google/ads/ap:e	Lcom/google/ads/e/k$b;
    //   796: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   799: checkcast 887	com/google/ads/b/a
    //   802: invokevirtual 889	com/google/ads/b/a:e	()Lcom/google/ads/b/l;
    //   805: astore 8
    //   807: aload 8
    //   809: iconst_1
    //   810: invokevirtual 302	com/google/ads/b/l:c	(Z)V
    //   813: invokestatic 260	com/google/ads/ao:a	()Lcom/google/ads/ao;
    //   816: getfield 262	com/google/ads/ao:c	Lcom/google/ads/e/k$b;
    //   819: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   822: checkcast 264	android/os/Handler
    //   825: new 8	com/google/ads/b/f$1
    //   828: dup
    //   829: aload_0
    //   830: invokespecial 892	com/google/ads/b/f$1:<init>	(Lcom/google/ads/b/f;)V
    //   833: invokevirtual 271	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   836: pop
    //   837: aload_0
    //   838: getfield 161	com/google/ads/b/f:g	Lcom/google/ads/b/i;
    //   841: aload_0
    //   842: getfield 75	com/google/ads/b/f:k	Ljava/lang/String;
    //   845: invokevirtual 893	com/google/ads/b/i:a	(Ljava/lang/String;)V
    //   848: aload_0
    //   849: getfield 737	com/google/ads/b/f:q	Z
    //   852: ifne +156 -> 1008
    //   855: aload_0
    //   856: getfield 88	com/google/ads/b/f:s	Lcom/google/ads/c$a;
    //   859: ifnonnull +149 -> 1008
    //   862: aload_0
    //   863: getfield 79	com/google/ads/b/f:c	Ljava/lang/String;
    //   866: ifnonnull +142 -> 1008
    //   869: lload_1
    //   870: invokestatic 816	android/os/SystemClock:elapsedRealtime	()J
    //   873: lload_3
    //   874: lsub
    //   875: lsub
    //   876: lstore 5
    //   878: lload 5
    //   880: lconst_0
    //   881: lcmp
    //   882: ifle +126 -> 1008
    //   885: aload_0
    //   886: lload 5
    //   888: invokevirtual 854	java/lang/Object:wait	(J)V
    //   891: goto -43 -> 848
    //   894: astore 8
    //   896: new 239	java/lang/StringBuilder
    //   899: dup
    //   900: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   903: ldc_w 895
    //   906: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   909: aload 8
    //   911: invokevirtual 862	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   914: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   917: invokestatic 721	com/google/ads/e/d:a	(Ljava/lang/String;)V
    //   920: aload_0
    //   921: monitorexit
    //   922: return
    //   923: aload 8
    //   925: invokevirtual 897	com/google/ads/b/j:r	()V
    //   928: aload 8
    //   930: invokevirtual 899	com/google/ads/b/j:u	()V
    //   933: aload 8
    //   935: invokevirtual 901	com/google/ads/b/j:x	()V
    //   938: ldc_w 903
    //   941: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   944: goto -216 -> 728
    //   947: aload 8
    //   949: invokevirtual 905	com/google/ads/b/j:t	()V
    //   952: ldc_w 907
    //   955: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   958: goto -230 -> 728
    //   961: aload 8
    //   963: invokevirtual 909	com/google/ads/b/j:w	()V
    //   966: aload 8
    //   968: invokevirtual 911	com/google/ads/b/j:q	()V
    //   971: ldc_w 913
    //   974: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   977: goto -249 -> 728
    //   980: aload 8
    //   982: invokevirtual 911	com/google/ads/b/j:q	()V
    //   985: ldc_w 915
    //   988: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   991: ldc_w 917
    //   994: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   997: aload_0
    //   998: getstatic 873	com/google/ads/c$a:c	Lcom/google/ads/c$a;
    //   1001: iconst_0
    //   1002: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   1005: aload_0
    //   1006: monitorexit
    //   1007: return
    //   1008: aload_0
    //   1009: getfield 737	com/google/ads/b/f:q	Z
    //   1012: istore 7
    //   1014: iload 7
    //   1016: ifeq +6 -> 1022
    //   1019: aload_0
    //   1020: monitorexit
    //   1021: return
    //   1022: aload_0
    //   1023: getfield 88	com/google/ads/b/f:s	Lcom/google/ads/c$a;
    //   1026: ifnull +15 -> 1041
    //   1029: aload_0
    //   1030: aload_0
    //   1031: getfield 88	com/google/ads/b/f:s	Lcom/google/ads/c$a;
    //   1034: iconst_0
    //   1035: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   1038: aload_0
    //   1039: monitorexit
    //   1040: return
    //   1041: aload_0
    //   1042: getfield 79	com/google/ads/b/f:c	Ljava/lang/String;
    //   1045: ifnonnull +529 -> 1574
    //   1048: new 239	java/lang/StringBuilder
    //   1051: dup
    //   1052: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   1055: ldc_w 866
    //   1058: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1061: lload_1
    //   1062: invokevirtual 869	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1065: ldc_w 919
    //   1068: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1071: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1074: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   1077: aload_0
    //   1078: getstatic 873	com/google/ads/c$a:c	Lcom/google/ads/c$a;
    //   1081: iconst_0
    //   1082: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   1085: aload_0
    //   1086: monitorexit
    //   1087: return
    //   1088: aload_0
    //   1089: aload_0
    //   1090: getfield 75	com/google/ads/b/f:k	Ljava/lang/String;
    //   1093: putfield 77	com/google/ads/b/f:b	Ljava/lang/String;
    //   1096: new 239	java/lang/StringBuilder
    //   1099: dup
    //   1100: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   1103: ldc_w 921
    //   1106: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1109: aload_0
    //   1110: getfield 77	com/google/ads/b/f:b	Ljava/lang/String;
    //   1113: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1116: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1119: invokestatic 721	com/google/ads/e/d:a	(Ljava/lang/String;)V
    //   1122: goto +464 -> 1586
    //   1125: aload_0
    //   1126: getfield 801	com/google/ads/b/f:a	Z
    //   1129: ifne +257 -> 1386
    //   1132: aload_0
    //   1133: getfield 94	com/google/ads/b/f:f	Z
    //   1136: ifeq +36 -> 1172
    //   1139: aload_0
    //   1140: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   1143: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   1146: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   1149: checkcast 112	com/google/ads/ap
    //   1152: getfield 129	com/google/ads/ap:b	Lcom/google/ads/e/k$b;
    //   1155: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   1158: checkcast 131	com/google/ads/b/g
    //   1161: iconst_1
    //   1162: invokevirtual 923	com/google/ads/b/g:b	(Z)V
    //   1165: aload_0
    //   1166: invokevirtual 925	com/google/ads/b/f:b	()V
    //   1169: aload_0
    //   1170: monitorexit
    //   1171: return
    //   1172: aload_0
    //   1173: getfield 762	com/google/ads/b/f:e	Ljava/lang/String;
    //   1176: ifnull +72 -> 1248
    //   1179: aload_0
    //   1180: getfield 762	com/google/ads/b/f:e	Ljava/lang/String;
    //   1183: ldc_w 774
    //   1186: invokevirtual 778	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1189: ifne +16 -> 1205
    //   1192: aload_0
    //   1193: getfield 762	com/google/ads/b/f:e	Ljava/lang/String;
    //   1196: ldc_w 927
    //   1199: invokevirtual 778	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1202: ifeq +46 -> 1248
    //   1205: new 239	java/lang/StringBuilder
    //   1208: dup
    //   1209: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   1212: ldc_w 929
    //   1215: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1218: aload_0
    //   1219: getfield 762	com/google/ads/b/f:e	Ljava/lang/String;
    //   1222: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1225: ldc_w 931
    //   1228: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1231: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1234: invokestatic 766	com/google/ads/e/d:b	(Ljava/lang/String;)V
    //   1237: aload_0
    //   1238: getstatic 770	com/google/ads/c$a:d	Lcom/google/ads/c$a;
    //   1241: iconst_0
    //   1242: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   1245: aload_0
    //   1246: monitorexit
    //   1247: return
    //   1248: aload_0
    //   1249: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   1252: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   1255: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   1258: checkcast 112	com/google/ads/ap
    //   1261: getfield 591	com/google/ads/ap:n	Lcom/google/ads/e/k$c;
    //   1264: invokevirtual 444	com/google/ads/e/k$c:a	()Ljava/lang/Object;
    //   1267: ifnull +101 -> 1368
    //   1270: aload_0
    //   1271: getfield 100	com/google/ads/b/f:o	Lcom/google/ads/d;
    //   1274: ifnonnull +20 -> 1294
    //   1277: ldc_w 933
    //   1280: invokestatic 766	com/google/ads/e/d:b	(Ljava/lang/String;)V
    //   1283: aload_0
    //   1284: getstatic 770	com/google/ads/c$a:d	Lcom/google/ads/c$a;
    //   1287: iconst_0
    //   1288: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   1291: aload_0
    //   1292: monitorexit
    //   1293: return
    //   1294: aload_0
    //   1295: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   1298: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   1301: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   1304: checkcast 112	com/google/ads/ap
    //   1307: getfield 591	com/google/ads/ap:n	Lcom/google/ads/e/k$c;
    //   1310: invokevirtual 444	com/google/ads/e/k$c:a	()Ljava/lang/Object;
    //   1313: checkcast 935	[Ljava/lang/Object;
    //   1316: invokestatic 941	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   1319: aload_0
    //   1320: getfield 100	com/google/ads/b/f:o	Lcom/google/ads/d;
    //   1323: invokeinterface 945 2 0
    //   1328: ifne +58 -> 1386
    //   1331: new 239	java/lang/StringBuilder
    //   1334: dup
    //   1335: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   1338: ldc_w 947
    //   1341: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1344: aload_0
    //   1345: getfield 100	com/google/ads/b/f:o	Lcom/google/ads/d;
    //   1348: invokevirtual 862	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1351: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1354: invokestatic 766	com/google/ads/e/d:b	(Ljava/lang/String;)V
    //   1357: aload_0
    //   1358: getstatic 770	com/google/ads/c$a:d	Lcom/google/ads/c$a;
    //   1361: iconst_0
    //   1362: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   1365: aload_0
    //   1366: monitorexit
    //   1367: return
    //   1368: aload_0
    //   1369: getfield 100	com/google/ads/b/f:o	Lcom/google/ads/d;
    //   1372: ifnull +14 -> 1386
    //   1375: ldc_w 949
    //   1378: invokestatic 168	com/google/ads/e/d:e	(Ljava/lang/String;)V
    //   1381: aload_0
    //   1382: aconst_null
    //   1383: putfield 100	com/google/ads/b/f:o	Lcom/google/ads/d;
    //   1386: aload_0
    //   1387: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   1390: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   1393: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   1396: checkcast 112	com/google/ads/ap
    //   1399: getfield 129	com/google/ads/ap:b	Lcom/google/ads/e/k$b;
    //   1402: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   1405: checkcast 131	com/google/ads/b/g
    //   1408: iconst_0
    //   1409: invokevirtual 923	com/google/ads/b/g:b	(Z)V
    //   1412: aload_0
    //   1413: invokespecial 950	com/google/ads/b/f:i	()V
    //   1416: aload_0
    //   1417: getfield 737	com/google/ads/b/f:q	Z
    //   1420: ifne +100 -> 1520
    //   1423: aload_0
    //   1424: getfield 90	com/google/ads/b/f:t	Z
    //   1427: ifeq +39 -> 1466
    //   1430: aload_0
    //   1431: getfield 73	com/google/ads/b/f:j	Lcom/google/ads/an;
    //   1434: getfield 105	com/google/ads/an:a	Lcom/google/ads/e/k$b;
    //   1437: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   1440: checkcast 112	com/google/ads/ap
    //   1443: getfield 604	com/google/ads/ap:g	Lcom/google/ads/e/k$b;
    //   1446: invokevirtual 110	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   1449: checkcast 606	com/google/ads/b/k
    //   1452: invokevirtual 679	com/google/ads/b/k:b	()Z
    //   1455: ifeq +65 -> 1520
    //   1458: aload 8
    //   1460: invokevirtual 952	com/google/ads/b/l:a	()Z
    //   1463: ifeq +57 -> 1520
    //   1466: lload_1
    //   1467: invokestatic 816	android/os/SystemClock:elapsedRealtime	()J
    //   1470: lload_3
    //   1471: lsub
    //   1472: lsub
    //   1473: lstore 5
    //   1475: lload 5
    //   1477: lconst_0
    //   1478: lcmp
    //   1479: ifle +41 -> 1520
    //   1482: aload_0
    //   1483: lload 5
    //   1485: invokevirtual 854	java/lang/Object:wait	(J)V
    //   1488: goto -72 -> 1416
    //   1491: astore 8
    //   1493: new 239	java/lang/StringBuilder
    //   1496: dup
    //   1497: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   1500: ldc_w 954
    //   1503: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1506: aload 8
    //   1508: invokevirtual 862	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1511: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1514: invokestatic 721	com/google/ads/e/d:a	(Ljava/lang/String;)V
    //   1517: aload_0
    //   1518: monitorexit
    //   1519: return
    //   1520: aload_0
    //   1521: getfield 90	com/google/ads/b/f:t	Z
    //   1524: ifeq +10 -> 1534
    //   1527: aload_0
    //   1528: invokespecial 956	com/google/ads/b/f:j	()V
    //   1531: goto -1063 -> 468
    //   1534: new 239	java/lang/StringBuilder
    //   1537: dup
    //   1538: invokespecial 240	java/lang/StringBuilder:<init>	()V
    //   1541: ldc_w 866
    //   1544: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1547: lload_1
    //   1548: invokevirtual 869	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   1551: ldc_w 958
    //   1554: invokevirtual 246	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1557: invokevirtual 252	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1560: invokestatic 232	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   1563: aload_0
    //   1564: getstatic 873	com/google/ads/c$a:c	Lcom/google/ads/c$a;
    //   1567: iconst_1
    //   1568: invokevirtual 772	com/google/ads/b/f:a	(Lcom/google/ads/c$a;Z)V
    //   1571: goto -1103 -> 468
    //   1574: goto -449 -> 1125
    //   1577: aconst_null
    //   1578: astore 8
    //   1580: goto -743 -> 837
    //   1583: goto -855 -> 728
    //   1586: aconst_null
    //   1587: astore 8
    //   1589: goto -464 -> 1125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1592	0	this	f
    //   111	1437	1	l1	long
    //   115	1356	3	l2	long
    //   394	1090	5	l3	long
    //   421	594	7	bool	boolean
    //   55	3	8	localActivity1	Activity
    //   79	296	8	localActivity2	Activity
    //   379	4	8	str	String
    //   450	6	8	localThrowable	java.lang.Throwable
    //   471	16	8	localb	b
    //   508	16	8	localInterruptedException1	java.lang.InterruptedException
    //   683	125	8	localObject1	Object
    //   894	565	8	localInterruptedException2	java.lang.InterruptedException
    //   1491	16	8	localInterruptedException3	java.lang.InterruptedException
    //   1578	10	8	localObject2	Object
    //   145	228	9	localMap	Map
    //   157	210	10	localObject3	Object
    //   184	248	11	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	79	finally
    //   16	30	79	finally
    //   30	32	79	finally
    //   33	57	79	finally
    //   62	76	79	finally
    //   76	78	79	finally
    //   81	83	79	finally
    //   86	203	79	finally
    //   203	232	79	finally
    //   232	261	79	finally
    //   261	297	79	finally
    //   297	353	79	finally
    //   353	366	79	finally
    //   371	381	79	finally
    //   381	396	79	finally
    //   411	417	79	finally
    //   417	423	79	finally
    //   428	430	79	finally
    //   431	447	79	finally
    //   452	468	79	finally
    //   468	470	79	finally
    //   473	505	79	finally
    //   505	507	79	finally
    //   510	534	79	finally
    //   534	536	79	finally
    //   537	553	79	finally
    //   553	555	79	finally
    //   556	600	79	finally
    //   600	602	79	finally
    //   603	655	79	finally
    //   655	657	79	finally
    //   658	728	79	finally
    //   728	837	79	finally
    //   837	848	79	finally
    //   848	878	79	finally
    //   885	891	79	finally
    //   896	920	79	finally
    //   920	922	79	finally
    //   923	944	79	finally
    //   947	958	79	finally
    //   961	977	79	finally
    //   980	1005	79	finally
    //   1005	1007	79	finally
    //   1008	1014	79	finally
    //   1019	1021	79	finally
    //   1022	1038	79	finally
    //   1038	1040	79	finally
    //   1041	1085	79	finally
    //   1085	1087	79	finally
    //   1088	1122	79	finally
    //   1125	1169	79	finally
    //   1169	1171	79	finally
    //   1172	1205	79	finally
    //   1205	1245	79	finally
    //   1245	1247	79	finally
    //   1248	1291	79	finally
    //   1291	1293	79	finally
    //   1294	1365	79	finally
    //   1365	1367	79	finally
    //   1368	1386	79	finally
    //   1386	1416	79	finally
    //   1416	1466	79	finally
    //   1466	1475	79	finally
    //   1482	1488	79	finally
    //   1493	1517	79	finally
    //   1517	1519	79	finally
    //   1520	1531	79	finally
    //   1534	1571	79	finally
    //   2	16	450	java/lang/Throwable
    //   16	30	450	java/lang/Throwable
    //   33	57	450	java/lang/Throwable
    //   62	76	450	java/lang/Throwable
    //   86	203	450	java/lang/Throwable
    //   203	232	450	java/lang/Throwable
    //   232	261	450	java/lang/Throwable
    //   261	297	450	java/lang/Throwable
    //   297	353	450	java/lang/Throwable
    //   353	366	450	java/lang/Throwable
    //   371	381	450	java/lang/Throwable
    //   381	396	450	java/lang/Throwable
    //   411	417	450	java/lang/Throwable
    //   417	423	450	java/lang/Throwable
    //   431	447	450	java/lang/Throwable
    //   473	505	450	java/lang/Throwable
    //   510	534	450	java/lang/Throwable
    //   537	553	450	java/lang/Throwable
    //   556	600	450	java/lang/Throwable
    //   603	655	450	java/lang/Throwable
    //   658	728	450	java/lang/Throwable
    //   728	837	450	java/lang/Throwable
    //   837	848	450	java/lang/Throwable
    //   848	878	450	java/lang/Throwable
    //   885	891	450	java/lang/Throwable
    //   896	920	450	java/lang/Throwable
    //   923	944	450	java/lang/Throwable
    //   947	958	450	java/lang/Throwable
    //   961	977	450	java/lang/Throwable
    //   980	1005	450	java/lang/Throwable
    //   1008	1014	450	java/lang/Throwable
    //   1022	1038	450	java/lang/Throwable
    //   1041	1085	450	java/lang/Throwable
    //   1088	1122	450	java/lang/Throwable
    //   1125	1169	450	java/lang/Throwable
    //   1172	1205	450	java/lang/Throwable
    //   1205	1245	450	java/lang/Throwable
    //   1248	1291	450	java/lang/Throwable
    //   1294	1365	450	java/lang/Throwable
    //   1368	1386	450	java/lang/Throwable
    //   1386	1416	450	java/lang/Throwable
    //   1416	1466	450	java/lang/Throwable
    //   1466	1475	450	java/lang/Throwable
    //   1482	1488	450	java/lang/Throwable
    //   1493	1517	450	java/lang/Throwable
    //   1520	1531	450	java/lang/Throwable
    //   1534	1571	450	java/lang/Throwable
    //   371	381	471	com/google/ads/b/f$b
    //   411	417	508	java/lang/InterruptedException
    //   848	878	894	java/lang/InterruptedException
    //   885	891	894	java/lang/InterruptedException
    //   1416	1466	1491	java/lang/InterruptedException
    //   1466	1475	1491	java/lang/InterruptedException
    //   1482	1488	1491	java/lang/InterruptedException
  }
  
  private static class a
    implements Runnable
  {
    private final g a;
    private final WebView b;
    private final i c;
    private final c.a d;
    private final boolean e;
    
    public a(g paramg, WebView paramWebView, i parami, c.a parama, boolean paramBoolean)
    {
      this.a = paramg;
      this.b = paramWebView;
      this.c = parami;
      this.d = parama;
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
        this.a.l().stopLoading();
        if (this.a.i().i.a() != null) {
          ((ViewGroup)this.a.i().i.a()).setVisibility(8);
        }
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
      f.b(f.this).c.a(Boolean.valueOf(f.a(f.this)));
      ((g)((ap)f.b(f.this).a.a()).b.a()).l().a(f.a(f.this));
      a locala;
      if (((ap)f.b(f.this).a.a()).e.a() != null)
      {
        locala = (a)((ap)f.b(f.this).a.a()).e.a();
        if (f.a(f.this)) {
          break label157;
        }
      }
      label157:
      for (boolean bool = true;; bool = false)
      {
        locala.setOverlayEnabled(bool);
        if (this.c == null) {
          break;
        }
        this.d.loadDataWithBaseURL(this.b, this.c, "text/html", "utf-8", null);
        return;
      }
      this.d.loadUrl(this.b);
    }
  }
  
  public static enum d
  {
    public String e;
    
    private d(String paramString)
    {
      this.e = paramString;
    }
  }
  
  private class e
    implements Runnable
  {
    private final g b;
    private final WebView c;
    private final LinkedList<String> d;
    private final int e;
    private final boolean f;
    private final String g;
    private final com.google.ads.d h;
    
    public e(WebView paramWebView, LinkedList<String> paramLinkedList, int paramInt, boolean paramBoolean, String paramString, com.google.ads.d paramd)
    {
      this.b = paramWebView;
      this.c = paramLinkedList;
      this.d = paramInt;
      this.e = paramBoolean;
      this.f = paramString;
      this.g = paramd;
      Object localObject;
      this.h = localObject;
    }
    
    public void run()
    {
      if (this.c != null)
      {
        this.c.stopLoading();
        this.c.destroy();
      }
      this.b.a(this.d);
      this.b.a(this.e);
      this.b.a(this.f);
      this.b.a(this.g);
      if (this.h != null)
      {
        ((k)((ap)f.b(f.this).a.a()).g.a()).b(this.h);
        this.b.l().setAdSize(this.h);
      }
      this.b.B();
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.f
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */