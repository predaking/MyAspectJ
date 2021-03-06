package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.internal.AdWebView;
import com.google.ads.internal.a;
import com.google.ads.internal.d;
import com.google.ads.internal.h;
import com.google.ads.internal.k;
import com.google.ads.util.AdUtil;
import com.google.ads.util.f;
import com.google.ads.util.i.b;
import com.google.ads.util.i.c;
import java.util.HashSet;
import java.util.Set;

public class AdView
  extends RelativeLayout
  implements Ad
{
  private static final a b = (a)a.a.b();
  protected d a;
  
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
  
  private void a(Activity paramActivity, AdSize paramAdSize, String paramString)
    throws com.google.ads.internal.b
  {
    FrameLayout localFrameLayout = new FrameLayout(paramActivity);
    localFrameLayout.setFocusable(false);
    this.a = new d(this, paramActivity, paramAdSize, paramString, localFrameLayout, false);
    setGravity(17);
    try
    {
      paramActivity = k.a(paramActivity, this.a);
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
    //   6: ldc 119
    //   8: aload_1
    //   9: aload_2
    //   10: iconst_1
    //   11: invokespecial 122	com/google/ads/AdView:b	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Ljava/lang/String;
    //   14: astore 4
    //   16: aload_0
    //   17: aload 4
    //   19: invokevirtual 125	com/google/ads/AdView:a	(Ljava/lang/String;)[Lcom/google/ads/AdSize;
    //   22: astore 5
    //   24: aload 5
    //   26: ifnull +9 -> 35
    //   29: aload 5
    //   31: arraylength
    //   32: ifne +92 -> 124
    //   35: new 29	com/google/ads/internal/b
    //   38: dup
    //   39: new 127	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   46: ldc 131
    //   48: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload 4
    //   53: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: iconst_1
    //   60: invokespecial 142	com/google/ads/internal/b:<init>	(Ljava/lang/String;Z)V
    //   63: athrow
    //   64: astore 4
    //   66: aload 4
    //   68: ldc 49
    //   70: invokevirtual 53	com/google/ads/internal/b:c	(Ljava/lang/String;)Ljava/lang/String;
    //   73: astore 6
    //   75: aload 5
    //   77: ifnull +280 -> 357
    //   80: aload 5
    //   82: arraylength
    //   83: ifle +274 -> 357
    //   86: aload 5
    //   88: iconst_0
    //   89: aaload
    //   90: astore 5
    //   92: aload_0
    //   93: aload_1
    //   94: aload 6
    //   96: aload 5
    //   98: aload_2
    //   99: invokespecial 56	com/google/ads/AdView:a	(Landroid/content/Context;Ljava/lang/String;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)V
    //   102: aload 4
    //   104: ldc 49
    //   106: invokevirtual 59	com/google/ads/internal/b:a	(Ljava/lang/String;)V
    //   109: aload_0
    //   110: invokevirtual 146	com/google/ads/AdView:isInEditMode	()Z
    //   113: ifne -109 -> 4
    //   116: aload 4
    //   118: ldc 49
    //   120: invokevirtual 148	com/google/ads/internal/b:b	(Ljava/lang/String;)V
    //   123: return
    //   124: aload_0
    //   125: ldc 150
    //   127: aload_2
    //   128: invokespecial 153	com/google/ads/AdView:a	(Ljava/lang/String;Landroid/util/AttributeSet;)Z
    //   131: ifne +14 -> 145
    //   134: new 29	com/google/ads/internal/b
    //   137: dup
    //   138: ldc 155
    //   140: iconst_1
    //   141: invokespecial 142	com/google/ads/internal/b:<init>	(Ljava/lang/String;Z)V
    //   144: athrow
    //   145: aload_0
    //   146: invokevirtual 146	com/google/ads/AdView:isInEditMode	()Z
    //   149: ifeq +17 -> 166
    //   152: aload_0
    //   153: aload_1
    //   154: ldc 157
    //   156: iconst_m1
    //   157: aload 5
    //   159: iconst_0
    //   160: aaload
    //   161: aload_2
    //   162: invokevirtual 160	com/google/ads/AdView:a	(Landroid/content/Context;Ljava/lang/String;ILcom/google/ads/AdSize;Landroid/util/AttributeSet;)V
    //   165: return
    //   166: aload_0
    //   167: ldc 150
    //   169: aload_1
    //   170: aload_2
    //   171: iconst_1
    //   172: invokespecial 122	com/google/ads/AdView:b	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Ljava/lang/String;
    //   175: astore 4
    //   177: aload_0
    //   178: ldc 162
    //   180: aload_1
    //   181: aload_2
    //   182: iconst_0
    //   183: invokespecial 165	com/google/ads/AdView:a	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Z
    //   186: istore_3
    //   187: aload_1
    //   188: instanceof 31
    //   191: ifeq +155 -> 346
    //   194: aload_1
    //   195: checkcast 31	android/app/Activity
    //   198: astore 6
    //   200: aload_0
    //   201: aload 6
    //   203: aload 5
    //   205: iconst_0
    //   206: aaload
    //   207: aload_2
    //   208: invokespecial 41	com/google/ads/AdView:a	(Landroid/content/Context;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)Z
    //   211: pop
    //   212: aload_0
    //   213: aload 6
    //   215: aload 5
    //   217: iconst_0
    //   218: aaload
    //   219: aload_2
    //   220: invokespecial 43	com/google/ads/AdView:b	(Landroid/content/Context;Lcom/google/ads/AdSize;Landroid/util/AttributeSet;)Z
    //   223: pop
    //   224: aload 5
    //   226: arraylength
    //   227: iconst_1
    //   228: if_icmpne +92 -> 320
    //   231: aload_0
    //   232: aload 6
    //   234: aload 5
    //   236: iconst_0
    //   237: aaload
    //   238: aload 4
    //   240: invokespecial 47	com/google/ads/AdView:a	(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V
    //   243: iload_3
    //   244: ifeq -240 -> 4
    //   247: aload_0
    //   248: ldc 167
    //   250: aload_1
    //   251: aload_2
    //   252: iconst_0
    //   253: invokespecial 170	com/google/ads/AdView:c	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Ljava/util/Set;
    //   256: astore 4
    //   258: aload 4
    //   260: ldc 172
    //   262: invokeinterface 178 2 0
    //   267: ifeq +24 -> 291
    //   270: aload 4
    //   272: ldc 172
    //   274: invokeinterface 181 2 0
    //   279: pop
    //   280: aload 4
    //   282: getstatic 186	com/google/ads/AdRequest:TEST_EMULATOR	Ljava/lang/String;
    //   285: invokeinterface 189 2 0
    //   290: pop
    //   291: aload_0
    //   292: new 183	com/google/ads/AdRequest
    //   295: dup
    //   296: invokespecial 190	com/google/ads/AdRequest:<init>	()V
    //   299: aload 4
    //   301: invokevirtual 194	com/google/ads/AdRequest:setTestDevices	(Ljava/util/Set;)Lcom/google/ads/AdRequest;
    //   304: aload_0
    //   305: ldc 196
    //   307: aload_1
    //   308: aload_2
    //   309: iconst_0
    //   310: invokespecial 170	com/google/ads/AdView:c	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Ljava/util/Set;
    //   313: invokevirtual 199	com/google/ads/AdRequest:setKeywords	(Ljava/util/Set;)Lcom/google/ads/AdRequest;
    //   316: invokevirtual 203	com/google/ads/AdView:loadAd	(Lcom/google/ads/AdRequest;)V
    //   319: return
    //   320: aload_0
    //   321: aload 6
    //   323: new 62	com/google/ads/AdSize
    //   326: dup
    //   327: iconst_0
    //   328: iconst_0
    //   329: invokespecial 65	com/google/ads/AdSize:<init>	(II)V
    //   332: aload 4
    //   334: invokespecial 47	com/google/ads/AdView:a	(Landroid/app/Activity;Lcom/google/ads/AdSize;Ljava/lang/String;)V
    //   337: aload_0
    //   338: aload 5
    //   340: invokespecial 70	com/google/ads/AdView:a	([Lcom/google/ads/AdSize;)V
    //   343: goto -100 -> 243
    //   346: new 29	com/google/ads/internal/b
    //   349: dup
    //   350: ldc 205
    //   352: iconst_1
    //   353: invokespecial 142	com/google/ads/internal/b:<init>	(Ljava/lang/String;Z)V
    //   356: athrow
    //   357: getstatic 209	com/google/ads/AdSize:BANNER	Lcom/google/ads/AdSize;
    //   360: astore 5
    //   362: goto -270 -> 92
    //   365: astore 4
    //   367: aconst_null
    //   368: astore 5
    //   370: goto -304 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	373	0	this	AdView
    //   0	373	1	paramContext	Context
    //   0	373	2	paramAttributeSet	AttributeSet
    //   186	58	3	bool	boolean
    //   14	38	4	str	String
    //   64	53	4	localb1	com.google.ads.internal.b
    //   175	158	4	localObject1	Object
    //   365	1	4	localb2	com.google.ads.internal.b
    //   22	347	5	localObject2	Object
    //   73	249	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   29	35	64	com/google/ads/internal/b
    //   35	64	64	com/google/ads/internal/b
    //   124	145	64	com/google/ads/internal/b
    //   145	165	64	com/google/ads/internal/b
    //   166	243	64	com/google/ads/internal/b
    //   247	291	64	com/google/ads/internal/b
    //   291	319	64	com/google/ads/internal/b
    //   320	343	64	com/google/ads/internal/b
    //   346	357	64	com/google/ads/internal/b
    //   5	24	365	com/google/ads/internal/b
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
    this.a.i().n.a(arrayOfAdSize);
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
  
  private boolean a(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
    throws com.google.ads.internal.b
  {
    String str = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString);
    paramBoolean = paramAttributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.google.ads", paramString, paramBoolean);
    if (str != null)
    {
      paramAttributeSet = paramContext.getPackageName();
      paramContext = str;
      if (str.matches("^@([^:]+)\\:(.*)$"))
      {
        paramAttributeSet = str.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
        paramContext = str.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
      }
      if (paramContext.startsWith("@bool/"))
      {
        str = paramContext.substring("@bool/".length());
        TypedValue localTypedValue = new TypedValue();
        try
        {
          getResources().getValue(paramAttributeSet + ":bool/" + str, localTypedValue, true);
          if (localTypedValue.type != 18) {
            break label201;
          }
          if (localTypedValue.data != 0) {
            return true;
          }
        }
        catch (Resources.NotFoundException paramAttributeSet)
        {
          throw new com.google.ads.internal.b("Could not find resource for " + paramString + ": " + paramContext, true, paramAttributeSet);
        }
        return false;
        label201:
        throw new com.google.ads.internal.b("Resource " + paramString + " was not a boolean: " + localTypedValue, true);
      }
    }
    return paramBoolean;
  }
  
  private boolean a(String paramString, AttributeSet paramAttributeSet)
  {
    return paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString) != null;
  }
  
  private String b(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
    throws com.google.ads.internal.b
  {
    Object localObject = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString);
    paramAttributeSet = (AttributeSet)localObject;
    String str;
    if (localObject != null)
    {
      str = paramContext.getPackageName();
      paramContext = (Context)localObject;
      if (((String)localObject).matches("^@([^:]+)\\:(.*)$"))
      {
        str = ((String)localObject).replaceFirst("^@([^:]+)\\:(.*)$", "$1");
        paramContext = ((String)localObject).replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
      }
      paramAttributeSet = paramContext;
      if (paramContext.startsWith("@string/"))
      {
        paramAttributeSet = paramContext.substring("@string/".length());
        localObject = new TypedValue();
      }
    }
    try
    {
      getResources().getValue(str + ":string/" + paramAttributeSet, (TypedValue)localObject, true);
      if (((TypedValue)localObject).string != null)
      {
        paramAttributeSet = ((TypedValue)localObject).string.toString();
        if ((!paramBoolean) || (paramAttributeSet != null)) {
          return paramAttributeSet;
        }
        throw new com.google.ads.internal.b("Required XML attribute \"" + paramString + "\" missing", true);
      }
    }
    catch (Resources.NotFoundException paramAttributeSet)
    {
      throw new com.google.ads.internal.b("Could not find resource for " + paramString + ": " + paramContext, true, paramAttributeSet);
    }
    throw new com.google.ads.internal.b("Resource " + paramString + " was not a string: " + localObject, true);
    return paramAttributeSet;
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
  
  private Set<String> c(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
    throws com.google.ads.internal.b
  {
    paramContext = b(paramString, paramContext, paramAttributeSet, paramBoolean);
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
        break label172;
      }
      paramAdSize = new TextView(paramContext);
      paramAdSize.setGravity(17);
      paramAdSize.setText(paramString);
      paramAdSize.setTextColor(paramInt);
      paramAdSize.setBackgroundColor(-16777216);
      if (paramAttributeSet != null) {
        break label187;
      }
      paramString = new LinearLayout(paramContext);
      label88:
      paramString.setGravity(17);
      if (paramAttributeSet != null) {
        break label201;
      }
    }
    label172:
    label187:
    label201:
    for (paramAttributeSet = new LinearLayout(paramContext);; paramAttributeSet = new LinearLayout(paramContext, paramAttributeSet))
    {
      paramAttributeSet.setGravity(17);
      paramAttributeSet.setBackgroundColor(paramInt);
      paramInt = AdUtil.a(paramContext, localAdSize.getWidth());
      int i = AdUtil.a(paramContext, localAdSize.getHeight());
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
  
  AdSize[] a(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    AdSize[] arrayOfAdSize = new AdSize[arrayOfString.length];
    int i = 0;
    for (;;)
    {
      if (i < arrayOfString.length)
      {
        paramString = arrayOfString[i].trim();
        if (paramString.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
        {
          paramString = paramString.split("[xX]");
          paramString[0] = paramString[0].trim();
          paramString[1] = paramString[1].trim();
        }
      }
      try
      {
        int j;
        int k;
        if ("FULL_WIDTH".equals(paramString[0]))
        {
          j = -1;
          boolean bool = "AUTO_HEIGHT".equals(paramString[1]);
          if (!bool) {
            break label131;
          }
          k = -2;
          label104:
          paramString = new AdSize(j, k);
        }
        for (;;)
        {
          if (paramString != null) {
            break label249;
          }
          return null;
          j = Integer.parseInt(paramString[0]);
          break;
          label131:
          k = Integer.parseInt(paramString[1]);
          break label104;
          if ("BANNER".equals(paramString)) {
            paramString = AdSize.BANNER;
          } else if ("SMART_BANNER".equals(paramString)) {
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
        label249:
        arrayOfAdSize[i] = paramString;
        i += 1;
      }
      catch (NumberFormatException paramString) {}
    }
    return arrayOfAdSize;
    return null;
  }
  
  public void destroy()
  {
    this.a.b();
  }
  
  public boolean isReady()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.s();
  }
  
  public boolean isRefreshing()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.t();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    if (this.a != null)
    {
      if (isRefreshing()) {
        this.a.f();
      }
      this.a.a(paramAdRequest);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!isInEditMode())
    {
      AdWebView localAdWebView = this.a.l();
      if (localAdWebView != null) {
        localAdWebView.setVisibility(0);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    if (isInEditMode()) {}
    while ((!((h)this.a.i().g.a()).b()) || (paramInt == 0) || (this.a.i().l.a() == null) || (this.a.i().e.a() == null)) {
      return;
    }
    if ((AdActivity.isShowing()) && (!AdActivity.leftApplication()))
    {
      b.a((WebView)this.a.i().e.a(), "onopeninapp", null);
      return;
    }
    b.a((WebView)this.a.i().e.a(), "onleaveapp", null);
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.a.i().o.a(paramAdListener);
  }
  
  protected void setAppEventListener(AppEventListener paramAppEventListener)
  {
    this.a.i().p.a(paramAppEventListener);
  }
  
  protected void setSupportedAdSizes(AdSize... paramVarArgs)
  {
    if (this.a.i().n.a() == null)
    {
      com.google.ads.util.b.e("Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.");
      return;
    }
    a(paramVarArgs);
  }
  
  protected void setSwipeableEventListener(SwipeableAdListener paramSwipeableAdListener)
  {
    this.a.i().q.a(paramSwipeableAdListener);
  }
  
  public void stopLoading()
  {
    if (this.a != null) {
      this.a.C();
    }
  }
}


/* Location:           F:\四个案例的jar\格斗游戏盒子\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.AdView
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */