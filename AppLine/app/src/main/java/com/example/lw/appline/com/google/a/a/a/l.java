package com.example.lw.appline.com.google.a.a.a;

public class l
  implements Thread.UncaughtExceptionHandler
{
  private final Thread.UncaughtExceptionHandler a;
  private final ag b;
  private final ac c;
  private k d;
  
  public l(ag paramag, ac paramac, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    if (paramag == null) {
      throw new NullPointerException("tracker cannot be null");
    }
    if (paramac == null) {
      throw new NullPointerException("serviceManager cannot be null");
    }
    this.a = paramUncaughtExceptionHandler;
    this.b = paramag;
    this.c = paramac;
    paramac = new StringBuilder().append("ExceptionReporter created, original handler is ");
    if (paramUncaughtExceptionHandler == null) {}
    for (paramag = "null";; paramag = paramUncaughtExceptionHandler.getClass().getName())
    {
      w.e(paramag);
      return;
    }
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (this.d == null)
    {
      str = paramThrowable.getMessage();
      w.e("Tracking Exception: " + str);
      this.b.a(str, true);
      this.c.c();
      if (this.a != null)
      {
        w.e("Passing exception to original handler.");
        this.a.uncaughtException(paramThread, paramThrowable);
      }
      return;
    }
    if (paramThread != null) {}
    for (String str = paramThread.getName();; str = null)
    {
      str = this.d.a(str, paramThrowable);
      break;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.l
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */