package com.example.projecttest;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.List;
import java.util.ArrayList;
/**
 * Created by lw on 2017/5/27.
 */
@Aspect
public class Aspectj {
    List<String> str_name=new ArrayList<String>();
    @Before("execution(* MainActivity.smsBroadcastReceiver.onReceive (..))")
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
    @After("execution(* MainActivity.smsBroadcastReceiver.onReceive (..))")
    public void onafter(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
    @Before("execution(* android.telephony.SmsMessage.* (..))")
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
    @After("execution(* android.telephony.SmsMessage.* (..))")
    public void onafter2(JoinPoint joinPoint)throws  Throwable{
        int i=str_name.size();
        str_name.remove(i-1);
    }
}
