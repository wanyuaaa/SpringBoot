package com.boot.bean;

import lombok.*;

/**
 * @author wanyu
 * @createTime 2022-03-19 23:43
 */

@Data//自动生成get set
@ToString//编译时生成toString
@NoArgsConstructor//无参构造器
//@AllArgsConstructor//全参构造器
@EqualsAndHashCode//对比
public class User {
    String name;
    Integer age;

    Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
