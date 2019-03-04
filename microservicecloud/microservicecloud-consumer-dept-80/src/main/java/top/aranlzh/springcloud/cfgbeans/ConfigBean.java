package top.aranlzh.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Aranlzh
 * @create 2019-02-28 12:05
 * @desc
 **/
@Configuration
public class ConfigBean {   //boot --> spring   applicationContext.xml --> @Configuration配置 ConfigBean = applicationContext.xml
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//@Bean
//public UserService getUserService(){
//return new UserServiceImpl();
//}
//applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userService" class="top.aranlzh.tmall.UserServiceImpl">
