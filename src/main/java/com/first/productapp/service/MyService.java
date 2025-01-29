package com.first.productapp.service;

import com.first.productapp.entity.MyEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MyService {
    @Value("${weather.api.url}")
    private String weatherMapURL;

    @Value("${weather.api.key}")
    private String appid;

    public MyEntity getMyEntity() {
        MyEntity myEntity = new MyEntity();
        myEntity.setId(1);
        myEntity.setName("test");
        myEntity.setPrice(10000);
        return myEntity;
    }

    public String getWeather(String city) {
        String URL = UriComponentsBuilder.fromUriString(weatherMapURL)
                .queryParam("q", city)
                .queryParam("appid", appid)
                .build()
                .toUriString();
        RestTemplate template = new RestTemplate();
        return template.getForObject(URL, String.class);
    }
}
