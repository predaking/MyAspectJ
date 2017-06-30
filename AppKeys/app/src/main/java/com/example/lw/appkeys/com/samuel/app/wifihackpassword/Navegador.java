package com.example.lw.appkeys.com.samuel.app.wifihackpassword;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Navegador
  extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903043);
    paramBundle = (WebView)findViewById(2131230734);
    WebSettings localWebSettings = paramBundle.getSettings();
    localWebSettings.setSupportZoom(true);
    localWebSettings.setBuiltInZoomControls(true);
    localWebSettings.setUseWideViewPort(true);
    paramBundle.loadUrl("https://play.google.com/store/apps/developer?id=ANDROID+CREW+INC");
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.samuel.app.wifihackpassword.Navegador
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */