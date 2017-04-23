package com.exp.controller;

import com.exp.connector.HelloConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
@RestController
public class HelloController {
    @Autowired
    HelloConnector helloConnector;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloConnector.sayHiFromClientOne(name) + "--from Feign.";
    }
}
