package com.example.serviceribbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/house/zhangsan")
    public String zhangsan(){
        return helloService.zhangsan("123");
    }

    @RequestMapping(value = "/house/qianlong")
    public String qianlong(){
        return helloService.qianlong("123");
    }


}