package com.example.lw.appweb;

import java.io.DataInput;

public abstract class ac
{
  public abstract byte Code();
  
  public abstract int Code(DataInput paramDataInput, int paramInt);
  
  public final int Code(Object paramObject)
  {
    int j = I() - ((ac)paramObject).I();
    int i = j;
    if (j == 0) {
      i = Code() - ((ac)paramObject).Code();
    }
    return i;
  }
  
  protected abstract int I();
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof ac)) && (I() == ((ac)paramObject).I()) && (Code() == ((ac)paramObject).Code());
  }
  
  public final int hashCode()
  {
    return I();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     ac
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */