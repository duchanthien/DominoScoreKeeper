package com.example.william.dominoscorekeeper.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by william on 27/09/2017.
 */

public class GameModel implements Serializable {

    private int gameid;
    private String playerOneName;
    private String playerTwoName;
    private String playerThreeName;
    private String playerFourName;

    private List<Roundmodel> roundmodelList;


    public GameModel() {

    }

    public GameModel(String playerOneName, String playerTwoName, String playerThreeName, String playerFourName) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerThreeName = playerThreeName;
        this.playerFourName = playerFourName;
    }

    public GameModel(String playerOneName, String playerTwoName, String playerThreeName, String playerFourName, List<Roundmodel> roundmodelList) {
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerThreeName = playerThreeName;
        this.playerFourName = playerFourName;
        this.roundmodelList = roundmodelList;
    }

    public GameModel(int gameid, String playerOneName, String playerTwoName, String playerThreeName, String playerFourName) {
        this.gameid = gameid;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerThreeName = playerThreeName;
        this.playerFourName = playerFourName;
    }

    public GameModel(int gameid, String playerOneName, String playerTwoName, String playerThreeName, String playerFourName, List<Roundmodel> roundmodelList) {
        this.gameid = gameid;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerThreeName = playerThreeName;
        this.playerFourName = playerFourName;
        this.roundmodelList = roundmodelList;
    }

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public String getPlayerOneName() {
        return playerOneName;
    }

    public void setPlayerOneName(String playerOneName) {
        this.playerOneName = playerOneName;
    }

    public String getPlayerTwoName() {
        return playerTwoName;
    }

    public void setPlayerTwoName(String playerTwoName) {
        this.playerTwoName = playerTwoName;
    }

    public String getPlayerThreeName() {
        return playerThreeName;
    }

    public void setPlayerThreeName(String playerThreeName) {
        this.playerThreeName = playerThreeName;
    }

    public String getPlayerFourName() {
        return playerFourName;
    }

    public void setPlayerFourName(String playerFourName) {
        this.playerFourName = playerFourName;
    }
    public List<Roundmodel> getRoundmodelList() {
        return roundmodelList;
    }

    public void setRoundmodelList(List<Roundmodel> roundmodelList) {
        this.roundmodelList = roundmodelList;
    }
}
