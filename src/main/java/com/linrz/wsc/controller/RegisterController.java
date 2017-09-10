package com.linrz.wsc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class RegisterController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test () {
        return "test";
    }
}
