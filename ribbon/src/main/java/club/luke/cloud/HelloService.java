package club.luke.cloud;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by luke on 2018/10/30.
 */
@Service
public class HelloService {

    @Resource
    RestTemplate restTemplate ;

    public String getRegClient_welcome(){
        return this.restTemplate.getForObject("http://REG-CLIENT1/",String.class) ;
    }


}
