package com.first.productapp.controller;

import com.first.productapp.pojo.Pojo;
import com.first.productapp.service.ServiceClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    private final ServiceClass serviceClass;

    public ControllerClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping("/fetchdata")
    public Pojo fetchData() {
        return new Pojo("Kowshik", 108, 18);
    }

    @GetMapping("/details")
    public Pojo details() {
        return serviceClass.fetchPOJODetails();
    }
}
