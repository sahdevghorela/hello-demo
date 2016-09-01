package com.luxoft;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ExchangeController {

    @RequestMapping(value="/exchange/{cur}", method= RequestMethod.GET)
    public String getExchange(@PathVariable String cur){
        if(cur != null && cur.equalsIgnoreCase("usd")){
            return "1.0";
        }
        return "not supported";
    }

}
