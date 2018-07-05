package com.overstock.webhook;

import com.overstock.webhook.model.WebhookRequest;
import com.overstock.webhook.model.WebhookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Jana on 7/2/2018.
 */
@RestController
@RequestMapping(value="/omnibot/webhook")
public class BotController {

    @Autowired
    BotService botService;

    @GetMapping
    public String welcomeMessage() {
        return "Welcome to Omnibot service!!! ***updated locally***";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<WebhookResponse> processFulfillment(@RequestBody WebhookRequest request) {
        WebhookResponse response = new WebhookResponse();
        response.setFulfillmentText(botService.getMyDrink(request));
        return ResponseEntity.ok(response);
    }
}
