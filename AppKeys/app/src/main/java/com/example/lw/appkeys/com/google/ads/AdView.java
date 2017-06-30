package com.example.lw.appkeys.com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.internal.d;
import com.google.ads.internal.j;
import com.google.ads.util.AdUtil;
import com.google.ads.util.i.c;
import java.util.HashSet;
import java.util.Set;

public class AdView
  extends RelativeLayout
  implements Ad
{
  private m a;
  private d b;
  
  public AdView(Activity paramActivity, AdSize paramAdSize, String paramString)
  {
    super(paramActivity.getApplicationContext());
    try
    {
      a(paramActivity, paramAdSize, null);
      b(paramActivity, paramAdSize, null);
      a(paramActivity, paramAdSize, "a1504806ef15e6d");
      return;
    }
    catch (com.google.ads.internal.b paramString)
    {
      a(paramActivity, paramString.c("Could not initialize AdView"), paramAdSize, null);
      paramString.a("Could not initialize AdView");
    }
  }
  
  protected AdView(Activity paramActivity, AdSize[] paramArrayOfAdSize, String paramString)
  {
    this(paramActivity, new AdSize(0, 0), paramString);
    a(paramArrayOfAdSize);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
  }
  
  private int a(Context paramContext, int paramInt)
  {
    return (int)TypedValue.applyDimension(1, paramInt, paramContext.getResources().getDisplayMetrics());
  }
  
  private String a(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
    throws com.google.ads.internal.b
  {
    paramAttributeSet = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString);
    String str;
    TypedValue localTypedValue;
    if ((paramAttributeSet != null) && (paramAttributeSet.startsWith("@string/")) && (paramBoolean1))
    {
      str = paramAttributeSet.substring("@string/".length());
      paramContext = paramContext.getPackageName();
      localTypedValue = new TypedValue();
    }
    for (;;)
    {
      try
      {
        getResources().getValue(paramContext + ":string/" + str, localTypedValue, true);
        if (localTypedValue.string != null)
        {
          paramContext = localTypedValue.string.toString();
          if ((!paramBoolean2) || (paramContext != null)) {
            break label223;
          }
          throw new com.google.ads.internal.b("Required XML attribute \"" + paramString + "\" missing", true);
        }
      }
      catch (NotFoundException paramContext)
      {
        throw new com.google.ads.internal.b("Could not find resource for " + paramString + ": " + paramAttributeSet, true, paramContext);
      }
      throw new com.google.ads.internal.b("Resource " + paramString + " was not a string: " + localTypedValue, true);
      label223:
      return paramContext;
      paramContext = paramAttributeSet;
    }
  }
  
  private void a(Activity paramActivity, AdSize paramAdSize, String paramString)
    throws com.google.ads.internal.b
  {
    FrameLayout localFrameLayout = new FrameLayout(paramActivity);
    localFrameLayout.setFocusable(false);
    this.a = m.a(this, paramString, paramActivity, localFrameLayout, paramAdSize);
    this.b = new d(this.a, false);
    setGravity(17);
    try
    {
      paramActivity = j.a(paramActivity, this.b);
      if (paramActivity != null)
      {
        paramActivity.addView(localFrameLayout, -2, -2);
        addView(paramActivity, -2, -2);
        return;
      }
      addView(localFrameLayout, -2, -2);
      return;
    }
    catch (VerifyError paramActivity)
    {
      com.google.ads.util.b.a("Gestures disabled: Not supported on this version of Android.", paramActivity);
      addView(localFrameLayout, -2, -2);
    }
  }
  
  /* Error */
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_0
    //   6: ldc 210
    //   8: aload_1
    //   9: aload_2
    //   10: iconst_0
    //   11: iconst_1
    //   12: invokespecial 212	com/google/ads/AdView:a	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/lang/String;
    //   15: astore 4
    //   17: aload_0
    //   18: aload 4
    //   20: invokespecial 215	com/google/ads/AdView:a	(Ljava/lang/String;)[Lcom/google/ads/AdSize;
    //   23: astore 5
    //   25: aload 5
    //   27: ifnull +9 -> 36
    //   30: aload 5
    //   32: arraylength
    //   33: ifne +92 -> 125
    //   36: new 14	com/google/ads/internal/b
    //   39: dup
    //   40: new 119	java/lang/StringBuilder
    //   43: dup
    //   44: invokespecial 120	java/lang/StringBuilder:<init>	()V
    //   47: ldc 217
    //   49: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload 4
    //   54: invokevirtual 124	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: iconst_1
    //   61: invokespecial 147	com/google/ads/internal/b:<init>	(Ljava/lang/String;Z)V
    //   64: athrow
    //   65: astore 4
    //   67: aload 4
    //   69: ldc 34
    //   71: invokevirtual 38	com/google/ads/internal/b:c	(Ljava/lang/String;)Ljava/lang/String;
    //   74: astore 6
    //   76: aload 5
    //   78: ifnull +287 -> 365
    //   81: aload 5
    //   83: arraylength
    //   84: ifle +281 -> 365
    //   87: aload 5
    //   89: iconst_0
    //   90: aaload
    //   91: astore 5
    //   93: aload_0
    //   94: aload_1
    //   95: aload 6
    //   97: aload 5
    //   99: aload_2
    //   100: invokespecial 41	com/google/ads/AdView:a	(Landroid/content/Context;Ljava/lang/String;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)V
    //   103: aload 4
    //   105: ldc 34
    //   107: invokevirtual 44	com/google/ads/internal/b:a	(Ljava/lang/String;)V
    //   110: aload_0
    //   111: invokevirtual 221	com/google/ads/AdView:isInEditMode	()Z
    //   114: ifne -110 -> 4
    //   117: aload 4
    //   119: ldc 34
    //   121: invokevirtual 223	com/google/ads/internal/b:b	(Ljava/lang/String;)V
    //   124: return
    //   125: aload_0
    //   126: ldc 225
    //   128: aload_2
    //   129: invokespecial 228	com/google/ads/AdView:a	(Ljava/lang/String;Landroid/util/AttributeSet;)Z
    //   132: ifne +14 -> 146
    //   135: new 14	com/google/ads/internal/b
    //   138: dup
    //   139: ldc 230
    //   141: iconst_1
    //   142: invokespecial 147	com/google/ads/internal/b:<init>	(Ljava/lang/String;Z)V
    //   145: athrow
    //   146: aload_0
    //   147: invokevirtual 221	com/google/ads/AdView:isInEditMode	()Z
    //   150: ifeq +17 -> 167
    //   153: aload_0
    //   154: aload_1
    //   155: ldc 232
    //   157: iconst_m1
    //   158: aload 5
    //   160: iconst_0
    //   161: aaload
    //   162: aload_2
    //   163: invokevirtual 235	com/google/ads/AdView:a	(Landroid/content/Context;Ljava/lang/String;ILcom/google/ads/AdSize;Landroid/util/AttributeSet;)V
    //   166: return
    //   167: aload_0
    //   168: ldc 225
    //   170: aload_1
    //   171: aload_2
    //   172: iconst_1
    //   173: iconst_1
    //   174: invokespecial 212	com/google/ads/AdView:a	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/lang/String;
    //   177: astore 4
    //   179: aload_2
    //   180: ldc 87
    //   182: ldc 237
    //   184: iconst_0
    //   185: invokeinterface 241 4 0
    //   190: istore_3
    //   191: aload_1
    //   192: instanceof 16
    //   195: ifeq +158 -> 353
    //   198: aload_1
    //   199: checkcast 16	android/app/Activity
    //   202: astore 6
    //   204: aload_0
    //   205: aload 6
    //   207: aload 5
    //   209: iconst_0
    //   210: aaload
    //   211: aload_2
    //   212: invokespecial 26	com/google/ads/AdView:a	(Landroid/content/Context;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)Z
    //   215: pop
    //   216: aload_0
    //   217: aload 6
    //   219: aload 5
    //   221: iconst_0
    //   222: aaload
    //   223: aload_2
    //   224: invokespecial 28	com/google/ads/AdView:b	(Landroid/content/Context;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)Z
    //   227: pop
    //   228: aload 5
    //   230: arraylength
    //   231: iconst_1
    //   232: if_icmpne +95 -> 327
    //   235: aload_0
    //   236: aload 6
    //   238: aload 5
    //   240: iconst_0
    //   241: aaload
    //   242: aload 4
    //   244: invokespecial 32	com/google/ads/AdView:a	(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V
    //   247: iload_3
    //   248: ifeq -244 -> 4
    //   251: aload_0
    //   252: ldc 243
    //   254: aload_1
    //   255: aload_2
    //   256: iconst_0
    //   257: iconst_0
    //   258: invokespecial 246	com/google/ads/AdView:b	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/util/Set;
    //   261: astore 4
    //   263: aload 4
    //   265: ldc 248
    //   267: invokeinterface 254 2 0
    //   272: ifeq +24 -> 296
    //   275: aload 4
    //   277: ldc 248
    //   279: invokeinterface 257 2 0
    //   284: pop
    //   285: aload 4
    //   287: getstatic 262	com/google/ads/AdRequest:TEST_EMULATOR	Ljava/lang/String;
    //   290: invokeinterface 265 2 0
    //   295: pop
    //   296: aload_0
    //   297: new 259	com/google/ads/AdRequest
    //   300: dup
    //   301: invokespecial 266	com/google/ads/AdRequest:<init>	()V
    //   304: aload 4
    //   306: invokevirtual 270	com/google/ads/AdRequest:setTestDevices	(Ljava/util/Set;)Lcom/google/ads/AdRequest;
    //   309: aload_0
    //   310: ldc_w 272
    //   313: aload_1
    //   314: aload_2
    //   315: iconst_0
    //   316: iconst_0
    //   317: invokespecial 246	com/google/ads/AdView:b	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZ)Ljava/util/Set;
    //   320: invokevirtual 275	com/google/ads/AdRequest:setKeywords	(Ljava/util/Set;)Lcom/google/ads/AdRequest;
    //   323: invokevirtual 279	com/google/ads/AdView:loadAd	(Lcom/google/ads/AdRequest;)V
    //   326: return
    //   327: aload_0
    //   328: aload 6
    //   330: new 48	com/google/ads/AdSize
    //   333: dup
    //   334: iconst_0
    //   335: iconst_0
    //   336: invokespecial 51	com/google/ads/AdSize:<init>	(II)V
    //   339: aload 4
    //   341: invokespecial 32	com/google/ads/AdView:a	(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V
    //   344: aload_0
    //   345: aload 5
    //   347: invokespecial 56	com/google/ads/AdView:a	([Lcom/google/ads/AdSize;)V
    //   350: goto -103 -> 247
    //   353: new 14	com/google/ads/internal/b
    //   356: dup
    //   357: ldc_w 281
    //   360: iconst_1
    //   361: invokespecial 147	com/google/ads/internal/b:<init>	(Ljava/lang/String;Z)V
    //   364: athrow
    //   365: getstatic 285	com/google/ads/AdSize:BANNER	Lcom/google/ads/AdSize;
    //   368: astore 5
    //   370: goto -277 -> 93
    //   373: astore 4
    //   375: aconst_null
    //   376: astore 5
    //   378: goto -311 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	381	0	this	AdView
    //   0	381	1	paramContext	Context
    //   0	381	2	paramAttributeSet	AttributeSet
    //   190	58	3	bool	boolean
    //   15	38	4	str	String
    //   65	53	4	localb1	com.google.ads.internal.b
    //   177	163	4	localObject1	Object
    //   373	1	4	localb2	com.google.ads.internal.b
    //   23	354	5	localObject2	Object
    //   74	255	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   30	36	65	com/google/ads/internal/b
    //   36	65	65	com/google/ads/internal/b
    //   125	146	65	com/google/ads/internal/b
    //   146	166	65	com/google/ads/internal/b
    //   167	247	65	com/google/ads/internal/b
    //   251	296	65	com/google/ads/internal/b
    //   296	326	65	com/google/ads/internal/b
    //   327	350	65	com/google/ads/internal/b
    //   353	365	65	com/google/ads/internal/b
    //   5	25	373	com/google/ads/internal/b
  }
  
  private void a(Context paramContext, String paramString, AdSize paramAdSize, AttributeSet paramAttributeSet)
  {
    com.google.ads.util.b.b(paramString);
    a(paramContext, paramString, -65536, paramAdSize, paramAttributeSet);
  }
  
  private void a(AdSize... paramVarArgs)
  {
    AdSize[] arrayOfAdSize = new AdSize[paramVarArgs.length];
    int i = 0;
    while (i < paramVarArgs.length)
    {
      arrayOfAdSize[i] = AdSize.createAdSize(paramVarArgs[i], getContext());
      i += 1;
    }
    this.a.j.a(arrayOfAdSize);
  }
  
  private boolean a(Context paramContext, AdSize paramAdSize, AttributeSet paramAttributeSet)
  {
    if (!AdUtil.c(paramContext))
    {
      a(paramContext, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", paramAdSize, paramAttributeSet);
      return false;
    }
    return true;
  }
  
  private boolean a(String paramString, AttributeSet paramAttributeSet)
  {
    return paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString) != null;
  }
  
  private AdSize[] a(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    AdSize[] arrayOfAdSize = new AdSize[arrayOfString.length];
    int i = 0;
    while (i < arrayOfString.length)
    {
      paramString = arrayOfString[i].trim();
      if ("BANNER".equals(paramString)) {
        paramString = AdSize.BANNER;
      }
      while (paramString == null)
      {
        return null;
        if ("SMART_BANNER".equals(paramString)) {
          paramString = AdSize.SMART_BANNER;
        } else if ("IAB_MRECT".equals(paramString)) {
          paramString = AdSize.IAB_MRECT;
        } else if ("IAB_BANNER".equals(paramString)) {
          paramString = AdSize.IAB_BANNER;
        } else if ("IAB_LEADERBOARD".equals(paramString)) {
          paramString = AdSize.IAB_LEADERBOARD;
        } else if ("IAB_WIDE_SKYSCRAPER".equals(paramString)) {
          paramString = AdSize.IAB_WIDE_SKYSCRAPER;
        } else {
          paramString = null;
        }
      }
      arrayOfAdSize[i] = paramString;
      i += 1;
    }
    return arrayOfAdSize;
  }
  
  private Set<String> b(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
    throws com.google.ads.internal.b
  {
    paramContext = a(paramString, paramContext, paramAttributeSet, paramBoolean1, paramBoolean2);
    paramString = new HashSet();
    if (paramContext != null)
    {
      paramContext = paramContext.split(",");
      int j = paramContext.length;
      int i = 0;
      while (i < j)
      {
        paramAttributeSet = paramContext[i].trim();
        if (paramAttributeSet.length() != 0) {
          paramString.add(paramAttributeSet);
        }
        i += 1;
      }
    }
    return paramString;
  }
  
  private boolean b(Context paramContext, AdSize paramAdSize, AttributeSet paramAttributeSet)
  {
    if (!AdUtil.b(paramContext))
    {
      a(paramContext, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", paramAdSize, paramAttributeSet);
      return false;
    }
    return true;
  }
  
  void a(Context paramContext, String paramString, int paramInt, AdSize paramAdSize, AttributeSet paramAttributeSet)
  {
    AdSize localAdSize = paramAdSize;
    if (paramAdSize == null) {
      localAdSize = AdSize.BANNER;
    }
    localAdSize = AdSize.createAdSize(localAdSize, paramContext.getApplicationContext());
    if (getChildCount() == 0)
    {
      if (paramAttributeSet != null) {
        break label174;
      }
      paramAdSize = new TextView(paramContext);
      paramAdSize.setGravity(17);
      paramAdSize.setText(paramString);
      paramAdSize.setTextColor(paramInt);
      paramAdSize.setBackgroundColor(-16777216);
      if (paramAttributeSet != null) {
        break label189;
      }
      paramString = new LinearLayout(paramContext);
      label88:
      paramString.setGravity(17);
      if (paramAttributeSet != null) {
        break label203;
      }
    }
    label174:
    label189:
    label203:
    for (paramAttributeSet = new LinearLayout(paramContext);; paramAttributeSet = new LinearLayout(paramContext, paramAttributeSet))
    {
      paramAttributeSet.setGravity(17);
      paramAttributeSet.setBackgroundColor(paramInt);
      paramInt = a(paramContext, localAdSize.getWidth());
      int i = a(paramContext, localAdSize.getHeight());
      paramString.addView(paramAdSize, paramInt - 2, i - 2);
      paramAttributeSet.addView(paramString);
      addView(paramAttributeSet, paramInt, i);
      return;
      paramAdSize = new TextView(paramContext, paramAttributeSet);
      break;
      paramString = new LinearLayout(paramContext, paramAttributeSet);
      break label88;
    }
  }
  
  public void destroy()
  {
    this.b.b();
  }
  
  public boolean isReady()
  {
    if (this.b == null) {
      return false;
    }
    return this.b.r();
  }
  
  public boolean isRefreshing()
  {
    if (this.b == null) {
      return false;
    }
    return this.b.s();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    if (this.b != null)
    {
      if (isRefreshing()) {
        this.b.e();
      }
      this.b.a(paramAdRequest);
    }
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.a.k.a(paramAdListener);
  }
  
  protected void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.a.l.a(paramAppEventListener);
  }
  
  protected void setSupportedAdSizes(AdSize... paramVarArgs)
  {
    if (this.a.j.a() == null)
    {
      com.google.ads.util.b.b("Error: Tried to set supported ad sizes on a single-size AdView.");
      return;
    }
    a(paramVarArgs);
  }
  
  public void stopLoading()
  {
    if (this.b != null) {
      this.b.A();
    }
  }
}


/* Location:           F:\四个案例的jar\无线网钥匙\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.AdView
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */