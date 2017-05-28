package com.example.youngkaaa.circleview;

import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Created by lw on 2017/5/19.
 */
@Aspect
public class Testaj {
    @Before("execution(* MainActivity.onCreate (..))")
    public void onbeforeaj(JoinPoint joinPoint) throws Throwable{
        String key=joinPoint.getSignature().toString();
        String kind=joinPoint.getKind();
        MethodSignature signature=(MethodSignature)joinPoint.getSignature();
        String classname=joinPoint.getThis().getClass().getSimpleName();
//        Log.d("TAG","before:"+key+".."+kind+".."+signature.getDeclaringTypeName()+"../"+signature.getName()+"///"+classname);
    }

}
