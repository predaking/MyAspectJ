package net.micode.fileexplorer;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lw on 2017/5/21.
 */
//public class Aspectj{
//
//}
@Aspect
public class Aspectj {
    List<String> str_class=new ArrayList<>();
    List<String> str_name=new ArrayList<>();
    @Before("execution(* net.micode.fileexplorer..*.* (..))")
    public void onbefore(JoinPoint joinPoint) throws Throwable{
        int i=str_name.size();
        if(i==0){
            //str_class.add("MainActivity");
            str_name.add("main");
            i++;
        }
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
//        String name=signature.getName();
        String name=signature.toString();
        //String classname=joinPoint.getThis().getClass().getSimpleName();
        //str_class.add(classname);
        str_name.add(name);
        i++;
        Log.d("ASPECTJ",str_name.get(i-2)+"->"+str_name.get(i-1));
       // Log.d("ASPECTJ",str_class.get(i-2)+"."+str_name.get(i-2)+"->"+str_class.get(i-1)+"."+str_name.get(i-1));
    }
    @After("execution(* net.micode.fileexplorer..*.* (..))")
    public void onafter(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        //str_class.remove(i-1);
        str_name.remove(i-1);
    }
    @Before("execution(* org.swiftp..*.* (..))")
    public void inbefore(JoinPoint joinPoint) throws Throwable{
        int i=str_name.size();
        if(i==0){
            //str_class.add("MainActivity");
            str_name.add("main");
            i++;
        }
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
//        String name=signature.getName();
        String name=signature.toString();
        //String classname=joinPoint.getThis().getClass().getSimpleName();
        //str_class.add(classname);
        str_name.add(name);
        i++;
        Log.d("ASPECTJ",str_name.get(i-2)+"->"+str_name.get(i-1));
        // Log.d("ASPECTJ",str_class.get(i-2)+"."+str_name.get(i-2)+"->"+str_class.get(i-1)+"."+str_name.get(i-1));
    }
    @After("execution(* org.swiftp..*.* (..))")
    public void inafter(JoinPoint joinPoint) throws Throwable{
        int i=str_name.size();
        //str_class.remove(i-1);
        str_name.remove(i-1);
    }
}