package com.example.sericefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@FeignClient(name = "eureka-client")
public interface SchedualServiceB {
    @RequestMapping(value = "/house/qianlong",method = RequestMethod.GET)
    String sayHiFromClientOne();
}