package com.example.lw.appline.com.google.ads;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.b.b;
import com.google.ads.b.c;
import com.google.ads.b.g;
import com.google.ads.e.a;
import com.google.ads.e.h;
import java.util.HashMap;

public class k
  implements aq
{
  private static final com.google.ads.b.d a = (com.google.ads.b.d)com.google.ads.b.d.a.b();
  
  protected int a(HashMap<String, String> paramHashMap, String paramString, int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    paramHashMap = (String)paramHashMap.get(paramString);
    int i = paramInt;
    if (paramHashMap != null) {}
    try
    {
      float f = TypedValue.applyDimension(1, Integer.parseInt(paramHashMap), paramDisplayMetrics);
      i = (int)f;
      return i;
    }
    catch (NumberFormatException paramDisplayMetrics)
    {
      com.google.ads.e.d.a("Could not parse \"" + paramString + "\" in a video gmsg: " + paramHashMap);
    }
    return paramInt;
  }
  
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("action");
    if (str == null)
    {
      com.google.ads.e.d.a("No \"action\" parameter in a video gmsg.");
      return;
    }
    c localc;
    if ((paramWebView instanceof c))
    {
      localc = (c)paramWebView;
      paramWebView = localc.i();
      if (paramWebView == null) {
        com.google.ads.e.d.a("Could not get adActivity for a video gmsg.");
      }
    }
    else
    {
      com.google.ads.e.d.a("Could not get adWebView for a video gmsg.");
      return;
    }
    boolean bool1 = str.equals("new");
    boolean bool2 = str.equals("position");
    int i;
    int j;
    if ((bool1) || (bool2))
    {
      paramg = a.a(paramWebView);
      i = a(paramHashMap, "x", 0, paramg);
      j = a(paramHashMap, "y", 0, paramg);
      int k = a(paramHashMap, "w", -1, paramg);
      int m = a(paramHashMap, "h", -1, paramg);
      if ((bool1) && (paramWebView.a() == null))
      {
        paramWebView.b(i, j, k, m);
        return;
      }
      paramWebView.a(i, j, k, m);
      return;
    }
    paramg = paramWebView.a();
    if (paramg == null)
    {
      a.a(localc, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
      return;
    }
    if (str.equals("click"))
    {
      paramWebView = a.a(paramWebView);
      i = a(paramHashMap, "x", 0, paramWebView);
      j = a(paramHashMap, "y", 0, paramWebView);
      long l = SystemClock.uptimeMillis();
      paramg.a(MotionEvent.obtain(l, l, 0, i, j, 0));
      return;
    }
    if (str.equals("controls"))
    {
      paramHashMap = (String)paramHashMap.get("enabled");
      if (paramHashMap == null)
      {
        com.google.ads.e.d.a("No \"enabled\" parameter in a controls video gmsg.");
        return;
      }
      if (paramHashMap.equals("true"))
      {
        paramg.setMediaControllerEnabled(true);
        return;
      }
      paramg.setMediaControllerEnabled(false);
      return;
    }
    if (str.equals("currentTime"))
    {
      paramHashMap = (String)paramHashMap.get("time");
      if (paramHashMap == null)
      {
        com.google.ads.e.d.a("No \"time\" parameter in a currentTime video gmsg.");
        return;
      }
      try
      {
        paramg.a((int)(Float.parseFloat(paramHashMap) * 1000.0F));
        return;
      }
      catch (NumberFormatException paramg)
      {
        com.google.ads.e.d.a("Could not parse \"time\" parameter: " + paramHashMap);
        return;
      }
    }
    if (str.equals("hide"))
    {
      paramg.setVisibility(4);
      return;
    }
    if (str.equals("load"))
    {
      paramg.b();
      return;
    }
    if (str.equals("pause"))
    {
      paramg.c();
      return;
    }
    if (str.equals("play"))
    {
      paramg.d();
      return;
    }
    if (str.equals("show"))
    {
      paramg.setVisibility(0);
      return;
    }
    if (str.equals("src"))
    {
      paramg.setSrc((String)paramHashMap.get("src"));
      return;
    }
    com.google.ads.e.d.a("Unknown video action: " + str);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.k
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */