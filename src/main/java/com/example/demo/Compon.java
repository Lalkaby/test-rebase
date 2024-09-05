package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Compon {
//    @Value("${mama}")
//    public String text;
    @Value("${arr}")
    public String arr;
}
