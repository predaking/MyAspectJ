package com.example.lw.appline.com.google.ads;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class af
{
  private ae a = null;
  private long b = -1L;
  
  public void a(ae paramae, int paramInt)
  {
    this.a = paramae;
    this.b = (TimeUnit.MILLISECONDS.convert(paramInt, TimeUnit.SECONDS) + SystemClock.elapsedRealtime());
  }
  
  public boolean a()
  {
    return (this.a != null) && (SystemClock.elapsedRealtime() < this.b);
  }
  
  public ae b()
  {
    return this.a;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.af
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */