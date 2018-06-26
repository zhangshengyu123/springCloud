package com.example.sericefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    SchedualServiceB schedualServiceB;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return schedualServiceB.sayHiFromClientOne();
    }
}
