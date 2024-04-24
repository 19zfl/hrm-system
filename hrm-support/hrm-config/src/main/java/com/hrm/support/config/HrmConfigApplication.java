package com.hrm.support.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:HrmConfigApplication
 * @Description:Config配置中心启动类
 * @Author:zfl19
 * @CreateDate:2024/4/24 16:23
 */

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class HrmConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrmConfigApplication.class, args);
    }
}
