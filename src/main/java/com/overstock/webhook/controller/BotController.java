package com.overstock.webhook.controller;

import com.overstock.webhook.model.WebhookRequest;
import com.overstock.webhook.model.WebhookResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jana on 7/2/2018.
 */
@RestController
@RequestMapping(value="/omnibot/webhook")
public class BotController {

    @GetMapping
    public String welcomeMessage() {
        return "Welcome to Omnibot service!!! ***updated locally***";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<WebhookResponse> processFulfillment(@RequestBody WebhookRequest request) {
        System.out.println("webhook called!!!!!");
        return ResponseEntity.ok(new WebhookResponse());
    }
}
