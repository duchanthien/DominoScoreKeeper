package com.example.william.dominoscorekeeper.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by william on 27/09/2017.
 */

public class GameDBHelper extends SQLiteOpenHelper {

    public GameDBHelper(Context context) {
        super(context, "gamedata", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sql1 = "Create table table_round(" +
                "roundid integer primary key autoincrement, " +
                "player_one_score integer not null , " +
                "player_two_score integer not null , " +
                "player_three_score integer not null , " +
                "player_four_score integer not null , " +
                "gameid integer" +
                ")";

        sqLiteDatabase.execSQL(sql1);

        String sql2 = "Create table table_game(" +
                "gameid integer primary key, " +
                "player_one_name text not null, " +
                "player_two_name text not null, " +
                "player_three_name text not null, " +
                "player_four_name text not null " +
                ")";

        sqLiteDatabase.execSQL(sql2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS table_game ");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS table_round ");

        onCreate(sqLiteDatabase);
    }
}
