package io.corbs.stocks;

import lombok.Data;

@Data
public class Stock {
    private String ticker;
    private String security;
    private String sector;
    private String industry;
    private String address;
    private String dateAdded;
    private String cik;
}
