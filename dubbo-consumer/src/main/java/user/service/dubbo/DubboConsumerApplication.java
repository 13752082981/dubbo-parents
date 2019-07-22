package user.service.dubbo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import user.service.dubbo.order.OrderService;

@SpringBootApplication
public class DubboConsumerApplication {

    public static void main(String[] args) throws InterruptedException {
        //SpringApplication.run(DubboConsumerApplication.class, args);
        ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("consumer.xml");
        cx.start();
        OrderService bean = cx.getBean(OrderService.class);
        bean.initOrder("1");
        System.out.println("调用完成");

        Thread.sleep(Long.MAX_VALUE);
    }

}
