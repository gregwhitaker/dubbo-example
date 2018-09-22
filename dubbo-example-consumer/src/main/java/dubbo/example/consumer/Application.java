package dubbo.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "dubbo.example.consumer", "com.alibaba.boot.dubbo" })
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
