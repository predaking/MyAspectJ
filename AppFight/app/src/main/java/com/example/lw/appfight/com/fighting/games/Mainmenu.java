package com.example.lw.appfight.com.fighting.games;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.MenuItem;
import android.webkit.WebView;
import com.my.webview.dialog.Aboutlistener;
import com.my.webview.dialog.Exitlistener;

public class Mainmenu
{
  Activity activity;
  
  public Mainmenu(Activity paramActivity)
  {
    this.activity = paramActivity;
  }
  
  public boolean handleMenuSelect(MenuItem paramMenuItem, WebView paramWebView)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return this.activity.onOptionsItemSelected(paramMenuItem);
    case 2131165189: 
      paramWebView.loadUrl(this.activity.getString(2130968577));
      return true;
    case 2131165191: 
      paramWebView.reload();
      return true;
    case 2131165192: 
      paramMenuItem = "Sharing from " + this.activity.getString(2130968576) + ", " + this.activity.getString(2130968580);
      paramWebView = new Intent("android.intent.action.SEND");
      paramWebView.setType("text/plain");
      paramWebView.putExtra("android.intent.extra.TEXT", paramMenuItem);
      this.activity.startActivity(Intent.createChooser(paramWebView, "Share via"));
      return true;
    case 2131165190: 
      paramMenuItem = this.activity.getString(2130968579);
    }
    try
    {
      paramWebView = this.activity.getPackageManager().getPackageInfo(this.activity.getPackageName(), 0).versionName;
      paramMenuItem = paramWebView;
      label186:
      paramWebView = new Aboutlistener();
      new AlertDialog.Builder(this.activity).setMessage(this.activity.getString(2130968588) + paramMenuItem).setPositiveButton(this.activity.getString(2130968585), paramWebView).show();
      return true;
    }
    catch (PackageManager.NameNotFoundException paramWebView)
    {
      break label186;
    }
    paramMenuItem = new Exitlistener(this.activity);
    new AlertDialog.Builder(this.activity).setMessage(this.activity.getString(2130968584)).setPositiveButton(this.activity.getString(2130968586), paramMenuItem).setNegativeButton(this.activity.getString(2130968587), paramMenuItem).show();
    return true;
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.fighting.games.Mainmenu
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */