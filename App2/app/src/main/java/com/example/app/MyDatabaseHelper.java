package com.example.app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String DBNAME ="Login.db";
    public static final int DATABASE_VERSION=1;
    public MyDatabaseHelper(Context context ) {

        super(context, DBNAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table user(usernsme TEXT primary key, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop Table if exists user");
    }


    public Boolean insertData (String username, String password){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        long result = DB.insert("users",null,contentValues);
        if (result==-1)return false;
        else
            return true;
    }

    public Boolean checkusername(String username){
        SQLiteDatabase MyDB= this.getWritableDatabase();
        Cursor cursor =MyDB.rawQuery("select * from users where username = ?",new String[] {username});
        if(cursor.getCount()>0)
            return true;
        else
            return false;

    }
    public Boolean checkusernamepassword(String username,String password){
        SQLiteDatabase MyDB= this.getWritableDatabase();
        Cursor cursor =MyDB.rawQuery("select * from users where username = ? and password= ?",new String[] {username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;

    }

}
