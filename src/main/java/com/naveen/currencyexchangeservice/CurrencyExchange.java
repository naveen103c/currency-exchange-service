package com.naveen.currencyexchangeservice;

//import javax.persistence.Entity;
//import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class CurrencyExchange {
//    @Id
    private Long id;
    private String currency_from;
    private String currency_to;
    private double conversionMultiple;
    private String environment;
}
