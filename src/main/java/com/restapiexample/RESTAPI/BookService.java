package com.restapiexample.RESTAPI;


import org.springframework.stereotype.Component;

import static com.restapiexample.RESTAPI.BookController.blist;

@Component
public class BookService {

    public static Book addbook(Book b){
        blist.add(b);
        return b;
    }


}
