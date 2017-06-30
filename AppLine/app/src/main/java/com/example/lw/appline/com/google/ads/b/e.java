package com.example.lw.appline.com.google.ads.b;

import com.google.ads.e.d;

public final class e
  extends Exception
{
  public final boolean a;
  
  public e(String paramString, boolean paramBoolean)
  {
    super(paramString);
    this.a = paramBoolean;
  }
  
  public e(String paramString, boolean paramBoolean, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
    this.a = paramBoolean;
  }
  
  public void a(String paramString)
  {
    d.b(c(paramString));
    d.a(null, this);
  }
  
  public void b(String paramString)
  {
    String str = c(paramString);
    if (this.a) {}
    for (paramString = this;; paramString = null) {
      throw new RuntimeException(str, paramString);
    }
  }
  
  public String c(String paramString)
  {
    String str = paramString;
    if (this.a) {
      str = paramString + ": " + getMessage();
    }
    return str;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.e
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */