package com.vien.community.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.vien.community.database.dao.UserDao;
import com.vien.community.database.entity.User;

/**
 * Created by VienWang on 2020/11/22
 * Describe:single instance of the database
 */
@Database(entities = {User.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    static final String TABLE_NAME = "user";

    static final Object mLock = new Object();

    public abstract UserDao UserDao();

    static AppDataBase _INSTANCE = null;

    public static AppDataBase getInstance(Context context){
        if(_INSTANCE == null){
            synchronized (mLock){
                if(_INSTANCE == null){
                    _INSTANCE = Room.databaseBuilder(context, AppDataBase.class, TABLE_NAME)
                            .build();
                }
            }
        }
        return _INSTANCE;
    }

}
