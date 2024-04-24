package com.hrm.support.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName:HrmZuulApplication
 * @Description:Zuul启动类
 * @Author:zfl19
 * @CreateDate:2024/4/24 16:22
 */

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class HrmZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrmZuulApplication.class, args);
    }
}
