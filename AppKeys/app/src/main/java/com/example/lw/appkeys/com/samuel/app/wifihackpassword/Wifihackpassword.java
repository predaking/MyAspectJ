package com.example.lw.appkeys.com.samuel.app.wifihackpassword;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;
import com.google.ads.AdView;

public class Wifihackpassword
  extends Activity
  implements OnClickListener
{
  private AdView adView;
  private Button button_flu;
  private Button button_scan;
  WifiManager wifi;
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131230732: 
      Toast.makeText(this, "Scanner Wifi Pass...", 1).show();
      startActivity(new Intent(this, WifiList.class));
      return;
    }
    startActivity(new Intent(this, Navegador.class));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setRequestedOrientation(1);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    setContentView(2130903042);
    this.button_scan = ((Button)findViewById(2131230732));
    this.button_flu = ((Button)findViewById(2131230731));
    this.button_scan.setOnClickListener(this);
    this.button_flu.setOnClickListener(this);
    this.adView = ((AdView)findViewById(2131230733));
    this.wifi = ((WifiManager)getSystemService("wifi"));
    if (!this.wifi.isWifiEnabled())
    {
      Toast.makeText(this, getResources().getString(2131034116), 1).show();
      this.wifi.setWifiEnabled(true);
    }
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
 * Qualified Name:     com.samuel.app.wifihackpassword.Wifihackpassword
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */