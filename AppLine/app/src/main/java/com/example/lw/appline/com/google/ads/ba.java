package com.example.lw.appline.com.google.ads;

import android.webkit.WebView;
import com.google.ads.b.g;
import com.google.ads.e.d;
import java.util.HashMap;

public class ba
  implements aq
{
  public void a(g paramg, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    paramg = (String)paramHashMap.get("string");
    paramHashMap = (String)paramHashMap.get("afma_notify_dt");
    d.c("Received log message: <\"string\": \"" + paramg + "\", \"afmaNotifyDt\": \"" + paramHashMap + "\">");
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ba
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */