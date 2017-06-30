package com.example.lw.appweb;

public final class a
  implements Runnable
{
  private String Code;
  
  a(String paramString)
  {
    this.Code = paramString;
  }
  
  public final void run()
  {
    for (;;)
    {
      int i;
      try
      {
        ak localak = g.Code.Code(this.Code, null, "GET");
        if (ap.b) {
          localak.Code("Test-Header", "debug");
        }
        b.Code(localak.I());
        i = localak.J();
        if ((i >= 301) && (i <= 303))
        {
          this.Code = localak.Code("Location");
          run();
          localak.Z();
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        return;
      }
      if (i != 307) {}
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     a
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */