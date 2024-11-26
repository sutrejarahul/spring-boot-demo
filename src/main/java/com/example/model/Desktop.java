package com.example.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Desktop implements Computer {

    @Override
    public void compile() {
        System.out.println("code compiling using desktop");
    }
}
