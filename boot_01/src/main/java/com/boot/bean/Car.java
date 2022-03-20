package com.boot.bean;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wanyu
 * @createTime 2022-03-20 15:32
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 *
 * 1、@EnableConfigurationProperties + @ConfigurationProperties
 * 2、@Component + @ConfigurationProperties
 *
 */
//@Component
@Data//自动生成get set
@ToString//编译时生成toString
@NoArgsConstructor//无参构造器
@AllArgsConstructor//全参构造器
@EqualsAndHashCode//对比
@ConfigurationProperties(prefix = "mycar")//读取配置文件，并且识别为
public class Car {
    private String brand;
    private Integer price;
}
