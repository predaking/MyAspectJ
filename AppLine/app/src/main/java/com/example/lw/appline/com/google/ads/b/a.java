package com.example.lw.appline.com.google.ads.b;

import android.os.Handler;
import com.google.ads.AdView;
import com.google.ads.ao;
import com.google.ads.ao.a;
import com.google.ads.ap;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;

public class a
  extends c
{
  private volatile boolean b = true;
  private boolean c = true;
  private int d = 0;
  private int e = 0;
  private final l f;
  
  public a(ap paramap)
  {
    super(paramap, null);
    ao.a locala = (ao.a)((ao)paramap.d.a()).b.a();
    if (com.google.ads.e.a.a < ((Integer)locala.c.a()).intValue())
    {
      com.google.ads.e.d.a("Disabling hardware acceleration for an activation overlay.");
      g();
    }
    this.f = l.a((g)paramap.b.a(), d.c, true, true);
    setWebViewClient(this.f);
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.e;
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    return false;
  }
  
  public boolean canScrollVertically(int paramInt)
  {
    return false;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public l e()
  {
    return this.f;
  }
  
  public void setOverlayActivated(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void setOverlayEnabled(boolean paramBoolean)
  {
    if (!paramBoolean) {
      ((Handler)ao.a().c.a()).post(new Runnable()
      {
        public void run()
        {
          ((AdView)a.this.a.j.a()).removeView(jdField_this);
        }
      }());
    }
    this.b = paramBoolean;
  }
  
  public void setXPosition(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void setYPosition(int paramInt)
  {
    this.e = paramInt;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.a
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */