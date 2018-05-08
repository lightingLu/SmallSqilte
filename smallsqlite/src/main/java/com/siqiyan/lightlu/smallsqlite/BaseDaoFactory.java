package com.siqiyan.lightlu.smallsqlite;

import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;

/**
 * 创建日期：2018/5/7 on 22:02
 *
 * @author ludaguang
 * @version 1.0
 *          类说明：操作数据库的类
 */

public class BaseDaoFactory {
    private String sqlliteDataBasePath;
    private SQLiteDatabase sqLiteDatabase;

    private static BaseDaoFactory instance=new BaseDaoFactory();
    public BaseDaoFactory() {
        sqlliteDataBasePath= Environment.getExternalStorageDirectory().getAbsolutePath()+"/teacher.db";
        openDbHelper();

    }

    public  synchronized  <T extends  BaseDao<M>,M> T getDataHelper(Class<T> clazz,Class<M> entityClass)
    {
        BaseDao baseDao=null;
        try {
            baseDao=clazz.newInstance();
            baseDao.init(entityClass,sqLiteDatabase);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return (T) baseDao;
    }




    private void openDbHelper() {
      this.sqLiteDatabase=SQLiteDatabase.openOrCreateDatabase(sqlliteDataBasePath,null );
    }

    public static BaseDaoFactory getInstance(){
        return instance;
    }



}
