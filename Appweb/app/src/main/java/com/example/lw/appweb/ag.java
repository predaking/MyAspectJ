package com.example.lw.appweb;

import java.io.IOException;

public final class ag
{
  private String Code;
  private String I;
  
  public ag(String paramString1, String paramString2)
  {
    this.Code = paramString1;
    this.I = I(paramString2);
  }
  
  private static String I(String paramString)
  {
    String str = paramString;
    if (!paramString.startsWith("file://"))
    {
      str = paramString;
      if (!paramString.startsWith("/")) {
        str = "/" + paramString;
      }
      str = "file://" + str;
    }
    return str;
  }
  
  public final String Code()
  {
    return this.Code;
  }
  
  public final boolean Code(String paramString)
  {
    if ((this.I == null) || (paramString == null)) {
      return (this.I == null) && (paramString == null);
    }
    return this.I.equals(I(paramString));
  }
  
  public final String I()
  {
    return this.I;
  }
  
  public final boolean J()
  {
    Object localObject3 = null;
    Object localObject1 = null;
    try
    {
      bu localbu = g.c.Code(this.I, false, 2);
      localObject1 = localbu;
      localObject3 = localbu;
      boolean bool = localbu.B();
      return bool;
    }
    catch (IOException localIOException)
    {
      return false;
    }
    finally
    {
      b.Code(localIOException);
    }
  }
  
  public final boolean Z()
  {
    Object localObject3 = null;
    Object localObject1 = null;
    try
    {
      bu localbu = g.c.Code(this.I, false, 1);
      localObject1 = localbu;
      localObject3 = localbu;
      boolean bool = localbu.J();
      return bool;
    }
    catch (IOException localIOException)
    {
      return false;
    }
    finally
    {
      b.Code(localIOException);
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ag
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */