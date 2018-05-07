package com.siqiyan.lightlu.smallsqlite;

/**
 * 创建日期：2018/5/7 on 22:02
 *
 * @author ludaguang
 * @version 1.0
 *          类说明：
 */

public interface IBaseDao<T> {
    /**
     * 插入数据库
     * @param entity
     * @return
     */
    long  insert(T entity);

    /**
     * 更新数据库
     * @param entity
     * @return
     */
    long update(T entity);


}
