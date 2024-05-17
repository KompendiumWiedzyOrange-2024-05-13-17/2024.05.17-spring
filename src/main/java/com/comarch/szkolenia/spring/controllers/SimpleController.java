package com.comarch.szkolenia.spring.controllers;

import com.comarch.szkolenia.spring.components.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    @Autowired
    VehicleRepository vehicleRepository;

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String test() {
        System.out.println("cos dziala !!!");
        System.out.println(this.vehicleRepository.getCar());
        return "index";
    }

    @RequestMapping(path = "/jakisinny", method = RequestMethod.GET)
    public String test2() {
        System.out.println("dziala inna metoda !!");
        return "inny";
    }
}
