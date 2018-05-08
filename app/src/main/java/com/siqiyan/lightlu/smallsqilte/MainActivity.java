package com.siqiyan.lightlu.smallsqilte;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.siqiyan.lightlu.smallsqilte.bean.User;
import com.siqiyan.lightlu.smallsqilte.bean.UserDao;
import com.siqiyan.lightlu.smallsqlite.BaseDaoFactory;
import com.siqiyan.lightlu.smallsqlite.IBaseDao;

public class MainActivity extends AppCompatActivity {
    IBaseDao<User> baseDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        baseDao=BaseDaoFactory.getInstance().getDataHelper(UserDao.class,User.class);

    }

    public void insert(View view){
        User user=new User("张三","20");
        baseDao.insert(user);
    }
    public void delete(View view){

    }
    public void update(View view){

    }
    public void query(View view){

    }
}
