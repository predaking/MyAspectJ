package com.example.lw.appline.com.google.a.a.a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class u
{
  static String a(t paramt, long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramt.a());
    if (paramt.c() > 0L)
    {
      paramLong -= paramt.c();
      if (paramLong >= 0L) {
        localStringBuilder.append("&").append("qt").append("=").append(paramLong);
      }
    }
    localStringBuilder.append("&").append("z").append("=").append(paramt.b());
    return localStringBuilder.toString();
  }
  
  static String a(String paramString)
  {
    try
    {
      String str = URLEncoder.encode(paramString, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError("URL encoding failed for: " + paramString);
    }
  }
  
  static Map<String, String> a(x paramx, Map<String, String> paramMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Entry)localIterator.next();
      x.b localb = paramx.a((String)paramMap.getKey());
      if (localb != null)
      {
        String str2 = localb.a((String)paramMap.getKey());
        if (str2 != null)
        {
          String str1 = (String)paramMap.getValue();
          paramMap = str1;
          if (localb.b() != null) {
            paramMap = localb.b().a(str1);
          }
          if ((paramMap != null) && (!paramMap.equals(localb.a()))) {
            localHashMap.put(str2, paramMap);
          }
        }
      }
    }
    return localHashMap;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.u
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */