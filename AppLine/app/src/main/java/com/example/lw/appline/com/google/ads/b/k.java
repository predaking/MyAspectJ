package com.example.lw.appline.com.google.ads.b;

import android.content.Context;
import com.google.ads.d;

public class k
{
  public static final k a = new k(null, true);
  private d b;
  private boolean c;
  private final boolean d;
  
  private k(d paramd, boolean paramBoolean)
  {
    this.b = paramd;
    this.d = paramBoolean;
  }
  
  public static k a(d paramd)
  {
    return a(paramd, null);
  }
  
  public static k a(d paramd, Context paramContext)
  {
    return new k(d.a(paramd, paramContext), false);
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public boolean a()
  {
    return this.d;
  }
  
  public void b(d paramd)
  {
    if (!this.d) {
      this.b = paramd;
    }
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public d c()
  {
    return this.b;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.k
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */