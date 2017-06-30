package com.example.lw.appline.com.google.ads.c;

import com.google.ads.e.d;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class g
{
  protected void a() {}
  
  public void a(Map<String, String> paramMap)
    throws a
  {
    Object localObject1 = new HashMap();
    Object localObject2 = getClass().getFields();
    int j = localObject2.length;
    int i = 0;
    Object localObject3;
    while (i < j)
    {
      localObject3 = localObject2[i];
      b localb = (b)((Field)localObject3).getAnnotation(b.class);
      if (localb != null) {
        ((Map)localObject1).put(localb.a(), localObject3);
      }
      i += 1;
    }
    if (((Map)localObject1).isEmpty()) {
      d.e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject2 = (Entry)paramMap.next();
      localObject3 = (Field)((Map)localObject1).remove(((Entry)localObject2).getKey());
      if (localObject3 != null) {
        try
        {
          ((Field)localObject3).set(this, ((Entry)localObject2).getValue());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          d.b("Server Option '" + (String)((Entry)localObject2).getKey() + "' could not be set: Illegal Access");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          d.b("Server Option '" + (String)((Entry)localObject2).getKey() + "' could not be set: Bad Type");
        }
      } else {
        d.e("Unexpected Server Option: " + (String)((Entry)localObject2).getKey() + " = '" + (String)((Entry)localObject2).getValue() + "'");
      }
    }
    paramMap = null;
    localObject1 = ((Map)localObject1).values().iterator();
    if (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Field)((Iterator)localObject1).next();
      if (!((b)((Field)localObject2).getAnnotation(b.class)).b()) {
        break label500;
      }
      d.b("Required Server Option missing: " + ((b)((Field)localObject2).getAnnotation(b.class)).a());
      StringBuilder localStringBuilder = new StringBuilder();
      if (paramMap == null)
      {
        paramMap = "";
        label410:
        paramMap = paramMap + ((b)((Field)localObject2).getAnnotation(b.class)).a();
      }
    }
    label500:
    for (;;)
    {
      break;
      paramMap = paramMap + ", ";
      break label410;
      if (paramMap != null) {
        throw new a("Required Server Option(s) missing: " + paramMap);
      }
      a();
      return;
    }
  }
  
  public static class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
  
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.FIELD})
  protected static @interface b
  {
    String a();
    
    boolean b() default true;
  }
}


/* Location:           F:\四个案例的jar\line98棋牌游戏\classes-dex2jar.jar
 * Qualified Name:     com.google.ads.c.g
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */