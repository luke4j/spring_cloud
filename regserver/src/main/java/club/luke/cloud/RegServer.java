package club.luke.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by luke on 2018/10/30.
 */
@EnableEurekaServer
@SpringBootApplication
public class RegServer {
    public static void main(String[] args) {
        SpringApplication.run(RegServer.class,args) ;
    }
}
