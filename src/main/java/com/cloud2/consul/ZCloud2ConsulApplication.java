package com.cloud2.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZCloud2ConsulApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZCloud2ConsulApplication.class).web(true).run(args);
    }

}
