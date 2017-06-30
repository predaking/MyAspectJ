package com.example.lw.appweb.com.opera.mini.android;

import ad;
import android.media.MediaScannerConnection;
import bu;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.Enumeration;
import java.util.Vector;

public final class g
  implements bu
{
  private File Code;
  private OutputStream I;
  private InputStream Z;
  
  public g(File paramFile)
  {
    this.Code = paramFile;
  }
  
  public final boolean B()
  {
    return this.Code.canWrite();
  }
  
  public final void C()
  {
    try
    {
      if (this.I != null)
      {
        this.I.flush();
        this.I.close();
        this.I = null;
      }
      if (this.Z != null)
      {
        this.Z.close();
        this.Z = null;
      }
      if ((this.Code.exists()) && (!this.Code.isDirectory()) && (ad.c(this.Code.getName()) == 0) && (ah.Code.isConnected())) {
        ah.Code.scanFile(this.Code.getAbsolutePath(), null);
      }
      return;
    }
    catch (Throwable localThrowable) {}
  }
  
  public final InputStream Code()
  {
    if (this.Z == null) {
      this.Z = new FileInputStream(this.Code);
    }
    return this.Z;
  }
  
  public final OutputStream Code(long paramLong)
  {
    if (this.I == null)
    {
      FileChannel localFileChannel2 = new RandomAccessFile(this.Code, "rw").getChannel();
      FileChannel localFileChannel1 = localFileChannel2;
      if (paramLong != 0L) {
        localFileChannel1 = localFileChannel2.position(paramLong);
      }
      this.I = Channels.newOutputStream(localFileChannel1);
    }
    return this.I;
  }
  
  public final Enumeration Code(String paramString)
  {
    Vector localVector;
    int i;
    label40:
    StringBuilder localStringBuilder;
    if ((paramString != null) && (paramString.length() > 0))
    {
      paramString = new f(paramString);
      paramString = this.Code.listFiles(paramString);
      localVector = new Vector();
      i = 0;
      if (i >= paramString.length) {
        break label114;
      }
      localStringBuilder = new StringBuilder().append(paramString[i].getName());
      if (!paramString[i].isDirectory()) {
        break label108;
      }
    }
    label108:
    for (String str = "/";; str = "")
    {
      localVector.addElement(str);
      i += 1;
      break label40;
      paramString = this.Code.listFiles();
      break;
    }
    label114:
    return localVector.elements();
  }
  
  public final String I()
  {
    return this.Code.getAbsolutePath();
  }
  
  public final boolean J()
  {
    return this.Code.exists();
  }
  
  public final long Z()
  {
    return this.Code.length();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.g
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */