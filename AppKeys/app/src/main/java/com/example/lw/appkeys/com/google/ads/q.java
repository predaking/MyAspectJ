package com.example.lw.appkeys.com.google.ads;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.internal.d;
import com.google.ads.internal.g;
import com.google.ads.util.b;
import java.util.HashMap;
import java.util.Locale;

public class q
  extends t
{
  public void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    Object localObject1 = (String)paramHashMap.get("u");
    if (localObject1 == null)
    {
      b.e("Could not get URL from click gmsg.");
      return;
    }
    g localg = paramd.m();
    if (localg != null)
    {
      localObject1 = Uri.parse((String)localObject1);
      String str = ((Uri)localObject1).getHost();
      if ((str != null) && (str.toLowerCase(Locale.US).endsWith(".admob.com")))
      {
        str = null;
        Object localObject2 = ((Uri)localObject1).getPath();
        localObject1 = str;
        if (localObject2 != null)
        {
          localObject2 = ((String)localObject2).split("/");
          localObject1 = str;
          if (localObject2.length >= 4) {
            localObject1 = localObject2[2] + "/" + localObject2[3];
          }
        }
        localg.b((String)localObject1);
      }
    }
    super.a(paramd, paramHashMap, paramWebView);
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.q
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */