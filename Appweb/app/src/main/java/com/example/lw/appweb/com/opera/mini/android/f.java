package com.example.lw.appweb.com.opera.mini.android;

import java.io.File;
import java.io.FilenameFilter;
import java.util.StringTokenizer;

final class f
  implements FilenameFilter
{
  private String[] Code;
  
  f(String paramString)
  {
    paramString = new StringTokenizer(paramString, "*");
    this.Code = new String[paramString.countTokens()];
    int i = 0;
    while (paramString.hasMoreTokens())
    {
      this.Code[i] = paramString.nextToken();
      i += 1;
    }
  }
  
  public final boolean accept(File paramFile, String paramString)
  {
    int i = -1;
    int j = 0;
    boolean bool = true;
    if ((bool) && (j < this.Code.length))
    {
      int k = paramString.indexOf(this.Code[j]);
      if (k > i) {}
      for (bool = true;; bool = false)
      {
        j += 1;
        i = k;
        break;
      }
    }
    return bool;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.f
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */