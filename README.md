### userservice是服务提供方

### userconsumer 是服务消费方

### 两者都会注册到servicediscovery 这是服务注册中心 eureka

### userservicefeign是feign层 并集成了hystrix

### 启动顺序是先启动eureka注册服务

### 然后启动服务提供实例 服务消费实例

### 服务提供是2000端口 服务消费是7000端口 注册中心是8260

