package com.example.william.dominoscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.william.dominoscorekeeper.adapter.ResultAdapter;
import com.example.william.dominoscorekeeper.data.DaoRound;
import com.example.william.dominoscorekeeper.model.GameModel;
import com.example.william.dominoscorekeeper.model.Roundmodel;

import java.util.ArrayList;
import java.util.List;

public class ResultActivity extends AppCompatActivity {

    DaoRound daoRound;
    List<Roundmodel> roundmodels;
    GameModel model;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        daoRound = new DaoRound(ResultActivity.this);
        roundmodels = new ArrayList<>();
        model = (GameModel) getIntent().getSerializableExtra("gamemodel");
        lv = (ListView)findViewById(R.id.listview_result);

        displayData();

    }

    public void displayData(){
        roundmodels = daoRound.getRoundData(model.getGameid());
        ResultAdapter adapter = new ResultAdapter(ResultActivity.this, roundmodels, model);
        lv.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}
