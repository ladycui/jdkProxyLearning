package com.cyn.learn.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {

    /**
     *
     * @param o 增强的对象, 即外层的enhancer
     * @param method 要拦截的方法
     * @param objects 被拦截的方法的参数
     * @param methodProxy 要触发的父类的方法对象
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("---before invoke---");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("---after invoke---");
        System.out.println("in cglib proxy intercept," +
                "\nobject: " + o.getClass() +
                ",\nmethod: " + method.getName() +
                ",\nmethodProxy's supername: " + methodProxy.getSuperName() +
                ",\nthe args, size: " + objects.length
        );
        for (Object arg : objects) {
            System.out.println(arg + "\t");
        }


        return o1;
    }
}
