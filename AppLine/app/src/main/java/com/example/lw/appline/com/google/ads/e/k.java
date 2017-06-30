package com.example.lw.appline.com.google.ads.e;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class k
{
  private static final Object a = new Object();
  private static int b = 0;
  private static HashMap<Class<?>, Integer> c = new HashMap();
  private final ArrayList<a<?>> d = new ArrayList();
  public final int u;
  
  public k()
  {
    synchronized (a)
    {
      int i = b;
      b = i + 1;
      this.u = i;
      Integer localInteger = (Integer)c.get(getClass());
      if (localInteger == null)
      {
        c.put(getClass(), Integer.valueOf(1));
        d.d("State created: " + toString());
        return;
      }
      c.put(getClass(), Integer.valueOf(localInteger.intValue() + 1));
    }
  }
  
  private void a(a<?> parama)
  {
    this.d.add(parama);
  }
  
  protected void finalize()
    throws Throwable
  {
    synchronized (a)
    {
      c.put(getClass(), Integer.valueOf(((Integer)c.get(getClass())).intValue() - 1));
      super.finalize();
      return;
    }
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "[" + this.u + "]";
  }
  
  public abstract class a<T>
  {
    protected T a;
    protected final String b;
    
    private a(String paramString)
    {
      this(paramString, null);
    }
    
    private a(T paramT)
    {
      this.b = paramT;
      k.a(k.this, this);
      Object localObject;
      this.a = localObject;
    }
    
    public String toString()
    {
      return k.this.toString() + "." + this.b + " = " + this.a;
    }
  }
  
  public final class b<T>
    extends k.a<T>
  {
    public b(T paramT)
    {
      super(paramT, localObject, null);
    }
    
    public T a()
    {
      return this.a;
    }
    
    public String toString()
    {
      return super.toString() + " (!)";
    }
  }
  
  public final class c<T>
    extends k.a<T>
  {
    private boolean e = false;
    
    public c(String paramString)
    {
      super(paramString, null);
    }
    
    public c(T paramT)
    {
      super(paramT, localObject, null);
    }
    
    public T a()
    {
      try
      {
        Object localObject1 = this.a;
        return localObject1;
      }
      finally
      {
        localObject2 = finally;
        throw localObject2;
      }
    }
    
    public void a(T paramT)
    {
      try
      {
        d.d("State changed - " + k.this.toString() + "." + this.b + ": '" + paramT + "' <-- '" + this.a + "'.");
        this.a = paramT;
        this.e = true;
        return;
      }
      finally
      {
        paramT = finally;
        throw paramT;
      }
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder().append(super.toString());
      if (this.e) {}
      for (String str = " (*)";; str = "") {
        return str;
      }
    }
  }
  
  public final class d<T>
    extends k.a<WeakReference<T>>
  {
    public d(T paramT)
    {
      super(paramT, new WeakReference(localObject), null);
    }
    
    public T a()
    {
      return ((WeakReference)this.a).get();
    }
    
    public String toString()
    {
      return k.this.toString() + "." + this.b + " = " + a() + " (?)";
    }
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.e.k
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */