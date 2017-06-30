package com.example.lw.appkeys.com.samuel.app.wifihackpassword;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Calculate
{
  public String md5(String paramString)
  {
    String str2 = "";
    str1 = str2;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      str1 = str2;
      ((MessageDigest)localObject).reset();
      str1 = str2;
      ((MessageDigest)localObject).update(paramString.getBytes());
      str1 = str2;
      localObject = ((MessageDigest)localObject).digest();
      int i = 0;
      paramString = str2;
      for (;;)
      {
        str1 = paramString;
        if (i >= localObject.length) {
          return paramString;
        }
        str1 = paramString;
        paramString = paramString + Integer.toString((localObject[i] & 0xFF) + 256, 16).substring(1);
        i += 1;
      }
      return str1;
    }
    catch (NoSuchAlgorithmException paramString) {}
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.samuel.app.wifihackpassword.MD5Calculate
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */