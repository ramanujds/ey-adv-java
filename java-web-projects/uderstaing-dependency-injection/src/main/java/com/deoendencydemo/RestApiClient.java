package com.deoendencydemo;

import org.springframework.stereotype.Component;

@Component
public class RestApiClient {

    public RestApiClient(){
        System.out.println("APIClient Bean Created");
    }

    public void makeGetRequest(String url){
        System.out.println("Calling "+url);
    }
}
