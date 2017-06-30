package com.example.lw.appline.com.google.a.a.a;

import java.util.SortedSet;
import java.util.TreeSet;

class r
{
  private static final r d = new r();
  private SortedSet<a> a = new TreeSet();
  private StringBuilder b = new StringBuilder();
  private boolean c = false;
  
  public static r a()
  {
    return d;
  }
  
  public void a(a parama)
  {
    try
    {
      if (!this.c)
      {
        this.a.add(parama);
        this.b.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(parama.ordinal()));
      }
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    try
    {
      this.c = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public String b()
  {
    try
    {
      Object localObject1 = new StringBuilder();
      int j = 6;
      int i = 0;
      while (this.a.size() > 0)
      {
        a locala = (a)this.a.first();
        this.a.remove(locala);
        int k = locala.ordinal();
        while (k >= j)
        {
          ((StringBuilder)localObject1).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i));
          j += 6;
          i = 0;
        }
        i += (1 << locala.ordinal() % 6);
      }
      if ((i > 0) || (((StringBuilder)localObject1).length() == 0)) {
        ((StringBuilder)localObject1).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(i));
      }
      this.a.clear();
      localObject1 = ((StringBuilder)localObject1).toString();
      return localObject1;
    }
    finally {}
  }
  
  public String c()
  {
    try
    {
      if (this.b.length() > 0) {
        this.b.insert(0, ".");
      }
      String str = this.b.toString();
      this.b = new StringBuilder();
      return str;
    }
    finally {}
  }
  
  public static enum a
  {
    private a() {}
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.a.a.a.r
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */