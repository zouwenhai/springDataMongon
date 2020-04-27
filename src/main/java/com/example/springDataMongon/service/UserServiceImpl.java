package com.example.springDataMongon.service;

import com.alibaba.fastjson.JSONObject;
import com.example.springDataMongon.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2020/4/27 14:55
 * @work //TODO
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveUser(User user) {
        user = mongoTemplate.save(user);
        log.info("result:{}", JSONObject.toJSONString(user));
    }
}
