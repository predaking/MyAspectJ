package com.example.lw.appweb.com.opera.mini.android;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Typeface;
import android.text.TextPaint;
import ax;

public class n
  implements ax
{
  private static char[] a = new char[2];
  private int B;
  private int C;
  private int Code;
  private char[] I = new char[1];
  private TextPaint J;
  private FontMetricsInt Z;
  
  private n(TextPaint paramTextPaint, int paramInt)
  {
    this.J = paramTextPaint;
    this.Code = paramInt;
    this.Z = paramTextPaint.getFontMetricsInt();
    this.Z.top -= 1;
    this.C = (this.Z.bottom - this.Z.top);
    this.B = ((int)Math.ceil(paramTextPaint.measureText(" ")));
  }
  
  private int Code(int paramInt)
  {
    paramInt = Character.toChars(paramInt, a, 0);
    return (int)Math.ceil(this.J.measureText(a, 0, paramInt));
  }
  
  public static int Code(Paint paramPaint, int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    int i = 0;
    int k = paramInt2 + paramInt3;
    paramInt3 = i;
    for (;;)
    {
      i = paramInt3;
      int j;
      if (paramInt2 < k)
      {
        j = paramInt3;
        paramInt3 = paramInt2;
        do
        {
          if (paramArrayOfChar[paramInt3] != ' ') {
            break;
          }
          paramInt2 = j + paramInt1;
          i = paramInt3 + 1;
          paramInt3 = i;
          j = paramInt2;
        } while (i != k);
        i = paramInt2;
      }
      return i;
      i = paramInt3;
      do
      {
        paramInt2 = i;
        if (paramArrayOfChar[i] == ' ') {
          break;
        }
        paramInt2 = i + 1;
        i = paramInt2;
      } while (paramInt2 != k);
      if (paramInt2 >= paramInt3) {
        paramInt3 = j + (int)Math.ceil(paramPaint.measureText(paramArrayOfChar, paramInt3, paramInt2 - paramInt3));
      } else {
        paramInt3 = j;
      }
    }
  }
  
  static n Code(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = 0;
    TextPaint localTextPaint = new TextPaint(129);
    int j;
    int k;
    label33:
    int m;
    Typeface localTypeface;
    if ((paramInt2 & 0x1) != 0)
    {
      j = 1;
      if ((paramInt2 & 0x2) == 0) {
        break label178;
      }
      k = 1;
      if (j != 0) {
        i = 1;
      }
      m = i;
      if (k != 0) {
        m = i | 0x2;
      }
      if ((paramInt2 & 0x4) != 0) {
        localTextPaint.setUnderlineText(true);
      }
      switch (paramInt1)
      {
      default: 
        localTypeface = Typeface.defaultFromStyle(m);
      }
    }
    for (;;)
    {
      localTextPaint.setTypeface(localTypeface);
      localTextPaint.setTextSize(paramInt3);
      if (paramBoolean)
      {
        if ((j != 0) && (!localTypeface.isBold())) {
          localTextPaint.setFakeBoldText(true);
        }
        if ((k != 0) && (!localTypeface.isItalic())) {
          localTextPaint.setTextSkewX(-0.25F);
        }
      }
      return new n(localTextPaint, paramInt1);
      j = 0;
      break;
      label178:
      k = 0;
      break label33;
      localTypeface = Typeface.create(Typeface.MONOSPACE, m);
      continue;
      localTypeface = Typeface.create(Typeface.SERIF, m);
    }
  }
  
  public final boolean B()
  {
    return (this.J.getTypeface().isItalic()) || (this.J.getTextSkewX() != 0.0F);
  }
  
  public final boolean C()
  {
    return (this.J.getTypeface().isBold()) || (this.J.isFakeBoldText());
  }
  
  public final int Code()
  {
    return this.C;
  }
  
  public final int Code(char paramChar)
  {
    int i = v.Code(this, paramChar);
    if (i != -1) {
      return i;
    }
    this.I[0] = paramChar;
    return (int)Math.ceil(this.J.measureText(this.I, 0, 1));
  }
  
  public final int Code(String paramString)
  {
    return Code(paramString.toCharArray(), 0, paramString.length());
  }
  
  public int Code(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    return Code(this.J, this.B, paramArrayOfChar, paramInt1, paramInt2);
  }
  
  public int Code(char[] paramArrayOfChar, int paramInt1, int paramInt2, float paramFloat)
  {
    Paint localPaint = new Paint(this.J);
    localPaint.setTextSize(this.J.getTextSize() * paramFloat);
    return Code(localPaint, (int)Math.ceil(localPaint.measureText(" ")), paramArrayOfChar, paramInt1, paramInt2);
  }
  
  final int I()
  {
    return (int)this.J.getTextSize();
  }
  
  public final TextPaint J()
  {
    return this.J;
  }
  
  public final int Z()
  {
    return -this.Z.top;
  }
  
  public final boolean a()
  {
    return this.Code == 32;
  }
  
  public final boolean b()
  {
    return this.Code == 128;
  }
  
  public final int c()
  {
    return this.C;
  }
  
  public final String d()
  {
    if (a()) {
      return "monospace";
    }
    if (b()) {
      return "serif";
    }
    return "sans";
  }
  
  public final void e()
  {
    v.Code(this);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.n
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */