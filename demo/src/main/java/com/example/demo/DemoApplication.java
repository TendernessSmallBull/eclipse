package com.example.demo;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 描述
 * 
 * @author zx
 * @date 2019年2月16日
 */
@SpringBootApplication
@RestController
public class DemoApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    /**
     * Description: 添加HelloWorld方法
     * @return
     */
    @RequestMapping("/hello")
    public String getHelloWorldString() {
        HashMap < String, String > hashMap = new HashMap < String, String >(16);
        hashMap.put("name", "zhaoxin");
        hashMap.put("age", "25");
        return "Hello World !!!";
    }

}
