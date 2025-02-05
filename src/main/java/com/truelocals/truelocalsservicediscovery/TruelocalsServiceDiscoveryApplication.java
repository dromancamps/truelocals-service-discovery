package com.truelocals.truelocalsservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TruelocalsServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TruelocalsServiceDiscoveryApplication.class, args);
    }

}
