package com.pojo;

public class Book {
    private String bookid;
    private String bookname;
    private String bookstatus;

    public Book() {
    }

    public Book(String bookid, String bookname, String bookstatus) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookstatus = bookstatus;
    }

    public String getbookid() {
        return bookid;
    }

    public void setbookid(String bookid) {
        this.bookid = bookid;
    }

    public String getbookname() {
        return bookname;
    }

    public void setbookname(String bookname) {
        this.bookname = bookname;
    }

    public String getbookstatus() {
        return bookstatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid='" + bookid + '\'' +
                ", bookname='" + bookname + '\'' +
                ", bookstatus='" + bookstatus + '\'' +
                '}';
    }

    public void setbookstatus(String bookstatus) {
        this.bookstatus = bookstatus;
    }
}
