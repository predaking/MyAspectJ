package com.example.lw.appline.com.google.ads.b;

import android.content.Context;
import com.google.ads.ao;
import com.google.ads.ao.a;
import com.google.ads.e.a;
import com.google.ads.e.d;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class m
  implements Runnable
{
  private String a;
  private Context b;
  
  public m(String paramString, Context paramContext)
  {
    this.a = paramString;
    this.b = paramContext;
  }
  
  protected BufferedOutputStream a(HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    return new BufferedOutputStream(paramHttpURLConnection.getOutputStream());
  }
  
  protected HttpURLConnection a(URL paramURL)
    throws IOException
  {
    paramURL = (HttpURLConnection)paramURL.openConnection();
    paramURL.setDoOutput(true);
    paramURL.setInstanceFollowRedirects(true);
    a.a(paramURL, this.b);
    paramURL.setRequestProperty("Accept", "application/json");
    paramURL.setRequestProperty("Content-Type", "application/json");
    return paramURL;
  }
  
  public void run()
  {
    Object localObject1 = (String)((ao.a)ao.a().b.a()).h.a();
    try
    {
      localObject1 = a(new URL((String)localObject1));
      byte[] arrayOfByte = new a(this.a).a().toString().getBytes();
      ((HttpURLConnection)localObject1).setFixedLengthStreamingMode(arrayOfByte.length);
      try
      {
        BufferedOutputStream localBufferedOutputStream = a((HttpURLConnection)localObject1);
        localBufferedOutputStream.write(arrayOfByte);
        localBufferedOutputStream.close();
        if (((HttpURLConnection)localObject1).getResponseCode() != 200) {
          d.b("Got error response from BadAd backend: " + ((HttpURLConnection)localObject1).getResponseMessage());
        }
        return;
      }
      finally
      {
        ((HttpURLConnection)localObject1).disconnect();
      }
      return;
    }
    catch (IOException localIOException)
    {
      d.b("Error reporting bad ad.", localIOException);
    }
  }
  
  public static class a
  {
    private final String a;
    
    public a(String paramString)
    {
      this.a = paramString;
    }
    
    public JSONObject a()
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("debugHeader", this.a);
        return localJSONObject;
      }
      catch (JSONException localJSONException)
      {
        d.b("Could not build ReportAdJson from inputs.", localJSONException);
      }
      return localJSONObject;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.m
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */