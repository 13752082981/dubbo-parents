package user.service.dubbo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<Mall> getUserList(String userid) {
        Mall mall1 = new Mall(1, "北京1", "1", "11", "13752082981","1");
        Mall mall2 = new Mall(2, "北京2", "1", "22", "13752082981","1");
        return Arrays.asList(mall1,mall2);
    }
}
