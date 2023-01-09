package com.restapiexample.RESTAPI;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookController {

//    @RequestMapping("/home")
//    @ResponseBody
//    public String f(){
//        int a = 588 , b = 100;
//        int c = a+b;
//        return "Hi Helloooooo , I am Rakesh .  How are you ?" + c;


    static List<Book> blist = new ArrayList<>();
    static {
        blist.add(new Book(3,"second","ash"));
        blist.add(new Book(5,"third","king"));
        blist.add(new Book(6,"fourth","kalyan"));

    }


    @GetMapping("/books")
    public List<Book> getbooks(){
//        Book book = new Book();
//        book.setBookid(1);
//        book.setBookname("SUCCESS OF FAILURE");
//        book.setBookauthor("RAKESH");
//
//        Book book1 = new Book();
//        book1.setBookid(2);
//        book1.setBookname("C PROGRAMMING");
//        book1.setBookauthor("FIN");

        return blist;
    }


    @GetMapping("/books/{id}")
    public Book getbookbyId(@PathVariable("id") int i){
        Book bk = null;
        bk = blist.stream().filter(e -> e.getBookid() == i).findFirst().get();
        return bk;
    }

    @PostMapping("/books")
    public Book addbook(@RequestBody Book book){
        Book b = BookService.addbook(book);
        System.out.println(b);
        return b   ;
    }

    @DeleteMapping("/books/{id}")
    public Book deletebook(@PathVariable("id") int bookid){
        blist = blist.stream().filter(e->{
            if(e.getBookid() != bookid){
                return true;
            }else {
                return false;
            }
            }).collect(Collectors.toList());
        return null ;
    }


    @PutMapping("/books/{id}")
    public Book updatebook(@PathVariable("id")int bookid,@RequestBody Book book){
        blist.stream().map(book1 -> {
            if(book1.getBookid()==bookid){
                book1.setBookname(book.getBookname());
                book1.setBookauthor(book.getBookauthor());
            }
            return null;
        }).collect(Collectors.toList());
        return book;
    }
}
