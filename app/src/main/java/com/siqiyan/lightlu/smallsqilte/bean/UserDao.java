package com.siqiyan.lightlu.smallsqilte.bean;

import com.siqiyan.lightlu.smallsqlite.BaseDao;

/**
 * 创建日期：2018/5/7 on 23:38
 *
 * @author ludaguang
 * @version 1.0
 *          类说明：
 */

public class UserDao extends BaseDao {
    @Override
    protected String createTable() {
        return "create table if not exists tb_user(name varchar(20),password varchar(10))";
    }
}
