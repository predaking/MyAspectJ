package com.example.lw.appweb.com.opera.mini.android;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;

class af
{
  private static ByteBuffer b;
  private boolean B;
  private int C;
  private long Code;
  private Bitmap I;
  private int J;
  private int Z;
  private int a;
  
  public af(long paramLong)
  {
    this.Code = paramLong;
  }
  
  public af(Bitmap paramBitmap)
  {
    this.Z = paramBitmap.getHeight();
    this.J = paramBitmap.getWidth();
    this.B = paramBitmap.hasAlpha();
    this.C = paramBitmap.getRowBytes();
    if (paramBitmap.getConfig() == Config.ALPHA_8) {
      this.a = 0;
    }
    for (;;)
    {
      this.I = paramBitmap;
      return;
      if (paramBitmap.getConfig() == Config.ARGB_4444) {
        this.a = 1;
      } else if (paramBitmap.getConfig() == Config.ARGB_8888) {
        this.a = 2;
      } else if (paramBitmap.getConfig() == Config.RGB_565) {
        this.a = 3;
      } else {
        this.a = -1;
      }
    }
  }
  
  public void Code(ByteBuffer paramByteBuffer)
  {
    this.I.copyPixelsToBuffer(paramByteBuffer);
  }
  
  public byte[] Code()
  {
    int i = this.C * this.Z;
    if ((b == null) || (b.capacity() < i)) {
      b = ByteBuffer.allocate(i);
    }
    b.rewind();
    this.I.copyPixelsToBuffer(b);
    return b.array();
  }
  
  protected native void finalize();
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.af
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */