package com.linrz.wsc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main () {
        return "spring";
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo () {
        return "spring learn test";
    }

}
