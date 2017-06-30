package com.example.lw.appweb;

import java.io.DataInputStream;
import java.io.EOFException;

abstract class t
  extends Thread
{
  protected String Code;
  protected boolean I;
  private int Z;
  
  t(String paramString, int paramInt)
  {
    this.Code = paramString;
    this.Z = g.I(paramInt);
    g.Code(this);
  }
  
  protected static String I(int paramInt)
  {
    if (paramInt == 0) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    int i = g.Z.n(paramInt);
    g.Z.Code(paramInt, i);
    paramInt = 0;
    while (paramInt < i / 2)
    {
      if (localStringBuffer.length() != 0) {
        localStringBuffer.append('\n');
      }
      localStringBuffer.append(g.Z.f(g.Z.I[(paramInt * 2 + 0)]));
      localStringBuffer.append(':');
      localStringBuffer.append(g.Z.f(g.Z.I[(paramInt * 2 + 0 + 1)]));
      paramInt += 1;
    }
    return localStringBuffer.toString();
  }
  
  protected int Code(Exception paramException)
  {
    return 0;
  }
  
  public void Code()
  {
    this.I = true;
  }
  
  protected final void Code(int paramInt)
  {
    if (this.Z != 0) {
      g.I.Code(g.Z(this.Z), paramInt);
    }
  }
  
  protected void Code(int paramInt, String paramString)
  {
    g.I.B();
    if (this.I)
    {
      g.I.C();
      return;
    }
    aw localaw1 = g.Z;
    aw localaw2 = g.Z;
    if (paramString != null) {}
    for (;;)
    {
      localaw1.b(localaw2.Code(paramString));
      g.Z.c(paramInt);
      Code(14);
      return;
      paramString = "Unspecified error";
    }
  }
  
  protected String I(Exception paramException)
  {
    String str = paramException.getMessage();
    if (str != null) {
      return str;
    }
    return paramException.toString();
  }
  
  protected abstract void I();
  
  protected void I(DataInputStream paramDataInputStream)
  {
    byte[] arrayOfByte = new byte[2048];
    for (;;)
    {
      if (!this.I) {}
      try
      {
        i = paramDataInputStream.read(arrayOfByte);
        g.I.B();
        if (this.I)
        {
          g.I.C();
          return;
        }
      }
      catch (EOFException localEOFException)
      {
        int i;
        for (;;)
        {
          i = -1;
        }
        if (i <= 0)
        {
          Code(13);
          return;
        }
        g.Z.b(g.Z.I(arrayOfByte, 0, i));
        g.Z.c(0);
        g.Z.c(i);
        Code(12);
      }
    }
  }
  
  public void run()
  {
    try
    {
      I();
      g.J(this.Z);
      g.I(this);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (!this.I) {
          Code(Code(localException), I(localException));
        }
      }
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     t
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */