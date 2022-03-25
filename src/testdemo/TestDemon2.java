package testdemo;

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
    public void testStuCollection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ArrayListMapSet.xml");
        Stu stu = applicationContext.getBean("stu", Stu.class);
        stu.test();
    }
    @Test
    public void testBookCollection2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("publicProperty.xml");
        Book book = applicationContext.getBean("book", Book.class);
        book.test();
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");
        Course course = applicationContext.getBean("myBean", Course.class);
        System.out.println(course);
    }
}
