package com.jdbc_template.test;

import com.jdbc_template.entity.Book;
import com.jdbc_template.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        System.out.println(bookService.findCount());
    }

}
