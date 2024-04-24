# system-hrm
基于SpringCloud的人力资源管理系统

#### 技术栈

目前将完善的版本：

- 采用前后端分离的模式。
- 后端采用Spring Boot、Spring Cloud & Alibaba。
- 注册中心、配置中心暂时使用原生Spring Cloud的组件。
- 数据库使用MySQL，非关系型数据库兼缓存中间件Redis，ORM框架MyBatis Plus。
- 前端采用Node.js、Vuejs、Element UI、前端三大件。
- 消息中间件采用RabbitMQ。
- 接口框架Swagger UI。

项目重构之后的版本：

- 注册、配置中心将使用Nacos。
- 权限认证使用Redis。
- 流量控制框架选型Sentinel，分布式事务选型Seata。

#### 系统模块

```md
com.hrm
├── hrm-support
│       └──hrm-eureka			// eureka服务端：1010
│       └──hrm-zuul				// zuul网关服务：1020
│       └──hrm-config			// config配置中心：1030
├── hrm-modules
|		└──hrm-admin			// 系统服务：1040
|		└──
|		└──
|		└──
|		└──
├── hrm-common					// common模块
```

