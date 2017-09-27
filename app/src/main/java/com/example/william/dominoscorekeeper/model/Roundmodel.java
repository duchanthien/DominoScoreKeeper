package com.example.william.dominoscorekeeper.model;

import java.io.Serializable;

/**
 * Created by william on 27/09/2017.
 */

public class Roundmodel implements Serializable {
    private int roundId;
    private int playerOneScore;
    private int playerTwoScore;
    private int playerThreeScore;
    private int playerFourScore;
    private int gameId;

    public Roundmodel() {

    }

    public Roundmodel(int playerOneScore, int playerTwoScore, int playerThreeScore, int playerFourScore) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.playerThreeScore = playerThreeScore;
        this.playerFourScore = playerFourScore;
    }

    public Roundmodel(int roundId, int playerOneScore, int playerTwoScore, int playerThreeScore, int playerFourScore) {
        this.roundId = roundId;
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.playerThreeScore = playerThreeScore;
        this.playerFourScore = playerFourScore;
    }

    public Roundmodel(int roundId, int playerOneScore, int playerTwoScore, int playerThreeScore, int playerFourScore, int gameId) {
        this.roundId = roundId;
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.playerThreeScore = playerThreeScore;
        this.playerFourScore = playerFourScore;
        this.gameId = gameId;
    }

    public int getRoundId() {
        return roundId;
    }

    public void setRoundId(int roundId) {
        this.roundId = roundId;
    }

    public int getPlayerOneScore() {
        return playerOneScore;
    }

    public void setPlayerOneScore(int playerOneScore) {
        this.playerOneScore = playerOneScore;
    }

    public int getPlayerTwoScore() {
        return playerTwoScore;
    }

    public void setPlayerTwoScore(int playerTwoScore) {
        this.playerTwoScore = playerTwoScore;
    }

    public int getPlayerThreeScore() {
        return playerThreeScore;
    }

    public void setPlayerThreeScore(int playerThreeScore) {
        this.playerThreeScore = playerThreeScore;
    }

    public int getPlayerFourScore() {
        return playerFourScore;
    }

    public void setPlayerFourScore(int playerFourScore) {
        this.playerFourScore = playerFourScore;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
}
