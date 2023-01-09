package com.restapiexample.RESTAPI;

public class Book {

    int bookid;
    String bookname;
    String bookauthor;

    public Book(int bookid, String bookname, String bookauthor) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.bookauthor = bookauthor;
    }

    public Book() {
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                '}';
    }
}
