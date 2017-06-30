package com.example.lw.appweb;

import java.io.DataInputStream;

final class ai
  extends av
{
  private static Object B = new Object();
  private static int J = -2147483648;
  private boolean C;
  
  ai(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString, paramInt1, paramInt2, null, true, 0, 0);
  }
  
  static void Z(int paramInt)
  {
    if (paramInt <= J) {
      return;
    }
    J = paramInt;
    synchronized (B)
    {
      B.notifyAll();
      return;
    }
  }
  
  public final void Code()
  {
    super.Code();
    synchronized (B)
    {
      B.notifyAll();
      return;
    }
  }
  
  protected final void I(DataInputStream paramDataInputStream)
  {
    ??? = new byte[2048];
    int i;
    if (!this.I)
    {
      i = paramDataInputStream.read((byte[])???);
      g.I.B();
      if (this.I) {
        g.I.C();
      }
    }
    label49:
    label178:
    label185:
    for (;;)
    {
      return;
      if (i < 0) {
        g.I.C();
      }
      for (;;)
      {
        if (this.I) {
          break label185;
        }
        if (!this.Z.r()) {}
        for (;;)
        {
          try
          {
            synchronized (B)
            {
              B.wait();
              g.I.B();
              if (!this.I) {
                break label178;
              }
              g.I.C();
              return;
              g.Z.b(g.Z.I((byte[])???, 0, i));
              g.Z.c(0);
              g.Z.c(i);
              Code(12);
              if (!this.C) {
                break;
              }
            }
            i = paramDataInputStream.read();
          }
          catch (InterruptedException paramDataInputStream)
          {
            return;
          }
          if (i < 0)
          {
            Code(504, "Server closed connection");
            return;
          }
          if (i != 0) {
            break label49;
          }
        }
        Code(16);
      }
    }
  }
  
  public final void Z()
  {
    this.C = true;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ai
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */