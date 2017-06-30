package com.example.lw.appfight;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lw on 2017/6/29.
 */
@Aspect
public class Aspectj {
    List<String> str_name=new ArrayList<String>();
    @Before("execution(* com.fighting.games.Mainmenu.* (..))")
    public void onbefore(JoinPoint joinPoint) throws Throwable{
        int i=str_name.size();
        if(i==0){
            str_name.add("\"main\"");
            i++;
        }
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        String name=signature.toString();
        str_name.add("\""+name+"\"");
        i++;
        Log.d("ASPECTJ",str_name.get(i-2)+"->"+str_name.get(i-1));
    }
    @After("execution(* com.fighting.games.Mainmenu.* (..))")
    public void onafter(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
    @Before("execution(* com.my.webview.dialog.Aboutlistener.* (..))")
    public void onbefore1(JoinPoint joinPoint) throws Throwable{
        int i=str_name.size();
        if(i==0){
            str_name.add("\"main\"");
            i++;
        }
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        String name=signature.toString();
        str_name.add("\""+name+"\"");
        i++;
        Log.d("ASPECTJ",str_name.get(i-2)+"->"+str_name.get(i-1));
    }
    @After("execution(* com.my.webview.dialog.Aboutlistener.* (..))")
    public void onafter1(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
    @Before("execution(* com.my.webview.dialog.Exitlistener.* (..))")
    public void onbefore2(JoinPoint joinPoint) throws Throwable{
        int i=str_name.size();
        if(i==0){
            str_name.add("\"main\"");
            i++;
        }
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        String name=signature.toString();
        str_name.add("\""+name+"\"");
        i++;
        Log.d("ASPECTJ",str_name.get(i-2)+"->"+str_name.get(i-1));
    }
    @After("execution(* com.my.webview.dialog.Exitlistener.* (..))")
    public void onafter2(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
    @Before("execution(* com.ads.Receiver.* (..))")
    public void onbefore3(JoinPoint joinPoint) throws Throwable{
        int i=str_name.size();
        if(i==0){
            str_name.add("\"main\"");
            i++;
        }
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        String name=signature.toString();
        str_name.add("\""+name+"\"");
        i++;
        Log.d("ASPECTJ",str_name.get(i-2)+"->"+str_name.get(i-1));
    }
    @After("execution(* com.ads.Receiver.* (..))")
    public void onafter3(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
}
