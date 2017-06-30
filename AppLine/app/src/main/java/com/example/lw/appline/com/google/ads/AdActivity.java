package com.example.lw.appline.com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.google.ads.b.b;
import com.google.ads.b.c;
import com.google.ads.b.l;
import com.google.ads.e.a;
import com.google.ads.e.i;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import com.google.ads.e.k.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdActivity
  extends Activity
  implements OnClickListener
{
  private static final com.google.ads.b.d a = (com.google.ads.b.d)com.google.ads.b.d.a.b();
  private static final Object b = new Object();
  private static AdActivity c = null;
  private static com.google.ads.b.g d = null;
  private static AdActivity e = null;
  private static AdActivity f = null;
  private static final a g = new a();
  private c h;
  private FrameLayout i;
  private int j;
  private ViewGroup k = null;
  private boolean l;
  private long m;
  private RelativeLayout n;
  private AdActivity o = null;
  private boolean p;
  private boolean q;
  private boolean r;
  private boolean s;
  private b t;
  
  public static void a(com.google.ads.b.g paramg, com.google.ads.b.h paramh)
  {
    g.a(paramg, paramh);
  }
  
  private void a(String paramString)
  {
    com.google.ads.e.d.b(paramString);
    finish();
  }
  
  private void a(String paramString, Throwable paramThrowable)
  {
    com.google.ads.e.d.b(paramString, paramThrowable);
    finish();
  }
  
  public static boolean b()
  {
    return g.a();
  }
  
  private RelativeLayout.LayoutParams c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.setMargins(paramInt1, paramInt2, 0, 0);
    localLayoutParams.addRule(10);
    localLayoutParams.addRule(9);
    return localLayoutParams;
  }
  
  public static boolean c()
  {
    return g.b();
  }
  
  private void h()
  {
    if (!this.l) {
      if (this.h != null)
      {
        a.b(this.h);
        this.h.setAdActivity(null);
        this.h.setIsExpandedMraid(false);
        if ((!this.q) && (this.n != null) && (this.k != null))
        {
          if ((!this.r) || (this.s)) {
            break label238;
          }
          com.google.ads.e.d.a("Disabling hardware acceleration on collapsing MRAID WebView.");
          this.h.g();
        }
      }
    }
    for (;;)
    {
      this.n.removeView(this.h);
      this.k.addView(this.h);
      if (this.t != null)
      {
        this.t.e();
        this.t = null;
      }
      if (this == c) {
        c = null;
      }
      f = this.o;
      synchronized (b)
      {
        if ((d != null) && (this.q) && (this.h != null))
        {
          if (this.h == d.l()) {
            d.a();
          }
          this.h.stopLoading();
        }
        if (this == e)
        {
          e = null;
          if (d != null)
          {
            d.t();
            d = null;
          }
        }
        else
        {
          this.l = true;
          com.google.ads.e.d.a("AdActivity is closing.");
          return;
          label238:
          if ((this.r) || (!this.s)) {
            continue;
          }
          com.google.ads.e.d.a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
          this.h.h();
          continue;
        }
        com.google.ads.e.d.e("currentAdManager is null while trying to destroy AdActivity.");
      }
    }
  }
  
  protected View a(int paramInt, boolean paramBoolean)
  {
    this.j = ((int)TypedValue.applyDimension(1, paramInt, getResources().getDisplayMetrics()));
    this.i = new FrameLayout(getApplicationContext());
    this.i.setMinimumWidth(this.j);
    this.i.setMinimumHeight(this.j);
    this.i.setOnClickListener(this);
    a(paramBoolean);
    return this.i;
  }
  
  public b a()
  {
    return this.t;
  }
  
  protected b a(Activity paramActivity)
  {
    return new b(paramActivity, this.h);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.t != null)
    {
      this.t.setLayoutParams(c(paramInt1, paramInt2, paramInt3, paramInt4));
      this.t.requestLayout();
    }
  }
  
  protected void a(c paramc, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3)
  {
    requestWindowFeature(1);
    Object localObject = getWindow();
    ((Window)localObject).setFlags(1024, 1024);
    if (a.a >= 11)
    {
      if (!this.r) {
        break label105;
      }
      com.google.ads.e.d.a("Enabling hardware acceleration on the AdActivity window.");
      i.a((Window)localObject);
    }
    for (;;)
    {
      localObject = paramc.getParent();
      if (localObject != null)
      {
        if (!paramBoolean2) {
          break label126;
        }
        if (!(localObject instanceof ViewGroup)) {
          break;
        }
        this.k = ((ViewGroup)localObject);
        this.k.removeView(paramc);
      }
      if (paramc.i() == null) {
        break label134;
      }
      a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
      return;
      label105:
      com.google.ads.e.d.a("Disabling hardware acceleration on the AdActivity WebView.");
      paramc.g();
    }
    a("MRAID banner was not a child of a ViewGroup.");
    return;
    label126:
    a("Interstitial created with an AdWebView that has a parent.");
    return;
    label134:
    setRequestedOrientation(paramInt);
    paramc.setAdActivity(this);
    label152:
    RelativeLayout.LayoutParams localLayoutParams;
    if (paramBoolean2)
    {
      paramInt = 50;
      localObject = a(paramInt, paramBoolean3);
      this.n.addView(paramc, -1, -1);
      localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      if (!paramBoolean2) {
        break label261;
      }
      localLayoutParams.addRule(10);
      localLayoutParams.addRule(11);
    }
    for (;;)
    {
      this.n.addView((View)localObject, localLayoutParams);
      this.n.setKeepScreenOn(true);
      setContentView(this.n);
      this.n.getRootView().setBackgroundColor(-16777216);
      if (!paramBoolean1) {
        break;
      }
      a.a(paramc);
      return;
      paramInt = 32;
      break label152;
      label261:
      localLayoutParams.addRule(10);
      localLayoutParams.addRule(9);
    }
  }
  
  protected void a(com.google.ads.b.g paramg)
  {
    this.h = null;
    this.m = SystemClock.elapsedRealtime();
    this.p = true;
    synchronized (b)
    {
      if (c == null)
      {
        c = this;
        paramg.v();
      }
      return;
    }
  }
  
  protected void a(HashMap<String, String> paramHashMap, com.google.ads.b.g paramg)
  {
    int i3 = 0;
    if (paramHashMap == null)
    {
      a("Could not get the paramMap in launchIntent()");
      return;
    }
    localIntent = new Intent();
    localObject3 = (String)paramHashMap.get("u");
    localObject4 = (String)paramHashMap.get("m");
    String str1 = (String)paramHashMap.get("i");
    String str2 = (String)paramHashMap.get("p");
    Object localObject2 = (String)paramHashMap.get("c");
    localObject1 = (String)paramHashMap.get("f");
    paramHashMap = (String)paramHashMap.get("e");
    int i2;
    if (!TextUtils.isEmpty((CharSequence)localObject3))
    {
      i1 = 1;
      if (TextUtils.isEmpty((CharSequence)localObject4)) {
        break label425;
      }
      i2 = 1;
      if ((i1 == 0) || (i2 == 0)) {
        break label431;
      }
      localIntent.setDataAndType(Uri.parse((String)localObject3), (String)localObject4);
      label150:
      if (TextUtils.isEmpty(str1)) {
        break label465;
      }
      localIntent.setAction(str1);
    }
    for (;;)
    {
      for (;;)
      {
        if ((!TextUtils.isEmpty(str2)) && (a.a >= 4)) {
          com.google.ads.e.g.a(localIntent, str2);
        }
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          localObject3 = ((String)localObject2).split("/");
          if (localObject3.length < 2) {
            com.google.ads.e.d.e("Warning: Could not parse component name from open GMSG: " + (String)localObject2);
          }
          localIntent.setClassName(localObject3[0], localObject3[1]);
        }
        if (!TextUtils.isEmpty((CharSequence)localObject1)) {}
        try
        {
          for (;;)
          {
            i1 = Integer.parseInt((String)localObject1);
            localIntent.addFlags(i1);
            if (TextUtils.isEmpty(paramHashMap)) {
              break label556;
            }
            try
            {
              localObject1 = new JSONObject(paramHashMap);
              localObject2 = ((JSONObject)localObject1).names();
              i1 = i3;
              while (i1 < ((JSONArray)localObject2).length())
              {
                localObject3 = ((JSONArray)localObject2).getString(i1);
                localObject4 = ((JSONObject)localObject1).getJSONObject((String)localObject3);
                i2 = ((JSONObject)localObject4).getInt("t");
                switch (i2)
                {
                case 1: 
                  com.google.ads.e.d.e("Warning: Unknown type in extras from open GMSG: " + (String)localObject3 + " (type: " + i2 + ")");
                  i1 += 1;
                }
              }
              i1 = 0;
            }
            catch (JSONException localJSONException)
            {
              label425:
              label431:
              label465:
              com.google.ads.e.d.e("Warning: Could not parse extras from open GMSG: " + paramHashMap);
            }
          }
          i2 = 0;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          for (;;)
          {
            com.google.ads.e.d.e("Warning: Could not parse flags from open GMSG: " + (String)localObject1);
            i1 = 0;
            continue;
            localIntent.putExtra((String)localObject3, ((JSONObject)localObject4).getBoolean("v"));
            continue;
            if (localIntent.filterEquals(new Intent()))
            {
              a("Tried to launch empty intent.");
              return;
              localIntent.putExtra((String)localObject3, ((JSONObject)localObject4).getDouble("v"));
              continue;
              localIntent.putExtra((String)localObject3, ((JSONObject)localObject4).getInt("v"));
              continue;
              localIntent.putExtra((String)localObject3, ((JSONObject)localObject4).getLong("v"));
              continue;
              localIntent.putExtra((String)localObject3, ((JSONObject)localObject4).getString("v"));
            }
            else
            {
              try
              {
                com.google.ads.e.d.a("Launching an intent from AdActivity: " + localIntent);
                startActivity(localIntent);
                a(paramg);
                return;
              }
              catch (ActivityNotFoundException paramHashMap)
              {
                a(paramHashMap.getMessage(), paramHashMap);
                return;
              }
            }
          }
        }
      }
      if (i1 != 0)
      {
        localIntent.setData(Uri.parse((String)localObject3));
        break label150;
      }
      if (i2 == 0) {
        break label150;
      }
      localIntent.setType((String)localObject4);
      break label150;
      if (i1 != 0) {
        localIntent.setAction("android.intent.action.VIEW");
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.i != null)
    {
      this.i.removeAllViews();
      if (!paramBoolean)
      {
        ImageButton localImageButton = new ImageButton(this);
        localImageButton.setImageResource(17301527);
        localImageButton.setBackgroundColor(0);
        localImageButton.setOnClickListener(this);
        localImageButton.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.j, this.j, 17);
        this.i.addView(localImageButton, localLayoutParams);
      }
    }
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.t == null)
    {
      this.t = a(this);
      this.n.addView(this.t, 0, c(paramInt1, paramInt2, paramInt3, paramInt4));
      synchronized (b)
      {
        if (d == null)
        {
          com.google.ads.e.d.e("currentAdManager was null while trying to get the opening AdWebView.");
          return;
        }
        d.m().b(false);
        return;
      }
    }
  }
  
  public void onClick(View paramView)
  {
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = false;
    super.onCreate(paramBundle);
    this.l = false;
    boolean bool3;
    boolean bool1;
    for (;;)
    {
      synchronized (b)
      {
        if (d != null)
        {
          paramBundle = d;
          if (e == null)
          {
            e = this;
            paramBundle.u();
          }
          if ((this.o == null) && (f != null)) {
            this.o = f;
          }
          f = this;
          if (((paramBundle.i().a()) && (e == this)) || ((paramBundle.i().b()) && (this.o == e))) {
            paramBundle.w();
          }
          bool3 = paramBundle.r();
          localObject2 = (ao.a)((ao)paramBundle.i().d.a()).b.a();
          if (a.a >= ((Integer)((ao.a)localObject2).b.a()).intValue())
          {
            bool1 = true;
            this.s = bool1;
            if (a.a < ((Integer)((ao.a)localObject2).d.a()).intValue()) {
              break label264;
            }
            bool1 = true;
            this.r = bool1;
            this.n = null;
            this.p = false;
            this.q = true;
            this.t = null;
            ??? = getIntent().getBundleExtra("com.google.ads.AdOpener");
            if (??? != null) {
              break;
            }
            a("Could not get the Bundle used to create AdActivity.");
          }
        }
        else
        {
          a("Could not get currentAdManager.");
          return;
        }
      }
      bool1 = false;
      continue;
      label264:
      bool1 = false;
    }
    ??? = new com.google.ads.b.h((Bundle)???);
    Object localObject2 = ((com.google.ads.b.h)???).b();
    ??? = ((com.google.ads.b.h)???).c();
    if (((String)localObject2).equals("intent"))
    {
      a((HashMap)???, paramBundle);
      return;
    }
    this.n = new RelativeLayout(getApplicationContext());
    label456:
    int i1;
    if (((String)localObject2).equals("webapp"))
    {
      this.h = new c(paramBundle.i(), null);
      localObject2 = com.google.ads.b.d.d;
      String str1;
      String str2;
      if (!bool3)
      {
        bool1 = true;
        localObject2 = l.a(paramBundle, (Map)localObject2, true, bool1);
        ((l)localObject2).d(true);
        if (bool3) {
          ((l)localObject2).a(true);
        }
        this.h.setWebViewClient((WebViewClient)localObject2);
        localObject2 = (String)((HashMap)???).get("u");
        str1 = (String)((HashMap)???).get("baseurl");
        str2 = (String)((HashMap)???).get("html");
        if (localObject2 == null) {
          break label529;
        }
        this.h.loadUrl((String)localObject2);
        localObject2 = (String)((HashMap)???).get("o");
        if (!"p".equals(localObject2)) {
          break label563;
        }
        i1 = a.b();
        label484:
        paramBundle = this.h;
        if ((??? == null) || (!"1".equals(((HashMap)???).get("custom_close")))) {
          break label601;
        }
      }
      label529:
      label563:
      label601:
      for (bool1 = true;; bool1 = false)
      {
        a(paramBundle, false, i1, bool3, bool1);
        return;
        bool1 = false;
        break;
        if (str2 != null)
        {
          this.h.loadDataWithBaseURL(str1, str2, "text/html", "utf-8", null);
          break label456;
        }
        a("Could not get the URL or HTML parameter to show a web app.");
        return;
        if ("l".equals(localObject2))
        {
          i1 = a.a();
          break label484;
        }
        if (this == e)
        {
          i1 = paramBundle.o();
          break label484;
        }
        i1 = -1;
        break label484;
      }
    }
    if ((((String)localObject2).equals("interstitial")) || (((String)localObject2).equals("expand")))
    {
      this.h = paramBundle.l();
      i1 = paramBundle.o();
      if (((String)localObject2).equals("expand"))
      {
        this.h.setIsExpandedMraid(true);
        this.q = false;
        bool1 = bool2;
        if (??? != null)
        {
          bool1 = bool2;
          if ("1".equals(((HashMap)???).get("custom_close"))) {
            bool1 = true;
          }
        }
        if ((!this.r) || (this.s)) {
          break label779;
        }
        com.google.ads.e.d.a("Re-enabling hardware acceleration on expanding MRAID WebView.");
        this.h.h();
      }
    }
    label779:
    for (;;)
    {
      a(this.h, true, i1, bool3, bool1);
      return;
      bool1 = this.h.j();
      continue;
      a("Unknown AdOpener, <action: " + (String)localObject2 + ">");
      return;
    }
  }
  
  public void onDestroy()
  {
    if (this.n != null) {
      this.n.removeAllViews();
    }
    if (isFinishing())
    {
      h();
      if ((this.q) && (this.h != null))
      {
        this.h.stopLoading();
        this.h.destroy();
        this.h = null;
      }
    }
    super.onDestroy();
  }
  
  public void onPause()
  {
    if (isFinishing()) {
      h();
    }
    super.onPause();
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if ((this.p) && (paramBoolean) && (SystemClock.elapsedRealtime() - this.m > 250L))
    {
      com.google.ads.e.d.d("Launcher AdActivity got focus and is closing.");
      finish();
    }
    super.onWindowFocusChanged(paramBoolean);
  }
  
  public static class a
  {
    public void a(com.google.ads.b.g paramg, com.google.ads.b.h paramh)
    {
      synchronized ()
      {
        if (AdActivity.g() == null) {
          AdActivity.b(paramg);
        }
        while (AdActivity.g() == paramg)
        {
          paramg = (Activity)paramg.i().c.a();
          if (paramg != null) {
            break;
          }
          com.google.ads.e.d.e("activity was null while launching an AdActivity.");
          return;
        }
        com.google.ads.e.d.b("Tried to launch a new AdActivity with a different AdManager.");
        return;
      }
      ??? = new Intent(paramg.getApplicationContext(), AdActivity.class);
      ((Intent)???).putExtra("com.google.ads.AdOpener", paramh.a());
      try
      {
        com.google.ads.e.d.a("Launching AdActivity.");
        paramg.startActivity((Intent)???);
        return;
      }
      catch (ActivityNotFoundException paramg)
      {
        com.google.ads.e.d.b("Activity not found.", paramg);
      }
    }
    
    public boolean a()
    {
      for (;;)
      {
        synchronized ()
        {
          if (AdActivity.e() != null)
          {
            bool = true;
            return bool;
          }
        }
        boolean bool = false;
      }
    }
    
    public boolean b()
    {
      for (;;)
      {
        synchronized ()
        {
          if (AdActivity.f() != null)
          {
            bool = true;
            return bool;
          }
        }
        boolean bool = false;
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.AdActivity
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */