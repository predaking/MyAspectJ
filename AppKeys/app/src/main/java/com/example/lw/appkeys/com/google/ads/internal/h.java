package com.example.lw.appkeys.com.google.ads.internal;

import android.content.Context;
import com.google.ads.AdSize;

public class h
{
  public static final h a = new h(null, true);
  private AdSize b;
  private final boolean c;
  
  private h(AdSize paramAdSize, boolean paramBoolean)
  {
    this.b = paramAdSize;
    this.c = paramBoolean;
  }
  
  public static h a(AdSize paramAdSize)
  {
    return a(paramAdSize, null);
  }
  
  public static h a(AdSize paramAdSize, Context paramContext)
  {
    return new h(AdSize.createAdSize(paramAdSize, paramContext), false);
  }
  
  public boolean a()
  {
    return this.c;
  }
  
  public AdSize b()
  {
    return this.b;
  }
  
  public void b(AdSize paramAdSize)
  {
    this.b = paramAdSize;
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.internal.h
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */