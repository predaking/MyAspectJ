package com.example.lw.appline.com.google.a.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

class aa
  implements z
{
  private final Context a;
  
  public aa(Context paramContext)
  {
    if (paramContext == null) {
      throw new NullPointerException("Context cannot be null");
    }
    this.a = paramContext.getApplicationContext();
  }
  
  private int a(String paramString1, String paramString2)
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.getResources().getIdentifier(paramString1, paramString2, this.a.getPackageName());
  }
  
  public int a(String paramString, int paramInt)
  {
    int i = a(paramString, "integer");
    if (i == 0) {
      return paramInt;
    }
    try
    {
      int j = Integer.parseInt(this.a.getString(i));
      return j;
    }
    catch (NumberFormatException paramString)
    {
      w.h("NumberFormatException parsing " + this.a.getString(i));
    }
    return paramInt;
  }
  
  public String a(String paramString)
  {
    int i = a(paramString, "string");
    if (i == 0) {
      return null;
    }
    return this.a.getString(i);
  }
  
  public Double b(String paramString)
  {
    paramString = a(paramString);
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    try
    {
      double d = Double.parseDouble(paramString);
      return Double.valueOf(d);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      w.h("NumberFormatException parsing " + paramString);
    }
    return null;
  }
  
  public boolean c(String paramString)
  {
    int i = a(paramString, "bool");
    if (i == 0) {
      return false;
    }
    return "true".equalsIgnoreCase(this.a.getString(i));
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.aa
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */