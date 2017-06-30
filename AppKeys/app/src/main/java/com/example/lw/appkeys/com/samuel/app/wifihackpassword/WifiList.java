package com.example.lw.appkeys.com.samuel.app.wifihackpassword;

import android.app.Activity;
import android.content.Intent;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.google.ads.AdView;
import java.util.List;

public class WifiList
  extends Activity
  implements OnItemClickListener
{
  private AdView adView;
  private WifiManager manWifi;
  private Element[] nets;
  private List<ScanResult> wifiList;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setRequestedOrientation(1);
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    this.manWifi = ((WifiManager)getSystemService("wifi"));
    this.manWifi.startScan();
    this.wifiList = this.manWifi.getScanResults();
    this.nets = new Element[this.wifiList.size()];
    int i = 0;
    for (;;)
    {
      if (i >= this.wifiList.size())
      {
        setContentView(2130903045);
        paramBundle = new AdapterElements(this);
        localObject = (ListView)findViewById(2131230748);
        ((ListView)localObject).setAdapter(paramBundle);
        ((ListView)localObject).setOnItemClickListener(this);
        return;
      }
      Object localObject = ((ScanResult)this.wifiList.get(i)).toString().split(",");
      String str = localObject[0];
      paramBundle = localObject[2];
      localObject = localObject[3];
      str = str.split(":")[1];
      paramBundle = paramBundle.split(":")[1];
      localObject = localObject.split(":")[1];
      this.nets[i] = new Element(str, paramBundle, (String)localObject);
      this.adView = ((AdView)findViewById(2131230733));
      i += 1;
    }
  }
  
  public void onDestroy()
  {
    if (this.adView != null) {
      this.adView.destroy();
    }
    super.onDestroy();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject = ((ScanResult)this.wifiList.get(paramInt)).toString().split(",");
    paramView = localObject[0];
    String str2 = localObject[1];
    paramAdapterView = localObject[2];
    String str1 = localObject[3];
    localObject = localObject[4];
    paramView = paramView.split(":")[1].substring(1);
    str2 = str2.substring(7).split(" ")[1];
    paramAdapterView = paramAdapterView.split(":")[1];
    if (paramAdapterView.equals(" ")) {}
    for (paramAdapterView = "No security";; paramAdapterView = paramAdapterView.split(" ")[1])
    {
      str1 = str1.split(":")[1].split(" ")[1];
      localObject = localObject.split(":")[1].split(" ")[1];
      Intent localIntent = new Intent(this, WifiInfo.class);
      localIntent.putExtra("ssid", paramView);
      localIntent.putExtra("bssid", str2);
      localIntent.putExtra("security", paramAdapterView);
      localIntent.putExtra("power", str1);
      localIntent.putExtra("frecuency", (String)localObject);
      startActivity(localIntent);
      return;
    }
  }
  
  class AdapterElements
    extends ArrayAdapter<Object>
  {
    Activity context;
    
    public AdapterElements(Activity paramActivity)
    {
      super(2130903040, WifiList.this.nets);
      this.context = paramActivity;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramView = this.context.getLayoutInflater().inflate(2130903040, null);
      ((TextView)paramView.findViewById(2131230722)).setText(WifiList.this.nets[paramInt].getSSID());
      ((TextView)paramView.findViewById(2131230725)).setText(WifiList.this.nets[paramInt].getSecurity());
      paramViewGroup = (ImageView)paramView.findViewById(2131230728);
      Integer localInteger = Integer.valueOf(Integer.parseInt(WifiList.this.nets[paramInt].getPower().split(" ")[1].toString()));
      if (localInteger.intValue() >= -70)
      {
        paramViewGroup.setImageResource(2130837511);
        return paramView;
      }
      if ((localInteger.intValue() < -71) && (localInteger.intValue() >= -80))
      {
        paramViewGroup.setImageResource(2130837510);
        return paramView;
      }
      if ((localInteger.intValue() < 81) && (localInteger.intValue() >= 85))
      {
        paramViewGroup.setImageResource(2130837509);
        return paramView;
      }
      paramViewGroup.setImageResource(2130837508);
      return paramView;
    }
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.samuel.app.wifihackpassword.WifiList
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */