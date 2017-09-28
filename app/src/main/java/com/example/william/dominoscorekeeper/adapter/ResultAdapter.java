package com.example.william.dominoscorekeeper.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.william.dominoscorekeeper.R;
import com.example.william.dominoscorekeeper.model.GameModel;
import com.example.william.dominoscorekeeper.model.Roundmodel;

import java.util.List;

/**
 * Created by william on 27/09/2017.
 */

public class ResultAdapter extends BaseAdapter {

    List<Roundmodel> list;

    Context context;

    GameModel model;

    public ResultAdapter(Context context, List<Roundmodel> list, GameModel model) {
        this.context = context;
        this.list = list;
        this.model = model;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public static class ViewHolder {

        TextView tvRound, tvGame;
        TextView tvPlayerOneName, tvPlayerOneScore;
        TextView tvPlayerTwoName, tvPlayerTwoScore;
        TextView tvPlayerThreeName, tvPlayerThreeScore;
        TextView tvPlayerFourName, tvPlayerFourScore;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder viewHolder;
        if (view == null) {
            view = inflater.inflate(R.layout.item_result, null);
            viewHolder = new ViewHolder();

            viewHolder.tvRound = (TextView) view.findViewById(R.id.tvround);
            //viewHolder.tvGame = (TextView)view.findViewById(R.id.tv_game);
            viewHolder.tvPlayerOneName = (TextView) view.findViewById(R.id.tv_playerone_name);
            viewHolder.tvPlayerTwoName = (TextView) view.findViewById(R.id.tv_playertwo_name);
            viewHolder.tvPlayerThreeName = (TextView) view.findViewById(R.id.tv_playerthree_name);
            viewHolder.tvPlayerFourName = (TextView) view.findViewById(R.id.tv_playerfour_name);

            viewHolder.tvPlayerOneScore = (TextView) view.findViewById(R.id.tv_playerone_score);
            viewHolder.tvPlayerTwoScore = (TextView) view.findViewById(R.id.tv_playertwo_score);
            viewHolder.tvPlayerThreeScore = (TextView) view.findViewById(R.id.tv_playerthree_score);
            viewHolder.tvPlayerFourScore = (TextView) view.findViewById(R.id.tv_playerfour_score);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.tvRound.setText(list.get(i).getRoundId() + "");

        viewHolder.tvPlayerOneName.setText(list.get(i).getPlayerOneName());
        viewHolder.tvPlayerTwoName.setText(list.get(i).getPlayerTwoName());
        viewHolder.tvPlayerThreeName.setText(list.get(i).getPlayerThreeName());
        viewHolder.tvPlayerFourName.setText(list.get(i).getPlayerFourName());

        viewHolder.tvPlayerOneScore.setText(String.valueOf(list.get(i).getPlayerOneScore()));
        viewHolder.tvPlayerTwoScore.setText(String.valueOf(list.get(i).getPlayerTwoScore()));
        viewHolder.tvPlayerThreeScore.setText(String.valueOf(list.get(i).getPlayerThreeScore()));
        viewHolder.tvPlayerFourScore.setText(String.valueOf(list.get(i).getPlayerFourScore()));

        return view;
    }
}
