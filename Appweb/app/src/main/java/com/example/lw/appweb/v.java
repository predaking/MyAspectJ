package com.example.lw.appweb;

final class v
  implements Runnable
{
  private boolean B;
  private k C;
  private int Code;
  private boolean I;
  private int J;
  private k[] Z = new k[10];
  private boolean a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private boolean i;
  
  v()
  {
    b.Code(this);
  }
  
  private void Z()
  {
    try
    {
      while ((this.Code > 0) || ((this.J == 0) && (this.C == null))) {
        wait();
      }
      this.I = false;
    }
    finally {}
    if ((this.J > 0) && ((this.B) || (this.C == null)))
    {
      this.C = this.Z[0];
      k[] arrayOfk1 = this.Z;
      k[] arrayOfk2 = this.Z;
      int j = this.J - 1;
      this.J = j;
      arrayOfk1[0] = arrayOfk2[j];
      this.Z[this.J] = null;
      this.B = false;
    }
  }
  
  final void Code()
  {
    try
    {
      this.Code += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    this.a = true;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.g = paramInt4;
    this.h = paramInt5;
    this.e = paramInt7;
    this.f = paramInt6;
    this.i = paramBoolean;
  }
  
  /* Error */
  final void Code(k paramk)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: iload_2
    //   5: aload_0
    //   6: getfield 39	v:J	I
    //   9: if_icmpge +62 -> 71
    //   12: aload_0
    //   13: getfield 31	v:Z	[Lk;
    //   16: iload_2
    //   17: aaload
    //   18: aload_1
    //   19: if_acmpne +55 -> 74
    //   22: aload_0
    //   23: getfield 31	v:Z	[Lk;
    //   26: astore_1
    //   27: aload_0
    //   28: getfield 31	v:Z	[Lk;
    //   31: astore 4
    //   33: aload_0
    //   34: getfield 39	v:J	I
    //   37: iconst_1
    //   38: isub
    //   39: istore_3
    //   40: aload_0
    //   41: iload_3
    //   42: putfield 39	v:J	I
    //   45: aload_1
    //   46: iload_2
    //   47: aload 4
    //   49: iload_3
    //   50: aaload
    //   51: aastore
    //   52: aload_0
    //   53: getfield 31	v:Z	[Lk;
    //   56: aload_0
    //   57: getfield 39	v:J	I
    //   60: aconst_null
    //   61: aastore
    //   62: iload_2
    //   63: ifne +8 -> 71
    //   66: aload_0
    //   67: iconst_0
    //   68: putfield 48	v:B	Z
    //   71: aload_0
    //   72: monitorexit
    //   73: return
    //   74: iload_2
    //   75: iconst_1
    //   76: iadd
    //   77: istore_2
    //   78: goto -74 -> 4
    //   81: astore_1
    //   82: aload_0
    //   83: monitorexit
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	v
    //   0	86	1	paramk	k
    //   1	77	2	j	int
    //   39	11	3	k	int
    //   31	17	4	arrayOfk	k[]
    // Exception table:
    //   from	to	target	type
    //   4	45	81	finally
    //   52	62	81	finally
    //   66	71	81	finally
  }
  
  final void I()
  {
    try
    {
      this.Code -= 1;
      if ((this.Code == 0) && (this.I)) {
        notify();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  final void I(k paramk)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 48	v:B	Z
    //   6: ifne +62 -> 68
    //   9: iconst_0
    //   10: istore_2
    //   11: iload_2
    //   12: aload_0
    //   13: getfield 39	v:J	I
    //   16: if_icmpge +20 -> 36
    //   19: aload_0
    //   20: getfield 31	v:Z	[Lk;
    //   23: iload_2
    //   24: aaload
    //   25: aload_1
    //   26: if_acmpeq +10 -> 36
    //   29: iload_2
    //   30: iconst_1
    //   31: iadd
    //   32: istore_2
    //   33: goto -22 -> 11
    //   36: iload_2
    //   37: aload_0
    //   38: getfield 39	v:J	I
    //   41: if_icmpne +27 -> 68
    //   44: aload_0
    //   45: getfield 39	v:J	I
    //   48: aload_0
    //   49: getfield 31	v:Z	[Lk;
    //   52: arraylength
    //   53: if_icmpne +34 -> 87
    //   56: aload_0
    //   57: getfield 31	v:Z	[Lk;
    //   60: aload_0
    //   61: getfield 39	v:J	I
    //   64: iconst_1
    //   65: isub
    //   66: aload_1
    //   67: aastore
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield 46	v:I	Z
    //   73: aload_0
    //   74: getfield 37	v:Code	I
    //   77: ifne +7 -> 84
    //   80: aload_0
    //   81: invokevirtual 71	java/lang/Object:notify	()V
    //   84: aload_0
    //   85: monitorexit
    //   86: return
    //   87: aload_0
    //   88: getfield 31	v:Z	[Lk;
    //   91: astore_3
    //   92: aload_0
    //   93: getfield 39	v:J	I
    //   96: istore_2
    //   97: aload_0
    //   98: iload_2
    //   99: iconst_1
    //   100: iadd
    //   101: putfield 39	v:J	I
    //   104: aload_3
    //   105: iload_2
    //   106: aload_1
    //   107: aastore
    //   108: goto -40 -> 68
    //   111: astore_1
    //   112: aload_0
    //   113: monitorexit
    //   114: aload_1
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	v
    //   0	116	1	paramk	k
    //   10	96	2	j	int
    //   91	14	3	arrayOfk	k[]
    // Exception table:
    //   from	to	target	type
    //   2	9	111	finally
    //   11	29	111	finally
    //   36	68	111	finally
    //   68	84	111	finally
    //   87	104	111	finally
  }
  
  final void Z(k paramk)
  {
    int j = 1;
    try
    {
      this.Z[0] = paramk;
      while (j < this.J)
      {
        this.Z[j] = null;
        j += 1;
      }
      this.J = 1;
      this.B = true;
      this.I = true;
      if (this.Code == 0) {
        notify();
      }
      return;
    }
    finally {}
  }
  
  public final void run()
  {
    Thread.currentThread().setPriority(1);
    for (;;)
    {
      try
      {
        Z();
        this.a = false;
        this.C.J();
        if (this.a)
        {
          this.C.Code(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i);
          continue;
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        this.C = null;
      }
      this.C = null;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     v
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */