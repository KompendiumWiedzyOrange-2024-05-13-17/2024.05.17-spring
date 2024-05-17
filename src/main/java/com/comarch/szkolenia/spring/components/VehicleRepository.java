package com.comarch.szkolenia.spring.components;

import org.springframework.stereotype.Component;

@Component
public class VehicleRepository {
    public String getCar() {
        return "BMW";
    }
}
