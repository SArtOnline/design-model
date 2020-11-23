package com.example;

import com.example.design.DynamicProxy;
import com.example.model.User1;
import com.example.model.User2;
import com.example.service.Action;

import javax.swing.plaf.TextUI;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
	// write your code here
        DynamicProxy dynamicProxy = new DynamicProxy();

        Action action = (Action) dynamicProxy.newProxyInstance(new User1("user1"));
        action.goShopping();

        action = (Action) dynamicProxy.newProxyInstance(new User2("user2"));
        action.goShopping();

        Method method = User1.class.getMethod("goShopping");
        method.invoke(new User1("user1"), null);

    }


    public static void start() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {

        });
        Objects.requireNonNull(executorService);
    }
}
