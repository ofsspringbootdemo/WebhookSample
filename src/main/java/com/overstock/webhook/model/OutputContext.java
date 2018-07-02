package com.overstock.webhook.model;


import lombok.Data;

import java.util.Map;

@Data
public class OutputContext {

    private String name;
    private Integer lifespanCount;
    private Map<String, String> parameters;
}
