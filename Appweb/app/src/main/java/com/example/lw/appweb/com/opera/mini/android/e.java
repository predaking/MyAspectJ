package com.example.lw.appweb.com.opera.mini.android;

class e
{
  private int B;
  private float I;
  private float J;
  private long Z;
  
  e(MiniView paramMiniView, int paramInt)
  {
    this.B = paramInt;
    this.J = 1.0F;
  }
  
  int Code(float paramFloat)
  {
    if (paramFloat == 0.0F) {
      return 0;
    }
    long l1 = System.currentTimeMillis();
    long l2 = l1 - this.Z;
    float f1 = Math.abs(paramFloat);
    if ((l2 > 1500L) || (this.I * paramFloat < 0.0F)) {
      this.J = 1.0F;
    }
    for (;;)
    {
      this.Z = l1;
      this.I = paramFloat;
      return (int)(this.J * paramFloat);
      if (f1 >= this.I)
      {
        float f2 = this.J;
        this.J = (f1 * this.B / (float)l2 + f2);
      }
      else
      {
        this.J -= f1 * this.B / (float)l2;
        this.J = Math.max(this.J, 1.0F);
      }
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.e
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */