package com.overstock.webhook;

import lombok.Data;

/**
 * Created by Jana on 7/5/2018.
 */
@Data
public class Drink {

    private String orderId;
    private String name;
    private String type;
    private String size;
    private String price;
    private String weight;
    private String description;
    private String calories;
}
