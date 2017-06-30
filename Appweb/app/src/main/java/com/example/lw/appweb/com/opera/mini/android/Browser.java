package com.example.lw.appweb.com.opera.mini.android;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import ap;
import aw;
import b;
import e;
import g;
import j;
import java.util.ArrayList;
import java.util.HashSet;

public class Browser
  extends Activity
{
  static l Code;
  static Browser I;
  private static boolean d = false;
  private Intent B;
  private boolean C;
  private Configuration J;
  protected boolean Z = false;
  private boolean a;
  private boolean b = false;
  private boolean c = false;
  
  private void Code(final String paramString)
  {
    if (paramString == null) {
      return;
    }
    new Thread()
    {
      public final void run()
      {
        while ((!Browser.Code.C) || (!Browser.this.Z) || (!MiniView.Code.I.a())) {
          b.Code();
        }
        g.I.B();
        g.Z.b(g.Z.Code(paramString));
        g.I.Code(5);
      }
    }.start();
  }
  
  private boolean Code(Configuration paramConfiguration)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    switch (paramConfiguration.orientation)
    {
    default: 
      return false;
    case 2: 
      if (!this.C) {
        bool1 = true;
      }
      this.C = true;
      return bool1;
    }
    if (this.C) {}
    for (bool1 = bool2;; bool1 = false)
    {
      this.C = false;
      return bool1;
    }
  }
  
  private boolean I(Configuration paramConfiguration)
  {
    boolean bool1 = false;
    boolean bool2 = true;
    switch (paramConfiguration.hardKeyboardHidden)
    {
    default: 
      return false;
    case 2: 
      if (!this.a) {
        break;
      }
    }
    for (bool1 = bool2;; bool1 = false)
    {
      this.a = false;
      return bool1;
      if (!this.a) {
        bool1 = true;
      }
      this.a = true;
      return bool1;
    }
  }
  
  private native void b();
  
  public final boolean B()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.J != null) {
      if (this.J.keyboard != 2)
      {
        bool1 = bool2;
        if (this.J.keyboard != 3) {}
      }
      else
      {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final boolean C()
  {
    return this.a;
  }
  
  public native void Code();
  
  protected final void Code(boolean paramBoolean)
  {
    WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
    int i = localLayoutParams.flags;
    if ((I.ah() & paramBoolean)) {}
    for (localLayoutParams.flags |= 1024;; localLayoutParams.flags &= -1025)
    {
      if (i != localLayoutParams.flags) {
        getWindow().setAttributes(localLayoutParams);
      }
      return;
    }
  }
  
  public final boolean I()
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)getSystemService("connectivity");
    return (!this.c) || (localConnectivityManager.getBackgroundDataSetting());
  }
  
  public final boolean J()
  {
    return this.C;
  }
  
  final boolean Z()
  {
    return this.b;
  }
  
  public final boolean a()
  {
    Object localObject = getPreferences(0);
    boolean bool = ((SharedPreferences)localObject).getBoolean("isFirstRun", true);
    if (bool)
    {
      localObject = ((SharedPreferences)localObject).edit();
      ((Editor)localObject).putBoolean("isFirstRun", false);
      ((Editor)localObject).commit();
    }
    return bool;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 140627) && (paramInt2 == -1)) {
      Code.Code(paramIntent);
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    int j = 0;
    super.onConfigurationChanged(paramConfiguration);
    this.J = new Configuration(paramConfiguration);
    if ((I(this.J)) && (Code.C))
    {
      g.I.B();
      paramConfiguration = g.Z;
      if (!this.a) {
        break label152;
      }
    }
    label152:
    for (int i = 1;; i = 0)
    {
      paramConfiguration.c(i);
      g.I.Code(43);
      if ((Code(this.J)) && (Code.C))
      {
        g.I.B();
        paramConfiguration = g.Z;
        i = j;
        if (this.C) {
          i = 1;
        }
        paramConfiguration.c(i);
        g.I.Code(55);
      }
      if ((MiniView.Code.a()) && (I.Code != null))
      {
        I.Code.requestFocus();
        I.B(true);
      }
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = true;
    super.onCreate(paramBundle);
    System.setProperty("http.keepAlive", "false");
    if (I != null)
    {
      finish();
      return;
    }
    I = this;
    ae.Code(this);
    boolean bool1;
    if ((d) || (I == null))
    {
      b();
      Code.Code(this);
      this.J = new Configuration(getResources().getConfiguration());
      Code(this.J);
      I(this.J);
      setContentView(2130903040);
      Code(true);
      Code = new l(new I(this, getAssets()));
      g.Code.R();
      if ((new HashSet() {}.contains(Build.MODEL)) || ((Integer.parseInt(VERSION.SDK) >= 11) && (Code.b()))) {
        break label295;
      }
      bool1 = true;
      label169:
      b.z = bool1;
      if (!Code.b()) {
        break label300;
      }
      bool1 = bool2;
    }
    for (;;)
    {
      for (;;)
      {
        b.Code = bool1;
        if ((ae.ae >= 14) && (I != null)) {
          ag.Code(I);
        }
        this.B = getIntent();
        new q().start();
        i.I();
        return;
        paramBundle = "/data/data/" + I.getComponentName().getPackageName() + "/lib/" + System.mapLibraryName("om");
        try
        {
          System.load(paramBundle);
          d = true;
        }
        catch (Throwable paramBundle)
        {
          for (;;)
          {
            System.loadLibrary("om");
          }
        }
      }
      label295:
      bool1 = false;
      break label169;
      label300:
      bool1 = bool2;
      if (getResources().getConfiguration().touchscreen == 1) {
        bool1 = false;
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.b = true;
    if ((g.I != null) && (!g.Code.p()))
    {
      g.I.B();
      g.I.Code(48);
    }
    MiniView.Code.I.J();
    ((ad)j.Code).Code();
    g.Code.S();
    System.exit(0);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    this.B = paramIntent;
  }
  
  protected void onPause()
  {
    super.onPause();
    MiniView.Code.I.onPause();
    this.c = true;
    if (!I()) {
      ap.I();
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
    if (Code.C)
    {
      g.I.B();
      g.I.Code(1);
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    MiniView.Code.I.onResume();
    this.c = false;
    Object localObject1;
    Object localObject2;
    int i;
    if (this.B != null)
    {
      localObject1 = this.B;
      if ((((Intent)localObject1).getFlags() & 0x100000) == 0)
      {
        localObject2 = ((Intent)localObject1).getAction();
        if ((ae.ae < 9) || (!ak.Code((String)localObject2))) {
          break label105;
        }
        i = 1;
        if (i == 0) {
          break label110;
        }
        if ((ae.ae >= 9) && (I != null))
        {
          localObject1 = ak.Code((Intent)localObject1);
          if (localObject1 != null) {
            I.Code((String)localObject1);
          }
        }
      }
    }
    for (;;)
    {
      this.B = null;
      return;
      label105:
      i = 0;
      break;
      label110:
      if ("android.speech.action.VOICE_SEARCH_RESULTS".equals(((Intent)localObject1).getAction()))
      {
        localObject2 = ((Intent)localObject1).getStringArrayListExtra("android.speech.extras.VOICE_SEARCH_RESULT_URLS");
        if ((localObject2 != null) && (((ArrayList)localObject2).get(0) != null)) {
          Code((String)((ArrayList)localObject2).get(0));
        }
      }
      else
      {
        localObject2 = ((Intent)localObject1).getDataString();
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((String)localObject2).startsWith("operamini:")) {
            localObject1 = ((String)localObject2).substring(10);
          }
          if (((String)localObject1).length() > 0) {
            Code((String)localObject1);
          }
        }
      }
    }
  }
  
  public boolean onSearchRequested()
  {
    return false;
  }
  
  protected void onStart()
  {
    super.onStart();
    this.Z = true;
    Code.y();
  }
  
  protected void onStop()
  {
    super.onStop();
    try
    {
      if ((Code.C) && (b.D) && (!g.Code.p()))
      {
        Code.B();
        Code.Code(false);
        Code.Code(0);
      }
      label50:
      Code.J();
      MiniView.Code.I.Z();
      this.Z = false;
      return;
    }
    catch (Throwable localThrowable)
    {
      break label50;
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if (g.Code.p()) {
      return;
    }
    g.I.I(paramBoolean);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.Browser
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */