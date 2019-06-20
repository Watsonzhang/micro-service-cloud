`该项目是个适合新手学习项目，springboot 用的2.0.9 springcloud 用的Finchley版本
有一个服务提供者userservice 一个服务消费者userconsumer 有了注册中心 网关 feign 以及spring cloud config 和hystrix
`
-------以下启动顺序过时-------
## 服务启动顺序建议是
### 1 service discovery 注册中心
### 2 服务提供者 userservice
### 3 服务消费者 user consumer
### 4 hystrix-dashboard 仪表盘
### 5 zuulservice 网关
### 6 configserver 配置中心(待完成)


------------------------分割线----------------------------------------

### 6月13号加入了spring-cloud-config
所以启动顺序需要改变一下了

### 1 service discovery 注册中心
### 2 configserver 配置中心
----------6.20更新--------
把服务提供消费和服务提供从spring config 剥离了 准备用apollo
使用者可以先不启动spring  config 服务

### 3 服务提供者 userservice
### 4 服务消费者 user consumer
### 5 hystrix-dashboard 仪表盘
### 6 zuulservice 网关
之所以要先启动配置中心是因为配置都通过config server发起来读取git仓库配置

配置我放在[配置中心git地址](https://github.com/Watsonzhang/config-sample)


然后浏览器打开注册中心 即可看见你的服务列表
[注册中心](http://localhost:8260) 
[服务提供接口](http://192.168.3.144:2000/user/1)
[服务消费接口](http://192.168.3.144:7000/consumer/1)
[网关映射后消费接口地址](http://192.168.3.144:8888/consumer/consumer/1)
[网关映射后提供者接口地址](http://192.168.3.144:8888/user/user/1)
[hystrix仪表盘地址](http://192.168.3.144:9999/hystrix)


学习有疑问可以发起issues
### 开始吧！！！！