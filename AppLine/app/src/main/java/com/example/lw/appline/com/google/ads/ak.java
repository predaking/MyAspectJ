package com.example.lw.appline.com.google.ads;

import android.app.Activity;
import com.google.ads.b.k;
import com.google.ads.c.a;
import com.google.ads.c.b;
import com.google.ads.c.e;
import com.google.ads.c.g;
import com.google.ads.c.g.a;
import com.google.ads.c.h;
import com.google.ads.e.d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class ak
  implements Runnable
{
  private final aj a;
  private final String b;
  private final c c;
  private final HashMap<String, String> d;
  private final boolean e;
  private final WeakReference<Activity> f;
  
  public ak(aj paramaj, Activity paramActivity, String paramString, c paramc, HashMap<String, String> paramHashMap)
  {
    this.a = paramaj;
    this.b = paramString;
    this.f = new WeakReference(paramActivity);
    this.c = paramc;
    this.d = new HashMap(paramHashMap);
    this.e = a(this.d);
  }
  
  private <T extends h, U extends g> void a(b<T, U> paramb)
    throws g.a, ak.a, IllegalAccessException, InstantiationException
  {
    Activity localActivity = (Activity)this.f.get();
    if (localActivity == null) {
      throw new a("Activity became null while trying to instantiate adapter.");
    }
    this.a.a(paramb);
    Object localObject1 = paramb.c();
    if (localObject1 != null)
    {
      localObject1 = (g)((Class)localObject1).newInstance();
      ((g)localObject1).a(this.d);
    }
    for (;;)
    {
      Object localObject2 = paramb.b();
      if (localObject2 != null) {}
      for (localObject2 = (h)this.c.a((Class)localObject2);; localObject2 = null)
      {
        a locala = new a(this.c, localActivity, this.e);
        if (this.a.a.a())
        {
          if (!(paramb instanceof e)) {
            throw new a("Adapter " + this.b + " doesn't support the MediationInterstitialAdapter" + " interface.");
          }
          ((e)paramb).a(new am(this.a), localActivity, (g)localObject1, locala, (h)localObject2);
        }
        for (;;)
        {
          this.a.g();
          return;
          if (!(paramb instanceof com.google.ads.c.c)) {
            throw new a("Adapter " + this.b + " doesn't support the MediationBannerAdapter interface");
          }
          ((com.google.ads.c.c)paramb).a(new al(this.a), localActivity, (g)localObject1, this.a.a.c(), locala, (h)localObject2);
        }
      }
      localObject1 = null;
    }
  }
  
  private void a(String paramString, Throwable paramThrowable, ai.a parama)
  {
    d.b(paramString, paramThrowable);
    this.a.a(false, parama);
  }
  
  private static boolean a(Map<String, String> paramMap)
  {
    paramMap = (String)paramMap.remove("gwhirl_share_location");
    if ("1".equals(paramMap)) {
      return true;
    }
    if ((paramMap != null) && (!"0".equals(paramMap))) {
      d.b("Received an illegal value, '" + paramMap + "', for the special share location parameter from mediation server" + " (expected '0' or '1'). Will not share the location.");
    }
    return false;
  }
  
  public void run()
  {
    try
    {
      d.a("Trying to instantiate: " + this.b);
      a((b)ai.a(this.b, b.class));
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      a("Cannot find adapter class '" + this.b + "'. Did you link the ad network's mediation adapter? Skipping ad network.", localClassNotFoundException, ai.a.e);
      return;
    }
    catch (Throwable localThrowable)
    {
      a("Error while creating adapter and loading ad from ad network. Skipping ad network.", localThrowable, ai.a.f);
    }
  }
  
  private static class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ak
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */