package com.example.lw.appline;

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
    @Before("execution(* vi.linhcoder.mline.a.* (..))")
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
    @After("execution(* vi.linhcoder.mline.a.* (..))")
    public void onafter(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
    @Before("execution(* vi.linhcoder.mline.Line.* (..))")
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
    @After("execution(* vi.linhcoder.mline.Line.* (..))")
    public void onafter2(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
    @Before("execution(* vi.linhcoder.mline.LineE.* (..))")
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
    @After("execution(* vi.linhcoder.mline.LineE.* (..))")
    public void onafter3(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
    @Before("execution(* com.ads.Receiver.* (..))")
    public void onbefore4(JoinPoint joinPoint) throws Throwable{
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
    public void onafter4(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
}
