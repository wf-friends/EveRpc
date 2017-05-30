package com.eric.client.proxy;

import com.eric.client.RPCFuture;

/**
 * Created by wangfeng on 2017/05/01.
 */
public interface IAsyncObjectProxy {
     RPCFuture call(String funcName, Object... args);
}