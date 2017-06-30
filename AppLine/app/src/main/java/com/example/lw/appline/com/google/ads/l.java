package com.example.lw.appline.com.google.ads;

import android.content.Context;
import com.google.ads.e.a;
import com.google.ads.e.d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class l
  implements Runnable
{
  private final Context a;
  private final String b;
  
  public l(String paramString, Context paramContext)
  {
    this.b = paramString;
    this.a = paramContext;
  }
  
  protected HttpURLConnection a(URL paramURL)
    throws IOException
  {
    return (HttpURLConnection)paramURL.openConnection();
  }
  
  public void run()
  {
    try
    {
      d.a("Pinging URL: " + this.b);
      HttpURLConnection localHttpURLConnection = a(new URL(this.b));
      try
      {
        a.a(localHttpURLConnection, this.a);
        localHttpURLConnection.setInstanceFollowRedirects(true);
        localHttpURLConnection.connect();
        int i = localHttpURLConnection.getResponseCode();
        if ((i < 200) || (i >= 300)) {
          d.e("Did not receive 2XX (got " + i + ") from pinging URL: " + this.b);
        }
        return;
      }
      finally
      {
        localHttpURLConnection.disconnect();
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      d.d("Unable to ping the URL: " + this.b, localThrowable);
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.l
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */