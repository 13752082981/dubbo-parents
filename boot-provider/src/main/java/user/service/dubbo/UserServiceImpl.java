package user.service.dubbo;


import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {

    @HystrixCommand
    @Override
    public List<Mall> getUserList(String userid) {
        Mall mall1 = new Mall(1, "北京1", "1", "11", "13752082981","1");
        Mall mall2 = new Mall(2, "北京2", "1", "22", "13752082981","1");
        if(Math.random()>0.5){
            throw new RuntimeException();
        }
        return Arrays.asList(mall1,mall2);
    }
}
