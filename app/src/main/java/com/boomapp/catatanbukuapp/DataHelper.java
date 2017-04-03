package com.boomapp.catatanbukuapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by arie on 3/30/17.
 */
public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "catatanbuku.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table catatan_buku(ID integer primary key autoincrement , kode_buku text null , judul text null , pengarang text null , penerbit text null , tahun text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO catatan_buku(kode_buku , judul , pengarang , penerbit , tahun) VALUES ('INF01' , 'Android Development Complete' ,'Andi' ,'Informatika' , '2012');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
