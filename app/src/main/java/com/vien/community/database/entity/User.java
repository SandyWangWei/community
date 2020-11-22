package com.vien.community.database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * Created by VienWang on 2020/11/22
 * Describe:the user data
 */
@Entity(tableName = "user")
public class User {

    @PrimaryKey
    int userId;

    @ColumnInfo(name = "user_name", defaultValue = "ser_name")
    public String name = "";

    @ColumnInfo(name = "user_age")
    public String age = "";

    @ColumnInfo(name = "user_gender")
    public String gender = "";

    public double height ;

    public String avatarIcon = "";
}
