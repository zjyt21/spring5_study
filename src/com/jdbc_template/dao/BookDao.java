package com.jdbc_template.dao;

import com.jdbc_template.entity.Book;

import java.util.List;

/**
 * @author 韩帅比
 * @create 2022-03-30 22:21
 */
public interface BookDao {
    //添加方法
    void add(Book book);

    //修改
    void updateBook(Book book);

    //删除
    void delete(String id);

    //查询表中记录条数
    int selectCount();

    Book findBookInfo(String id);

    List<Book> findAllBook();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}
