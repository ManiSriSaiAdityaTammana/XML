package com.example.mini_project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VITAPDB extends SQLiteOpenHelper {

    public static final String DBNAME = "Login.db";
    public String name;
    public String regno;
    public String email;
    public String phno;



    public VITAPDB(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MYDB) {
        MYDB.execSQL("create Table users(name TEXT,regNo TEXT primary key,branch TEXT,phno TEXT,email TEXT,password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MYDB, int oldVersion, int newVersion) {
        MYDB.execSQL("drop Table if exists users");
    }

    public Boolean insertData(String name,String regNo, String branch,String phno,String email,String password) {
        SQLiteDatabase MYDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        contentValues.put("regno",regNo);
        contentValues.put("branch", branch);
        contentValues.put("phno", phno);
        contentValues.put("email", email);
        contentValues.put("password",password);
        long result = MYDB.insert("users", null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public Boolean checkusername(String username) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where regNo=?", new String[]{username});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean checkusernamepassword(String username,String password) {
        SQLiteDatabase MyDB = this.getWritableDatabase();
        Cursor cursor = MyDB.rawQuery("Select * from users where regNo =? and password= ?", new String[]{username, password});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;

    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }



















}
