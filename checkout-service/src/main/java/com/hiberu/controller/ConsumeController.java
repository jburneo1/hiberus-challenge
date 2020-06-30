package com.hiberu.controller;

import com.hiberu.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class ConsumeController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/consume-api", method = RequestMethod.POST)
    public String activateMicroServices(@RequestBody Invoice invoice) {
        String url = "http://micro-bill:8081/invoice";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Invoice> entity = new HttpEntity<Invoice>(invoice, headers);

        return restTemplate.exchange(
                url, HttpMethod.POST, entity, String.class).getBody();
    }
}
