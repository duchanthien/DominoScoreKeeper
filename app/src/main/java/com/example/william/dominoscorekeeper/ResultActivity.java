package com.example.william.dominoscorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.william.dominoscorekeeper.adapter.ResultAdapter;
import com.example.william.dominoscorekeeper.data.DaoRound;
import com.example.william.dominoscorekeeper.model.GameModel;
import com.example.william.dominoscorekeeper.model.Roundmodel;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    DaoRound daoRound;
    List<Roundmodel> roundmodels;
    GameModel model;
    ListView lv;

    TextView tvPlayerOneName, tvPlayerTwoName, tvPlayerThreeName, tvPlayerFourName;

    TextView tvPlayerOneScore, tvPlayerTwoScore, tvPlayerThreeScore, tvPlayerFourScore;

    int playerOneFinalScore = 0, playerTwoFinalScore = 0, playerThreeFinalScore = 0, playerFourFinalScore = 0;

    String playerOneName = "", playerTwoName = "", playerThreeName = "", playerFourName = " ";

    Button btnEndGame, btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        daoRound = new DaoRound(ResultActivity.this);
        roundmodels = new ArrayList<>();
        model = (GameModel) getIntent().getSerializableExtra("gamemodel");

        initViews();

        displayData();

    }

    public void initViews() {
        lv = (ListView) findViewById(R.id.listview_result);

        btnContinue = (Button) findViewById(R.id.btn_continue);
        btnEndGame = (Button) findViewById(R.id.btn_end_game);

        btnContinue.setOnClickListener(this);
        btnEndGame.setOnClickListener(this);

        tvPlayerOneName = (TextView) findViewById(R.id.tv_playerone_name);
        tvPlayerTwoName = (TextView) findViewById(R.id.tv_playertwo_name);
        tvPlayerThreeName = (TextView) findViewById(R.id.tv_playerthree_name);
        tvPlayerFourName = (TextView) findViewById(R.id.tv_playerfour_name);

        tvPlayerOneScore = (TextView) findViewById(R.id.tv_playerone_score);
        tvPlayerTwoScore = (TextView) findViewById(R.id.tv_playertwo_score);
        tvPlayerThreeScore = (TextView) findViewById(R.id.tv_playerthree_score);
        tvPlayerFourScore = (TextView) findViewById(R.id.tv_playerfour_score);

    }

    public void displayData() {
        roundmodels = daoRound.getRoundData(model.getGameid());
        ResultAdapter adapter = new ResultAdapter(ResultActivity.this, roundmodels, model);
        lv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        displayFinalResult(roundmodels);

    }

    public void displayFinalResult(List<Roundmodel> list) {

        if (list.size() > 0) {

            for (int i = 0; i < list.size(); i++) {
                playerOneFinalScore += list.get(i).getPlayerOneScore();
                playerTwoFinalScore += list.get(i).getPlayerTwoScore();
                playerThreeFinalScore += list.get(i).getPlayerThreeScore();
                playerFourFinalScore += list.get(i).getPlayerFourScore();


            }

            playerOneName = list.get(0).getPlayerOneName();
            playerTwoName = list.get(0).getPlayerTwoName();
            playerThreeName = list.get(0).getPlayerThreeName();
            playerFourName = list.get(0).getPlayerFourName();

            displayUserName();

            displayResultScore();
        }
    }

    public void displayUserName() {
        tvPlayerOneName.setText(playerOneName);
        tvPlayerTwoName.setText(playerTwoName);
        tvPlayerThreeName.setText(playerThreeName);
        tvPlayerFourName.setText(playerFourName);
    }

    public void displayResultScore() {
        tvPlayerOneScore.setText(String.valueOf(playerOneFinalScore));
        tvPlayerTwoScore.setText(String.valueOf(playerTwoFinalScore));
        tvPlayerThreeScore.setText(String.valueOf(playerThreeFinalScore));
        tvPlayerFourScore.setText(String.valueOf(playerFourFinalScore));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
        setResult(RESULT_OK);
        finish();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_continue:
                //Intent intent = new Intent();
                setResult(RESULT_OK);
                finish();
                break;
            case R.id.btn_end_game:
                //Intent intent2 = new Intent();
                setResult(RESULT_CANCELED);
                finish();
                break;
        }
    }
}
