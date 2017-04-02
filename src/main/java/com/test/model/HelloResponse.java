package com.test.model;

/**
 * Created by stevenromero on 2/3/17.
 */
public class HelloResponse {

    private String hello;

    public HelloResponse(String hello) {
        this.hello = hello;
    }

    public HelloResponse() {
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

}

