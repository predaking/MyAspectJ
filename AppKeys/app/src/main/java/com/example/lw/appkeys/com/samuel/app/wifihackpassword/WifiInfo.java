package com.example.lw.appkeys.com.samuel.app.wifihackpassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import com.google.ads.AdView;

public class WifiInfo
  extends Activity
{
  private AdView adView;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setRequestedOrientation(1);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(2130903044);
    Bundle localBundle = getIntent().getExtras();
    String str1 = null;
    paramBundle = null;
    String str2 = null;
    Object localObject2 = null;
    Object localObject1 = null;
    if (localBundle != null)
    {
      str1 = localBundle.getString("ssid");
      paramBundle = localBundle.getString("bssid");
      str2 = localBundle.getString("security");
      localObject2 = localBundle.getString("power");
      localObject1 = localBundle.getString("frecuency");
      this.adView = ((AdView)findViewById(2131230733));
    }
    ((TextView)findViewById(2131230735)).setText(str1);
    ((TextView)findViewById(2131230737)).setText(paramBundle);
    ((TextView)findViewById(2131230739)).setText(str2);
    ((TextView)findViewById(2131230742)).setText((CharSequence)localObject2);
    ((TextView)findViewById(2131230745)).setText((CharSequence)localObject1);
    localObject1 = (TextView)findViewById(2131230747);
    if (str1.contains("_"))
    {
      localObject2 = str1.split("_");
      str1 = localObject2[0];
      localObject2 = localObject2[1];
      paramBundle = paramBundle.split(":");
      paramBundle = paramBundle[0] + paramBundle[1] + paramBundle[2] + paramBundle[3] + paramBundle[4] + paramBundle[5];
      if ((str1.equals("JAZZTEL")) || (str1.equals("WLAN")))
      {
        if (((String)localObject2).length() == 4)
        {
          ((TextView)localObject1).setText(new KeyGenerator().calcularClave((String)localObject2, paramBundle.toUpperCase()));
          ((TextView)localObject1).setTextColor(-16711936);
          return;
        }
        ((TextView)localObject1).setText("NO");
        ((TextView)localObject1).setTextColor(-65536);
        return;
      }
      ((TextView)localObject1).setText("NO");
      ((TextView)localObject1).setTextColor(-65536);
      return;
    }
    ((TextView)localObject1).setText("NO");
    ((TextView)localObject1).setTextColor(-65536);
  }
  
  public void onDestroy()
  {
    if (this.adView != null) {
      this.adView.destroy();
    }
    super.onDestroy();
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.samuel.app.wifihackpassword.WifiInfo
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */