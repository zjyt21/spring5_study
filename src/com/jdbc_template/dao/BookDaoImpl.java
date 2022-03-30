package com.jdbc_template.dao;

import com.jdbc_template.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 韩帅比
 * @create 2022-03-30 22:22
 */
@Repository
public class BookDaoImpl implements BookDao {
    //注入JdbcTempplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加方法的具体实现
    @Override
    public void add(Book book) {
        //1 创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        //2 调用方法实现
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);//返回值是影响行数
        System.out.println(update);
    }

    //修改
    @Override
    public void updateBook(Book book) {
        //1 创建sql语句
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        //2 调用方法实现
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);//返回值是影响行数
        System.out.println(update);
    }

    //删除
    @Override
    public void delete(String id) {
        //1 创建sql语句
        String sql = "delete from t_book where user_id=?";
        //2 调用方法实现
        int update = jdbcTemplate.update(sql, id);//返回值是影响行数
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }
}
