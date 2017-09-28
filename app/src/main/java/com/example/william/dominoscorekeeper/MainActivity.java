package com.example.william.dominoscorekeeper;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.william.dominoscorekeeper.data.DaoRound;
import com.example.william.dominoscorekeeper.model.GameModel;
import com.example.william.dominoscorekeeper.model.Roundmodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvRound;

    TextView tvPlayerOneName, tvPlayerTwoName, tvPlayerThreeName, tvPlayerFourName;

    TextView tvPlayerOneScore, tvPlayerTwoScore, tvPlayerThreeScore, tvPlayerFourScore;

    Button btnAddPlayerOneScore, btnAddPlayerTwoScore, btnAddPlayerThreeScore, btnAddPlayerFourScore;

    Button btnSubPlayerOneScore, btnSubPlayerTwoScore, btnSubPlayerThreeScore, btnSubPlayerFourScore;

    Button btnNextRound, btnEndGame;

    int playerone_score = 0;
    int playertwo_score = 0;
    int playerthree_score = 0;
    int playerfour_score = 0;

    int round_count = 0;
    int new_game = 0;

    String playerOneName = "", playerTwoName = "", playerThreeName = "", playerFourName = " ";

    List<GameModel> gameModelList = new ArrayList<>();
    List<Roundmodel> roundmodelList = new ArrayList<>();


    DaoRound daoRound;

    GameModel model;

    RelativeLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    public void initViews() {

        container = (RelativeLayout)findViewById(R.id.container);

        container.setVisibility(View.INVISIBLE);

        daoRound = new DaoRound(MainActivity.this);

        tvRound = (TextView) findViewById(R.id.tv_round);
        tvPlayerOneName = (TextView) findViewById(R.id.tv_playerone_name);
        tvPlayerTwoName = (TextView) findViewById(R.id.tv_playertwo_name);
        tvPlayerThreeName = (TextView) findViewById(R.id.tv_playerthree_name);
        tvPlayerFourName = (TextView) findViewById(R.id.tv_playerfour_name);

        tvPlayerOneScore = (TextView) findViewById(R.id.tv_playerone_score);
        tvPlayerTwoScore = (TextView) findViewById(R.id.tv_playertwo_score);
        tvPlayerThreeScore = (TextView) findViewById(R.id.tv_playerthree_score);
        tvPlayerFourScore = (TextView) findViewById(R.id.tv_playerfour_score);

        btnAddPlayerOneScore = (Button) findViewById(R.id.btn_add_five_player_one);
        btnAddPlayerTwoScore = (Button) findViewById(R.id.btn_add_five_player_two);
        btnAddPlayerThreeScore = (Button) findViewById(R.id.btn_add_five_player_three);
        btnAddPlayerFourScore = (Button) findViewById(R.id.btn_add_five_player_four);

        btnAddPlayerOneScore.setOnClickListener(this);
        btnAddPlayerTwoScore.setOnClickListener(this);
        btnAddPlayerThreeScore.setOnClickListener(this);
        btnAddPlayerFourScore.setOnClickListener(this);


        btnSubPlayerOneScore = (Button) findViewById(R.id.btn_sub_five_player_one);
        btnSubPlayerTwoScore = (Button) findViewById(R.id.btn_sub_five_player_two);
        btnSubPlayerThreeScore = (Button) findViewById(R.id.btn_sub_five_player_three);
        btnSubPlayerFourScore = (Button) findViewById(R.id.btn_sub_five_player_four);

        btnSubPlayerOneScore.setOnClickListener(this);
        btnSubPlayerTwoScore.setOnClickListener(this);
        btnSubPlayerThreeScore.setOnClickListener(this);
        btnSubPlayerFourScore.setOnClickListener(this);

        btnNextRound = (Button) findViewById(R.id.btn_next_round);
        btnEndGame = (Button) findViewById(R.id.btn_end_game);
        btnNextRound.setOnClickListener(this);
        btnEndGame.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_new_game:
                final AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                View view = getLayoutInflater().inflate(R.layout.new_game, null);
                dialog.setView(view);
                dialog.setTitle("New Game");

                final AlertDialog show = dialog.show();

                final EditText edtPlayerOneName = (EditText) view.findViewById(R.id.edt_playerone_name);
                final EditText edtPlayerTwoName = (EditText) view.findViewById(R.id.edt_playertwo_name);
                final EditText edtPlayerThreeName = (EditText) view.findViewById(R.id.edt_playerthree_name);
                final EditText edtPlayerFourName = (EditText) view.findViewById(R.id.edt_playerfour_name);

                final Button btn_new_game = (Button) view.findViewById(R.id.btn_new_game);

                btn_new_game.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if (edtPlayerOneName.getText().toString().isEmpty() == true
                                && edtPlayerTwoName.getText().toString().isEmpty() == true
                                && edtPlayerThreeName.getText().toString().isEmpty() == true
                                && edtPlayerFourName.getText().toString().isEmpty() == true) {
                            Toast.makeText(MainActivity.this, "Fields are empty!", Toast.LENGTH_LONG).show();

                        } else if (edtPlayerOneName.getText().toString().isEmpty() == true) {
                            Toast.makeText(MainActivity.this, "Field PlayerOne is empty!", Toast.LENGTH_LONG).show();

                        } else if (edtPlayerTwoName.getText().toString().isEmpty() == true) {
                            Toast.makeText(MainActivity.this, "Field PlayerOne is empty!", Toast.LENGTH_LONG).show();

                        } else if (edtPlayerThreeName.getText().toString().isEmpty() == true) {
                            Toast.makeText(MainActivity.this, "Field PlayerOne is empty!", Toast.LENGTH_LONG).show();

                        } else if (edtPlayerFourName.getText().toString().isEmpty() == true) {
                            Toast.makeText(MainActivity.this, "Field PlayerOne is empty!", Toast.LENGTH_LONG).show();

                        } else {
                            Toast.makeText(dialog.getContext(), "New Game Start", Toast.LENGTH_SHORT).show();
                            playerOneName = edtPlayerOneName.getText().toString();
                            playerTwoName = edtPlayerTwoName.getText().toString();
                            playerThreeName = edtPlayerThreeName.getText().toString();
                            playerFourName = edtPlayerFourName.getText().toString();

                            newGame();
                            setPlayerName();
                            container.setVisibility(View.VISIBLE);
                            show.dismiss();
                        }
                    }
                });

                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });


                break;
            case R.id.action_history:
                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setPlayerName() {
        tvPlayerOneName.setText(playerOneName);
        tvPlayerTwoName.setText(playerTwoName);
        tvPlayerThreeName.setText(playerThreeName);
        tvPlayerFourName.setText(playerFourName);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add_five_player_one:
                addPlayerScore(tvPlayerOneScore, 5);
                break;
            case R.id.btn_add_five_player_two:
                addPlayerScore(tvPlayerTwoScore, 5);
                break;
            case R.id.btn_add_five_player_three:
                addPlayerScore(tvPlayerThreeScore, 5);
                break;
            case R.id.btn_add_five_player_four:
                addPlayerScore(tvPlayerFourScore, 5);
                break;

            case R.id.btn_sub_five_player_one:
                subPlayerScore(tvPlayerOneScore, 5);
                break;
            case R.id.btn_sub_five_player_two:
                subPlayerScore(tvPlayerTwoScore, 5);
                break;
            case R.id.btn_sub_five_player_three:
                subPlayerScore(tvPlayerThreeScore, 5);
                break;
            case R.id.btn_sub_five_player_four:
                subPlayerScore(tvPlayerFourScore, 5);
                break;

            case R.id.btn_next_round:

                nextRound();

                break;
            case R.id.btn_end_game:
                endGame(model);
                break;
        }
    }

    public void endGame(GameModel model) {

        insertNewRound();

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("gamemodel", model);
        startActivityForResult(intent, 123);

        resetPlayersScore();

        resetPlayersName();

    }

    public void nextRound() {
        round_count = round_count + 1;
        tvRound.setText("Round: "+String.valueOf(round_count));

        insertNewRound();

        resetPlayersScore();
    }

    public void insertNewRound(){
        Roundmodel roundmodel = new Roundmodel(round_count, playerone_score, playertwo_score, playerthree_score, playerfour_score, playerOneName, playerTwoName, playerThreeName, playerFourName);
        daoRound.insertRound(roundmodel, new_game);

    }

    public void newGame() {

        round_count = 0;
        round_count += 1;
        tvRound.setText("Round: "+String.valueOf(round_count));
        resetPlayersScore();
        new_game += 1;

        model = new GameModel(new_game, playerOneName, playerTwoName, playerThreeName, playerFourName);
        daoRound.insertGame(model);

    }

    public void addPlayerScore(TextView tvScore, int score) {
        switch (tvScore.getId()) {
            case R.id.tv_playerone_score:
                playerone_score = playerone_score + score;
                tvScore.setText(String.valueOf(playerone_score));
                break;

            case R.id.tv_playertwo_score:
                playertwo_score = playertwo_score + score;
                tvScore.setText(String.valueOf(playertwo_score));
                break;

            case R.id.tv_playerthree_score:
                playerthree_score = playerthree_score + score;
                tvScore.setText(String.valueOf(playerthree_score));
                break;

            case R.id.tv_playerfour_score:
                playerfour_score = playerfour_score + score;
                tvScore.setText(String.valueOf(playerfour_score));
                break;

        }


    }

    public void subPlayerScore(TextView tvScore, int score) {
        switch (tvScore.getId()) {
            case R.id.tv_playerone_score:
                playerone_score = playerone_score - score;
                tvScore.setText(String.valueOf(playerone_score));
                break;

            case R.id.tv_playertwo_score:
                playertwo_score = playertwo_score - score;
                tvScore.setText(String.valueOf(playertwo_score));
                break;

            case R.id.tv_playerthree_score:
                playerthree_score = playerthree_score - score;
                tvScore.setText(String.valueOf(playerthree_score));
                break;

            case R.id.tv_playerfour_score:
                playerfour_score = playerfour_score - score;
                tvScore.setText(String.valueOf(playerfour_score));
                break;

        }

    }

    public void resetPlayersScore() {

        playerone_score = 0;
        playertwo_score = 0;
        playerthree_score = 0;
        playerfour_score = 0;

        tvPlayerOneScore.setText(String.valueOf(playerone_score));
        tvPlayerTwoScore.setText(String.valueOf(playertwo_score));
        tvPlayerThreeScore.setText(String.valueOf(playerthree_score));
        tvPlayerFourScore.setText(String.valueOf(playerfour_score));



    }

    public void resetPlayersName(){

        playerOneName = " ";
        playerTwoName = " ";
        playerThreeName = " ";
        playerFourName = " ";

        tvPlayerOneName.setText(playerOneName);
        tvPlayerTwoName.setText(playerTwoName);
        tvPlayerThreeName.setText(playerThreeName);
        tvPlayerFourName.setText(playerFourName);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
