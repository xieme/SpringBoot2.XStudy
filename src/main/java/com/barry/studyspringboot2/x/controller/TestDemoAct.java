package com.barry.studyspringboot2.x.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc
 * @Authoe xm
 * @CreateTime 2018/11/28 11:19
 **/
@RestController
public class TestDemoAct {
    @RequestMapping("/testDemo.jsom")
    public Map<String, String> getJsonMap() {
        Map<String, String> map = new HashMap<>();
        map.put("第一个jsonMap", "第一个jsonMap");
        return map;
    }
}
