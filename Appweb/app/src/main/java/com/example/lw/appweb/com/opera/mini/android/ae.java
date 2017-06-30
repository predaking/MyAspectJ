package com.example.lw.appweb.com.opera.mini.android;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import b;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

public class ae
  extends b
{
  public static DisplayMetrics aa;
  public static String ab;
  public static String ac;
  public static long ad;
  public static int ae;
  private static long af;
  private static float ag = 0.0F;
  private static float ah = 0.0F;
  private static String ai = null;
  private static String aj = null;
  private static String ak;
  private static Object al = new Object();
  
  public static void Code(int paramInt1, int paramInt2)
  {
    paramInt2 = paramInt1 * paramInt2 * 3 * a / 1024;
    paramInt1 = paramInt2;
    if (Code) {
      paramInt1 = paramInt2 * 12 / 10;
    }
    C = paramInt1;
    paramInt1 = (int)((af - C * 1024) * 2L / 3072L);
    c = paramInt1;
    d = paramInt1 / 5;
  }
  
  public static void Code(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      GoogleAnalyticsTracker localGoogleAnalyticsTracker = GoogleAnalyticsTracker.getInstance();
      if (localGoogleAnalyticsTracker == null) {
        return;
      }
      localGoogleAnalyticsTracker.setAnonymizeIp(true);
      localGoogleAnalyticsTracker.startNewSession(paramString1, paramContext);
      localGoogleAnalyticsTracker.setCustomVar(1, "Application Version", t());
      if ("a".equals("m")) {
        paramContext = "amazon";
      }
      for (;;)
      {
        localGoogleAnalyticsTracker.setCustomVar(2, "Distribution Source", paramContext);
        localGoogleAnalyticsTracker.setCustomVar(3, "CPU architecture", "armv5");
        localGoogleAnalyticsTracker.trackPageView(paramString2);
        localGoogleAnalyticsTracker.dispatch();
        localGoogleAnalyticsTracker.stopSession();
        return;
        if ("m".equals("m")) {
          paramContext = "androidmarket";
        } else if ("o".equals("m")) {
          paramContext = "opera";
        } else if ("s".equals("m")) {
          paramContext = "samsung";
        } else if ("p".equals("m")) {
          paramContext = "preinstall";
        } else if ("l".equals("m")) {
          paramContext = "playnow";
        } else if ("g".equals("m")) {
          paramContext = "storesgeneral";
        } else if ("c".equals("m")) {
          paramContext = "opera_cn";
        } else if ("e".equals("m")) {
          paramContext = "operastore";
        } else if ("x".equals("m")) {
          paramContext = "demo";
        } else {
          paramContext = "m";
        }
      }
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static void Code(Browser paramBrowser)
  {
    q = 2;
    y = true;
    g = true;
    I = d.Code(paramBrowser);
    f = 1;
    e = 0;
    h = r();
    Object localObject1 = new SecureRandom();
    b.I(((SecureRandom)localObject1).nextInt());
    b.I(((SecureRandom)localObject1).nextInt());
    b.I(((SecureRandom)localObject1).nextInt());
    b.E = Math.max(b.E, 160);
    j = 2;
    try
    {
      ae = Integer.parseInt(VERSION.SDK);
      aa = new DisplayMetrics();
      paramBrowser.getWindowManager().getDefaultDisplay().getMetrics(aa);
      m = (int)((m() + l()) / 2.0F);
      i = 20;
      n = true;
      o = true;
      w = '•';
      localObject1 = Locale.getDefault();
      Object localObject2 = ((Locale)localObject1).getLanguage();
      ab = (String)localObject2;
      if (((String)localObject2).equals("no")) {
        ab = "nb";
      }
      ac = ((Locale)localObject1).getCountry().toLowerCase();
      x = true;
      v = true;
      localObject1 = (ActivityManager)paramBrowser.getSystemService("activity");
      localObject2 = new MemoryInfo();
      ((ActivityManager)localObject1).getMemoryInfo((MemoryInfo)localObject2);
      ad = ((MemoryInfo)localObject2).availMem;
      long l = Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory() + Runtime.getRuntime().freeMemory();
      af = l;
      J = Math.min(l, 5242880L);
      u = 4;
      if (Runtime.getRuntime().maxMemory() <= 16777216L) {
        u = 3;
      }
      Runtime.getRuntime().maxMemory();
      if (paramBrowser.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).size() > 0)
      {
        bool = true;
        Z = bool;
        A = 32768;
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        ae = 3;
        continue;
        boolean bool = false;
      }
    }
  }
  
  public static boolean Code(String paramString, PackageManager paramPackageManager)
  {
    try
    {
      paramPackageManager.getPackageInfo(paramString, 0);
      return true;
    }
    catch (NameNotFoundException paramString) {}
    return false;
  }
  
  public static void e(String paramString)
  {
    synchronized (al)
    {
      ak = paramString;
      return;
    }
  }
  
  public static void k()
  {
    F = null;
    X = ab.Code().Z();
    W = ab.Code;
    V = X.length;
  }
  
  public static float l()
  {
    if (ag < 1.0F) {
      s();
    }
    return ag;
  }
  
  public static float m()
  {
    if (ah < 1.0F) {
      s();
    }
    return ah;
  }
  
  public static void n()
  {
    aa = new DisplayMetrics();
    Browser.I.getWindowManager().getDefaultDisplay().getMetrics(aa);
  }
  
  public static String o()
  {
    synchronized (al)
    {
      String str = ak;
      return str;
    }
  }
  
  /* Error */
  public static String p()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_1
    //   4: getstatic 398	com/opera/mini/android/Browser:I	Lcom/opera/mini/android/Browser;
    //   7: invokevirtual 401	com/opera/mini/android/Browser:getPackageManager	()Landroid/content/pm/PackageManager;
    //   10: ldc_w 403
    //   13: iconst_0
    //   14: invokevirtual 407	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   17: ifnonnull +12 -> 29
    //   20: ldc_w 409
    //   23: areturn
    //   24: astore_1
    //   25: ldc_w 409
    //   28: areturn
    //   29: getstatic 30	com/opera/mini/android/ae:ai	Ljava/lang/String;
    //   32: ifnull +7 -> 39
    //   35: getstatic 30	com/opera/mini/android/ae:ai	Ljava/lang/String;
    //   38: areturn
    //   39: ldc_w 411
    //   42: invokestatic 417	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   45: astore_3
    //   46: getstatic 398	com/opera/mini/android/Browser:I	Lcom/opera/mini/android/Browser;
    //   49: aload_3
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: aconst_null
    //   54: invokevirtual 421	com/opera/mini/android/Browser:managedQuery	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   57: astore_3
    //   58: aload_3
    //   59: ifnull +256 -> 315
    //   62: aload_3
    //   63: invokeinterface 426 1 0
    //   68: ifeq +247 -> 315
    //   71: aload_3
    //   72: aload_3
    //   73: ldc_w 428
    //   76: invokeinterface 431 2 0
    //   81: invokeinterface 435 2 0
    //   86: putstatic 30	com/opera/mini/android/ae:ai	Ljava/lang/String;
    //   89: aload_3
    //   90: aload_3
    //   91: ldc_w 437
    //   94: invokeinterface 431 2 0
    //   99: invokeinterface 435 2 0
    //   104: astore 4
    //   106: aload_3
    //   107: aload_3
    //   108: ldc_w 439
    //   111: invokeinterface 431 2 0
    //   116: invokeinterface 435 2 0
    //   121: astore 5
    //   123: aload_3
    //   124: aload_3
    //   125: ldc_w 441
    //   128: invokeinterface 431 2 0
    //   133: invokeinterface 435 2 0
    //   138: astore 6
    //   140: aload_3
    //   141: ldc_w 443
    //   144: invokeinterface 431 2 0
    //   149: istore_0
    //   150: iload_0
    //   151: iconst_m1
    //   152: if_icmpeq +13 -> 165
    //   155: aload_3
    //   156: iload_0
    //   157: invokeinterface 435 2 0
    //   162: putstatic 32	com/opera/mini/android/ae:aj	Ljava/lang/String;
    //   165: getstatic 398	com/opera/mini/android/Browser:I	Lcom/opera/mini/android/Browser;
    //   168: iconst_0
    //   169: invokevirtual 447	com/opera/mini/android/Browser:getPreferences	(I)Landroid/content/SharedPreferences;
    //   172: ldc_w 449
    //   175: iconst_0
    //   176: invokeinterface 455 3 0
    //   181: ifne +78 -> 259
    //   184: aload 5
    //   186: ifnull +73 -> 259
    //   189: aload 5
    //   191: ldc_w 457
    //   194: invokevirtual 99	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   197: ifne +62 -> 259
    //   200: aload 6
    //   202: ifnull +57 -> 259
    //   205: aload 6
    //   207: ldc_w 457
    //   210: invokevirtual 99	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   213: ifne +46 -> 259
    //   216: getstatic 461	g:Code	Le;
    //   219: aload 5
    //   221: aload 6
    //   223: invokeinterface 465 3 0
    //   228: getstatic 398	com/opera/mini/android/Browser:I	Lcom/opera/mini/android/Browser;
    //   231: iconst_0
    //   232: invokevirtual 447	com/opera/mini/android/Browser:getPreferences	(I)Landroid/content/SharedPreferences;
    //   235: invokeinterface 469 1 0
    //   240: astore_3
    //   241: aload_3
    //   242: ldc_w 449
    //   245: iconst_1
    //   246: invokeinterface 475 3 0
    //   251: pop
    //   252: aload_3
    //   253: invokeinterface 478 1 0
    //   258: pop
    //   259: getstatic 30	com/opera/mini/android/ae:ai	Ljava/lang/String;
    //   262: ifnull +53 -> 315
    //   265: aload 4
    //   267: ifnull +48 -> 315
    //   270: getstatic 398	com/opera/mini/android/Browser:I	Lcom/opera/mini/android/Browser;
    //   273: invokevirtual 482	com/opera/mini/android/Browser:getAssets	()Landroid/content/res/AssetManager;
    //   276: ldc_w 484
    //   279: invokevirtual 490	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   282: astore_3
    //   283: aload_3
    //   284: astore_1
    //   285: aload_3
    //   286: astore_2
    //   287: aload_3
    //   288: getstatic 30	com/opera/mini/android/ae:ai	Ljava/lang/String;
    //   291: aload 4
    //   293: invokestatic 495	com/opera/mini/android/ao:Code	(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Z
    //   296: ifne +11 -> 307
    //   299: aload_3
    //   300: astore_1
    //   301: aload_3
    //   302: astore_2
    //   303: aconst_null
    //   304: putstatic 30	com/opera/mini/android/ae:ai	Ljava/lang/String;
    //   307: aload_3
    //   308: ifnull +7 -> 315
    //   311: aload_3
    //   312: invokevirtual 500	java/io/InputStream:close	()V
    //   315: getstatic 30	com/opera/mini/android/ae:ai	Ljava/lang/String;
    //   318: ifnull +34 -> 352
    //   321: getstatic 30	com/opera/mini/android/ae:ai	Ljava/lang/String;
    //   324: areturn
    //   325: astore_2
    //   326: aload_1
    //   327: ifnull -12 -> 315
    //   330: aload_1
    //   331: invokevirtual 500	java/io/InputStream:close	()V
    //   334: goto -19 -> 315
    //   337: astore_1
    //   338: goto -23 -> 315
    //   341: astore_1
    //   342: aload_2
    //   343: ifnull +7 -> 350
    //   346: aload_2
    //   347: invokevirtual 500	java/io/InputStream:close	()V
    //   350: aload_1
    //   351: athrow
    //   352: ldc_w 409
    //   355: areturn
    //   356: astore_1
    //   357: goto -42 -> 315
    //   360: astore_2
    //   361: goto -11 -> 350
    // Local variable table:
    //   start	length	slot	name	signature
    //   149	8	0	i	int
    //   3	1	1	localObject1	Object
    //   24	1	1	localNameNotFoundException	PackageManager.NameNotFoundException
    //   284	47	1	localObject2	Object
    //   337	1	1	localIOException1	java.io.IOException
    //   341	10	1	localObject3	Object
    //   356	1	1	localIOException2	java.io.IOException
    //   1	302	2	localObject4	Object
    //   325	22	2	localIOException3	java.io.IOException
    //   360	1	2	localIOException4	java.io.IOException
    //   45	267	3	localObject5	Object
    //   104	188	4	str1	String
    //   121	99	5	str2	String
    //   138	84	6	str3	String
    // Exception table:
    //   from	to	target	type
    //   4	20	24	android/content/pm/PackageManager$NameNotFoundException
    //   270	283	325	java/io/IOException
    //   287	299	325	java/io/IOException
    //   303	307	325	java/io/IOException
    //   330	334	337	java/io/IOException
    //   270	283	341	finally
    //   287	299	341	finally
    //   303	307	341	finally
    //   311	315	356	java/io/IOException
    //   346	350	360	java/io/IOException
  }
  
  static String q()
  {
    if ("".equals(aj)) {
      return null;
    }
    return aj;
  }
  
  private static String r()
  {
    Object localObject = Browser.I.getPreferences(0);
    String str2 = ((SharedPreferences)localObject).getString("id_pref", "");
    String str3 = ((SharedPreferences)localObject).getString("loc_pref", "");
    String str1 = Locale.getDefault().toString();
    WebView localWebView;
    if ((!((SharedPreferences)localObject).contains("ua_pref")) || (str2.compareTo(Build.FINGERPRINT) != 0) || (str3.compareTo(str1) != 0))
    {
      localWebView = new WebView(Browser.I.getApplicationContext());
      str2 = Build.FINGERPRINT;
      str3 = localWebView.getSettings().getUserAgentString();
    }
    try
    {
      localWebView.destroy();
      label104:
      localObject = ((SharedPreferences)localObject).edit();
      ((Editor)localObject).putString("id_pref", str2);
      ((Editor)localObject).putString("loc_pref", str1);
      ((Editor)localObject).putString("ua_pref", str3);
      ((Editor)localObject).commit();
      return str3;
    }
    catch (Throwable localThrowable)
    {
      break label104;
    }
    return ((SharedPreferences)localObject).getString("ua_pref", "");
  }
  
  private static void s()
  {
    ag = 0.0F;
    ah = 0.0F;
    String str1 = Build.DEVICE;
    String str2 = Build.MODEL;
    if ((str1.equals("qsd8250_surf")) || (str2.equals("Dell Streak")))
    {
      ag = 190.0F;
      ah = 190.0F;
      return;
    }
    if (str2.equals("VTAB1008"))
    {
      ag = 160.0F;
      ah = 160.0F;
      return;
    }
    if (str2.equals("Dell Streak 7"))
    {
      ag = 150.0F;
      ah = 150.0F;
      return;
    }
    if (str2.equals("A1_07"))
    {
      ag = 127.5F;
      ah = 100.0F;
      return;
    }
    if ((str2.startsWith("GT-N710")) || (str2.equalsIgnoreCase("SCH-N719")) || (str2.startsWith("SHV-E250")))
    {
      ag = 267.0F;
      ah = 267.0F;
      return;
    }
    if ((ae >= 4) && ((p.Code() - aa.xdpi >= 79.0D) || (p.Code() - aa.ydpi >= 79.0D) || (Math.abs(aa.ydpi - aa.xdpi) > 40.0D)))
    {
      ag = p.Code();
      ah = p.Code();
      return;
    }
    ag = aa.xdpi;
    ah = aa.ydpi;
  }
  
  private static String t()
  {
    try
    {
      String str = Browser.I.getPackageManager().getPackageInfo(Browser.I.getPackageName(), 0).versionName;
      return str;
    }
    catch (NameNotFoundException localNameNotFoundException) {}
    return "";
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ae
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */