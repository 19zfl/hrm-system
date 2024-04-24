package com.hrm.modules.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:HrmAdminApplication
 * @Description:系统模块启动类
 * @Author:zfl19
 * @CreateDate:2024/4/24 16:27
 */

@SpringBootApplication
@EnableEurekaClient
public class HrmAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrmAdminApplication.class, args);
    }
}
