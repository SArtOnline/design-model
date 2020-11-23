package com.example.design;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
    private Object proxyObject;

    public Object newProxyInstance(Object proxyObject) {
        this.proxyObject = proxyObject;
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(),
                proxyObject.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("正在执行代理");
        System.out.println(this.proxyObject);
        Object result = method.invoke(this.proxyObject, args);
        return result;
    }
}
