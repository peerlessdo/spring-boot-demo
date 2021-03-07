package com.example.springbootdemo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 * User: Wangzhe
 * Date: 2020/10/05 22:15
 * Description:
 * Version: V1.0
 */

/**
 * 将配置文件中配置的每个属性的值，映射到这个组件中
 * @ConfigurationProperties：告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定；
 * prefix = "person"：指明配置文件中哪个下面的所有属性进行一一映射
 * 默认从全局配置文件中获取值
 *
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能，加上@Component组件
 *
 * component注解，和在xml文件中使用bean标签的作用是一样的，而使用bean标签进行set注入时，
 * 要求目标对象必须set方法，才能够实现注入，所以属性为null的，检查一下有没有set方法(Boolean类型的属性命名is开头的要注意这一点)
 */

@ConfigurationProperties(prefix = "person")
@Component
@PropertySource(value = "classpath:person.properties")
public class Person {

    private String name;
    private Integer age;
    private Boolean isBoss;
    private Date birth;
    private String str1;
    private String str2;
    private String homeAdd;

    private Map<String, Object> maps;
    private List<String> lists;

    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isBoss=" + isBoss +
                ", birth=" + birth +
                ", str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                ", homeAdd='" + homeAdd + '\'' +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(String homeAdd) {
        this.homeAdd = homeAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return isBoss;
    }

    public void setBoss(Boolean boss) {
        isBoss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
