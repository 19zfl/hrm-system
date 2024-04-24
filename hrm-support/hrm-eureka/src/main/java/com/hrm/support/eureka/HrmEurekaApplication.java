package com.hrm.support.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName:HrmEurekaApplication
 * @Description:Eureka启动类
 * @Author:zfl19
 * @CreateDate:2024/4/24 16:20
 */

@SpringBootApplication
@EnableEurekaServer // 此服务为Eureka服务端口
public class HrmEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrmEurekaApplication.class, args);
    }
}
