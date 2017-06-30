package com.example.lw.appline.vi.linhcoder.mline;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import com.google.a.a.a.j;
import com.google.ads.AdView;
import com.google.ads.c;
import java.util.Locale;
import java.util.Random;

public class Line
  extends Activity
{
  Resources a = null;
  AlertDialog b = null;
  private AdView c;
  
  public void a()
  {
    this.c = ((AdView)findViewById(2131230721));
    this.c.a(new c());
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 1) {}
    for (String str = "http://ibet88.us/cai/d149";; str = "http://linhcoder.com/CleverStoreClient.apk")
    {
      startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
      return;
    }
  }
  
  public void b()
  {
    new Handler().postDelayed(new Runnable()
    {
      public void run()
      {
        Line.this.a();
      }
    }, 4000L);
  }
  
  public void c()
  {
    Object localObject1 = LayoutInflater.from(this).inflate(2130903041, null);
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle(this.a.getString(2131034126));
    localBuilder.setView((View)localObject1);
    Button localButton1 = (Button)((View)localObject1).findViewById(2131230724);
    ImageButton localImageButton = (ImageButton)((View)localObject1).findViewById(2131230723);
    final int i = new Random().nextInt(2) + 1;
    if (i == 1) {
      if (Locale.getDefault().getLanguage().equals("vi")) {
        localButton1.setText("Cài đặt game bài iBet88");
      }
    }
    for (;;)
    {
      Object localObject2 = "banner_" + i;
      localImageButton.setBackgroundResource(getResources().getIdentifier((String)localObject2, "drawable", getPackageName()));
      localObject2 = (Button)((View)localObject1).findViewById(2131230725);
      Button localButton2 = (Button)((View)localObject1).findViewById(2131230726);
      Button localButton3 = (Button)((View)localObject1).findViewById(2131230728);
      localObject1 = (Button)((View)localObject1).findViewById(2131230727);
      this.b = localBuilder.create();
      this.b.show();
      localButton1.setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Line.this.b.dismiss();
          Line.this.a(i);
        }
      });
      localImageButton.setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Line.this.b.dismiss();
          Line.this.a(i);
        }
      });
      ((Button)localObject2).setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Line.this.b.dismiss();
          try
          {
            Line.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + "vi.linhcoder.mline")));
            return;
          }
          catch (ActivityNotFoundException paramAnonymousView)
          {
            Line.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + "vi.linhcoder.mline")));
          }
        }
      }());
      localButton2.setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Line.this.b.dismiss();
          try
          {
            Line.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pub:LiCo")));
            return;
          }
          catch (ActivityNotFoundException paramAnonymousView)
          {
            Line.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/search?q=pub:LiCo")));
          }
        }
      });
      localButton3.setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Line.this.b.dismiss();
          Line.this.finish();
          Process.killProcess(Process.myPid());
          System.exit(0);
        }
      });
      ((Button)localObject1).setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Line.this.b.dismiss();
          Line.this.d();
        }
      }());
      return;
      localButton1.setText("Setup game iBet88");
      continue;
      if (Locale.getDefault().getLanguage().equals("vi")) {
        localButton1.setText("Cài đặt ứng dụng CleverStore");
      } else {
        localButton1.setText("Setup app CleverStore");
      }
    }
  }
  
  public void d()
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.putExtra("android.intent.extra.EMAIL", new String[] { this.a.getString(2131034133) });
    localIntent.putExtra("android.intent.extra.SUBJECT", this.a.getString(2131034134));
    localIntent.putExtra("android.intent.extra.TEXT", this.a.getString(2131034135));
    localIntent.setType("message/rfc822");
    try
    {
      startActivity(Intent.createChooser(localIntent, this.a.getString(2131034130)));
      Toast.makeText(this, this.a.getString(2131034131), 0).show();
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Toast.makeText(this, this.a.getString(2131034132), 0).show();
    }
  }
  
  public void e()
  {
    if (this.c != null) {
      this.c.a();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.a = getResources();
    b();
    new a(this, this.a).a();
  }
  
  public void onDestroy()
  {
    e();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0) {}
    switch (paramInt)
    {
    default: 
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    c();
    return true;
  }
  
  public void onStart()
  {
    super.onStart();
    j.a().a(this);
  }
  
  public void onStop()
  {
    super.onStop();
    j.a().b(this);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     vi.linhcoder.mline.Line
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */