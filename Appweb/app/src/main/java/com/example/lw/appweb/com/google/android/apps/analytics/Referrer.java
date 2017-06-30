package com.example.lw.appweb.com.google.android.apps.analytics;

class Referrer
{
  private final int index;
  private final String referrer;
  private final long timeStamp;
  private final int visit;
  
  Referrer(String paramString, long paramLong, int paramInt1, int paramInt2)
  {
    this.referrer = paramString;
    this.timeStamp = paramLong;
    this.visit = paramInt1;
    this.index = paramInt2;
  }
  
  int getIndex()
  {
    return this.index;
  }
  
  String getReferrerString()
  {
    return this.referrer;
  }
  
  long getTimeStamp()
  {
    return this.timeStamp;
  }
  
  int getVisit()
  {
    return this.visit;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.google.android.apps.analytics.Referrer
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */