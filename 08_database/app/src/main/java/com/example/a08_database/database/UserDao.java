package com.example.a08_database.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user where uid = 1")
    User getUser();

    @Update
    int update(User user);

    @Insert
    void insert(User user);

    @Query("SELECT COUNT(*) from user")
    int countUsers();
}
