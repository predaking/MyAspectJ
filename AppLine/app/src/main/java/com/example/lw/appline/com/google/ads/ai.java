package com.example.lw.appline.com.google.ads;

public final class ai
{
  public static <T> T a(String paramString, Class<T> paramClass)
    throws ClassNotFoundException, ClassCastException, IllegalAccessException, InstantiationException, LinkageError, ExceptionInInitializerError
  {
    return paramClass.cast(Class.forName(paramString).newInstance());
  }
  
  public static String a(String paramString1, String paramString2, Boolean paramBoolean, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    paramString2 = paramString1.replaceAll("@gw_adlocid@", paramString2).replaceAll("@gw_qdata@", paramString6).replaceAll("@gw_sdkver@", "afma-sdk-a-v6.4.1").replaceAll("@gw_sessid@", paramString7).replaceAll("@gw_seqnum@", paramString8).replaceAll("@gw_devid@", paramString3);
    paramString1 = paramString2;
    if (paramString5 != null) {
      paramString1 = paramString2.replaceAll("@gw_adnetid@", paramString5);
    }
    paramString2 = paramString1;
    if (paramString4 != null) {
      paramString2 = paramString1.replaceAll("@gw_allocid@", paramString4);
    }
    paramString1 = paramString2;
    if (paramString9 != null) {
      paramString1 = paramString2.replaceAll("@gw_adt@", paramString9);
    }
    paramString2 = paramString1;
    if (paramString10 != null) {
      paramString2 = paramString1.replaceAll("@gw_aec@", paramString10);
    }
    if (paramBoolean != null)
    {
      if (paramBoolean.booleanValue()) {}
      for (paramString1 = "1";; paramString1 = "0") {
        return paramString2.replaceAll("@gw_adnetrefresh@", paramString1);
      }
    }
    return paramString2;
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.ai
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */