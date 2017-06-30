package com.example.lw.appline.com.google.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;

class q
  extends Thread
  implements g
{
  private static q i;
  private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue();
  private volatile boolean b = false;
  private volatile boolean c = false;
  private volatile boolean d;
  private volatile List<Command> e;
  private volatile x f;
  private volatile String g;
  private volatile String h;
  private volatile ad j;
  private final Context k;
  
  private q(Context paramContext)
  {
    super("GAThread");
    if (paramContext != null) {}
    for (this.k = paramContext.getApplicationContext();; this.k = paramContext)
    {
      start();
      return;
    }
  }
  
  static q a(Context paramContext)
  {
    if (i == null) {
      i = new q(paramContext);
    }
    return i;
  }
  
  private String a(Throwable paramThrowable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    paramThrowable.printStackTrace(localPrintStream);
    localPrintStream.flush();
    return new String(localByteArrayOutputStream.toByteArray());
  }
  
  private void a(Runnable paramRunnable)
  {
    this.a.add(paramRunnable);
  }
  
  private void a(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (!paramMap.containsKey(paramString1)) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  private boolean a(String paramString)
  {
    try
    {
      FileOutputStream localFileOutputStream = this.k.openFileOutput("gaClientId", 0);
      localFileOutputStream.write(paramString.getBytes());
      localFileOutputStream.close();
      return true;
    }
    catch (FileNotFoundException paramString)
    {
      w.c("Error creating clientId file.");
      return false;
    }
    catch (IOException paramString)
    {
      w.c("Error writing to clientId file.");
    }
    return false;
  }
  
  static String b(Context paramContext)
  {
    try
    {
      localObject = paramContext.openFileInput("gaInstallData");
      arrayOfByte = new byte[8192];
      m = ((FileInputStream)localObject).read(arrayOfByte, 0, 8192);
      if (((FileInputStream)localObject).available() > 0)
      {
        w.c("Too much campaign data, ignoring it.");
        ((FileInputStream)localObject).close();
        paramContext.deleteFile("gaInstallData");
        return null;
      }
      ((FileInputStream)localObject).close();
      paramContext.deleteFile("gaInstallData");
      if (m <= 0)
      {
        w.h("Campaign file is empty.");
        return null;
      }
    }
    catch (FileNotFoundException paramContext)
    {
      byte[] arrayOfByte;
      int m;
      w.d("No campaign data found.");
      return null;
      Object localObject = new String(arrayOfByte, 0, m);
      w.d("Campaign found: " + (String)localObject);
      return localObject;
    }
    catch (IOException localIOException)
    {
      w.c("Error reading campaign data.");
      paramContext.deleteFile("gaInstallData");
    }
    return null;
  }
  
  private String b(Map<String, String> paramMap)
  {
    String str2 = (String)paramMap.get("internalHitUrl");
    String str1 = str2;
    if (str2 == null)
    {
      if (!paramMap.containsKey("useSecure")) {
        break label54;
      }
      if (ai.c((String)paramMap.get("useSecure"))) {
        str1 = "https://ssl.google-analytics.com/collect";
      }
    }
    else
    {
      return str1;
    }
    return "http://www.google-analytics.com/collect";
    label54:
    return "https://ssl.google-analytics.com/collect";
  }
  
  private void c(Map<String, String> paramMap)
  {
    Object localObject1 = (String)paramMap.get("rawException");
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      paramMap.remove("rawException");
      localObject1 = new ByteArrayInputStream(ai.e((String)localObject1));
      try
      {
        localObject1 = new ObjectInputStream((InputStream)localObject1);
        Object localObject2 = ((ObjectInputStream)localObject1).readObject();
        ((ObjectInputStream)localObject1).close();
        if ((localObject2 instanceof Throwable))
        {
          localObject1 = (Throwable)localObject2;
          localObject2 = new ArrayList();
          paramMap.put("exDescription", new af(this.k, (Collection)localObject2).a((String)paramMap.get("exceptionThreadName"), (Throwable)localObject1));
          return;
        }
      }
      catch (IOException paramMap)
      {
        w.h("IOException reading exception");
        return;
      }
      catch (ClassNotFoundException paramMap)
      {
        w.h("ClassNotFoundException reading exception");
      }
    }
  }
  
  private boolean d(Map<String, String> paramMap)
  {
    if (paramMap.get("sampleRate") != null)
    {
      double d1 = ai.b((String)paramMap.get("sampleRate"));
      if (d1 <= 0.0D) {
        return true;
      }
      if (d1 < 100.0D)
      {
        paramMap = (String)paramMap.get("clientId");
        if ((paramMap != null) && (Math.abs(paramMap.hashCode()) % 10000 >= d1 * 100.0D)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private void e()
  {
    this.j.e();
    this.e = new ArrayList();
    this.e.add(new Command("appendVersion", "_v", "ma1b4"));
    this.e.add(new Command("appendQueueTime", "qt", null));
    this.e.add(new Command("appendCacheBuster", "z", null));
    this.f = new x();
    y.a(this.f);
  }
  
  /* Error */
  private void e(Map<String, String> paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 61	com/google/a/a/a/q:k	Landroid/content/Context;
    //   4: invokevirtual 348	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 61	com/google/a/a/a/q:k	Landroid/content/Context;
    //   12: invokevirtual 351	android/content/Context:getPackageName	()Ljava/lang/String;
    //   15: astore_3
    //   16: aload_2
    //   17: aload_3
    //   18: invokevirtual 357	android/content/pm/PackageManager:getInstallerPackageName	(Ljava/lang/String;)Ljava/lang/String;
    //   21: astore 6
    //   23: aconst_null
    //   24: astore 4
    //   26: aload_2
    //   27: aload_0
    //   28: getfield 61	com/google/a/a/a/q:k	Landroid/content/Context;
    //   31: invokevirtual 351	android/content/Context:getPackageName	()Ljava/lang/String;
    //   34: iconst_0
    //   35: invokevirtual 361	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   38: astore 5
    //   40: aload 5
    //   42: ifnull +114 -> 156
    //   45: aload_2
    //   46: aload 5
    //   48: getfield 367	android/content/pm/PackageInfo:applicationInfo	Landroid/content/pm/ApplicationInfo;
    //   51: invokevirtual 371	android/content/pm/PackageManager:getApplicationLabel	(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   54: invokevirtual 374	java/lang/Object:toString	()Ljava/lang/String;
    //   57: astore_2
    //   58: aload 5
    //   60: getfield 377	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   63: astore 5
    //   65: aload 5
    //   67: astore 4
    //   69: aload_0
    //   70: aload_1
    //   71: ldc_w 379
    //   74: aload_2
    //   75: invokespecial 381	com/google/a/a/a/q:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    //   78: aload_0
    //   79: aload_1
    //   80: ldc_w 383
    //   83: aload 4
    //   85: invokespecial 381	com/google/a/a/a/q:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    //   88: aload_0
    //   89: aload_1
    //   90: ldc_w 385
    //   93: aload_3
    //   94: invokespecial 381	com/google/a/a/a/q:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    //   97: aload_0
    //   98: aload_1
    //   99: ldc_w 387
    //   102: aload 6
    //   104: invokespecial 381	com/google/a/a/a/q:a	(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V
    //   107: aload_1
    //   108: ldc_w 389
    //   111: ldc_w 391
    //   114: invokeinterface 118 3 0
    //   119: pop
    //   120: return
    //   121: astore_2
    //   122: aload_3
    //   123: astore_2
    //   124: new 191	java/lang/StringBuilder
    //   127: dup
    //   128: invokespecial 192	java/lang/StringBuilder:<init>	()V
    //   131: ldc_w 393
    //   134: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: aload_2
    //   138: invokevirtual 198	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 202	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: invokestatic 153	com/google/a/a/a/w:c	(Ljava/lang/String;)I
    //   147: pop
    //   148: goto -79 -> 69
    //   151: astore 5
    //   153: goto -29 -> 124
    //   156: aload_3
    //   157: astore_2
    //   158: goto -89 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	this	q
    //   0	161	1	paramMap	Map<String, String>
    //   7	68	2	localObject1	Object
    //   121	1	2	localNameNotFoundException1	android.content.pm.PackageManager.NameNotFoundException
    //   123	35	2	localObject2	Object
    //   15	142	3	str1	String
    //   24	60	4	localObject3	Object
    //   38	28	5	localObject4	Object
    //   151	1	5	localNameNotFoundException2	android.content.pm.PackageManager.NameNotFoundException
    //   21	82	6	str2	String
    // Exception table:
    //   from	to	target	type
    //   26	40	121	android/content/pm/PackageManager$NameNotFoundException
    //   45	58	121	android/content/pm/PackageManager$NameNotFoundException
    //   58	65	151	android/content/pm/PackageManager$NameNotFoundException
  }
  
  private void f(Map<String, String> paramMap)
  {
    Object localObject = ai.d((String)paramMap.get("campaign"));
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return;
    }
    localObject = ai.a((String)localObject);
    paramMap.put("campaignContent", ((Map)localObject).get("utm_content"));
    paramMap.put("campaignMedium", ((Map)localObject).get("utm_medium"));
    paramMap.put("campaignName", ((Map)localObject).get("utm_campaign"));
    paramMap.put("campaignSource", ((Map)localObject).get("utm_source"));
    paramMap.put("campaignKeyword", ((Map)localObject).get("utm_term"));
    paramMap.put("campaignId", ((Map)localObject).get("utm_id"));
    paramMap.put("gclid", ((Map)localObject).get("gclid"));
    paramMap.put("dclid", ((Map)localObject).get("dclid"));
    paramMap.put("gmob_t", ((Map)localObject).get("gmob_t"));
  }
  
  private boolean f()
  {
    return this.k.getFileStreamPath("gaOptOut").exists();
  }
  
  private String g()
  {
    String str2 = UUID.randomUUID().toString().toLowerCase();
    String str1 = str2;
    if (!a(str2)) {
      str1 = "0";
    }
    return str1;
  }
  
  public void a()
  {
    a(new Runnable()
    {
      public void run()
      {
        q.f(q.this).c();
      }
    });
  }
  
  public void a(final g.a parama)
  {
    a(new Runnable()
    {
      public void run()
      {
        parama.a(q.a(q.this));
      }
    });
  }
  
  public void a(final s.a parama)
  {
    a(new Runnable()
    {
      public void run()
      {
        parama.a(q.b(q.this));
      }
    });
  }
  
  public void a(final Map<String, String> paramMap)
  {
    paramMap = new HashMap(paramMap);
    final long l = System.currentTimeMillis();
    paramMap.put("hitTime", Long.toString(l));
    a(new Runnable()
    {
      public void run()
      {
        paramMap.put("clientId", q.a(q.this));
        if ((q.b(q.this)) || (q.a(q.this, paramMap))) {
          return;
        }
        if (!TextUtils.isEmpty(q.c(q.this)))
        {
          paramMap.put("campaign", q.c(q.this));
          q.a(q.this, null);
        }
        q.b(q.this, paramMap);
        q.c(q.this, paramMap);
        q.d(q.this, paramMap);
        Map localMap = u.a(q.d(q.this), paramMap);
        q.f(q.this).a(localMap, l, q.e(q.this, paramMap), q.e(q.this));
      }
    });
  }
  
  public LinkedBlockingQueue<Runnable> b()
  {
    return this.a;
  }
  
  public Thread c()
  {
    return this;
  }
  
  /* Error */
  String d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aconst_null
    //   7: astore_3
    //   8: aload_0
    //   9: getfield 61	com/google/a/a/a/q:k	Landroid/content/Context;
    //   12: ldc 131
    //   14: invokevirtual 162	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   17: astore 6
    //   19: sipush 128
    //   22: newarray byte
    //   24: astore_2
    //   25: aload 6
    //   27: aload_2
    //   28: iconst_0
    //   29: sipush 128
    //   32: invokevirtual 168	java/io/FileInputStream:read	([BII)I
    //   35: istore_1
    //   36: aload 6
    //   38: invokevirtual 172	java/io/FileInputStream:available	()I
    //   41: ifle +25 -> 66
    //   44: ldc_w 503
    //   47: invokestatic 153	com/google/a/a/a/w:c	(Ljava/lang/String;)I
    //   50: pop
    //   51: aload 6
    //   53: invokevirtual 175	java/io/FileInputStream:close	()V
    //   56: aload_0
    //   57: getfield 61	com/google/a/a/a/q:k	Landroid/content/Context;
    //   60: ldc 158
    //   62: invokevirtual 178	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   65: pop
    //   66: iload_1
    //   67: ifgt +40 -> 107
    //   70: ldc_w 505
    //   73: invokestatic 153	com/google/a/a/a/w:c	(Ljava/lang/String;)I
    //   76: pop
    //   77: aload 6
    //   79: invokevirtual 175	java/io/FileInputStream:close	()V
    //   82: aload_0
    //   83: getfield 61	com/google/a/a/a/q:k	Landroid/content/Context;
    //   86: ldc 158
    //   88: invokevirtual 178	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   91: pop
    //   92: aload_3
    //   93: astore_2
    //   94: aload_2
    //   95: astore_3
    //   96: aload_2
    //   97: ifnonnull +8 -> 105
    //   100: aload_0
    //   101: invokespecial 507	com/google/a/a/a/q:g	()Ljava/lang/String;
    //   104: astore_3
    //   105: aload_3
    //   106: areturn
    //   107: new 96	java/lang/String
    //   110: dup
    //   111: aload_2
    //   112: iconst_0
    //   113: iload_1
    //   114: invokespecial 189	java/lang/String:<init>	([BII)V
    //   117: astore_2
    //   118: aload 6
    //   120: invokevirtual 175	java/io/FileInputStream:close	()V
    //   123: goto -29 -> 94
    //   126: astore_2
    //   127: aload 4
    //   129: astore_2
    //   130: ldc_w 509
    //   133: invokestatic 153	com/google/a/a/a/w:c	(Ljava/lang/String;)I
    //   136: pop
    //   137: aload_0
    //   138: getfield 61	com/google/a/a/a/q:k	Landroid/content/Context;
    //   141: ldc 158
    //   143: invokevirtual 178	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   146: pop
    //   147: goto -53 -> 94
    //   150: astore_2
    //   151: aload 5
    //   153: astore_2
    //   154: ldc_w 511
    //   157: invokestatic 153	com/google/a/a/a/w:c	(Ljava/lang/String;)I
    //   160: pop
    //   161: aload_0
    //   162: getfield 61	com/google/a/a/a/q:k	Landroid/content/Context;
    //   165: ldc 158
    //   167: invokevirtual 178	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   170: pop
    //   171: goto -77 -> 94
    //   174: astore_3
    //   175: goto -21 -> 154
    //   178: astore_3
    //   179: goto -49 -> 130
    //   182: astore_2
    //   183: aload_3
    //   184: astore_2
    //   185: goto -91 -> 94
    //   188: astore_3
    //   189: goto -95 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	this	q
    //   35	79	1	m	int
    //   24	94	2	localObject1	Object
    //   126	1	2	localIOException1	IOException
    //   129	1	2	localObject2	Object
    //   150	1	2	localNumberFormatException1	java.lang.NumberFormatException
    //   153	1	2	localObject3	Object
    //   182	1	2	localFileNotFoundException1	FileNotFoundException
    //   184	1	2	localIOException2	IOException
    //   7	99	3	localObject4	Object
    //   174	1	3	localNumberFormatException2	java.lang.NumberFormatException
    //   178	6	3	localIOException3	IOException
    //   188	1	3	localFileNotFoundException2	FileNotFoundException
    //   1	127	4	localObject5	Object
    //   4	148	5	localObject6	Object
    //   17	102	6	localFileInputStream	FileInputStream
    // Exception table:
    //   from	to	target	type
    //   8	66	126	java/io/IOException
    //   70	92	126	java/io/IOException
    //   107	118	126	java/io/IOException
    //   8	66	150	java/lang/NumberFormatException
    //   70	92	150	java/lang/NumberFormatException
    //   107	118	150	java/lang/NumberFormatException
    //   118	123	174	java/lang/NumberFormatException
    //   118	123	178	java/io/IOException
    //   8	66	182	java/io/FileNotFoundException
    //   70	92	182	java/io/FileNotFoundException
    //   107	118	182	java/io/FileNotFoundException
    //   118	123	188	java/io/FileNotFoundException
  }
  
  public void run()
  {
    try
    {
      Thread.sleep(5000L);
      if (this.j == null) {
        this.j = new p(this.k, this);
      }
      e();
      Runnable localRunnable;
      return;
    }
    catch (InterruptedException localInterruptedException2)
    {
      try
      {
        this.d = f();
        this.h = d();
        this.g = b(this.k);
        while (!this.c) {
          try
          {
            localRunnable = (Runnable)this.a.take();
            if (!this.b) {
              localRunnable.run();
            }
          }
          catch (InterruptedException localInterruptedException1)
          {
            w.d(localInterruptedException1.toString());
          }
          catch (Throwable localThrowable1)
          {
            w.c("Error on GAThread: " + a(localThrowable1));
            w.c("Google Analytics is shutting down.");
            this.b = true;
          }
        }
        localInterruptedException2 = localInterruptedException2;
        w.h("sleep interrupted in GAThread initialize");
      }
      catch (Throwable localThrowable2)
      {
        for (;;)
        {
          w.c("Error initializing the GAThread: " + a(localThrowable2));
          w.c("Google Analytics will not start up.");
          this.b = true;
        }
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.q
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */