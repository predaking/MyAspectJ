package com.example.lw.appweb.com.opera.mini.android;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class am
  implements al
{
  private z Code;
  private ByteBuffer I;
  
  public am(z paramz, ByteBuffer paramByteBuffer)
  {
    this.Code = paramz;
    this.I = paramByteBuffer;
  }
  
  public final void Code(Bitmap paramBitmap)
  {
    paramBitmap.copyPixelsFromBuffer(this.I);
  }
  
  public native boolean Code();
  
  public native void I();
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.am
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */