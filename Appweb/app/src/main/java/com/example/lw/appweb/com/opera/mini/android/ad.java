package com.example.lw.appweb.com.opera.mini.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteStatement;
import bd;
import g;
import j;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public final class ad
  extends j
{
  private static final String b = g.a(13);
  private SQLiteStatement B;
  private Context C;
  private SQLiteDatabase I;
  private SQLiteStatement J;
  private SQLiteStatement Z;
  private boolean a = false;
  
  private ad(Context paramContext)
  {
    this.C = paramContext;
  }
  
  private int B(String paramString1, String paramString2)
  {
    Object localObject = null;
    for (;;)
    {
      int i;
      try
      {
        Cursor localCursor = this.I.rawQuery("SELECT record_id, record FROM rms WHERE store = ? AND record NOT NULL", new String[] { paramString1 });
        localObject = localCursor;
        int j = localCursor.getCount();
        i = 0;
        if (i < j)
        {
          localObject = localCursor;
          localCursor.moveToNext();
          localObject = localCursor;
          int k = localCursor.getInt(0);
          localObject = localCursor;
          byte[] arrayOfByte = localCursor.getBlob(1);
          localObject = localCursor;
          if (!g.I(arrayOfByte))
          {
            localObject = localCursor;
            Z(paramString1, k);
          }
          else
          {
            localObject = localCursor;
            boolean bool = g.Code(arrayOfByte, g.Code(arrayOfByte)).equals(paramString2);
            if (bool) {
              return k;
            }
          }
        }
        else
        {
          return -1;
        }
      }
      finally
      {
        if (localObject != null) {
          localObject.close();
        }
      }
      i += 1;
    }
  }
  
  public static ad Code(Context paramContext)
  {
    paramContext = new ad(paramContext);
    paramContext.I();
    paramContext.Z = paramContext.I.compileStatement("SELECT MAX(record_id) FROM rms WHERE store=?");
    paramContext.J = paramContext.I.compileStatement("SELECT MIN(record_id) FROM rms WHERE store=? AND record NOT NULL");
    paramContext.B = paramContext.I.compileStatement("SELECT COUNT(record_id) FROM rms WHERE store=?");
    Code = paramContext;
    return paramContext;
  }
  
  /* Error */
  private void I()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 33	com/opera/mini/android/ad:C	Landroid/content/Context;
    //   8: ldc 109
    //   10: invokevirtual 115	android/content/Context:getDatabasePath	(Ljava/lang/String;)Ljava/io/File;
    //   13: astore_3
    //   14: aload_3
    //   15: invokevirtual 121	java/io/File:getParentFile	()Ljava/io/File;
    //   18: invokevirtual 124	java/io/File:mkdir	()Z
    //   21: pop
    //   22: aload_0
    //   23: aload_3
    //   24: invokevirtual 128	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   27: aconst_null
    //   28: ldc 129
    //   30: invokestatic 133	android/database/sqlite/SQLiteDatabase:openDatabase	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)Landroid/database/sqlite/SQLiteDatabase;
    //   33: putfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   36: aload_0
    //   37: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   40: iconst_1
    //   41: invokevirtual 137	android/database/sqlite/SQLiteDatabase:setLockingEnabled	(Z)V
    //   44: aload_0
    //   45: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   48: ldc 139
    //   50: invokevirtual 143	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   53: aload_0
    //   54: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   57: invokevirtual 146	android/database/sqlite/SQLiteDatabase:getVersion	()I
    //   60: istore_1
    //   61: iload_1
    //   62: iconst_3
    //   63: if_icmpeq +45 -> 108
    //   66: aload_0
    //   67: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   70: invokevirtual 149	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   73: iload_1
    //   74: ifne +37 -> 111
    //   77: aload_0
    //   78: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   81: ldc 151
    //   83: invokevirtual 143	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   90: iconst_3
    //   91: invokevirtual 155	android/database/sqlite/SQLiteDatabase:setVersion	(I)V
    //   94: aload_0
    //   95: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   98: invokevirtual 158	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   101: aload_0
    //   102: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   105: invokevirtual 161	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   108: aload_0
    //   109: monitorexit
    //   110: return
    //   111: aload_0
    //   112: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   115: ldc 163
    //   117: invokevirtual 143	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   120: iload_1
    //   121: iconst_2
    //   122: if_icmpgt +48 -> 170
    //   125: aload_0
    //   126: iload_2
    //   127: putfield 31	com/opera/mini/android/ad:a	Z
    //   130: goto -44 -> 86
    //   133: astore_3
    //   134: aload_0
    //   135: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   138: invokevirtual 161	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   141: aload_3
    //   142: athrow
    //   143: astore_3
    //   144: aload_0
    //   145: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   148: ifnull +15 -> 163
    //   151: aload_0
    //   152: getfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   155: invokevirtual 164	android/database/sqlite/SQLiteDatabase:close	()V
    //   158: aload_0
    //   159: aconst_null
    //   160: putfield 36	com/opera/mini/android/ad:I	Landroid/database/sqlite/SQLiteDatabase;
    //   163: aload_3
    //   164: athrow
    //   165: astore_3
    //   166: aload_0
    //   167: monitorexit
    //   168: aload_3
    //   169: athrow
    //   170: iconst_0
    //   171: istore_2
    //   172: goto -47 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	ad
    //   60	63	1	i	int
    //   1	171	2	bool	boolean
    //   13	11	3	localFile	java.io.File
    //   133	9	3	localObject1	Object
    //   143	21	3	localObject2	Object
    //   165	4	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   77	86	133	finally
    //   86	101	133	finally
    //   111	120	133	finally
    //   125	130	133	finally
    //   4	61	143	finally
    //   66	73	143	finally
    //   101	108	143	finally
    //   134	143	143	finally
    //   144	163	165	finally
    //   163	165	165	finally
  }
  
  private void Z(String paramString, int paramInt)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("store", paramString);
    localContentValues.put("record_id", new Integer(paramInt));
    localContentValues.putNull("record");
    this.I.replace("rms", "record", localContentValues);
  }
  
  public final int Code(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      this.Z.bindString(1, paramString);
      int i = (int)this.Z.simpleQueryForLong();
      this.Z.clearBindings();
      i += 1;
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("store", paramString);
      localContentValues.put("record_id", new Integer(i));
      localContentValues.put("record", paramArrayOfByte);
      this.I.insert("rms", "record", localContentValues);
      return i;
    }
    finally {}
  }
  
  public final void Code()
  {
    if (this.I != null)
    {
      this.I.close();
      this.I = null;
    }
  }
  
  public final void Code(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("store", paramString);
    localContentValues.put("record_id", new Integer(paramInt));
    localContentValues.put("record", paramArrayOfByte);
    if (this.I.replace("rms", "record", localContentValues) == -1L) {
      throw new IOException("An error occurred in setRecord");
    }
  }
  
  public final void Code(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt)
  {
    int i = B(paramString1, paramString2);
    if (i > 0)
    {
      Code(paramString1, i, g.Code(paramString2, paramArrayOfByte, paramInt));
      if ((this.a) && (paramString1.equals(b)))
      {
        this.I.execSQL("VACUUM");
        this.a = false;
      }
      return;
    }
    Code(paramString1, g.Code(paramString2, paramArrayOfByte, paramInt));
  }
  
  public final boolean Code(String paramString)
  {
    try
    {
      this.B.bindString(1, paramString);
      long l = this.B.simpleQueryForLong();
      return l > 0L;
    }
    catch (SQLiteDoneException paramString) {}
    return false;
  }
  
  public final boolean Code(String paramString1, String paramString2)
  {
    return B(paramString1, paramString2) > 0;
  }
  
  public final byte[] Code(String paramString, int paramInt)
  {
    String str = null;
    try
    {
      paramString = this.I.rawQuery("SELECT record FROM rms WHERE store = ? AND record_id = ?", new String[] { paramString, String.valueOf(paramInt) });
      str = paramString;
      if (paramString.getCount() == 0)
      {
        str = paramString;
        throw new IOException();
      }
    }
    finally
    {
      if (str != null) {
        str.close();
      }
    }
    str = paramString;
    paramString.moveToFirst();
    str = paramString;
    byte[] arrayOfByte = paramString.getBlob(0);
    if (paramString != null) {
      paramString.close();
    }
    return arrayOfByte;
  }
  
  public final void I(String paramString, int paramInt)
  {
    int i = 0;
    Object localObject = null;
    for (;;)
    {
      try
      {
        Cursor localCursor = this.I.rawQuery("SELECT record_id, record FROM rms WHERE store=? AND record NOT NULL", new String[] { paramString });
        localObject = localCursor;
        int j = localCursor.getCount();
        if (i < j)
        {
          localObject = localCursor;
          localCursor.moveToNext();
          localObject = localCursor;
          int k = localCursor.getInt(0);
          localObject = localCursor;
          byte[] arrayOfByte = localCursor.getBlob(1);
          localObject = localCursor;
          if (!g.I(arrayOfByte))
          {
            localObject = localCursor;
            Z(paramString, k);
          }
          else
          {
            localObject = localCursor;
            if (g.I(g.Code(arrayOfByte, g.Code(arrayOfByte))) == paramInt)
            {
              localObject = localCursor;
              Z(paramString, k);
            }
          }
        }
        else
        {
          return;
        }
      }
      finally
      {
        if (localObject != null) {
          localObject.close();
        }
      }
      i += 1;
    }
  }
  
  public final void I(String paramString1, String paramString2)
  {
    int i = B(paramString1, paramString2);
    if (i != -1) {
      Z(paramString1, i);
    }
  }
  
  public final byte[] I(String paramString)
  {
    byte[] arrayOfByte = null;
    Object localObject = arrayOfByte;
    try
    {
      this.J.bindString(1, paramString);
      localObject = arrayOfByte;
      this.B.bindString(1, paramString);
      localObject = arrayOfByte;
      long l = this.B.simpleQueryForLong();
      localObject = arrayOfByte;
      this.B.clearBindings();
      if (l == 0L)
      {
        localObject = arrayOfByte;
        throw new IOException("Record not found");
      }
    }
    finally
    {
      if (localObject != null) {
        ((Cursor)localObject).close();
      }
    }
    localObject = arrayOfByte;
    String str = this.J.simpleQueryForString();
    localObject = arrayOfByte;
    this.J.clearBindings();
    if (str == null)
    {
      localObject = arrayOfByte;
      throw new IOException("Record not found");
    }
    localObject = arrayOfByte;
    paramString = this.I.rawQuery("SELECT record FROM rms WHERE store=? AND record_id=?", new String[] { paramString, str });
    localObject = paramString;
    if (paramString.getCount() == 0)
    {
      localObject = paramString;
      throw new IOException();
    }
    localObject = paramString;
    paramString.moveToFirst();
    localObject = paramString;
    arrayOfByte = paramString.getBlob(0);
    if (paramString != null) {
      paramString.close();
    }
    return arrayOfByte;
  }
  
  public final bd J(String paramString1, String paramString2)
  {
    byte[] arrayOfByte = null;
    int i = B(paramString1, paramString2);
    paramString2 = arrayOfByte;
    if (i > 0)
    {
      paramString1 = Code(paramString1, i);
      i = g.Code(paramString1);
      arrayOfByte = new byte[i];
      paramString2 = new bd();
      System.arraycopy(paramString1, 0, arrayOfByte, 0, i);
      paramString2.Code = new DataInputStream(new ByteArrayInputStream(arrayOfByte));
      paramString2.I = i;
    }
    return paramString2;
  }
  
  public final void Z(String paramString)
  {
    try
    {
      this.I.delete("rms", "store='" + paramString + "'", null);
      return;
    }
    catch (IOException paramString) {}
  }
  
  public final byte[] Z(String paramString1, String paramString2)
  {
    int i = B(paramString1, paramString2);
    if (i > 0) {
      return Code(paramString1, i);
    }
    return null;
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ad
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */