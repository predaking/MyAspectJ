package com.example.lw.appweb.com.google.android.apps.analytics;

abstract interface HitStore
{
  public abstract void clearReferrer();
  
  public abstract void deleteHit(long paramLong);
  
  public abstract int getNumStoredHits();
  
  public abstract Referrer getReferrer();
  
  public abstract String getSessionId();
  
  public abstract int getStoreId();
  
  public abstract String getVisitorCustomVar(int paramInt);
  
  public abstract String getVisitorId();
  
  public abstract void loadExistingSession();
  
  public abstract Hit[] peekHits();
  
  public abstract Hit[] peekHits(int paramInt);
  
  public abstract void putEvent(Event paramEvent);
  
  public abstract void setAnonymizeIp(boolean paramBoolean);
  
  public abstract boolean setReferrer(String paramString);
  
  public abstract void setSampleRate(int paramInt);
  
  public abstract void startNewVisit();
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.analytics.HitStore
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */