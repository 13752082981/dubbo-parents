/*
package user.service.dubbo;

import com.alibaba.dubbo.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyDubboConfig {

    */
/* <dubbo:application name="user-service-provider"></dubbo:application>*//*

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("boot-provider");
        return  applicationConfig;
    }
    */
/* <dubbo:registry protocol="zookeeper" address="127.0.0.1:2181"></dubbo:registry>*//*

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.160.133:2181");
        return registryConfig;
    }

  */
/*  <dubbo:protocol port="20880"></dubbo:protocol>*//*

    @Bean
    public ProtocolConfig ProtocolConfig(){
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

  */
/* <dubbo:service version="2.0.0" interface="user.service.dubbo.UserService" ref="userService1">

        <dubbo:method name="getUserList" timeout="1000"></dubbo:method>
    </dubbo:service>*//*

  @Bean
  public ServiceConfig<UserService> ServiceConfig(UserService userService){
      ServiceConfig serviceConfig = new ServiceConfig();
      serviceConfig.setInterface(UserService.class);
      serviceConfig.setRef(userService);

      serviceConfig.setVersion("1.0.0");
      //配置每个method
      MethodConfig methodConfig = new MethodConfig();
      methodConfig.setName("getUserList");
      methodConfig.setTimeout(1000);
      //将每个metho关联到service配置

      List<MethodConfig> list = new ArrayList<>();
      list.add(methodConfig);

      serviceConfig.setMethods(list);

 //      ProviderConfig;
//      MonitorConfig;
      return serviceConfig;
  }
}
*/
