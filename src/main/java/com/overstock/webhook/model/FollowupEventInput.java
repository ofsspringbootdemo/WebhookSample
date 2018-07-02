package com.overstock.webhook.model;

import lombok.Data;

import java.util.Map;

/**
 * Created by Jana on 7/2/2018.
 */
@Data
public class FollowupEventInput {

    private String name;
    private String languageCode;
    private Map<String, String> parameters;
}
