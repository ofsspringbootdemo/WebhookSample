package com.overstock.webhook.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by Jana on 7/2/2018.
 */
@Data
public class WebhookResponse {

    private String fulfillmentText;
    private List<FulfillmentMessage> fulfillmentMessages;
    private String source;
    private Map<String, String> payload;
    private List<OutputContext> outputContexts;
    private FollowupEventInput followupEventInput;
}
