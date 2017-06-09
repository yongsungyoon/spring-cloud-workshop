package com.skplanet.display.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "product")
public interface FeignProductRemoteService {

    @RequestMapping(path = "/products/{productId}")
    String getProductInfo(@PathVariable("productId") String productId);
}