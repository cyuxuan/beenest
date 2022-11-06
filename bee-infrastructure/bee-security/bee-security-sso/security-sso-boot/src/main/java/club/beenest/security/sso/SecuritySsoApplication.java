package club.beenest.security.sso;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * sso安全工程
 *
 * @author 陈玉轩
 */
@SpringBootApplication
@MapperScan("club.beenest.security.sso.dao")
public class SecuritySsoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecuritySsoApplication.class);
    }
}
