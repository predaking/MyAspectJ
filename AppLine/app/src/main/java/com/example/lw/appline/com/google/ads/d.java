package com.example.lw.appline.com.google.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class d
{
  public static final d a = new d(-1, -2, "mb");
  public static final d b = new d(320, 50, "mb");
  public static final d c = new d(300, 250, "as");
  public static final d d = new d(468, 60, "as");
  public static final d e = new d(728, 90, "as");
  public static final d f = new d(160, 600, "as");
  private final int g;
  private final int h;
  private boolean i;
  private boolean j;
  private boolean k;
  private String l;
  
  public d(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, null);
    if (f())
    {
      this.k = false;
      this.l = "mb";
      return;
    }
    this.k = true;
  }
  
  private d(int paramInt1, int paramInt2, String paramString)
  {
    this.g = paramInt1;
    this.h = paramInt2;
    this.l = paramString;
    if (paramInt1 == -1)
    {
      bool1 = true;
      this.i = bool1;
      if (paramInt2 != -2) {
        break label64;
      }
    }
    label64:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.j = bool1;
      this.k = false;
      return;
      bool1 = false;
      break;
    }
  }
  
  private static int a(Context paramContext)
  {
    paramContext = paramContext.getResources().getDisplayMetrics();
    return (int)(paramContext.widthPixels / paramContext.density);
  }
  
  public static d a(d paramd, Context paramContext)
  {
    if ((paramContext == null) || (!paramd.f()))
    {
      paramContext = paramd;
      if (paramd.f()) {
        paramContext = b;
      }
      return paramContext;
    }
    int m;
    if (paramd.i)
    {
      m = a(paramContext);
      if (!paramd.j) {
        break label98;
      }
    }
    label98:
    for (int n = b(paramContext);; n = paramd.b())
    {
      paramContext = new d(m, n, paramd.l);
      paramContext.j = paramd.j;
      paramContext.i = paramd.i;
      paramContext.k = paramd.k;
      return paramContext;
      m = paramd.a();
      break;
    }
  }
  
  private static int b(Context paramContext)
  {
    paramContext = paramContext.getResources().getDisplayMetrics();
    int m = (int)(paramContext.heightPixels / paramContext.density);
    if (m <= 400) {
      return 32;
    }
    if (m <= 720) {
      return 50;
    }
    return 90;
  }
  
  private boolean f()
  {
    return (this.g < 0) || (this.h < 0);
  }
  
  public int a()
  {
    if (this.g < 0) {
      throw new UnsupportedOperationException("Ad size was not set before getWidth() was called.");
    }
    return this.g;
  }
  
  public int b()
  {
    if (this.h < 0) {
      throw new UnsupportedOperationException("Ad size was not set before getHeight() was called.");
    }
    return this.h;
  }
  
  public boolean c()
  {
    return this.i;
  }
  
  public boolean d()
  {
    return this.j;
  }
  
  public boolean e()
  {
    return this.k;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d)) {}
    do
    {
      return false;
      paramObject = (d)paramObject;
    } while ((this.g != paramObject.g) || (this.h != paramObject.h));
    return true;
  }
  
  public int hashCode()
  {
    return Integer.valueOf(this.g).hashCode() << 16 | Integer.valueOf(this.h).hashCode() & 0xFFFF;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(a()).append("x").append(b());
    if (this.l == null) {}
    for (String str = "";; str = "_" + this.l) {
      return str;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.d
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */