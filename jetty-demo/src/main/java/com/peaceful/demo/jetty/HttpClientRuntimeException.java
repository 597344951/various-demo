package com.peaceful.demo.jetty;

/**
 * Created by wangjun on 15/1/29.
 */
public class HttpClientRuntimeException extends RuntimeException {

    public HttpClientRuntimeException(String message, Throwable cause) {
        super(message,cause);
    }
}
