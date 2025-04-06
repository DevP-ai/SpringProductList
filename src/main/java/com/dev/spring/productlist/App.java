package com.dev.spring.productlist;

import org.springframework.stereotype.Component;

@Component
public class App {

    private final MyComponent myComponent;

    public App(MyComponent myComponent){
        this.myComponent = myComponent;
    }

    public void run() {
        myComponent.getMessage();
    }
}
