package com.example.lw.appweb;

import android.text.ClipboardManager;

public final class be
{
  private ClipboardManager Code;
  
  public be(ClipboardManager paramClipboardManager)
  {
    this.Code = paramClipboardManager;
  }
  
  public final String Code()
  {
    return this.Code.getText().toString();
  }
  
  public final void Code(String paramString)
  {
    this.Code.setText(paramString);
  }
  
  public final boolean I()
  {
    return this.Code.hasText();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     be
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */