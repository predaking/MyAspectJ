package com.example.lw.appweb.com.opera.mini.android;

final class r
{
  private String Code;
  private String I;
  private String J;
  private String Z;
  
  r(String paramString)
  {
    this(paramString, null, null, null);
  }
  
  r(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.Code = paramString1;
    this.I = paramString2;
    this.Z = paramString3;
    this.J = paramString4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof r)) {}
    do
    {
      return false;
      paramObject = (r)paramObject;
    } while (((paramObject.Code != null) || (this.Code != null)) && ((!paramObject.Code.equals(this.Code)) || (((paramObject.I != null) || (this.I != null)) && ((!paramObject.I.equals(this.I)) || (((paramObject.Z != null) || (this.Z != null)) && ((!paramObject.Z.equals(this.Z)) || (((paramObject.J != null) || (this.J != null)) && (!paramObject.J.equals(this.J)))))))));
    return true;
  }
  
  public final int hashCode()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (this.Code != null)
    {
      str = this.Code;
      localStringBuilder = localStringBuilder.append(str).append("jz78qgNXYe");
      if (this.I == null) {
        break label107;
      }
      str = this.I;
      label43:
      localStringBuilder = localStringBuilder.append(str).append("jz78qgNXYe");
      if (this.Z == null) {
        break label113;
      }
      str = this.Z;
      label66:
      localStringBuilder = localStringBuilder.append(str).append("jz78qgNXYe");
      if (this.J == null) {
        break label119;
      }
    }
    label107:
    label113:
    label119:
    for (String str = this.J;; str = "")
    {
      return str.hashCode();
      str = "";
      break;
      str = "";
      break label43;
      str = "";
      break label66;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.r
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */