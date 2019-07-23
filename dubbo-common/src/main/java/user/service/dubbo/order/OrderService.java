package user.service.dubbo.order;

import user.service.dubbo.Mall;

import java.util.List;

public interface OrderService {

   // void initOrder(String userid);//普通的整合
  public List<Mall> initOrder(String userid);//dubbo整合
}
