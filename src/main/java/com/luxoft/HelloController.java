package com.luxoft;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qtr-ptc-1 on 9/1/2016.
 */
@RestController
public class HelloController {

    @RequestMapping(value="/hello/{name}", method= RequestMethod.GET)
    public String sayHelloTo(@PathVariable String name){
        return "Hello "+name;
    }

}
