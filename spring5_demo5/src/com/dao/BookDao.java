package com.dao;

import com.pojo.Book;

import java.util.List;

public interface BookDao {
    public void add(Book book);
    public void delete(String id);
    public void update(Book book);


    public int select();

    public Book findBookInfo(String id);

    public List<Book> findallbook();


    public void batchAddBook(List<Object[]> batchargs);

    public void batchUpdateBook(List<Object[]> batchargs);

    void batchDeleteBook(List<Object[]> batchargs);
}
