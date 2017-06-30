package com.example.lw.appline.com.google.a.a.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

class ab
  implements e
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] { "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id" });
  private final a b;
  private volatile i c;
  private final f d;
  private final Context e;
  private final String f;
  private long g;
  private h h;
  
  ab(f paramf, Context paramContext)
  {
    this(paramf, paramContext, "google_analytics_v2.db");
  }
  
  ab(f paramf, Context paramContext, String paramString)
  {
    this.e = paramContext.getApplicationContext();
    this.f = paramString;
    this.d = paramf;
    this.h = new h()
    {
      public long a()
      {
        return System.currentTimeMillis();
      }
    };
    this.b = new a(this.e, this.f);
    this.c = new ae(this, e(), this.e);
    this.g = 0L;
  }
  
  private SQLiteDatabase a(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      w.h(paramString);
    }
    return null;
  }
  
  public static String a(Map<String, String> paramMap)
  {
    ArrayList localArrayList = new ArrayList(paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Entry localEntry = (Entry)paramMap.next();
      localArrayList.add((String)localEntry.getKey() + "=" + u.a((String)localEntry.getValue()));
    }
    return TextUtils.join("&", localArrayList);
  }
  
  private void a(Map<String, String> paramMap, long paramLong, String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = a("Error opening database for putHit");
    if (localSQLiteDatabase == null) {
      return;
    }
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("hit_string", a(paramMap));
    localContentValues.put("hit_time", Long.valueOf(paramLong));
    if (paramMap.containsKey("AppUID")) {}
    for (;;)
    {
      try
      {
        paramLong = Long.parseLong((String)paramMap.get("AppUID"));
        localContentValues.put("hit_app_id", Long.valueOf(paramLong));
        paramMap = paramString;
        if (paramString == null) {
          paramMap = "http://www.google-analytics.com/collect";
        }
        if (paramMap.length() == 0)
        {
          w.h("empty path: not sending hit");
          return;
        }
      }
      catch (NumberFormatException paramMap)
      {
        paramLong = 0L;
        continue;
        localContentValues.put("hit_url", paramMap);
        try
        {
          localSQLiteDatabase.insert("hits2", null, localContentValues);
          this.d.a(false);
          return;
        }
        catch (SQLiteException paramMap)
        {
          w.h("Error storing hit");
          return;
        }
      }
      paramLong = 0L;
    }
  }
  
  private void a(Map<String, String> paramMap, String paramString1, String paramString2)
  {
    if (paramString2 == null) {}
    for (paramString2 = "";; paramString2 = paramString2 + "")
    {
      if (paramString1 != null) {
        paramMap.put(paramString1, paramString2);
      }
      return;
    }
  }
  
  private void a(Map<String, String> paramMap, Collection<Command> paramCollection)
  {
    Object localObject = paramCollection.iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramCollection = (Command)((Iterator)localObject).next();
      if (paramCollection.a().equals("appendVersion"))
      {
        localObject = paramCollection.c();
        a(paramMap, paramCollection.b(), (String)localObject);
      }
    }
  }
  
  private v e()
  {
    new v()
    {
      public HttpClient a()
      {
        return new DefaultHttpClient();
      }
    };
  }
  
  private void f()
  {
    int i = c() - 2000 + 1;
    if (i > 0)
    {
      List localList = a(i);
      w.i("Store full, deleting " + localList.size() + " hits to make room");
      a(localList);
    }
  }
  
  /* Error */
  public List<t> a(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 292
    //   4: invokespecial 189	com/google/a/a/a/ab:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore 6
    //   9: aload 6
    //   11: ifnonnull +15 -> 26
    //   14: new 111	java/util/ArrayList
    //   17: dup
    //   18: invokespecial 293	java/util/ArrayList:<init>	()V
    //   21: astore 5
    //   23: aload 5
    //   25: areturn
    //   26: aconst_null
    //   27: astore 5
    //   29: new 111	java/util/ArrayList
    //   32: dup
    //   33: invokespecial 293	java/util/ArrayList:<init>	()V
    //   36: pop
    //   37: ldc_w 295
    //   40: iconst_2
    //   41: anewarray 4	java/lang/Object
    //   44: dup
    //   45: iconst_0
    //   46: ldc 39
    //   48: aastore
    //   49: dup
    //   50: iconst_1
    //   51: ldc 35
    //   53: aastore
    //   54: invokestatic 49	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   57: astore 4
    //   59: iload_1
    //   60: invokestatic 300	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   63: astore 7
    //   65: aload 6
    //   67: ldc 33
    //   69: iconst_3
    //   70: anewarray 45	java/lang/String
    //   73: dup
    //   74: iconst_0
    //   75: ldc 35
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: ldc 37
    //   82: aastore
    //   83: dup
    //   84: iconst_2
    //   85: ldc 39
    //   87: aastore
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: aload 4
    //   94: aload 7
    //   96: invokevirtual 304	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   99: astore 4
    //   101: new 111	java/util/ArrayList
    //   104: dup
    //   105: invokespecial 293	java/util/ArrayList:<init>	()V
    //   108: astore 7
    //   110: aload 4
    //   112: invokeinterface 309 1 0
    //   117: ifeq +64 -> 181
    //   120: new 311	com/google/a/a/a/t
    //   123: dup
    //   124: aconst_null
    //   125: aload 4
    //   127: iconst_0
    //   128: invokeinterface 315 2 0
    //   133: aload 4
    //   135: iconst_1
    //   136: invokeinterface 315 2 0
    //   141: invokespecial 318	com/google/a/a/a/t:<init>	(Ljava/lang/String;JJ)V
    //   144: astore 5
    //   146: aload 5
    //   148: aload 4
    //   150: iconst_2
    //   151: invokeinterface 321 2 0
    //   156: invokevirtual 324	com/google/a/a/a/t:b	(Ljava/lang/String;)V
    //   159: aload 7
    //   161: aload 5
    //   163: invokeinterface 172 2 0
    //   168: pop
    //   169: aload 4
    //   171: invokeinterface 327 1 0
    //   176: istore_3
    //   177: iload_3
    //   178: ifne -58 -> 120
    //   181: aload 4
    //   183: ifnull +10 -> 193
    //   186: aload 4
    //   188: invokeinterface 330 1 0
    //   193: aload 4
    //   195: astore 5
    //   197: ldc_w 332
    //   200: iconst_1
    //   201: anewarray 4	java/lang/Object
    //   204: dup
    //   205: iconst_0
    //   206: ldc 35
    //   208: aastore
    //   209: invokestatic 49	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   212: astore 8
    //   214: aload 4
    //   216: astore 5
    //   218: iload_1
    //   219: invokestatic 300	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   222: astore 9
    //   224: aload 4
    //   226: astore 5
    //   228: aload 6
    //   230: ldc 33
    //   232: iconst_2
    //   233: anewarray 45	java/lang/String
    //   236: dup
    //   237: iconst_0
    //   238: ldc 35
    //   240: aastore
    //   241: dup
    //   242: iconst_1
    //   243: ldc 41
    //   245: aastore
    //   246: aconst_null
    //   247: aconst_null
    //   248: aconst_null
    //   249: aconst_null
    //   250: aload 8
    //   252: aload 9
    //   254: invokevirtual 304	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   257: astore 6
    //   259: aload 6
    //   261: invokeinterface 309 1 0
    //   266: ifeq +61 -> 327
    //   269: iconst_0
    //   270: istore_1
    //   271: aload 6
    //   273: instanceof 334
    //   276: ifeq +328 -> 604
    //   279: aload 6
    //   281: checkcast 334	android/database/sqlite/SQLiteCursor
    //   284: invokevirtual 338	android/database/sqlite/SQLiteCursor:getWindow	()Landroid/database/CursorWindow;
    //   287: invokevirtual 343	android/database/CursorWindow:getNumRows	()I
    //   290: ifle +130 -> 420
    //   293: aload 7
    //   295: iload_1
    //   296: invokeinterface 346 2 0
    //   301: checkcast 311	com/google/a/a/a/t
    //   304: aload 6
    //   306: iconst_1
    //   307: invokeinterface 321 2 0
    //   312: invokevirtual 348	com/google/a/a/a/t:a	(Ljava/lang/String;)V
    //   315: aload 6
    //   317: invokeinterface 327 1 0
    //   322: istore_3
    //   323: iload_3
    //   324: ifne +388 -> 712
    //   327: aload 6
    //   329: ifnull +10 -> 339
    //   332: aload 6
    //   334: invokeinterface 330 1 0
    //   339: aload 7
    //   341: areturn
    //   342: astore 5
    //   344: aconst_null
    //   345: astore 4
    //   347: new 144	java/lang/StringBuilder
    //   350: dup
    //   351: invokespecial 145	java/lang/StringBuilder:<init>	()V
    //   354: ldc_w 350
    //   357: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: aload 5
    //   362: invokevirtual 353	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   365: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   368: invokevirtual 166	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   371: invokestatic 107	com/google/a/a/a/w:h	(Ljava/lang/String;)I
    //   374: pop
    //   375: new 111	java/util/ArrayList
    //   378: dup
    //   379: invokespecial 293	java/util/ArrayList:<init>	()V
    //   382: astore 6
    //   384: aload 6
    //   386: astore 5
    //   388: aload 4
    //   390: ifnull -367 -> 23
    //   393: aload 4
    //   395: invokeinterface 330 1 0
    //   400: aload 6
    //   402: areturn
    //   403: astore 4
    //   405: aload 5
    //   407: ifnull +10 -> 417
    //   410: aload 5
    //   412: invokeinterface 330 1 0
    //   417: aload 4
    //   419: athrow
    //   420: new 144	java/lang/StringBuilder
    //   423: dup
    //   424: invokespecial 145	java/lang/StringBuilder:<init>	()V
    //   427: ldc_w 355
    //   430: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: aload 7
    //   435: iload_1
    //   436: invokeinterface 346 2 0
    //   441: checkcast 311	com/google/a/a/a/t
    //   444: invokevirtual 358	com/google/a/a/a/t:b	()J
    //   447: invokevirtual 361	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   450: ldc_w 363
    //   453: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   456: invokevirtual 166	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   459: invokestatic 107	com/google/a/a/a/w:h	(Ljava/lang/String;)I
    //   462: pop
    //   463: goto -148 -> 315
    //   466: astore 5
    //   468: aload 6
    //   470: astore 4
    //   472: aload 5
    //   474: astore 6
    //   476: aload 4
    //   478: astore 5
    //   480: new 144	java/lang/StringBuilder
    //   483: dup
    //   484: invokespecial 145	java/lang/StringBuilder:<init>	()V
    //   487: ldc_w 365
    //   490: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   493: aload 6
    //   495: invokevirtual 353	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   498: invokevirtual 152	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: invokevirtual 166	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   504: invokestatic 107	com/google/a/a/a/w:h	(Ljava/lang/String;)I
    //   507: pop
    //   508: aload 4
    //   510: astore 5
    //   512: new 111	java/util/ArrayList
    //   515: dup
    //   516: invokespecial 293	java/util/ArrayList:<init>	()V
    //   519: astore 6
    //   521: iconst_0
    //   522: istore_1
    //   523: aload 4
    //   525: astore 5
    //   527: aload 7
    //   529: invokeinterface 366 1 0
    //   534: astore 7
    //   536: aload 4
    //   538: astore 5
    //   540: aload 7
    //   542: invokeinterface 136 1 0
    //   547: ifeq +42 -> 589
    //   550: aload 4
    //   552: astore 5
    //   554: aload 7
    //   556: invokeinterface 140 1 0
    //   561: checkcast 311	com/google/a/a/a/t
    //   564: astore 8
    //   566: aload 4
    //   568: astore 5
    //   570: aload 8
    //   572: invokevirtual 367	com/google/a/a/a/t:a	()Ljava/lang/String;
    //   575: invokestatic 371	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   578: istore_3
    //   579: iload_1
    //   580: istore_2
    //   581: iload_3
    //   582: ifeq +70 -> 652
    //   585: iload_1
    //   586: ifeq +64 -> 650
    //   589: aload 4
    //   591: ifnull +10 -> 601
    //   594: aload 4
    //   596: invokeinterface 330 1 0
    //   601: aload 6
    //   603: areturn
    //   604: aload 7
    //   606: iload_1
    //   607: invokeinterface 346 2 0
    //   612: checkcast 311	com/google/a/a/a/t
    //   615: aload 6
    //   617: iconst_1
    //   618: invokeinterface 321 2 0
    //   623: invokevirtual 348	com/google/a/a/a/t:a	(Ljava/lang/String;)V
    //   626: goto -311 -> 315
    //   629: astore 4
    //   631: aload 6
    //   633: astore 5
    //   635: aload 5
    //   637: ifnull +10 -> 647
    //   640: aload 5
    //   642: invokeinterface 330 1 0
    //   647: aload 4
    //   649: athrow
    //   650: iconst_1
    //   651: istore_2
    //   652: aload 4
    //   654: astore 5
    //   656: aload 6
    //   658: aload 8
    //   660: invokeinterface 172 2 0
    //   665: pop
    //   666: iload_2
    //   667: istore_1
    //   668: goto -132 -> 536
    //   671: astore 4
    //   673: goto -38 -> 635
    //   676: astore 6
    //   678: goto -202 -> 476
    //   681: astore 6
    //   683: aload 4
    //   685: astore 5
    //   687: aload 6
    //   689: astore 4
    //   691: goto -286 -> 405
    //   694: astore 6
    //   696: aload 4
    //   698: astore 5
    //   700: aload 6
    //   702: astore 4
    //   704: goto -299 -> 405
    //   707: astore 5
    //   709: goto -362 -> 347
    //   712: iload_1
    //   713: iconst_1
    //   714: iadd
    //   715: istore_1
    //   716: goto -445 -> 271
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	719	0	this	ab
    //   0	719	1	paramInt	int
    //   580	87	2	i	int
    //   176	406	3	bool	boolean
    //   57	337	4	localObject1	Object
    //   403	15	4	localObject2	Object
    //   470	125	4	localObject3	Object
    //   629	24	4	localObject4	Object
    //   671	13	4	localObject5	Object
    //   689	14	4	localObject6	Object
    //   21	206	5	localObject7	Object
    //   342	19	5	localSQLiteException1	SQLiteException
    //   386	25	5	localObject8	Object
    //   466	7	5	localSQLiteException2	SQLiteException
    //   478	221	5	localObject9	Object
    //   707	1	5	localSQLiteException3	SQLiteException
    //   7	650	6	localObject10	Object
    //   676	1	6	localSQLiteException4	SQLiteException
    //   681	7	6	localObject11	Object
    //   694	7	6	localObject12	Object
    //   63	542	7	localObject13	Object
    //   212	447	8	localObject14	Object
    //   222	31	9	str	String
    // Exception table:
    //   from	to	target	type
    //   37	101	342	android/database/sqlite/SQLiteException
    //   37	101	403	finally
    //   259	269	466	android/database/sqlite/SQLiteException
    //   271	315	466	android/database/sqlite/SQLiteException
    //   315	323	466	android/database/sqlite/SQLiteException
    //   420	463	466	android/database/sqlite/SQLiteException
    //   604	626	466	android/database/sqlite/SQLiteException
    //   259	269	629	finally
    //   271	315	629	finally
    //   315	323	629	finally
    //   420	463	629	finally
    //   604	626	629	finally
    //   197	214	671	finally
    //   218	224	671	finally
    //   228	259	671	finally
    //   480	508	671	finally
    //   512	521	671	finally
    //   527	536	671	finally
    //   540	550	671	finally
    //   554	566	671	finally
    //   570	579	671	finally
    //   656	666	671	finally
    //   197	214	676	android/database/sqlite/SQLiteException
    //   218	224	676	android/database/sqlite/SQLiteException
    //   228	259	676	android/database/sqlite/SQLiteException
    //   101	120	681	finally
    //   120	177	681	finally
    //   347	384	694	finally
    //   101	120	707	android/database/sqlite/SQLiteException
    //   120	177	707	android/database/sqlite/SQLiteException
  }
  
  public void a()
  {
    w.g("dispatch running...");
    if (!this.c.a()) {}
    List localList;
    int i;
    do
    {
      return;
      localList = a(40);
      if (localList.isEmpty())
      {
        w.g("...nothing to dispatch");
        this.d.a(true);
        return;
      }
      i = this.c.a(localList);
      w.g("sent " + i + " of " + localList.size() + " hits");
      a(localList.subList(0, Math.min(i, localList.size())));
    } while ((i != localList.size()) || (c() <= 0));
    o.a().c();
  }
  
  public void a(long paramLong)
  {
    boolean bool = true;
    Object localObject = a("Error opening database for clearHits");
    if (localObject != null)
    {
      if (paramLong != 0L) {
        break label54;
      }
      ((SQLiteDatabase)localObject).delete("hits2", null, null);
      localObject = this.d;
      if (c() != 0) {
        break label82;
      }
    }
    for (;;)
    {
      ((f)localObject).a(bool);
      return;
      label54:
      ((SQLiteDatabase)localObject).delete("hits2", "hit_app_id = ?", new String[] { Long.valueOf(paramLong).toString() });
      break;
      label82:
      bool = false;
    }
  }
  
  public void a(Collection<t> paramCollection)
  {
    boolean bool = false;
    if (paramCollection == null) {
      throw new NullPointerException("hits cannot be null");
    }
    if (paramCollection.isEmpty()) {}
    Object localObject;
    do
    {
      return;
      localObject = a("Error opening database for deleteHit");
    } while (localObject == null);
    String[] arrayOfString = new String[paramCollection.size()];
    String str = String.format("HIT_ID in (%s)", new Object[] { TextUtils.join(",", Collections.nCopies(arrayOfString.length, "?")) });
    Iterator localIterator = paramCollection.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      arrayOfString[i] = Long.toString(((t)localIterator.next()).b());
      i += 1;
    }
    try
    {
      ((SQLiteDatabase)localObject).delete("hits2", str, arrayOfString);
      localObject = this.d;
      if (c() == 0) {
        bool = true;
      }
      ((f)localObject).a(bool);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      w.h("Error deleting hit " + paramCollection);
    }
  }
  
  public void a(Map<String, String> paramMap, long paramLong, String paramString, Collection<Command> paramCollection)
  {
    b();
    a(paramMap, paramCollection);
    f();
    a(paramMap, paramLong, paramString);
  }
  
  int b()
  {
    boolean bool = true;
    long l = this.h.a();
    if (l <= this.g + 86400000L) {}
    do
    {
      return 0;
      this.g = l;
      localObject = a("Error opening database for deleteStaleHits");
    } while (localObject == null);
    int i = ((SQLiteDatabase)localObject).delete("hits2", "HIT_TIME < ?", new String[] { Long.toString(this.h.a() - 2592000000L) });
    Object localObject = this.d;
    if (c() == 0) {}
    for (;;)
    {
      ((f)localObject).a(bool);
      return i;
      bool = false;
    }
  }
  
  int c()
  {
    Object localObject3 = null;
    Object localObject1 = null;
    int i = 0;
    int j = 0;
    Object localObject5 = a("Error opening database for requestNumHitsPending");
    if (localObject5 == null) {}
    for (;;)
    {
      return j;
      try
      {
        localObject5 = ((SQLiteDatabase)localObject5).rawQuery("SELECT COUNT(*) from hits2", null);
        localObject1 = localObject5;
        localObject3 = localObject5;
        if (((Cursor)localObject5).moveToFirst())
        {
          localObject1 = localObject5;
          localObject3 = localObject5;
          long l = ((Cursor)localObject5).getLong(0);
          i = (int)l;
        }
        j = i;
        if (localObject5 == null) {
          continue;
        }
        ((Cursor)localObject5).close();
        return i;
      }
      catch (SQLiteException localSQLiteException)
      {
        localObject4 = localObject1;
        w.h("Error getting numStoredHits");
        return 0;
      }
      finally
      {
        Object localObject4;
        if (localObject4 != null) {
          localObject4.close();
        }
      }
    }
  }
  
  class a
    extends SQLiteOpenHelper
  {
    private boolean b;
    private long c = 0L;
    
    a(Context paramContext, String paramString)
    {
      super(paramString, null, 1);
    }
    
    private void a(SQLiteDatabase paramSQLiteDatabase)
    {
      int j = 0;
      Cursor localCursor = paramSQLiteDatabase.rawQuery("SELECT * FROM hits2 WHERE 0", null);
      HashSet localHashSet = new HashSet();
      try
      {
        String[] arrayOfString = localCursor.getColumnNames();
        i = 0;
        while (i < arrayOfString.length)
        {
          localHashSet.add(arrayOfString[i]);
          i += 1;
        }
        localCursor.close();
        if ((!localHashSet.remove("hit_id")) || (!localHashSet.remove("hit_url")) || (!localHashSet.remove("hit_string")) || (!localHashSet.remove("hit_time"))) {
          throw new SQLiteException("Database column missing");
        }
      }
      finally
      {
        localCursor.close();
      }
      int i = j;
      if (!localHashSet.remove("hit_app_id")) {
        i = 1;
      }
      if (!localHashSet.isEmpty()) {
        throw new SQLiteException("Database has extra columns");
      }
      if (i != 0) {
        paramSQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id");
      }
    }
    
    /* Error */
    private boolean a(String paramString, SQLiteDatabase paramSQLiteDatabase)
    {
      // Byte code:
      //   0: aconst_null
      //   1: astore 4
      //   3: aload_2
      //   4: ldc 85
      //   6: iconst_1
      //   7: anewarray 87	java/lang/String
      //   10: dup
      //   11: iconst_0
      //   12: ldc 89
      //   14: aastore
      //   15: ldc 91
      //   17: iconst_1
      //   18: anewarray 87	java/lang/String
      //   21: dup
      //   22: iconst_0
      //   23: aload_1
      //   24: aastore
      //   25: aconst_null
      //   26: aconst_null
      //   27: aconst_null
      //   28: invokevirtual 95	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   31: astore_2
      //   32: aload_2
      //   33: invokeinterface 98 1 0
      //   38: istore_3
      //   39: aload_2
      //   40: ifnull +9 -> 49
      //   43: aload_2
      //   44: invokeinterface 51 1 0
      //   49: iload_3
      //   50: ireturn
      //   51: astore_2
      //   52: aconst_null
      //   53: astore_2
      //   54: new 100	java/lang/StringBuilder
      //   57: dup
      //   58: invokespecial 101	java/lang/StringBuilder:<init>	()V
      //   61: ldc 103
      //   63: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   66: aload_1
      //   67: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   70: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   73: invokestatic 117	com/google/a/a/a/w:h	(Ljava/lang/String;)I
      //   76: pop
      //   77: aload_2
      //   78: ifnull +9 -> 87
      //   81: aload_2
      //   82: invokeinterface 51 1 0
      //   87: iconst_0
      //   88: ireturn
      //   89: astore_1
      //   90: aload 4
      //   92: astore_2
      //   93: aload_2
      //   94: ifnull +9 -> 103
      //   97: aload_2
      //   98: invokeinterface 51 1 0
      //   103: aload_1
      //   104: athrow
      //   105: astore_1
      //   106: goto -13 -> 93
      //   109: astore_1
      //   110: goto -17 -> 93
      //   113: astore 4
      //   115: goto -61 -> 54
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	118	0	this	a
      //   0	118	1	paramString	String
      //   0	118	2	paramSQLiteDatabase	SQLiteDatabase
      //   38	12	3	bool	boolean
      //   1	90	4	localObject	Object
      //   113	1	4	localSQLiteException	SQLiteException
      // Exception table:
      //   from	to	target	type
      //   3	32	51	android/database/sqlite/SQLiteException
      //   3	32	89	finally
      //   32	39	105	finally
      //   54	77	109	finally
      //   32	39	113	android/database/sqlite/SQLiteException
    }
    
    public SQLiteDatabase getWritableDatabase()
    {
      if ((this.b) && (this.c + 3600000L > ab.a(ab.this).a())) {
        throw new SQLiteException("Database creation failed");
      }
      Object localObject1 = null;
      this.b = true;
      this.c = ab.a(ab.this).a();
      try
      {
        Object localObject2 = super.getWritableDatabase();
        localObject1 = localObject2;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = super.getWritableDatabase();
        }
        this.b = false;
        return localObject2;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          ab.c(ab.this).getDatabasePath(ab.b(ab.this)).delete();
        }
      }
    }
    
    public void onCreate(SQLiteDatabase paramSQLiteDatabase)
    {
      m.a(paramSQLiteDatabase.getPath());
    }
    
    public void onOpen(SQLiteDatabase paramSQLiteDatabase)
    {
      Cursor localCursor;
      if (Build.VERSION.SDK_INT < 15) {
        localCursor = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
      }
      try
      {
        localCursor.moveToFirst();
        localCursor.close();
        if (!a("hits2", paramSQLiteDatabase))
        {
          paramSQLiteDatabase.execSQL(ab.d());
          return;
        }
      }
      finally
      {
        localCursor.close();
      }
      a(paramSQLiteDatabase);
    }
    
    public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.ab
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */