package top.aranlzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Aranlzh
 * @create 2019-03-01 14:12
 * @desc
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7419_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7419_App.class,args);
    }
}
