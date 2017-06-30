package com.example.lw.appweb.com.opera.mini.android;

import android.graphics.Rect;
import android.opengl.GLSurfaceView.Renderer;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import g;
import java.util.HashSet;
import java.util.Scanner;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public class k
  implements GLSurfaceView.Renderer
{
  private static final HashSet d = new B();
  private EGLContext B = null;
  private int C;
  private boolean Code = false;
  private MiniView I;
  private z J = null;
  private boolean Z = false;
  private int a;
  private int b;
  private int c;
  private long e = 0L;
  
  public k(int paramInt1, int paramInt2, MiniView paramMiniView)
  {
    this.C = paramInt1;
    this.a = paramInt2;
    this.b = paramInt2;
    this.c = paramInt1;
    this.I = paramMiniView;
  }
  
  static boolean C()
  {
    return (d.contains(new r(Build.MODEL))) || (d.contains(new r(Build.MODEL, Build.MANUFACTURER, VERSION.SDK, null))) || (d.contains(new r(Build.MODEL, Build.MANUFACTURER, null, null))) || (d.contains(new r(Build.MODEL, null, VERSION.SDK, null))) || (d.contains(new r(null, null, null, Build.BOARD)));
  }
  
  /* Error */
  private static String Code(GL10 paramGL10)
  {
    // Byte code:
    //   0: aload_0
    //   1: sipush 7937
    //   4: invokeinterface 94 2 0
    //   9: ldc 96
    //   11: invokevirtual 102	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   14: ifge +5 -> 19
    //   17: aconst_null
    //   18: areturn
    //   19: aload_0
    //   20: sipush 7938
    //   23: invokeinterface 94 2 0
    //   28: astore_0
    //   29: aload_0
    //   30: ldc 104
    //   32: invokevirtual 102	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   35: istore_1
    //   36: iload_1
    //   37: ifle +15 -> 52
    //   40: aload_0
    //   41: iload_1
    //   42: bipush 6
    //   44: iadd
    //   45: invokevirtual 107	java/lang/String:substring	(I)Ljava/lang/String;
    //   48: astore_0
    //   49: aload_0
    //   50: areturn
    //   51: astore_0
    //   52: new 109	java/io/BufferedReader
    //   55: dup
    //   56: new 111	java/io/FileReader
    //   59: dup
    //   60: ldc 113
    //   62: invokespecial 114	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   65: invokespecial 117	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   68: astore_3
    //   69: aload_3
    //   70: invokevirtual 121	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   73: astore_0
    //   74: aload_0
    //   75: ifnull +52 -> 127
    //   78: aload_0
    //   79: ldc 123
    //   81: invokevirtual 102	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   84: istore_1
    //   85: iload_1
    //   86: ifle +41 -> 127
    //   89: aload_0
    //   90: iload_1
    //   91: iconst_1
    //   92: iadd
    //   93: invokevirtual 107	java/lang/String:substring	(I)Ljava/lang/String;
    //   96: astore_2
    //   97: aload_2
    //   98: ldc 123
    //   100: invokevirtual 102	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   103: istore_1
    //   104: aload_2
    //   105: astore_0
    //   106: iload_1
    //   107: ifle +10 -> 117
    //   110: aload_2
    //   111: iconst_0
    //   112: iload_1
    //   113: invokevirtual 126	java/lang/String:substring	(II)Ljava/lang/String;
    //   116: astore_0
    //   117: aload_3
    //   118: invokevirtual 129	java/io/BufferedReader:close	()V
    //   121: aload_0
    //   122: areturn
    //   123: astore_0
    //   124: ldc 131
    //   126: areturn
    //   127: aload_3
    //   128: invokevirtual 129	java/io/BufferedReader:close	()V
    //   131: goto -7 -> 124
    //   134: astore_0
    //   135: aload_3
    //   136: invokevirtual 129	java/io/BufferedReader:close	()V
    //   139: aload_0
    //   140: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	paramGL10	GL10
    //   35	78	1	i	int
    //   96	15	2	str	String
    //   68	68	3	localBufferedReader	java.io.BufferedReader
    // Exception table:
    //   from	to	target	type
    //   19	36	51	java/lang/Throwable
    //   40	49	51	java/lang/Throwable
    //   52	69	123	java/lang/Throwable
    //   117	121	123	java/lang/Throwable
    //   127	131	123	java/lang/Throwable
    //   135	141	123	java/lang/Throwable
    //   69	74	134	finally
    //   78	85	134	finally
    //   89	104	134	finally
    //   110	117	134	finally
  }
  
  private static boolean I(GL10 paramGL10)
  {
    if (ae.ae >= 11) {}
    for (;;)
    {
      return false;
      Object localObject = Code(paramGL10);
      if (localObject == null) {
        continue;
      }
      try
      {
        paramGL10 = new int[4];
        paramGL10[0] = 1;
        paramGL10[1] = 5;
        paramGL10[2] = 15;
        paramGL10[3] = 3196;
        paramGL10;
        localObject = new Scanner((String)localObject).useDelimiter("[^0-9]");
        int i = 0;
        for (;;)
        {
          if (i >= 4) {
            break label111;
          }
          if (!((Scanner)localObject).hasNextInt()) {
            return true;
          }
          int j = ((Scanner)localObject).nextInt();
          if (j > paramGL10[i]) {
            break;
          }
          int k = paramGL10[i];
          if (j < k) {
            return true;
          }
          i += 1;
        }
        return true;
      }
      catch (Throwable paramGL10) {}
    }
  }
  
  private static EGLContext a()
  {
    return ((EGL10)EGLContext.getEGL()).eglGetCurrentContext();
  }
  
  final boolean B()
  {
    return this.Z;
  }
  
  public final void Code()
  {
    this.Code = true;
  }
  
  public final void Code(int paramInt1, int paramInt2)
  {
    this.b = paramInt2;
    this.c = paramInt1;
  }
  
  /* Error */
  public final void I()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	com/opera/mini/android/k:J	Lcom/opera/mini/android/z;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 36	com/opera/mini/android/k:Z	Z
    //   19: aload_0
    //   20: getfield 38	com/opera/mini/android/k:J	Lcom/opera/mini/android/z;
    //   23: invokevirtual 173	com/opera/mini/android/z:f	()V
    //   26: goto -15 -> 11
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	k
    //   6	2	1	localz	z
    //   29	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	29	finally
    //   14	26	29	finally
  }
  
  /* Error */
  public final void J()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	com/opera/mini/android/k:J	Lcom/opera/mini/android/z;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 40	com/opera/mini/android/k:B	Ljavax/microedition/khronos/egl/EGLContext;
    //   18: invokestatic 175	com/opera/mini/android/k:a	()Ljavax/microedition/khronos/egl/EGLContext;
    //   21: invokevirtual 178	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   24: ifeq -13 -> 11
    //   27: aload_0
    //   28: getfield 38	com/opera/mini/android/k:J	Lcom/opera/mini/android/z;
    //   31: invokevirtual 180	com/opera/mini/android/z:c	()V
    //   34: goto -23 -> 11
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	k
    //   6	2	1	localz	z
    //   37	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	37	finally
    //   14	34	37	finally
  }
  
  /* Error */
  public final void Z()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	com/opera/mini/android/k:J	Lcom/opera/mini/android/z;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 38	com/opera/mini/android/k:J	Lcom/opera/mini/android/z;
    //   18: invokevirtual 183	com/opera/mini/android/z:g	()V
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield 38	com/opera/mini/android/k:J	Lcom/opera/mini/android/z;
    //   26: goto -15 -> 11
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	34	0	this	k
    //   6	2	1	localz	z
    //   29	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	29	finally
    //   14	26	29	finally
  }
  
  public void onDrawFrame(GL10 paramGL10)
  {
    for (;;)
    {
      int[] arrayOfInt2;
      try
      {
        paramGL10 = this.J;
        if (paramGL10 == null) {
          return;
        }
        int[] arrayOfInt1;
        if (this.a != this.b)
        {
          paramGL10 = (EGL10)EGLContext.getEGL();
          EGLDisplay localEGLDisplay = paramGL10.eglGetCurrentDisplay();
          arrayOfInt1 = new int[1];
          arrayOfInt2 = new int[1];
          EGLSurface localEGLSurface = paramGL10.eglGetCurrentSurface(12378);
          if ((localEGLDisplay != null) && (localEGLSurface != null))
          {
            paramGL10.eglQuerySurface(localEGLDisplay, localEGLSurface, 12374, arrayOfInt1);
            paramGL10.eglQuerySurface(localEGLDisplay, localEGLSurface, 12375, arrayOfInt2);
            paramGL10 = new Rect(0, 0, arrayOfInt2[0], arrayOfInt1[0]);
            if (this.a == paramGL10.bottom) {
              break label288;
            }
            this.J.J(paramGL10.right, paramGL10.bottom);
            this.a = paramGL10.bottom;
            this.C = paramGL10.right;
          }
        }
        else
        {
          this.Z = true;
          long l2 = SystemClock.uptimeMillis();
          long l1 = l2;
          if (this.e != 0L)
          {
            long l3 = l2 - this.e;
            l1 = l2;
            if (l3 < 16L)
            {
              l1 = l2;
              if (l3 >= 0L)
              {
                SystemClock.sleep(16L - l3);
                l1 = SystemClock.uptimeMillis();
              }
            }
          }
          this.e = l1;
          if (!this.J.a()) {
            continue;
          }
          Browser.Code.Code(this.J);
          this.J.b();
          continue;
        }
        arrayOfInt1[0] = this.b;
      }
      finally {}
      arrayOfInt2[0] = this.c;
      continue;
      label288:
      this.I.Z();
    }
  }
  
  /* Error */
  public void onSurfaceChanged(GL10 paramGL10, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 38	com/opera/mini/android/k:J	Lcom/opera/mini/android/z;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 52	com/opera/mini/android/k:I	Lcom/opera/mini/android/MiniView;
    //   18: invokevirtual 244	com/opera/mini/android/MiniView:I	()V
    //   21: goto -10 -> 11
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	29	0	this	k
    //   0	29	1	paramGL10	GL10
    //   0	29	2	paramInt1	int
    //   0	29	3	paramInt2	int
    // Exception table:
    //   from	to	target	type
    //   2	7	24	finally
    //   14	21	24	finally
  }
  
  public void onSurfaceCreated(GL10 paramGL10, EGLConfig paramEGLConfig)
  {
    int k = 1;
    int i;
    try
    {
      if (paramGL10.glGetString(7937).indexOf("PixelFlinger") >= 0)
      {
        i = k;
        if (i == 0) {
          break label83;
        }
        Browser.I.runOnUiThread(new y(this));
      }
      for (;;)
      {
        return;
        i = k;
        if (I(paramGL10)) {
          break;
        }
        paramGL10 = paramGL10.glGetString(7937);
        if (paramGL10 == null) {
          break label152;
        }
        if (paramGL10.indexOf("FIMG") >= 0) {
          break label168;
        }
        break label152;
        label83:
        this.J = z.I(this.C, this.a);
        this.J.e();
        this.J.Code(false);
        this.B = a();
        if (this.Code)
        {
          l.I.B();
          l.I.x();
          this.Code = false;
        }
      }
      j = 0;
    }
    finally {}
    for (;;)
    {
      label152:
      i = k;
      if (j != 0) {
        break;
      }
      i = 0;
      break;
      label168:
      int j = 1;
    }
  }
}


/* Location:           F:\四个案例的jar\欧朋浏览器\classes-dex2jar.jar
 * Qualified Name:     com.opera.mini.android.k
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */