package com.example.lw.appweb.com.opera.mini.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import aq;

public class Z
  extends SurfaceView
  implements Callback, aj
{
  private static Runnable B;
  private static int C;
  private static z I;
  private static Bitmap Z;
  private static int a;
  private static int b;
  private static int c;
  private static boolean d = false;
  private static aq e = new aq();
  private MiniView Code;
  private SurfaceHolder J;
  
  public Z(Context paramContext, MiniView paramMiniView)
  {
    super(paramContext);
    this.Code = paramMiniView;
    this.J = getHolder();
    this.J.addCallback(this);
    setFocusableInTouchMode(true);
  }
  
  private void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    if (B == null)
    {
      B = new ai(this);
      new Thread(B).start();
    }
    synchronized (B)
    {
      if (b > 0)
      {
        int i = C;
        int j = b;
        C = Math.min(C, paramInt1);
        b = Math.max(paramInt1 + paramInt3, i + j) - C;
        paramInt1 = a;
        paramInt3 = c;
        a = Math.min(a, paramInt2);
        c = Math.max(paramInt2 + paramInt4, paramInt1 + paramInt3) - a;
        if (paramBoolean)
        {
          d = true;
          B.notify();
        }
        return;
      }
      C = paramInt1;
      a = paramInt2;
      b = paramInt3;
      c = paramInt4;
    }
  }
  
  public void B()
  {
    Code(0, 0, getWidth(), getHeight());
  }
  
  public void C() {}
  
  public View Code()
  {
    return this;
  }
  
  public void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Code(paramInt1, paramInt2, paramInt3, paramInt4, true);
  }
  
  public aj I()
  {
    return this;
  }
  
  public void J()
  {
    if (B != null) {}
    synchronized (B)
    {
      b = 0;
      c = 0;
      C = 0;
      a = 0;
      B.notifyAll();
      e.Code();
      return;
    }
  }
  
  public void Z() {}
  
  public boolean a()
  {
    return true;
  }
  
  public void onPause() {}
  
  public void onResume() {}
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Code(0, 0, paramInt1, paramInt2, false);
    this.Code.Code(paramInt1, paramInt2);
    Code(0, 0, paramInt1, paramInt2, false);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    B();
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder) {}
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {}
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.Z
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */