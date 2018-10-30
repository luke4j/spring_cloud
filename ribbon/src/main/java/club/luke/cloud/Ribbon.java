package club.luke.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by luke on 2018/10/30.
 *
 * web 客户端 负载均衡
 *
 */
@SpringBootApplication
@EnableDiscoveryClient  //向服务中心注册，并且注册了一个叫restTemplate的bean
public class Ribbon {

    public static void main(String[] args) {
        SpringApplication.run(Ribbon.class,args) ;
    }


    @Bean
    @LoadBalanced  //注册表明，这个restRemplate是需要做负载均衡的。
    RestTemplate restTemplate(){
        return new RestTemplate() ;
    }

}
