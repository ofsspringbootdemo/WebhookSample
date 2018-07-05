package com.overstock.webhook;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jana on 7/5/2018.
 */
@Component
public class DrinkClientFallbackFactory implements FallbackFactory<DrinkClient> {

    @Override
    public DrinkClient create(Throwable throwable) {
        return new DrinkClient() {
            @Override
            public Drink getMyDrink(String drinkName, String drinkTpe, String drinkSize) {
                return new Drink();
            }
        };
    }
}
