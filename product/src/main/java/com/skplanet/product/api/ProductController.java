package com.skplanet.product.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @RequestMapping(path = "{productId}", method = RequestMethod.GET)
    public String getProductInfo(@PathVariable String productId) {

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //return "[product id = " + productId + " at " + System.currentTimeMillis() + "]";
        throw new RuntimeException("I/O Exception");
    }
}
