package com.siqiyan.lightlu.smallsqlite;

/**
 * 创建日期：2018/5/7 on 22:02
 *
 * @author ludaguang
 * @version 1.0
 *          类说明：
 */

public class BaseDao<T> implements IBaseDao<T> {
    @Override
    public long insert(T entity) {
        return 0;
    }

    @Override
    public long update(T entity) {
        return 0;
    }
}
