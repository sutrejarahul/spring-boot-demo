package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("code compiling using laptop");
    }
}
