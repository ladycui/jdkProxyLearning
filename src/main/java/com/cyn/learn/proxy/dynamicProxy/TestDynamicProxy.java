package com.cyn.learn.proxy.dynamicProxy;


public class TestDynamicProxy {
    public static void main(String[] args) {
        Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());
        System.out.println(proxy.add(1, 1));
        System.out.println(proxy.getClass());//class com.sun.proxy.$Proxy0
    }
}
