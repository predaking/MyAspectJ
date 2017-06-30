package com.example.lw.appline.com.google.ads;

import com.google.ads.b.g;
import com.google.ads.e.d;
import java.lang.ref.WeakReference;

public class m
  implements Runnable
{
  private WeakReference<g> a;
  
  public m(g paramg)
  {
    this.a = new WeakReference(paramg);
  }
  
  public void run()
  {
    g localg = (g)this.a.get();
    if (localg == null)
    {
      d.a("The ad must be gone, so cancelling the refresh timer.");
      return;
    }
    localg.y();
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.m
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */