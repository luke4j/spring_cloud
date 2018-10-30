package club.luke.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luke on 2018/10/30.
 */
@SpringBootApplication
@RestController
public class ConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class,args) ;
    }


    @Value("${welcome}")
    String welcome ;

    @RequestMapping("/helloConfig")
    public String helloConfig(){
        return "helloConfig "+welcome ;
    }

}
