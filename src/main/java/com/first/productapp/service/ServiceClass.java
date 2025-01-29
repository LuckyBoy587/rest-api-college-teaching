package com.first.productapp.service;

import com.first.productapp.pojo.Pojo;
import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    public Pojo fetchPOJODetails() {
        return new Pojo("Kowshik", 108, 18);
    }
}
