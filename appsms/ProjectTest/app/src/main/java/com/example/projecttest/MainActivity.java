package com.example.projecttest;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private IntentFilter intentFilter = new IntentFilter(
			"android.provider.Telephony.SMS_RECEIVED");
	private TextView tv;
	private smsBroadcastReceiver smsBR = new smsBroadcastReceiver();

	// private static final String phoneNumber = "+8615876573450";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) this.findViewById(R.id.tv);
		intentFilter.setPriority(2147483647);// 设置优先级

	}

	@Override
	protected void onStart() {
		super.onStart();
		registerReceiver(smsBR, intentFilter);
	}

	@Override
	protected void onStop() {
		super.onStop();
		unregisterReceiver(smsBR);
	}

	/**
	 * 内部类 用于监听短信
	 * 
	 * @author Administrator
	 * 
	 */
	private class smsBroadcastReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			
			/**方法四*/
			Toast.makeText(MainActivity.this,"isOrderedBroadcast~~~"+isOrderedBroadcast(),Toast.LENGTH_LONG).show();
			Log.i("tag", "isOrderedBroadcast()~~"+isOrderedBroadcast());
			
			Bundle bundle = intent.getExtras();
	        Object messages[] = (Object[]) bundle.get("pdus");
	        SmsMessage smsMessage[] = new SmsMessage[messages.length];
	        for (int n = 0; n < messages.length; n++) {
	            smsMessage[n] = SmsMessage.createFromPdu((byte[]) messages[n]);
	            
	            tv.setText("号码："+smsMessage[n].getOriginatingAddress()+"內容："+smsMessage[n].getMessageBody());
//	            System.out.println(smsMessage[n].getOriginatingAddress()+" "+smsMessage[n].getMessageBody()+" "+smsMessage[n].getIndexOnIcc());
	        }

//			 /** 方法三 */
//			 String inf = this.getInf(intent);
//			 tv.setText(inf);

//			/** 方法二 */
//			Bundle bundle = intent.getExtras();
//			if (bundle != null) {
//				StringBuilder body = new StringBuilder();
//				StringBuilder number = new StringBuilder();
//				Object[] _pdus = (Object[]) bundle.get("pdus");
//				SmsMessage[] message = new SmsMessage[_pdus.length];
//				for (int i = 0; i < _pdus.length; i++) {
//					message[i] = SmsMessage.createFromPdu((byte[]) _pdus[i]);
//				}
//
//				for (SmsMessage sm : message) {
//					body.append(sm.getDisplayMessageBody());
//					number.append(sm.getDisplayOriginatingAddress());
//				}
//
//				String bodyStr = body.toString();
//				String numberStr = number.toString();
//				Log.i("lwx", "sms body = " + bodyStr);
//				Log.i("lwx", "sms number = " + numberStr);
//
//				try {
//					int index_1 = bodyStr.indexOf("：");
//					int index_2 = bodyStr.indexOf("；");
//					String str = bodyStr.substring(index_1 + 1, index_2).trim();
//					Log.i("lwx", "str=" + str);
//					int count = Integer.parseInt(str);
//					tv.setText(str);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}

//			/** 方法一 */
//			// 监听短信广播
//			if (intent.getAction().equals(intentFilter)) {
//				Object[] pdus = (Object[]) intent.getExtras().get("pdus");
//				for (Object pdu : pdus) {
//					byte[] data = (byte[]) pdu;
//					SmsMessage message = SmsMessage.createFromPdu(data);
//					String number = message.getOriginatingAddress();
//					String content = message.getMessageBody();
//					int index_1 = content.indexOf("：");
//					int index_2 = content.indexOf("；");
//					String str = content.substring(index_1 + 1, index_2).trim();
//					tv.setText("号码："+number+"内容："+str);
//				}
//			}
		}
		
//		/**
//		 * 方法三 ~~~扩展方法
//		 * 
//		 * @param intent
//		 * @return
//		 */
//		private String getInf(Intent intent) {
//			if (intent.getAction().equals(intentFilter)) {
//				/* 创建字符串变量sb */
//				StringBuilder sb = new StringBuilder();
//				/** 接收由Intent传来的数据 */
//				Bundle bundle = intent.getExtras();
//				/** 判断Intent有无数据 */
//				if (bundle != null) {
//					/**
//					 * pdus为 android内置短信参数 identifier
//					 * 通过bundle.get("")返回一包含pdus对象ン
//					 */
//					Object[] myOBJpdus = (Object[]) bundle.get("pdus");
//					/* 构建短信对象array,并根据收到的对象长度来定义array的大小 */
//					SmsMessage[] messages = new SmsMessage[myOBJpdus.length];
//					for (int i = 0; i < messages.length; i++) {
//						messages[i] = SmsMessage
//								.createFromPdu((byte[]) myOBJpdus[i]);
//					}
//					/* 把传来的短信合并定义在stringbuffer中 */
//					for (SmsMessage currentMessage : messages) {
//						sb.append("接收到来自:\n");
//						/* 发送人电话号码 */
//						sb.append(currentMessage.getDisplayOriginatingAddress());
//						sb.append("\n------传来的短信------\n");
//						/* 取得传来的信息 */
//						sb.append(currentMessage.getDisplayMessageBody());
//					}
//				}
//				/** 以(Toase)形式展示 */
//				tv.setText(sb.toString());
//				Log.i("tag", sb.toString());
//				Toast.makeText(MainActivity.this, "" + sb.toString(),
//						Toast.LENGTH_LONG).show();
//				return sb.toString();
//			}
//			return "";
//		}

	}
}
