/*
 * Copyright (C) 2015 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.king.dubbo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.king.registry.service.TestRegistryService;

/**
 * Created by chenruijin on 2015/11/18.
 */
@Controller
public class IndexController {
    @Resource
    private TestRegistryService testRegistryService;

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, String> hello(String name) {
        Map<String, String> result = new HashMap<String, String>();
        if (name != null) {
            String msg = testRegistryService.hello(name);
            result.put(name, msg);
        }
        return result;
    }

    @RequestMapping("/hello2")
    @ResponseBody
    public Map<String, String> hello2(String name) {
        Map<String, String> result = new HashMap<String, String>();
        if (name != null) {
            String msg = testRegistryService.hello(name, "1.0.1");
            result.put(name, msg);
        }
        return result;
    }
}
