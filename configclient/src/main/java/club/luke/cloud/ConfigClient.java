package club.luke.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luke on 2018/10/30.
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@RefreshScope
public class ConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class,args) ;
    }


    @Value("${welcomePath}")
    String welcom ;

    @RequestMapping("/helloConfig")
    public String helloConfig(){
        return "helloConfig "+welcom ;
    }

//    @RequestMapping("/refresh")
//    public String helloConfigRefresh(){
//
//    }


}
