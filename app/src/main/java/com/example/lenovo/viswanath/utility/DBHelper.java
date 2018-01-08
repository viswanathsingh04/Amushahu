package com.example.lenovo.viswanath.utility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.lenovo.viswanath.model.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Vpsingh on 12/29/2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Amushuhu.sqlite";
    public static final String NEWS_TABLE_NAME = "Amushuhu_Data";
    public static final String NEWS_COLUMN_NEWS_ID = "row_id";
    public static final String NEWS_COLUMN_REGION_NAME = "region_name";
    public static final String NEWS_COLUMN_CLUSTOR_NAME = "cluster_name";
    //public static final String NEWS_COLUMN_COUNTRY_NAME = "country_name";
    public static final String NEWS_COLUMN_DISTRIBUTOR_NAME = "distributor_name";
    private static final int DATABASE_VERSION = 1;
    private Context context;
    ContentValues Values = new ContentValues();
    private HashMap hp;
    private SQLiteDatabase db;
    public Cursor res;
    private Cursor cursor;
    private ArrayList<HashMap<String, String>> arList = new ArrayList<HashMap<String, String>>();
    ArrayList<HashMap<String, String>> List_All = new ArrayList<HashMap<String, String>>();
    int[] yData;
    public static final String TAG = "dbhandler";
    private String name;


    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Amushuhu_Data " + "(id integer primary key AUTOINCREMENT NOT NULL, row_id integer, region_name text,cluster_name text,distributor_name text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

    public boolean insert(Integer id, String region_name, String cluster_name, String distributor_name) {

        SQLiteDatabase db = this.getWritableDatabase();

        Values.put(NEWS_COLUMN_NEWS_ID, id);
        Values.put(NEWS_COLUMN_REGION_NAME, region_name);
        Values.put(NEWS_COLUMN_CLUSTOR_NAME, cluster_name);
        //Values.put(NEWS_COLUMN_COUNTRY_NAME, country_name);
        Values.put(NEWS_COLUMN_DISTRIBUTOR_NAME, distributor_name);

        long rowInserted = db.insert(NEWS_TABLE_NAME, null, Values);
        /*if (rowInserted != -1)
            Toast.makeText(context, "New row added, row id: " + rowInserted, Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(context, "Rows Not Updated", Toast.LENGTH_SHORT).show();*/
        return true;
    }

    //Open Database
    public DBHelper open() throws SQLException {
        this.getWritableDatabase();

        return this;
    }

    // Close Database
    public void close() {
        this.close();
    }

    public ArrayList<HashMap<String, String>> GetSingle(String str_id) {
        String SingleQuery = "SELECT * FROM news where row_id ='" + str_id + "'";
        SQLiteDatabase db = this.getReadableDatabase();

        cursor = db.rawQuery(SingleQuery, null);
        System.out.println(cursor.getCount());
        if (cursor.moveToFirst()) {
            HashMap<String, String> todo = new HashMap<String, String>();
            do {
                name = cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_REGION_NAME));
                todo.put(NEWS_COLUMN_NEWS_ID, cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_NEWS_ID)));
                todo.put(NEWS_COLUMN_REGION_NAME, cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_REGION_NAME)));
                todo.put(NEWS_COLUMN_CLUSTOR_NAME, cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_CLUSTOR_NAME)));
                //todo.put(NEWS_COLUMN_COUNTRY_NAME, cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_COUNTRY_NAME)));
                todo.put(NEWS_COLUMN_DISTRIBUTOR_NAME, cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_DISTRIBUTOR_NAME)));
                arList.add(todo);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return arList;
    }

    public List<Data> GetListObj() {
        SQLiteDatabase db = this.getReadableDatabase();
        List<Data> data = new ArrayList<>();
        cursor = db.rawQuery("select * from Amushuhu_Data limit 5", null);
        cursor.moveToFirst();
        Data data1=null;
        System.out.println(cursor.getCount());
        try {
            while (cursor.moveToNext()) {
                data1 = new Data();
                Integer id = Integer.valueOf(cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_NEWS_ID)));
                String region_name = cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_REGION_NAME));
                String clustor_name = cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_CLUSTOR_NAME));
                String distributor_name = cursor.getString(cursor.getColumnIndex(NEWS_COLUMN_DISTRIBUTOR_NAME));
                data1.setId(id);
                data1.setRegion_name(region_name);
                data1.setCluster_name(clustor_name);
                data1.setDistributor_name(distributor_name);
                data.add(data1);
            }
        } finally {
            cursor.close();
        }
        db.close();
        return data;
    }
}