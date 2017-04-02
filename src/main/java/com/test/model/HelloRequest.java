package com.test.model;

/**
 * Created by stevenromero on 2/3/17.
 */
public class HelloRequest {

    private String input;

    public HelloRequest(String input) {
        this.input = input;
    }

    public HelloRequest() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
