package com.example.lw.appweb.com.opera.mini.android;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import g;

final class ai
  implements Runnable
{
  private ai(Z paramZ, byte paramByte) {}
  
  private static Bitmap Code(int paramInt1, int paramInt2)
  {
    int i = 0;
    g localg;
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Config.RGB_565);
      if (localBitmap != null) {
        return localBitmap;
      }
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      if (i >= g.b) {
        throw localOutOfMemoryError;
      }
      g.I.B();
      localg = g.I;
      if (i <= 0) {}
    }
    for (boolean bool = true;; bool = false)
    {
      localg.Code(bool);
      g.I.C();
      i += 1;
      break;
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 57	com/opera/mini/android/Z:b	()Laq;
    //   3: invokevirtual 61	aq:I	()V
    //   6: getstatic 64	g:Code	Le;
    //   9: invokeinterface 70 1 0
    //   14: ifne +29 -> 43
    //   17: aload_0
    //   18: monitorenter
    //   19: invokestatic 73	com/opera/mini/android/Z:c	()Z
    //   22: ifne +40 -> 62
    //   25: aload_0
    //   26: iconst_0
    //   27: invokestatic 77	b:Code	(Ljava/lang/Object;I)V
    //   30: getstatic 64	g:Code	Le;
    //   33: invokeinterface 70 1 0
    //   38: ifeq +24 -> 62
    //   41: aload_0
    //   42: monitorexit
    //   43: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   46: ifnull +9 -> 55
    //   49: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   52: invokevirtual 85	com/opera/mini/android/z:g	()V
    //   55: invokestatic 57	com/opera/mini/android/Z:b	()Laq;
    //   58: invokevirtual 88	aq:Z	()V
    //   61: return
    //   62: invokestatic 91	com/opera/mini/android/Z:d	()Z
    //   65: pop
    //   66: invokestatic 94	com/opera/mini/android/Z:e	()I
    //   69: istore_1
    //   70: invokestatic 97	com/opera/mini/android/Z:f	()I
    //   73: istore_2
    //   74: invokestatic 99	com/opera/mini/android/Z:g	()I
    //   77: istore_3
    //   78: invokestatic 102	com/opera/mini/android/Z:h	()I
    //   81: istore 4
    //   83: iconst_0
    //   84: invokestatic 105	com/opera/mini/android/Z:Code	(I)I
    //   87: pop
    //   88: aload_0
    //   89: monitorexit
    //   90: aload_0
    //   91: getfield 15	com/opera/mini/android/ai:Code	Lcom/opera/mini/android/Z;
    //   94: invokevirtual 108	com/opera/mini/android/Z:getWidth	()I
    //   97: istore 5
    //   99: aload_0
    //   100: getfield 15	com/opera/mini/android/ai:Code	Lcom/opera/mini/android/Z;
    //   103: invokevirtual 111	com/opera/mini/android/Z:getHeight	()I
    //   106: istore 6
    //   108: iload 5
    //   110: ifle -104 -> 6
    //   113: iload 6
    //   115: ifle -109 -> 6
    //   118: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   121: ifnull +25 -> 146
    //   124: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   127: invokevirtual 116	android/graphics/Bitmap:getWidth	()I
    //   130: iload 5
    //   132: if_icmpne +14 -> 146
    //   135: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   138: invokevirtual 117	android/graphics/Bitmap:getHeight	()I
    //   141: iload 6
    //   143: if_icmpeq +66 -> 209
    //   146: aconst_null
    //   147: invokestatic 120	com/opera/mini/android/Z:Code	(Lcom/opera/mini/android/z;)Lcom/opera/mini/android/z;
    //   150: pop
    //   151: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   154: ifnull +14 -> 168
    //   157: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   160: invokevirtual 123	android/graphics/Bitmap:recycle	()V
    //   163: aconst_null
    //   164: invokestatic 126	com/opera/mini/android/Z:Code	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   167: pop
    //   168: iload 5
    //   170: iload 6
    //   172: invokestatic 128	com/opera/mini/android/ai:Code	(II)Landroid/graphics/Bitmap;
    //   175: invokestatic 126	com/opera/mini/android/Z:Code	(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    //   178: pop
    //   179: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   182: ifnull -127 -> 55
    //   185: aload_0
    //   186: monitorenter
    //   187: invokestatic 131	com/opera/mini/android/Z:j	()I
    //   190: pop
    //   191: invokestatic 134	com/opera/mini/android/Z:k	()I
    //   194: pop
    //   195: iload 5
    //   197: invokestatic 105	com/opera/mini/android/Z:Code	(I)I
    //   200: pop
    //   201: iload 6
    //   203: invokestatic 136	com/opera/mini/android/Z:I	(I)I
    //   206: pop
    //   207: aload_0
    //   208: monitorexit
    //   209: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   212: ifnonnull +30 -> 242
    //   215: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   218: invokestatic 139	com/opera/mini/android/z:I	(Landroid/graphics/Bitmap;)Lcom/opera/mini/android/z;
    //   221: invokestatic 120	com/opera/mini/android/Z:Code	(Lcom/opera/mini/android/z;)Lcom/opera/mini/android/z;
    //   224: pop
    //   225: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   228: iconst_1
    //   229: invokevirtual 140	com/opera/mini/android/z:Code	(Z)V
    //   232: aload_0
    //   233: getfield 15	com/opera/mini/android/ai:Code	Lcom/opera/mini/android/Z;
    //   236: invokestatic 143	com/opera/mini/android/Z:Code	(Lcom/opera/mini/android/Z;)Lcom/opera/mini/android/MiniView;
    //   239: invokevirtual 146	com/opera/mini/android/MiniView:I	()V
    //   242: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   245: invokevirtual 149	com/opera/mini/android/z:a	()Z
    //   248: ifeq +42 -> 290
    //   251: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   254: iload_1
    //   255: iload_2
    //   256: iload_3
    //   257: iload 4
    //   259: invokevirtual 152	com/opera/mini/android/z:Code	(IIII)V
    //   262: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   265: iload_1
    //   266: iload_2
    //   267: iload_3
    //   268: iload 4
    //   270: ldc 153
    //   272: invokevirtual 156	com/opera/mini/android/z:Z	(IIIII)V
    //   275: getstatic 161	com/opera/mini/android/Browser:Code	Lcom/opera/mini/android/l;
    //   278: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   281: invokevirtual 166	com/opera/mini/android/l:Code	(Lq;)V
    //   284: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   287: invokevirtual 168	com/opera/mini/android/z:b	()V
    //   290: invokestatic 81	com/opera/mini/android/Z:l	()Lcom/opera/mini/android/z;
    //   293: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   296: invokevirtual 171	com/opera/mini/android/z:Code	(Landroid/graphics/Bitmap;)V
    //   299: aload_0
    //   300: getfield 15	com/opera/mini/android/ai:Code	Lcom/opera/mini/android/Z;
    //   303: invokestatic 174	com/opera/mini/android/Z:I	(Lcom/opera/mini/android/Z;)Landroid/view/SurfaceHolder;
    //   306: invokeinterface 180 1 0
    //   311: astore 7
    //   313: aload 7
    //   315: ifnull -309 -> 6
    //   318: aload 7
    //   320: invokestatic 115	com/opera/mini/android/Z:i	()Landroid/graphics/Bitmap;
    //   323: fconst_0
    //   324: fconst_0
    //   325: aconst_null
    //   326: invokevirtual 186	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
    //   329: aload_0
    //   330: getfield 15	com/opera/mini/android/ai:Code	Lcom/opera/mini/android/Z;
    //   333: invokestatic 174	com/opera/mini/android/Z:I	(Lcom/opera/mini/android/Z;)Landroid/view/SurfaceHolder;
    //   336: aload 7
    //   338: invokeinterface 190 2 0
    //   343: goto -337 -> 6
    //   346: astore 7
    //   348: invokestatic 57	com/opera/mini/android/Z:b	()Laq;
    //   351: invokevirtual 88	aq:Z	()V
    //   354: aload 7
    //   356: athrow
    //   357: astore 7
    //   359: aload_0
    //   360: monitorexit
    //   361: aload 7
    //   363: athrow
    //   364: astore 7
    //   366: aload_0
    //   367: monitorexit
    //   368: aload 7
    //   370: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	371	0	this	ai
    //   69	197	1	i	int
    //   73	194	2	j	int
    //   77	191	3	k	int
    //   81	188	4	m	int
    //   97	99	5	n	int
    //   106	96	6	i1	int
    //   311	26	7	localCanvas	android.graphics.Canvas
    //   346	9	7	localObject1	Object
    //   357	5	7	localObject2	Object
    //   364	5	7	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   6	19	346	finally
    //   43	55	346	finally
    //   90	108	346	finally
    //   118	146	346	finally
    //   146	168	346	finally
    //   168	187	346	finally
    //   209	242	346	finally
    //   242	290	346	finally
    //   290	313	346	finally
    //   318	343	346	finally
    //   361	364	346	finally
    //   368	371	346	finally
    //   19	43	357	finally
    //   62	90	357	finally
    //   359	361	357	finally
    //   187	209	364	finally
    //   366	368	364	finally
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.ai
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */