package com.example.springDataMongon.controller;

import com.example.springDataMongon.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/1/20 13:36
 * @work //TODO
 */
@RestController
@RequestMapping("/user")
public class BookController {


    @Autowired
    BookService bookService;


    @RequestMapping("/getBook")
    public String getBook() {
        return bookService.getBook();
    }

}
