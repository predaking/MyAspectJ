package com.example.lw.appline.com.google.a.a.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

class ae
  implements i
{
  private final String a;
  private final v b;
  private final Context c;
  
  ae(e parame, v paramv, Context paramContext)
  {
    this(paramv, paramContext);
  }
  
  ae(v paramv, Context paramContext)
  {
    this.c = paramContext.getApplicationContext();
    this.a = a("GoogleAnalytics", "2.0", VERSION.RELEASE, ai.a(Locale.getDefault()), Build.MODEL, Build.ID);
    this.b = paramv;
  }
  
  private URL a(t paramt)
  {
    if (TextUtils.isEmpty(paramt.d())) {
      return null;
    }
    try
    {
      paramt = new URL(paramt.d());
      return paramt;
    }
    catch (MalformedURLException paramt)
    {
      try
      {
        paramt = new URL("http://www.google-analytics.com/collect");
        return paramt;
      }
      catch (MalformedURLException paramt) {}
    }
    return null;
  }
  
  private HttpEntityEnclosingRequest a(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      w.h("Empty hit, discarding.");
      return null;
    }
    String str = paramString2 + "?" + paramString1;
    if (str.length() < 2036) {
      paramString1 = new BasicHttpEntityEnclosingRequest("GET", str);
    }
    for (;;)
    {
      paramString1.addHeader("User-Agent", this.a);
      return paramString1;
      paramString2 = new BasicHttpEntityEnclosingRequest("POST", paramString2);
      try
      {
        paramString2.setEntity(new StringEntity(paramString1));
        paramString1 = paramString2;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        w.h("Encoding error, discarding hit");
      }
    }
    return null;
  }
  
  private void a(boolean paramBoolean, HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    StringBuffer localStringBuffer;
    Object localObject;
    int i;
    if (paramBoolean)
    {
      localStringBuffer = new StringBuffer();
      localObject = paramHttpEntityEnclosingRequest.getAllHeaders();
      int j = localObject.length;
      i = 0;
      while (i < j)
      {
        localStringBuffer.append(localObject[i].toString()).append("\n");
        i += 1;
      }
      localStringBuffer.append(paramHttpEntityEnclosingRequest.getRequestLine().toString()).append("\n");
      if (paramHttpEntityEnclosingRequest.getEntity() == null) {}
    }
    try
    {
      paramHttpEntityEnclosingRequest = paramHttpEntityEnclosingRequest.getEntity().getContent();
      if (paramHttpEntityEnclosingRequest != null)
      {
        i = paramHttpEntityEnclosingRequest.available();
        if (i > 0)
        {
          localObject = new byte[i];
          paramHttpEntityEnclosingRequest.read((byte[])localObject);
          localStringBuffer.append("POST:\n");
          localStringBuffer.append(new String((byte[])localObject)).append("\n");
        }
      }
      w.d(localStringBuffer.toString());
      return;
    }
    catch (IOException paramHttpEntityEnclosingRequest)
    {
      for (;;)
      {
        w.h("Error Writing hit to log...");
      }
    }
  }
  
  public int a(List<t> paramList)
  {
    int k = Math.min(paramList.size(), 40);
    int j = 0;
    int i = 0;
    if (j < k)
    {
      HttpClient localHttpClient = this.b.a();
      Object localObject1 = (t)paramList.get(j);
      Object localObject2 = a((t)localObject1);
      if (localObject2 == null)
      {
        if (w.a()) {
          w.h("No destination: discarding hit: " + ((t)localObject1).a());
        }
        for (;;)
        {
          i += 1;
          j += 1;
          break;
          w.h("No destination: discarding hit.");
        }
      }
      HttpHost localHttpHost = new HttpHost(((URL)localObject2).getHost(), ((URL)localObject2).getPort(), ((URL)localObject2).getProtocol());
      localObject2 = ((URL)localObject2).getPath();
      if (TextUtils.isEmpty(((t)localObject1).a())) {}
      for (localObject1 = "";; localObject1 = u.a((t)localObject1, System.currentTimeMillis()))
      {
        localObject2 = a((String)localObject1, (String)localObject2);
        if (localObject2 != null) {
          break label193;
        }
        i += 1;
        break;
      }
      label193:
      ((HttpEntityEnclosingRequest)localObject2).addHeader("Host", localHttpHost.toHostString());
      a(w.a(), (HttpEntityEnclosingRequest)localObject2);
      if (((String)localObject1).length() > 8192) {
        w.h("Hit too long (> 8192 bytes)--not sent");
      }
      for (;;)
      {
        i += 1;
        break;
        try
        {
          localObject1 = localHttpClient.execute(localHttpHost, (HttpRequest)localObject2);
          if (((HttpResponse)localObject1).getStatusLine().getStatusCode() != 200)
          {
            w.h("Bad response: " + ((HttpResponse)localObject1).getStatusLine().getStatusCode());
            return i;
          }
        }
        catch (ClientProtocolException localClientProtocolException)
        {
          w.h("ClientProtocolException sending hit; discarding hit...");
        }
        catch (IOException paramList)
        {
          w.h("Exception sending hit: " + paramList.getClass().getSimpleName());
          w.h(paramList.getMessage());
          return i;
        }
      }
    }
    return i;
  }
  
  String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
  }
  
  public boolean a()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.c.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
    {
      w.g("...no network connectivity");
      return false;
    }
    return true;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.ae
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */