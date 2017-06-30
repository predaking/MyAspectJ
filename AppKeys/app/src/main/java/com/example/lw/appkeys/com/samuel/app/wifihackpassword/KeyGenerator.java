package com.example.lw.appkeys.com.samuel.app.wifihackpassword;

public class KeyGenerator
{
  MD5Calculate obtenerMd5;
  
  public String calcularClave(String paramString1, String paramString2)
  {
    this.obtenerMd5 = new MD5Calculate();
    String str = paramString2.substring(0, 8);
    paramString1 = "bcgbghgg" + str + paramString1 + paramString2;
    return this.obtenerMd5.md5(paramString1).substring(0, 20);
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.samuel.app.wifihackpassword.KeyGenerator
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */