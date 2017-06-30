package com.example.lw.appweb.com.google.android.apps.analytics;

abstract interface Dispatcher
{
  public abstract void dispatchHits(Hit[] paramArrayOfHit);
  
  public abstract void init(Callbacks paramCallbacks);
  
  public abstract boolean isDryRun();
  
  public abstract void setDryRun(boolean paramBoolean);
  
  public abstract void stop();
  
  public static abstract interface Callbacks
  {
    public abstract void dispatchFinished();
    
    public abstract void hitDispatched(long paramLong);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.analytics.Dispatcher
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */