package com.example.lw.appline.com.google.ads.e;

import android.os.Build;

class f
{
  static final f d = new f();
  static final f e = new f("unknown", "generic", "generic");
  static final f f = new f("unknown", "generic_x86", "Android");
  public final String a;
  public final String b;
  public final String c;
  
  f()
  {
    this.a = Build.BOARD;
    this.b = Build.DEVICE;
    this.c = Build.BRAND;
  }
  
  f(String paramString1, String paramString2, String paramString3)
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
    if (!(paramObject instanceof f)) {}
    do
    {
      return false;
      paramObject = (f)paramObject;
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


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.e.f
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */