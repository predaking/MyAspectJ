package com.example.lw.appweb.com.opera.mini.android;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;

public class aa
  extends d
  implements OnScaleGestureListener
{
  ScaleGestureDetector I;
  Context Z;
  
  public aa(Context paramContext)
  {
    this.Z = paramContext;
    this.I = new ScaleGestureDetector(paramContext, this);
  }
  
  private void Code(int paramInt, ScaleGestureDetector paramScaleGestureDetector)
  {
    Code(paramInt, (int)paramScaleGestureDetector.getFocusX(), (int)paramScaleGestureDetector.getFocusY(), (int)(paramScaleGestureDetector.getCurrentSpan() * 16.0F));
  }
  
  public boolean Code(MotionEvent paramMotionEvent)
  {
    this.Code = ((int)paramMotionEvent.getEventTime());
    int i = paramMotionEvent.getPointerCount();
    this.I.onTouchEvent(paramMotionEvent);
    if ((this.I.isInProgress()) && (i == 1))
    {
      onScaleEnd(this.I);
      this.I = new ScaleGestureDetector(this.Z, this);
    }
    return i > 1;
  }
  
  public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    Code(62, paramScaleGestureDetector);
    return true;
  }
  
  public boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    Code(61, paramScaleGestureDetector);
    return true;
  }
  
  public void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
    Code(63, paramScaleGestureDetector);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.aa
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */