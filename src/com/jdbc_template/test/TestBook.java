package com.jdbc_template.test;

import com.jdbc_template.entity.Book;
import com.jdbc_template.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 韩帅比
 * @create 2022-03-30 22:47
 */
public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbc_template/MySqlConnect.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        //添加
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("javaupup");
//        book.setUstatus("lalala");
//        bookService.updateBook(book);

        //删除
//        bookService.deleteBook("1");

        //查询表中条数
//        System.out.println(bookService.findCount());

        //查询返回对象
//        Book book = bookService.findOne("1");
//        System.out.println(book);

        //查询返回集合
//        List<Book> allBook = bookService.findAll();
//        allBook.forEach(System.out::println);

        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3","ccc","c"};
//        Object[] o2 = {"4","ddd","d"};
//        Object[] o3 = {"5","eee","e"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"update-ccc","3-update","3"};
//        Object[] o2 = {"update-ddd","4-update","4"};
//        Object[] o3 = {"update-eee","5-update","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        Object[] o3 = {"5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }

}
