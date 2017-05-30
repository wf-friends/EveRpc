package com.eric.client;

/**
 * @author  wangfeng
 */
public interface AsyncRPCCallback {

    void success(Object result);

    void fail(Exception e);

}
