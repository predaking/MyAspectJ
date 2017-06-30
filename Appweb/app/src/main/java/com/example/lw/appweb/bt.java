package com.example.lw.appweb;

import java.lang.reflect.Array;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

final class bt
{
  private int B;
  private int C = 0;
  private Vector Code = new Vector();
  private Hashtable I = new Hashtable();
  private int J;
  private k Z;
  private int a = 0;
  
  private static int[] Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
  {
    return new int[] { paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10 };
  }
  
  private int Z(int paramInt)
  {
    int i = paramInt + 2 + this.Z.I(paramInt);
    if (i < this.Z.Code())
    {
      paramInt = i;
      if (this.Z.Z(i) == 84) {}
    }
    else
    {
      paramInt = -1;
    }
    return paramInt;
  }
  
  public final void Code(k paramk, int paramInt, String paramString)
  {
    this.Z = paramk;
    int i = 0;
    if (i < paramString.length()) {
      if (!b.Z(paramString.charAt(i))) {}
    }
    for (int i2 = 1;; i2 = 0)
    {
      int[] arrayOfInt = new int[4];
      arrayOfInt[0] = this.C;
      arrayOfInt[1] = this.a;
      arrayOfInt[2] = 0;
      arrayOfInt[3] = 0;
      this.J = this.Z.Code(paramInt, arrayOfInt);
      String str1 = paramString;
      int j;
      int i3;
      label130:
      int k;
      if (this.J != -1)
      {
        this.C = arrayOfInt[0];
        this.a = arrayOfInt[1];
        i = 0;
        paramInt = this.J + 17;
        j = this.Z.Z(paramInt);
        i3 = paramInt + 1;
        if (j > 0)
        {
          paramk = this.Z;
          k = i3 + 1;
          if ((paramk.Z(i3) != 116) || (!this.Z.J(k).equals("s"))) {
            break label1415;
          }
        }
      }
      label1409:
      label1415:
      for (paramInt = 1;; paramInt = i)
      {
        i = this.Z.I(k);
        j -= 1;
        i3 = k + (i + 2);
        i = paramInt;
        break label130;
        i += 1;
        break;
        paramString = this.Z.J(i3);
        if (i2 != 0)
        {
          str1 = b.b(str1);
          paramString = b.b(paramString);
        }
        for (;;)
        {
          int i10 = Z(i3);
          this.B = 0;
          int m;
          int n;
          int i1;
          int i11;
          Object localObject2;
          Object localObject1;
          label319:
          int i6;
          int i4;
          int i12;
          int i5;
          int i7;
          if ((i == 0) && (this.B < paramString.length()))
          {
            j = this.J;
            m = this.B;
            n = this.C;
            i1 = this.a;
            i11 = this.Code.size();
            k = 1;
            localObject2 = str1;
            localObject1 = paramString;
            paramInt = i10;
            if (((String)localObject2).length() <= ((String)localObject1).length() - m) {
              if (((String)localObject1).regionMatches(true, m, (String)localObject2, 0, ((String)localObject2).length()))
              {
                n = this.J;
                i6 = this.B;
                i1 = this.C;
                i4 = this.a;
                i12 = m + ((String)localObject2).length();
                paramk = (int[][])Array.newInstance(Integer.TYPE, new int[] { k, 10 });
                i5 = 0;
                m = n + 17;
                paramInt = 1;
                k = this.Z.Z(m);
                i7 = m + 1;
                label440:
                if (k > 0)
                {
                  localObject1 = this.Z;
                  m = i7 + 1;
                  if (((k)localObject1).Z(i7) != 114) {
                    break label1409;
                  }
                  paramInt = 0;
                }
              }
            }
          }
          for (;;)
          {
            i7 = this.Z.I(m);
            k -= 1;
            i7 = i7 + 2 + m;
            break label440;
            localObject1 = this.Z.J(i7);
            k = 0;
            int i8 = 0;
            m = 0;
            label520:
            if (i8 < i6)
            {
              if (((String)localObject1).charAt(i8) != '\n') {
                break label1394;
              }
              m = k + 1;
            }
            int i9;
            for (k = i8 + 1;; k = i9)
            {
              i8 += 1;
              i9 = m;
              m = k;
              k = i9;
              break label520;
              int i15 = this.Z.I(n + 15);
              i8 = b.C(i15);
              m = b.Code(i15, ((String)localObject1).substring(m, i6));
              i9 = b.Code((String)localObject1, i6);
              if (n == j)
              {
                j = b.Code(i15, ((String)localObject1).substring(i6, i12));
                i6 = b.Code((String)localObject1, i12);
                if (paramInt != 0) {
                  label654:
                  paramk[i5] = Code(n, i9, i6 - i9, m, i8 * k, j, i8, i1, i4, i11);
                }
              }
              for (;;)
              {
                if (paramk != null) {
                  this.Code.addElement(paramk);
                }
                this.B += 1;
                break;
                m = this.Z.I(n + 6) - m - j;
                break label654;
                i7 = Z(i7);
                int i13 = this.Z.I(i7 + 1);
                int i14 = this.Z.Code(i7 + 3);
                i6 = b.Code(i15, ((String)localObject1).substring(i6, ((String)localObject1).length()));
                i15 = b.Code((String)localObject1, ((String)localObject1).length());
                if (paramInt != 0) {}
                for (;;)
                {
                  paramk[i5] = Code(n, i9, i15 - i9, m, i8 * k, i6, i8, i1, i4, i11);
                  i5 += 1;
                  i4 = i14 + i4;
                  i1 += i13;
                  i6 = 0;
                  n = i7;
                  break;
                  m = 0;
                }
                paramk = null;
                continue;
                if ((paramInt == -1) || (!((String)localObject1).regionMatches(true, m, (String)localObject2, 0, ((String)localObject1).length() - m)))
                {
                  paramk = null;
                }
                else
                {
                  i7 = this.Z.I(j + 6);
                  i8 = this.Z.Code(j + 8);
                  j = n + this.Z.I(paramInt + 1);
                  i4 = i1 + this.Z.Code(paramInt + 3);
                  i9 = this.Z.I(paramInt + 6);
                  i12 = this.Z.Code(paramInt + 8);
                  i6 = paramInt + 17;
                  i5 = this.Z.Z(i6);
                  i6 += 1;
                  while (i5 > 0)
                  {
                    i6 += 1;
                    i13 = this.Z.I(i6);
                    i5 -= 1;
                    i6 += i13 + 2;
                  }
                  String str2 = this.Z.J(i6);
                  paramk = str2;
                  if (i2 != 0) {
                    paramk = b.b(str2);
                  }
                  i5 = Z(i6);
                  if (!J.Code(n, i1, i7, i8, j, i4, i9, i12)) {
                    break label1199;
                  }
                  if ((((String)localObject2).charAt(((String)localObject1).length() - m) == ' ') && (((String)localObject2).length() > ((String)localObject1).length() - m + 1))
                  {
                    localObject2 = ((String)localObject2).substring(((String)localObject1).length() - m + 1);
                    m = 0;
                    k += 1;
                    i1 = i4;
                    n = j;
                    j = paramInt;
                    paramInt = i5;
                    localObject1 = paramk;
                    break label319;
                  }
                  paramk = null;
                }
              }
              label1199:
              localObject2 = ((String)localObject2).substring(((String)localObject1).length() - m);
              m = 0;
              k += 1;
              i1 = i4;
              n = j;
              j = paramInt;
              paramInt = i5;
              localObject1 = paramk;
              break label319;
              this.J = this.Z.Code(i3 + 2 + this.Z.I(i3), arrayOfInt);
              break;
              paramk = this.Code.elements();
              if (paramk.hasMoreElements())
              {
                paramString = (int[][])paramk.nextElement();
                paramInt = 0;
                label1302:
                if (paramInt < paramString.length)
                {
                  str1 = paramString[paramInt];
                  localObject1 = new Integer(str1[0]);
                  if (!this.I.containsKey(localObject1)) {
                    break label1362;
                  }
                  ((Vector)this.I.get(localObject1)).addElement(str1);
                }
                for (;;)
                {
                  paramInt += 1;
                  break label1302;
                  break;
                  label1362:
                  localObject2 = new Vector();
                  ((Vector)localObject2).addElement(str1);
                  this.I.put(localObject1, localObject2);
                }
              }
              return;
              label1394:
              i9 = m;
              m = k;
            }
          }
        }
      }
    }
  }
  
  final boolean Code()
  {
    return this.Code.size() > 0;
  }
  
  final int[][] Code(int paramInt)
  {
    return (int[][])this.Code.elementAt(paramInt);
  }
  
  final int I()
  {
    return this.Code.size();
  }
  
  final Vector I(int paramInt)
  {
    return (Vector)this.I.get(new Integer(paramInt));
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bt
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */