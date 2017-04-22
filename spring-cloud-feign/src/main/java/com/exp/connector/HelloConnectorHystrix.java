package com.exp.connector;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
@Component
public class HelloConnectorHystrix implements HelloConnector {
    @Override
    public String sayHiFromClientOne(String name) {
        return String.format("hi,%s, sorry, error! from Feign.", name);
    }
}
