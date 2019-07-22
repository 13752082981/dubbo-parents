package user.service.dubbo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.service.dubbo.Mall;
import user.service.dubbo.UserService;
import user.service.dubbo.order.OrderService;

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


    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userid) {
        System.out.println("userid==="+userid);
        System.out.println(userService);
        List<Mall> userList = userService.getUserList(userid);
        for (Mall mall : userList) {
            System.out.println(mall.getConsignee());
        }
        System.out.println(userList);
    }
}
