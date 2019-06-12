`该项目是个适合新手学习项目，springboot 用的2.0.9 springcloud 用的Finchley版本
有一个服务提供者userservice 一个服务消费者userconsumer 有了注册中心 网关 feign 以及spring cloud config 和hystrix
`
## 服务启动顺序建议是
### 1 service discovery 注册中心
### 2 服务提供者 userservice
### 3 服务消费者 user consumer
### 4 hystrix-dashboard 仪表盘
### 5 zuulservice 网关
### 6 configserver 配置中心(待完成)

然后浏览器打开注册中心 即可看见你的服务列表
[注册中心](http://localhost:8260) 
[服务提供接口]()
[服务消费接口]()
[网关映射后消费接口地址]()
[网关映射后提供者接口地址]()
[hystrix仪表盘地址]()
学习有疑问可以发起issues
### 开始吧！！！！