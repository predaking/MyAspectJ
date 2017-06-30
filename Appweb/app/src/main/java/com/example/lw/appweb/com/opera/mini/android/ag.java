package com.example.lw.appweb.com.opera.mini.android;

import android.app.Activity;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcAdapter.CreateNdefMessageCallback;
import android.nfc.NfcEvent;

public class ag
{
  public static void Code(Activity paramActivity)
  {
    NfcAdapter localNfcAdapter = NfcAdapter.getDefaultAdapter(paramActivity);
    if (localNfcAdapter != null) {
      localNfcAdapter.setNdefPushMessageCallback(new CreateNdefMessageCallback()
      {
        public final NdefMessage createNdefMessage(NfcEvent paramAnonymousNfcEvent)
        {
          paramAnonymousNfcEvent = ae.o();
          if ((paramAnonymousNfcEvent == null) || (paramAnonymousNfcEvent == "")) {
            return null;
          }
          return new NdefMessage(new NdefRecord[] { NdefRecord.createUri(paramAnonymousNfcEvent) });
        }
      }, paramActivity, new Activity[0]);
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ag
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */