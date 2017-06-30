package com.example.lw.appline.com.google.ads.d;

import android.content.Context;
import android.graphics.Color;
import com.google.ads.c;
import java.util.Locale;
import java.util.Map;

public class a
  extends c
{
  private String b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private String i;
  private int j;
  private int k;
  private a l;
  private int m;
  private String n;
  
  private String a(int paramInt)
  {
    return String.format(Locale.US, "#%06x", new Object[] { Integer.valueOf(0xFFFFFF & paramInt) });
  }
  
  public Map<String, Object> a(Context paramContext)
  {
    com.google.ads.c.a.a locala2 = (com.google.ads.c.a.a)a(com.google.ads.c.a.a.class);
    com.google.ads.c.a.a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = new com.google.ads.c.a.a();
      a(locala1);
    }
    if (this.b != null) {
      locala1.d().put("q", this.b);
    }
    if (Color.alpha(this.c) != 0) {
      locala1.d().put("bgcolor", a(this.c));
    }
    if ((Color.alpha(this.d) == 255) && (Color.alpha(this.e) == 255))
    {
      locala1.d().put("gradientfrom", a(this.d));
      locala1.d().put("gradientto", a(this.e));
    }
    if (Color.alpha(this.f) != 0) {
      locala1.d().put("hcolor", a(this.f));
    }
    if (Color.alpha(this.g) != 0) {
      locala1.d().put("dcolor", a(this.g));
    }
    if (Color.alpha(this.h) != 0) {
      locala1.d().put("acolor", a(this.h));
    }
    if (this.i != null) {
      locala1.d().put("font", this.i);
    }
    locala1.d().put("headersize", Integer.toString(this.j));
    if (Color.alpha(this.k) != 0) {
      locala1.d().put("bcolor", a(this.k));
    }
    if (this.l != null) {
      locala1.d().put("btype", this.l.toString());
    }
    locala1.d().put("bthick", Integer.toString(this.m));
    if (this.n != null) {
      locala1.d().put("channel", this.n);
    }
    return super.a(paramContext);
  }
  
  public static enum a
  {
    private String e;
    
    private a(String paramString)
    {
      this.e = paramString;
    }
    
    public String toString()
    {
      return this.e;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.d.a
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */