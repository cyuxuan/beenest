package club.beenest.desktop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 桌面服务启动类
 *
 * @author 陈玉轩
 */
@SpringBootApplication
@MapperScan("club.beenest.desktop.dao")
public class DesktopApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesktopApplication.class);
    }
}
