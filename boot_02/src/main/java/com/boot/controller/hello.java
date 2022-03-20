package com.boot.controller;

import com.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanyu
 * @createTime 2022-03-20 17:45
 */
@RestController
public class hello {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public Person getPerson(){
        return person;
    }
}
