package com.example.lw.appline.com.google.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.e.h;
import java.lang.ref.WeakReference;
import java.util.Date;

public final class aa
{
  private static final com.google.ads.b.d a = (com.google.ads.b.d)com.google.ads.b.d.a.b();
  
  public static void a(Activity paramActivity)
  {
    new Thread(new a(paramActivity)).start();
  }
  
  public static boolean a(Context paramContext, long paramLong)
  {
    if (!a(paramContext, paramLong, PreferenceManager.getDefaultSharedPreferences(paramContext.getApplicationContext()))) {
      return false;
    }
    (new Runnable()
    {
      public void run()
      {
        Editor localEditor = PreferenceManager.getDefaultSharedPreferences(this.a.getApplicationContext()).edit();
        localEditor.putString("drt", "");
        localEditor.putLong("drt_ts", 0L);
        localEditor.commit();
      }
    }).start();
    return true;
  }
  
  static boolean a(Context paramContext, long paramLong, SharedPreferences paramSharedPreferences)
  {
    return (!paramSharedPreferences.contains("drt")) || (!paramSharedPreferences.contains("drt_ts")) || (paramSharedPreferences.getLong("drt_ts", 0L) < new Date().getTime() - paramLong);
  }
  
  private static class a
    implements Runnable
  {
    private final WeakReference<Activity> a;
    private final Editor b;
    
    public a(Activity paramActivity)
    {
      this(paramActivity, null);
    }
    
    a(Activity paramActivity, Editor paramEditor)
    {
      this.a = new WeakReference(paramActivity);
      this.b = paramEditor;
    }
    
    private Editor a(Context paramContext)
    {
      if (this.b == null) {
        return PreferenceManager.getDefaultSharedPreferences(paramContext.getApplicationContext()).edit();
      }
      return this.b;
    }
    
    public void run()
    {
      for (;;)
      {
        Object localObject3;
        try
        {
          localObject3 = (Activity)this.a.get();
          if (localObject3 == null)
          {
            com.google.ads.e.d.a("Activity was null while making a doritos cookie request.");
            return;
          }
          Object localObject1 = ((Activity)localObject3).getContentResolver().query(z.a, z.b, null, null, null);
          if ((localObject1 != null) && (((Cursor)localObject1).moveToFirst()) && (((Cursor)localObject1).getColumnNames().length > 0))
          {
            localObject1 = ((Cursor)localObject1).getString(((Cursor)localObject1).getColumnIndex(((Cursor)localObject1).getColumnName(0)));
            localObject3 = a((Context)localObject3);
            if (TextUtils.isEmpty((CharSequence)localObject1)) {
              break label149;
            }
            ((Editor)localObject3).putString("drt", (String)localObject1);
            ((Editor)localObject3).putLong("drt_ts", new Date().getTime());
            ((Editor)localObject3).commit();
            return;
          }
        }
        catch (Throwable localThrowable)
        {
          com.google.ads.e.d.d("An unknown error occurred while sending a doritos request.", localThrowable);
          return;
        }
        com.google.ads.e.d.a("Google+ app not installed, not storing doritos cookie");
        Object localObject2 = null;
        continue;
        label149:
        ((Editor)localObject3).putString("drt", "");
        ((Editor)localObject3).putLong("drt_ts", 0L);
      }
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.aa
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */