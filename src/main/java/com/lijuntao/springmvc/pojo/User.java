package com.lijuntao.springmvc.pojo;
import javax.persistence.Entity;

@Entity
public class User {

    private int id;


    private String name;
    private String password;
    private int age;
    //如果没有无参构造器，则报错，无法装载pojo
    public User() {

    }
    public int getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password == null ? null : password.trim();
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String username, String password, int age) {
        super();
        this.name = username;
        this.password = password;
        this.age = age;
    }




    @Override
    public String toString() {
        return "User [id=" + id + ", userName=" + name + ", password="
                + password + ", age=" + age + "]";
    }



}

