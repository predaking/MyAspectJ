package com.example.lw.appkeys.com.ads;

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
    //   11: invokestatic 33	com/ads/Validation:a	()Landroid/content/Context;
    //   14: invokestatic 39	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   17: invokestatic 42	com/ads/Validation:a	(Landroid/content/SharedPreferences;)V
    //   20: invokestatic 46	com/ads/Validation:b	()Landroid/content/SharedPreferences;
    //   23: invokeinterface 52 1 0
    //   28: invokestatic 55	com/ads/Validation:a	(Landroid/content/SharedPreferences$Editor;)V
    //   31: ldc 57
    //   33: lconst_1
    //   34: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   37: lstore_2
    //   38: invokestatic 46	com/ads/Validation:b	()Landroid/content/SharedPreferences;
    //   41: ldc 59
    //   43: iconst_0
    //   44: invokeinterface 63 3 0
    //   49: invokestatic 66	com/ads/Validation:a	(I)V
    //   52: invokestatic 70	com/ads/Validation:c	()Z
    //   55: ifeq +224 -> 279
    //   58: invokestatic 74	com/ads/Validation:d	()I
    //   61: i2l
    //   62: lload_2
    //   63: lcmp
    //   64: ifge +215 -> 279
    //   67: invokestatic 77	com/ads/Validation:e	()I
    //   70: istore_1
    //   71: iload_1
    //   72: iconst_1
    //   73: if_icmpne +206 -> 279
    //   76: new 79	java/net/URL
    //   79: dup
    //   80: new 81	java/lang/StringBuilder
    //   83: dup
    //   84: ldc 83
    //   86: invokespecial 86	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   89: invokestatic 90	com/ads/Validation:f	()Ljava/lang/String;
    //   92: invokestatic 93	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   95: ldc 95
    //   97: invokestatic 101	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: ldc 107
    //   105: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: invokestatic 110	com/ads/Validation:g	()Ljava/lang/String;
    //   111: invokestatic 93	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   114: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   120: invokespecial 114	java/net/URL:<init>	(Ljava/lang/String;)V
    //   123: invokevirtual 118	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   126: checkcast 120	java/net/HttpURLConnection
    //   129: astore 6
    //   131: aload 6
    //   133: ldc 122
    //   135: invokevirtual 125	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   138: aload 6
    //   140: sipush 1000
    //   143: invokevirtual 128	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   146: aload 6
    //   148: sipush 2000
    //   151: invokevirtual 131	java/net/HttpURLConnection:setReadTimeout	(I)V
    //   154: new 133	java/io/BufferedReader
    //   157: dup
    //   158: new 135	java/io/InputStreamReader
    //   161: dup
    //   162: aload 6
    //   164: invokevirtual 139	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   167: invokespecial 142	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   170: invokespecial 145	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   173: astore 6
    //   175: new 81	java/lang/StringBuilder
    //   178: dup
    //   179: invokespecial 146	java/lang/StringBuilder:<init>	()V
    //   182: astore 7
    //   184: aload 6
    //   186: invokevirtual 149	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   189: astore 8
    //   191: aload 8
    //   193: ifnonnull +223 -> 416
    //   196: aload 7
    //   198: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: ldc 151
    //   203: invokevirtual 157	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   206: astore 6
    //   208: aload 6
    //   210: iconst_0
    //   211: aaload
    //   212: invokestatic 163	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   215: invokestatic 165	com/ads/Validation:b	(I)V
    //   218: aload 6
    //   220: iconst_1
    //   221: aaload
    //   222: invokestatic 167	com/ads/Validation:g	(Ljava/lang/String;)V
    //   225: aload 6
    //   227: iconst_2
    //   228: aaload
    //   229: invokestatic 170	com/ads/Validation:h	(Ljava/lang/String;)V
    //   232: aload 6
    //   234: iconst_3
    //   235: aaload
    //   236: invokestatic 173	com/ads/Validation:i	(Ljava/lang/String;)V
    //   239: invokestatic 175	com/ads/Validation:h	()Landroid/content/SharedPreferences$Editor;
    //   242: ldc 177
    //   244: aload 6
    //   246: iconst_4
    //   247: aaload
    //   248: invokestatic 93	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   251: invokeinterface 183 3 0
    //   256: pop
    //   257: invokestatic 175	com/ads/Validation:h	()Landroid/content/SharedPreferences$Editor;
    //   260: ldc 185
    //   262: aload 6
    //   264: iconst_5
    //   265: aaload
    //   266: invokestatic 93	com/ads/Validation:e	(Ljava/lang/String;)Ljava/lang/String;
    //   269: invokeinterface 183 3 0
    //   274: pop
    //   275: iconst_0
    //   276: invokestatic 188	com/ads/Validation:a	(Z)V
    //   279: ldc 190
    //   281: lconst_0
    //   282: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   285: lconst_1
    //   286: lcmp
    //   287: ifne +60 -> 347
    //   290: ldc 192
    //   292: lconst_0
    //   293: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   296: lconst_0
    //   297: lcmp
    //   298: ifle +49 -> 347
    //   301: invokestatic 46	com/ads/Validation:b	()Landroid/content/SharedPreferences;
    //   304: ldc 194
    //   306: lconst_0
    //   307: invokeinterface 197 4 0
    //   312: lconst_0
    //   313: lcmp
    //   314: ifne +33 -> 347
    //   317: invokestatic 175	com/ads/Validation:h	()Landroid/content/SharedPreferences$Editor;
    //   320: ldc 194
    //   322: new 199	java/util/Date
    //   325: dup
    //   326: invokespecial 200	java/util/Date:<init>	()V
    //   329: invokevirtual 204	java/util/Date:getTime	()J
    //   332: invokeinterface 208 4 0
    //   337: pop
    //   338: invokestatic 175	com/ads/Validation:h	()Landroid/content/SharedPreferences$Editor;
    //   341: invokeinterface 211 1 0
    //   346: pop
    //   347: new 199	java/util/Date
    //   350: dup
    //   351: invokespecial 200	java/util/Date:<init>	()V
    //   354: invokevirtual 204	java/util/Date:getTime	()J
    //   357: invokestatic 46	com/ads/Validation:b	()Landroid/content/SharedPreferences;
    //   360: ldc 194
    //   362: lconst_0
    //   363: invokeinterface 197 4 0
    //   368: lsub
    //   369: ldc2_w 212
    //   372: ldiv
    //   373: lstore 4
    //   375: invokestatic 74	com/ads/Validation:d	()I
    //   378: i2l
    //   379: lload_2
    //   380: lcmp
    //   381: ifge +34 -> 415
    //   384: lload 4
    //   386: ldc 192
    //   388: lconst_0
    //   389: invokestatic 24	com/ads/Validation:a	(Ljava/lang/String;J)J
    //   392: lconst_1
    //   393: lsub
    //   394: lcmp
    //   395: ifle +20 -> 415
    //   398: invokestatic 33	com/ads/Validation:a	()Landroid/content/Context;
    //   401: checkcast 215	android/app/Activity
    //   404: new 217	com/ads/Validation$1$1
    //   407: dup
    //   408: aload_0
    //   409: invokespecial 220	com/ads/Validation$1$1:<init>	(Lcom/ads/Validation$1;)V
    //   412: invokevirtual 224	android/app/Activity:runOnUiThread	(Ljava/lang/Runnable;)V
    //   415: return
    //   416: aload 7
    //   418: aload 8
    //   420: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   423: pop
    //   424: goto -240 -> 184
    //   427: astore 6
    //   429: goto -150 -> 279
    //   432: astore 6
    //   434: aload 6
    //   436: invokevirtual 227	java/lang/Exception:printStackTrace	()V
    //   439: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	440	0	this	1
    //   70	4	1	i	int
    //   37	343	2	l1	long
    //   373	12	4	l2	long
    //   129	134	6	localObject	Object
    //   427	1	6	localException1	java.lang.Exception
    //   432	3	6	localException2	java.lang.Exception
    //   182	235	7	localStringBuilder	java.lang.StringBuilder
    //   189	230	8	str	java.lang.String
    // Exception table:
    //   from	to	target	type
    //   76	184	427	java/lang/Exception
    //   184	191	427	java/lang/Exception
    //   196	279	427	java/lang/Exception
    //   416	424	427	java/lang/Exception
    //   0	71	432	java/lang/Exception
    //   279	347	432	java/lang/Exception
    //   347	415	432	java/lang/Exception
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.ads.Validation.1
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */