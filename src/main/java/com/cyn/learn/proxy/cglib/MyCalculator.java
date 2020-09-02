package com.cyn.learn.proxy.cglib;

import com.cyn.learn.proxy.dynamicProxy.Calculator;

public class MyCalculator {
    public int add(int i, int j) {
        return i + j;
    }

    public int sub(int i, int j) {
        return i - j;
    }

    public int div(int i, int j) {
        return i / j;
    }

    public int mul(int i, int j) {
        return i * j;
    }
}
