package com.example.lw.appline.com.google.ads.b;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.google.ads.AdActivity;
import com.google.ads.AdView;
import com.google.ads.aa;
import com.google.ads.ad;
import com.google.ads.ae;
import com.google.ads.af;
import com.google.ads.ag;
import com.google.ads.ah;
import com.google.ads.ai;
import com.google.ads.aj;
import com.google.ads.an;
import com.google.ads.ao;
import com.google.ads.ap;
import com.google.ads.b;
import com.google.ads.c.a;
import com.google.ads.e;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import com.google.ads.e.k.d;
import com.google.ads.m;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class g
{
  private static final Object a = new Object();
  private String A = null;
  private String B = null;
  private final ap b;
  private f c;
  private com.google.ads.c d;
  private j e;
  private c f;
  private l g;
  private boolean h = false;
  private long i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m;
  private boolean n;
  private SharedPreferences o;
  private long p;
  private m q;
  private boolean r;
  private LinkedList<String> s;
  private LinkedList<String> t;
  private LinkedList<String> u;
  private int v = -1;
  private Boolean w;
  private af x;
  private ag y;
  private ah z;
  
  public g(com.google.ads.a parama, Activity paramActivity, com.google.ads.d paramd, String paramString, ViewGroup paramViewGroup, boolean paramBoolean)
  {
    this.r = paramBoolean;
    this.e = new j();
    this.c = null;
    this.d = null;
    this.k = false;
    this.p = 60000L;
    this.l = false;
    this.n = false;
    this.m = true;
    Object localObject2;
    if (paramd == null)
    {
      paramd = k.a;
      if ((parama instanceof com.google.ads.a.c)) {
        paramd.a(true);
      }
      if (paramActivity != null) {
        break label181;
      }
      localObject2 = ao.a();
      if (!(parama instanceof AdView)) {
        break label170;
      }
      paramActivity = (AdView)parama;
      label119:
      if (!(parama instanceof com.google.ads.f)) {
        break label175;
      }
    }
    label170:
    label175:
    for (??? = (com.google.ads.f)parama;; ??? = null)
    {
      this.b = new ap((ao)localObject2, parama, paramActivity, (com.google.ads.f)???, paramString, null, null, paramViewGroup, paramd, this);
      return;
      paramd = k.a(paramd, paramActivity.getApplicationContext());
      break;
      paramActivity = null;
      break label119;
    }
    for (;;)
    {
      synchronized (a)
      {
        label181:
        this.o = paramActivity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
        if (paramBoolean)
        {
          long l1 = this.o.getLong("Timeout" + paramString, -1L);
          if (l1 < 0L)
          {
            this.i = 5000L;
            ao localao = ao.a();
            if (!(parama instanceof AdView)) {
              break label443;
            }
            ??? = (AdView)parama;
            if (!(parama instanceof com.google.ads.f)) {
              break label449;
            }
            localObject2 = (com.google.ads.f)parama;
            this.b = new ap(localao, parama, (AdView)???, (com.google.ads.f)localObject2, paramString, paramActivity, paramActivity.getApplicationContext(), paramViewGroup, paramd, this);
            this.q = new m(this);
            this.s = new LinkedList();
            this.t = new LinkedList();
            this.u = new LinkedList();
            a();
            com.google.ads.e.a.h((Context)this.b.f.a());
            this.x = new af();
            this.y = new ag(this);
            this.w = null;
            this.z = null;
            return;
          }
          this.i = l1;
        }
      }
      this.i = 60000L;
      continue;
      label443:
      ??? = null;
      continue;
      label449:
      localObject2 = null;
    }
  }
  
  private void a(ah paramah, Boolean paramBoolean)
  {
    Object localObject2 = paramah.d();
    Object localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = new ArrayList();
      ((List)localObject1).add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
    }
    localObject2 = paramah.b();
    a((List)localObject1, paramah.a(), (String)localObject2, paramah.c(), paramBoolean, this.e.d(), this.e.e());
  }
  
  private void a(List<String> paramList, String paramString)
  {
    if (paramList == null)
    {
      paramList = new ArrayList();
      paramList.add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
    }
    for (;;)
    {
      a(paramList, null, null, paramString, null, this.e.d(), this.e.e());
      return;
    }
  }
  
  private void a(List<String> paramList, String paramString1, String paramString2, String paramString3, Boolean paramBoolean, String paramString4, String paramString5)
  {
    String str1 = com.google.ads.e.a.a((Context)this.b.f.a());
    Object localObject = ad.a();
    String str2 = ((ad)localObject).b().toString();
    localObject = ((ad)localObject).c().toString();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      new Thread(new com.google.ads.l(ai.a((String)paramList.next(), (String)this.b.h.a(), paramBoolean, str1, paramString1, paramString2, paramString3, str2, (String)localObject, paramString4, paramString5), (Context)this.b.f.a())).start();
    }
    this.e.b();
  }
  
  /* Error */
  protected void A()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   6: getfield 298	com/google/ads/ap:c	Lcom/google/ads/e/k$d;
    //   9: invokevirtual 301	com/google/ads/e/k$d:a	()Ljava/lang/Object;
    //   12: checkcast 119	android/app/Activity
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +12 -> 29
    //   20: ldc_w 303
    //   23: invokestatic 308	com/google/ads/e/d:e	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield 177	com/google/ads/b/g:u	Ljava/util/LinkedList;
    //   33: invokevirtual 309	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   36: astore_2
    //   37: aload_2
    //   38: invokeinterface 267 1 0
    //   43: ifeq -17 -> 26
    //   46: new 269	java/lang/Thread
    //   49: dup
    //   50: new 271	com/google/ads/l
    //   53: dup
    //   54: aload_2
    //   55: invokeinterface 274 1 0
    //   60: checkcast 276	java/lang/String
    //   63: aload_1
    //   64: invokevirtual 123	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   67: invokespecial 286	com/google/ads/l:<init>	(Ljava/lang/String;Landroid/content/Context;)V
    //   70: invokespecial 289	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   73: invokevirtual 292	java/lang/Thread:start	()V
    //   76: goto -39 -> 37
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	g
    //   15	49	1	localActivity	Activity
    //   79	4	1	localObject	Object
    //   36	19	2	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	16	79	finally
    //   20	26	79	finally
    //   29	37	79	finally
    //   37	76	79	finally
  }
  
  protected void B()
  {
    try
    {
      this.c = null;
      this.k = true;
      this.f.setVisibility(0);
      if (this.b.a()) {
        a(this.f);
      }
      this.e.g();
      if (this.b.a()) {
        x();
      }
      com.google.ads.e.d.c("onReceiveAd()");
      b localb = (b)this.b.o.a();
      if (localb != null) {
        localb.a((com.google.ads.a)this.b.a.a());
      }
      this.b.l.a(this.b.m.a());
      this.b.m.a(null);
      return;
    }
    finally {}
  }
  
  public LinkedList<String> C()
  {
    return this.t;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   6: getfield 357	com/google/ads/ap:g	Lcom/google/ads/e/k$b;
    //   9: invokevirtual 187	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   12: checkcast 93	com/google/ads/b/k
    //   15: invokevirtual 360	com/google/ads/b/k:c	()Lcom/google/ads/d;
    //   18: astore_1
    //   19: getstatic 362	com/google/ads/e/a:a	I
    //   22: bipush 14
    //   24: if_icmplt +137 -> 161
    //   27: new 364	com/google/ads/e/b$a
    //   30: dup
    //   31: aload_0
    //   32: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   35: aload_1
    //   36: invokespecial 367	com/google/ads/e/b$a:<init>	(Lcom/google/ads/ap;Lcom/google/ads/d;)V
    //   39: astore_1
    //   40: aload_0
    //   41: aload_1
    //   42: putfield 311	com/google/ads/b/g:f	Lcom/google/ads/b/c;
    //   45: aload_0
    //   46: getfield 311	com/google/ads/b/g:f	Lcom/google/ads/b/c;
    //   49: bipush 8
    //   51: invokevirtual 317	com/google/ads/b/c:setVisibility	(I)V
    //   54: aload_0
    //   55: aload_0
    //   56: getstatic 372	com/google/ads/b/d:d	Ljava/util/Map;
    //   59: iconst_1
    //   60: aload_0
    //   61: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   64: invokevirtual 374	com/google/ads/ap:b	()Z
    //   67: invokestatic 379	com/google/ads/b/l:a	(Lcom/google/ads/b/g;Ljava/util/Map;ZZ)Lcom/google/ads/b/l;
    //   70: putfield 381	com/google/ads/b/g:g	Lcom/google/ads/b/l;
    //   73: aload_0
    //   74: getfield 311	com/google/ads/b/g:f	Lcom/google/ads/b/c;
    //   77: aload_0
    //   78: getfield 381	com/google/ads/b/g:g	Lcom/google/ads/b/l;
    //   81: invokevirtual 385	com/google/ads/b/c:setWebViewClient	(Landroid/webkit/WebViewClient;)V
    //   84: aload_0
    //   85: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   88: getfield 387	com/google/ads/ap:d	Lcom/google/ads/e/k$b;
    //   91: invokevirtual 187	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   94: checkcast 103	com/google/ads/ao
    //   97: getfield 389	com/google/ads/ao:b	Lcom/google/ads/e/k$b;
    //   100: invokevirtual 187	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   103: checkcast 391	com/google/ads/ao$a
    //   106: astore_1
    //   107: getstatic 362	com/google/ads/e/a:a	I
    //   110: aload_1
    //   111: getfield 393	com/google/ads/ao$a:b	Lcom/google/ads/e/k$c;
    //   114: invokevirtual 336	com/google/ads/e/k$c:a	()Ljava/lang/Object;
    //   117: checkcast 395	java/lang/Integer
    //   120: invokevirtual 399	java/lang/Integer:intValue	()I
    //   123: if_icmpge +35 -> 158
    //   126: aload_0
    //   127: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   130: getfield 357	com/google/ads/ap:g	Lcom/google/ads/e/k$b;
    //   133: invokevirtual 187	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   136: checkcast 93	com/google/ads/b/k
    //   139: invokevirtual 400	com/google/ads/b/k:a	()Z
    //   142: ifne +16 -> 158
    //   145: ldc_w 402
    //   148: invokestatic 404	com/google/ads/e/d:a	(Ljava/lang/String;)V
    //   151: aload_0
    //   152: getfield 311	com/google/ads/b/g:f	Lcom/google/ads/b/c;
    //   155: invokevirtual 405	com/google/ads/b/c:g	()V
    //   158: aload_0
    //   159: monitorexit
    //   160: return
    //   161: new 313	com/google/ads/b/c
    //   164: dup
    //   165: aload_0
    //   166: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   169: aload_1
    //   170: invokespecial 406	com/google/ads/b/c:<init>	(Lcom/google/ads/ap;Lcom/google/ads/d;)V
    //   173: astore_1
    //   174: goto -134 -> 40
    //   177: astore_1
    //   178: aload_0
    //   179: monitorexit
    //   180: aload_1
    //   181: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	182	0	this	g
    //   18	156	1	localObject1	Object
    //   177	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	40	177	finally
    //   40	158	177	finally
    //   161	174	177	finally
  }
  
  public void a(float paramFloat)
  {
    try
    {
      long l1 = this.p;
      this.p = ((1000.0F * paramFloat));
      if ((s()) && (this.p != l1))
      {
        f();
        g();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(int paramInt)
  {
    try
    {
      this.v = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a locala = (a)this.b.e.a();
    Object localObject = (Context)this.b.f.a();
    int i1;
    if (paramInt3 < 0)
    {
      i1 = ((k)this.b.g.a()).c().a();
      int i2 = com.google.ads.e.a.a((Context)localObject, i1);
      localObject = (Context)this.b.f.a();
      i1 = paramInt4;
      if (paramInt4 < 0) {
        i1 = ((k)this.b.g.a()).c().b();
      }
      localObject = new FrameLayout.LayoutParams(i2, com.google.ads.e.a.a((Context)localObject, i1));
      if (paramInt3 >= 0) {
        break label271;
      }
      paramInt1 = 0;
      paramInt2 = 0;
    }
    for (;;)
    {
      if (paramInt2 < 0) {
        paramInt2 = ((a)this.b.e.a()).d();
      }
      for (;;)
      {
        paramInt3 = paramInt1;
        if (paramInt1 < 0) {
          paramInt3 = ((a)this.b.e.a()).c();
        }
        ((a)this.b.e.a()).setXPosition(paramInt2);
        ((a)this.b.e.a()).setYPosition(paramInt3);
        ((FrameLayout.LayoutParams)localObject).setMargins(com.google.ads.e.a.a((Context)this.b.f.a(), paramInt2), com.google.ads.e.a.a((Context)this.b.f.a(), paramInt3), 0, 0);
        locala.setLayoutParams((ViewGroup.LayoutParams)localObject);
        return;
        i1 = paramInt3;
        break;
      }
      label271:
      paramInt3 = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
    }
  }
  
  public void a(long paramLong)
  {
    synchronized (a)
    {
      Editor localEditor = this.o.edit();
      localEditor.putLong("Timeout" + this.b.h, paramLong);
      localEditor.commit();
      if (this.r) {
        this.i = paramLong;
      }
      return;
    }
  }
  
  public void a(View paramView)
  {
    ((ViewGroup)this.b.i.a()).setVisibility(0);
    ((ViewGroup)this.b.i.a()).removeAllViews();
    ((ViewGroup)this.b.i.a()).addView(paramView);
    if (((k)this.b.g.a()).b())
    {
      ((g)this.b.b.a()).a((an)this.b.l.a(), false, -1, -1, -1, -1);
      if (((a)this.b.e.a()).a()) {
        ((ViewGroup)this.b.i.a()).addView((View)this.b.e.a(), com.google.ads.e.a.a((Context)this.b.f.a(), ((k)this.b.g.a()).c().a()), com.google.ads.e.a.a((Context)this.b.f.a(), ((k)this.b.g.a()).c().b()));
      }
    }
  }
  
  public void a(View paramView, aj paramaj, ah paramah, boolean paramBoolean)
  {
    try
    {
      com.google.ads.e.d.a("AdManager.onReceiveGWhirlAd() called.");
      this.k = true;
      this.z = paramah;
      if (this.b.a())
      {
        a(paramView);
        a(paramah, Boolean.valueOf(paramBoolean));
      }
      this.y.a(paramaj);
      paramView = (b)this.b.o.a();
      if (paramView != null) {
        paramView.a((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    finally {}
  }
  
  public void a(ae paramae)
  {
    try
    {
      this.c = null;
      this.y.a(paramae, this.d);
      return;
    }
    finally
    {
      paramae = finally;
      throw paramae;
    }
  }
  
  public void a(an paraman, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paraman = (a)this.b.e.a();
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      paraman.setOverlayActivated(bool);
      a(paramInt1, paramInt2, paramInt3, paramInt4);
      if (this.b.q.a() != null)
      {
        if (!paramBoolean) {
          break;
        }
        ((com.google.ads.g)this.b.q.a()).a((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    ((com.google.ads.g)this.b.q.a()).b((com.google.ads.a)this.b.a.a());
  }
  
  /* Error */
  public void a(c.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: putfield 77	com/google/ads/b/g:c	Lcom/google/ads/b/f;
    //   7: aload_1
    //   8: getstatic 526	com/google/ads/c$a:c	Lcom/google/ads/c$a;
    //   11: if_acmpne +21 -> 32
    //   14: aload_0
    //   15: ldc_w 527
    //   18: invokevirtual 529	com/google/ads/b/g:a	(F)V
    //   21: aload_0
    //   22: invokevirtual 410	com/google/ads/b/g:s	()Z
    //   25: ifne +7 -> 32
    //   28: aload_0
    //   29: invokevirtual 531	com/google/ads/b/g:h	()V
    //   32: aload_0
    //   33: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   36: invokevirtual 374	com/google/ads/ap:b	()Z
    //   39: ifeq +17 -> 56
    //   42: aload_1
    //   43: getstatic 533	com/google/ads/c$a:b	Lcom/google/ads/c$a;
    //   46: if_acmpne +80 -> 126
    //   49: aload_0
    //   50: getfield 75	com/google/ads/b/g:e	Lcom/google/ads/b/j;
    //   53: invokevirtual 535	com/google/ads/b/j:B	()V
    //   56: new 138	java/lang/StringBuilder
    //   59: dup
    //   60: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   63: ldc_w 537
    //   66: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   69: aload_1
    //   70: invokevirtual 457	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   73: ldc_w 539
    //   76: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: invokestatic 330	com/google/ads/e/d:c	(Ljava/lang/String;)V
    //   85: aload_0
    //   86: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   89: getfield 333	com/google/ads/ap:o	Lcom/google/ads/e/k$c;
    //   92: invokevirtual 336	com/google/ads/e/k$c:a	()Ljava/lang/Object;
    //   95: checkcast 338	com/google/ads/b
    //   98: astore_2
    //   99: aload_2
    //   100: ifnull +23 -> 123
    //   103: aload_2
    //   104: aload_0
    //   105: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   108: getfield 340	com/google/ads/ap:a	Lcom/google/ads/e/k$b;
    //   111: invokevirtual 187	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   114: checkcast 342	com/google/ads/a
    //   117: aload_1
    //   118: invokeinterface 542 3 0
    //   123: aload_0
    //   124: monitorexit
    //   125: return
    //   126: aload_1
    //   127: getstatic 526	com/google/ads/c$a:c	Lcom/google/ads/c$a;
    //   130: if_acmpne -74 -> 56
    //   133: aload_0
    //   134: getfield 75	com/google/ads/b/g:e	Lcom/google/ads/b/j;
    //   137: invokevirtual 544	com/google/ads/b/j:z	()V
    //   140: goto -84 -> 56
    //   143: astore_1
    //   144: aload_0
    //   145: monitorexit
    //   146: aload_1
    //   147: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	this	g
    //   0	148	1	parama	c.a
    //   98	6	2	localb	b
    // Exception table:
    //   from	to	target	type
    //   2	32	143	finally
    //   32	56	143	finally
    //   56	99	143	finally
    //   103	123	143	finally
    //   126	140	143	finally
  }
  
  public void a(com.google.ads.c paramc)
  {
    for (;;)
    {
      try
      {
        com.google.ads.e.d.d("v6.4.1 RC00");
        if (this.h)
        {
          com.google.ads.e.d.e("loadAd called after ad was destroyed.");
          return;
        }
        if (q())
        {
          com.google.ads.e.d.e("loadAd called while the ad is already loading, so aborting.");
          continue;
        }
        if (!AdActivity.b()) {
          break label60;
        }
      }
      finally {}
      com.google.ads.e.d.e("loadAd called while an interstitial or landing page is displayed, so aborting");
      continue;
      label60:
      if ((com.google.ads.e.a.c((Context)this.b.f.a())) && (com.google.ads.e.a.b((Context)this.b.f.a())))
      {
        long l1 = this.o.getLong("GoogleAdMobDoritosLife", 60000L);
        if (aa.a((Context)this.b.f.a(), l1)) {
          aa.a((Activity)this.b.c.a());
        }
        this.k = false;
        this.s.clear();
        this.t.clear();
        this.d = paramc;
        if (this.x.a())
        {
          this.y.a(this.x.b(), paramc);
        }
        else
        {
          an localan = new an(this.b);
          this.b.m.a(localan);
          this.c = ((f)localan.b.a());
          this.c.a(paramc);
        }
      }
    }
  }
  
  public void a(String paramString)
  {
    this.B = paramString;
    Object localObject = new Builder().encodedQuery(paramString).build();
    paramString = new StringBuilder();
    localObject = com.google.ads.e.a.b((Uri)localObject);
    Iterator localIterator = ((Map)localObject).keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramString.append(str).append(" = ").append((String)((Map)localObject).get(str)).append("\n");
    }
    this.A = paramString.toString().trim();
    if (TextUtils.isEmpty(this.A)) {
      this.A = null;
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    try
    {
      e locale = (e)this.b.p.a();
      if (locale != null) {
        locale.a((com.google.ads.a)this.b.a.a(), paramString1, paramString2);
      }
      return;
    }
    finally {}
  }
  
  protected void a(LinkedList<String> paramLinkedList)
  {
    try
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        com.google.ads.e.d.a("Adding a click tracking URL: " + str);
      }
      this.u = paramLinkedList;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.j = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void b()
  {
    try
    {
      if (this.y != null) {
        this.y.b();
      }
      this.b.o.a(null);
      this.b.p.a(null);
      z();
      f();
      if (this.f != null) {
        this.f.destroy();
      }
      this.h = true;
      return;
    }
    finally {}
  }
  
  public void b(long paramLong)
  {
    if (paramLong > 0L) {}
    try
    {
      this.o.edit().putLong("GoogleAdMobDoritosLife", paramLong).commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void b(ae paramae)
  {
    try
    {
      com.google.ads.e.d.a("AdManager.onGWhirlNoFill() called.");
      a(paramae.i(), paramae.c());
      paramae = (b)this.b.o.a();
      if (paramae != null) {
        paramae.a((com.google.ads.a)this.b.a.a(), c.a.b);
      }
      return;
    }
    finally {}
  }
  
  protected void b(String paramString)
  {
    try
    {
      com.google.ads.e.d.a("Adding a tracking URL: " + paramString);
      this.s.add(paramString);
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
    this.w = Boolean.valueOf(paramBoolean);
  }
  
  public String c()
  {
    return this.A;
  }
  
  protected void c(String paramString)
  {
    try
    {
      com.google.ads.e.d.a("Adding a manual tracking URL: " + paramString);
      C().add(paramString);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public String d()
  {
    return this.B;
  }
  
  public void e()
  {
    try
    {
      this.m = false;
      com.google.ads.e.d.a("Refreshing is no longer allowed on this AdView.");
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 87	com/google/ads/b/g:l	Z
    //   6: ifeq +36 -> 42
    //   9: ldc_w 669
    //   12: invokestatic 404	com/google/ads/e/d:a	(Ljava/lang/String;)V
    //   15: invokestatic 106	com/google/ads/ao:a	()Lcom/google/ads/ao;
    //   18: getfield 671	com/google/ads/ao:c	Lcom/google/ads/e/k$b;
    //   21: invokevirtual 187	com/google/ads/e/k$b:a	()Ljava/lang/Object;
    //   24: checkcast 673	android/os/Handler
    //   27: aload_0
    //   28: getfield 168	com/google/ads/b/g:q	Lcom/google/ads/m;
    //   31: invokevirtual 676	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   34: aload_0
    //   35: iconst_0
    //   36: putfield 87	com/google/ads/b/g:l	Z
    //   39: aload_0
    //   40: monitorexit
    //   41: return
    //   42: ldc_w 678
    //   45: invokestatic 404	com/google/ads/e/d:a	(Ljava/lang/String;)V
    //   48: goto -9 -> 39
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: aload_1
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	g
    //   51	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	39	51	finally
    //   42	48	51	finally
  }
  
  public void g()
  {
    for (;;)
    {
      try
      {
        this.n = false;
        if (!this.b.a()) {
          break label118;
        }
        if (this.m)
        {
          if (!this.l)
          {
            com.google.ads.e.d.a("Enabling refreshing every " + this.p + " milliseconds.");
            ((Handler)ao.a().c.a()).postDelayed(this.q, this.p);
            this.l = true;
            return;
          }
          com.google.ads.e.d.a("Refreshing is already enabled.");
          continue;
        }
        com.google.ads.e.d.a("Refreshing disabled on this AdView");
      }
      finally {}
      continue;
      label118:
      com.google.ads.e.d.a("Tried to enable refreshing on something other than an AdView.");
    }
  }
  
  public void h()
  {
    g();
    this.n = true;
  }
  
  public ap i()
  {
    return this.b;
  }
  
  public af j()
  {
    try
    {
      af localaf = this.x;
      return localaf;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public f k()
  {
    try
    {
      f localf = this.c;
      return localf;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public c l()
  {
    try
    {
      c localc = this.f;
      return localc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public l m()
  {
    try
    {
      l locall = this.g;
      return locall;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public j n()
  {
    return this.e;
  }
  
  public int o()
  {
    try
    {
      int i1 = this.v;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public long p()
  {
    return this.i;
  }
  
  /* Error */
  public boolean q()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 77	com/google/ads/b/g:c	Lcom/google/ads/b/f;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_1
    //   19: goto -6 -> 13
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	g
    //   12	7	1	bool	boolean
    //   6	2	2	localf	f
    //   22	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public boolean r()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public boolean s()
  {
    try
    {
      boolean bool = this.l;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void t()
  {
    try
    {
      this.e.C();
      com.google.ads.e.d.c("onDismissScreen()");
      b localb = (b)this.b.o.a();
      if (localb != null) {
        localb.c((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    finally {}
  }
  
  public void u()
  {
    try
    {
      com.google.ads.e.d.c("onPresentScreen()");
      b localb = (b)this.b.o.a();
      if (localb != null) {
        localb.b((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    finally {}
  }
  
  public void v()
  {
    try
    {
      com.google.ads.e.d.c("onLeaveApplication()");
      b localb = (b)this.b.o.a();
      if (localb != null) {
        localb.d((com.google.ads.a)this.b.a.a());
      }
      return;
    }
    finally {}
  }
  
  public void w()
  {
    this.e.f();
    A();
  }
  
  /* Error */
  public void x()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 117	com/google/ads/b/g:b	Lcom/google/ads/ap;
    //   6: getfield 298	com/google/ads/ap:c	Lcom/google/ads/e/k$d;
    //   9: invokevirtual 301	com/google/ads/e/k$d:a	()Ljava/lang/Object;
    //   12: checkcast 119	android/app/Activity
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +12 -> 29
    //   20: ldc_w 720
    //   23: invokestatic 308	com/google/ads/e/d:e	(Ljava/lang/String;)V
    //   26: aload_0
    //   27: monitorexit
    //   28: return
    //   29: aload_0
    //   30: getfield 173	com/google/ads/b/g:s	Ljava/util/LinkedList;
    //   33: invokevirtual 309	java/util/LinkedList:iterator	()Ljava/util/Iterator;
    //   36: astore_2
    //   37: aload_2
    //   38: invokeinterface 267 1 0
    //   43: ifeq -17 -> 26
    //   46: new 269	java/lang/Thread
    //   49: dup
    //   50: new 271	com/google/ads/l
    //   53: dup
    //   54: aload_2
    //   55: invokeinterface 274 1 0
    //   60: checkcast 276	java/lang/String
    //   63: aload_1
    //   64: invokevirtual 123	android/app/Activity:getApplicationContext	()Landroid/content/Context;
    //   67: invokespecial 286	com/google/ads/l:<init>	(Ljava/lang/String;Landroid/content/Context;)V
    //   70: invokespecial 289	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   73: invokevirtual 292	java/lang/Thread:start	()V
    //   76: goto -39 -> 37
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	g
    //   15	49	1	localActivity	Activity
    //   79	4	1	localObject	Object
    //   36	19	2	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	16	79	finally
    //   20	26	79	finally
    //   29	37	79	finally
    //   37	76	79	finally
  }
  
  public void y()
  {
    for (;;)
    {
      try
      {
        boolean bool = this.h;
        if (bool) {
          return;
        }
        if (this.d == null) {
          break label134;
        }
        if (!this.b.a()) {
          break label125;
        }
        if ((((AdView)this.b.j.a()).isShown()) && (com.google.ads.e.a.d()))
        {
          com.google.ads.e.d.c("Refreshing ad.");
          a(this.d);
          if (!this.n) {
            break label98;
          }
          f();
          continue;
        }
        com.google.ads.e.d.a("Not refreshing because the ad is not visible.");
      }
      finally {}
      continue;
      label98:
      ((Handler)ao.a().c.a()).postDelayed(this.q, this.p);
      continue;
      label125:
      com.google.ads.e.d.a("Tried to refresh an ad that wasn't an AdView.");
      continue;
      label134:
      com.google.ads.e.d.a("Tried to refresh before calling loadAd().");
    }
  }
  
  public void z()
  {
    try
    {
      if (this.c != null)
      {
        this.c.a();
        this.c = null;
      }
      if (this.f != null) {
        this.f.stopLoading();
      }
      return;
    }
    finally {}
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.g
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */