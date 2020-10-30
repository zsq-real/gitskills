package com.service;

import com.dao.BookDao;
import com.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    public void add(Book book){
        bookDao.add(book);
    }
    public void delete(String id){
        bookDao.delete(id);
    }
    public void update(Book book){
        bookDao.update(book);
    }
    public int findcount(){
        return bookDao.select();
    }
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }
    public List<Book> findall(){
        return bookDao.findallbook();
    }
    public void banchadd(List<Object []> batchargs){
        bookDao.batchAddBook(batchargs);
    }
    public void banchupdate(List<Object[]> batchargs){
        bookDao.batchUpdateBook(batchargs);
    }
    public void banchdelete(List<Object[]> batchargs){
        bookDao.batchDeleteBook(batchargs);
    }
}
