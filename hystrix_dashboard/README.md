反馈熔断信息
单机:依赖server-feign.
启动改模块,启动server-feign.
访问http://localhost:7079/haha即调用一次server-feign的接口
打开http://localhost:7080/hystrix.stream,输入http://localhost:7079/hystrix.stream

集群:依赖server-feign,server-turbine
启动改模块,启动server-feign.
访问http://localhost:7079/haha即调用一次server-feign的接口
启动server-turbine
打开http://localhost:7080/hystrix.stream,输入http://localhost:7081/turbine.stream