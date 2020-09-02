package com.cyn.learn.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CalculatorProxy {

    public static Calculator getProxy(final Calculator calculator) {
        ClassLoader classLoader = calculator.getClass().getClassLoader();
        Class<?>[] interfaces = calculator.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("---before---");
                Object result = null;
                try {
                    result = method.invoke(calculator, args);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("----after----");
                return result;
            }
        };
        return (Calculator) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }

}
