package com.example.demo.core.ret;

import java.io.Serializable;

/**
 * @description:
 * @author: Lucas
 * @time: 2020/9/26 22:02
 */
public class ServiceException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -5727596174564672286L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message,cause);
    }
}
