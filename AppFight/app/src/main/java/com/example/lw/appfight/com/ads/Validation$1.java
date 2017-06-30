package com.example.lw.appfight.com.ads;

class Validation$1
  implements Runnable
{
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: ldc 16
    //   2: ldc2_w 17
    //   5: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   8: invokestatic 30	java/lang/Thread:sleep	(J)V
    //   11: invokestatic 33	com/ads/Validation:a	()I
    //   14: istore_1
    //   15: iload_1
    //   16: iconst_1
    //   17: if_icmpne +181 -> 198
    //   20: new 35	java/net/URL
    //   23: dup
    //   24: new 37	java/lang/StringBuilder
    //   27: dup
    //   28: ldc 39
    //   30: invokespecial 42	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   33: invokestatic 46	com/ads/Validation:b	()Ljava/lang/String;
    //   36: invokestatic 50	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   39: ldc 52
    //   41: invokestatic 58	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   44: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc 64
    //   49: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokestatic 67	com/ads/Validation:c	()Ljava/lang/String;
    //   55: invokestatic 50	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   58: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   61: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   64: invokespecial 71	java/net/URL:<init>	(Ljava/lang/String;)V
    //   67: astore 6
    //   69: getstatic 77	java/lang/System:out	Ljava/io/PrintStream;
    //   72: aload 6
    //   74: invokevirtual 78	java/net/URL:toString	()Ljava/lang/String;
    //   77: invokevirtual 83	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   80: aload 6
    //   82: invokevirtual 87	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   85: checkcast 89	java/net/HttpURLConnection
    //   88: astore 6
    //   90: aload 6
    //   92: ldc 91
    //   94: invokevirtual 94	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   97: aload 6
    //   99: sipush 1000
    //   102: invokevirtual 98	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   105: aload 6
    //   107: sipush 2000
    //   110: invokevirtual 101	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   113: new 103	java/io/BufferedReader
    //   116: dup
    //   117: new 105	java/io/InputStreamReader
    //   120: dup
    //   121: aload 6
    //   123: invokevirtual 109	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   126: invokespecial 112	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   129: invokespecial 115	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   132: astore 6
    //   134: new 37	java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   141: astore 7
    //   143: aload 6
    //   145: invokevirtual 119	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   148: astore 8
    //   150: aload 8
    //   152: ifnonnull +224 -> 376
    //   155: aload 7
    //   157: invokevirtual 70	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   160: ldc 121
    //   162: invokevirtual 127	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   165: astore 6
    //   167: aload 6
    //   169: iconst_0
    //   170: aaload
    //   171: invokestatic 133	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   174: invokestatic 135	com/ads/Validation:a	(I)V
    //   177: aload 6
    //   179: iconst_1
    //   180: aaload
    //   181: invokestatic 138	com/ads/Validation:g	(Ljava/lang/String;)V
    //   184: aload 6
    //   186: iconst_2
    //   187: aaload
    //   188: invokestatic 141	com/ads/Validation:h	(Ljava/lang/String;)V
    //   191: aload 6
    //   193: iconst_3
    //   194: aaload
    //   195: invokestatic 144	com/ads/Validation:i	(Ljava/lang/String;)V
    //   198: invokestatic 148	com/ads/Validation:d	()Landroid/content/Context;
    //   201: invokestatic 154	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   204: invokestatic 157	com/ads/Validation:a	(Landroid/content/SharedPreferences;)V
    //   207: invokestatic 160	com/ads/Validation:e	()Landroid/content/SharedPreferences;
    //   210: invokeinterface 166 1 0
    //   215: invokestatic 169	com/ads/Validation:a	(Landroid/content/SharedPreferences$Editor;)V
    //   218: ldc 171
    //   220: lconst_1
    //   221: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   224: lstore_2
    //   225: invokestatic 160	com/ads/Validation:e	()Landroid/content/SharedPreferences;
    //   228: ldc 173
    //   230: iconst_0
    //   231: invokeinterface 177 3 0
    //   236: invokestatic 179	com/ads/Validation:b	(I)V
    //   239: ldc 181
    //   241: lconst_0
    //   242: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   245: lconst_1
    //   246: lcmp
    //   247: ifne +60 -> 307
    //   250: ldc 181
    //   252: lconst_0
    //   253: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   256: lconst_0
    //   257: lcmp
    //   258: ifle +49 -> 307
    //   261: invokestatic 160	com/ads/Validation:e	()Landroid/content/SharedPreferences;
    //   264: ldc 183
    //   266: lconst_0
    //   267: invokeinterface 186 4 0
    //   272: lconst_0
    //   273: lcmp
    //   274: ifne +33 -> 307
    //   277: invokestatic 189	com/ads/Validation:f	()Landroid/content/SharedPreferences$Editor;
    //   280: ldc 183
    //   282: new 191	java/util/Date
    //   285: dup
    //   286: invokespecial 192	java/util/Date:<init>	()V
    //   289: invokevirtual 196	java/util/Date:getTime	()J
    //   292: invokeinterface 202 4 0
    //   297: pop
    //   298: invokestatic 189	com/ads/Validation:f	()Landroid/content/SharedPreferences$Editor;
    //   301: invokeinterface 206 1 0
    //   306: pop
    //   307: new 191	java/util/Date
    //   310: dup
    //   311: invokespecial 192	java/util/Date:<init>	()V
    //   314: invokevirtual 196	java/util/Date:getTime	()J
    //   317: invokestatic 160	com/ads/Validation:e	()Landroid/content/SharedPreferences;
    //   320: ldc 183
    //   322: lconst_0
    //   323: invokeinterface 186 4 0
    //   328: lsub
    //   329: ldc2_w 207
    //   332: ldiv
    //   333: lstore 4
    //   335: invokestatic 210	com/ads/Validation:g	()I
    //   338: i2l
    //   339: lload_2
    //   340: lcmp
    //   341: ifge +34 -> 375
    //   344: lload 4
    //   346: ldc 181
    //   348: lconst_0
    //   349: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   352: lconst_1
    //   353: lsub
    //   354: lcmp
    //   355: ifle +20 -> 375
    //   358: invokestatic 148	com/ads/Validation:d	()Landroid/content/Context;
    //   361: checkcast 212	android/app/Activity
    //   364: new 214	com/ads/Validation$1$1
    //   367: dup
    //   368: aload_0
    //   369: invokespecial 217	com/ads/Validation$1$1:<init>	(Lcom/ads/Validation$1;)V
    //   372: invokevirtual 221	android/app/Activity:runOnUiThread	(Ljava/lang/Runnable;)V
    //   375: return
    //   376: aload 7
    //   378: aload 8
    //   380: invokevirtual 62	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: pop
    //   384: goto -241 -> 143
    //   387: astore 6
    //   389: goto -191 -> 198
    //   392: astore 6
    //   394: aload 6
    //   396: invokevirtual 224	java/lang/Exception:printStackTrace	()V
    //   399: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	400	0	this	1
    //   14	4	1	i	int
    //   224	116	2	l1	long
    //   333	12	4	l2	long
    //   67	125	6	localObject	Object
    //   387	1	6	localException1	java.lang.Exception
    //   392	3	6	localException2	java.lang.Exception
    //   141	236	7	localStringBuilder	java.lang.StringBuilder
    //   148	231	8	str	java.lang.String
    // Exception table:
    //   from	to	target	type
    //   20	143	387	java/lang/Exception
    //   143	150	387	java/lang/Exception
    //   155	198	387	java/lang/Exception
    //   376	384	387	java/lang/Exception
    //   0	15	392	java/lang/Exception
    //   198	307	392	java/lang/Exception
    //   307	375	392	java/lang/Exception
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.ads.Validation.1
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */