package com.overstock.webhook;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Jana on 7/5/2018.
 */
@FeignClient(name="my-drink-service-client", url="https://my-drink-service.herokuapp.com")
public interface DrinkClient {

    @GetMapping("/drink")
    public Drink getMyDrink(@RequestParam("drinkName") String drinkName, @RequestParam("drinkType") String drinkTpe,
                            @RequestParam("drinkSize") String drinkSize);
}
