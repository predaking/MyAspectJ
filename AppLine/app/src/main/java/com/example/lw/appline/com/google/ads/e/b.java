package com.example.lw.appline.com.google.ads.e;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient.CustomViewCallback;
import com.google.ads.ap;
import com.google.ads.b.a;
import com.google.ads.b.c;
import com.google.ads.d;

@TargetApi(14)
public class b
{
  public static class a
    extends c
  {
    public a(ap paramap, d paramd)
    {
      super(paramd);
    }
    
    public boolean canScrollHorizontally(int paramInt)
    {
      if (this.a.e.a() != null) {
        return !((a)this.a.e.a()).b();
      }
      return super.canScrollHorizontally(paramInt);
    }
    
    public boolean canScrollVertically(int paramInt)
    {
      if (this.a.e.a() != null) {
        return !((a)this.a.e.a()).b();
      }
      return super.canScrollVertically(paramInt);
    }
  }
  
  public static class b
    extends i.a
  {
    public b(ap paramap)
    {
      super();
    }
    
    public void onShowCustomView(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
    {
      paramCustomViewCallback.onCustomViewHidden();
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.e.b
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */