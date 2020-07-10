package com.jiakuanhu.springcloud.cfgbeans;

import com.jiakuanhu.myrule.MySelfRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced  // 获取连接的时候  开启Ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /** 配置客户端负载均衡的算法 切换使用Ribbon负载均衡的算法*/
    @Bean
    public IRule myRule(){
        return new RoundRobinRule();  // 默认轮训
//        return new RandomRule();// 配置随机
//        return new RetryRule();// 配置重试
    }


}
