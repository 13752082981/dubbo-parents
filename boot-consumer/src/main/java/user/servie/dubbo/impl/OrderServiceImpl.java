package user.servie.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import user.service.dubbo.Mall;
import user.service.dubbo.UserService;
import user.service.dubbo.order.OrderService;

import java.util.Arrays;
import java.util.List;

/*
* 1.将服务提供者注册到注册中心
*
*   1.导入dubbo的依赖（2.6.2）和操作zookeeper的客户端curator 2.6以前用ZkClient 以后必须用这个
*   2.配置服务提供者
* 2.让服务消费者去注册中心订阅服务者提供的服务地址
*
*
* */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    //@Autowired
    UserService userService;

    @HystrixCommand(fallbackMethod = "hello")
    @Override
    public List<Mall> initOrder(String userid) {
        System.out.println("userid==="+userid);
        System.out.println(userService);
        List<Mall> userList = userService.getUserList(userid);

        return userList;
    }

    public List<Mall> hello(String userid) {
        System.out.println("chucuo==========================");
        Mall mall1 = new Mall(1, "出错了", "1", "11", "13752082981","1");
        Mall mall2 = new Mall(2, "出错了", "1", "22", "13752082981","1");

        return Arrays.asList(mall1,mall2);
    }
}
