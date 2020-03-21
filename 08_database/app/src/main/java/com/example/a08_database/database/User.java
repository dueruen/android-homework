package com.example.a08_database.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {
    @PrimaryKey
    public int uid;
    public String name;
    public String address;
    public long dateOfBirth;
}
