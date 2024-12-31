package com.androidapp.roomdatabaseexample.Roomdb;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey (autoGenerate = true)
    public  int uId;
    @ColumnInfo (name = "first_name")
    public String firstName;

    @ColumnInfo (name = "last_name")
    public  String lastName;


    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public User(int uId, String firstName, String lastName) {
        this.uId = uId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
