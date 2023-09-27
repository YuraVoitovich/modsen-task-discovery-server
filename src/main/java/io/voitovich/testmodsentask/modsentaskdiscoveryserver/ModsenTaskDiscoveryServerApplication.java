package io.voitovich.testmodsentask.modsentaskdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ModsenTaskDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModsenTaskDiscoveryServerApplication.class, args);
    }

}
