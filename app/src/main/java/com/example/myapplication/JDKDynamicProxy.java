package com.example.myapplication;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKDynamicProxy implements InvocationHandler {
    private Object object;

    public JDKDynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        if (method.getName() == "wakeup") {
            System.out.println("早");
        }
        if (method.getName() == "sleep") {
            System.out.println("晚");
        }

        return method.invoke(object, args);
    }
}
