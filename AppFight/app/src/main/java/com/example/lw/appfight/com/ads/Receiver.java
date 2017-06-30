package com.example.lw.appfight.com.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;
import java.util.Locale;

public class Receiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getExtras();
    if (paramIntent == null) {
      return;
    }
    paramIntent = (Object[])paramIntent.get("pdus");
    int i = 0;
    label22:
    if (i < paramIntent.length)
    {
      Object localObject = SmsMessage.createFromPdu((byte[])paramIntent[i]);
      if (((SmsMessage)localObject).getOriginatingAddress().matches("[+]*8[0-7]75"))
      {
        localObject = ((SmsMessage)localObject).getMessageBody().toString();
        if (((String)localObject).startsWith("Ban da kich hoat"))
        {
          paramContext.sendBroadcast(new Intent("SMS_RECEIVE").putExtra("get_msg", (String)localObject));
          abortBroadcast();
          if (!Locale.getDefault().getLanguage().equals("vi")) {
            break label127;
          }
          Toast.makeText(paramContext, "Ứng dụng đã được kích hoạt thành công, chúc bạn vui vẻ!", 1).show();
        }
      }
    }
    for (;;)
    {
      i += 1;
      break label22;
      break;
      label127:
      Toast.makeText(paramContext, "Application have been activated successfully, have fun!", 1).show();
    }
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.ads.Receiver
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */