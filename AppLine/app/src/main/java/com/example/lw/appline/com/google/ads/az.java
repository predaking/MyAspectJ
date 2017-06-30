package com.example.lw.appline.com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.b.c;
import com.google.ads.b.g;
import com.google.ads.b.k;
import com.google.ads.e.d;
import com.google.ads.e.i;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import java.util.HashMap;

public class az
  implements aq
{
  private void a(HashMap<String, String> paramHashMap, String paramString, k.c<Integer> paramc)
  {
    try
    {
      paramHashMap = (String)paramHashMap.get(paramString);
      if (!TextUtils.isEmpty(paramHashMap)) {
        paramc.a(Integer.valueOf(paramHashMap));
      }
      return;
    }
    catch (NumberFormatException paramHashMap)
    {
      d.a("Could not parse \"" + paramString + "\" constant.");
    }
  }
  
  private void b(HashMap<String, String> paramHashMap, String paramString, k.c<Long> paramc)
  {
    try
    {
      paramHashMap = (String)paramHashMap.get(paramString);
      if (!TextUtils.isEmpty(paramHashMap)) {
        paramc.a(Long.valueOf(paramHashMap));
      }
      return;
    }
    catch (NumberFormatException paramHashMap)
    {
      d.a("Could not parse \"" + paramString + "\" constant.");
    }
  }
  
  private void c(HashMap<String, String> paramHashMap, String paramString, k.c<String> paramc)
  {
    paramHashMap = (String)paramHashMap.get(paramString);
    if (!TextUtils.isEmpty(paramHashMap)) {
      paramc.a(paramHashMap);
    }
  }
  
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    ap localap = paramg.i();
    ao.a locala = (ao.a)((ao)localap.d.a()).b.a();
    c(paramHashMap, "as_domains", locala.a);
    c(paramHashMap, "bad_ad_report_path", locala.h);
    a(paramHashMap, "min_hwa_banner", locala.b);
    a(paramHashMap, "min_hwa_activation_overlay", locala.c);
    a(paramHashMap, "min_hwa_overlay", locala.d);
    c(paramHashMap, "mraid_banner_path", locala.e);
    c(paramHashMap, "mraid_expanded_banner_path", locala.f);
    c(paramHashMap, "mraid_interstitial_path", locala.g);
    b(paramHashMap, "ac_max_size", locala.i);
    b(paramHashMap, "ac_padding", locala.j);
    b(paramHashMap, "ac_total_quota", locala.k);
    b(paramHashMap, "db_total_quota", locala.l);
    b(paramHashMap, "db_quota_per_origin", locala.m);
    b(paramHashMap, "db_quota_step_size", locala.n);
    paramg = paramg.l();
    if (com.google.ads.e.a.a >= 11)
    {
      i.a(paramg.getSettings(), localap);
      i.a(paramWebView.getSettings(), localap);
    }
    boolean bool;
    int i;
    if (!((k)localap.g.a()).a())
    {
      bool = paramg.k();
      if (com.google.ads.e.a.a < ((Integer)locala.b.a()).intValue())
      {
        i = 1;
        if ((i != 0) || (!bool)) {
          break label432;
        }
        d.a("Re-enabling hardware acceleration for a banner after reading constants.");
        paramg.h();
      }
    }
    else
    {
      label292:
      paramg = (com.google.ads.b.a)localap.e.a();
      if ((!((k)localap.g.a()).b()) && (paramg != null))
      {
        bool = paramg.k();
        if (com.google.ads.e.a.a >= ((Integer)locala.c.a()).intValue()) {
          break label454;
        }
        i = 1;
        label354:
        if ((i != 0) || (!bool)) {
          break label460;
        }
        d.a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
        paramg.h();
      }
    }
    for (;;)
    {
      paramg = (String)locala.a.a();
      paramHashMap = (s)localap.s.a();
      if ((paramHashMap != null) && (!TextUtils.isEmpty(paramg))) {
        paramHashMap.a(paramg);
      }
      locala.o.a(Boolean.valueOf(true));
      return;
      i = 0;
      break;
      label432:
      if ((i == 0) || (bool)) {
        break label292;
      }
      d.a("Disabling hardware acceleration for a banner after reading constants.");
      paramg.g();
      break label292;
      label454:
      i = 0;
      break label354;
      label460:
      if ((i != 0) && (!bool))
      {
        d.a("Disabling hardware acceleration for an activation overlay after reading constants.");
        paramg.g();
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.az
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */