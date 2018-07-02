package com.overstock.webhook.model;

import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class QueryResult {

    private String queryText;
    private Map<String, String> parameters;
    private boolean allRequiredParamsPresent;
    private String fulfillmentText;
    private List<FulfillmentMessage> fulfillmentMessages;
    private List<OutputContext> outputContexts;
    private Intent intent;
    private int intentDetectionConfidence;
    private Object diagnosticInfo;
    private String languageCode;
}
