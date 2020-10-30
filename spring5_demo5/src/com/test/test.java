package com.test;


import com.pojo.Book;
import com.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


public class test {
    @Test
    public void testjdbc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //测试添加
//        Book book = new Book();
//        book.setUserId("2");
//        book.setUserName("java");
//        book.setUserStatus("a");
//        bookService.add(book);
            //测试删除
//        bookService.delete("2");

        //测试修改
//        Book book = new Book();
//        book.setUserId("3");
//        book.setUserName("python11");
//        book.setUserStatus("vv");
//        bookService.update(book);
        //测试查询
//        int findcount = bookService.findcount();
//        System.out.println(findcount);

//         测试查询一个对象
//        System.out.println(  bookService.findOne("3"));

//        //测试查询多个List对象
//        List<Book> books = bookService.findall();
//        System.out.println(books);

//        //测试 批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object [] o1 ={"4","php","good"};
//        Object [] o2 ={"5","js","good1"};
//        Object [] o3 ={"6","jq","good2"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.banchadd(batchArgs);
//
//        //测试 批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object [] o1 ={"php11","good","4"};
//        Object [] o2 ={"js11","good1","5"};
//        Object [] o3 ={"jq11","good2","6"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.banchupdate(batchArgs);

        //测试批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object [] o1 = {"3"};
        Object [] o2 = {"4"};
        Object [] o3 = {"5"};

        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.banchdelete(batchArgs);

    }



}
