package com.example.lw.appweb;

import com.opera.mini.android.ae;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public final class ak
  implements bo
{
  private HttpURLConnection Code;
  
  public ak(String paramString1, String paramString2, Proxy paramProxy)
  {
    if (ae.ae < 8) {
      System.setProperty("http.keepAlive", "false");
    }
    this.Code = ((HttpURLConnection)new URL(paramString1).openConnection(paramProxy));
    this.Code.setRequestMethod(paramString2);
    this.Code.setDoInput(true);
    this.Code.setInstanceFollowRedirects(false);
    if (!paramString2.equals("GET")) {
      this.Code.setDoOutput(true);
    }
    this.Code.setConnectTimeout(30000);
  }
  
  public final long B()
  {
    return this.Code.getContentLength();
  }
  
  public final DataOutputStream Code()
  {
    return new DataOutputStream(this.Code.getOutputStream());
  }
  
  public final String Code(String paramString)
  {
    return this.Code.getHeaderField(paramString);
  }
  
  public final void Code(String paramString1, String paramString2)
  {
    try
    {
      this.Code.setRequestProperty(paramString1, paramString2);
      return;
    }
    catch (IllegalStateException paramString1)
    {
      throw new IOException();
    }
  }
  
  public final DataInputStream I()
  {
    if (this.Code.getResponseCode() >= 400) {
      return new DataInputStream(this.Code.getErrorStream());
    }
    return new DataInputStream(this.Code.getInputStream());
  }
  
  public final int J()
  {
    return this.Code.getResponseCode();
  }
  
  public final void Z()
  {
    this.Code.disconnect();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ak
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */