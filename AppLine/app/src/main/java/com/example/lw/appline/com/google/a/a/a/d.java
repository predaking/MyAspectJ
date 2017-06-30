package com.example.lw.appline.com.google.a.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.analytics.internal.Command;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.a.a;
import java.util.List;
import java.util.Map;

class d
  implements c
{
  private ServiceConnection a;
  private b b;
  private c c;
  private Context d;
  private a e;
  
  public d(Context paramContext, b paramb, c paramc)
  {
    this.d = paramContext;
    if (paramb == null) {
      throw new IllegalArgumentException("onConnectedListener cannot be null");
    }
    this.b = paramb;
    if (paramc == null) {
      throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
    }
    this.c = paramc;
  }
  
  private a f()
  {
    d();
    return this.e;
  }
  
  private void g()
  {
    h();
  }
  
  private void h()
  {
    this.b.a();
  }
  
  public void a()
  {
    try
    {
      f().a();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      w.c("clear hits failed: " + localRemoteException);
    }
  }
  
  public void a(Map<String, String> paramMap, long paramLong, String paramString, List<Command> paramList)
  {
    try
    {
      f().a(paramMap, paramLong, paramString, paramList);
      return;
    }
    catch (RemoteException paramMap)
    {
      w.c("sendHit failed: " + paramMap);
    }
  }
  
  public void b()
  {
    Intent localIntent = new Intent("com.google.android.gms.analytics.service.START");
    localIntent.putExtra("app_package_name", this.d.getPackageName());
    if (this.a != null) {
      w.c("Calling connect() while still connected, missing disconnect().");
    }
    boolean bool;
    do
    {
      return;
      this.a = new a();
      bool = this.d.bindService(localIntent, this.a, 129);
      w.e("connect: bindService returned " + bool + " for " + localIntent);
    } while (bool);
    this.a = null;
    this.c.a(1, null);
  }
  
  public void c()
  {
    this.e = null;
    if (this.a != null) {}
    try
    {
      this.d.unbindService(this.a);
      label23:
      this.a = null;
      this.b.b();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label23;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label23;
    }
  }
  
  protected void d()
  {
    if (!e()) {
      throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
  }
  
  public boolean e()
  {
    return this.e != null;
  }
  
  final class a
    implements ServiceConnection
  {
    a() {}
    
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      w.b("service connected, binder: " + paramIBinder);
      try
      {
        if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(paramIBinder.getInterfaceDescriptor()))
        {
          w.b("bound to service");
          d.a(d.this, a.a.a(paramIBinder));
          d.a(d.this);
          return;
        }
      }
      catch (RemoteException paramComponentName)
      {
        d.b(d.this).unbindService(this);
        d.a(d.this, null);
        d.c(d.this).a(2, null);
      }
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName)
    {
      w.b("service disconnected: " + paramComponentName);
      d.a(d.this, null);
      d.d(d.this).b();
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract void b();
  }
  
  public static abstract interface c
  {
    public abstract void a(int paramInt, Intent paramIntent);
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.d
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */