package com.example.lw.appline.com.google.ads.b;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.ap;
import com.google.ads.e.a;
import com.google.ads.e.b.b;
import com.google.ads.e.i;
import com.google.ads.e.i.a;
import com.google.ads.e.j;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import com.google.ads.r;
import java.lang.ref.WeakReference;

public class c
  extends WebView
{
  protected final ap a;
  private WeakReference<AdActivity> b;
  private com.google.ads.d c;
  private boolean d;
  private boolean e;
  private boolean f;
  
  public c(ap paramap, com.google.ads.d paramd)
  {
    super((Context)paramap.f.a());
    this.a = paramap;
    this.c = paramd;
    this.b = null;
    this.d = false;
    this.e = false;
    this.f = false;
    setBackgroundColor(0);
    a.a(this);
    paramd = getSettings();
    paramd.setSupportMultipleWindows(false);
    paramd.setJavaScriptEnabled(true);
    paramd.setSavePassword(false);
    setDownloadListener(new DownloadListener()
    {
      public void onDownloadStart(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, String paramAnonymousString4, long paramAnonymousLong)
      {
        try
        {
          paramAnonymousString2 = new Intent("android.intent.action.VIEW");
          paramAnonymousString2.setDataAndType(Uri.parse(paramAnonymousString1), paramAnonymousString4);
          paramAnonymousString3 = c.this.i();
          if ((paramAnonymousString3 != null) && (a.a(paramAnonymousString2, paramAnonymousString3))) {
            paramAnonymousString3.startActivity(paramAnonymousString2);
          }
          return;
        }
        catch (ActivityNotFoundException paramAnonymousString2)
        {
          com.google.ads.e.d.a("Couldn't find an Activity to view url/mimetype: " + paramAnonymousString1 + " / " + paramAnonymousString4);
          return;
        }
        catch (Throwable paramAnonymousString2)
        {
          com.google.ads.e.d.b("Unknown error trying to start activity to view URL: " + paramAnonymousString1, paramAnonymousString2);
        }
      }
    });
    if (a.a >= 17) {
      j.a(paramd, paramap);
    }
    do
    {
      for (;;)
      {
        setScrollBarStyle(33554432);
        if (a.a < 14) {
          break;
        }
        setWebChromeClient(new b.b(paramap));
        return;
        if (a.a >= 11) {
          i.a(paramd, paramap);
        }
      }
    } while (a.a < 11);
    setWebChromeClient(new i.a(paramap));
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      setOnTouchListener(new OnTouchListener()
      {
        public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          return paramAnonymousMotionEvent.getAction() == 2;
        }
      });
      return;
    }
    setOnTouchListener(null);
  }
  
  public void destroy()
  {
    try
    {
      super.destroy();
      return;
    }
    catch (Throwable localThrowable1)
    {
      for (;;)
      {
        try
        {
          setWebViewClient(new WebViewClient());
          return;
        }
        catch (Throwable localThrowable2) {}
        localThrowable1 = localThrowable1;
        com.google.ads.e.d.d("An error occurred while destroying an AdWebView:", localThrowable1);
      }
    }
  }
  
  public void f()
  {
    AdActivity localAdActivity = i();
    if (localAdActivity != null) {
      localAdActivity.finish();
    }
  }
  
  public void g()
  {
    if (a.a >= 11) {
      i.a(this);
    }
    this.e = true;
  }
  
  public void h()
  {
    if ((this.e) && (a.a >= 11)) {
      i.b(this);
    }
    this.e = false;
  }
  
  public AdActivity i()
  {
    if (this.b != null) {
      return (AdActivity)this.b.get();
    }
    return null;
  }
  
  public boolean j()
  {
    return this.f;
  }
  
  public boolean k()
  {
    return this.e;
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
      return;
    }
    catch (Throwable paramString1)
    {
      com.google.ads.e.d.d("An error occurred while loading data in AdWebView:", paramString1);
    }
  }
  
  public void loadUrl(String paramString)
  {
    try
    {
      super.loadUrl(paramString);
      return;
    }
    catch (Throwable paramString)
    {
      com.google.ads.e.d.d("An error occurred while loading a URL in AdWebView:", paramString);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int j = 2147483647;
    try
    {
      if (isInEditMode()) {
        super.onMeasure(paramInt1, paramInt2);
      }
      for (;;)
      {
        return;
        if ((this.c != null) && (!this.d)) {
          break;
        }
        super.onMeasure(paramInt1, paramInt2);
      }
      i2 = MeasureSpec.getMode(paramInt1);
    }
    finally {}
    int i2;
    int i = MeasureSpec.getSize(paramInt1);
    int m = MeasureSpec.getMode(paramInt2);
    int k = MeasureSpec.getSize(paramInt2);
    float f1 = getContext().getResources().getDisplayMetrics().density;
    int n = (int)(this.c.a() * f1);
    int i1 = (int)(this.c.b() * f1);
    if (i2 != -2147483648) {
      if (i2 == 1073741824) {
        break label225;
      }
    }
    for (;;)
    {
      label133:
      com.google.ads.e.d.b("Not enough space to show ad! Wants: <" + n + ", " + i1 + ">, Has: <" + i + ", " + k + ">");
      setVisibility(8);
      setMeasuredDimension(i, k);
      break;
      label225:
      label228:
      do
      {
        setMeasuredDimension(n, i1);
        break;
        paramInt1 = 2147483647;
        break label228;
        paramInt1 = i;
        if (m != -2147483648)
        {
          paramInt2 = j;
          if (m != 1073741824) {}
        }
        else
        {
          paramInt2 = k;
        }
        if (n - f1 * 6.0F > paramInt1) {
          break label133;
        }
      } while (i1 <= paramInt2);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    r localr = (r)this.a.r.a();
    if (localr != null) {
      localr.a(paramMotionEvent);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setAdActivity(AdActivity paramAdActivity)
  {
    this.b = new WeakReference(paramAdActivity);
  }
  
  public void setAdSize(com.google.ads.d paramd)
  {
    try
    {
      this.c = paramd;
      requestLayout();
      return;
    }
    finally
    {
      paramd = finally;
      throw paramd;
    }
  }
  
  public void setCustomClose(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (this.b != null)
    {
      AdActivity localAdActivity = (AdActivity)this.b.get();
      if (localAdActivity != null) {
        localAdActivity.a(paramBoolean);
      }
    }
  }
  
  public void setIsExpandedMraid(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void stopLoading()
  {
    try
    {
      super.stopLoading();
      return;
    }
    catch (Throwable localThrowable)
    {
      com.google.ads.e.d.d("An error occurred while stopping loading in AdWebView:", localThrowable);
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.c
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */