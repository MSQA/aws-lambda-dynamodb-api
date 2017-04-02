package com.test.function;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.test.model.HelloRequest;
import com.test.model.HelloResponse;
import org.apache.log4j.Logger;

/**
 * Created by stevenromero on 2/3/17.
 */
public class HelloFunctions implements RequestHandler<HelloRequest, HelloResponse> {

    private static final Logger log = Logger.getLogger(HelloFunctions.class);

    @Override
    public HelloResponse handleRequest(HelloRequest helloRequest, Context context) {

        log.info("Returning Response " + helloRequest.getInput());

        return new HelloResponse(helloRequest.getInput());
    }
}
