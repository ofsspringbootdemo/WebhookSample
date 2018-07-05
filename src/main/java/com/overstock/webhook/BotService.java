package com.overstock.webhook;

import com.overstock.webhook.model.WebhookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by Jana on 7/5/2018.
 */
@Service
public class BotService {

    @Autowired
    DrinkClient drinkClient;

    public void setDrinkClient(DrinkClient drinkClient) {
        this.drinkClient = drinkClient;
    }

    public String getMyDrink(WebhookRequest request) {

        Map<String, String> params = request.getQueryResult().getParameters();
        String drinkName = params.get("drink_name");
        String drinkType = params.get("drink_type");
        String drinkSize = params.get("drink_size");
        Drink drink = drinkClient.getMyDrink(drinkName, drinkType, drinkSize);
        String returnValue = "Thanks for ordering!!! " +
                "Here is Your order no. " + drink.getOrderId()+ ", cost " + drink.getPrice() + " and delivered in 2 min, " +
                "Thank you !!!";

        return returnValue;
    }
}
