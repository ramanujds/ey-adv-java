package com.deoendencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ApiService {

    @Autowired
    RestApiClient client;

    public ApiService(){
        System.out.println("ApiService Bean Created");
    }


    public void setClient(RestApiClient client) {
        this.client = client;
    }


    public void callApi(){
        client.makeGetRequest("api.abc.com");
    }

}
