package com.deoendencydemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyService {

    @Autowired
    ApiService apiService;

    public MyService(){
        System.out.println("Myservice Bean Created");
    }

    public void setApiService(ApiService apiService) {
        this.apiService = apiService;
    }

    public void doSomeApiCall(){
        apiService.callApi();
    }

}
