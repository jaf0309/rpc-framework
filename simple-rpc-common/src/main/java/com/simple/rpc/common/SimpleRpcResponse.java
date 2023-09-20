package com.simple.rpc.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class SimpleRpcResponse implements Serializable {
    private Object data;
    private String message;
}