package com.example.lw.appline.com.google.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class u
{
  static void a(byte[] paramArrayOfByte)
  {
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      paramArrayOfByte[i] = ((byte)(paramArrayOfByte[i] ^ 0x44));
      i += 1;
    }
  }
  
  public static byte[] a(String paramString)
    throws w, a
  {
    paramString = x.a(paramString);
    if (paramString.length != 32) {
      throw new a();
    }
    paramString = ByteBuffer.wrap(paramString, 4, 16);
    byte[] arrayOfByte = new byte[16];
    paramString.get(arrayOfByte);
    a(arrayOfByte);
    return arrayOfByte;
  }
  
  public static byte[] a(byte[] paramArrayOfByte, String paramString)
    throws a, w
  {
    if (paramArrayOfByte.length != 16) {
      throw new a();
    }
    try
    {
      arrayOfByte = x.a(paramString);
      if (arrayOfByte.length <= 16) {
        throw new a();
      }
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte);
      Object localObject = ByteBuffer.allocate(arrayOfByte.length);
      ((ByteBuffer)localObject).put(arrayOfByte);
      ((ByteBuffer)localObject).flip();
      paramString = new byte[16];
      byte[] arrayOfByte = new byte[arrayOfByte.length - 16];
      ((ByteBuffer)localObject).get(paramString);
      ((ByteBuffer)localObject).get(arrayOfByte);
      paramArrayOfByte = new SecretKeySpec(paramArrayOfByte, "AES");
      localObject = Cipher.getInstance("AES/CBC/PKCS5Padding");
      ((Cipher)localObject).init(2, paramArrayOfByte, new IvParameterSpec(paramString));
      paramArrayOfByte = ((Cipher)localObject).doFinal(arrayOfByte);
      return paramArrayOfByte;
    }
    catch (InvalidKeyException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte);
    }
    catch (IllegalBlockSizeException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte);
    }
    catch (NoSuchPaddingException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte);
    }
    catch (BadPaddingException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte);
    }
    catch (InvalidAlgorithmParameterException paramArrayOfByte)
    {
      throw new a(paramArrayOfByte);
    }
  }
  
  public static class a
    extends Exception
  {
    public a() {}
    
    public a(Throwable paramThrowable)
    {
      super();
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.u
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */