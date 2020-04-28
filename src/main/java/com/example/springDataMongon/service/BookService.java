package com.example.springDataMongon.service;


import com.example.springDataMongon.entity.Book;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/4/27 14:55
 * @work //TODO
 */
public interface BookService {


    void saveBook(Book book);

    String getBook();
}
