package com.example.CardAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {
    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String info(){
        return "The application is up";
    }


}
