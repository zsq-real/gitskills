package com.dao;

import com.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl  implements  BookDao{
    //注入jdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
//        User user = new User();

        String sql = "insert into t_book values(?,?,?)";
        //update方法实现对数据库的增删改查操作
        Object[] args={book.getbookid(), book.getbookname(), book.getbookstatus()};
        int add = jdbcTemplate.update(sql, args);
        System.out.println(add);

    }

    @Override
    public void delete(String id) {
        String sql = "delete from t_book where bookid=?";
        int delete = jdbcTemplate.update(sql, id);
        System.out.println(delete);
    }

    @Override
    public void update(Book book) {
        String sql = "update t_book set bookname=?,bookstatus=? where bookid=?";
        Object [] args = {book.getbookname(),book.getbookstatus(),book.getbookid()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }

    @Override
    public int select() {
        String sql = "select count(*) from t_book";
        //queryforobject 第一个参数sql ，第二个参数为返回类型的class
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book findBookInfo(String id) {
        String sql = "select * from t_book where bookid=?";
        //三个参数，sql，rowmapper
        //rowmapper 接口，spring提供的，根据我们提供的类型，可以帮我们完成数据的封装
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findallbook() {
        String sql = "select * from t_book";
        List<Book> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return query;
    }

    @Override
    public void batchAddBook(List<Object[]> batchargs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchargs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchargs) {
        String sql = "update t_book set bookname=?,bookstatus=? where bookid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchargs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchargs) {
        String sql = "delete from t_book where bookid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchargs);
        System.out.println(Arrays.toString(ints));
    }
}
