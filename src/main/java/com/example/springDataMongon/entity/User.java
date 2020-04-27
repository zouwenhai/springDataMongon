package com.example.springDataMongon.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/4/27 14:49
 * @work //TODO
 */

@Document(collection = "User")
public class User {

    @Id
    private String id;

    private String useName;

    private String realName;

    private Integer gender;
}
