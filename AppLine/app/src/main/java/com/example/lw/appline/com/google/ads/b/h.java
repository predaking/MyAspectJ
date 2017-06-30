package com.example.lw.appline.com.google.ads.b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

public class h
{
  private final String a;
  private HashMap<String, String> b;
  
  public h(Bundle paramBundle)
  {
    this.a = paramBundle.getString("action");
    this.b = a(paramBundle.getSerializable("params"));
  }
  
  public h(String paramString)
  {
    this.a = paramString;
  }
  
  public h(String paramString, HashMap<String, String> paramHashMap)
  {
    this(paramString);
    this.b = paramHashMap;
  }
  
  private HashMap<String, String> a(Serializable paramSerializable)
  {
    if ((paramSerializable instanceof HashMap)) {
      return (HashMap)paramSerializable;
    }
    return null;
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("action", this.a);
    localBundle.putSerializable("params", this.b);
    return localBundle;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public HashMap<String, String> c()
  {
    return this.b;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.b.h
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */