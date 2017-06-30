package com.example.lw.appweb.com.opera.mini.android;

import android.text.Editable;
import android.view.inputmethod.BaseInputConnection;

final class ap
  implements Runnable
{
  private final String Code;
  private final boolean I;
  private final int Z;
  
  ap(URLEditView paramURLEditView, String paramString, int paramInt, boolean paramBoolean)
  {
    this.Code = paramString;
    this.Z = paramInt;
    this.I = paramBoolean;
  }
  
  public final void run()
  {
    this.J.beginBatchEdit();
    Editable localEditable = this.J.getText();
    int i = BaseInputConnection.getComposingSpanStart(localEditable);
    if (BaseInputConnection.getComposingSpanEnd(localEditable) - i > 0) {}
    for (i = 1; (i != 0) && (!this.I); i = 0)
    {
      this.J.endBatchEdit();
      return;
    }
    BaseInputConnection.removeComposingSpans(localEditable);
    if ((this.I) || (this.Code.startsWith(this.J.Code(localEditable))))
    {
      URLEditView.Code(this.J);
      this.J.setText(this.Code);
      this.J.setSelection(this.Code.length());
      this.J.extendSelection(this.Z);
    }
    this.J.endBatchEdit();
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ap
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */