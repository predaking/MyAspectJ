package com.example.lw.appweb;

public class bi
{
  private ab[] Code = new ab[1];
  
  int Code()
  {
    return this.Code.length;
  }
  
  ab Code(int paramInt)
  {
    return this.Code[paramInt];
  }
  
  final void Code(int paramInt, ab paramab)
  {
    Object localObject;
    if (paramInt >= this.Code.length)
    {
      localObject = new ab[paramInt + 1];
      System.arraycopy(this.Code, 0, localObject, 0, this.Code.length);
      this.Code = ((ab[])localObject);
    }
    if (this.Code[paramInt] != paramab)
    {
      localObject = this.Code[paramInt];
      this.Code[paramInt] = paramab;
      if (localObject != null) {
        ((ab)localObject).I(null, 0);
      }
      paramab.I(this, paramInt);
    }
  }
  
  final void I(int paramInt)
  {
    if (this.Code[paramInt] != null)
    {
      ab localab = this.Code[paramInt];
      this.Code[paramInt] = null;
      localab.I(null, 0);
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bi
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */