package com.jiakuanhu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * 用于自定义负载均衡算法的实现，自定义的负载均衡实现类不能放在 @ComponentScan所扫描的当前包下以及子包下，
 * 否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，也就是说
 * 我们达不到特殊化定制的目的了。所以将该类放在此包下。
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // Ribbon默认是每个服务轮询一次，我此处自定义为每个服务轮训5次  RandomRule_ZY为自己写负载均衡算法实现类
        return new RandomRule_ZY();
    }

}
