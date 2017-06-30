package com.example.lw.appweb.com.opera.mini.android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;

public final class ao
{
  public static boolean Code(InputStream paramInputStream, String paramString1, String paramString2)
  {
    try
    {
      paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream));
      Object localObject = new BigInteger(paramInputStream.readLine());
      paramInputStream = new RSAPublicKeySpec(new BigInteger(paramInputStream.readLine()), (BigInteger)localObject);
      paramInputStream = (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic(paramInputStream);
      localObject = Signature.getInstance("SHA1withRSA");
      ((Signature)localObject).initVerify(paramInputStream);
      ((Signature)localObject).update(paramString1.getBytes());
      boolean bool = ((Signature)localObject).verify(Code(paramString2));
      return bool;
    }
    catch (GeneralSecurityException paramInputStream)
    {
      return false;
    }
    catch (IOException paramInputStream)
    {
      label98:
      break label98;
    }
  }
  
  private static byte[] Code(String paramString)
  {
    if (paramString.length() != 512) {
      return null;
    }
    paramString = paramString.toCharArray();
    int j = paramString.length / 2;
    byte[] arrayOfByte = new byte[j];
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label88;
      }
      int k = Character.digit(paramString[(i * 2)], 16);
      int m = Character.digit(paramString[(i * 2 + 1)], 16);
      if ((k == -1) || (m == -1)) {
        break;
      }
      arrayOfByte[i] = ((byte)(k << 4 | m));
      i += 1;
    }
    label88:
    return arrayOfByte;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ao
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */