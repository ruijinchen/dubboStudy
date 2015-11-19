/*
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.king.registry.service.imp;

import org.springframework.stereotype.Service;

import com.baidu.king.registry.service.TestRegistryService;

/**
 * Created by chenruijin on 2015/11/18.
 */
@Service("")
public class TestRegistryServiceImpl implements TestRegistryService {
    public String hello(String name) {
        return "hello " + name;
    }

    public String hello(String name, String version) {
        return "hello " + name + ";version:" + version;
    }
}
