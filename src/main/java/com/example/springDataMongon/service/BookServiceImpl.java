package com.example.springDataMongon.service;

import com.alibaba.fastjson.JSONObject;
import com.example.springDataMongon.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/4/27 14:55
 * @work //TODO
 */
@Service
@Slf4j
public class BookServiceImpl implements BookService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveBook(Book book) {
        mongoTemplate.save(book);
    }

    @Override
    public String getBook() {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is("菜鸟教程"));
        List<Book> list = mongoTemplate.find(query, Book.class);
        return JSONObject.toJSONString(list);
    }
}
