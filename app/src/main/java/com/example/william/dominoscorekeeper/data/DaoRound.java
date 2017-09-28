package com.example.william.dominoscorekeeper.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.william.dominoscorekeeper.model.GameModel;
import com.example.william.dominoscorekeeper.model.Roundmodel;

import java.util.ArrayList;

/**
 * Created by william on 27/09/2017.
 */

public class DaoRound {

    GameDBHelper helper;
    SQLiteDatabase db;

    public DaoRound(Context context) {
        helper = new GameDBHelper(context);
        db = helper.getWritableDatabase();
    }

    public long insertGame(GameModel gameModel) {
        ContentValues values = new ContentValues();
        values.put("gameid", gameModel.getGameid());
        values.put("player_one_name", gameModel.getPlayerOneName());
        values.put("player_two_name", gameModel.getPlayerTwoName());
        values.put("player_three_name", gameModel.getPlayerThreeName());
        values.put("player_four_name", gameModel.getPlayerFourName());

        long result = db.insert("table_game", null, values);

        return result;
    }

    public long insertRound(Roundmodel roundmodel, int gameid) {
        ContentValues values = new ContentValues();
        values.put("player_one_score", roundmodel.getPlayerOneScore());
        values.put("player_two_score", roundmodel.getPlayerTwoScore());
        values.put("player_three_score", roundmodel.getPlayerThreeScore());
        values.put("player_four_score", roundmodel.getPlayerFourScore());
        values.put("player_one_name", roundmodel.getPlayerOneName());
        values.put("player_two_name", roundmodel.getPlayerTwoName());
        values.put("player_three_name", roundmodel.getPlayerThreeName());
        values.put("player_four_name", roundmodel.getPlayerFourName());
        values.put("gameid", gameid);

        long result = db.insert("table_round", null, values);

        return result;
    }

    public ArrayList<GameModel> getGameData() {
        ArrayList<GameModel> list = new ArrayList<>();

        Cursor cursor = db.rawQuery("SELECT * FROM table_game ", null);
        if (cursor.moveToFirst()) {
            do {
                int gameid = cursor.getInt(0);
                String playerOneName = cursor.getString(1);
                String playerTwoName = cursor.getString(2);
                String playerThreeName = cursor.getString(3);
                String playerFourName = cursor.getString(4);


                GameModel model = new GameModel(gameid, playerOneName, playerTwoName, playerThreeName, playerFourName);
                list.add(model);

            } while (cursor.moveToNext());
        }

        return list;
    }

    public ArrayList<Roundmodel> getRoundData(int gameId) {
        ArrayList<Roundmodel> roundmodels = new ArrayList<>();
        Cursor cursor = db.rawQuery("SELECT * FROM table_round where gameid = " + gameId, null);
        if (cursor.moveToFirst()) {
            do {
                int round = cursor.getInt(0);
                int playerOneScore = cursor.getInt(1);
                int playerTwoScore = cursor.getInt(2);
                int playerThreeScore = cursor.getInt(3);
                int playerFourScore = cursor.getInt(4);
                String playerOneName = cursor.getString(5);
                String playerTwoName = cursor.getString(6);
                String playerThreeName = cursor.getString(7);
                String playerFourName = cursor.getString(8);

                Roundmodel roundmodel = new Roundmodel(round, playerOneScore, playerTwoScore, playerThreeScore, playerFourScore, playerOneName, playerTwoName, playerThreeName, playerFourName);
                roundmodels.add(roundmodel);

            } while (cursor.moveToNext());
        }

        return roundmodels;
    }


}
