package com.example.lw.appline.com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;

public class s
{
  private String a = "googleads.g.doubleclick.net";
  private String b = "/pagead/ads";
  private String[] c = { ".doubleclick.net", ".googleadservices.com", ".googlesyndication.com" };
  private p d;
  private o e = new o();
  
  public s(p paramp)
  {
    this.d = paramp;
  }
  
  private Uri a(Uri paramUri, Context paramContext, String paramString, boolean paramBoolean)
    throws t
  {
    try
    {
      if (paramUri.getQueryParameter("ms") != null) {
        throw new t("Query parameter already exists: ms");
      }
    }
    catch (UnsupportedOperationException paramUri)
    {
      throw new t("Provided Uri is not in a valid state");
    }
    if (paramBoolean) {}
    for (paramContext = this.d.a(paramContext, paramString);; paramContext = this.d.a(paramContext)) {
      return a(paramUri, "ms", paramContext);
    }
  }
  
  private Uri a(Uri paramUri, String paramString1, String paramString2)
    throws UnsupportedOperationException
  {
    String str = paramUri.toString();
    int j = str.indexOf("&adurl");
    int i = j;
    if (j == -1) {
      i = str.indexOf("?adurl");
    }
    if (i != -1) {
      return Uri.parse(str.substring(0, i + 1) + paramString1 + "=" + paramString2 + "&" + str.substring(i + 1));
    }
    return paramUri.buildUpon().appendQueryParameter(paramString1, paramString2).build();
  }
  
  public Uri a(Uri paramUri, Context paramContext)
    throws t
  {
    try
    {
      paramUri = a(paramUri, paramContext, paramUri.getQueryParameter("ai"), true);
      return paramUri;
    }
    catch (UnsupportedOperationException paramUri)
    {
      throw new t("Provided Uri is not in a valid state");
    }
  }
  
  public void a(String paramString)
  {
    this.c = paramString.split(",");
  }
  
  public boolean a(Uri paramUri)
  {
    boolean bool2 = false;
    if (paramUri == null) {
      throw new NullPointerException();
    }
    try
    {
      paramUri = paramUri.getHost();
      String[] arrayOfString = this.c;
      int j = arrayOfString.length;
      int i = 0;
      for (;;)
      {
        boolean bool1 = bool2;
        if (i < j)
        {
          bool1 = paramUri.endsWith(arrayOfString[i]);
          if (bool1) {
            bool1 = true;
          }
        }
        else
        {
          return bool1;
        }
        i += 1;
      }
      return false;
    }
    catch (NullPointerException paramUri) {}
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.s
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */