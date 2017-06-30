package com.example.lw.appkeys.com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

public class MediationAdRequest
{
  private AdRequest a;
  private boolean b;
  private boolean c;
  
  public MediationAdRequest(AdRequest paramAdRequest, Context paramContext, boolean paramBoolean)
  {
    this.a = paramAdRequest;
    this.c = paramBoolean;
    if (paramContext == null)
    {
      this.b = true;
      return;
    }
    this.b = paramAdRequest.isTestDevice(paramContext);
  }
  
  public Integer getAgeInYears()
  {
    if (this.a.getBirthday() != null)
    {
      Calendar localCalendar1 = Calendar.getInstance();
      Calendar localCalendar2 = Calendar.getInstance();
      localCalendar1.setTime(this.a.getBirthday());
      Integer localInteger2 = Integer.valueOf(localCalendar2.get(1) - localCalendar1.get(1));
      Integer localInteger1 = localInteger2;
      if (localCalendar2.get(6) < localCalendar1.get(6)) {
        localInteger1 = Integer.valueOf(localInteger2.intValue() - 1);
      }
      return localInteger1;
    }
    return null;
  }
  
  public Date getBirthday()
  {
    return this.a.getBirthday();
  }
  
  public AdRequest.Gender getGender()
  {
    return this.a.getGender();
  }
  
  public Set<String> getKeywords()
  {
    if (this.a.getKeywords() == null) {
      return null;
    }
    return Collections.unmodifiableSet(this.a.getKeywords());
  }
  
  public Location getLocation()
  {
    if ((this.a.getLocation() == null) || (!this.c)) {
      return null;
    }
    return new Location(this.a.getLocation());
  }
  
  public boolean isTesting()
  {
    return this.b;
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.MediationAdRequest
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */