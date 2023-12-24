package com.naveen.currencyexchangeservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {

    @Autowired
    private Environment env;

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchnageValue(@PathVariable String from, @PathVariable String to){
        log.info("retrieveExchnageValue from-"+from+",to-"+to);
        CurrencyExchange currencyExchange=new CurrencyExchange(122L,"Dollers","Rs", 80.0,env.getProperty("local.server.port"));
        return currencyExchange;
    }
}
