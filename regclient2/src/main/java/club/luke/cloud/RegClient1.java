package club.luke.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luke on 2018/10/30.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class RegClient1 {

    public static void main(String[] args) {
        SpringApplication.run(RegClient1.class,args) ;
    }


    @Value("${server.port}")
    String port ;

    @RequestMapping("/")
    public String welcome(){
        return "hello word this port is "+port ;
    }


}
