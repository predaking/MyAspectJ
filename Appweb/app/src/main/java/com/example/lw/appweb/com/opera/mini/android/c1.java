package com.example.lw.appweb.com.opera.mini.android;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLSurfaceView;
import android.view.View;

public class c
  extends GLSurfaceView
  implements aj
{
  protected boolean Code = false;
  private MiniView I;
  private k Z;
  
  public c(Context paramContext, MiniView paramMiniView)
  {
    super(paramContext);
    this.I = paramMiniView;
    paramContext = new Rect();
    getWindowVisibleDisplayFrame(paramContext);
    this.Z = new k(paramContext.width(), paramContext.height(), this.I);
    setRenderer(this.Z);
    setRenderMode(0);
    setFocusableInTouchMode(true);
    if (ae.ae >= 11) {
      J.Code(this, true);
    }
  }
  
  public void B()
  {
    requestRender();
  }
  
  public void C()
  {
    if (ae.ae > 4)
    {
      queueEvent(new an(this, this));
      return;
    }
    requestRender();
  }
  
  public View Code()
  {
    return this;
  }
  
  public void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    requestRender();
  }
  
  public aj I()
  {
    return this;
  }
  
  public void J()
  {
    if (this.Z != null) {
      this.Z.Z();
    }
  }
  
  public void Z()
  {
    if (this.Z != null) {
      this.Z.I();
    }
  }
  
  public boolean a()
  {
    return this.Z.B();
  }
  
  final void b()
  {
    if (ae.ae < 5) {
      onDetachedFromWindow();
    }
  }
  
  public final void c()
  {
    this.Z.J();
  }
  
  public final void d()
  {
    super.onPause();
  }
  
  public void onPause()
  {
    if (ae.ae < 7)
    {
      this.Code = false;
      queueEvent(new Runnable()
      {
        public final void run()
        {
          synchronized (c.this)
          {
            c.this.d();
            c.this.Code = true;
            c.this.notify();
            return;
          }
        }
      });
      requestRender();
    }
    for (;;)
    {
      try
      {
        boolean bool = this.Code;
        if (!bool) {}
        super.onPause();
      }
      finally
      {
        try
        {
          wait();
          this.Z.Code();
          return;
        }
        catch (InterruptedException localInterruptedException)
        {
          continue;
        }
        localObject = finally;
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.Z.Code(paramInt1, paramInt2);
    this.I.Code(paramInt1, paramInt2);
    requestRender();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.c
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */