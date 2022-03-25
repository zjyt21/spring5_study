package testdemo;

import com.hlp.spring5_demon1.User;
import com.hlp.spring5_demon1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 韩帅比
 * @create 2022-03-25 1:19
 */
public class TestBean {
    @Test
    public void testAdd(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);//user是别名，体现在xml文件的<bean>标签中的id上
        userService.add();
    }
}
