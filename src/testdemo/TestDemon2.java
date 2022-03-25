package testdemo;

import com.hlp.spring5_demon2.autowire.Emp;
import com.hlp.spring5_demon2.bean.Orders;
import com.hlp.spring5_demon2.collectiontype.Book;
import com.hlp.spring5_demon2.collectiontype.Course;
import com.hlp.spring5_demon2.collectiontype.Stu;
import com.hlp.spring5_demon2.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 韩帅比
 * @create 2022-03-25 19:29
 */
public class TestDemon2 {
    @Test
    public void testStuCollection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ArrayListMapSet.xml");
        Stu stu = applicationContext.getBean("stu", Stu.class);
        stu.test();
    }

    @Test
    public void testBookCollection2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("publicProperty.xml");
        Book book = applicationContext.getBean("book", Book.class);
        Book book2 = applicationContext.getBean("book", Book.class);
        book.test();
        System.out.println(book2 == book);//在Spring中，默认情况下，单实例
    }

    @Test
    public void testFactoryBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");
        Course course = applicationContext.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testLifeCycle() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifeCycle.xml");
        Orders orders = applicationContext.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建的bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }

    @Test
    public void testAutowire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        Emp emp = applicationContext.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
