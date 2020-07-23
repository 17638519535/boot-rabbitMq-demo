package myf;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class ProducerApplication {
    public static void main(String[] asd){
        SpringApplication.run(ProducerApplication.class, asd);
       log.info("生产者启动成功");
    }
}
