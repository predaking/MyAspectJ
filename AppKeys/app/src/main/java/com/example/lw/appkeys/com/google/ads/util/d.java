package com.example.lw.appkeys.com.google.ads.util;

import android.os.Build;

class d
{
  static final d d = new d();
  static final d e = new d("unknown", "generic", "generic");
  public final String a;
  public final String b;
  public final String c;
  
  d()
  {
    this.a = Build.BOARD;
    this.b = Build.DEVICE;
    this.c = Build.BRAND;
  }
  
  d(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    if (paramString1 != null) {
      return paramString1.equals(paramString2);
    }
    return paramString1 == paramString2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d)) {}
    do
    {
      return false;
      paramObject = (d)paramObject;
    } while ((!a(this.a, paramObject.a)) || (!a(this.b, paramObject.b)) || (!a(this.c, paramObject.c)));
    return true;
  }
  
  public int hashCode()
  {
    int j = 0;
    if (this.a != null) {
      j = 0 + this.a.hashCode();
    }
    int i = j;
    if (this.b != null) {
      i = j + this.b.hashCode();
    }
    j = i;
    if (this.c != null) {
      j = i + this.c.hashCode();
    }
    return j;
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.util.d
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */