package com.example.lw.appweb.com.opera.mini.android;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class URLEditView
  extends EditView
{
  private static long B;
  private Timer C;
  private boolean J = false;
  private boolean Z;
  
  public URLEditView(Context paramContext)
  {
    super(paramContext);
    I();
  }
  
  public URLEditView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    I();
  }
  
  public URLEditView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    I();
  }
  
  private void Code()
  {
    if (this.C != null)
    {
      this.C.cancel();
      this.C.purge();
      this.C = null;
    }
  }
  
  private static void I()
  {
    if (Build.DEVICE.indexOf("GT-I9000") >= 0)
    {
      B = 500L;
      return;
    }
    B = 0L;
  }
  
  public final void Code(final String paramString, final int paramInt, final boolean paramBoolean)
  {
    if (B > 0L)
    {
      Code();
      this.C = new Timer();
      this.C.schedule(new TimerTask()
      {
        public final void run()
        {
          URLEditView.this.post(new ap(URLEditView.this, paramString, paramInt, paramBoolean));
        }
      }, B);
      return;
    }
    post(new ap(this, paramString, paramInt, paramBoolean));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((getLineCount() == 1) && ((paramInt == 19) || (paramInt == 20) || (paramInt == 23))) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((getLineCount() == 1) && ((paramInt == 21) || (paramInt == 22)) && (!hasSelection()) && ((this.Code == null) || (!this.Code.equals(Code(getText()))))) {
      Code(Code(getText()), false);
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.Z)
    {
      this.Z = false;
      return;
    }
    Code();
    if ((paramInt3 == 4) && (paramInt1 > 0) && (paramCharSequence.charAt(paramInt1 - 1) == '.') && (paramCharSequence.charAt(paramInt1) == '.'))
    {
      setTextKeepState(new StringBuffer(paramCharSequence.subSequence(0, paramInt1 - 1)).append(paramCharSequence.subSequence(paramInt1, paramInt1 + paramInt3)));
      return;
    }
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
  }
  
  public boolean onTextContextMenuItem(int paramInt)
  {
    boolean bool = false;
    switch (paramInt)
    {
    }
    for (;;)
    {
      bool = super.onTextContextMenuItem(paramInt);
      do
      {
        return bool;
        this.J = true;
        break;
      } while (!this.J);
      this.J = false;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.URLEditView
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */