package com.example.lw.appweb;

public final class o
{
  private static String Code;
  private static String I;
  
  public static String Code()
  {
    if (Code == null) {
      Code = g.Code("locale");
    }
    return Code;
  }
  
  public static void Code(String paramString)
  {
    Code = paramString;
  }
  
  public static String I()
  {
    if (I != null) {
      return I;
    }
    if ((Code != null) && (Code.length() >= 2)) {
      return Code.substring(0, 2);
    }
    return "";
  }
  
  public static void I(String paramString)
  {
    I = paramString;
  }
  
  public static String Z()
  {
    if ((Code != null) && (Code.indexOf("-") >= 0)) {
      return Code.substring(Code.indexOf("-") + 1);
    }
    return "";
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     o
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */