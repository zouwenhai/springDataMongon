package com.example.springDataMongon.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.io.Serializable;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/4/28 11:48
 * @work //TODO
 */
@Getter
@Setter
@Document(collection = "runoob")
public class Book implements Serializable {


    @Id
    private String id;

    private String name;

}
