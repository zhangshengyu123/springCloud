package com.example.serviceribbon;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String zhangsan(String name) {
        return restTemplate.getForObject("http://eureka-client/house/zhangsan",String.class);
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String qianlong(String name) {
        return restTemplate.getForObject("http://eureka-client/house/qianlong",String.class);
    }
    public String hiError(String name) {
        return "这里是关闭或报错后的返回：{house:0}";
    }
}
