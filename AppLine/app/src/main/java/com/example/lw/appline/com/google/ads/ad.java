package com.example.lw.appline.com.google.ads;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class ad
{
  private static ad c = null;
  private final BigInteger a = d();
  private BigInteger b = BigInteger.ONE;
  
  public static ad a()
  {
    try
    {
      if (c == null) {
        c = new ad();
      }
      ad localad = c;
      return localad;
    }
    finally {}
  }
  
  private static byte[] a(long paramLong)
  {
    return BigInteger.valueOf(paramLong).toByteArray();
  }
  
  private static BigInteger d()
  {
    try
    {
      Object localObject1 = MessageDigest.getInstance("MD5");
      Object localObject2 = UUID.randomUUID();
      ((MessageDigest)localObject1).update(a(((UUID)localObject2).getLeastSignificantBits()));
      ((MessageDigest)localObject1).update(a(((UUID)localObject2).getMostSignificantBits()));
      localObject2 = new byte[9];
      localObject2[0] = 0;
      System.arraycopy(((MessageDigest)localObject1).digest(), 0, localObject2, 1, 8);
      localObject1 = new BigInteger((byte[])localObject2);
      return localObject1;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException("Cannot find MD5 message digest algorithm.");
    }
  }
  
  public BigInteger b()
  {
    try
    {
      BigInteger localBigInteger = this.a;
      return localBigInteger;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public BigInteger c()
  {
    try
    {
      BigInteger localBigInteger = this.b;
      this.b = this.b.add(BigInteger.ONE);
      return localBigInteger;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ad
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */