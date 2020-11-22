package com.vien.community.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.vien.community.database.entity.User;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

/**
 * Created by VienWang on 2020/11/22
 * Describe:user data access object
 */
public interface UserDao {

    @Query("SELECT * FROM User")
    public LiveData<List<User>> getUser();

    @Query("SELECT * FROM user WHERE userId IN (:userIds)")
    public List<User> getUser(int[] userIds);

    @Query("SELECT * FROM User where userId LIKE :userId")
    public User getUser(int userId);

    @Insert(onConflict = REPLACE)
    public void insert(User user);

    @Delete
    public void delete(User user);

    @Update
    public void update(User user);
}
