package com.skplanet.display.api;

import com.skplanet.display.service.VineHealthIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(path = "/eureka")
public class EurekaController {

    @Autowired
    VineHealthIndicator vineHealthIndicator;

    @RequestMapping(path = "/register", method = GET)
    public boolean registerEureka() {

        vineHealthIndicator.setInitialzed(true);
        return true;
    }

}
