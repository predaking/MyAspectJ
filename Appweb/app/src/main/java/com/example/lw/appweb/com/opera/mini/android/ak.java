package com.example.lw.appweb.com.opera.mini.android;

import android.content.Intent;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import java.nio.charset.Charset;
import java.util.Arrays;

public class ak
{
  private static final String[] Code = { "", "http://www.", "https://www.", "http://", "https://", "tel:", "mailto:", "ftp://anonymous:anonymous@", "ftp://ftp.", "ftps://", "sftp://", "smb://", "nfs://", "ftp://", "dav://", "news:", "telnet://", "imap:", "rtsp://", "urn:", "pop:", "sip:", "sips:", "tftp:", "btspp://", "btl2cap://", "btgoep://", "tcpobex://", "irdaobex://", "file://", "urn:epc:id:", "urn:epc:tag:", "urn:epc:pat:", "urn:epc:raw:", "urn:epc:", "urn:nfc:" };
  
  public static String Code(Intent paramIntent)
  {
    paramIntent = (NdefMessage)paramIntent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES")[0];
    if (paramIntent.getRecords().length > 0)
    {
      paramIntent = paramIntent.getRecords()[0];
      int i = paramIntent.getTnf();
      if (i == 3) {
        return new String(paramIntent.getType(), Charset.forName("UTF-8"));
      }
      if ((i == 1) && (new String(paramIntent.getType()).equals("U")))
      {
        paramIntent = paramIntent.getPayload();
        if ((paramIntent[0] >= 0) && (paramIntent[0] < Code.length)) {
          return Code[paramIntent[0]] + new String(Arrays.copyOfRange(paramIntent, 1, paramIntent.length), Charset.forName("UTF-8"));
        }
      }
    }
    return null;
  }
  
  public static boolean Code(String paramString)
  {
    return "android.nfc.action.NDEF_DISCOVERED".equals(paramString);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ak
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */