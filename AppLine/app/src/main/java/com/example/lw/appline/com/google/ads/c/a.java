package com.example.lw.appline.com.google.ads.c;

import android.content.Context;
import com.google.ads.c;

public class a
{
  private c a;
  private boolean b;
  private boolean c;
  
  public a(c paramc, Context paramContext, boolean paramBoolean)
  {
    this.a = paramc;
    this.c = paramBoolean;
    if (paramContext == null)
    {
      this.b = true;
      return;
    }
    this.b = paramc.b(paramContext);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.c.a
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */