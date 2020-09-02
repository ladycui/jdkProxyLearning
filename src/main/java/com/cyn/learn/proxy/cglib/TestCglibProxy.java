package com.cyn.learn.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class TestCglibProxy {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyCalculator.class);
        enhancer.setCallback(new CglibProxy());

        MyCalculator myCalculator = (MyCalculator) enhancer.create();
        System.out.println(myCalculator.add(1, 1));
        //class com.cyn.learn.proxy.cglib.MyCalculator$$EnhancerByCGLIB$$797a173c
        System.out.println(myCalculator.getClass());
    }
}
