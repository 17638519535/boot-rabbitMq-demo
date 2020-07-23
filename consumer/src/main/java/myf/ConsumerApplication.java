package myf;

import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ConsumerApplication {
    public static void main(String[] asd){
        SpringApplication.run(ConsumerApplication.class, asd);
        log.info("消费者启动成功");
    }
}
