package user.service.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) throws InterruptedException {
        //SpringApplication.run(DubboProviderApplication.class, args);
        ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("provider.xml");
        cx.start();
        Thread.sleep(Long.MAX_VALUE);
    }

}
