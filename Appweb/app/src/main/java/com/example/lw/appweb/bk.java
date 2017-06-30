package com.example.lw.appweb;

class bk
{
  private k Code;
  private J I = null;
  private int J;
  private int Z;
  
  bk(bk parambk)
  {
    Code(parambk);
  }
  
  bk(k paramk)
  {
    this.Code = paramk;
    this.J = -2147483648;
  }
  
  private bk(k paramk, J paramJ, int paramInt)
  {
    this.Code = paramk;
    this.I = paramJ;
    this.Z = paramInt;
  }
  
  static int Code(bk parambk1, bk parambk2, int paramInt1, int paramInt2)
  {
    parambk1 = Code(parambk1, parambk2);
    if (parambk1.I.Code() != paramInt1) {
      return 0;
    }
    return Math.max(0, parambk1.Z - paramInt2);
  }
  
  static bk Code(bk parambk1, bk parambk2)
  {
    if (parambk1.Code()) {}
    do
    {
      do
      {
        return parambk1;
        if (parambk2.Code()) {
          return parambk2;
        }
      } while (parambk1.I.Code() < parambk2.I.Code());
      if (parambk1.I.Code() > parambk2.I.Code()) {
        return parambk2;
      }
    } while (parambk1.Z <= parambk2.Z);
    return parambk2;
  }
  
  static boolean Code(bk parambk1, bk parambk2, int paramInt)
  {
    if ((parambk1.Code()) || (parambk2.Code())) {}
    for (;;)
    {
      return false;
      bk localbk = Code(parambk1, parambk2);
      if (localbk != parambk1) {}
      while ((localbk.I.Code() <= paramInt) && (parambk1.I.Code() >= paramInt))
      {
        return true;
        parambk1 = parambk2;
      }
    }
  }
  
  static boolean Code(bk parambk1, bk parambk2, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = false;
    bk localbk = Code(parambk1, parambk2);
    int i;
    if (localbk != parambk1)
    {
      i = paramInt2 + paramInt3;
      if (localbk.I.Code() != paramInt1) {
        break label88;
      }
      paramInt3 = localbk.Z;
      label41:
      if (parambk1.I.Code() != paramInt1) {
        break label94;
      }
    }
    label88:
    label94:
    for (paramInt1 = parambk1.Z;; paramInt1 = i)
    {
      boolean bool1 = bool2;
      if (paramInt3 <= i)
      {
        bool1 = bool2;
        if (paramInt1 >= paramInt2) {
          bool1 = true;
        }
      }
      return bool1;
      parambk1 = parambk2;
      break;
      paramInt3 = 0;
      break label41;
    }
  }
  
  static int I(bk parambk1, bk parambk2, int paramInt1, int paramInt2, int paramInt3)
  {
    if (Code(parambk1, parambk2) == parambk1) {}
    while (parambk2.I.Code() != paramInt1)
    {
      return paramInt3;
      parambk2 = parambk1;
    }
    return Math.min(parambk2.Z - paramInt2, paramInt3);
  }
  
  static boolean I(bk parambk1, bk parambk2, int paramInt)
  {
    if ((parambk1.Code()) || (parambk2.Code())) {}
    for (;;)
    {
      return false;
      if (Code(parambk1, parambk2) != parambk1) {}
      while (paramInt < parambk1.I.Code())
      {
        return true;
        parambk1 = parambk2;
      }
    }
  }
  
  private void Z(int paramInt)
  {
    int m = C();
    int n = a();
    int i = 2147483647;
    boolean bool = false;
    bk localbk = new bk(this);
    while ((J.Code(localbk.C(), localbk.a(), m, n)) && (!bool))
    {
      int k = Math.abs(localbk.B() - paramInt);
      int j = i;
      if (k < i)
      {
        Code(localbk);
        j = k;
      }
      bool = localbk.J();
      i = j;
    }
  }
  
  private int d()
  {
    if (this.J == -2147483648) {
      this.J = B();
    }
    return this.J;
  }
  
  final int B()
  {
    if (Code()) {
      return 0;
    }
    int j = this.I.C();
    char[] arrayOfChar = this.I.b();
    if (this.I.c())
    {
      i = this.Z - 1;
      while ((i >= 0) && (arrayOfChar[i] != '\n')) {
        i -= 1;
      }
      k = this.I.I();
      return b.Code(j, arrayOfChar, i + 1, this.Z - 1 - i) + k;
    }
    int i = this.Z;
    while ((i < arrayOfChar.length) && (arrayOfChar[i] != '\n')) {
      i += 1;
    }
    int k = this.I.I();
    return b.Code(j, arrayOfChar, this.Z, i - this.Z) + k;
  }
  
  final int C()
  {
    int i = 0;
    if (Code()) {
      return 0;
    }
    int j = this.I.Z();
    int k = this.I.C();
    String str = this.I.a();
    int m = b.C(k);
    while (i < this.Z)
    {
      k = j;
      if (str.charAt(i) == '\n') {
        k = j + m;
      }
      i += 1;
      j = k;
    }
    return j;
  }
  
  final void Code(int paramInt)
  {
    int k = 1;
    int j = 1;
    int i = 0;
    if (Code()) {
      return;
    }
    label62:
    Object localObject1;
    label121:
    boolean bool;
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      this.J = -2147483648;
      i = B();
      paramInt = 1;
      if (this.I.c()) {
        if (this.Z > 0) {
          this.Z -= 1;
        }
      }
      while (paramInt != 0)
      {
        if (B() == i) {
          break label62;
        }
        return;
        if (this.I.d())
        {
          localObject1 = this.I.k();
          if (localObject1 == null) {
            break label179;
          }
          if (((J)localObject1).Z(this.I)) {
            break label173;
          }
        }
        for (bool = true;; bool = false)
        {
          this.Z = ((J)localObject1).Code(bool);
          this.I = ((J)localObject1);
          break;
          localObject1 = this.I.j();
          break label121;
        }
        paramInt = 0;
        continue;
        j = this.I.a().length();
        if (this.Z < j - 1)
        {
          this.Z += 1;
        }
        else
        {
          if (this.I.d()) {}
          for (localObject1 = this.I.k();; localObject1 = this.I.j())
          {
            if ((this.Z != j - 1) || ((localObject1 != null) && (!this.I.Z((J)localObject1)))) {
              break label284;
            }
            this.Z = j;
            break;
          }
          if (localObject1 != null)
          {
            if ((this.Z == j) && (!this.I.Z((J)localObject1))) {}
            for (bool = true;; bool = false)
            {
              this.Z = ((J)localObject1).Code(bool);
              this.I = ((J)localObject1);
              break;
            }
          }
          paramInt = 0;
        }
      }
    case 2: 
      this.J = -2147483648;
      i = B();
      paramInt = 1;
      if (this.I.c())
      {
        j = this.I.a().length();
        if (this.Z < j - 1) {
          this.Z += 1;
        }
      }
      while (paramInt != 0)
      {
        if (B() == i) {
          break label356;
        }
        return;
        if (this.I.d()) {}
        for (localObject1 = this.I.i();; localObject1 = this.I.l())
        {
          if ((this.Z != j - 1) || ((localObject1 != null) && (!this.I.Z((J)localObject1)))) {
            break label476;
          }
          this.Z = j;
          break;
        }
        if (localObject1 != null)
        {
          if ((this.Z == j) && (!((J)localObject1).Z(this.I))) {}
          for (bool = true;; bool = false)
          {
            this.Z = ((J)localObject1).I(bool);
            this.I = ((J)localObject1);
            break;
          }
        }
        paramInt = 0;
        continue;
        if (this.Z > 0)
        {
          this.Z -= 1;
        }
        else
        {
          if (this.I.d())
          {
            localObject1 = this.I.i();
            if (localObject1 == null) {
              break label634;
            }
            if (this.I.Z(this.I)) {
              break label628;
            }
          }
          for (bool = true;; bool = false)
          {
            this.Z = ((J)localObject1).I(bool);
            this.I = ((J)localObject1);
            break;
            localObject1 = this.I.l();
            break label574;
          }
          paramInt = 0;
        }
      }
    case 3: 
      label173:
      label179:
      label356:
      label628:
      label634:
      k = d();
      label284:
      label476:
      localObject1 = this.I.a();
      label574:
      paramInt = this.Z - 1;
      label661:
      if (paramInt >= 0) {
        if (((String)localObject1).charAt(paramInt) != '\n') {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      Object localObject2;
      if (paramInt == -1)
      {
        paramInt = 0;
        if (paramInt != 0) {
          break label835;
        }
        localObject2 = null;
        J localJ;
        for (localObject1 = this.I.g(); localObject1 != null; localObject1 = localJ)
        {
          localJ = ((J)localObject1).h();
          localObject2 = localObject1;
        }
        paramInt -= 1;
        break label661;
      }
      for (this.Z = paramInt;; this.Z -= 1)
      {
        paramInt = j;
        if (this.Z <= 0) {
          break;
        }
        paramInt = j;
        if (((String)localObject1).charAt(this.Z - 1) == '\n') {
          break;
        }
      }
      if (localObject2 == null) {
        break;
      }
      this.I = localObject2;
      this.Z = 0;
      localObject1 = this.I.a();
      paramInt = i;
      while (paramInt < ((String)localObject1).length())
      {
        if (((String)localObject1).charAt(paramInt) == '\n') {
          this.Z = (paramInt + 1);
        }
        paramInt += 1;
      }
      label835:
      Z(k);
      return;
      i = d();
      localObject1 = this.I.a();
      paramInt = this.Z;
      label861:
      if (paramInt < ((String)localObject1).length()) {
        if (((String)localObject1).charAt(paramInt) == '\n') {
          this.Z = (paramInt + 1);
        }
      }
      for (paramInt = k;; paramInt = 0)
      {
        if (paramInt == 0)
        {
          localObject1 = this.I.f();
          if (localObject1 == null) {
            break;
          }
          this.I = ((J)localObject1);
          this.Z = 0;
        }
        Z(i);
        return;
        paramInt += 1;
        break label861;
      }
      paramInt = -1;
    }
  }
  
  final void Code(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((this.I != null) && (this.I.Code(paramInt2, paramInt3)))
    {
      Code(this.I, paramInt2, paramInt3);
      return;
    }
    Code(this.Code.I(paramInt1, paramInt2, paramInt3), paramInt2, paramInt3);
  }
  
  final void Code(J paramJ, int paramInt1, int paramInt2)
  {
    if (paramJ == null) {
      return;
    }
    this.J = -2147483648;
    this.I = paramJ;
    this.Z = 0;
    int i = 2147483647;
    bk localbk = new bk(this);
    label35:
    int k = b.C(localbk.I.C());
    J localJ = localbk.I.e();
    label78:
    boolean bool;
    if (localJ != null)
    {
      paramJ = new bk(this.Code, localJ, 0);
      bool = false;
      label81:
      if ((localbk.I(paramJ) > 0) || (bool)) {
        break label189;
      }
      int j = localbk.B() - paramInt1;
      int m = localbk.C() + k / 2 - paramInt2;
      j = j * j + m * m;
      if (j >= i) {
        break label226;
      }
      Code(localbk);
      i = j;
    }
    label189:
    label226:
    for (;;)
    {
      bool = localbk.J();
      break label81;
      paramJ = new bk(this.Code, localbk.I, localbk.I.a().length());
      break label78;
      localbk.I = localJ;
      localbk.Z = 0;
      if (localbk.I == null) {
        break;
      }
      if (localbk.I.J(this.I)) {
        break label35;
      }
      return;
    }
  }
  
  final void Code(bk parambk)
  {
    this.Code = parambk.Code;
    this.I = parambk.I;
    this.Z = parambk.Z;
    this.J = parambk.J;
  }
  
  final boolean Code()
  {
    return this.I == null;
  }
  
  final int I(bk parambk)
  {
    if (this.I.Code(parambk.I) == 0) {
      return this.Z - parambk.Z;
    }
    return this.I.Code(parambk.I);
  }
  
  final void I()
  {
    this.I = null;
  }
  
  final void I(int paramInt1, int paramInt2, int paramInt3)
  {
    Code(paramInt1, paramInt2, paramInt3);
    String str = this.I.a();
    if (this.Z > str.length()) {}
    for (this.Z = str.length(); this.Z > 0; this.Z -= 1)
    {
      paramInt1 = str.charAt(this.Z - 1);
      if ((paramInt1 == 32) || (paramInt1 == 10)) {
        break;
      }
    }
  }
  
  final boolean I(int paramInt)
  {
    if (Code()) {}
    while (this.I.Code() != paramInt) {
      return false;
    }
    return true;
  }
  
  final boolean J()
  {
    int i = this.I.a().length();
    if (this.Z < i - 1)
    {
      this.Z += 1;
      return false;
    }
    J localJ = this.I.e();
    if (localJ != null)
    {
      if ((this.Z == i - 1) && (this.I.Z(localJ)))
      {
        this.Z += 1;
        return false;
      }
      this.I = localJ;
      this.Z = 0;
      return false;
    }
    if (this.Z < i)
    {
      this.Z += 1;
      return false;
    }
    return true;
  }
  
  final char Z()
  {
    Object localObject = this.I.a();
    if (this.Z < ((String)localObject).length()) {
      return ((String)localObject).charAt(this.Z);
    }
    localObject = this.I.e();
    if (localObject == null) {
      return '\000';
    }
    if (this.I.I((J)localObject)) {
      return ' ';
    }
    return '\n';
  }
  
  final void Z(int paramInt1, int paramInt2, int paramInt3)
  {
    Code(paramInt1, paramInt2, paramInt3);
    String str = this.I.a();
    while (this.Z < str.length())
    {
      paramInt1 = str.charAt(this.Z);
      if ((paramInt1 == 32) || (paramInt1 == 10)) {
        break;
      }
      this.Z += 1;
    }
  }
  
  final int a()
  {
    if (Code()) {
      return 0;
    }
    return b.C(this.I.C());
  }
  
  int b()
  {
    return this.I.Code();
  }
  
  final int c()
  {
    return b.Code(this.I.a(), this.Z);
  }
  
  public final String toString()
  {
    return "node=" + this.I + " offset=" + this.Z + " (x: " + B() + ", y: " + C() + ")";
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     bk
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */