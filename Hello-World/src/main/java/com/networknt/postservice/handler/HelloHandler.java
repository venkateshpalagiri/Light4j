package com.networknt.postservice.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.status.Status;
import io.undertow.server.HttpServerExchange;

import java.util.Map;

public class HelloHandler implements LightHttpHandler {
    @Override
    public void handleRequest(HttpServerExchange httpServerExchange) throws Exception {
        httpServerExchange.setStatusCode(200);
        httpServerExchange.getResponseSender().send("Hello World!");
    }

    @Override
    public void setExchangeStatus(HttpServerExchange exchange, String code, Object... args) {
        LightHttpHandler.super.setExchangeStatus(exchange, code, args);
    }

    @Override
    public void setExchangeStatus(HttpServerExchange exchange, String code, Map<String, Object> metadata, Object... args) {
        LightHttpHandler.super.setExchangeStatus(exchange, code, metadata, args);
    }

    @Override
    public void setExchangeStatus(HttpServerExchange ex, Status status) {
        LightHttpHandler.super.setExchangeStatus(ex, status);
    }
}
