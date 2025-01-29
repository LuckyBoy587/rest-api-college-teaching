package com.first.productapp.controller;

import com.first.productapp.entity.MyEntity;
import com.first.productapp.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    private final MyService service;

    MyController(MyService service) {
        this.service = service;
    }

    @GetMapping("/weather")
    public String weather(@RequestParam String city) {
        return service.getWeather(city);
    }

    @GetMapping("/entity")
    public MyEntity getEntity() {
        MyEntity myEntity = new MyEntity();
        myEntity.setId(1);
        myEntity.setName("test");
        myEntity.setPrice(10000);
        return myEntity;
    }

    @GetMapping("/service_entity")
    public MyEntity getServiceEntity() {
        return service.getMyEntity();
    }
}
