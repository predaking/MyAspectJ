package com.example.lw.appkeys.com.samuel.app.wifihackpassword;

public class Element
{
  private String power_signal;
  private String security;
  private String ssid;
  
  public Element(String paramString1, String paramString2, String paramString3)
  {
    this.ssid = paramString1;
    this.security = paramString2;
    this.power_signal = paramString3;
  }
  
  public String getPower()
  {
    return this.power_signal;
  }
  
  public String getSSID()
  {
    return this.ssid;
  }
  
  public String getSecurity()
  {
    return this.security;
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.samuel.app.wifihackpassword.Element
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */