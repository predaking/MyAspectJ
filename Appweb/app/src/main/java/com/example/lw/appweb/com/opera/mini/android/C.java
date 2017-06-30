package com.example.lw.appweb.com.opera.mini.android;

final class C
  implements Runnable
{
  private EditView Code;
  private String I;
  
  C(EditView paramEditView, String paramString)
  {
    this.Code = paramEditView;
    this.I = paramString;
  }
  
  public final void run()
  {
    this.Code.Code(false);
    this.Code.setText(this.I);
    this.Code.setSelection(this.I.length());
    this.Code.Code(true);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.C
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */