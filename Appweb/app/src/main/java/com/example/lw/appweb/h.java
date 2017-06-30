package com.example.lw.appweb;

import android.net.Uri;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public final class h
  implements bo
{
  private Socket Code;
  
  public h(String paramString)
  {
    paramString = Uri.parse(paramString);
    this.Code = new Socket(paramString.getHost(), paramString.getPort());
    this.Code.setSoLinger(true, 0);
    this.Code.setSoTimeout(0);
    this.Code.setReceiveBufferSize(65536);
    this.Code.setKeepAlive(true);
  }
  
  public final DataOutputStream Code()
  {
    return new DataOutputStream(this.Code.getOutputStream());
  }
  
  public final DataInputStream I()
  {
    return new DataInputStream(this.Code.getInputStream());
  }
  
  public final void Z()
  {
    this.Code.close();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     h
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */