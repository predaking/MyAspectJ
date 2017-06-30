package com.example.lw.appweb;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public final class aa
{
  private Vector Code = new Vector();
  
  private void Code(ac paramac)
  {
    int i = this.Code.size();
    while (i > 0)
    {
      int j = paramac.Code((ac)this.Code.elementAt(i - 1));
      if (j == 0)
      {
        this.Code.insertElementAt(paramac, i);
        return;
      }
      if (j > 0)
      {
        this.Code.insertElementAt(paramac, i);
        return;
      }
      i -= 1;
    }
    this.Code.insertElementAt(paramac, 0);
  }
  
  public final Vector Code()
  {
    return this.Code;
  }
  
  public final void Code(InputStream paramInputStream)
  {
    this.Code.removeAllElements();
    bh localbh = new bh(paramInputStream);
    if ((localbh.readByte() != 69) || (localbh.readByte() != 80)) {
      throw new IOException();
    }
    int j = 0;
    int i = 0;
    try
    {
      for (;;)
      {
        int k = localbh.readByte();
        switch (k)
        {
        case 3: 
        default: 
          throw new IOException();
        case 0: 
          if (i != 0) {
            throw new IOException();
          }
          paramInputStream = new aj();
        }
        for (;;)
        {
          j = paramInputStream.Code(localbh, j);
          if (!(paramInputStream instanceof n)) {
            break label232;
          }
          paramInputStream = (n)paramInputStream;
          k = 0;
          while (k < paramInputStream.Code.length)
          {
            Code(new bs(paramInputStream.Code[k], paramInputStream.I, paramInputStream.J, paramInputStream.Z, paramInputStream.B));
            k += 1;
          }
          paramInputStream = new bp();
          continue;
          paramInputStream = new bs();
          continue;
          paramInputStream = new n();
        }
      }
      label232:
      if ((paramInputStream instanceof aj)) {
        i = 1;
      }
      for (;;)
      {
        Code(paramInputStream);
        break;
      }
    }
    catch (EOFException paramInputStream)
    {
      if (i == 0) {
        throw new IOException();
      }
      return;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     aa
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */