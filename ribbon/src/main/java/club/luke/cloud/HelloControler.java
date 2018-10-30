package club.luke.cloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by luke on 2018/10/30.
 */
@RestController
public class HelloControler {
    @Resource
    HelloService helloService ;

    @RequestMapping("/")
    public String hi(Object param){
        return helloService.getRegClient_welcome() ;
    }

}
