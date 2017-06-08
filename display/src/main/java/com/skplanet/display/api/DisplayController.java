package com.skplanet.display.api;

import com.skplanet.display.service.ProductRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/displays")
public class DisplayController {

    @Autowired
    ProductRemoteService productRemoteService;

    @RequestMapping(path = "/{displayId}", method = RequestMethod.GET)
    public String getDisplayDetail(@PathVariable String displayId) {

        String productInfo = productRemoteService.getProductInfo("12345");

        return String.format("[display id = %s at %s %s ]", displayId, System.currentTimeMillis(), productInfo);
    }
}
