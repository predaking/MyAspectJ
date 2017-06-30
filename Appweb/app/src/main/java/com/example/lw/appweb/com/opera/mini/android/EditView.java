package com.example.lw.appweb.com.opera.mini.android;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import aw;
import g;

public class EditView
  extends EditText
{
  private RelativeLayout.LayoutParams B;
  private int C;
  protected String Code;
  protected boolean I;
  private boolean J;
  private TextPaint Z;
  private boolean a = false;
  private int b = 0;
  
  public EditView(Context paramContext)
  {
    super(paramContext);
    Code();
  }
  
  public EditView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Code();
  }
  
  public EditView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Code();
  }
  
  private void Code()
  {
    setSelection(0, 0);
    this.Z = new TextPaint(1);
    this.Z.setColor(-16777216);
    this.Z.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
    TextPaint localTextPaint = this.Z;
    ab.Code();
    localTextPaint.setTextSize(ab.I());
    setTypeface(this.Z.getTypeface());
    setTextSize(this.Z.getTextSize());
    setBackgroundDrawable(null);
    setPadding(0, 0, 0, 0);
    setBackgroundColor(0);
    setHighlightColor(-5189377);
    setGravity(51);
    this.C = 1;
  }
  
  private static void I(int paramInt)
  {
    g.I.B();
    int i = g.Z(g.I.a);
    g.Z.b(i);
    g.Z.c(paramInt);
    g.I.Code(45);
  }
  
  protected final String Code(CharSequence paramCharSequence)
  {
    if (hasSelection()) {}
    for (int i = Math.min(getSelectionStart(), getSelectionEnd());; i = paramCharSequence.length()) {
      return paramCharSequence.subSequence(0, i).toString();
    }
  }
  
  public final void Code(int paramInt)
  {
    this.C = paramInt;
  }
  
  final void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.B == null) {
      this.B = ((RelativeLayout.LayoutParams)getLayoutParams());
    }
    this.B.width = paramInt3;
    this.B.height = paramInt4;
    this.B.leftMargin = paramInt1;
    this.B.topMargin = paramInt2;
    requestLayout();
  }
  
  protected final void Code(String paramString, boolean paramBoolean)
  {
    int j = 1;
    this.Code = paramString;
    g.I.B();
    int i = g.Z(g.I.a);
    g.Z.b(i);
    g.Z.b(g.Z.Code(paramString));
    aw localaw = g.Z;
    if (getSelectionStart() == paramString.length())
    {
      i = 1;
      localaw.c(i);
      paramString = g.Z;
      if (!paramBoolean) {
        break label98;
      }
    }
    label98:
    for (i = j;; i = 0)
    {
      paramString.c(i);
      g.I.Code(46);
      return;
      i = 0;
      break;
    }
  }
  
  final void Code(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  public boolean dispatchKeyEventPreIme(KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      if (!this.I)
      {
        I.B(false);
        setVisibility(8);
        g.I.B();
        int i = g.Z(g.I.a);
        g.Z.b(i);
        g.Z.c(0);
        g.Z.c(0);
        g.I.Code(44);
        g.J(g.I.a);
        g.I.a = 0;
        setText("");
      }
      this.I = false;
      bool = true;
    }
    return bool;
  }
  
  protected void onCreateContextMenu(ContextMenu paramContextMenu)
  {
    this.I = true;
    super.onCreateContextMenu(paramContextMenu);
  }
  
  public void onEditorAction(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
    default: 
      paramInt = 1;
    }
    for (;;)
    {
      I(paramInt);
      return;
      paramInt = 3;
      continue;
      paramInt = 5;
      continue;
      paramInt = 4;
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
    int i;
    if (getLineCount() == 1)
    {
      if (paramInt == 66)
      {
        I(this.C);
        return true;
      }
      if ((paramInt == 19) || (paramInt == 20) || (paramInt == 23))
      {
        cancelLongPress();
        if (paramInt == 20) {
          i = 6;
        }
      }
    }
    for (;;)
    {
      g.I.B();
      g.Z.c(i);
      g.Z.c(0);
      g.Z.c(0);
      g.Z.c(paramInt);
      g.Z.b(0);
      g.Z.b(0);
      g.Z.c((int)paramKeyEvent.getEventTime());
      g.Z.c(0);
      try
      {
        g.Z.C(56);
        label128:
        g.Z.c(i);
        g.Z.c(paramInt);
        g.Z.c((int)paramKeyEvent.getEventTime() + 1);
        g.I.Code(57);
        return true;
      }
      catch (Throwable localThrowable)
      {
        break label128;
        i = 1;
      }
      if (paramInt == 23)
      {
        i = 8;
        continue;
        return super.onKeyUp(paramInt, paramKeyEvent);
      }
    }
  }
  
  protected void onSelectionChanged(int paramInt1, int paramInt2)
  {
    super.onSelectionChanged(paramInt1, paramInt2);
    if (this.a)
    {
      if (paramInt1 == paramInt2) {
        this.b = paramInt1;
      }
    }
    else {
      return;
    }
    this.a = false;
    setSelection(this.b);
  }
  
  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((!this.J) || (Browser.Code == null) || (!Browser.Code.C) || (g.I == null) || (g.I.a == 0)) {
      return;
    }
    paramCharSequence = Code(paramCharSequence);
    if ((hasSelection()) || (paramInt3 == -1)) {}
    for (boolean bool = false;; bool = true)
    {
      Code(paramCharSequence, bool);
      return;
    }
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    this.I = false;
    return super.onTextContextMenuItem(paramInt);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if (paramMotionEvent.getAction() == 1) {}
    for (;;)
    {
      this.a = bool;
      bool = super.onTouchEvent(paramMotionEvent);
      this.a = false;
      return bool;
      bool = false;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.EditView
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */