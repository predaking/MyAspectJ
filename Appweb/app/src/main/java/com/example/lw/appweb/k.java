package com.example.lw.appweb;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class k
{
  private static final char[] al = new char[512];
  private static final v ao = new v();
  private static br[] ar = new br[1];
  private static int[] as = new int[3];
  private static br[] at = new br[1];
  private int A;
  private boolean B;
  private boolean C;
  final ab Code;
  private int D;
  private int E;
  private int F;
  private int G;
  private int H;
  k I;
  int J;
  private boolean K;
  private boolean L;
  private int[] M;
  private int N;
  private boolean O;
  private int P;
  private int Q;
  private int R;
  private int S;
  private int[] T;
  private int[] U;
  private int V;
  private byte[] W;
  private int X;
  private int Y;
  ae Z;
  private int a;
  private bt aA;
  private Hashtable aa = new Hashtable();
  private Vector ab = new Vector();
  private String ac;
  private String ad;
  private int ae;
  private int af;
  private int ag;
  private int ah;
  private int ai;
  private int aj;
  private int ak;
  private int am;
  private boolean an;
  private ae ap = new ae();
  private boolean aq = true;
  private Hashtable au = null;
  private int av;
  private int aw;
  private int ax;
  private int ay;
  private int az;
  private int b;
  private String c;
  private String d;
  private int e;
  private int f;
  private byte[] g;
  private int h;
  private boolean i;
  private int j;
  private int k = 0;
  private byte l;
  private int m;
  private int n = 1;
  private int[] o = null;
  private boolean p = false;
  private int q;
  private int r;
  private int s;
  private boolean t;
  private boolean u;
  private int[] v = new int[5];
  private boolean w;
  private boolean x;
  private int y;
  private boolean z;
  
  k(ab paramab, k paramk, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramk != null)
    {
      this.I = paramk;
      this.Z = paramk.ap;
    }
    this.Code = paramab;
    this.B = paramBoolean1;
    this.C = paramBoolean2;
    this.a = paramab.k();
    if ((paramk != null) && (this.a != paramk.a)) {
      paramk.I(true);
    }
  }
  
  private int A()
  {
    return z() << 8 >> 8;
  }
  
  private void A(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 84: 
      this.ak += 6;
      R();
      this.ak = (D() + this.ak);
      return;
    case 73: 
      this.ak += 7;
      R();
      return;
    case 66: 
      this.ak += 4;
      return;
    case 70: 
      this.ak += 6;
      this.ak = (D() + this.ak);
      this.ak = (D() + this.ak + 5);
      return;
    case 83: 
      this.ak = (z() + this.ak);
      return;
    case 76: 
      this.ak += 9;
      return;
    }
    this.ak += 1;
    this.ak = (z() + this.ak);
  }
  
  private int B(int paramInt1, int paramInt2, int paramInt3)
  {
    this.M[(paramInt1 + 0)] = paramInt2;
    this.M[(paramInt1 + 1)] = paramInt3;
    this.M[(paramInt1 + 2)] = this.ai;
    this.M[(paramInt1 + 3)] = this.aj;
    return paramInt1;
  }
  
  private native void B(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  private int C(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 <= paramInt3) {
      return paramInt1;
    }
    return (paramInt1 - paramInt3) * this.q / paramInt2 + paramInt3;
  }
  
  static int Code(DataInput paramDataInput)
  {
    return paramDataInput.readUnsignedByte() << 16 | paramDataInput.readUnsignedShort();
  }
  
  private static int Code(Hashtable paramHashtable, String paramString)
  {
    int i1 = -1;
    int i3 = 0;
    for (;;)
    {
      int i4 = paramString.indexOf(0, i3);
      int i2 = i4;
      if (i4 < 0) {
        i2 = paramString.length();
      }
      try
      {
        i3 = Integer.parseInt(paramString.substring(i3, i2));
        Integer localInteger = new Integer(i3);
        paramHashtable.put(localInteger, localInteger);
        if (i3 >= i1)
        {
          i4 = i1;
          if (i1 >= 0) {}
        }
        else
        {
          i4 = i3;
        }
        i3 = i2 + 1;
        i1 = i4;
        if (i2 < paramString.length()) {
          continue;
        }
        return i4;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          i4 = i1;
        }
      }
    }
  }
  
  private static int Code(byte[] paramArrayOfByte, int paramInt)
  {
    return ((paramArrayOfByte[paramInt] & 0xFF) << 16) + ((paramArrayOfByte[(paramInt + 1)] & 0xFF) << 8) + (paramArrayOfByte[(paramInt + 2)] & 0xFF);
  }
  
  private static int Code(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 2) {}
    int i1;
    do
    {
      return -1;
      i1 = az.Z(paramArrayOfByte, paramInt1);
    } while ((i1 + 2 > paramInt2) || (!b.I(paramArrayOfByte, paramInt1 + 2, i1)));
    return i1 + 2;
  }
  
  private static int Code(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = 0;
    int i2 = 0;
    int i3;
    if (i1 < paramInt1) {
      if (paramArrayOfChar[i1] == '\n')
      {
        i2 = i1;
        i3 = 0;
        i1 = paramInt1;
        paramInt1 = i3;
      }
    }
    for (;;)
    {
      i3 = i1;
      i1 = i2 + 1;
      i2 = paramInt1;
      paramInt1 = i3;
      break;
      if ((i2 == 0) || (paramArrayOfChar[i1] == ' '))
      {
        i3 = 1;
        while ((i1 + i3 < paramInt1) && (paramArrayOfChar[(i1 + i3)] != ' ') && (paramArrayOfChar[(i1 + i3)] != '\n')) {
          i3 += 1;
        }
        i4 = b.Code(paramInt2, paramArrayOfChar, i1, i3);
        i2 += i4;
        if (i2 > paramInt3) {
          if (i4 <= paramInt3)
          {
            paramArrayOfChar[i1] = '\n';
            i2 = i4;
          }
        }
        for (;;)
        {
          i4 = i2;
          i2 = i3 - 1 + i1;
          i1 = paramInt1;
          paramInt1 = i4;
          break;
          if (paramArrayOfChar[i1] == ' ') {
            paramArrayOfChar[i1] = '\n';
          }
          i2 = b.Code(paramInt2, paramArrayOfChar, i1, i3, paramInt3);
          if (i2 == 0)
          {
            i2 = 0;
          }
          else
          {
            if (paramInt1 == paramArrayOfChar.length)
            {
              char[] arrayOfChar = new char[paramArrayOfChar.length + 10];
              System.arraycopy(paramArrayOfChar, 0, arrayOfChar, 0, paramInt1);
              paramArrayOfChar = arrayOfChar;
            }
            for (;;)
            {
              i2 = i1 + i2;
              System.arraycopy(paramArrayOfChar, i2, paramArrayOfChar, i2 + 1, paramInt1 - i2);
              paramArrayOfChar[i2] = '\n';
              i1 = paramInt1 + 1;
              paramInt1 = 0;
              break;
              return paramInt1;
            }
          }
        }
      }
      i3 = i2;
      int i4 = paramInt1;
      i2 = i1;
      paramInt1 = i3;
      i1 = i4;
    }
  }
  
  private int Code(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i1 = Z(paramArrayOfInt, 0, paramInt1, paramInt2);
    if (i1 >= paramInt1) {
      return this.r;
    }
    return this.M[(i1 * 5 + 0)] + paramInt2 - (paramArrayOfInt[(i1 + 0)] & 0xFFFFFF);
  }
  
  private J Code(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i16 = this.ak;
    int i17 = this.ae;
    int i18 = this.af;
    if (this.T == null) {
      i3 = -1;
    }
    int i10;
    int i11;
    int i12;
    int i13;
    int i1;
    int i22;
    int i9;
    int i8;
    int i4;
    int i14;
    int i19;
    label204:
    int i15;
    int i20;
    int i21;
    int i6;
    label255:
    int i7;
    label269:
    label279:
    label328:
    do
    {
      i10 = 0;
      i11 = 0;
      i12 = this.q;
      i13 = paramArrayOfInt[0];
      if (i3 >= 0)
      {
        i10 = this.T[(i3 + 0)];
        i11 = I(paramArrayOfInt, 2, paramInt1, this.T[(i3 + 1)]);
        i12 = this.T[(i3 + 2)];
        i13 = this.T[(i3 + 3)];
      }
      i1 = 0;
      i2 = 0;
      this.ak = this.X;
      i22 = 0;
      i9 = 2147483647;
      i8 = 2147483647;
      i5 = 0;
      i4 = 0;
      i3 = -1;
      if (this.ak >= this.W.length) {
        break label764;
      }
      i14 = this.ak;
      i19 = E();
      switch (i19)
      {
      default: 
        if ((i19 != 84) || (u(i14))) {
          break label737;
        }
        i15 = I(paramArrayOfInt, 2, paramInt1, i2);
        i20 = this.ag;
        i21 = this.ah;
        if (paramInt2 >= i1) {
          break label537;
        }
        i6 = i1 - paramInt2;
        if (paramInt3 >= i15) {
          break label566;
        }
        i7 = i15 - paramInt3;
        if ((i6 != 0) || (i7 != 0)) {
          break label597;
        }
        this.ae = i17;
        this.af = i18;
        this.ak = i16;
        if (i14 <= 0) {
          break label735;
        }
        return new J(this, i14, i1, i2);
        i1 = 0;
        i2 = -1;
        i4 = 2147483647;
        if (i1 >= this.T.length) {
          break label501;
        }
        i7 = this.T[(i1 + 0)];
        i5 = I(paramArrayOfInt, 2, paramInt1, this.T[(i1 + 1)]);
        i8 = this.T[(i1 + 2)];
        i6 = this.T[(i1 + 3)];
        i3 = i1;
      }
    } while (b.Code(paramInt2, paramInt3, 1, 1, i7, i5, i8, i6));
    int i3 = b.Code(paramInt2, i7, i7 + i8 - 1);
    int i5 = b.Code(paramInt3, i5, i5 + i6 - 1);
    i3 = paramInt2 - i3;
    i5 = paramInt3 - i5;
    i5 = i3 * i3 + i5 * i5;
    if (i5 < i4) {
      i3 = i1;
    }
    for (int i2 = i5;; i2 = i4)
    {
      i1 += 5;
      i4 = i2;
      i2 = i3;
      break label328;
      label501:
      i3 = i2;
      break;
      G();
      i6 = this.ae;
      i2 += this.af;
      i1 += i6;
      break label204;
      label537:
      if (paramInt2 >= i1 + i20)
      {
        i6 = paramInt2 - i1 - i20 + 1;
        break label255;
      }
      i6 = 0;
      break label255;
      label566:
      if (paramInt3 >= i15 + i21)
      {
        i7 = paramInt3 - i15 - i21 + 1;
        break label269;
      }
      i7 = 0;
      break label269;
      label597:
      boolean bool = b.Code(i10, i11, i12, i13, i1, i15, i20, i21);
      if ((i7 < i9) || ((i7 == i9) && (i6 < i8)))
      {
        i15 = 1;
        label642:
        if (((i22 != 0) || ((!bool) && (i15 == 0))) && ((i22 == 0) || (!bool) || (i15 == 0))) {
          break label737;
        }
        i4 = i7;
        i3 = i6;
        i7 = i2;
        i6 = i1;
        i5 = i14;
        i22 = bool;
      }
      for (;;)
      {
        A(i19);
        i14 = i5;
        i9 = i4;
        i8 = i3;
        i5 = i7;
        i4 = i6;
        i3 = i14;
        break;
        i15 = 0;
        break label642;
        label735:
        return null;
        label737:
        i6 = i4;
        i14 = i3;
        i4 = i9;
        i3 = i8;
        i7 = i5;
        i5 = i14;
      }
      label764:
      i1 = i4;
      i2 = i5;
      i14 = i3;
      break label279;
      i3 = i2;
    }
  }
  
  private br Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    Object localObject1 = ar;
    if (!this.ap.I(b.a * 256)) {
      localObject1 = null;
    }
    for (int i1 = 0;; i1 = 0)
    {
      if (i1 <= 2) {}
      for (;;)
      {
        try
        {
          localObject1 = Code(paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, (br[])localObject1);
          if ((localObject1 != null) && (this.ap.I(1)))
          {
            ae localae = this.ap;
            if (paramInt3 != 256) {
              continue;
            }
            bool = true;
            if (!localae.Code(paramInt1, bool, (br)localObject1, ar[0])) {
              Z(false);
            }
          }
          ar[0] = null;
          return localObject1;
        }
        catch (Throwable localThrowable)
        {
          boolean bool;
          ar[0] = null;
          localObject2 = null;
          if (i1 <= 1)
          {
            if (((this.B) || (i1 > 0)) && (this.Z != null)) {
              x();
            }
            if (i1 > 0) {
              this.aq = false;
            }
            if (i1 == 0)
            {
              Z(false);
              i1 += 1;
              break;
            }
            u();
            this.Code.Code.l();
            continue;
            bool = false;
            continue;
          }
        }
        Object localObject2 = null;
      }
    }
  }
  
  private br Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9)
  {
    for (;;)
    {
      int i2;
      Object localObject1;
      int i1;
      try
      {
        i2 = this.ap.Z(paramInt1);
        if (paramInt7 == 256)
        {
          localObject1 = this.ap.I;
          if (this.ap.I(i2, paramInt1))
          {
            if (localObject1[i2] == null) {
              continue;
            }
            localObject1 = localObject1[i2];
            return localObject1;
          }
        }
        else
        {
          localObject1 = this.ap.Z;
          continue;
        }
        ae localae = this.ap;
        if (localae.J == localae.I.length)
        {
          localae.Code = b.Code(localae.Code, localae.J * 2 * 6);
          localae.I = b.Code(localae.I, localae.J * 2);
          localae.Z = b.Code(localae.Z, localae.J * 2);
        }
        i1 = i2 * 6;
        System.arraycopy(localae.Code, i1, localae.Code, i1 + 6, localae.J * 6 - i1);
        System.arraycopy(localae.I, i2, localae.I, i2 + 1, localae.J - i2);
        System.arraycopy(localae.Z, i2, localae.Z, i2 + 1, localae.J - i2);
        localae.J += 1;
        localae.Code[(i1 + 0)] = paramInt1;
        localae.Code[(i1 + 1)] = paramInt2;
        localae.Code[(i1 + 4)] = 0;
        br[] arrayOfbr = localae.I;
        localae.Z[i2] = null;
        arrayOfbr[i2] = null;
        if ((this.Z != null) && (this.Z.Code(paramInt1, paramInt7, this.ap, i2)) && (localObject1[i2] != null))
        {
          localObject1 = localObject1[i2];
          continue;
        }
        localObject1 = this.ap;
        if (paramInt8 >= 0) {
          break label684;
        }
        paramInt1 = 0;
      }
      finally {}
      int i3 = i2 * 6;
      if (localObject1.Code[(i3 + 4)] == 0)
      {
        ((ae)localObject1).Code[(i3 + 2)] = paramInt3;
        ((ae)localObject1).Code[(i3 + 3)] = paramInt4;
        ((ae)localObject1).Code[(i3 + 4)] = (paramInt5 << 16 | paramInt6);
        ((ae)localObject1).Code[(i3 + 5)] = (i1 | paramInt1 << 16);
        if (((this.ap.Code[(i2 * 6 + 2)] & 0x80000000) != 0) && (r(paramInt2))) {
          localObject1 = Code(i2, paramInt2, paramInt7, paramInt8, paramInt9, paramInt3, paramInt4);
        }
      }
      else
      {
        int i4 = localObject1.Code[(i3 + 2)] & 0x3FFFFFFF;
        int i5 = localObject1.Code[(i3 + 3)];
        int i6 = Math.min(paramInt3, i4);
        int i7 = Math.min(paramInt4, i5);
        ((ae)localObject1).Code[(i3 + 4)] = (Math.max(paramInt3 + paramInt5, i4 + (localObject1.Code[(i3 + 4)] >>> 16)) - i6 << 16 | Math.max(paramInt4 + paramInt6, i5 + (localObject1.Code[(i3 + 4)] & 0xFFFF)) - i7);
        ((ae)localObject1).Code[(i3 + 2)] = (i6 | localObject1.Code[(i3 + 2)] & 0xC0000000);
        ((ae)localObject1).Code[(i3 + 3)] = i7;
        continue;
        Object localObject3 = null;
        continue;
        for (;;)
        {
          if (paramInt9 >= 0) {
            break label690;
          }
          i1 = 0;
          break;
          label684:
          paramInt1 = paramInt8;
        }
        label690:
        i1 = paramInt9;
      }
    }
  }
  
  private br Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, br[] paramArrayOfbr)
  {
    int i1 = 0;
    if ((this.aq) && (paramInt3 <= 0) && (paramInt4 <= 0))
    {
      if ((paramInt3 > 0) && (paramInt4 > 0)) {
        break label73;
      }
      paramInt5 = 1;
    }
    for (;;)
    {
      if (paramInt5 != 0)
      {
        return g.Code.r().Code(this.W, paramInt1 + 2, az.Z(this.W, paramInt1), paramInt2, paramArrayOfbr, false);
        paramArrayOfbr = null;
        break;
        label73:
        if ((paramInt2 >= 256) || (paramInt2 <= 0)) {
          break label165;
        }
        paramInt3 = Math.max(1, D(paramInt5 + paramInt3) - D(paramInt5));
        paramInt4 = Math.max(1, D(paramInt6 + paramInt4) - D(paramInt6));
        paramInt5 = i1;
        continue;
      }
      return g.Code.r().Code(this.W, paramInt1 + 2, az.Z(this.W, paramInt1), paramInt3, paramInt4, paramArrayOfbr);
      label165:
      paramInt5 = i1;
    }
  }
  
  static k Code(Object paramObject)
  {
    return (k)((Object[])paramObject)[0];
  }
  
  private native void Code(aw paramaw, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt5, int paramInt6, int paramInt7);
  
  private native void Code(aw paramaw, int paramInt, boolean paramBoolean);
  
  private static void Code(DataInputStream paramDataInputStream, int paramInt, ab paramab)
  {
    int i4 = paramDataInputStream.read();
    int i3 = 1;
    int i1;
    if ((i4 & 0x1) != 0)
    {
      i1 = 1;
      if ((i4 & 0x2) == 0) {
        break label61;
      }
      i2 = 1;
      label28:
      if ((i4 & 0x4) == 0) {
        break label67;
      }
    }
    label61:
    label67:
    for (i4 = 1;; i4 = 0)
    {
      if (i2 == 0) {
        break label73;
      }
      paramab.a();
      g.I.Code(41);
      return;
      i1 = 0;
      break;
      i2 = 0;
      break label28;
    }
    label73:
    Vector localVector = new Vector();
    int i2 = i3;
    int i6;
    int i7;
    while (i2 < paramInt)
    {
      i3 = paramDataInputStream.read();
      i5 = paramDataInputStream.readUnsignedShort();
      i6 = paramDataInputStream.read();
      i7 = Code(paramDataInputStream);
      i2 += i7 + 7;
      ??? = new byte[i7 + 6];
      b.Code((byte[])???, i3, i5, i6);
      paramDataInputStream.readFully((byte[])???, 6, i7);
      localVector.addElement(???);
    }
    int i5 = localVector.size();
    paramDataInputStream = new byte[i5];
    synchronized (b.R)
    {
      if (((b.S == null) || (b.S.length == 0)) && (i1 == 0)) {
        return;
      }
    }
    if ((i1 != 0) || (b.S == null))
    {
      b.c();
      b.T = new byte[i5 * 3];
      b.U = new byte[i5];
      paramInt = 0;
    }
    byte[] arrayOfByte1;
    for (;;)
    {
      if (paramInt < i5)
      {
        arrayOfByte1 = (byte[])localVector.elementAt(paramInt);
        b.T[(paramInt * 3)] = arrayOfByte1[2];
        paramDataInputStream[paramInt] = arrayOfByte1[2];
        if (!b.Code(paramInt, arrayOfByte1))
        {
          paramInt = 1;
          paramDataInputStream = new byte[0];
          break label791;
          if (i2 != 0)
          {
            b.b();
            if (b.S == null)
            {
              paramInt = 1;
              paramDataInputStream = new byte[0];
            }
            label317:
            paramab.a();
            g.Z.b(g.Z.Code(paramDataInputStream));
            paramDataInputStream = g.Z;
            if (paramInt == 0) {
              break label758;
            }
            paramInt = 1;
            label347:
            paramDataInputStream.c(paramInt);
            paramDataInputStream = g.Z;
            if (i4 == 0) {
              break label763;
            }
            paramInt = 1;
            label363:
            paramDataInputStream.c(paramInt);
            g.I.Code(39);
          }
        }
        else
        {
          paramInt += 1;
          continue;
          b.T = new byte[b.S.length];
          System.arraycopy(b.S, 0, b.T, 0, b.S.length);
          i2 = 0;
          paramInt = i1;
          i3 = 0;
          i1 = i2;
          i2 = i3;
        }
      }
    }
    for (;;)
    {
      label450:
      label580:
      byte[] arrayOfByte2;
      if (i1 < i5)
      {
        arrayOfByte1 = (byte[])localVector.elementAt(i1);
        paramDataInputStream[i1] = arrayOfByte1[2];
        i3 = 0;
        if (i3 >= b.T.length / 3) {
          break label783;
        }
        if (arrayOfByte1[2] != b.T[(i3 * 3)]) {
          break label812;
        }
        b.T[(i3 * 3 + 1)] = arrayOfByte1[3];
        b.T[(i3 * 3 + 2)] = arrayOfByte1[4];
        b.U[i3] = arrayOfByte1[5];
        if (b.Code(i3, arrayOfByte1)) {
          break label806;
        }
        i5 = 0;
        i3 = 1;
        paramInt = 1;
        paramDataInputStream = new byte[0];
        label536:
        if (i3 != 0) {
          break label780;
        }
        i7 = b.T.length / 3;
        i2 = 1;
        arrayOfByte1 = new byte[i5 - i1];
        arrayOfByte1[0] = ((byte[])localVector.elementAt(i1))[2];
        i3 = i1 + 1;
        if (i3 < i5)
        {
          arrayOfByte2 = (byte[])localVector.elementAt(i3);
          i6 = 0;
        }
      }
      for (;;)
      {
        if (i6 < i7)
        {
          if (arrayOfByte2[2] != b.T[(i6 * 3)]) {}
        }
        else
        {
          for (i6 = 1;; i6 = 0)
          {
            if (i6 == 0)
            {
              arrayOfByte1[i2] = ((byte[])localVector.elementAt(i3))[2];
              i2 += 1;
              break label797;
              arrayOfByte2 = new byte[(i7 + i2) * 3];
              byte[] arrayOfByte3 = new byte[i7 + i2];
              System.arraycopy(b.T, 0, arrayOfByte2, 0, i7 * 3);
              System.arraycopy(b.U, 0, arrayOfByte3, 0, i7);
              b.T = arrayOfByte2;
              b.U = arrayOfByte3;
              i6 = 1;
              i3 = 0;
              while (i3 < i2)
              {
                b.T[((i7 + i3) * 3)] = arrayOfByte1[i3];
                i3 += 1;
              }
              b.e();
              break label317;
              label758:
              paramInt = 0;
              break label347;
              label763:
              paramInt = 0;
              break label363;
              break;
            }
            break label797;
          }
          label780:
          break label838;
          label783:
          i3 = 0;
          break label536;
          paramInt = i1;
          label791:
          i2 = 1;
          break;
          label797:
          i3 += 1;
          break label580;
          label806:
          i3 = 1;
          break label536;
          label812:
          i3 += 1;
          break label450;
        }
        i6 += 1;
      }
      i1 -= 1;
      i2 = i6;
      label838:
      i1 += 1;
    }
  }
  
  private void Code(String paramString1, String paramString2, char paramChar, String paramString3)
  {
    Object localObject = null;
    if ((paramString2 != null) && (!this.ab.contains(paramString2)) && (!this.Code.I.containsKey(paramString2)) && ((paramString3 == null) || (paramString3.length() == 0) || (this.Code.i() == null) || (this.Code.i().indexOf(paramString2 + "=") == -1))) {
      paramString1 = (String)this.aa.remove(paramString1);
    }
    for (;;)
    {
      if (paramString1 != null) {
        this.Code.Code(paramString1, paramChar, paramString2);
      }
      return;
      paramString1 = localObject;
      if (paramString3 != null)
      {
        paramString1 = localObject;
        if (paramString3.length() > 0) {
          paramString1 = paramString3;
        }
      }
    }
  }
  
  private void Code(q paramq, int paramInt1, int paramInt2)
  {
    int i2 = E();
    int i3 = E();
    String str = K();
    Object localObject2 = K();
    int i1 = z();
    D();
    Object localObject1;
    if ((!this.ab.contains(str)) && (!this.Code.I.containsKey(str)))
    {
      if (!str.equals(this.ac)) {
        break label326;
      }
      localObject1 = Integer.toString(0);
    }
    for (;;)
    {
      if (localObject1 != null)
      {
        char c1 = (char)i2;
        if (this.aa.containsKey(localObject1))
        {
          localObject3 = null;
          Code((String)localObject1, str, c1, (String)localObject3);
        }
      }
      else
      {
        localObject1 = (String)this.Code.I.get(str);
        if (localObject1 != null) {
          break label1160;
        }
      }
      label645:
      label1160:
      for (Object localObject3 = localObject2;; localObject3 = localObject1)
      {
        label234:
        int i4;
        switch (i2)
        {
        default: 
          i1 = 0;
          localObject1 = null;
          if (localObject1 != null)
          {
            i2 = paramq.Code();
            i3 = paramq.I();
            i4 = paramq.Z();
            int i5 = paramq.J();
            paramq.I(this.ae, this.af, this.ag, this.ah);
            Code(paramq, (char[])localObject1, i1, paramInt1, this.Code.d(), paramInt2);
            paramq.Code(i2, i3, i4, i5);
          }
          return;
          if (str.equals(this.ad))
          {
            localObject1 = Integer.toString(1);
            break;
          }
          if (!this.aa.containsKey(str)) {
            break label1167;
          }
          localObject1 = str;
          break;
          localObject3 = localObject2;
          break;
        case 112: 
          i3 = ((String)localObject3).length();
          localObject2 = new char[i3];
          i2 = 0;
          for (;;)
          {
            localObject1 = localObject2;
            i1 = i3;
            if (i2 >= localObject2.length) {
              break;
            }
            localObject2[i2] = b.w;
            i2 += 1;
          }
        case 97: 
          i3 = this.Code.d();
          i2 = ((String)localObject3).length();
          if (i2 > al.length)
          {
            localObject2 = new Integer(((String)localObject3).hashCode());
            if (this.au == null) {
              this.au = new Hashtable();
            }
            if (this.au.containsKey(localObject2))
            {
              localObject1 = (char[])this.au.get(localObject2);
              if ((!this.x) || (this.w)) {
                break label1154;
              }
              i1 = 1;
            }
          }
        case 83: 
        case 85: 
        case 120: 
        case 99: 
        case 114: 
        case 115: 
        case 102: 
          for (;;)
          {
            label326:
            if (i1 != 0)
            {
              ((String)localObject3).getChars(0, i2, (char[])localObject1, 0);
              i1 = Code((char[])localObject1, i2, i3, E(this.ag));
              this.au.put(localObject2, localObject1);
            }
            for (;;)
            {
              label522:
              break label234;
              localObject1 = new char[i2];
              i1 = 1;
              break label522;
              localObject1 = al;
              ((String)localObject3).getChars(0, i2, (char[])localObject1, 0);
              i1 = Code((char[])localObject1, i2, i3, E(this.ag));
              break label234;
              localObject1 = ((String)localObject3).toCharArray();
              i1 = localObject1.length;
              break label234;
              if (localObject1 != null)
              {
                i1 = 1;
                if ((i3 & 0x2) == 0) {
                  break label760;
                }
              }
              label760:
              for (i2 = 1; (i2 ^ i1) != 0; i2 = 0)
              {
                paramq.Code(this.ae + 1, this.af + 1, this.ae + this.ag - 2, this.af + this.ah - 2, 0);
                paramq.Code(this.ae + 1, this.af + this.ah - 2, this.ae + this.ag - 2, this.af + 1, 0);
                i1 = 0;
                localObject1 = null;
                break label234;
                i1 = 0;
                break label645;
              }
              if (localObject1 != null) {
                if (!((String)localObject1).equals(localObject2)) {
                  break;
                }
              }
              for (;;)
              {
                paramq.Code(this.ae + 1, this.af + 1, this.ag - 3, this.ah - 3, -90, 360, 4210752);
                i1 = 0;
                localObject1 = null;
                break label234;
                if ((i3 & 0x2) == 0) {
                  break;
                }
              }
              i4 = this.ak;
              this.ak = i1;
              i1 = z();
              localObject1 = "" + (String)localObject3 + "";
              localObject2 = new StringBuffer();
              for (;;)
              {
                if (i1 > 0)
                {
                  localObject3 = K();
                  str = K();
                  if (((String)localObject1).indexOf("" + (String)localObject3 + "") < 0) {
                    break label999;
                  }
                }
                label999:
                for (i2 = 1;; i2 = 0)
                {
                  if ((i3 & 0x4) != 0) {
                    break label1005;
                  }
                  if (i2 == 0) {
                    break label1033;
                  }
                  ((StringBuffer)localObject2).append(str).append("\n");
                  this.ak = i4;
                  localObject1 = ((StringBuffer)localObject2).toString().toCharArray();
                  i1 = localObject1.length;
                  break;
                }
                label1005:
                if (i2 != 0) {
                  ((StringBuffer)localObject2).append("*");
                }
                ((StringBuffer)localObject2).append(str).append("\n");
                label1033:
                i1 -= 1;
              }
              if ((this.Code.a == null) || (!this.Code.a.containsKey(str))) {
                break;
              }
              localObject2 = (String)((Object[])this.Code.a.get(str))[0];
              i1 = ((String)localObject2).lastIndexOf('/');
              localObject1 = localObject2;
              if (i1 >= 0)
              {
                localObject1 = localObject2;
                if (i1 < ((String)localObject2).length()) {
                  localObject1 = ((String)localObject2).substring(i1 + 1);
                }
              }
              localObject1 = ((String)localObject1).toCharArray();
              i1 = localObject1.length;
              break label234;
              i1 = i2;
            }
            i1 = 0;
          }
        }
      }
      label1154:
      label1167:
      localObject1 = null;
    }
  }
  
  private void Code(q paramq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    if (paramInt4 < 0) {
      return;
    }
    paramInt2 = a(paramArrayOfInt[(paramInt3 + 2)] & 0xFFFFFF) + paramInt2;
    int i11 = paramq.Code();
    int i12 = paramq.I();
    int i13 = paramq.Z();
    int i14 = paramq.J();
    paramq.I(paramInt1, paramInt2, this.s, a(this.M[(paramInt4 * 5 + 0)] + this.M[(paramInt4 * 5 + 1)]));
    int i15 = paramInt2 - a(this.M[(paramInt3 * 5 + 0)]);
    paramInt2 = 0;
    int i1 = 0;
    this.ak = 0;
    int i2;
    int i3;
    int i4;
    label148:
    int i5;
    if (!g.n())
    {
      i2 = i1;
      i3 = 2147483647;
      i4 = paramInt3;
      i1 = paramInt2;
      paramInt2 = i3;
      if (i4 <= paramInt4)
      {
        i5 = this.M[(i4 * 5 + 3)];
        label168:
        i3 = paramInt2;
        if (this.M[i5] == 0) {
          break label1767;
        }
        this.M[(i4 * 5 + 3)] = i5;
        if (this.M[(i5 + 1)] > this.ak)
        {
          paramInt2 = b.Code(paramInt2, this.ak, this.M[i5]);
          i3 = paramInt2;
          if (this.M[i5] != paramInt2) {
            break label1767;
          }
          i1 = this.M[(i5 + 2)];
          i2 = this.M[(i5 + 3)];
        }
      }
    }
    for (;;)
    {
      i4 += 1;
      break label148;
      i5 += 4;
      break label168;
      if (paramInt2 != 2147483647) {}
      for (i4 = paramInt2;; i4 = i3)
      {
        i5 = paramInt3;
        i3 = i4;
        int i6;
        while (i5 <= paramInt4)
        {
          i6 = this.M[(i5 * 5 + 3)];
          while ((this.M[i6] != 0) && (this.M[i6] <= this.P + i3))
          {
            this.M[(i5 * 5 + 3)] = i6;
            i3 = Math.max(i3, this.M[(i6 + 1)]);
            i6 += 4;
          }
          i5 += 1;
        }
        if (i4 == i3)
        {
          this.ak = paramInt2;
          i4 = i2;
          paramInt2 = i1;
          while ((this.ak < i3) && (!g.n()))
          {
            i5 = this.ak;
            i6 = E();
            if ((i6 == 83) || (i6 == 76) || (i6 == 77))
            {
              A(i6);
            }
            else
            {
              G();
              this.ae = (paramInt2 + this.ae);
              this.af += i4;
              paramInt2 = this.ae;
              int i10 = this.af;
              int i18 = this.ag;
              int i16 = this.ah;
              this.ag = a(this.ae + this.ag);
              this.ah = a(this.af + this.ah);
              this.ae = a(this.ae);
              this.af = a(this.af);
              this.ag -= this.ae;
              this.ah -= this.af;
              this.ae += paramInt1;
              this.af += i15;
              if (b.Code(this.ae, this.af, this.ag, this.ah, paramq.Code(), paramq.I(), paramq.Z(), paramq.J()))
              {
                int i17 = y();
                switch (i6)
                {
                }
                for (;;)
                {
                  i4 = i10;
                  break;
                  int i7 = D();
                  i4 = E();
                  if (i4 > 0)
                  {
                    switch (E())
                    {
                    default: 
                      this.ak = (D() + this.ak);
                    }
                    for (;;)
                    {
                      i4 -= 1;
                      break;
                      D();
                    }
                  }
                  i6 = D();
                  paramArrayOfInt = al;
                  if (i6 > al.length) {
                    paramArrayOfInt = new char[i6];
                  }
                  i4 = az.Code(this.W, this.ak, paramArrayOfInt, 0, i6);
                  this.ak = (i6 + this.ak);
                  Object localObject;
                  boolean bool;
                  label1037:
                  int[] arrayOfInt;
                  if ((this.Code.J.Z()) && (this.Code.J.Code(i5)) && (!u(i5)))
                  {
                    localObject = this.Code.J;
                    i6 = this.ae;
                    i8 = this.af;
                    i9 = this.ag;
                    if (!b.Code(paramArrayOfInt[0]))
                    {
                      bool = true;
                      ((y)localObject).Code(paramq, paramInt1, i15, i6, i8, i9, paramInt2, i10, i5, paramArrayOfInt, i4, i7, i16, bool);
                    }
                  }
                  else
                  {
                    if ((this.Code.Z.I(i5)) && (!u(i5))) {
                      this.Code.Z.Code(paramq, paramInt1, i15, i17);
                    }
                    Code(paramq, paramArrayOfInt, i4, i17, i7, i16);
                    if (this.aA == null) {
                      break label1232;
                    }
                    localObject = this.aA.I(i5);
                    if (localObject == null) {
                      break label1232;
                    }
                    i4 = 0;
                    if (i4 >= ((Vector)localObject).size()) {
                      break label1232;
                    }
                    arrayOfInt = (int[])((Vector)localObject).elementAt(i4);
                    if (arrayOfInt[9] != this.Code.C) {
                      break label1212;
                    }
                    i6 = 1;
                    label1077:
                    if (i6 == 0) {
                      break label1218;
                    }
                    i5 = 61030;
                    label1087:
                    if (i6 == 0) {
                      break label1226;
                    }
                  }
                  label1212:
                  label1218:
                  label1226:
                  for (i6 = 16777215;; i6 = 0)
                  {
                    i8 = this.ae;
                    i8 = a(arrayOfInt[3]) + i8;
                    i9 = this.af;
                    i9 = a(arrayOfInt[4]) + i9;
                    paramq.Z(i8, i9, a(arrayOfInt[5]), a(arrayOfInt[6]), i5);
                    b.Code(paramq, i7, paramArrayOfInt, arrayOfInt[1], arrayOfInt[2], i8, i9, i6, this.y, this.s, this.q);
                    i4 += 1;
                    break label1037;
                    bool = false;
                    break;
                    i6 = 0;
                    break label1077;
                    i5 = 16772710;
                    break label1087;
                  }
                  label1232:
                  i4 = i10;
                  break;
                  int i19 = A();
                  int i8 = -1;
                  i7 = -1;
                  i6 = E();
                  int i9 = 0;
                  i5 = 0;
                  i4 = 0;
                  if (i6 > 0)
                  {
                    switch (E())
                    {
                    default: 
                      this.ak += D();
                    }
                    for (;;)
                    {
                      i6 -= 1;
                      break;
                      int i20 = D();
                      i9 = y();
                      this.ak = (i20 - 4 + this.ak);
                      continue;
                      this.ak += 2;
                      i5 = D();
                      i4 = D();
                      continue;
                      D();
                      i8 = D();
                      i7 = D();
                    }
                  }
                  if ((this.ag > 0) && (this.ah > 0))
                  {
                    i6 = i9 + i7 * 1024 + i8;
                    if ((i8 != -1) && (i7 != -1)) {
                      if (this.u)
                      {
                        paramArrayOfInt = Code(i6, this.Q + i19, paramInt2, i10, i18, i16, 256, i8, i7);
                        label1479:
                        if (paramArrayOfInt == null) {
                          break label1648;
                        }
                        if (!this.w) {
                          break label1642;
                        }
                      }
                    }
                    label1642:
                    for (i6 = 0;; i6 = 1)
                    {
                      paramq.Code(paramArrayOfInt, this.ae, this.af, this.ag, this.ah, i5, i4, this.ag, this.ah, i6);
                      i4 = i10;
                      break;
                      paramArrayOfInt = Code(i6, this.Q + i19, paramInt2, i10, i18, i16, v(), i8, i7);
                      break label1479;
                      if (this.u)
                      {
                        paramArrayOfInt = Code(i6, this.Q + i19, paramInt2, i10, i18, i16, 256, -1, -1);
                        break label1479;
                      }
                      paramArrayOfInt = Code(i6, this.Q + i19, paramInt2, i10, i18, i16, v(), i18, i16);
                      break label1479;
                    }
                    label1648:
                    paramq.Z(this.ae, this.af, this.ag, this.ah, i17);
                    i4 = i10;
                    break;
                    paramq.J(this.ae, this.af, this.ag, this.ah, i17);
                    i4 = i10;
                    break;
                    Code(paramq, i17, i16);
                  }
                }
              }
              A(i6);
              i4 = i10;
            }
          }
          paramInt2 = i1;
          i1 = i2;
          break;
          paramq.Code(i11, i12, i13, i14);
          return;
        }
      }
      label1767:
      paramInt2 = i3;
    }
  }
  
  private void Code(q paramq, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    if (paramInt3 >= paramArrayOfInt[0]) {}
    int i1;
    do
    {
      return;
      i1 = Z(paramArrayOfInt, 2, paramInt5, paramInt3);
    } while (i1 == paramInt5);
    paramInt3 = i1;
    label34:
    int i2;
    int i3;
    if (!g.n())
    {
      if (i1 == paramInt5)
      {
        Code(paramq, paramInt1, paramInt2, paramInt3, i1 - 1, paramArrayOfInt);
        return;
      }
      this.M[(i1 * 5 + 3)] = this.M[(i1 * 5 + 2)];
      if ((paramArrayOfInt[(i1 + 2)] & 0x80000000) != 0) {
        break label164;
      }
      Code(paramq, paramInt1, paramInt2, paramInt3, i1 - 1, paramArrayOfInt);
      do
      {
        i2 = paramInt3 + 1;
        if (i2 == paramInt5) {
          break;
        }
        paramInt3 = i2;
      } while ((paramArrayOfInt[(i2 + 2)] & 0x80000000) == 0);
      i3 = i2 - 1;
    }
    label164:
    do
    {
      i1 = i3 + 1;
      paramInt3 = i2;
      break label34;
      break;
      i3 = i1;
      i2 = paramInt3;
    } while ((paramArrayOfInt[(i1 + 2)] & 0xFFFFFF) <= paramInt4);
    Code(paramq, paramInt1, paramInt2, paramInt3, i1 - 1, paramArrayOfInt);
  }
  
  private void Code(q paramq, char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 1;
    int i4 = Math.max(paramInt4 / b.C(paramInt3), 1);
    int i2 = 0;
    if ((i2 < paramInt1) && (i1 <= i4))
    {
      if (paramArrayOfChar[i2] == '\n') {}
      for (i3 = 1;; i3 = 0)
      {
        i1 += i3;
        i2 += 1;
        break;
      }
    }
    int i3 = i1;
    paramInt1 = i2;
    i2 = i3;
    if (paramInt1 > 0)
    {
      int i6 = this.af;
      int i5 = i2 - 1;
      int i7 = a(paramInt4 * i5 / i1);
      i2 = 0;
      i3 = paramInt1;
      if (i5 == 0) {
        i2 = 0;
      }
      for (;;)
      {
        i3 = paramInt1;
        if (paramInt1 > 0)
        {
          i3 = paramInt1;
          if (paramArrayOfChar[(i2 + paramInt1 - 1)] == '\r') {
            i3 = paramInt1 - 1;
          }
        }
        paramq.Code(paramInt3, paramArrayOfChar, i2, i3, this.ae, i6 + i7, paramInt2, this.u, this.y, this.s, this.q);
        paramInt1 = i2 - 1;
        i2 = i5;
        break;
        do
        {
          i4 = i2;
          paramInt1 = i3;
          if (paramArrayOfChar[(i3 - 1)] == '\n') {
            break;
          }
          i4 = i2 + 1;
          paramInt1 = i3 - 1;
          i2 = i4;
          i3 = paramInt1;
        } while (paramInt1 != 0);
        i2 = paramInt1;
        paramInt1 = i4;
      }
    }
  }
  
  private void Code(int[] paramArrayOfInt1, int paramInt, int[] paramArrayOfInt2)
  {
    int[][] arrayOfInt = this.aA.Code(this.Code.C);
    int i1 = 0;
    if (i1 < arrayOfInt.length)
    {
      int[] arrayOfInt1 = arrayOfInt[i1];
      if (i1 == 0)
      {
        paramArrayOfInt2[0] = (arrayOfInt1[3] + arrayOfInt1[7]);
        paramArrayOfInt2[2] = arrayOfInt1[5];
      }
      for (;;)
      {
        paramArrayOfInt2[1] = I(paramArrayOfInt1, 0, paramInt, arrayOfInt1[4] + arrayOfInt1[8]);
        paramArrayOfInt2[3] = arrayOfInt1[6];
        i1 += 1;
        break;
        paramArrayOfInt2[0] = Math.min(paramArrayOfInt2[0], arrayOfInt1[3] + arrayOfInt1[7]);
        paramArrayOfInt2[2] += arrayOfInt1[5];
      }
    }
  }
  
  private static boolean Code(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    boolean bool = true;
    int i2;
    int i1;
    switch (paramInt1)
    {
    default: 
      bool = false;
      return bool;
    case 0: 
      if (paramInt2 != 0)
      {
        i2 = paramArrayOfByte[0];
        paramInt1 = 0;
        i1 = 1;
      }
      break;
    case 2: 
    case 18: 
      while (paramInt1 < (i2 & 0xFF)) {
        try
        {
          int i3 = I(paramArrayOfByte, i1 + 0, paramInt2 - i1);
          if (i3 < 0) {
            break label266;
          }
          i1 += i3;
          i3 = I(paramArrayOfByte, i1 + 0, paramInt2 - i1);
          if (i3 <= 2) {
            break label266;
          }
          i1 += i3;
          i3 = Code(paramArrayOfByte, i1 + 0, paramInt2 - i1);
          if (i3 < 0) {
            break label266;
          }
          i1 += i3;
          i3 = Code(paramArrayOfByte, i1 + 0, paramInt2 - i1);
          if (i3 < 0) {
            break label266;
          }
          i1 += i3;
          paramInt1 += 1;
        }
        catch (Throwable paramArrayOfByte)
        {
          return false;
        }
      }
      return Code(paramArrayOfByte, paramInt2, false);
      return Code(paramArrayOfByte, paramInt2, true);
    }
    for (;;)
    {
      if (paramInt1 < 5)
      {
        i2 = I(paramArrayOfByte, i1, paramInt2 - i1);
        if (i2 >= 0)
        {
          i1 += i2;
          paramInt1 += 1;
        }
      }
      else
      {
        if (i1 == paramInt2) {
          break;
        }
        return false;
        if (i1 == paramInt2) {
          break;
        }
        label266:
        return false;
        return false;
        if (paramInt2 > 0) {
          break;
        }
        return false;
        paramInt1 = 0;
        i1 = 0;
      }
    }
  }
  
  private static boolean Code(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    if (paramInt == 0) {
      return false;
    }
    int i4 = paramArrayOfByte[0];
    int i3 = 0;
    int i2 = 1;
    while (i3 < (i4 & 0xFF))
    {
      int i1 = I(paramArrayOfByte, i2 + 0, paramInt - i2);
      if (i1 < 0) {
        return false;
      }
      i1 = i2 + i1;
      i2 = I(paramArrayOfByte, i1 + 0, paramInt - i1);
      if (i2 <= 2) {
        return false;
      }
      int i5 = i2 + i1;
      if (i5 == paramInt) {
        return false;
      }
      i2 = i5 + 1;
      i1 = i2;
      if (paramArrayOfByte[(i5 + 0)] != 0)
      {
        i1 = Code(paramArrayOfByte, i2 + 0, paramInt - i2);
        if (i1 < 0) {
          return false;
        }
        i1 = i2 + i1;
      }
      i2 = i1;
      if (paramBoolean)
      {
        i2 = I(paramArrayOfByte, i1 + 0, paramInt - i1);
        if (i2 < 0) {
          return false;
        }
        i2 = i1 + i2;
      }
      i3 += 1;
    }
    return i2 == paramInt;
  }
  
  private int D()
  {
    this.ak += 2;
    return I(this.ak - 2);
  }
  
  private int D(int paramInt)
  {
    return this.Code.c() * paramInt / this.q;
  }
  
  private int E()
  {
    int i1 = this.ak;
    this.ak = (i1 + 1);
    return Z(i1);
  }
  
  private int E(int paramInt)
  {
    return this.q * paramInt / this.s;
  }
  
  private int F(int paramInt)
  {
    this.ak = (paramInt + 1 + 1 + this.W[(paramInt + 1)] * 10);
    this.ak += 2;
    paramInt = z();
    this.ak = paramInt;
    return paramInt;
  }
  
  private void F()
  {
    this.ae = D();
    this.af = z();
    this.ag = D();
    this.ah = z();
  }
  
  private void G()
  {
    this.ae = ((short)D());
    this.af = A();
    this.ag = D();
    this.ah = z();
  }
  
  private void H()
  {
    this.ak = (D() + this.ak);
  }
  
  private static int I(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 2) {}
    int i1;
    do
    {
      return -1;
      i1 = az.Z(paramArrayOfByte, paramInt1);
    } while ((i1 + 2 > paramInt2) || (!az.I(paramArrayOfByte, paramInt1 + 2, i1)));
    return i1 + 2;
  }
  
  private int I(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 == 0) {}
    do
    {
      return -1;
      paramInt2 = b(paramInt3, paramInt2);
    } while ((paramArrayOfInt[(paramInt1 + paramInt2)] & 0x80000000) == 0);
    return paramInt3 - this.M[(paramInt2 * 5 + 0)] + (paramArrayOfInt[(paramInt2 + paramInt1)] & 0xFFFFFF);
  }
  
  private void J(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1;
    int i2;
    if (Z(paramInt1, paramInt2, paramInt3, paramInt4))
    {
      if (this.E <= 0) {
        break label118;
      }
      i1 = this.A;
      i2 = this.E;
      this.A = Math.min(this.A, paramInt1);
      this.E = (Math.max(paramInt1 + paramInt3, i1 + i2) - this.A);
      i1 = this.D;
      i2 = this.F;
      this.D = Math.min(this.D, paramInt2);
    }
    for (this.F = (Math.max(paramInt2 + paramInt4, i1 + i2) - this.D);; this.F = paramInt4)
    {
      B(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
      label118:
      this.A = paramInt1;
      this.D = paramInt2;
      this.E = paramInt3;
    }
  }
  
  static boolean J(int paramInt1, int paramInt2)
  {
    if (g.Code.m())
    {
      String str = g.c.Code(paramInt1, paramInt2);
      if (!g.c.B(str)) {
        return true;
      }
      return g.c.Z(str);
    }
    return false;
  }
  
  private String K()
  {
    String str = J(this.ak);
    H();
    return str;
  }
  
  private String L()
  {
    String str2 = K();
    String str1 = str2;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() > 0)
      {
        str1 = str2;
        if (str2.charAt(0) == 0) {
          str1 = this.d + str2.substring(1, str2.length());
        }
      }
    }
    return str1;
  }
  
  private boolean M()
  {
    if (!this.O) {}
    while (this.Code.b() != this) {
      return false;
    }
    return true;
  }
  
  private void N()
  {
    this.O = false;
    g.Z.I = new int[this.N + 2];
    int i1 = 2;
    int i2 = 0;
    if (i2 < this.N)
    {
      int i4 = this.M[(i2 * 5 + 4)];
      int[] arrayOfInt = g.Z.I;
      int i3;
      if ((i4 & 0x1) != 0)
      {
        i3 = -2147483648;
        label62:
        if ((i4 & 0x2) == 0) {
          break label98;
        }
      }
      label98:
      for (i4 = 1073741824;; i4 = 0)
      {
        arrayOfInt[i1] = (i4 | i3);
        i2 += 1;
        i1 += 1;
        break;
        i3 = 0;
        break label62;
      }
    }
    g.Z.b(g.Z.n());
    g.I.Code(this.Code.C(), 23);
  }
  
  private native void O();
  
  private void P()
  {
    O();
    if (Q())
    {
      this.Code.a();
      g.I.Code(this.Code.C(), 22);
    }
  }
  
  private boolean Q()
  {
    return this.E > 0;
  }
  
  private void R()
  {
    int i1 = E();
    while (i1 > 0)
    {
      this.ak += 1;
      this.ak = (D() + this.ak);
      i1 -= 1;
    }
  }
  
  private void S()
  {
    if (this.p)
    {
      this.p = false;
      this.Code.a();
      g.I.Code(this.Code.C(), 29);
    }
  }
  
  private boolean T()
  {
    return (this.aA != null) && (this.aA.Code());
  }
  
  private int Z(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    int i2;
    for (;;)
    {
      try
      {
        i1 = b.Code(paramArrayOfInt, paramInt1, paramInt2, 1, 16777215, paramInt3);
        break;
      }
      finally
      {
        paramArrayOfInt = finally;
        throw paramArrayOfInt;
      }
      if (i2 < paramInt2)
      {
        paramInt3 = paramArrayOfInt[(paramInt1 + i2)];
        if ((paramInt3 & 0x80000000) == 0) {
          i2 += 1;
        }
      }
      else
      {
        return i2;
      }
    }
    for (;;)
    {
      i2 = i1;
      if (i1 <= 0) {
        break;
      }
      if ((i1 != paramInt2) && ((paramArrayOfInt[(paramInt1 + i1)] & 0xFFFFFF) != (paramArrayOfInt[(paramInt1 + i1 - 1)] & 0xFFFFFF)))
      {
        i2 = i1;
        if ((paramArrayOfInt[(paramInt1 + i1)] & 0xFFFFFF) <= paramInt3) {
          break;
        }
      }
      i1 -= 1;
    }
  }
  
  private void Z(boolean paramBoolean)
  {
    int i2 = 0;
    int i1 = 0;
    if (i2 < this.ap.J)
    {
      if (this.t) {
        if ((this.ap.I[i2] != null) && (!s(i1))) {
          this.ap.Code(i2, true, true);
        }
      }
      for (;;)
      {
        i2 += 1;
        i1 += 6;
        break;
        this.ap.Code(i2, true, false);
        continue;
        if ((this.ap.Z[i2] != null) && (!s(i1))) {
          this.ap.Code(i2, true, true);
        } else if ((!paramBoolean) && (this.ap.I[i2] != null)) {
          this.ap.Code(i2, false, true);
        }
      }
    }
  }
  
  private boolean Z(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 1;
    while (i1 < this.v[0])
    {
      if (b.Code(paramInt1, paramInt2, paramInt3, paramInt4, this.v[(i1 + 0)], this.v[(i1 + 1)], this.v[(i1 + 2)], this.v[(i1 + 3)])) {
        return true;
      }
      i1 += 4;
    }
    return false;
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    return this.q * paramInt1 / paramInt2;
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    int i2 = 0;
    try
    {
      this.ak = paramInt3;
      E();
      int i1 = E();
      g.Z.Z(paramInt1);
      g.Z.J(paramInt2);
      g.Z.I = new int[i1 * 4];
      int i3 = this.ak;
      paramInt2 = 0;
      paramInt1 = i2;
      while (paramInt1 < i1)
      {
        F();
        arrayOfInt = g.Z.I;
        i2 = paramInt2 + 1;
        arrayOfInt[paramInt2] = this.ae;
        arrayOfInt = g.Z.I;
        paramInt2 = i2 + 1;
        arrayOfInt[i2] = this.af;
        arrayOfInt = g.Z.I;
        i2 = paramInt2 + 1;
        arrayOfInt[paramInt2] = this.ag;
        arrayOfInt = g.Z.I;
        paramInt2 = i2 + 1;
        arrayOfInt[i2] = this.ah;
        paramInt1 += 1;
      }
      i2 = g.Z.n();
      int i4 = g.Z.Z();
      paramInt1 = g.Z.J();
      g.Z.Z(0);
      g.Z.J(0);
      int i5 = v(paramInt1);
      int[] arrayOfInt = g.Z.I;
      this.ak = i3;
      paramInt2 = 1;
      paramInt1 = i1;
      while (paramInt1 > 0)
      {
        F();
        this.af = I(arrayOfInt, 0, i5, this.af);
        g.Z.Z(i2, paramInt2, this.af);
        paramInt2 += 4;
        paramInt1 -= 1;
      }
      this.ak = (D() + this.ak);
      R();
      g.Z.B(i4, 3, paramInt3);
      g.Z.B(i4, 4, 16);
      g.Z.B(i4, 5, 0);
      g.Z.J(i4, 2, i2);
      return i4;
    }
    finally {}
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    try
    {
      int i1 = b.Code(this.M, paramInt2, 5, paramInt1);
      while (i1 > 0)
      {
        if ((i1 != paramInt2) && (this.M[(i1 * 5 + 0)] != this.M[((i1 - 1) * 5 + 0)]))
        {
          int i2 = this.M[(i1 * 5 + 0)];
          if (i2 <= paramInt1) {
            break;
          }
        }
        i1 -= 1;
      }
      return i1;
    }
    finally {}
  }
  
  private int[] c(int paramInt1, int paramInt2)
  {
    int i1 = 1;
    Object localObject = this.aA.I(paramInt1);
    if ((localObject != null) && (paramInt2 < ((Vector)localObject).size()))
    {
      int[] arrayOfInt1 = (int[])((Vector)localObject).elementAt(paramInt2);
      int[] arrayOfInt2 = new int[arrayOfInt1.length + 2];
      System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
      int i2 = arrayOfInt1.length;
      if (arrayOfInt1[9] == this.Code.C)
      {
        paramInt2 = 1;
        arrayOfInt2[i2] = paramInt2;
        localObject = (int[])((Vector)localObject).elementAt(((Vector)localObject).size() - 1);
        paramInt2 = arrayOfInt1.length;
        if (paramInt1 != localObject[0]) {
          break label163;
        }
        paramInt1 = arrayOfInt1[1];
        i2 = arrayOfInt1[2];
        int i3 = localObject[1];
        if (i2 + paramInt1 != localObject[2] + i3) {
          break label163;
        }
      }
      label163:
      for (paramInt1 = i1;; paramInt1 = 0)
      {
        arrayOfInt2[(paramInt2 + 1)] = paramInt1;
        return arrayOfInt2;
        paramInt2 = 0;
        break;
      }
    }
    return null;
  }
  
  private Object q(int paramInt)
  {
    paramInt = this.Q + paramInt;
    if (!r(paramInt)) {
      return null;
    }
    try
    {
      Object localObject = g.Code.r().Code(this.W, paramInt + 2, az.Z(this.W, paramInt));
      return localObject;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  private boolean r()
  {
    int i2 = 8;
    int i1 = 0;
    if (i1 < 4) {
      if (i2 + 2 < this.Y) {}
    }
    while (this.Y < i2 + 6)
    {
      return false;
      i2 += I(i2) + 2;
      i1 += 1;
      break;
    }
    return true;
  }
  
  private boolean r(int paramInt)
  {
    return (paramInt + 2 <= this.Y) && (az.Z(this.W, paramInt) + paramInt <= this.Y);
  }
  
  private native void s();
  
  private boolean s(int paramInt)
  {
    return Z(this.ap.Code[(paramInt + 2)] & 0x3FFFFFFF, this.ap.Code[(paramInt + 3)], this.ap.Code[(paramInt + 4)] >>> 16, this.ap.Code[(paramInt + 4)] & 0xFFFF);
  }
  
  private void t()
  {
    boolean bool2 = true;
    for (;;)
    {
      try
      {
        this.ak = 0;
        this.b = E();
        this.q = D();
        this.r = z();
        this.j = D();
        if ((this.k & 0x1) != 0) {
          this.j = 0;
        }
        this.f = this.ak;
        this.ak = (D() + this.ak);
        int i1 = D();
        if (i1 > 0)
        {
          this.g = new byte[i1];
          byte[] arrayOfByte = this.g;
          System.arraycopy(this.W, this.ak, arrayOfByte, 0, i1);
          this.ak = (i1 + this.ak);
        }
        this.e = this.ak;
        this.d = K();
        this.c = L();
        i1 = E();
        if ((i1 & 0x1) != 0)
        {
          bool1 = true;
          this.L = bool1;
          this.n = ((i1 & 0x6) >>> 1);
          if ((i1 & 0x10) == 0) {
            break label248;
          }
          bool1 = true;
          this.i = bool1;
          if (!this.an)
          {
            if ((i1 & 0x8) == 0) {
              break label253;
            }
            bool1 = bool2;
            b.p = bool1;
          }
          this.V = D();
          this.Q = z();
          this.X = this.ak;
          return;
        }
      }
      finally {}
      boolean bool1 = false;
      continue;
      label248:
      bool1 = false;
      continue;
      label253:
      bool1 = false;
    }
  }
  
  private void t(int paramInt)
  {
    J(this.ap.Code[(paramInt + 2)] & 0x3FFFFFFF, this.ap.Code[(paramInt + 3)], this.ap.Code[(paramInt + 4)] >>> 16, this.ap.Code[(paramInt + 4)] & 0xFFFF);
  }
  
  private void u()
  {
    int i2 = 0;
    int i1 = 0;
    while (i2 < this.ap.J)
    {
      if ((this.ap.I[i2] != null) || (this.ap.Z[i2] != null))
      {
        int[] arrayOfInt = this.ap.Code;
        int i3 = i1 + 2;
        arrayOfInt[i3] |= -2147483648;
        this.ap.Code(i2, true, true);
      }
      i2 += 1;
      i1 += 6;
    }
  }
  
  private boolean u(int paramInt)
  {
    paramInt += 17;
    int i1 = paramInt + 1;
    paramInt = Z(paramInt);
    while (paramInt > 0)
    {
      int i2 = i1 + 1;
      if ((Z(i1) == 116) && (J(i2).equals("s"))) {
        return true;
      }
      i1 = I(i2) + 2 + i2;
      paramInt -= 1;
    }
    return false;
  }
  
  private int v()
  {
    return this.Code.c() * 256 / this.q;
  }
  
  private static int v(int paramInt)
  {
    int i1 = g.Z.o(paramInt) - 2;
    g.Z.Code(paramInt, 2, i1, true);
    return i1;
  }
  
  private static int w(int paramInt)
  {
    int i1 = g.Z.o(paramInt);
    g.Z.Code(paramInt, 0, i1, true);
    return i1 - 2;
  }
  
  private boolean w()
  {
    for (;;)
    {
      int i2;
      int i4;
      boolean bool1;
      int i6;
      try
      {
        br[] arrayOfbr;
        if (this.t)
        {
          arrayOfbr = this.ap.I;
          if (this.t)
          {
            i1 = 256;
            break label467;
            if (i2 >= this.ap.J) {
              continue;
            }
            if (arrayOfbr[i2] != null) {
              break label489;
            }
            if (((this.ap.Code[(i3 + 2)] & 0x80000000) != 0) || (!s(i3)) || (!r(this.ap.Code[(i3 + 1)]))) {
              break label501;
            }
            i4 = 1;
            if (i4 == 0) {
              break label489;
            }
            if ((!this.aq) || (this.ap.Code[(i3 + 5)] != 0)) {
              break label507;
            }
            bool1 = true;
            bool2 = bool1;
            if (this.ap.B <= 0) {
              continue;
            }
            int i7 = this.ap.Code[(i3 + 1)];
            i5 = this.ap.Code[(i3 + 5)] >>> 16;
            i6 = this.ap.Code[(i3 + 5)] & 0xFFFF;
            int[] arrayOfInt = as;
            byte[] arrayOfByte = this.W;
            int i8 = az.Z(this.W, i7);
            i4 = i5;
            if (i5 != 0) {
              break label474;
            }
            i4 = -1;
            break label474;
            b.Code(arrayOfByte, i7 + 2, i8, i1, i4, i5, arrayOfInt);
            if (this.ap.I(as[2])) {
              continue;
            }
            arrayOfInt = this.ap.Code;
            i4 = i3 + 2;
            arrayOfInt[i4] |= -2147483648;
            t(i3);
            break label489;
          }
        }
        else
        {
          arrayOfbr = this.ap.Z;
          continue;
        }
        int i1 = v();
        break label467;
        boolean bool2 = bool1;
        if (bool1)
        {
          bool2 = bool1;
          if (i1 != 256)
          {
            bool2 = bool1;
            if (!this.ap.I(as[0] + as[1])) {
              bool2 = false;
            }
          }
        }
        ao.Code(this.ap.Code[(i3 + 0)], this.ap.Code[(i3 + 1)], i1, this.ap.Code[(i3 + 2)] & 0x3FFFFFFF, this.ap.Code[(i3 + 3)], this.ap.Code[(i3 + 5)] >>> 16, this.ap.Code[(i3 + 5)] & 0xFFFF, bool2);
        bool1 = true;
        return bool1;
        bool1 = false;
        continue;
        i2 = 0;
      }
      finally {}
      label467:
      int i3 = 0;
      continue;
      label474:
      int i5 = i6;
      if (i6 == 0)
      {
        i5 = -1;
        continue;
        label489:
        i2 += 1;
        i3 += 6;
        continue;
        label501:
        i4 = 0;
        continue;
        label507:
        bool1 = false;
      }
    }
  }
  
  private int x(int paramInt)
  {
    return g.Z.Code(this.W, paramInt + 2, az.Z(this.W, paramInt));
  }
  
  private void x()
  {
    if ((this.ap.B > 0) && (this.ap.C > 0)) {
      this.ap.Code(this.ap.B + this.ap.C, 0);
    }
    this.Z = null;
  }
  
  private int y()
  {
    this.ak += 4;
    int i1 = this.ak - 4;
    int i2 = this.W[i1];
    int i3 = this.W[(i1 + 1)];
    int i4 = this.W[(i1 + 2)];
    return (this.W[(i1 + 3)] & 0xFF) + ((i2 << 24) + ((i3 & 0xFF) << 16) + ((i4 & 0xFF) << 8));
  }
  
  private int y(int paramInt)
  {
    paramInt = z(paramInt);
    if (M())
    {
      g.I.B();
      N();
    }
    return paramInt;
  }
  
  private int z()
  {
    this.ak += 3;
    return Code(this.ak - 3);
  }
  
  private int z(int paramInt)
  {
    int i1;
    int i3;
    try
    {
      this.Code.I();
      try
      {
        this.ak = paramInt;
        if (((this.ak >= this.W.length) || (this.Y != this.W.length)) && (this.ak >= this.Y - 16)) {
          break label941;
        }
        i2 = this.ak;
        i1 = E();
        switch (i1)
        {
        case 83: 
          G();
          A(i1);
          if (this.ak > this.Y) {
            break;
          }
          this.ae += this.ai;
          this.af += this.aj;
          i3 = this.ak;
          paramInt = b(this.af, this.N);
          i1 = this.M[(paramInt * 5 + 2)];
          while (this.M[(i1 + 4)] != 0) {
            i1 += 4;
          }
          this.ak = (z() + this.ak);
        case 76: 
          for (;;)
          {
            label161:
            label203:
            paramInt = this.ak;
            break;
            z();
            this.R = z();
            this.S = z();
          }
          localObject2 = finally;
        }
      }
      finally
      {
        this.Code.Z();
        O();
      }
      i1 = E();
    }
    finally {}
    int i2 = z();
    if (this.ak + i2 <= this.Y) {
      switch (i1)
      {
      }
    }
    for (;;)
    {
      this.ak += i2;
      break label203;
      this.am = (this.ak - 3);
      this.ak += i2;
      break label203;
      this.N = ((i2 - 8) / 6);
      this.M = new int[D() * 4 + this.N * 6];
      this.P = E();
      this.G = D();
      this.H = z();
      this.K = true;
      paramInt = this.N;
      i1 = 0;
      i2 = paramInt * 5;
      paramInt = 0;
      while (paramInt / 5 < this.N)
      {
        i3 = z();
        this.M[(paramInt + 0)] = i1;
        this.M[(paramInt + 1)] = i3;
        this.M[(paramInt + 2)] = i2;
        this.M[(paramInt + 4)] = E();
        i2 += D() * 4 + 1;
        i1 += i3;
        paramInt += 5;
      }
      this.O = true;
      break label203;
      this.T = new int[i2 / 12 * 5];
      paramInt = 0;
      while (paramInt < this.T.length)
      {
        this.T[(paramInt + 0)] = z();
        this.T[(paramInt + 1)] = z();
        this.T[(paramInt + 2)] = (z() - this.T[(paramInt + 0)]);
        this.T[(paramInt + 3)] = (z() - this.T[(paramInt + 1)]);
        paramInt += 5;
      }
      this.o = new int[4];
      paramInt = 0;
      while (paramInt < 3)
      {
        this.o[paramInt] = D();
        paramInt += 1;
      }
      this.o[3] = E();
      this.p = true;
      break label203;
      this.U = new int[i2 / 11 * 5];
      paramInt = 0;
      while (paramInt < this.U.length)
      {
        this.U[(paramInt + 0)] = E();
        this.U[(paramInt + 1)] = z();
        this.U[(paramInt + 2)] = z();
        this.U[(paramInt + 3)] = D();
        this.U[(paramInt + 4)] = D();
        paramInt += 5;
      }
      paramInt = y();
      if (this.an) {
        break label203;
      }
      ab localab = this.Code;
      localab.d = (paramInt + localab.d);
      break label203;
      if (this.M[(i1 + 0)] == 0) {
        B(i1, i2, i3);
      }
      for (;;)
      {
        paramInt += 1;
        if ((paramInt < this.N) && (this.af + this.ah > this.M[(paramInt * 5 + 0)])) {
          break label956;
        }
        this.ai = this.ae;
        this.aj = this.af;
        J(this.ae, this.af, this.ag, this.ah);
        break;
        if (this.M[(i1 + 1)] + this.P >= i2) {
          this.M[(i1 + 1)] = i3;
        } else {
          B(i1 + 4, i2, i3);
        }
      }
      label941:
      this.Code.Z();
      O();
      return paramInt;
      label956:
      break label161;
      break;
    }
  }
  
  final J B(int paramInt)
  {
    int i3 = 0;
    J localJ = null;
    for (;;)
    {
      try
      {
        int i9 = this.ak;
        int i10 = this.ae;
        int i11 = this.af;
        i1 = -1;
        this.ak = this.X;
        i2 = 0;
        int i7 = 0;
        int i6 = 0;
        int i8;
        int i12;
        if (this.ak < paramInt)
        {
          i8 = this.ak;
          i12 = E();
        }
        switch (i12)
        {
        case 66: 
          A(i12);
          i4 = i3;
          i3 = i1;
          i1 = i4;
          break;
        case 70: 
        case 73: 
        case 84: 
          G();
          i2 += this.ae;
          i3 += this.af;
          i5 = i3;
          i4 = i2;
          if (i12 != 84) {
            break label250;
          }
          i5 = i3;
          i4 = i2;
          if (u(i8)) {
            break label250;
          }
          i7 = i3;
          i6 = i2;
          i1 = i3;
          i3 = i8;
          continue;
          if (i1 > 0) {
            localJ = new J(this, i1, i6, i7);
          }
          this.ae = i10;
          this.af = i11;
          this.ak = i9;
          return localJ;
        }
      }
      finally {}
      int i4 = i2;
      int i5 = i3;
      label250:
      i3 = i1;
      int i1 = i5;
      int i2 = i4;
    }
  }
  
  final void B(int paramInt1, int paramInt2)
  {
    try
    {
      g.Z.Code(paramInt2, 0, 5, false);
      System.arraycopy(this.M, paramInt1 * 5, g.Z.I, 0, 5);
      g.Z.o();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final boolean B()
  {
    if (this.Z != null) {
      try
      {
        x();
        return true;
      }
      finally {}
    }
    return false;
  }
  
  final int C()
  {
    return this.V;
  }
  
  final void C(int paramInt)
  {
    int i2 = 0;
    for (;;)
    {
      int i1;
      try
      {
        int i3 = w(paramInt);
        int[] arrayOfInt = g.Z.I;
        arrayOfInt[1] = 0;
        paramInt = 0;
        if (paramInt < i3)
        {
          arrayOfInt[(paramInt + 2)] = (arrayOfInt[(paramInt + 2)] & 0xFF000000 | i2);
          i1 = i2;
          if ((arrayOfInt[(paramInt + 2)] & 0x80000000) != 0)
          {
            i2 += this.M[(paramInt * 5 + 1)];
            i1 = i2;
            if ((arrayOfInt[(paramInt + 2)] & 0x40000000) == 0)
            {
              arrayOfInt[1] += this.M[(paramInt * 5 + 1)];
              i1 = i2;
            }
          }
        }
        else
        {
          arrayOfInt[0] = i2;
          g.Z.o();
          return;
        }
      }
      finally {}
      paramInt += 1;
      i2 = i1;
    }
  }
  
  final boolean C(int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    int i1;
    try
    {
      boolean bool2 = Q();
      if (!bool2) {}
      for (;;)
      {
        return bool1;
        i1 = w(paramInt2);
        int[] arrayOfInt = g.Z.I;
        paramInt2 = I(arrayOfInt, 2, i1, this.D);
        i1 = I(arrayOfInt, 2, i1, this.D + this.F);
        if (paramInt2 != i1) {
          break;
        }
        this.E = 0;
      }
      if (paramInt2 >= 0) {
        break label171;
      }
    }
    finally {}
    paramInt2 = Math.max(i1 - this.F, 0);
    for (;;)
    {
      g.Z.Code(paramInt1, 0, 4, false);
      g.Z.I[0] = this.A;
      g.Z.I[1] = paramInt2;
      g.Z.I[2] = this.E;
      g.Z.I[3] = (i1 - paramInt2);
      g.Z.o();
      this.E = 0;
      bool1 = true;
      break;
      label171:
      if (i1 < 0) {
        i1 = Math.min(this.F + paramInt2, localObject[0]);
      }
    }
  }
  
  final int Code()
  {
    return this.W.length;
  }
  
  final int Code(int paramInt)
  {
    return Code(this.W, paramInt);
  }
  
  final int Code(int paramInt, char paramChar)
  {
    int i2 = 0;
    int i1 = 0;
    for (;;)
    {
      try
      {
        paramInt = this.W[(paramInt + 1)] * 10 + 2 + paramInt;
        char c1;
        if (paramChar == 0)
        {
          paramChar = I(paramInt);
          paramInt += 2;
          paramChar += paramInt;
          g.Z.I = new int[(paramChar - paramInt) / 3];
          c1 = paramInt;
          paramInt = i1;
          if (c1 < paramChar)
          {
            i1 = c1 + '\001';
            c1 = Z(c1);
            i2 = I(i1);
            g.Z.I[paramInt] = (c1 << '\020' | i2);
            paramInt += 1;
            c1 = i1 + 2;
            continue;
          }
        }
        else
        {
          paramInt = I(paramInt) + 2 + 1 + paramInt;
          c1 = this.W[(paramInt - 1)];
          if (c1 <= 0) {
            break label217;
          }
          int i3 = paramInt + 1;
          if (Z(paramInt) == paramChar)
          {
            paramChar = I(i3);
            paramInt = i3 + 2;
            paramChar += paramInt;
            if (paramChar >= paramInt) {
              break label214;
            }
            paramInt = i2;
            return paramInt;
          }
          paramInt = I(i3) + 2 + i3;
          c1 -= '\001';
          continue;
        }
        paramInt = g.Z.n();
        continue;
        continue;
      }
      finally {}
      label214:
      label217:
      paramChar = '\000';
    }
  }
  
  final int Code(int paramInt1, int paramInt2)
  {
    for (;;)
    {
      int i1;
      try
      {
        i1 = this.av;
        if (i1 == -1)
        {
          paramInt1 = 0;
          return paramInt1;
        }
        int i2 = v(paramInt2);
        int[] arrayOfInt = g.Z.I;
        this.ak = this.av;
        if (this.ak > this.S) {
          break label217;
        }
        this.av = this.ak;
        this.ak += 1;
        i1 = E();
        if (i1 > 0)
        {
          F();
          this.af = I(arrayOfInt, 0, i2, this.af);
          if (this.af < 0) {
            this.ak += (i1 - 1) * 10;
          }
        }
        else
        {
          this.ak = (D() + this.ak);
          R();
          continue;
        }
        if (!b.Code(this.aw, this.ax, this.ay, this.az, this.ae, this.af, this.ag, this.ah)) {
          break label210;
        }
      }
      finally {}
      a(paramInt1, paramInt2, this.av);
      this.av = this.ak;
      paramInt1 = 1;
      continue;
      label210:
      i1 -= 1;
      continue;
      label217:
      paramInt1 = 0;
    }
  }
  
  final int Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.T == null) {
      return 0;
    }
    int i2 = v(paramInt5);
    int[] arrayOfInt = g.Z.I;
    int i1 = 0;
    paramInt5 = 0;
    if (i1 < this.T.length)
    {
      this.T[(i1 + 4)] = I(arrayOfInt, 0, i2, this.T[(i1 + 1)]);
      if ((this.T[(i1 + 4)] >= 0) && (b.Code(paramInt4, paramInt3, paramInt2, paramInt1, this.T[(i1 + 0)], this.T[(i1 + 4)], this.T[(i1 + 2)], this.T[(i1 + 3)]))) {
        paramInt5 += 1;
      }
      for (;;)
      {
        i1 += 5;
        break;
        this.T[(i1 + 4)] = -1;
      }
    }
    g.Z.I = new int[paramInt5 * 4];
    paramInt2 = 0;
    paramInt1 = 0;
    while (paramInt1 < this.T.length)
    {
      paramInt3 = paramInt2;
      if (this.T[(paramInt1 + 4)] >= 0)
      {
        arrayOfInt = g.Z.I;
        paramInt3 = paramInt2 + 1;
        arrayOfInt[paramInt2] = this.T[(paramInt1 + 0)];
        arrayOfInt = g.Z.I;
        paramInt2 = paramInt3 + 1;
        arrayOfInt[paramInt3] = this.T[(paramInt1 + 4)];
        arrayOfInt = g.Z.I;
        paramInt4 = paramInt2 + 1;
        arrayOfInt[paramInt2] = this.T[(paramInt1 + 2)];
        arrayOfInt = g.Z.I;
        paramInt3 = paramInt4 + 1;
        arrayOfInt[paramInt4] = this.T[(paramInt1 + 3)];
      }
      paramInt1 += 5;
      paramInt2 = paramInt3;
    }
    return g.Z.n();
  }
  
  final int Code(int paramInt, int[] paramArrayOfInt)
  {
    this.ak = paramInt;
    while (this.ak < this.Y)
    {
      paramInt = this.ak;
      int i1 = E();
      switch (i1)
      {
      }
      while (i1 == 84)
      {
        return paramInt;
        G();
        this.ae += paramArrayOfInt[0];
        this.af += paramArrayOfInt[1];
        paramArrayOfInt[0] = this.ae;
        paramArrayOfInt[1] = this.af;
      }
      A(i1);
    }
    return -1;
  }
  
  final int Code(Object paramObject, int paramInt)
  {
    try
    {
      paramInt = ((int[])((Object[])paramObject)[2])[paramInt];
      paramInt = x(paramInt + az.Z(this.W, paramInt) + 2);
      return paramInt;
    }
    finally
    {
      paramObject = finally;
      throw paramObject;
    }
  }
  
  final int Code(Object paramObject, ax paramax, int paramInt)
  {
    try
    {
      this.ak = ((int[])((Object[])paramObject)[2])[paramInt];
      H();
      paramInt = paramax.Code(K());
      return paramInt;
    }
    finally
    {
      paramObject = finally;
      throw paramObject;
    }
  }
  
  public final int Code(String paramString, int[] paramArrayOfInt, int paramInt)
  {
    int i3 = 0;
    int i2 = 0;
    if (paramArrayOfInt != null) {}
    for (;;)
    {
      try
      {
        i1 = v(paramInt);
        int[] arrayOfInt = g.Z.I;
        if ((paramString.equals(this.Code.B)) && (this.aA != null))
        {
          boolean bool = this.aA.Code();
          if (!bool)
          {
            paramInt = i2;
            return paramInt;
          }
          paramString = this.Code;
          paramInt = i3;
          if (this.Code.C < this.aA.I() - 1) {
            paramInt = this.Code.C + 1;
          }
          paramString.C = paramInt;
          if (paramArrayOfInt != null) {
            Code(arrayOfInt, i1, paramArrayOfInt);
          }
          if (this.Code.C == 0) {
            break label245;
          }
          paramInt = 1;
          continue;
        }
        if (this.aA != null) {
          m();
        }
        this.Code.B = paramString;
        this.aA = new bt();
        this.aA.Code(this, this.X, paramString);
        paramInt = i2;
        if (!this.aA.Code()) {
          continue;
        }
        if (this.Code.C == -1) {
          this.Code.C = 0;
        }
        if (paramArrayOfInt != null) {
          Code(arrayOfInt, i1, paramArrayOfInt);
        }
        paramInt = 1;
        continue;
        arrayOfInt = null;
      }
      finally {}
      int i1 = 0;
      continue;
      label245:
      paramInt = 2;
    }
  }
  
  final J Code(int paramInt1, int paramInt2, int paramInt3)
  {
    int i1;
    int i3;
    try
    {
      i1 = this.ak;
      int i2 = this.ae;
      i3 = this.af;
      int[] arrayOfInt = new int[4];
      arrayOfInt[0] = paramInt2;
      arrayOfInt[1] = paramInt3;
      arrayOfInt[2] = 0;
      arrayOfInt[3] = 0;
      J localJ1 = null;
      while ((localJ1 == null) && (paramInt1 != -1))
      {
        this.ak = (paramInt1 + 1 + 10);
        A(84);
        paramInt2 = Code(this.ak, arrayOfInt);
        paramInt1 = paramInt2;
        if (paramInt2 != -1)
        {
          paramInt1 = paramInt2;
          if (!u(paramInt2))
          {
            localJ1 = new J(this, paramInt2, arrayOfInt[0], arrayOfInt[1]);
            paramInt1 = paramInt2;
          }
        }
      }
      this.ae = i2;
    }
    finally {}
    this.af = i3;
    this.ak = i1;
    return localJ2;
  }
  
  final void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.R == 0)
    {
      this.av = -1;
      return;
    }
    this.av = this.R;
    this.aw = paramInt4;
    this.ax = paramInt3;
    this.ay = paramInt2;
    this.az = paramInt1;
  }
  
  final void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean) {
      localObject1 = at;
    }
    for (;;)
    {
      int i1 = 0;
      if (i1 <= g.b) {
        try
        {
          localObject1 = Code(paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, (br[])localObject1);
          Object localObject5;
          Object localObject2;
          label238:
          Object localObject4;
          for (;;)
          {
            if ((localObject1 == null) && (i1 <= 0)) {}
          }
        }
        catch (Throwable localThrowable)
        {
          try
          {
            paramInt1 = this.ap.Z(paramInt1);
            if (localObject1 != null)
            {
              localObject5 = this.ap;
              if (paramInt3 != 256) {
                break label238;
              }
            }
            for (paramBoolean = true;; paramBoolean = false)
            {
              if (!((ae)localObject5).Code(paramInt1, paramBoolean, (br)localObject1, at[0]))
              {
                localObject1 = this.ap.Code;
                paramInt2 = paramInt1 * 6 + 2;
                localObject1[paramInt2] |= -2147483648;
              }
              t(paramInt1 * 6);
              at[0] = null;
              return;
              localObject1 = null;
              break;
              localThrowable = localThrowable;
              at[0] = null;
              localObject2 = null;
              if (i1 == g.b) {
                break label251;
              }
              if ((this.B) && (this.Z != null)) {
                x();
              }
              g.I.B();
              localObject5 = this.Code.Code;
              if (i1 > 0) {}
              for (paramBoolean = true;; paramBoolean = false)
              {
                ((g)localObject5).Code(paramBoolean);
                g.I.C();
                i1 += 1;
                break;
              }
            }
            localObject4 = null;
          }
          finally {}
        }
      }
    }
  }
  
  final void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt6, int paramInt7, int paramInt8)
  {
    int i4;
    int[] arrayOfInt2;
    int i3;
    Object localObject3;
    label206:
    label238:
    int i1;
    label241:
    int i2;
    int i5;
    for (;;)
    {
      int[] arrayOfInt1;
      try
      {
        this.v[0] = (paramInt2 * 4);
        if (this.v[0] > this.v.length)
        {
          this.v = new int[this.v[0] + 1];
          this.v[0] = (this.v.length - 1);
        }
        g.Z.Code(paramInt1, 0, this.v[0], true);
        System.arraycopy(g.Z.I, 0, this.v, 1, this.v[0]);
        arrayOfInt1 = this.v;
        if (this.M != null)
        {
          i4 = w(paramInt4);
          arrayOfInt2 = g.Z.I;
          paramInt4 = arrayOfInt2[1];
          i3 = 2;
          break label974;
          this.v = ((int[])localObject3);
          Code(g.Z, paramInt1, paramInt2, this.v, paramInt3, paramInt5, paramBoolean1, paramBoolean2, paramBoolean3, paramInt6, paramInt7, paramInt8);
          if (paramBoolean3) {
            break;
          }
          this.z = false;
          if (paramInt3 != this.y)
          {
            this.A = 0;
            this.D = 0;
            this.E = this.q;
            this.F = this.r;
          }
          this.x = this.w;
          this.w = paramBoolean3;
          return;
        }
        arrayOfInt2 = null;
        i3 = 0;
        i4 = 0;
        paramInt4 = 0;
      }
      finally {}
      i1 = 1;
      if (i1 < arrayOfInt1[0])
      {
        if (arrayOfInt1[(i1 + 3)] == 0)
        {
          arrayOfInt1[0] -= 4;
          System.arraycopy(arrayOfInt1, i1 + 4, arrayOfInt1, i1, arrayOfInt1[0] + 1 - i1);
          break label990;
        }
        i2 = arrayOfInt1[(i1 + 0)];
        i5 = arrayOfInt1[(i1 + 1)];
        arrayOfInt1[(i1 + 0)] = a(i2, paramInt3);
        arrayOfInt1[(i1 + 1)] = C(i5, paramInt3, paramInt4);
        arrayOfInt1[(i1 + 2)] = (a(i2 + arrayOfInt1[(i1 + 2)], paramInt3) - arrayOfInt1[(i1 + 0)]);
        arrayOfInt1[(i1 + 3)] = (C(i5 + arrayOfInt1[(i1 + 3)], paramInt3, paramInt4) - arrayOfInt1[(i1 + 1)]);
        break label990;
      }
      localObject3 = localObject1;
      if (this.M != null) {
        paramInt4 = 1;
      }
    }
    for (;;)
    {
      localObject3 = localObject1;
      if (paramInt4 >= localObject1[0]) {
        break;
      }
      i5 = localObject1[(paramInt4 + 1)];
      int i6 = Z(arrayOfInt2, i3, i4, i5);
      if (i6 >= i4)
      {
        localObject1[0] -= 4;
        System.arraycopy(localObject1, paramInt4 + 4, localObject1, paramInt4, localObject1[0] + 1 - paramInt4);
        paramInt4 -= 4;
        localObject3 = localObject1;
      }
      else
      {
        localObject1[(paramInt4 + 1)] = (this.M[(i6 * 5 + 0)] + i5 - (arrayOfInt2[(i3 + i6)] & 0xFFFFFF));
        int i7 = (arrayOfInt2[(i3 + i6)] & 0xFFFFFF) + this.M[(i6 * 5 + 1)];
        i1 = paramInt4;
        i2 = 1;
        paramInt4 = i7;
        for (;;)
        {
          i7 = i6 + 1;
          if ((i7 >= i4) || (paramInt4 >= localObject1[(i1 + 3)] + i5)) {
            break;
          }
          if ((arrayOfInt2[(i3 + i7)] & 0x80000000) == 0)
          {
            i6 = i7;
            if (i2 != 0)
            {
              i2 = paramInt4 - i5;
              i5 = localObject1[(i1 + 0)];
              i6 = localObject1[(i1 + 1)];
              int i8 = localObject1[(i1 + 2)];
              localObject3 = localObject1;
              if (localObject1[0] + 4 >= localObject1.length)
              {
                localObject3 = new int[localObject1.length + 8];
                System.arraycopy(localObject1, 0, localObject3, 0, localObject1.length);
              }
              System.arraycopy(localObject3, i1, localObject3, i1 + 4, localObject3[0] + 1 - i1);
              localObject3[0] += 4;
              localObject3[(i1 + 0)] = i5;
              localObject3[(i1 + 1)] = i6;
              localObject3[(i1 + 2)] = i8;
              localObject3[(i1 + 3)] = i2;
              i1 += 4;
              i5 = i1 + 3;
              localObject3[i5] -= i2;
              i2 = 0;
              i5 = paramInt4;
              localObject2 = localObject3;
              i6 = i7;
            }
          }
          else
          {
            i6 = i2;
            if (i2 == 0)
            {
              localObject2[(i1 + 1)] = this.M[(i7 * 5 + 0)];
              i6 = 1;
            }
            paramInt4 += this.M[(i7 * 5 + 1)];
            i2 = i6;
            i6 = i7;
          }
        }
        paramInt4 = i1;
        localObject3 = localObject2;
        if (i2 == 0)
        {
          localObject2[0] -= 4;
          System.arraycopy(localObject2, i1 + 4, localObject2, i1, localObject2[0] + 1 - i1);
          paramInt4 = i1 - 4;
          localObject3 = localObject2;
          break label999;
          if (paramInt8 > 0)
          {
            if (this.w) {
              break label206;
            }
            this.y = Math.min(paramInt3, paramInt8);
            this.z = true;
            break label206;
          }
          this.z = false;
          break label206;
          label974:
          if (paramInt3 != 0) {
            break label238;
          }
          localObject2[0] = 0;
          localObject3 = localObject2;
          break;
          label990:
          i1 += 4;
          break label241;
        }
      }
      label999:
      paramInt4 += 4;
      Object localObject2 = localObject3;
    }
  }
  
  final void Code(int paramInt, String paramString)
  {
    try
    {
      F(paramInt);
      this.ak += 15;
      paramInt = E();
      this.ak += 1;
      String str = K();
      this.Code.Code(paramString, paramInt, str);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  final void Code(int paramInt, boolean paramBoolean)
  {
    try
    {
      Code(g.Z, paramInt, paramBoolean);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void Code(bc parambc, DataInputStream paramDataInputStream, int paramInt1, int paramInt2)
  {
    this.h = ((paramInt2 << 16 | paramDataInputStream.readUnsignedShort()) + parambc.n() - paramInt1);
    this.Code.Code(this.h);
    this.Code.Z(3);
    if ((b.K[3] != null) && (b.K[1] != null)) {
      b.Code(3, null, true);
    }
    int i3 = parambc.n();
    long l1 = System.currentTimeMillis();
    int i4 = Code(paramDataInputStream);
    paramInt2 = 0;
    int i1 = 0;
    int[] arrayOfInt = null;
    label88:
    int i5;
    int i2;
    int i6;
    int i7;
    Object localObject1;
    label634:
    Object localObject3;
    label685:
    Object localObject2;
    for (;;)
    {
      if (paramInt2 < i4)
      {
        i5 = paramDataInputStream.readByte();
        if (i5 >= 0)
        {
          i2 = paramDataInputStream.readUnsignedShort();
          paramInt1 = i2 + 3 + paramInt2;
          paramInt2 = i2;
        }
        for (;;)
        {
          i2 = i5 & 0x7F;
          switch (i2)
          {
          default: 
            if (!parambc.o()) {
              break label2462;
            }
            switch (i2)
            {
            default: 
              b.Code(paramDataInputStream, paramInt2);
              paramInt2 = paramInt1;
              break label88;
              paramInt1 = paramDataInputStream.readInt();
              i2 = paramInt1 + 5 + paramInt2;
              paramInt2 = paramInt1;
              paramInt1 = i2;
            }
            break;
          }
        }
        b.Code(paramDataInputStream, paramInt2);
        paramInt2 = Thread.currentThread().getPriority();
        Thread.currentThread().setPriority(1);
        this.Code.l();
        b.Code(true);
        Thread.currentThread().setPriority(paramInt2);
        paramInt2 = paramInt1;
        continue;
        this.l = paramDataInputStream.readByte();
        this.m = paramDataInputStream.readShort();
        paramInt2 = paramInt1;
        continue;
        i5 = paramDataInputStream.readByte();
        i2 = 0;
        paramInt2 = paramInt1;
        if (i2 != i5)
        {
          i6 = paramDataInputStream.readShort();
          paramInt2 = -1;
          if (i6 == 1) {
            paramInt2 = paramDataInputStream.readByte();
          }
          i6 = paramDataInputStream.readInt();
          i7 = paramDataInputStream.readUnsignedShort();
          if (paramInt2 == 4)
          {
            b.M = i6;
            b.N = paramDataInputStream.readUTF();
            b.C("md");
            g.u();
            this.Code.a();
            g.Z.b(g.Z.Code(b.N));
            g.I.Code(35);
          }
          for (;;)
          {
            i2 += 1;
            break;
            localObject1 = new byte[i7];
            paramDataInputStream.readFully((byte[])localObject1);
            switch (paramInt2)
            {
            default: 
              g.I.B();
              g.Z.c(paramInt2);
              g.Z.c(i6);
              if (Code(paramInt2, (byte[])localObject1, localObject1.length)) {
                break label685;
              }
              g.Z.b(0);
              g.I.Code(36);
              break;
            case 3: 
              bj.Code(i6, (byte[])localObject1);
              g.u();
              break;
            case 17: 
              if (i6 != ba.Code)
              {
                ba.Code(i6, (byte[])localObject1);
                g.u();
                ap.Code(ba.Code);
              }
              break;
            }
          }
          if (paramInt2 != 31) {
            break label3308;
          }
          localObject3 = g.Code.Code("OM-Upgrade");
          if (localObject3 == null) {
            break label3308;
          }
          localObject2 = new byte[localObject1.length + az.Code((String)localObject3) + 2];
          System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
          az.Code((String)localObject3, (byte[])localObject2, localObject1.length);
          localObject1 = localObject2;
        }
      }
    }
    label916:
    label1689:
    label1753:
    label3308:
    for (;;)
    {
      g.Z.b(g.Z.I((byte[])localObject1, 0, localObject1.length));
      break label634;
      i5 = paramDataInputStream.readByte();
      i2 = 0;
      for (;;)
      {
        paramInt2 = paramInt1;
        if (i2 >= i5) {
          break;
        }
        paramInt2 = paramDataInputStream.readByte();
        i6 = paramDataInputStream.readUnsignedShort();
        localObject1 = null;
        if (i6 > 0)
        {
          localObject1 = new byte[i6];
          paramDataInputStream.readFully((byte[])localObject1);
        }
        localObject2 = paramDataInputStream.readUTF();
        localObject3 = paramDataInputStream.readUTF();
        i7 = paramDataInputStream.readInt();
        if ((paramInt2 > 0) && (paramInt2 <= 9) && (((((String)localObject3).length() <= 0) && (((String)localObject2).length() <= 0) && (i6 <= 0)) || ((((String)localObject3).length() != 0) && (localObject1 != null) && (b.I((byte[])localObject1, 0, i6))))) {
          break label916;
        }
        g.I.c(i7);
        i2 += 1;
      }
      this.Code.a();
      g.Z.c(i7);
      g.Z.c(paramInt2 - 1);
      g.Z.b(g.Z.Code((String)localObject2));
      g.Z.b(g.Z.Code((String)localObject3));
      if (i6 > 0) {
        g.Z.b(g.Z.I((byte[])localObject1, 0, i6));
      }
      for (;;)
      {
        g.I.Code(37);
        break;
        g.Z.b(0);
      }
      localObject1 = paramDataInputStream.readUTF();
      localObject2 = this.Code.j();
      if (!parambc.o())
      {
        paramInt2 = paramInt1;
        if (!((String)localObject1).equals(localObject2)) {
          break;
        }
      }
      this.Code.b = ((String)localObject1);
      throw new RuntimeException();
      Code(paramDataInputStream, paramInt2, this.Code);
      paramInt2 = paramInt1;
      break;
      paramInt2 = paramDataInputStream.readUnsignedByte();
      localObject1 = paramDataInputStream.readUTF();
      if (paramInt2 == 0)
      {
        localObject2 = parambc.s();
        ((Object[])ap.Z.get(((bb)localObject2).Z()))[1] = localObject1;
        paramInt2 = paramInt1;
        break;
      }
      b.Code(paramInt2, (String)localObject1, true);
      paramInt2 = paramInt1;
      break;
      paramInt2 = paramDataInputStream.readInt();
      i2 = paramDataInputStream.readByte();
      localObject1 = paramDataInputStream.readUTF();
      this.Code.a();
      g.Z.b(g.Z.Code((String)localObject1));
      g.Z.c(paramInt2);
      g.Z.c(i2);
      g.I.Code(this.Code.C(), 17);
      paramInt2 = paramInt1;
      break;
      paramDataInputStream.readUTF();
      paramDataInputStream.readUTF();
      this.ac = paramDataInputStream.readUTF();
      this.ad = paramDataInputStream.readUTF();
      i5 = paramDataInputStream.readByte();
      i2 = 0;
      for (;;)
      {
        paramInt2 = paramInt1;
        if (i2 >= i5) {
          break;
        }
        localObject1 = paramDataInputStream.readUTF();
        this.ab.addElement(localObject1);
        i2 += 1;
      }
      localObject3 = paramDataInputStream.readUTF();
      Object localObject4 = paramDataInputStream.readUTF();
      String str1 = paramDataInputStream.readUTF();
      localObject2 = paramDataInputStream.readUTF();
      localObject1 = localObject2;
      if (((String)localObject2).equals(""))
      {
        localObject1 = localObject2;
        if (str1 != null)
        {
          paramInt2 = str1.indexOf("auth_server=");
          localObject1 = localObject2;
          if (paramInt2 >= 0)
          {
            paramInt2 = "auth_server=".length() + paramInt2;
            i2 = str1.indexOf('&', paramInt2);
            localObject1 = localObject2;
            if (i2 > paramInt2) {
              localObject1 = str1.substring(paramInt2, i2);
            }
          }
        }
      }
      this.Code.a();
      g.Z.b(g.Z.Code((String)localObject1));
      g.Z.b(g.Z.Code((String)localObject3));
      g.Z.b(g.Z.Code((String)localObject4));
      g.Z.b(g.Z.Code(str1));
      g.I.Code(this.Code.C(), 24);
      paramInt2 = paramInt1;
      break;
      String str2 = paramDataInputStream.readUTF();
      long l2 = paramDataInputStream.readLong();
      String str3 = paramDataInputStream.readUTF();
      String str4 = paramDataInputStream.readUTF();
      i2 = paramDataInputStream.readByte();
      localObject1 = null;
      paramInt2 = 0;
      localObject3 = null;
      if (paramInt2 < i2)
      {
        i5 = (char)paramDataInputStream.readByte();
        str1 = paramDataInputStream.readUTF();
        localObject4 = localObject3;
        localObject2 = str1;
        switch (i5)
        {
        default: 
          localObject2 = localObject1;
          localObject4 = localObject3;
        }
        for (;;)
        {
          paramInt2 += 1;
          localObject1 = localObject2;
          localObject3 = localObject4;
          break;
          localObject4 = str1;
          localObject2 = localObject1;
        }
      }
      this.Code.a();
      g.Z.b(g.Z.Code(str2));
      g.Z.c(b.f());
      g.Z.b(g.Z.Code(str3));
      g.Z.b(g.Z.Code(str4));
      if (localObject1 != null)
      {
        g.Z.b(g.Z.Code((String)localObject1));
        if (localObject3 == null) {
          break label1753;
        }
        g.Z.b(g.Z.Code((String)localObject3));
      }
      for (;;)
      {
        g.Z.b(g.Z.Code(l2));
        g.I.Code(this.Code.C(), 25);
        paramInt2 = paramInt1;
        break;
        g.Z.b(0);
        break label1689;
        g.Z.b(0);
      }
      this.k = paramDataInputStream.readUnsignedByte();
      paramInt2 = paramInt1;
      break;
      i1 = (paramInt2 - 2) / 9;
      arrayOfInt = new int[i1 * 3];
      paramDataInputStream.readUnsignedShort();
      localObject1 = new byte[i1 * 9];
      paramDataInputStream.readFully((byte[])localObject1);
      paramInt2 = 0;
      while (paramInt2 < i1)
      {
        arrayOfInt[(paramInt2 * 3 + 0)] = Code((byte[])localObject1, paramInt2 * 9 + 0);
        arrayOfInt[(paramInt2 * 3 + 1)] = Code((byte[])localObject1, paramInt2 * 9 + 3);
        arrayOfInt[(paramInt2 * 3 + 2)] = Code((byte[])localObject1, paramInt2 * 9 + 6);
        paramInt2 += 1;
      }
      paramInt2 = paramInt1;
      break;
      localObject1 = paramDataInputStream.readUTF();
      localObject2 = paramDataInputStream.readUTF();
      localObject3 = paramDataInputStream.readUTF();
      this.Code.a();
      g.Z.c(0);
      g.Z.b(g.Z.Code((String)localObject1));
      g.Z.b(g.Z.Code((String)localObject2));
      g.Z.b(g.Z.Code((String)localObject3));
      g.Z.b(0);
      g.Z.b(0);
      g.Z.b(0);
      g.I.Code(this.Code.C(), 27);
      paramInt2 = paramInt1;
      break;
      localObject1 = paramDataInputStream.readUTF();
      localObject2 = paramDataInputStream.readUTF();
      localObject3 = paramDataInputStream.readUTF();
      localObject4 = paramDataInputStream.readUTF();
      str1 = paramDataInputStream.readUTF();
      this.Code.a();
      g.Z.c(1);
      g.Z.b(g.Z.Code((String)localObject1));
      g.Z.b(g.Z.Code((String)localObject2));
      g.Z.b(g.Z.Code(str1));
      g.Z.b(g.Z.Code((String)localObject3));
      g.Z.b(g.Z.Code((String)localObject4));
      g.Z.b(0);
      g.I.Code(this.Code.C(), 27);
      paramInt2 = paramInt1;
      break;
      localObject1 = paramDataInputStream.readUTF();
      localObject2 = paramDataInputStream.readUTF();
      localObject3 = paramDataInputStream.readUTF();
      localObject4 = paramDataInputStream.readUTF();
      str1 = paramDataInputStream.readUTF();
      str2 = paramDataInputStream.readUTF();
      this.Code.a();
      g.Z.c(2);
      g.Z.b(g.Z.Code((String)localObject1));
      g.Z.b(g.Z.Code((String)localObject2));
      g.Z.b(g.Z.Code(str2));
      g.Z.b(g.Z.Code((String)localObject3));
      g.Z.b(g.Z.Code((String)localObject4));
      g.Z.b(g.Z.Code(str1));
      g.I.Code(this.Code.C(), 27);
      paramInt2 = paramInt1;
      break;
      g.Code.I(paramDataInputStream.readUTF());
      paramInt2 = paramInt1;
      break;
      i2 = paramDataInputStream.readShort();
      paramInt2 = paramInt1;
      if (!this.B) {
        break;
      }
      this.Code.B(i2);
      paramInt2 = paramInt1;
      break;
      ai.Z(paramDataInputStream.readInt());
      paramInt2 = paramInt1;
      break;
      paramInt2 = paramInt1;
      if (g.e) {
        break;
      }
      g.I.v();
      this.Code.a();
      g.I.Code(38);
      paramInt2 = paramInt1;
      break;
      localObject1 = new byte[paramInt2];
      paramDataInputStream.readFully((byte[])localObject1);
      this.Code.a();
      g.Z.b(g.Z.Code((byte[])localObject1));
      g.I.Code(40);
      paramInt2 = paramInt1;
      break;
      switch (i2)
      {
      default: 
        b.Code(paramDataInputStream, paramInt2);
        paramInt2 = paramInt1;
        break;
      case 75: 
        i2 = paramDataInputStream.readUnsignedByte();
        localObject1 = paramDataInputStream.readUTF();
        paramInt2 = paramInt1;
        if (i2 != 1) {
          break;
        }
        b.Code(3, (String)localObject1, true);
        paramInt2 = paramInt1;
        break;
        i4 = (paramDataInputStream.readUnsignedByte() << 16) + paramDataInputStream.readUnsignedShort();
        this.Code.I(i4);
        paramInt1 = 0;
        for (;;)
        {
          if (paramInt1 <= 4) {}
          try
          {
            this.W = new byte[i4];
            if ((this.I != null) && (i1 > 0) && (this.I.W == null))
            {
              this.W = null;
              throw new OutOfMemoryError();
            }
          }
          catch (Throwable paramDataInputStream)
          {
            g.I.B();
            paramDataInputStream = this.Code.Code;
            boolean bool;
            if (paramInt1 > 1)
            {
              bool = true;
              paramDataInputStream.Code(bool);
              if (paramInt1 != 0) {
                break label2670;
              }
              if (this.I != null) {
                this.I.I(false);
              }
              g.I.C();
            }
            for (;;)
            {
              paramInt1 += 1;
              break;
              bool = false;
              break label2626;
              label2670:
              if ((this.I != null) && (this.I.J == 0) && (paramInt1 >= g.b))
              {
                if (!this.I.C)
                {
                  paramDataInputStream = this.I;
                  paramDataInputStream.W = null;
                  paramDataInputStream.av = -1;
                  paramDataInputStream.R = 0;
                }
                this.I.I(true);
              }
              g.Z.c(paramInt1 - 1 + 0);
              g.I.Code(66);
            }
            if (this.W == null) {
              this.W = new byte[i4];
            }
            paramInt1 = 0;
            while (paramInt1 < i1)
            {
              paramDataInputStream = this.I;
              localObject1 = this.W;
              paramInt2 = arrayOfInt[(paramInt1 * 3 + 1)];
              i2 = arrayOfInt[(paramInt1 * 3 + 0)];
              i5 = arrayOfInt[(paramInt1 * 3 + 2)];
              System.arraycopy(paramDataInputStream.W, i2, localObject1, paramInt2, i5);
              paramInt1 += 1;
            }
            this.I = null;
            o(b.c * 1024);
            this.Y = 0;
            paramInt2 = 0;
            paramInt1 = 0;
            while (this.Y < i4)
            {
              i5 = this.Y;
              i2 = paramInt2;
              while ((this.Y - i5 < 1024) && (this.Y < i4))
              {
                if (i2 < i1) {}
                for (paramInt2 = arrayOfInt[(i2 * 3 + 1)] - this.Y;; paramInt2 = 1024)
                {
                  paramInt2 = Math.min(1024, Math.min(paramInt2, i4 - this.Y));
                  if ((i2 >= i1) || (this.Y != arrayOfInt[(i2 * 3 + 1)])) {
                    break label3009;
                  }
                  this.Y += arrayOfInt[(i2 * 3 + 2)];
                  i2 += 1;
                  break;
                }
                paramInt2 = parambc.read(this.W, this.Y, paramInt2);
                if (paramInt2 < 0) {
                  throw new EOFException();
                }
                this.Y = (paramInt2 + this.Y);
              }
              paramInt2 = i2;
              if (this.B)
              {
                paramInt2 = paramInt1;
                if (this.X == 0)
                {
                  paramInt2 = paramInt1;
                  if (r())
                  {
                    t();
                    paramInt2 = this.X;
                    Code(true);
                    this.ap.Code(v());
                  }
                }
                paramInt1 = paramInt2;
                if (this.X > 0)
                {
                  s();
                  paramInt1 = y(paramInt2);
                }
                if (this.K)
                {
                  this.K = false;
                  if ((this.L) && (!this.Code.h()))
                  {
                    this.Code.a();
                    g.Z.c(this.G);
                    g.Z.c(this.H);
                    g.I.Code(this.Code.C(), 19);
                  }
                }
                S();
                paramInt2 = i2;
              }
            }
            l1 = System.currentTimeMillis() - l1;
            if (l1 != 0L) {
              ab.J((int)((parambc.n() - i3) * 1000L / l1));
            }
            if (this.B)
            {
              if (this.am != 0)
              {
                this.Code.a();
                g.I.Code(this.Code.C(), 20);
              }
              return;
            }
            t();
            this.ap.Code(v());
            y(this.X);
            return;
          }
        }
      }
    }
  }
  
  final void Code(bk parambk, int paramInt1, int paramInt2)
  {
    try
    {
      int i1 = parambk.C();
      paramInt2 = v(paramInt2);
      paramInt2 = I(g.Z.I, 0, paramInt2, i1);
      g.Z.Code(paramInt1, 0, 3, false);
      g.Z.I[0] = parambk.B();
      g.Z.I[1] = paramInt2;
      g.Z.I[2] = parambk.a();
      g.Z.o();
      return;
    }
    finally
    {
      parambk = finally;
      throw parambk;
    }
  }
  
  final void Code(String paramString)
  {
    int i2 = b.Code("odp:component", paramString);
    if (i2 < 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.an = bool;
      int i1 = 0;
      if (i1 <= 4)
      {
        g localg;
        try
        {
          if (!this.an) {}
          for (this.W = b.B(i2); this.W == null; this.W = g.c.I(paramString))
          {
            if (this.an)
            {
              g.I.B();
              g.I.Code(7);
            }
            this.Code.Z(7);
            return;
          }
          bool = true;
        }
        catch (Throwable localThrowable)
        {
          g.I.B();
          localg = this.Code.Code;
          if (i1 <= 1) {
            break label159;
          }
        }
        label120:
        localg.Code(bool);
        if (i1 == 0)
        {
          if (this.I != null) {
            this.I.I(false);
          }
          g.I.C();
        }
        for (;;)
        {
          i1 += 1;
          break;
          label159:
          bool = false;
          break label120;
          g.Z.c(i1 - 1 + 0);
          g.I.Code(66);
        }
      }
      if (this.W == null)
      {
        this.Code.Z(7);
        return;
      }
      if ((!this.an) && (this.W.length == 0)) {
        try
        {
          this.b = 16;
          this.q = 0;
          this.r = 0;
          this.j = 0;
          this.g = null;
          this.am = 0;
          this.d = "";
          this.c = "";
          this.L = false;
          this.n = 0;
          this.i = false;
          this.V = 0;
          this.e = 0;
          this.f = 0;
          this.Q = 2;
          this.X = 2;
          this.W = new byte[2];
          this.Y = 2;
          y(this.X);
          Code(true);
          this.Code.Z(5);
          return;
        }
        finally {}
      }
      try
      {
        if (Z(0) != 16)
        {
          this.Code.Z(7);
          return;
        }
      }
      catch (Throwable paramString)
      {
        this.Code.Z(7);
        return;
      }
      this.Y = this.W.length;
      t();
      y(this.X);
      Code(true);
      if (this.am != 0)
      {
        this.Code.a();
        g.I.Code(this.Code.C(), 20);
      }
      S();
      this.Code.Z(5);
      return;
    }
  }
  
  final void Code(String paramString1, String paramString2)
  {
    if (this.Code.a == null) {
      this.Code.a = new Hashtable();
    }
    long l1 = g.c.C(paramString1);
    this.Code.a.put(paramString2, new Object[] { paramString1, new Integer((int)l1) });
    this.Code.Code(paramString2);
  }
  
  final void Code(String paramString1, String paramString2, String paramString3)
  {
    this.Code.a();
    g.Z.c(b.f());
    g.Z.b(g.Z.Code(paramString1));
    g.Z.b(g.Z.Code(paramString2));
    g.Z.b(g.Z.Code(paramString3));
    g.I.Code(this.Code.C(), 26);
  }
  
  final void Code(boolean paramBoolean)
  {
    int i2 = 1;
    if (paramBoolean) {
      this.Code.a();
    }
    g.Z.c(this.q);
    g.Z.c(this.r);
    g.Z.b(x(this.f));
    g.Z.b(g.Z.Code(this.c));
    g.Z.b(g.Z.Code(this.g));
    aw localaw = g.Z;
    if (this.am != 0)
    {
      i1 = 1;
      localaw.c(i1);
      localaw = g.Z;
      if (!this.L) {
        break label167;
      }
    }
    label157:
    label167:
    for (int i1 = i2;; i1 = 0)
    {
      localaw.c(i1);
      g.Z.c(this.V);
      if (!M()) {
        break label172;
      }
      g.Z.b(this.Code.C());
      try
      {
        g.Z.C(18);
        N();
        return;
      }
      catch (Throwable localThrowable)
      {
        break label157;
      }
      i1 = 0;
      break;
    }
    label172:
    g.I.Code(this.Code.C(), 18);
  }
  
  final boolean Code(bf parambf1, int paramInt, bf parambf2)
  {
    boolean bool = false;
    if (paramInt == 0) {}
    for (;;)
    {
      return bool;
      try
      {
        paramInt = w(paramInt);
        int[] arrayOfInt = g.Z.I;
        int i1 = I(arrayOfInt, 2, paramInt, parambf2.I());
        if (i1 < 0) {
          continue;
        }
        parambf1.Z().Code(Code(arrayOfInt, paramInt, parambf2.Code(), i1), parambf2.Code(), i1);
        bool = true;
      }
      finally {}
    }
  }
  
  public final boolean Code(q paramq, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (;;)
    {
      try
      {
        ao.Code();
        try
        {
          int i1 = paramq.Code();
          int i2 = paramq.I();
          int i3 = paramq.Z();
          int i4 = paramq.J();
          paramq.Z(i1, i2, i3, i4, 16777215);
          if ((this.M == null) || (this.W == null) || (paramInt4 == 0))
          {
            this.s = paramInt3;
            paramInt1 = this.q;
            if (paramInt1 != 0)
            {
              ao.I();
              if ((this.x) && (!this.w) && (this.au != null))
              {
                this.au.clear();
                this.au = null;
              }
              bool = true;
              return bool;
            }
            ao.I();
            if ((this.x) && (!this.w) && (this.au != null))
            {
              this.au.clear();
              this.au = null;
            }
            bool = false;
            continue;
          }
          paramInt4 = w(paramInt4);
          int[] arrayOfInt = g.Z.I;
          if (!this.w)
          {
            this.y = paramInt3;
            this.s = paramInt3;
            paramq.I(paramInt1, paramInt2, paramInt3, a(arrayOfInt[0]));
            if ((paramq.Z() > 0) && (paramq.J() > 0))
            {
              if (paramInt3 <= this.q / 2) {
                break label639;
              }
              bool = true;
              this.t = bool;
              if (arrayOfInt[1] <= 0) {
                break label636;
              }
              this.s = this.q;
              this.u = true;
              int i5 = Math.min(paramq.I() - paramInt2, arrayOfInt[0] - 1);
              Code(paramq, paramInt1, paramInt2, i5, Math.min(paramq.J() + i5 - 1, arrayOfInt[1] - 1), arrayOfInt, paramInt4);
              this.s = paramInt3;
              paramInt2 += arrayOfInt[1] - a(arrayOfInt[1]);
              this.u = this.t;
              paramInt3 = Math.min(Math.max(arrayOfInt[1], E(paramq.I() - paramInt2)), arrayOfInt[0] - 1);
              Code(paramq, paramInt1, paramInt2, paramInt3, Math.min(E(paramq.J()) + paramInt3, arrayOfInt[0] - 1), arrayOfInt, paramInt4);
            }
            paramq.Code(i1, i2, i3, i4);
            if (!this.C) {
              break label626;
            }
            ao.I(this);
            ao.I();
            if ((this.x) && (!this.w) && (this.au != null))
            {
              this.au.clear();
              this.au = null;
            }
            bool = true;
            continue;
          }
          if (this.z) {
            continue;
          }
          if (paramInt3 * 12 < this.y * 11)
          {
            this.y = (paramInt3 * 11 / 12);
            continue;
            paramq = finally;
          }
        }
        finally
        {
          ao.I();
          if ((this.x) && (!this.w) && (this.au != null))
          {
            this.au.clear();
            this.au = null;
          }
        }
        if (this.y * 12 >= paramInt3 * 11) {
          continue;
        }
      }
      finally {}
      this.y = (paramInt3 * 12 / 11);
      continue;
      label626:
      ao.Z(this);
      continue;
      label636:
      continue;
      label639:
      boolean bool = false;
    }
  }
  
  final boolean Code(y paramy1, int paramInt, y paramy2)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramInt == 0) {
      bool1 = bool2;
    }
    for (;;)
    {
      return bool1;
      try
      {
        paramInt = w(paramInt);
        int[] arrayOfInt = g.Z.I;
        int i1 = I(arrayOfInt, 2, paramInt, paramy2.Code().C());
        bool1 = bool2;
        if (i1 < 0) {
          continue;
        }
        int i2 = I(arrayOfInt, 2, paramInt, paramy2.I().C());
        bool1 = bool2;
        if (i2 < 0) {
          continue;
        }
        paramy1.Code().Code(Code(arrayOfInt, paramInt, paramy2.Code().B(), i1), paramy2.Code().B(), i1);
        paramy1.I().Code(Code(arrayOfInt, paramInt, paramy2.I().B(), i2), paramy2.I().B(), i2);
        bool1 = true;
      }
      finally {}
    }
  }
  
  final int I(int paramInt)
  {
    return ((this.W[paramInt] & 0xFF) << 8) + (this.W[(paramInt + 1)] & 0xFF);
  }
  
  final int I(int paramInt1, int paramInt2)
  {
    int i2 = 0;
    int i1;
    if (paramInt1 == 0)
    {
      i1 = i2;
      return i1;
    }
    for (;;)
    {
      try
      {
        int i3 = g.Z.o(paramInt1);
        i1 = i2;
        if (i3 == 0) {
          break;
        }
        g.Z.Code(paramInt1, 0, i3, true);
        this.ak = this.R;
        i1 = i2;
        if (this.ak > this.S) {
          break;
        }
        int i4 = this.ak;
        this.ak = (i4 + 1);
        paramInt1 = E();
        if (paramInt1 > 0)
        {
          F();
          int i5 = b(this.af, this.N);
          i1 = 0;
          if (i1 >= i3 + 0) {
            break label272;
          }
          if (g.Z.I[i1] != i5) {
            break label265;
          }
          this.ak += (paramInt1 - 1) * 10;
          paramInt1 = 1;
          this.ak = (D() + this.ak);
          if (paramInt1 != 0)
          {
            paramInt1 = E();
            if (paramInt1 > 0)
            {
              if (E() == 102)
              {
                g.Z.Z(paramInt2);
                paramInt1 = g.Z.I(6, 53);
                paramInt2 = g.Z.Z();
                g.Z.Z(0);
                i1 = a(paramInt1, paramInt2, i4);
                break;
              }
              this.ak = (D() + this.ak);
              paramInt1 -= 1;
              continue;
            }
            continue;
          }
          R();
          continue;
        }
        paramInt1 = 0;
      }
      finally {}
      continue;
      label265:
      i1 += 1;
      continue;
      label272:
      paramInt1 -= 1;
    }
  }
  
  final int I(Object paramObject)
  {
    try
    {
      int i1 = ((Integer)((Object[])paramObject)[5]).intValue();
      return i1;
    }
    finally
    {
      paramObject = finally;
      throw paramObject;
    }
  }
  
  final J I(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      paramInt1 = w(paramInt1);
      J localJ = Code(g.Z.I, paramInt1, paramInt2, paramInt3);
      return localJ;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void I(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    for (;;)
    {
      try
      {
        paramInt3 = v(paramInt3);
        paramInt1 = Code(g.Z.I, paramInt3, paramInt1);
        g.Z.l(this.Code.I.size() * 2 + 6);
        g.Z.I("x");
        g.Z.I(String.valueOf(paramInt2));
        g.Z.I("y");
        g.Z.I(String.valueOf(paramInt1));
        Object localObject1;
        if (Z(paramInt4) == 83)
        {
          this.ak = (paramInt4 + 2 + this.W[(paramInt4 + 1)] * 10);
          localObject1 = b.Code(K());
          g.Z.I((String)localObject1);
          paramInt3 = g.Z.Code("");
          paramInt1 = E();
          paramInt2 = paramInt3;
          if (paramInt1 <= 0) {}
        }
        switch (E())
        {
        case 116: 
          this.ak += D();
          paramInt1 -= 1;
          continue;
          paramInt2 = g.Z.Code(b.Code(K()));
          g.Z.m(paramInt2);
          localObject1 = this.Code.I.keys();
          if (((Enumeration)localObject1).hasMoreElements())
          {
            String str = (String)((Enumeration)localObject1).nextElement();
            if (str.startsWith("o:")) {
              continue;
            }
            g.Z.I(b.Code(str));
            g.Z.I(b.Code(this.Code.I.get(str).toString()));
            continue;
          }
          g.Z.b(g.Z.l());
        }
      }
      finally {}
      return;
    }
  }
  
  public final void I(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (;;)
    {
      try
      {
        u();
        return;
      }
      finally {}
      Z(true);
    }
  }
  
  final boolean I()
  {
    return (this.W != null) && (this.Y == this.W.length);
  }
  
  final boolean I(Object paramObject, int paramInt)
  {
    try
    {
      boolean bool = ((Hashtable)((Object[])paramObject)[3]).containsKey(new Integer(paramInt));
      return bool;
    }
    finally
    {
      paramObject = finally;
      throw paramObject;
    }
  }
  
  final I J(int paramInt1, int paramInt2, int paramInt3)
  {
    String str;
    Object localObject4;
    int i1;
    int i2;
    int i3;
    label228:
    label234:
    Object localObject5;
    label408:
    label433:
    try
    {
      if (this.R == 0)
      {
        localObject1 = new I(this, paramInt1, paramInt2, null, null, null, 0);
        return localObject1;
      }
      str = null;
      localObject1 = null;
      localObject4 = null;
      this.ak = this.R;
      int i4 = v(paramInt3);
      int[] arrayOfInt = g.Z.I;
      i1 = 0;
      paramInt3 = 0;
      if (this.ak > this.S) {
        break label569;
      }
      i2 = this.ak;
      int i5 = E();
      i3 = E();
      if (i3 <= 0) {
        break label473;
      }
      F();
      this.af = I(arrayOfInt, 0, i4, this.af);
      if ((this.af < 0) || (!b.Code(paramInt1, paramInt2, 1, 1, this.ae, this.af, this.ag, this.ah))) {
        break label560;
      }
      this.ak += (i3 - 1) * 10;
      i3 = this.ak;
      switch (i5)
      {
      case 76: 
      case 78: 
        for (;;)
        {
          this.ak = i3;
          this.ak = (D() + this.ak);
          R();
          i2 = i1;
          i1 = paramInt3;
          paramInt3 = i2;
          break;
          if (str != null) {
            break label486;
          }
          str = L();
          i2 = paramInt3;
          paramInt3 = i1;
          i1 = i2;
          continue;
          if (str != null) {
            break label486;
          }
          this.ak += 7;
          str = this.c + "#" + K();
          i2 = paramInt3;
          paramInt3 = i1;
          i1 = i2;
        }
      case 105: 
        localObject5 = localObject1;
        if (localObject1 == null) {
          localObject5 = L();
        }
        i2 = E();
        localObject1 = localObject4;
        label374:
        if ((i2 <= 0) || (localObject1 != null)) {
          break label511;
        }
        switch (E())
        {
        case 116: 
          this.ak = (D() + this.ak);
        }
        break;
      }
    }
    finally {}
    Object localObject1 = K();
    for (;;)
    {
      localObject1 = new I(this, paramInt1, paramInt2, (String)localObject1, (String)localObject5, (String)localObject4, paramInt3);
      break;
      label473:
      label486:
      label511:
      do
      {
        localObject5 = localObject2;
        localObject3 = str;
        break label433;
        i2 = paramInt3;
        paramInt3 = i1;
        i1 = i2;
        break label234;
        do
        {
          do
          {
            i2 = paramInt3;
            paramInt3 = i1;
            i1 = i2;
            break;
            break label408;
            i2 -= 1;
            break label374;
            i2 = paramInt3;
            localObject4 = localObject3;
            paramInt3 = i1;
            i1 = i2;
            localObject3 = localObject5;
            break;
          } while (paramInt3 != 0);
          paramInt3 = i1;
          i1 = i2;
          break;
        } while (i1 != 0);
        i1 = paramInt3;
        paramInt3 = i2;
        break label228;
        i3 -= 1;
        break;
      } while ((paramInt3 == 0) && (i1 == 0));
      label560:
      label569:
      Object localObject3 = null;
      localObject5 = null;
    }
  }
  
  final String J(int paramInt)
  {
    return az.Code(this.W, paramInt);
  }
  
  final void J()
  {
    if ((!w()) && (Q()))
    {
      this.Code.a();
      g.I.Code(this.Code.C(), 22);
    }
  }
  
  final int Z(int paramInt)
  {
    return this.W[paramInt] & 0xFF;
  }
  
  final int Z(int paramInt1, int paramInt2)
  {
    int i3;
    int i5;
    label158:
    label324:
    int[] arrayOfInt;
    for (;;)
    {
      int i4;
      try
      {
        i4 = F(paramInt1);
        this.ak += 1;
        G();
        this.ak += 4;
        i1 = E();
        i3 = E();
        Object localObject1 = K();
        K();
        localObject1 = this.Code.I.get(localObject1);
        if (localObject1 == null) {
          break;
        }
        paramInt1 = 0;
        i5 = i3 & 0x1;
        switch (i1)
        {
        default: 
          paramInt1 = 0;
          return paramInt1;
        }
      }
      finally {}
      g.Z.I = new int[3];
      g.Z.I[0] = i5;
      g.Z.I[1] = paramInt1;
      g.Z.I[2] = -1;
      paramInt1 = g.Z.n();
      continue;
      this.ak = z();
      int i6 = z();
      int i7 = this.ae;
      int i8 = this.af;
      int i9 = this.ak;
      int i10 = this.ag;
      int i11 = this.ah;
      int i2 = 0;
      int i1 = 0;
      this.ak = this.X;
      int i12;
      if (this.ak < i4) {
        i12 = E();
      }
      switch (i12)
      {
      case 66: 
      case 70: 
      case 73: 
      case 84: 
        for (;;)
        {
          A(i12);
          break;
          G();
          i2 += this.ae;
          i1 += this.af;
        }
        this.ae = (i2 + i7);
        this.af = (i1 + i8);
        this.ag = i10;
        this.ah = i11;
        this.ak = i9;
        paramInt2 = v(paramInt2);
        this.af = I(g.Z.I, 0, paramInt2, this.af);
        g.Z.I = new int[8];
        g.Z.I[0] = i5;
        g.Z.I[1] = paramInt1;
        g.Z.I[2] = i6;
        arrayOfInt = g.Z.I;
        if ((i3 & 0x4) == 0) {
          break label585;
        }
      }
    }
    label585:
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      arrayOfInt[3] = paramInt1;
      g.Z.I[4] = this.ae;
      g.Z.I[5] = this.af;
      g.Z.I[6] = this.ag;
      g.Z.I[7] = this.ah;
      paramInt1 = g.Z.n();
      break label158;
      g.Z.I = new int[1];
      g.Z.I[0] = i5;
      paramInt1 = g.Z.n();
      break label158;
      paramInt1 = i3 & 0x8;
      break;
      break label324;
    }
  }
  
  final void Z(int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      paramInt3 = v(paramInt3);
      paramInt1 = Code(g.Z.I, paramInt3, paramInt1);
      g.Z.l(this.Code.I.size() * 2 + 4);
      g.Z.I("x");
      g.Z.I(String.valueOf(paramInt2));
      g.Z.I("y");
      g.Z.I(String.valueOf(paramInt1));
      Enumeration localEnumeration = this.Code.I.keys();
      while (localEnumeration.hasMoreElements())
      {
        String str = (String)localEnumeration.nextElement();
        if (!str.startsWith("o:"))
        {
          g.Z.I(b.Code(str));
          g.Z.I(b.Code(this.Code.I.get(str).toString()));
        }
      }
      g.Z.b(g.Z.l());
    }
    finally {}
  }
  
  final void Z(Object paramObject)
  {
    try
    {
      Object localObject = (Hashtable)((Object[])paramObject)[3];
      StringBuffer localStringBuffer = new StringBuffer();
      localObject = ((Hashtable)localObject).keys();
      while (((Enumeration)localObject).hasMoreElements())
      {
        if (localStringBuffer.length() > 0) {
          localStringBuffer.append('\000');
        }
        localStringBuffer.append(((Enumeration)localObject).nextElement());
      }
      Code(((Integer)((Object[])paramObject)[1]).intValue(), localStringBuffer.toString());
    }
    finally {}
  }
  
  /* Error */
  final void Z(Object paramObject, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: checkcast 366	[Ljava/lang/Object;
    //   6: iconst_3
    //   7: aaload
    //   8: checkcast 127	java/util/Hashtable
    //   11: astore_3
    //   12: aload_1
    //   13: checkcast 366	[Ljava/lang/Object;
    //   16: iconst_4
    //   17: aaload
    //   18: checkcast 1178	java/lang/Boolean
    //   21: invokevirtual 1181	java/lang/Boolean:booleanValue	()Z
    //   24: ifne +7 -> 31
    //   27: aload_3
    //   28: invokevirtual 1099	java/util/Hashtable:clear	()V
    //   31: new 208	java/lang/Integer
    //   34: dup
    //   35: iload_2
    //   36: invokespecial 214	java/lang/Integer:<init>	(I)V
    //   39: astore_1
    //   40: aload_3
    //   41: aload_1
    //   42: invokevirtual 441	java/util/Hashtable:containsKey	(Ljava/lang/Object;)Z
    //   45: ifne +13 -> 58
    //   48: aload_3
    //   49: aload_1
    //   50: aload_1
    //   51: invokevirtual 218	java/util/Hashtable:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: aload_3
    //   59: aload_1
    //   60: invokevirtual 462	java/util/Hashtable:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   63: pop
    //   64: goto -9 -> 55
    //   67: astore_1
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_1
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	k
    //   0	72	1	paramObject	Object
    //   0	72	2	paramInt	int
    //   11	48	3	localHashtable	Hashtable
    // Exception table:
    //   from	to	target	type
    //   2	31	67	finally
    //   31	55	67	finally
    //   58	64	67	finally
  }
  
  public final boolean Z()
  {
    return this.i;
  }
  
  final int a()
  {
    for (k localk = this;; localk = localk.I)
    {
      if ((localk.am != 0) && (localk.W != null))
      {
        int i1 = Code(localk.W, localk.am);
        return g.Z.I(localk.W, localk.am + 3, i1);
      }
      if (localk.I == null) {
        break;
      }
    }
    return 0;
  }
  
  final int a(int paramInt)
  {
    return this.s * paramInt / this.q;
  }
  
  public final int b()
  {
    g.Z.I = new int[this.v[0]];
    System.arraycopy(this.v, 1, g.Z.I, 0, this.v[0]);
    return g.Z.n();
  }
  
  final void b(int paramInt)
  {
    int i1 = g.Z.n(paramInt);
    g.Z.Code(paramInt, i1);
    this.aa.clear();
    paramInt = 0;
    while (paramInt < i1)
    {
      this.aa.put(b.I(g.Z.f(g.Z.I[(paramInt + 0)])), b.I(g.Z.f(g.Z.I[(paramInt + 0 + 1)])));
      paramInt += 2;
    }
    if (i1 > 0)
    {
      String str1 = Integer.toString(0);
      String str2 = Integer.toString(1);
      Code(str1, this.ac, 'x', null);
      Code(str2, this.ad, 'p', null);
    }
  }
  
  final String c(int paramInt)
  {
    switch (paramInt)
    {
    default: 
    case 0: 
      do
      {
        return null;
      } while ((this.ad == null) || (!this.Code.I.containsKey(this.ad)));
      return this.ac;
    }
    return this.ad;
  }
  
  final void c()
  {
    try
    {
      if (this.C) {
        ao.Code(this);
      }
      this.J = 0;
      return;
    }
    finally {}
  }
  
  final int d()
  {
    return this.G;
  }
  
  final int d(int paramInt)
  {
    return this.W[paramInt];
  }
  
  final int e()
  {
    return this.H;
  }
  
  final int e(int paramInt)
  {
    int i1 = Z(paramInt);
    paramInt += this.W[(paramInt + 1)] * 10 + 2;
    if (i1 != 78)
    {
      i1 = az.Z(this.W, paramInt);
      if ((i1 > 0) && (this.W[(paramInt + 2)] == 0)) {
        return g.Z.Code(this.W, this.e + 2, az.Z(this.W, this.e), this.W, paramInt + 3, i1 - 1);
      }
      return g.Z.Code(this.W, paramInt + 2, i1);
    }
    return x(paramInt + 2 + 2 + 3);
  }
  
  final int f()
  {
    return this.n;
  }
  
  final int f(int paramInt)
  {
    return I(this.W[(paramInt + 1)] * 10 + 2 + paramInt + 2);
  }
  
  final int g(int paramInt)
  {
    return Code(this.W[(paramInt + 1)] * 10 + 2 + paramInt + 4);
  }
  
  final int[] g()
  {
    return this.o;
  }
  
  final byte h()
  {
    return this.l;
  }
  
  final int h(int paramInt)
  {
    int i3 = 0;
    this.ak = paramInt;
    if (E() == 67) {}
    for (int i1 = 16;; i1 = 0)
    {
      this.ak = (E() * 10 + this.ak);
      this.ak = (D() + this.ak);
      int i2 = E();
      paramInt = i3;
      if (i2 > 0)
      {
        switch (E())
        {
        }
        for (;;)
        {
          this.ak = (D() + this.ak);
          i2 -= 1;
          break;
          paramInt += 1;
          continue;
          paramInt += 2;
          continue;
          paramInt += 4;
          continue;
          paramInt += 8;
        }
      }
      return i1 | paramInt;
    }
  }
  
  final int i()
  {
    return this.m;
  }
  
  final int i(int paramInt)
  {
    try
    {
      this.ak = (paramInt + 1);
      this.ak = (E() * 10 + this.ak);
      this.ak = (D() + this.ak);
      paramInt = E();
      if (paramInt > 0) {
        switch (E())
        {
        }
      }
      for (;;)
      {
        this.ak = (D() + this.ak);
        paramInt -= 1;
        break;
        for (paramInt = x(this.ak);; paramInt = 0) {
          return paramInt;
        }
      }
    }
    finally {}
  }
  
  final int j()
  {
    return this.k;
  }
  
  final int j(int paramInt)
  {
    try
    {
      F(paramInt);
      this.ak += 15;
      paramInt = this.W[this.ak];
      return paramInt;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final int k()
  {
    return this.h;
  }
  
  /* Error */
  final Object k(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iload_1
    //   4: invokespecial 884	k:F	(I)I
    //   7: pop
    //   8: aload_0
    //   9: aload_0
    //   10: getfield 167	k:ak	I
    //   13: bipush 15
    //   15: iadd
    //   16: putfield 167	k:ak	I
    //   19: aload_0
    //   20: invokespecial 263	k:E	()I
    //   23: pop
    //   24: aload_0
    //   25: invokespecial 263	k:E	()I
    //   28: istore_3
    //   29: aload_0
    //   30: invokespecial 468	k:K	()Ljava/lang/String;
    //   33: astore 8
    //   35: aload_0
    //   36: invokespecial 468	k:K	()Ljava/lang/String;
    //   39: astore 6
    //   41: aload_0
    //   42: aload_0
    //   43: invokespecial 164	k:z	()I
    //   46: putfield 167	k:ak	I
    //   49: aload_0
    //   50: invokespecial 164	k:z	()I
    //   53: istore 4
    //   55: iload 4
    //   57: newarray int
    //   59: astore 7
    //   61: iconst_0
    //   62: istore_2
    //   63: iload_2
    //   64: iload 4
    //   66: if_icmpge +26 -> 92
    //   69: aload 7
    //   71: iload_2
    //   72: aload_0
    //   73: getfield 167	k:ak	I
    //   76: iastore
    //   77: aload_0
    //   78: invokespecial 682	k:H	()V
    //   81: aload_0
    //   82: invokespecial 682	k:H	()V
    //   85: iload_2
    //   86: iconst_1
    //   87: iadd
    //   88: istore_2
    //   89: goto -26 -> 63
    //   92: aload_0
    //   93: getfield 149	k:Code	Lab;
    //   96: getfield 438	ab:I	Ljava/util/Hashtable;
    //   99: aload 8
    //   101: invokevirtual 441	java/util/Hashtable:containsKey	(Ljava/lang/Object;)Z
    //   104: ifeq +20 -> 124
    //   107: aload_0
    //   108: getfield 149	k:Code	Lab;
    //   111: getfield 438	ab:I	Ljava/util/Hashtable;
    //   114: aload 8
    //   116: invokevirtual 481	java/util/Hashtable:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   119: checkcast 195	java/lang/String
    //   122: astore 6
    //   124: new 127	java/util/Hashtable
    //   127: dup
    //   128: invokespecial 128	java/util/Hashtable:<init>	()V
    //   131: astore 8
    //   133: new 208	java/lang/Integer
    //   136: dup
    //   137: aload 8
    //   139: aload 6
    //   141: invokestatic 1196	k:Code	(Ljava/util/Hashtable;Ljava/lang/String;)I
    //   144: invokespecial 214	java/lang/Integer:<init>	(I)V
    //   147: astore 6
    //   149: new 208	java/lang/Integer
    //   152: dup
    //   153: iload_1
    //   154: invokespecial 214	java/lang/Integer:<init>	(I)V
    //   157: astore 9
    //   159: iload_3
    //   160: iconst_4
    //   161: iand
    //   162: ifeq +54 -> 216
    //   165: iconst_1
    //   166: istore 5
    //   168: new 1178	java/lang/Boolean
    //   171: dup
    //   172: iload 5
    //   174: invokespecial 1198	java/lang/Boolean:<init>	(Z)V
    //   177: astore 10
    //   179: aload_0
    //   180: monitorexit
    //   181: bipush 6
    //   183: anewarray 4	java/lang/Object
    //   186: dup
    //   187: iconst_0
    //   188: aload_0
    //   189: aastore
    //   190: dup
    //   191: iconst_1
    //   192: aload 9
    //   194: aastore
    //   195: dup
    //   196: iconst_2
    //   197: aload 7
    //   199: aastore
    //   200: dup
    //   201: iconst_3
    //   202: aload 8
    //   204: aastore
    //   205: dup
    //   206: iconst_4
    //   207: aload 10
    //   209: aastore
    //   210: dup
    //   211: iconst_5
    //   212: aload 6
    //   214: aastore
    //   215: areturn
    //   216: iconst_0
    //   217: istore 5
    //   219: goto -51 -> 168
    //   222: astore 6
    //   224: aload_0
    //   225: monitorexit
    //   226: aload 6
    //   228: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	229	0	this	k
    //   0	229	1	paramInt	int
    //   62	27	2	i1	int
    //   28	134	3	i2	int
    //   53	14	4	i3	int
    //   166	52	5	bool	boolean
    //   39	174	6	localObject1	Object
    //   222	5	6	localObject2	Object
    //   59	139	7	arrayOfInt	int[]
    //   33	170	8	localObject3	Object
    //   157	36	9	localInteger	Integer
    //   177	31	10	localBoolean	java.lang.Boolean
    // Exception table:
    //   from	to	target	type
    //   2	61	222	finally
    //   69	85	222	finally
    //   92	124	222	finally
    //   124	159	222	finally
    //   168	179	222	finally
  }
  
  final int l()
  {
    return this.j;
  }
  
  final String l(int paramInt)
  {
    try
    {
      F(paramInt);
      this.ak += 17;
      H();
      String str = K();
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final String m(int paramInt)
  {
    int i1;
    Object localObject1;
    String str2;
    for (;;)
    {
      try
      {
        F(paramInt);
        this.ak += 15;
        paramInt = E();
        i1 = E();
        localObject1 = K();
        str2 = (String)this.Code.I.get(localObject1);
        switch (paramInt)
        {
        case 83: 
          localObject1 = "";
          label120:
          return localObject1;
        }
      }
      finally {}
      localObject1 = str2;
      if (str2 == null) {
        localObject1 = K();
      }
    }
    label162:
    label188:
    label191:
    for (;;)
    {
      localObject1 = "0";
      break label120;
      break;
      if (str2 != null)
      {
        paramInt = 1;
        if ((i1 & 0x2) == 0) {
          break label188;
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        if ((i1 ^ paramInt) == 0) {
          break label191;
        }
        String str1 = "1";
        break;
        paramInt = 0;
        break label162;
      }
    }
  }
  
  public final void m()
  {
    try
    {
      this.aA = null;
      this.Code.B = null;
      this.Code.C = -1;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final int n()
  {
    if (g.Code.m())
    {
      int i1 = 0;
      while (i1 < 5)
      {
        int i3 = (this.c.hashCode() ^ new Long(System.currentTimeMillis()).hashCode()) % 100000000;
        int i2 = i3;
        if (i3 < 0) {
          i2 = -i3;
        }
        if (i2 != 0)
        {
          String str = g.c.Code(i2, 16);
          i3 = g.c.Code(this.W, str);
          if (i3 == 0) {
            return i2;
          }
          if (i3 == 2) {
            return 0;
          }
          g.c.Code();
        }
        i1 += 1;
      }
    }
    return 0;
  }
  
  final String n(int paramInt)
  {
    try
    {
      F(paramInt);
      this.ak += 17;
      String str = K();
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final int o()
  {
    int i2 = 0;
    int i1 = i2;
    if (b.b)
    {
      i1 = i2;
      if (this.W != null)
      {
        i2 = this.W.length + 0;
        i1 = i2;
        if (this.M != null) {
          i1 = i2 + this.M.length * 4;
        }
      }
    }
    if (this.Z != null) {
      return i1 + ae.Code(this.ap) + this.ap.C;
    }
    return i1 + ae.Code(this.ap);
  }
  
  final int o(int paramInt)
  {
    int i1;
    if ((b.b) && (paramInt > 0) && (this.W != null))
    {
      int i2 = this.W.length + 0;
      i1 = i2;
      if (this.M != null) {
        i1 = i2 + this.M.length * 4;
      }
      paramInt = Math.max(1, paramInt - i1);
    }
    for (;;)
    {
      if (this.Z != null)
      {
        this.ap.Code(paramInt, ae.Code(this.Z));
        return i1 + ae.Code(this.ap) + this.ap.C;
      }
      this.ap.Code(paramInt, 0);
      return i1 + ae.Code(this.ap);
      i1 = 0;
    }
  }
  
  /* Error */
  final int p()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 818	k:U	[I
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +7 -> 17
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_1
    //   16: ireturn
    //   17: getstatic 421	g:Z	Law;
    //   20: aload_0
    //   21: getfield 818	k:U	[I
    //   24: arraylength
    //   25: newarray int
    //   27: putfield 697	aw:I	[I
    //   30: aload_0
    //   31: getfield 818	k:U	[I
    //   34: iconst_0
    //   35: getstatic 421	g:Z	Law;
    //   38: getfield 697	aw:I	[I
    //   41: iconst_0
    //   42: aload_0
    //   43: getfield 818	k:U	[I
    //   46: arraylength
    //   47: invokestatic 240	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   50: getstatic 421	g:Z	Law;
    //   53: invokevirtual 700	aw:n	()I
    //   56: istore_1
    //   57: goto -44 -> 13
    //   60: astore_2
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_2
    //   64: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	65	0	this	k
    //   1	56	1	i1	int
    //   8	2	2	arrayOfInt	int[]
    //   60	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	9	60	finally
    //   17	57	60	finally
  }
  
  /* Error */
  final int p(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 818	k:U	[I
    //   6: astore 7
    //   8: aload 7
    //   10: ifnonnull +9 -> 19
    //   13: iconst_0
    //   14: istore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: iload_1
    //   18: ireturn
    //   19: aload_0
    //   20: getfield 818	k:U	[I
    //   23: iload_1
    //   24: iconst_5
    //   25: imul
    //   26: iconst_1
    //   27: iadd
    //   28: iaload
    //   29: istore_3
    //   30: aload_0
    //   31: getfield 818	k:U	[I
    //   34: iload_1
    //   35: iconst_5
    //   36: imul
    //   37: iconst_2
    //   38: iadd
    //   39: iaload
    //   40: istore 4
    //   42: aload_0
    //   43: iload_3
    //   44: aload_0
    //   45: getfield 695	k:N	I
    //   48: invokespecial 652	k:b	(II)I
    //   51: istore_1
    //   52: iload_1
    //   53: istore_2
    //   54: aload_0
    //   55: getfield 174	k:M	[I
    //   58: iload_2
    //   59: iconst_5
    //   60: imul
    //   61: iconst_0
    //   62: iadd
    //   63: iaload
    //   64: istore 5
    //   66: aload_0
    //   67: getfield 174	k:M	[I
    //   70: iload_2
    //   71: iconst_5
    //   72: imul
    //   73: iconst_1
    //   74: iadd
    //   75: iaload
    //   76: istore 6
    //   78: iload 5
    //   80: iload_3
    //   81: if_icmplt +22 -> 103
    //   84: iload 6
    //   86: iload 5
    //   88: iadd
    //   89: iload_3
    //   90: iload 4
    //   92: iadd
    //   93: if_icmpgt +10 -> 103
    //   96: iload_2
    //   97: iconst_1
    //   98: iadd
    //   99: istore_2
    //   100: goto -46 -> 54
    //   103: getstatic 421	g:Z	Law;
    //   106: iload_2
    //   107: iload_1
    //   108: isub
    //   109: newarray int
    //   111: putfield 697	aw:I	[I
    //   114: iload_1
    //   115: istore_3
    //   116: iload_3
    //   117: iload_2
    //   118: if_icmpge +23 -> 141
    //   121: getstatic 421	g:Z	Law;
    //   124: getfield 697	aw:I	[I
    //   127: iload_3
    //   128: iload_1
    //   129: isub
    //   130: iconst_0
    //   131: iadd
    //   132: iload_3
    //   133: iastore
    //   134: iload_3
    //   135: iconst_1
    //   136: iadd
    //   137: istore_3
    //   138: goto -22 -> 116
    //   141: getstatic 421	g:Z	Law;
    //   144: invokevirtual 700	aw:n	()I
    //   147: istore_1
    //   148: goto -133 -> 15
    //   151: astore 7
    //   153: aload_0
    //   154: monitorexit
    //   155: aload 7
    //   157: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	k
    //   0	158	1	paramInt	int
    //   53	66	2	i1	int
    //   29	109	3	i2	int
    //   40	53	4	i3	int
    //   64	25	5	i4	int
    //   76	13	6	i5	int
    //   6	3	7	arrayOfInt	int[]
    //   151	5	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	8	151	finally
    //   19	52	151	finally
    //   54	78	151	finally
    //   103	114	151	finally
    //   121	134	151	finally
    //   141	148	151	finally
  }
  
  final int q()
  {
    try
    {
      g.Z.I = new int[this.N * 5];
      System.arraycopy(this.M, 0, g.Z.I, 0, this.N * 5);
      int i1 = g.Z.n();
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     k
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */