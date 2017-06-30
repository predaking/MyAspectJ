package com.example.lw.appline.com.google.a.a.a;

import java.util.HashMap;
import java.util.Map;

class x
{
  private Map<String, b> a = new HashMap();
  
  b a(String paramString)
  {
    if (paramString.startsWith("&")) {
      return new b(paramString.substring(1), null, null);
    }
    String str = paramString;
    if (paramString.contains("*")) {
      str = paramString.substring(0, paramString.indexOf("*"));
    }
    return (b)this.a.get(str);
  }
  
  public void a(String paramString1, String paramString2, String paramString3, a parama)
  {
    this.a.put(paramString1, new b(paramString2, paramString3, parama));
  }
  
  public static abstract interface a
  {
    public abstract String a(String paramString);
  }
  
  public static class b
  {
    private final String a;
    private final String b;
    private final x.a c;
    
    public b(String paramString1, String paramString2, x.a parama)
    {
      this.a = paramString1;
      this.b = paramString2;
      this.c = parama;
    }
    
    public String a()
    {
      return this.b;
    }
    
    public String a(String paramString)
    {
      Object localObject = null;
      if (paramString.contains("*"))
      {
        String str = this.a;
        String[] arrayOfString = paramString.split("\\*");
        paramString = localObject;
        if (arrayOfString.length > 1) {}
        try
        {
          int i = Integer.parseInt(arrayOfString[1]);
          paramString = str + i;
          return paramString;
        }
        catch (NumberFormatException paramString)
        {
          w.h("Unable to parse slot for url parameter " + str);
          return null;
        }
      }
      return this.a;
    }
    
    public x.a b()
    {
      return this.c;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.x
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */