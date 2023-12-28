package com.naveen.currencyexchangeservice.kafka;

import com.naveen.currencyexchangeservice.CurrencyExchange;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CurrencyConversionConsumer {
    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(CurrencyExchange currencyExchange){
        log.info(String.format("Order event received in stock service => %s", currencyExchange.toString()));
    }
}
