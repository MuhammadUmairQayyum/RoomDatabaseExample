package com.androidapp.roomdatabaseexample.Roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM user WHERE first_name LIKE :first And last_name LIKE  :last Limit 1")
    User findByName(String first, String last);

    @Insert void insert( User ... users);

    @Delete
    void  delete(User user);




}
