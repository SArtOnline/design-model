package com.example.model;

import com.example.service.Action;

public class User2 implements Action {
    private String name;

    public User2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void goShopping() {
        System.out.println(this.name + " is shopping.");
    }
}
