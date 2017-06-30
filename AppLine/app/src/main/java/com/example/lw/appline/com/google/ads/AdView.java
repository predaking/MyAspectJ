package com.example.lw.appline.com.google.ads;

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
import com.google.ads.b.k;
import com.google.ads.b.n;
import com.google.ads.e.h;
import com.google.ads.e.k.b;
import com.google.ads.e.k.c;
import java.util.HashSet;
import java.util.Set;

public class AdView
  extends RelativeLayout
  implements a
{
  private static final com.google.ads.b.d b = (com.google.ads.b.d)com.google.ads.b.d.a.b();
  protected com.google.ads.b.g a;
  
  public AdView(Activity paramActivity, d paramd, String paramString)
  {
    super(paramActivity.getApplicationContext());
    try
    {
      a(paramActivity, paramd, null);
      b(paramActivity, paramd, null);
      a(paramActivity, paramd, paramString);
      return;
    }
    catch (com.google.ads.b.e paramString)
    {
      a(paramActivity, paramString.c("Could not initialize AdView"), paramd, null);
      paramString.a("Could not initialize AdView");
    }
  }
  
  protected AdView(Activity paramActivity, d[] paramArrayOfd, String paramString)
  {
    this(paramActivity, new d(0, 0), paramString);
    a(paramArrayOfd);
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
  
  private void a(Activity paramActivity, d paramd, String paramString)
    throws com.google.ads.b.e
  {
    FrameLayout localFrameLayout = new FrameLayout(paramActivity);
    localFrameLayout.setFocusable(false);
    this.a = new com.google.ads.b.g(this, paramActivity, paramd, paramString, localFrameLayout, false);
    setGravity(17);
    try
    {
      paramActivity = n.a(paramActivity, this.a);
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
      com.google.ads.e.d.a("Gestures disabled: Not supported on this version of Android.", paramActivity);
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
    //   6: ldc 117
    //   8: aload_1
    //   9: aload_2
    //   10: iconst_1
    //   11: invokespecial 120	com/google/ads/AdView:b	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Ljava/lang/String;
    //   14: astore 4
    //   16: aload_0
    //   17: aload 4
    //   19: invokevirtual 123	com/google/ads/AdView:a	(Ljava/lang/String;)[Lcom/google/ads/d;
    //   22: astore 5
    //   24: aload 5
    //   26: ifnull +9 -> 35
    //   29: aload 5
    //   31: arraylength
    //   32: ifne +92 -> 124
    //   35: new 29	com/google/ads/b/e
    //   38: dup
    //   39: new 125	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 127	java/lang/StringBuilder:<init>	()V
    //   46: ldc 129
    //   48: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload 4
    //   53: invokevirtual 133	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   56: invokevirtual 137	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   59: iconst_1
    //   60: invokespecial 140	com/google/ads/b/e:<init>	(Ljava/lang/String;Z)V
    //   63: athrow
    //   64: astore 4
    //   66: aload 4
    //   68: ldc 47
    //   70: invokevirtual 51	com/google/ads/b/e:c	(Ljava/lang/String;)Ljava/lang/String;
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
    //   99: invokespecial 54	com/google/ads/AdView:a	(Landroid/content/Context;Ljava/lang/String;Lcom/google/ads/d;Landroid/util/AttributeSet;)V
    //   102: aload 4
    //   104: ldc 47
    //   106: invokevirtual 57	com/google/ads/b/e:a	(Ljava/lang/String;)V
    //   109: aload_0
    //   110: invokevirtual 144	com/google/ads/AdView:isInEditMode	()Z
    //   113: ifne -109 -> 4
    //   116: aload 4
    //   118: ldc 47
    //   120: invokevirtual 146	com/google/ads/b/e:b	(Ljava/lang/String;)V
    //   123: return
    //   124: aload_0
    //   125: ldc 148
    //   127: aload_2
    //   128: invokespecial 151	com/google/ads/AdView:a	(Ljava/lang/String;Landroid/util/AttributeSet;)Z
    //   131: ifne +14 -> 145
    //   134: new 29	com/google/ads/b/e
    //   137: dup
    //   138: ldc 153
    //   140: iconst_1
    //   141: invokespecial 140	com/google/ads/b/e:<init>	(Ljava/lang/String;Z)V
    //   144: athrow
    //   145: aload_0
    //   146: invokevirtual 144	com/google/ads/AdView:isInEditMode	()Z
    //   149: ifeq +17 -> 166
    //   152: aload_0
    //   153: aload_1
    //   154: ldc 155
    //   156: iconst_m1
    //   157: aload 5
    //   159: iconst_0
    //   160: aaload
    //   161: aload_2
    //   162: invokevirtual 158	com/google/ads/AdView:a	(Landroid/content/Context;Ljava/lang/String;ILcom/google/ads/d;Landroid/util/AttributeSet;)V
    //   165: return
    //   166: aload_0
    //   167: ldc 148
    //   169: aload_1
    //   170: aload_2
    //   171: iconst_1
    //   172: invokespecial 120	com/google/ads/AdView:b	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Ljava/lang/String;
    //   175: astore 4
    //   177: aload_0
    //   178: ldc 160
    //   180: aload_1
    //   181: aload_2
    //   182: iconst_0
    //   183: invokespecial 163	com/google/ads/AdView:a	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Z
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
    //   208: invokespecial 41	com/google/ads/AdView:a	(Landroid/content/Context;Lcom/google/ads/d;Landroid/util/AttributeSet;)Z
    //   211: pop
    //   212: aload_0
    //   213: aload 6
    //   215: aload 5
    //   217: iconst_0
    //   218: aaload
    //   219: aload_2
    //   220: invokespecial 43	com/google/ads/AdView:b	(Landroid/content/Context;Lcom/google/ads/d;Landroid/util/AttributeSet;)Z
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
    //   240: invokespecial 45	com/google/ads/AdView:a	(Landroid/app/Activity;Lcom/google/ads/d;Ljava/lang/String;)V
    //   243: iload_3
    //   244: ifeq -240 -> 4
    //   247: aload_0
    //   248: ldc 165
    //   250: aload_1
    //   251: aload_2
    //   252: iconst_0
    //   253: invokespecial 168	com/google/ads/AdView:c	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Ljava/util/Set;
    //   256: astore 4
    //   258: aload 4
    //   260: ldc 170
    //   262: invokeinterface 176 2 0
    //   267: ifeq +24 -> 291
    //   270: aload 4
    //   272: ldc 170
    //   274: invokeinterface 179 2 0
    //   279: pop
    //   280: aload 4
    //   282: getstatic 184	com/google/ads/c:a	Ljava/lang/String;
    //   285: invokeinterface 187 2 0
    //   290: pop
    //   291: aload_0
    //   292: new 181	com/google/ads/c
    //   295: dup
    //   296: invokespecial 188	com/google/ads/c:<init>	()V
    //   299: aload 4
    //   301: invokevirtual 191	com/google/ads/c:b	(Ljava/util/Set;)Lcom/google/ads/c;
    //   304: aload_0
    //   305: ldc 193
    //   307: aload_1
    //   308: aload_2
    //   309: iconst_0
    //   310: invokespecial 168	com/google/ads/AdView:c	(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;Z)Ljava/util/Set;
    //   313: invokevirtual 195	com/google/ads/c:a	(Ljava/util/Set;)Lcom/google/ads/c;
    //   316: invokevirtual 198	com/google/ads/AdView:a	(Lcom/google/ads/c;)V
    //   319: return
    //   320: aload_0
    //   321: aload 6
    //   323: new 60	com/google/ads/d
    //   326: dup
    //   327: iconst_0
    //   328: iconst_0
    //   329: invokespecial 63	com/google/ads/d:<init>	(II)V
    //   332: aload 4
    //   334: invokespecial 45	com/google/ads/AdView:a	(Landroid/app/Activity;Lcom/google/ads/d;Ljava/lang/String;)V
    //   337: aload_0
    //   338: aload 5
    //   340: invokespecial 68	com/google/ads/AdView:a	([Lcom/google/ads/d;)V
    //   343: goto -100 -> 243
    //   346: new 29	com/google/ads/b/e
    //   349: dup
    //   350: ldc 200
    //   352: iconst_1
    //   353: invokespecial 140	com/google/ads/b/e:<init>	(Ljava/lang/String;Z)V
    //   356: athrow
    //   357: getstatic 203	com/google/ads/d:b	Lcom/google/ads/d;
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
    //   64	53	4	locale1	com.google.ads.b.e
    //   175	158	4	localObject1	Object
    //   365	1	4	locale2	com.google.ads.b.e
    //   22	347	5	localObject2	Object
    //   73	249	6	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   29	35	64	com/google/ads/b/e
    //   35	64	64	com/google/ads/b/e
    //   124	145	64	com/google/ads/b/e
    //   145	165	64	com/google/ads/b/e
    //   166	243	64	com/google/ads/b/e
    //   247	291	64	com/google/ads/b/e
    //   291	319	64	com/google/ads/b/e
    //   320	343	64	com/google/ads/b/e
    //   346	357	64	com/google/ads/b/e
    //   5	24	365	com/google/ads/b/e
  }
  
  private void a(Context paramContext, String paramString, d paramd, AttributeSet paramAttributeSet)
  {
    com.google.ads.e.d.b(paramString);
    a(paramContext, paramString, -65536, paramd, paramAttributeSet);
  }
  
  private void a(d... paramVarArgs)
  {
    d[] arrayOfd = new d[paramVarArgs.length];
    int i = 0;
    while (i < paramVarArgs.length)
    {
      arrayOfd[i] = d.a(paramVarArgs[i], getContext());
      i += 1;
    }
    this.a.i().n.a(arrayOfd);
  }
  
  private boolean a(Context paramContext, d paramd, AttributeSet paramAttributeSet)
  {
    if (!com.google.ads.e.a.c(paramContext))
    {
      a(paramContext, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", paramd, paramAttributeSet);
      return false;
    }
    return true;
  }
  
  private boolean a(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
    throws com.google.ads.b.e
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
            break label198;
          }
          if (localTypedValue.data != 0) {
            return true;
          }
        }
        catch (NotFoundException paramAttributeSet)
        {
          throw new com.google.ads.b.e("Could not find resource for " + paramString + ": " + paramContext, true, paramAttributeSet);
        }
        return false;
        label198:
        throw new com.google.ads.b.e("Resource " + paramString + " was not a boolean: " + localTypedValue, true);
      }
    }
    return paramBoolean;
  }
  
  private boolean a(String paramString, AttributeSet paramAttributeSet)
  {
    return paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", paramString) != null;
  }
  
  private String b(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
    throws com.google.ads.b.e
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
        throw new com.google.ads.b.e("Required XML attribute \"" + paramString + "\" missing", true);
      }
    }
    catch (NotFoundException paramAttributeSet)
    {
      throw new com.google.ads.b.e("Could not find resource for " + paramString + ": " + paramContext, true, paramAttributeSet);
    }
    throw new com.google.ads.b.e("Resource " + paramString + " was not a string: " + localObject, true);
    return paramAttributeSet;
  }
  
  private boolean b(Context paramContext, d paramd, AttributeSet paramAttributeSet)
  {
    if (!com.google.ads.e.a.b(paramContext))
    {
      a(paramContext, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", paramd, paramAttributeSet);
      return false;
    }
    return true;
  }
  
  private Set<String> c(String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean)
    throws com.google.ads.b.e
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
  
  public void a()
  {
    this.a.b();
  }
  
  void a(Context paramContext, String paramString, int paramInt, d paramd, AttributeSet paramAttributeSet)
  {
    d locald = paramd;
    if (paramd == null) {
      locald = d.b;
    }
    locald = d.a(locald, paramContext.getApplicationContext());
    if (getChildCount() == 0)
    {
      if (paramAttributeSet != null) {
        break label172;
      }
      paramd = new TextView(paramContext);
      paramd.setGravity(17);
      paramd.setText(paramString);
      paramd.setTextColor(paramInt);
      paramd.setBackgroundColor(-16777216);
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
      paramInt = com.google.ads.e.a.a(paramContext, locald.a());
      int i = com.google.ads.e.a.a(paramContext, locald.b());
      paramString.addView(paramd, paramInt - 2, i - 2);
      paramAttributeSet.addView(paramString);
      addView(paramAttributeSet, paramInt, i);
      return;
      paramd = new TextView(paramContext, paramAttributeSet);
      break;
      paramString = new LinearLayout(paramContext, paramAttributeSet);
      break label88;
    }
  }
  
  public void a(c paramc)
  {
    if (this.a != null)
    {
      if (b()) {
        this.a.f();
      }
      this.a.a(paramc);
    }
  }
  
  d[] a(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    d[] arrayOfd = new d[arrayOfString.length];
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
          paramString = new d(j, k);
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
            paramString = d.b;
          } else if ("SMART_BANNER".equals(paramString)) {
            paramString = d.a;
          } else if ("IAB_MRECT".equals(paramString)) {
            paramString = d.c;
          } else if ("IAB_BANNER".equals(paramString)) {
            paramString = d.d;
          } else if ("IAB_LEADERBOARD".equals(paramString)) {
            paramString = d.e;
          } else if ("IAB_WIDE_SKYSCRAPER".equals(paramString)) {
            paramString = d.f;
          } else {
            paramString = null;
          }
        }
        label249:
        arrayOfd[i] = paramString;
        i += 1;
      }
      catch (NumberFormatException paramString) {}
    }
    return arrayOfd;
    return null;
  }
  
  public boolean b()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.s();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!isInEditMode())
    {
      com.google.ads.b.c localc = this.a.l();
      if (localc != null) {
        localc.setVisibility(0);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    if (isInEditMode()) {}
    while ((!((k)this.a.i().g.a()).b()) || (paramInt == 0) || (this.a.i().l.a() == null) || (this.a.i().e.a() == null)) {
      return;
    }
    if ((AdActivity.b()) && (!AdActivity.c()))
    {
      b.a((WebView)this.a.i().e.a(), "onopeninapp", null);
      return;
    }
    b.a((WebView)this.a.i().e.a(), "onleaveapp", null);
  }
  
  public void setAdListener(b paramb)
  {
    this.a.i().o.a(paramb);
  }
  
  protected void setAppEventListener(e parame)
  {
    this.a.i().p.a(parame);
  }
  
  protected void setSupportedAdSizes(d... paramVarArgs)
  {
    if (this.a.i().n.a() == null)
    {
      com.google.ads.e.d.e("Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.");
      return;
    }
    a(paramVarArgs);
  }
  
  protected void setSwipeableEventListener(g paramg)
  {
    this.a.i().q.a(paramg);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.AdView
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */