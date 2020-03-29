package com.github.demo.comsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.TreeMap;


@RestController
@RequestMapping(value = "/kafka")
public class DemoController {

    @Value(value = "${kafka_host}")
    private String kafkaHost;

    @Value(value = "${app.version}")
    private String version;

    @Value(value = "${app.env}")
    private String env;

    @GetMapping("/status")
    public Map<String, String> status() {
        Map<String, String> map = new TreeMap<String, String>();
        map.put("Status", "ok");
        map.put("version", version);
        map.put("env", env);
        map.put("kafkaHost", kafkaHost);
        return map;
    }
}