package club.beenest.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 陈玉轩
 * @since 2022-08-20
 */

@SpringBootApplication
@EnableEurekaServer
public class BeeEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(BeeEurekaApplication.class);
    }
}
