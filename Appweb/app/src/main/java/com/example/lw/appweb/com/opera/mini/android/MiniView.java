package com.example.lw.appweb.com.opera.mini.android;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import aw;
import b;
import g;

public class MiniView
  extends FrameLayout
{
  private static int B;
  private static int C;
  static MiniView Code;
  aj I;
  private c J;
  private aj Z;
  private boolean a = false;
  private boolean b;
  private int c = 0;
  private int d = 0;
  private d e;
  private e f;
  private e g;
  private int h;
  private boolean i;
  
  public MiniView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Code = this;
    if ((ae.ae >= 4) && (!k.C())) {}
    for (boolean bool = true;; bool = false)
    {
      this.b = bool;
      this.e = d.I(getContext());
      this.f = new e(this, 80);
      this.g = new e(this, 65);
      if (this.b)
      {
        this.J = new c(paramContext, this);
        addView(this.J.Code());
        this.J.Code().setVisibility(8);
      }
      this.Z = new Z(paramContext, this);
      addView(this.Z.Code());
      this.Z.Code().setVisibility(8);
      if (!this.b) {
        break;
      }
      this.J.Code().setVisibility(0);
      this.I = this.J;
      return;
    }
    this.Z.Code().setVisibility(0);
    this.I = this.Z;
  }
  
  static int B()
  {
    return C;
  }
  
  private static int Code(int paramInt, KeyEvent paramKeyEvent)
  {
    switch (paramInt)
    {
    default: 
      if (paramKeyEvent.isPrintingKey()) {
        paramInt = paramKeyEvent.getUnicodeChar();
      }
      return paramInt;
    case 82: 
      return -11;
    case 23: 
    case 66: 
      return 8;
    case 4: 
      return -5;
    case 19: 
      return 1;
    case 20: 
      return 6;
    case 21: 
      return 2;
    case 22: 
      return 5;
    case 67: 
      return -6;
    case 84: 
      return -13;
    case 1: 
      return -1;
    }
    return -2;
  }
  
  private static char[] Code(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.isPrintingKey()) {
      return new char[] { (char)paramKeyEvent.getUnicodeChar() };
    }
    return new char[0];
  }
  
  private static int I(int paramInt)
  {
    switch (paramInt)
    {
    case 51: 
    case 53: 
    case 55: 
    default: 
      return 0;
    case 50: 
      return 7;
    case 52: 
      return 9;
    case 54: 
      return 10;
    }
    return 8;
  }
  
  private static void I(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      g.I.B();
      g.I.Code(34);
    }
    Code.Z();
  }
  
  static int J()
  {
    return B;
  }
  
  private static boolean Z(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  private static void b()
  {
    Code.I.C();
  }
  
  final int C()
  {
    return this.h;
  }
  
  public final void Code()
  {
    if (this.b)
    {
      this.J.Code().setVisibility(8);
      this.Z.Code().setVisibility(0);
      this.J.b();
      this.I = this.Z.I();
    }
  }
  
  final void Code(int paramInt)
  {
    if (this.h != paramInt)
    {
      this.h = paramInt;
      if (Browser.Code.C)
      {
        g.I.B();
        g.I.Code(42);
      }
    }
  }
  
  final void Code(int paramInt1, int paramInt2)
  {
    ae.n();
    B = paramInt1;
    C = paramInt2;
    View localView = Browser.I.getWindow().getDecorView();
    Rect localRect = new Rect();
    localView.getWindowVisibleDisplayFrame(localRect);
    paramInt2 = ae.aa.heightPixels - localRect.bottom;
    if (ae.aa.widthPixels > ae.aa.heightPixels)
    {
      paramInt1 = 1;
      if (paramInt2 < 100) {
        break label141;
      }
      if (paramInt1 == 0) {
        break label133;
      }
      paramInt1 = this.d;
    }
    for (;;)
    {
      paramInt1 = paramInt2 - paramInt1;
      if (C + paramInt1 <= ae.aa.heightPixels) {
        C += paramInt1;
      }
      if (Browser.Code.C) {}
      try
      {
        Browser.Code.m();
        Code(paramInt1);
        return;
      }
      catch (Throwable localThrowable) {}
      paramInt1 = 0;
      break;
      label133:
      paramInt1 = this.c;
      continue;
      label141:
      if (paramInt1 != 0)
      {
        this.d = paramInt2;
        paramInt1 = paramInt2;
      }
      else
      {
        this.c = paramInt2;
        paramInt1 = paramInt2;
      }
    }
  }
  
  final void Code(boolean paramBoolean)
  {
    this.i = paramBoolean;
    Z();
  }
  
  final void I()
  {
    if (!this.a)
    {
      this.a = true;
      Browser.Code.I();
    }
    Browser.Code.y();
  }
  
  public final void Z()
  {
    this.I.B();
  }
  
  final boolean a()
  {
    return this.i;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (84 == paramInt)
    {
      Code.Code(true);
      return false;
    }
    for (;;)
    {
      try
      {
        if ((!Browser.Code.C) || (Z(paramInt))) {
          break;
        }
        if (paramKeyEvent.getRepeatCount() > 0) {}
        switch (paramInt)
        {
        case 19: 
          if ((paramInt == 4) && (I.Code != null)) {
            I.Code.I = true;
          }
          int j = Code(paramInt, paramKeyEvent);
          g.I.B();
          g.Z.c(j);
          g.Z.c(0);
          g.Z.c(0);
          g.Z.c(paramInt);
          g.Z.c(I(j));
          g.Z.b(g.Z.Code(String.valueOf(Code(paramKeyEvent))));
          g.Z.c((int)paramKeyEvent.getEventTime());
          g.Z.b(g.Z.Code(String.valueOf(Code(paramKeyEvent)).toUpperCase()));
          g.I.Code(56);
          return true;
        }
      }
      catch (Throwable paramKeyEvent)
      {
        return false;
      }
      return true;
      return true;
      return true;
    }
  }
  
  public boolean onKeyLongPress(int paramInt, KeyEvent paramKeyEvent)
  {
    if (84 == paramInt) {
      return Code.Code();
    }
    return false;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (84 == paramInt) {
      if (Code.I()) {}
    }
    for (;;)
    {
      return false;
      Code.Code(false);
      int j = Code(paramInt, paramKeyEvent);
      g.I.B();
      g.Z.c(j);
      g.Z.c(0);
      g.Z.c(0);
      g.Z.c(paramInt);
      g.Z.c(I(j));
      g.Z.b(g.Z.Code(String.valueOf(Code(paramKeyEvent))));
      g.Z.c((int)paramKeyEvent.getEventTime());
      g.Z.b(g.Z.Code(String.valueOf(Code(paramKeyEvent)).toUpperCase()));
      g.I.Code(56);
      try
      {
        b.I();
        b.I(paramInt);
        b.Code(8);
        if ((Browser.Code.C) && (!Z(paramInt)))
        {
          g.I.B();
          g.Z.c(Code(paramInt, paramKeyEvent));
          g.Z.c(paramInt);
          g.Z.c((int)paramKeyEvent.getEventTime());
          g.I.Code(57);
          return true;
        }
      }
      catch (Throwable paramKeyEvent) {}
    }
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    for (;;)
    {
      try
      {
        int k = (int)paramMotionEvent.getX();
        int m = (int)paramMotionEvent.getY();
        b.I();
        b.I(k);
        b.I(m);
        b.Code(2);
        if (!Browser.Code.C) {
          return true;
        }
        if ((this.e != null) && (this.e.Code(paramMotionEvent))) {
          break label169;
        }
        switch (paramMotionEvent.getAction())
        {
        case 1: 
          if (j == -1) {
            break label169;
          }
          g.I.B();
          g.Z.c(k);
          g.Z.c(m);
          g.Z.c((int)paramMotionEvent.getEventTime());
          g.Z.c(0);
          g.I.Code(j);
          return true;
        }
      }
      catch (Throwable paramMotionEvent)
      {
        return false;
      }
      int j = 59;
      continue;
      j = 60;
      continue;
      j = -1;
      continue;
      label169:
      return true;
      return false;
      j = 58;
    }
  }
  
  public boolean onTrackballEvent(MotionEvent paramMotionEvent)
  {
    try
    {
      int j = this.f.Code(paramMotionEvent.getX() * paramMotionEvent.getXPrecision());
      int k = this.g.Code(paramMotionEvent.getY() * paramMotionEvent.getYPrecision());
      b.I();
      b.I(j);
      b.I(k);
      b.Code(2);
      if (!Browser.Code.C) {
        return true;
      }
      if ((paramMotionEvent.getAction() != 0) && (paramMotionEvent.getAction() != 1))
      {
        g.I.B();
        g.Z.c(j);
        g.Z.c(k);
        g.Z.b(g.Z.Code(paramMotionEvent.getEventTime()));
        g.Z.c(4);
        g.I.Code(64);
        return true;
      }
    }
    catch (Throwable paramMotionEvent)
    {
      return false;
    }
    return false;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.MiniView
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */