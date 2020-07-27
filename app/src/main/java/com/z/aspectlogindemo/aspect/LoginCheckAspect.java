package com.z.aspectlogindemo.aspect;

import android.util.Log;
import android.widget.Toast;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Creator:  chee
 * Date：2020/7/27 - 14:44
 * Desc：
 */
@Aspect
public class LoginCheckAspect {

    private static final String TAG = "Aspect >>";

    @Pointcut("execution(@com.z.aspectlogindemo.annotation.LoginCheck * *(..))")
    public void methorPointcut() {
    }

    @Around("methorPointcut()")
    public Object jointPotion(ProceedingJoinPoint joinPoint) throws Throwable {
        Log.e("点击事件", "jointPotion");
        boolean loginState = false;
        if (loginState) {
            Object result = joinPoint.proceed();
            return result;
        } else {
            Log.e(TAG, "未登录，正在前往登录");
            return null;
        }
    }

}


