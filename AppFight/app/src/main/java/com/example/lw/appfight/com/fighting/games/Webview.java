package com.example.lw.appfight.com.fighting.games;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Webview
  extends Activity
{
  String URL = "http://fighting.appkid.org/";
  ProgressBar loadingProgressBar;
  ProgressBar loadingTitle;
  WebView mWebView;
  
  public void displayExitPopUP()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setMessage(2130968589).setTitle(2130968590);
    localBuilder.setPositiveButton(2130968585, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Webview.this.finish();
      }
    });
    localBuilder.setNegativeButton(2130968591, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
    this.mWebView = ((WebView)findViewById(2131165188));
    this.mWebView.setHorizontalScrollBarEnabled(true);
    this.mWebView.getSettings().setLoadsImagesAutomatically(true);
    this.mWebView.getSettings().setAllowFileAccess(true);
    this.mWebView.getSettings().setJavaScriptEnabled(true);
    setProgressBarVisibility(true);
    this.mWebView.getSettings().setPluginsEnabled(true);
    this.mWebView.getSettings().setSupportZoom(true);
    this.mWebView.getSettings().setBuiltInZoomControls(true);
    this.mWebView.getSettings().setUseWideViewPort(true);
    this.mWebView.setInitialScale(1);
    this.mWebView.loadUrl(this.URL);
    Toast.makeText(this, "Fighting Games", 1).show();
    this.mWebView.setWebViewClient(new MyWebViewClient(null));
    this.loadingProgressBar = ((ProgressBar)findViewById(2131165187));
    this.mWebView.setWebViewClient(new WebViewClient()
    {
      public void onReceivedError(WebView paramAnonymousWebView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
      {
        Toast.makeText(jdField_this, "Internet connection down? " + paramAnonymousString1, 0).show();
        paramAnonymousWebView.loadData("<h1>Please check your internet settings. If you are already connected hit BACK Key on your mobile and re-launch the application.</h1>", "text/html", "UTF-8");
      }
      
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        if ((paramAnonymousString != null) && (paramAnonymousString.startsWith("vnd.youtube")))
        {
          paramAnonymousWebView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramAnonymousString)));
          return true;
        }
        if (paramAnonymousString.contains("rtsp"))
        {
          paramAnonymousWebView = new Intent("android.intent.action.VIEW", Uri.parse(paramAnonymousString));
          Webview.this.startActivity(paramAnonymousWebView);
          return true;
        }
        if (paramAnonymousString.startsWith("mailto:"))
        {
          paramAnonymousWebView = paramAnonymousString.replaceFirst("mailto:", "").trim();
          paramAnonymousString = new Intent("android.intent.action.SEND");
          paramAnonymousString.setType("plain/text").putExtra("android.intent.extra.EMAIL", new String[] { paramAnonymousWebView });
          Webview.this.startActivity(paramAnonymousString);
          return true;
        }
        if ((paramAnonymousString.endsWith(".mp4")) || (paramAnonymousString.endsWith(".3gp")))
        {
          paramAnonymousWebView = new Intent("android.intent.action.VIEW");
          paramAnonymousWebView.setDataAndType(Uri.parse(paramAnonymousString), "video/*");
          Webview.this.startActivity(paramAnonymousWebView);
          return true;
        }
        if ((paramAnonymousString.endsWith(".m3u8")) || (paramAnonymousString.startsWith("rtmp")))
        {
          paramAnonymousWebView = new Intent("android.intent.action.VIEW");
          paramAnonymousWebView.setDataAndType(Uri.parse(paramAnonymousString), "video/*");
          Webview.this.startActivity(paramAnonymousWebView);
          return true;
        }
        if (paramAnonymousString.endsWith(".mp3"))
        {
          Intent localIntent = new Intent("android.intent.action.VIEW");
          localIntent.setDataAndType(Uri.parse(paramAnonymousString), "audio/*");
          paramAnonymousWebView.getContext().startActivity(localIntent);
          return true;
        }
        if (paramAnonymousString.startsWith("geo:"))
        {
          paramAnonymousWebView = new Intent("android.intent.action.VIEW", Uri.parse(paramAnonymousString));
          Webview.this.startActivity(paramAnonymousWebView);
          return true;
        }
        if (paramAnonymousString.startsWith("tel:"))
        {
          Webview.this.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(paramAnonymousString)));
          return true;
        }
        if ((paramAnonymousString != null) && (paramAnonymousString.startsWith("https://")))
        {
          paramAnonymousWebView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramAnonymousString)));
          return true;
        }
        if ((paramAnonymousString != null) && (paramAnonymousString.startsWith("market://")))
        {
          paramAnonymousWebView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramAnonymousString)));
          return true;
        }
        return false;
      }
    });
    this.mWebView.setWebChromeClient(new WebChromeClient()
    {
      public void onProgressChanged(WebView paramAnonymousWebView, int paramAnonymousInt)
      {
        super.onProgressChanged(paramAnonymousWebView, paramAnonymousInt);
        Webview.this.loadingProgressBar.setProgress(paramAnonymousInt);
        if (paramAnonymousInt == 100)
        {
          Webview.this.loadingProgressBar.setVisibility(8);
          return;
        }
        Webview.this.loadingProgressBar.setVisibility(0);
      }
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131099648, paramMenu);
    return true;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.mWebView.canGoBack()))
    {
      this.mWebView.goBack();
      return true;
    }
    displayExitPopUP();
    return false;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return new Mainmenu(this).handleMenuSelect(paramMenuItem, this.mWebView);
  }
  
  private class MyWebViewClient
    extends WebViewClient
  {
    private MyWebViewClient() {}
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
    {
      paramWebView.loadUrl(paramString);
      return true;
    }
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.fighting.games.Webview
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */