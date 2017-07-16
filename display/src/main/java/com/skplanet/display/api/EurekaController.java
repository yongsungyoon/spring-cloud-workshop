package com.skplanet.display.api;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.ServiceRegistry;
import org.springframework.cloud.netflix.eureka.CloudEurekaInstanceConfig;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "/eureka")
public class EurekaController {

    @Autowired
    EurekaRegistration eurekaRegistration;

    @Autowired(required = false)
    private HealthCheckHandler healthCheckHandler;

    @Autowired
    private ServiceRegistry serviceRegistry;

    @RequestMapping(path = "/register", method = GET)
    public boolean registerEureka() {
        serviceRegistry.register(eurekaRegistration);
        return true;
    }

    @Bean
    public EurekaRegistration eurekaRegistration(EurekaClient eurekaClient, CloudEurekaInstanceConfig instanceConfig, ApplicationInfoManager applicationInfoManager) {
        return EurekaRegistration.builder(instanceConfig)
                .with(applicationInfoManager)
                .with(eurekaClient)
                .with(healthCheckHandler)
                .build();
    }
}
