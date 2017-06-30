package com.example.lw.appweb.com.opera.mini.android;

import android.util.DisplayMetrics;
import au;
import ax;
import java.lang.ref.WeakReference;
import java.util.Enumeration;
import java.util.Hashtable;

public final class ab
  implements au
{
  private static ab B;
  private static Hashtable C = new Hashtable();
  static int Code;
  private static int I = 95;
  private static final int[] J;
  private static final int[] Z = { 8, 10, 12, 13, 15, 17, 19, 21, 23, 25, 28, 32 };
  
  static
  {
    J = new int[] { 10, 11, 12, 14, 16, 18, 20, 23, 26, 30, 34, 39, 44, 50, 57, 65 };
  }
  
  private ab()
  {
    float f = Math.min(ae.l(), ae.m());
    int i = ae.aa.widthPixels;
    int j = ae.aa.heightPixels;
    double d1 = Math.sqrt(i * i + j * j);
    double d2 = 3683.7212F / f;
    i = Math.max(30, Math.min(95, (int)(1083.3310546875D / Math.sqrt(d1) + d2 - 1.922799944877625D)));
    I = i;
    I = Math.round(i / 10.0F) * 10;
    i = 0;
    while (i < J.length)
    {
      J[i] = ((int)(J[i] * 100 / (I * 1.25F)));
      i += 1;
    }
    I = (int)(I * 1.25F);
  }
  
  private int Code(ax[] paramArrayOfax, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return I(paramArrayOfax, I(paramArrayOfax, paramInt1, paramInt2, paramInt3, paramBoolean), paramInt2, paramInt3 | 0x2, paramBoolean);
  }
  
  private int Code(ax[] paramArrayOfax, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return Code(paramArrayOfax, Code(paramArrayOfax, paramInt1, paramInt2, 0, paramBoolean), paramInt2, 1, paramBoolean);
  }
  
  private ax Code(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 1;
    }
    for (;;)
    {
      try
      {
        Integer localInteger = new Integer(i | (paramInt2 * 2 | (paramInt1 * 1024 | paramInt3 * 8)));
        Object localObject1 = (WeakReference)C.get(localInteger);
        if (localObject1 == null) {
          break label127;
        }
        localObject1 = (n)((WeakReference)localObject1).get();
        Object localObject4 = localObject1;
        if (localObject1 == null) {
          localObject4 = n.Code(paramInt1, paramInt2, paramInt3, paramBoolean);
        }
        if (localObject4 != null)
        {
          C.put(localInteger, new WeakReference(localObject4));
          J();
        }
        return localObject4;
      }
      finally {}
      i = 0;
      continue;
      label127:
      Object localObject3 = null;
    }
  }
  
  public static ab Code()
  {
    if (B == null) {
      B = new ab();
    }
    return B;
  }
  
  public static int I()
  {
    return J[J(0)];
  }
  
  private int I(ax[] paramArrayOfax, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int[] arrayOfInt;
    int i;
    label18:
    int j;
    boolean bool;
    label40:
    n localn;
    label72:
    int k;
    if (paramBoolean)
    {
      arrayOfInt = Z;
      int m = arrayOfInt.length;
      i = 0;
      if (i >= m) {
        break label146;
      }
      j = arrayOfInt[i];
      if (paramBoolean) {
        break label128;
      }
      bool = true;
      localn = (n)Code(paramInt2, paramInt3, j, bool);
      if (localn == null) {
        break label151;
      }
      if (!localn.C()) {
        break label134;
      }
      j = 1;
      if (!localn.B()) {
        break label140;
      }
      k = 2;
      label83:
      j |= k;
    }
    for (;;)
    {
      if ((localn != null) && (j == paramInt3))
      {
        paramArrayOfax[paramInt1] = localn;
        paramInt1 += 1;
      }
      for (;;)
      {
        i += 1;
        break label18;
        arrayOfInt = J;
        break;
        label128:
        bool = false;
        break label40;
        label134:
        j = 0;
        break label72;
        label140:
        k = 0;
        break label83;
        label146:
        return paramInt1;
      }
      label151:
      j = paramInt3;
    }
  }
  
  public static int J(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    default: 
      return Code + 2;
    case 0: 
      return Code + 0;
    }
    return Code + 4;
  }
  
  private static void J()
  {
    Enumeration localEnumeration = C.keys();
    while (localEnumeration.hasMoreElements())
    {
      Integer localInteger = (Integer)localEnumeration.nextElement();
      WeakReference localWeakReference = (WeakReference)C.get(localInteger);
      if ((localWeakReference != null) && (localWeakReference.get() == null)) {
        C.remove(localInteger);
      }
    }
  }
  
  public static boolean Z(int paramInt)
  {
    return paramInt < Code;
  }
  
  public final ax Code(int paramInt)
  {
    ax localax2 = Code(paramInt, 0, J[0]);
    ax localax1 = localax2;
    if (localax2 == null) {
      localax1 = Code(64, 0, J[0]);
    }
    return localax1;
  }
  
  public final ax Code(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      ax localax = Code(paramInt1, paramInt2, paramInt3, true);
      return localax;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final int I(int paramInt)
  {
    int j = 48;
    int k = I;
    int i = k;
    switch (paramInt)
    {
    default: 
      i = k;
    case 1: 
      if ((i > 48) && (i < 52)) {
        if (i <= 50) {
          paramInt = j;
        }
      }
      break;
    }
    for (;;)
    {
      return Math.min(95, paramInt);
      i = (int)(k * 1.25F);
      break;
      i = (int)(k / 1.25F);
      break;
      paramInt = 52;
      continue;
      paramInt = i;
    }
  }
  
  public final ax[] Z()
  {
    ax[] arrayOfax1 = new ax[Z.length * 12 + J.length * 12];
    int i = Code(arrayOfax1, Code(arrayOfax1, Code(arrayOfax1, 0, 64, true), 128, true), 32, true);
    Code = i;
    i = Code(arrayOfax1, Code(arrayOfax1, Code(arrayOfax1, i, 64, false), 128, false), 32, false);
    if (i < arrayOfax1.length)
    {
      ax[] arrayOfax2 = new ax[i];
      System.arraycopy(arrayOfax1, 0, arrayOfax2, 0, i);
      return arrayOfax2;
    }
    return arrayOfax1;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ab
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */