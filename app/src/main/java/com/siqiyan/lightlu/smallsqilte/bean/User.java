package com.siqiyan.lightlu.smallsqilte.bean;

import com.siqiyan.lightlu.smallsqlite.annotion.DbField;
import com.siqiyan.lightlu.smallsqlite.annotion.DbTable;

/**
 * 创建日期：2018/5/7 on 23:34
 *
 * @author ludaguang
 * @version 1.0
 *          类说明：
 */
@DbTable("tb_user")
public class User {


    @DbField("name")
    private String name;
    @DbField("age")
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
