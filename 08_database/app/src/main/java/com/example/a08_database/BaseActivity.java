package com.example.a08_database;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.a08_database.database.AppDatabase;
import com.example.a08_database.database.User;

public class BaseActivity extends AppCompatActivity {

    protected AppDatabase db;
    protected User currentUser;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        db = AppDatabase.getAppDatabase(this);
        if(db.userDao().countUsers() == 0){
            currentUser = new User();
            currentUser.uid = 1;
            currentUser.address = "";
            currentUser.dateOfBirth = 0;
            currentUser.name = "";
            db.userDao().insert(currentUser);
        }
        else{
            currentUser = db.userDao().getUser();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}