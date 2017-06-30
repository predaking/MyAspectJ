package com.example.lw.appweb.com.opera.mini.android;

import ak;
import an;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.ResultReceiver;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import ap;
import au;
import ax;
import b;
import be;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import d;
import e;
import g;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class I
  implements e
{
  private static final ac C = new ac();
  protected static EditView Code;
  private static ResultReceiver a;
  private static ResultReceiver b;
  private static boolean c;
  private static int j = -1;
  private static String k = "";
  private View B;
  private Browser I;
  private boolean J;
  private MiniView Z;
  private int d = -1;
  private int e = -1;
  private Cursor f = null;
  private int g;
  private char h = '-';
  private AssetManager i = null;
  
  public I(Browser paramBrowser, AssetManager paramAssetManager)
  {
    this.I = paramBrowser;
    this.Z = ((MiniView)paramBrowser.findViewById(2131099648));
    this.B = paramBrowser.findViewById(2131099649);
    ad.Code(paramBrowser);
    this.i = paramAssetManager;
  }
  
  public static void B(boolean paramBoolean)
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)Browser.I.getSystemService("input_method");
    if (a == null) {
      a = new h(MiniView.Code.getHandler());
    }
    if ((paramBoolean) && (Code != null))
    {
      Code.requestFocus();
      MiniView.Code.Code(true);
      localInputMethodManager.showSoftInput(Code, 0, a);
    }
    while (Code == null) {
      return;
    }
    MiniView.Code.Code(false);
    MiniView.Code.Code(0);
    Browser.I.Code(true);
    g.I.B();
    g.I.Code(42);
    localInputMethodManager.hideSoftInputFromWindow(Code.getWindowToken(), 0);
  }
  
  private void Code(Intent paramIntent, PackageManager paramPackageManager)
  {
    if (ae.Code("com.android.browser", paramPackageManager)) {
      paramIntent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
    }
    do
    {
      return;
      if (ae.Code("com.android.chrome", paramPackageManager))
      {
        paramIntent.setClassName("com.android.chrome", "com.google.android.apps.chrome.Main");
        return;
      }
    } while (!ae.Code("com.google.android.browser", paramPackageManager));
    paramIntent.setClassName("com.google.android.browser", "com.android.browser.BrowserActivity");
  }
  
  public static boolean ah()
  {
    return c;
  }
  
  private void ai()
  {
    Bitmap localBitmap1 = Bitmap.createBitmap(10, 16, Config.ARGB_8888);
    Bitmap localBitmap2 = Bitmap.createBitmap(10, 16, Config.ARGB_8888);
    int m;
    n localn;
    TextPaint localTextPaint;
    Rect localRect;
    Canvas localCanvas;
    String[] arrayOfString;
    int n;
    if (("GT-S5660".equals(Build.PRODUCT)) || ("GT-S5830".equals(Build.PRODUCT)))
    {
      m = 1;
      localn = (n)ab.Code().Code(32);
      localTextPaint = localn.J();
      localRect = new Rect();
      localCanvas = new Canvas();
      arrayOfString = new String[3];
      arrayOfString[0] = "נסע";
      arrayOfString[1] = "بتث";
      arrayOfString[2] = "ﺑﻴﻦ";
      n = 0;
    }
    for (;;)
    {
      int i1;
      label118:
      int i6;
      int i2;
      label269:
      int i4;
      if (m != 0)
      {
        i1 = 1;
        if (n >= i1) {
          break label400;
        }
        localTextPaint.getTextBounds(arrayOfString[n], 0, arrayOfString[n].length(), localRect);
        localCanvas.setBitmap(localBitmap1);
        localCanvas.drawColor(0, PorterDuff.Mode.SRC);
        localCanvas.drawText(arrayOfString[n], -localRect.left, -localRect.top, localTextPaint);
        localCanvas.setBitmap(localBitmap2);
        localCanvas.drawColor(0, PorterDuff.Mode.SRC);
        localCanvas.drawText(arrayOfString[n], 0, 1, -localRect.left, -localRect.top, localTextPaint);
        int i5 = Math.max(Math.min(localn.Code(arrayOfString[n].charAt(0)) / 2, 10), 4);
        i6 = Math.min(localRect.height(), 16);
        i1 = 0;
        i2 = 1;
        if ((i2 != 0) && (i1 < i5)) {
          i4 = 0;
        }
      }
      else
      {
        for (;;)
        {
          int i3 = i2;
          if (i4 < i6)
          {
            if (localBitmap1.getPixel(i1, i4) != localBitmap2.getPixel(i1, i4)) {
              i3 = 0;
            }
          }
          else
          {
            i1 += 1;
            i2 = i3;
            break label269;
            m = 0;
            break;
            i1 = arrayOfString.length;
            break label118;
          }
          i4 += 1;
        }
      }
      if (i2 == 0)
      {
        b.r |= 1 << n + 1;
        if (m != 0)
        {
          i1 = b.r | 1 << n + 2;
          b.r = i1;
          b.r = i1 | 1 << n + 3;
        }
      }
      n += 1;
    }
    label400:
    localBitmap1.recycle();
    localBitmap2.recycle();
    b(b.r);
  }
  
  private void aj()
  {
    if (!Browser.I.I()) {
      throw new IOException("Network usage is not allowed when app is in background.");
    }
  }
  
  private String ak()
  {
    GoogleAnalyticsTracker localGoogleAnalyticsTracker = GoogleAnalyticsTracker.getInstance();
    if (localGoogleAnalyticsTracker == null) {
      return null;
    }
    try
    {
      localGoogleAnalyticsTracker.startNewSession("UA-26143332-2", this.I);
      Object localObject1 = GoogleAnalyticsTracker.class.getDeclaredMethod("getHitStore", null);
      if (localObject1 == null) {
        return null;
      }
      ((Method)localObject1).setAccessible(true);
      localObject1 = ((Method)localObject1).invoke(localGoogleAnalyticsTracker, null);
      if (localObject1 == null) {
        return null;
      }
      Method localMethod = localObject1.getClass().getDeclaredMethod("getReferrer", null);
      if (localMethod == null) {
        return null;
      }
      localMethod.setAccessible(true);
      localObject1 = localMethod.invoke(localObject1, null);
      if (localObject1 == null) {
        return null;
      }
      localMethod = localObject1.getClass().getDeclaredMethod("getReferrerString", null);
      if (localMethod == null) {
        return null;
      }
      localMethod.setAccessible(true);
      localObject1 = (String)localMethod.invoke(localObject1, null);
      return localObject1;
    }
    catch (Exception localException)
    {
      return null;
    }
    finally
    {
      localGoogleAnalyticsTracker.stopSession();
    }
  }
  
  /* Error */
  private void d(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_0
    //   3: istore_2
    //   4: aload_0
    //   5: getfield 70	com/opera/mini/android/I:I	Lcom/opera/mini/android/Browser;
    //   8: ldc_w 347
    //   11: invokevirtual 97	com/opera/mini/android/Browser:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   14: checkcast 349	android/net/ConnectivityManager
    //   17: invokevirtual 353	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   20: astore 5
    //   22: aload 5
    //   24: ifnull +100 -> 124
    //   27: aload 5
    //   29: invokevirtual 358	android/net/NetworkInfo:getType	()I
    //   32: istore 4
    //   34: aload 5
    //   36: invokevirtual 361	android/net/NetworkInfo:getExtraInfo	()Ljava/lang/String;
    //   39: astore 6
    //   41: aload 6
    //   43: astore 5
    //   45: aload 6
    //   47: ifnonnull +7 -> 54
    //   50: ldc 54
    //   52: astore 5
    //   54: aload_1
    //   55: ldc_w 363
    //   58: invokevirtual 367	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   61: iflt +64 -> 125
    //   64: iload 4
    //   66: ifne +14 -> 80
    //   69: aload 5
    //   71: ldc_w 369
    //   74: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   77: ifne +6 -> 83
    //   80: invokestatic 373	ap:C	()V
    //   83: getstatic 52	com/opera/mini/android/I:j	I
    //   86: iload 4
    //   88: if_icmpne +14 -> 102
    //   91: getstatic 56	com/opera/mini/android/I:k	Ljava/lang/String;
    //   94: aload 5
    //   96: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   99: ifne +5 -> 104
    //   102: iconst_1
    //   103: istore_2
    //   104: iload 4
    //   106: putstatic 52	com/opera/mini/android/I:j	I
    //   109: aload 5
    //   111: putstatic 56	com/opera/mini/android/I:k	Ljava/lang/String;
    //   114: iload_2
    //   115: ifeq +9 -> 124
    //   118: ldc_w 375
    //   121: invokestatic 377	b:C	(Ljava/lang/String;)V
    //   124: return
    //   125: iload 4
    //   127: ifne -44 -> 83
    //   130: aload 5
    //   132: ldc_w 369
    //   135: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   138: ifeq -55 -> 83
    //   141: invokestatic 373	ap:C	()V
    //   144: goto -61 -> 83
    //   147: astore_1
    //   148: getstatic 52	com/opera/mini/android/I:j	I
    //   151: iload 4
    //   153: if_icmpne +16 -> 169
    //   156: iload_3
    //   157: istore_2
    //   158: getstatic 56	com/opera/mini/android/I:k	Ljava/lang/String;
    //   161: aload 5
    //   163: invokevirtual 196	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   166: ifne +5 -> 171
    //   169: iconst_1
    //   170: istore_2
    //   171: iload 4
    //   173: putstatic 52	com/opera/mini/android/I:j	I
    //   176: aload 5
    //   178: putstatic 56	com/opera/mini/android/I:k	Ljava/lang/String;
    //   181: iload_2
    //   182: ifeq +9 -> 191
    //   185: ldc_w 375
    //   188: invokestatic 377	b:C	(Ljava/lang/String;)V
    //   191: aload_1
    //   192: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	this	I
    //   0	193	1	paramString	String
    //   3	179	2	m	int
    //   1	156	3	n	int
    //   32	140	4	i1	int
    //   20	157	5	localObject	Object
    //   39	7	6	str	String
    // Exception table:
    //   from	to	target	type
    //   54	64	147	finally
    //   69	80	147	finally
    //   80	83	147	finally
    //   130	144	147	finally
  }
  
  private boolean e(String paramString)
  {
    paramString = paramString.split("\\.");
    if (paramString.length != 4) {}
    for (;;)
    {
      return false;
      int m = 0;
      String str;
      if (m < paramString.length) {
        str = paramString[m];
      }
      try
      {
        int n = Integer.parseInt(str);
        if ((n >= 0) && (n <= 255)) {
          m += 1;
        }
      }
      catch (NumberFormatException paramString) {}
    }
    return true;
    return false;
  }
  
  public void A()
  {
    Uri localUri = android.provider.Browser.BOOKMARKS_URI;
    this.f = this.I.getContentResolver().query(localUri, new String[] { "title", "url", "favicon" }, "bookmark = 1", null, null);
    if (this.f != null) {
      this.f.moveToFirst();
    }
  }
  
  public int B()
  {
    return MiniView.B();
  }
  
  public InputStream B(String paramString1, String paramString2)
  {
    paramString1 = paramString1 + paramString2;
    if (paramString1.equals("debuginfo"))
    {
      paramString2 = new File("/sdcard/debuginfo");
      try
      {
        paramString2 = new FileInputStream(paramString2);
        return paramString2;
      }
      catch (FileNotFoundException paramString2)
      {
        paramString2.printStackTrace();
      }
    }
    try
    {
      paramString1 = this.I.getResources().getAssets().open(paramString1);
      return paramString1;
    }
    catch (IOException paramString1) {}
    return null;
  }
  
  public void B(int paramInt) {}
  
  public void B(String paramString)
  {
    ae.e(paramString);
  }
  
  public int C()
  {
    return ae.aa.widthPixels;
  }
  
  public int C(int paramInt)
  {
    ab.Code();
    return ab.J(paramInt);
  }
  
  public int C(String paramString)
  {
    return 0;
  }
  
  public ak Code(String paramString1, String paramString2, String paramString3)
  {
    int n = 80;
    aj();
    d(paramString1);
    java.net.Proxy localProxy = java.net.Proxy.NO_PROXY;
    String str;
    int m;
    if (!paramString1.startsWith("http://10.0.0.172"))
    {
      str = null;
      if ((ae.ae < 11) && (j == 0))
      {
        paramString2 = android.net.Proxy.getHost(Browser.I);
        m = android.net.Proxy.getPort(Browser.I);
        if (paramString2 == null) {
          break label242;
        }
        if (!e(paramString2)) {
          break label215;
        }
        n = m;
        if (m == -1) {
          n = 80;
        }
        paramString2 = InetSocketAddress.createUnresolved(paramString2, n);
        paramString2 = new java.net.Proxy(Proxy.Type.HTTP, paramString2);
        label105:
        return new ak(paramString1, paramString3, paramString2);
      }
    }
    for (paramString2 = str;; paramString2 = null)
    {
      try
      {
        Object localObject = (java.net.Proxy)ProxySelector.getDefault().select(new URI(paramString1)).get(0);
        if (localObject == null) {
          break label248;
        }
        paramString2 = str;
        localObject = ((java.net.Proxy)localObject).address();
        if (localObject == null) {
          break label248;
        }
        paramString2 = str;
        if (!(localObject instanceof InetSocketAddress)) {
          break label248;
        }
        paramString2 = str;
        str = ((InetSocketAddress)localObject).getHostName();
        paramString2 = str;
        m = ((InetSocketAddress)localObject).getPort();
        paramString2 = str;
      }
      catch (URISyntaxException localURISyntaxException)
      {
        m = -1;
      }
      break;
      label215:
      if (m == -1) {
        m = n;
      }
      for (;;)
      {
        paramString2 = new InetSocketAddress(paramString2, m);
        break;
      }
      label242:
      paramString2 = localProxy;
      break label105;
      label248:
      m = -1;
    }
  }
  
  public ap Code(int paramInt, byte paramByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new ap(paramInt, paramByte, paramBoolean1, paramBoolean2);
  }
  
  public h Code(String paramString1, String paramString2)
  {
    aj();
    d(paramString1);
    return new h(paramString1);
  }
  
  public Object Code(int paramInt1, int paramInt2, String paramString1, String paramString2, final int paramInt3, final String paramString3, String paramString4, final int paramInt4, final int paramInt5, final int paramInt6, final int paramInt7, final int paramInt8, final int paramInt9, final int paramInt10, final int paramInt11, final ax paramax, final int paramInt12, final int paramInt13, int paramInt14)
  {
    if ((paramInt3 & 0x6) != 0)
    {
      paramInt1 = 1;
      if (paramInt1 == 0) {
        break label83;
      }
    }
    label83:
    for (paramInt1 = 2131099650;; paramInt1 = 2131099651)
    {
      paramString1 = (EditView)this.I.findViewById(paramInt1);
      Code = paramString1;
      this.B.post(new Runnable()
      {
        public final void run()
        {
          I.this.Code(paramInt4 + paramInt8, paramInt5 + paramInt9, paramInt6 - paramInt8, paramInt7 - paramInt9);
          I.this.setTextSize(0, ((n)paramax).I());
          EditView localEditView = I.this;
          int m = paramInt3;
          int i;
          int j;
          switch (m & 0xFFF)
          {
          default: 
            i = 0;
            j = 1;
            if ((m & 0x2000) != 0) {
              localEditView.setEnabled(false);
            }
            if ((0x10000 & m) == 0) {
              break;
            }
          }
          for (int k = 8192;; k = 0)
          {
            if ((m & 0x1000) != 0) {
              i = 128;
            }
            if ((0x20000 & m) != 0) {
              k = 16384;
            }
            if ((m & 0x40000) != 0)
            {
              localEditView.setVerticalScrollBarEnabled(true);
              k = 131072;
              label185:
              localEditView.setInputType(k | (j | i));
              I.this.Code(false);
              I.this.setText(paramString3.replace("\r\n", "\n"));
              if (paramInt10 >= 0) {
                break label378;
              }
              I.this.setSelection(I.this.getText().length());
              label247:
              I.this.Code(paramInt13);
              switch (paramInt13)
              {
              default: 
                label296:
                localEditView = I.this;
                if (paramInt12 != 1) {
                  break;
                }
              }
            }
            for (boolean bool = true;; bool = false)
            {
              localEditView.Code(bool);
              I.this.setVisibility(0);
              I.B(true);
              return;
              i = 0;
              j = 2;
              break;
              i = 32;
              j = 1;
              break;
              i = 0;
              j = 3;
              break;
              i = 16;
              j = 1;
              break;
              localEditView.setIncludeFontPadding(false);
              localEditView.setVerticalScrollBarEnabled(false);
              break label185;
              label378:
              I.this.setSelection(paramInt10, paramInt10 + paramInt11);
              break label247;
              if ("Kindle Fire".equals(Build.MODEL))
              {
                I.this.setImeOptions(2);
                break label296;
              }
              I.this.setImeOptions(6);
              break label296;
              I.this.setImeOptions(2);
              break label296;
              I.this.setImeOptions(5);
              break label296;
              I.this.setImeOptions(3);
              break label296;
            }
          }
        }
      });
      return paramString1;
      paramInt1 = 0;
      break;
    }
  }
  
  public String Code(String paramString)
  {
    if ("OM-Install-Referrer".equals(paramString)) {
      return ak();
    }
    return null;
  }
  
  public void Code()
  {
    ae.k();
    b.a("mc");
    b.a("md");
    b.b();
    j.Code(this.i);
    ai();
  }
  
  public void Code(int paramInt1, int paramInt2)
  {
    ae.Code(paramInt1, paramInt2);
  }
  
  public void Code(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int m = Math.max(paramInt1, 0);
    int n = Math.max(paramInt2, 0);
    paramInt1 = Math.min(paramInt1 + paramInt3, MiniView.J());
    paramInt2 = Math.min(paramInt2 + paramInt4, MiniView.B());
    this.Z.I.Code(m, n, paramInt1 - m, paramInt2 - n);
  }
  
  public void Code(DataInputStream paramDataInputStream, int paramInt)
  {
    if (paramInt >= 4)
    {
      j = paramDataInputStream.readInt();
      k = paramDataInputStream.readUTF();
    }
  }
  
  public void Code(DataOutputStream paramDataOutputStream)
  {
    paramDataOutputStream.writeInt(j);
    if (k == null) {}
    for (String str = "";; str = k)
    {
      paramDataOutputStream.writeUTF(str);
      return;
    }
  }
  
  public void Code(Object paramObject)
  {
    this.B.post(new Runnable()
    {
      public final void run()
      {
        if ((I.this instanceof EditView))
        {
          EditView localEditView = (EditView)I.this;
          localEditView.setVisibility(8);
          localEditView.Code(false);
          localEditView.setText("");
        }
      }
    });
  }
  
  public void Code(Object paramObject, final int paramInt1, final int paramInt2, final int paramInt3, final int paramInt4, final int paramInt5, final int paramInt6)
  {
    if (paramInt2 < 0) {
      return;
    }
    this.B.post(new Runnable()
    {
      public final void run()
      {
        if ((I.this instanceof EditView)) {
          ((EditView)I.this).Code(paramInt1 + paramInt5, paramInt2 + paramInt6, paramInt3 - paramInt5, paramInt4 - paramInt6);
        }
      }
    });
  }
  
  public void Code(Object paramObject, String paramString)
  {
    if ((paramObject instanceof EditView))
    {
      paramObject = (EditView)paramObject;
      paramObject.post(new C(paramObject, paramString));
    }
  }
  
  public void Code(Object paramObject, String paramString, int paramInt, boolean paramBoolean)
  {
    if ((paramObject instanceof URLEditView)) {
      ((URLEditView)paramObject).Code(paramString, paramInt, paramBoolean);
    }
  }
  
  public void Code(boolean paramBoolean)
  {
    this.J = paramBoolean;
  }
  
  public boolean Code(int paramInt)
  {
    return true;
  }
  
  public boolean D()
  {
    if ((this.f != null) && (this.f.isAfterLast()))
    {
      this.f.close();
      this.f = null;
    }
    if (this.f == null) {}
    do
    {
      return false;
      int m = this.f.getColumnIndex("title");
      int n = this.f.getColumnIndex("url");
      int i1 = this.f.getColumnIndex("favicon");
      d.I = null;
      while ((d.I == null) && (!this.f.isAfterLast()))
      {
        String str = this.f.getString(n);
        d.I = str;
        if (str != null)
        {
          d.Code = this.f.getString(m);
          d.Z = this.f.getBlob(i1);
        }
        this.f.moveToNext();
      }
    } while (d.I == null);
    return true;
  }
  
  public boolean E()
  {
    return this.I.J();
  }
  
  public boolean F()
  {
    return false;
  }
  
  public int G()
  {
    return 7;
  }
  
  public int H()
  {
    return 1;
  }
  
  public int I(String paramString1, String paramString2)
  {
    try
    {
      Object localObject = ah.a(paramString1);
      paramString1 = new Intent("android.intent.action.VIEW");
      localObject = Uri.fromFile(new File((String)localObject));
      if (paramString2 != null) {
        paramString1.setDataAndType((Uri)localObject, paramString2.toLowerCase());
      }
      for (;;)
      {
        this.I.startActivity(paramString1);
        return 0;
        paramString1.setData((Uri)localObject);
      }
      return 1;
    }
    catch (ActivityNotFoundException paramString1)
    {
      paramString1.printStackTrace();
    }
  }
  
  public String I(Object paramObject)
  {
    if ((paramObject instanceof EditText)) {
      return ((EditText)paramObject).getText().toString();
    }
    return null;
  }
  
  public void I(int paramInt) {}
  
  public void I(int paramInt1, int paramInt2) {}
  
  public void I(boolean paramBoolean)
  {
    c = paramBoolean;
    this.Z.getHandler().post(new Runnable()
    {
      public final void run()
      {
        Browser.I.Code(this.Code);
      }
    });
  }
  
  public boolean I()
  {
    return false;
  }
  
  public boolean I(String paramString)
  {
    paramString = b.c(paramString);
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    PackageManager localPackageManager;
    List localList;
    int m;
    if ((paramString.startsWith("http:")) || (paramString.startsWith("https:")))
    {
      localPackageManager = this.I.getPackageManager();
      localList = localPackageManager.queryIntentActivities(localIntent, 65536);
      m = 0;
    }
    for (;;)
    {
      if (m < localList.size())
      {
        if (!((ResolveInfo)localList.get(m)).activityInfo.packageName.equals(this.I.getPackageName())) {
          break label119;
        }
        Code(localIntent, localPackageManager);
      }
      try
      {
        Browser.I.startActivity(localIntent);
        return false;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        label119:
        throw new IOException("Scheme is not supported: " + paramString);
      }
      m += 1;
    }
  }
  
  public int J()
  {
    return MiniView.J();
  }
  
  public void J(String paramString1, String paramString2)
  {
    if (paramString2 == null) {
      return;
    }
    Intent localIntent2 = new Intent("android.intent.action.MAIN");
    localIntent2.setClass(Browser.I, Browser.class);
    localIntent2.setData(Uri.parse(paramString2));
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("android.intent.extra.shortcut.INTENT", localIntent2);
    if (paramString1 != null)
    {
      localIntent1.putExtra("android.intent.extra.shortcut.NAME", paramString1);
      paramString1 = null;
      if (ae.ae >= 11) {
        paramString1 = BitmapFactory.decodeResource(Browser.I.getResources(), 2130837506);
      }
      if (paramString1 == null) {
        break label126;
      }
      localIntent1.putExtra("android.intent.extra.shortcut.ICON", paramString1);
    }
    for (;;)
    {
      localIntent1.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
      Browser.I.sendBroadcast(localIntent1);
      return;
      paramString1 = paramString2;
      break;
      label126:
      localIntent1.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", ShortcutIconResource.fromContext(Browser.I, 2130837505));
    }
  }
  
  public void J(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      PackageManager localPackageManager = this.I.getPackageManager();
      String[] arrayOfString = new String[2];
      arrayOfString[0] = "http:";
      arrayOfString[1] = "https:";
      int n = 0;
      if (n < arrayOfString.length)
      {
        Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(arrayOfString[n]));
        localIntent.addCategory("android.intent.category.BROWSABLE");
        localIntent.addCategory("android.intent.category.DEFAULT");
        Object localObject1 = localPackageManager.queryIntentActivities(localIntent, 0);
        ComponentName[] arrayOfComponentName = new ComponentName[((List)localObject1).size()];
        localObject1 = ((List)localObject1).iterator();
        int i1 = -1;
        int m = 0;
        Object localObject2;
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (ResolveInfo)((Iterator)localObject1).next();
          if (this.I.getPackageName().equals(((ResolveInfo)localObject2).activityInfo.packageName)) {
            i1 = m;
          }
          arrayOfComponentName[m] = new ComponentName(((ResolveInfo)localObject2).activityInfo.packageName, ((ResolveInfo)localObject2).activityInfo.name);
          m += 1;
        }
        if (i1 >= 0)
        {
          localObject1 = new IntentFilter(localIntent.getAction());
          localObject2 = localIntent.getCategories().iterator();
          while (((Iterator)localObject2).hasNext()) {
            ((IntentFilter)localObject1).addCategory((String)((Iterator)localObject2).next());
          }
          ((IntentFilter)localObject1).addDataScheme(localIntent.getScheme());
          ((IntentFilter)localObject1).setPriority(1000);
          localPackageManager.addPreferredActivity((IntentFilter)localObject1, 2097152, arrayOfComponentName, arrayOfComponentName[i1]);
        }
        for (;;)
        {
          n += 1;
          break;
          System.out.println("Couldn't register opera mini as default browser since the activity couldn't be found");
        }
      }
    }
    else
    {
      this.I.getPackageManager().clearPackagePreferredActivities(this.I.getPackageName());
    }
  }
  
  public boolean J(int paramInt)
  {
    return false;
  }
  
  public boolean J(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File("/dummy_file.txt")), paramString.toLowerCase());
    return localIntent.resolveActivity(this.I.getPackageManager()) != null;
  }
  
  public boolean K()
  {
    return this.I.getPackageManager().checkPermission("android.permission.SET_PREFERRED_APPLICATIONS", this.I.getPackageName()) == 0;
  }
  
  public boolean L()
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "http:";
    arrayOfString[1] = "https:";
    int i1;
    for (int m = 1;; m = 0)
    {
      int n = 0;
      int i2;
      for (i1 = 0; n < arrayOfString.length; i1 = i2)
      {
        Object localObject = new Intent("android.intent.action.VIEW", Uri.parse(arrayOfString[n]));
        ((Intent)localObject).addCategory("android.intent.category.BROWSABLE");
        ((Intent)localObject).addCategory("android.intent.category.DEFAULT");
        localObject = this.I.getPackageManager().resolveActivity((Intent)localObject, 0);
        i2 = i1;
        if (this.I.getPackageName().equals(((ResolveInfo)localObject).activityInfo.packageName)) {
          i2 = i1 + 1;
        }
        n += 1;
      }
      if ((i1 <= 0) || (i1 >= arrayOfString.length) || (m == 0)) {
        break;
      }
      J(true);
    }
    return i1 >= arrayOfString.length;
  }
  
  public boolean M()
  {
    return N() == 460;
  }
  
  public int N()
  {
    if (this.d == -1)
    {
      Object localObject = (TelephonyManager)this.I.getSystemService("phone");
      if (((TelephonyManager)localObject).getSimState() == 5)
      {
        localObject = ((TelephonyManager)localObject).getSimOperator();
        if ((localObject != null) && (localObject != null) && (((String)localObject).length() >= 3)) {
          this.d = Integer.parseInt(((String)localObject).substring(0, 3));
        }
      }
    }
    return this.d;
  }
  
  public int O()
  {
    if (this.e == -1)
    {
      Object localObject = (TelephonyManager)this.I.getSystemService("phone");
      if (((TelephonyManager)localObject).getSimState() == 5)
      {
        localObject = ((TelephonyManager)localObject).getSimOperator();
        if ((localObject != null) && (localObject != null) && (((String)localObject).length() >= 3)) {
          this.e = Integer.parseInt(((String)localObject).substring(3));
        }
      }
    }
    return this.e;
  }
  
  public int P()
  {
    return 1;
  }
  
  public int Q()
  {
    return 1;
  }
  
  public void R()
  {
    try
    {
      this.g += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void S()
  {
    try
    {
      int m = this.g - 1;
      this.g = m;
      if (m == 0) {
        Browser.I.Code();
      }
      return;
    }
    finally {}
  }
  
  public boolean T()
  {
    return true;
  }
  
  public String U()
  {
    String str1 = "http://mini.bugs.opera.com?pl=Android&version=7.5";
    if (!"33361".startsWith("$")) {
      str1 = "http://mini.bugs.opera.com?pl=Android&version=7.5" + "&build=33361";
    }
    if (Build.MODEL != null) {}
    for (String str2 = Build.MODEL;; str2 = "unknown") {
      return str1 + "&mo=" + str2;
    }
  }
  
  public String V()
  {
    return ae.p();
  }
  
  public void W()
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.opera.mini.android"));
      Browser.I.startActivity(localIntent);
      return;
    }
    catch (Exception localException) {}
  }
  
  public boolean X()
  {
    return (i.Z() == 0L) && ("m".equals("m"));
  }
  
  public boolean Y()
  {
    return false;
  }
  
  public InputStream Z(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = null;
    }
    String str;
    do
    {
      return localObject;
      str = paramString;
      if (paramString.length() > 1)
      {
        str = paramString;
        if (paramString.charAt(0) == '/') {
          str = paramString.substring(1);
        }
      }
      if ((!str.equals("v")) && (!str.equals("resources"))) {
        break;
      }
      localObject = B(str, "-" + ae.ab + "-" + ae.ac);
      paramString = (String)localObject;
      if (localObject == null) {
        paramString = B(str, "-" + ae.ab);
      }
      localObject = paramString;
    } while (paramString != null);
    return B(str, "");
  }
  
  public Vector Z(int paramInt)
  {
    return null;
  }
  
  public void Z(Object paramObject) {}
  
  public void Z(String paramString1, String paramString2)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.setType("text/plain");
      localIntent.putExtra("android.intent.extra.TEXT", paramString1);
      localIntent.putExtra("android.intent.extra.SUBJECT", paramString2);
      Browser.I.startActivity(Intent.createChooser(localIntent, null));
      return;
    }
    catch (ActivityNotFoundException paramString1) {}
  }
  
  public void Z(boolean paramBoolean) {}
  
  public boolean Z()
  {
    return false;
  }
  
  public int a()
  {
    return ae.aa.heightPixels;
  }
  
  public int a(String paramString)
  {
    return 0;
  }
  
  public boolean a(int paramInt)
  {
    return ab.Z(paramInt);
  }
  
  public void aa() {}
  
  public String ab()
  {
    return ae.q();
  }
  
  public boolean ac()
  {
    return this.I.B();
  }
  
  public DataOutputStream ad()
  {
    return null;
  }
  
  public DataInputStream ae()
  {
    return null;
  }
  
  public boolean af()
  {
    return true;
  }
  
  public boolean ag()
  {
    return false;
  }
  
  public int b()
  {
    return (int)ae.l();
  }
  
  public native void b(int paramInt);
  
  public void b(String paramString) {}
  
  public int c()
  {
    return (int)ae.m();
  }
  
  public String c(int paramInt)
  {
    return null;
  }
  
  public void c(String paramString) {}
  
  public boolean d()
  {
    boolean bool2 = false;
    float f1 = C() / ae.l();
    float f2 = a() / ae.m();
    double d1 = Math.sqrt(f1 * f1 + f2 * f2);
    boolean bool1;
    if (ae.ae >= 4) {
      bool1 = bool2;
    }
    switch (p.I())
    {
    default: 
      bool1 = bool2;
      if (d1 >= 5.7D)
      {
        bool1 = bool2;
        if (Math.min(a(), C()) >= 480) {
          bool1 = true;
        }
      }
    case 1: 
    case 2: 
    case 3: 
      do
      {
        return bool1;
        bool1 = bool2;
      } while (d1 < 5.7D);
      return true;
    }
    return true;
  }
  
  public void e()
  {
    this.Z.Z();
  }
  
  public boolean f()
  {
    return true;
  }
  
  public boolean g()
  {
    return false;
  }
  
  public int h()
  {
    if (Build.DEVICE.indexOf("SonyEricssonU20i") >= 0) {}
    DisplayMetrics localDisplayMetrics;
    do
    {
      return -1;
      if (Build.DEVICE.indexOf("SonyEricsson") < 0) {
        break;
      }
      localDisplayMetrics = new DisplayMetrics();
      Browser.I.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    } while (((localDisplayMetrics.heightPixels > 320) || (localDisplayMetrics.widthPixels > 240)) && ((localDisplayMetrics.widthPixels <= 240) && (localDisplayMetrics.heightPixels <= 320) && (!Browser.I.B())));
    return 0;
  }
  
  public void i()
  {
    this.B.post(new Runnable()
    {
      public final void run()
      {
        I.B(false);
      }
    });
  }
  
  public int j()
  {
    return this.Z.C();
  }
  
  public boolean k()
  {
    return Browser.I.C();
  }
  
  public ad l()
  {
    return new ad(new ah());
  }
  
  public boolean m()
  {
    return true;
  }
  
  public void n() {}
  
  public void o()
  {
    if (!Browser.I.Z()) {
      this.I.finish();
    }
    j.Code();
  }
  
  public boolean p()
  {
    return this.J;
  }
  
  public an q()
  {
    return C;
  }
  
  public an r()
  {
    return C;
  }
  
  public au s()
  {
    return ab.Code();
  }
  
  public boolean t()
  {
    return false;
  }
  
  public int u()
  {
    return 4;
  }
  
  public int v()
  {
    int m = 12;
    if (this.I.getResources().getConfiguration().hardKeyboardHidden == 1) {
      m = 13;
    }
    return m;
  }
  
  public be w()
  {
    return new be((ClipboardManager)this.I.getSystemService("clipboard"));
  }
  
  public p x()
  {
    return new u();
  }
  
  public void y() {}
  
  public void z()
  {
    this.I.moveTaskToBack(true);
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.I
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */