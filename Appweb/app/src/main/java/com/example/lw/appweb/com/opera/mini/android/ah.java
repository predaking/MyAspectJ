package com.example.lw.appweb.com.opera.mini.android;

import ad;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import bl;
import bu;
import java.io.File;
import java.io.IOException;

public final class ah
  implements MediaScannerConnectionClient, bl
{
  static MediaScannerConnection Code;
  private Context I = Browser.I.getApplicationContext();
  
  ah()
  {
    if (Code == null)
    {
      MediaScannerConnection localMediaScannerConnection = new MediaScannerConnection(this.I, this);
      Code = localMediaScannerConnection;
      localMediaScannerConnection.connect();
    }
  }
  
  static String a(String paramString)
  {
    String str;
    if (paramString.startsWith("file://")) {
      str = paramString.substring(7);
    }
    do
    {
      return str;
      str = paramString;
    } while (!paramString.startsWith("file:"));
    return paramString.substring(5);
  }
  
  private static String b(String paramString)
  {
    int i = paramString.lastIndexOf('/');
    String str = paramString;
    if (i != -1) {
      str = paramString.substring(i + 1);
    }
    return str;
  }
  
  public final boolean B(String paramString)
  {
    paramString = new File(a(paramString));
    if (paramString.exists()) {
      return paramString.delete();
    }
    return true;
  }
  
  public final boolean C(String paramString)
  {
    return new File(a(paramString)).mkdirs();
  }
  
  /* Error */
  public final int Code(byte[] paramArrayOfByte, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_2
    //   6: invokestatic 82	com/opera/mini/android/ah:b	(Ljava/lang/String;)Ljava/lang/String;
    //   9: astore 5
    //   11: aload_1
    //   12: ifnull +113 -> 125
    //   15: new 84	java/io/DataOutputStream
    //   18: dup
    //   19: aload_0
    //   20: getfield 27	com/opera/mini/android/ah:I	Landroid/content/Context;
    //   23: aload 5
    //   25: iconst_0
    //   26: invokevirtual 90	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   29: invokespecial 93	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   32: astore_2
    //   33: aload_2
    //   34: ldc 94
    //   36: invokevirtual 98	java/io/DataOutputStream:writeInt	(I)V
    //   39: aload_2
    //   40: aload_1
    //   41: arraylength
    //   42: bipush 16
    //   44: ishr
    //   45: invokevirtual 101	java/io/DataOutputStream:writeByte	(I)V
    //   48: aload_2
    //   49: aload_1
    //   50: arraylength
    //   51: invokevirtual 104	java/io/DataOutputStream:writeShort	(I)V
    //   54: aload_2
    //   55: aload_1
    //   56: invokevirtual 108	java/io/DataOutputStream:write	([B)V
    //   59: aload_2
    //   60: invokevirtual 111	java/io/DataOutputStream:flush	()V
    //   63: aload_2
    //   64: invokestatic 114	b:Code	(Ljava/io/OutputStream;)V
    //   67: iconst_0
    //   68: ireturn
    //   69: astore_2
    //   70: aload 4
    //   72: astore_1
    //   73: aload_2
    //   74: instanceof 116
    //   77: ifeq +9 -> 86
    //   80: aload_1
    //   81: invokestatic 114	b:Code	(Ljava/io/OutputStream;)V
    //   84: iconst_2
    //   85: ireturn
    //   86: aload_1
    //   87: astore_3
    //   88: aload_0
    //   89: getfield 27	com/opera/mini/android/ah:I	Landroid/content/Context;
    //   92: aload 5
    //   94: invokevirtual 119	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   97: pop
    //   98: aload_1
    //   99: invokestatic 114	b:Code	(Ljava/io/OutputStream;)V
    //   102: iconst_1
    //   103: ireturn
    //   104: astore_1
    //   105: aload_3
    //   106: astore_2
    //   107: aload_2
    //   108: invokestatic 114	b:Code	(Ljava/io/OutputStream;)V
    //   111: aload_1
    //   112: athrow
    //   113: astore_1
    //   114: goto -7 -> 107
    //   117: astore_3
    //   118: aload_2
    //   119: astore_1
    //   120: aload_3
    //   121: astore_2
    //   122: goto -49 -> 73
    //   125: aconst_null
    //   126: astore_2
    //   127: goto -64 -> 63
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	ah
    //   0	130	1	paramArrayOfByte	byte[]
    //   0	130	2	paramString	String
    //   1	105	3	arrayOfByte	byte[]
    //   117	4	3	localThrowable	java.lang.Throwable
    //   3	68	4	localObject	Object
    //   9	84	5	str	String
    // Exception table:
    //   from	to	target	type
    //   15	33	69	java/lang/Throwable
    //   15	33	104	finally
    //   88	98	104	finally
    //   33	63	113	finally
    //   33	63	117	java/lang/Throwable
  }
  
  public final bu Code(String paramString, boolean paramBoolean, int paramInt)
  {
    paramString = new File(a(paramString));
    if (paramBoolean)
    {
      if (paramString.exists()) {
        paramString.delete();
      }
      if (!paramString.createNewFile()) {
        throw new IOException();
      }
    }
    if (((paramInt & 0x1) != 0) && (!paramString.canRead())) {
      throw new IOException();
    }
    if (((paramInt & 0x2) != 0) && (!paramString.canWrite())) {
      throw new IOException();
    }
    return new g(paramString);
  }
  
  public final void Code()
  {
    String str2 = Environment.getExternalStorageDirectory().getAbsolutePath();
    if (str2.indexOf("sdcard") != -1) {}
    for (String str1 = "SD Card";; str1 = str2)
    {
      if ((Environment.getExternalStorageState().equals("mounted")) && (g.c.b(str2) == null)) {
        g.c.Code(str1, str2);
      }
      return;
    }
  }
  
  public final boolean Code(String paramString)
  {
    return new File(a(paramString)).exists();
  }
  
  public final long I(String paramString)
  {
    return new File(a(paramString)).length();
  }
  
  public final String I()
  {
    File localFile = new File(Environment.getExternalStorageDirectory(), "download");
    if ((Environment.getExternalStorageState().equals("mounted")) && (!localFile.exists())) {
      localFile.mkdir();
    }
    return localFile.getAbsolutePath();
  }
  
  /* Error */
  public final byte[] J(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_1
    //   3: invokestatic 82	com/opera/mini/android/ah:b	(Ljava/lang/String;)Ljava/lang/String;
    //   6: astore_1
    //   7: new 195	java/io/DataInputStream
    //   10: dup
    //   11: aload_0
    //   12: getfield 27	com/opera/mini/android/ah:I	Landroid/content/Context;
    //   15: aload_1
    //   16: invokevirtual 199	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   19: invokespecial 202	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   22: astore_1
    //   23: aload_1
    //   24: invokevirtual 206	java/io/DataInputStream:readInt	()I
    //   27: istore_2
    //   28: iload_2
    //   29: ldc 94
    //   31: if_icmpeq +9 -> 40
    //   34: aload_1
    //   35: invokestatic 208	b:Code	(Ljava/io/InputStream;)V
    //   38: aconst_null
    //   39: areturn
    //   40: iconst_3
    //   41: newarray byte
    //   43: astore 5
    //   45: iconst_0
    //   46: istore_2
    //   47: iload_2
    //   48: iconst_3
    //   49: if_icmpge +18 -> 67
    //   52: aload 5
    //   54: iload_2
    //   55: aload_1
    //   56: invokevirtual 212	java/io/DataInputStream:readByte	()B
    //   59: bastore
    //   60: iload_2
    //   61: iconst_1
    //   62: iadd
    //   63: istore_2
    //   64: goto -17 -> 47
    //   67: aload 5
    //   69: iconst_0
    //   70: baload
    //   71: istore_2
    //   72: aload 5
    //   74: iconst_1
    //   75: baload
    //   76: istore 4
    //   78: aload 5
    //   80: iconst_2
    //   81: baload
    //   82: sipush 255
    //   85: iand
    //   86: iload_2
    //   87: sipush 255
    //   90: iand
    //   91: bipush 16
    //   93: ishl
    //   94: iload 4
    //   96: sipush 255
    //   99: iand
    //   100: bipush 8
    //   102: ishl
    //   103: iadd
    //   104: iadd
    //   105: istore 4
    //   107: iload 4
    //   109: newarray byte
    //   111: astore 5
    //   113: iload_3
    //   114: istore_2
    //   115: iload_2
    //   116: iload 4
    //   118: if_icmpge +28 -> 146
    //   121: aload_1
    //   122: aload 5
    //   124: iload_2
    //   125: sipush 1024
    //   128: iload 4
    //   130: iload_2
    //   131: isub
    //   132: invokestatic 218	java/lang/Math:min	(II)I
    //   135: invokevirtual 222	java/io/DataInputStream:read	([BII)I
    //   138: istore_3
    //   139: iload_2
    //   140: iload_3
    //   141: iadd
    //   142: istore_2
    //   143: goto -28 -> 115
    //   146: aload_1
    //   147: invokestatic 208	b:Code	(Ljava/io/InputStream;)V
    //   150: aload 5
    //   152: areturn
    //   153: astore_1
    //   154: aconst_null
    //   155: astore_1
    //   156: aload_1
    //   157: invokestatic 208	b:Code	(Ljava/io/InputStream;)V
    //   160: aconst_null
    //   161: areturn
    //   162: astore_1
    //   163: aconst_null
    //   164: astore 6
    //   166: aload_1
    //   167: astore 5
    //   169: aload 6
    //   171: invokestatic 208	b:Code	(Ljava/io/InputStream;)V
    //   174: aload 5
    //   176: athrow
    //   177: astore 5
    //   179: aload_1
    //   180: astore 6
    //   182: goto -13 -> 169
    //   185: astore 5
    //   187: goto -31 -> 156
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	this	ah
    //   0	190	1	paramString	String
    //   27	116	2	i	int
    //   1	141	3	j	int
    //   76	56	4	k	int
    //   43	132	5	localObject1	Object
    //   177	1	5	localObject2	Object
    //   185	1	5	localIOException	IOException
    //   164	17	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   7	23	153	java/io/IOException
    //   7	23	162	finally
    //   23	28	177	finally
    //   40	45	177	finally
    //   52	60	177	finally
    //   107	113	177	finally
    //   121	139	177	finally
    //   23	28	185	java/io/IOException
    //   40	45	185	java/io/IOException
    //   52	60	185	java/io/IOException
    //   107	113	185	java/io/IOException
    //   121	139	185	java/io/IOException
  }
  
  public final int[] J()
  {
    int m = 0;
    String[] arrayOfString = this.I.fileList();
    int j = 0;
    int k;
    for (int i = 0; j < arrayOfString.length; i = k)
    {
      k = i;
      if (ad.c(arrayOfString[j]) != 0)
      {
        k = i;
        if (ad.d(arrayOfString[j]) != 0) {
          k = i + 2;
        }
      }
      j += 1;
    }
    int[] arrayOfInt = new int[i];
    j = i;
    i = m;
    while (i < arrayOfString.length)
    {
      int n = ad.c(arrayOfString[i]);
      k = j;
      if (n != 0)
      {
        m = ad.d(arrayOfString[i]);
        k = j;
        if (m != 0)
        {
          j -= 1;
          arrayOfInt[j] = n;
          k = j - 1;
          arrayOfInt[k] = m;
        }
      }
      i += 1;
      j = k;
    }
    return arrayOfInt;
  }
  
  public final long Z(String paramString)
  {
    paramString = new StatFs(a(paramString));
    long l = paramString.getAvailableBlocks();
    return paramString.getBlockSize() * l;
  }
  
  public final String Z()
  {
    return this.I.getFilesDir().getAbsolutePath();
  }
  
  public final void onMediaScannerConnected() {}
  
  public final void onScanCompleted(String paramString, Uri paramUri) {}
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ah
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */