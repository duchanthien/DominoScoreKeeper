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
    private String playerOneName;
    private String playerTwoName;
    private String playerThreeName;
    private String playerFourName;
    private int gameId;
    private int roundCount;

    public int getRoundCount() {
        return roundCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }

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

    public Roundmodel(int roundId, int playerOneScore, int playerTwoScore, int playerThreeScore, int playerFourScore, String playerOneName, String playerTwoName, String playerThreeName, String playerFourName, int gameId, int roundCount) {
        this.roundId = roundId;
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.playerThreeScore = playerThreeScore;
        this.playerFourScore = playerFourScore;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerThreeName = playerThreeName;
        this.playerFourName = playerFourName;
        this.gameId = gameId;
        this.roundCount = roundCount;
    }

    public Roundmodel(int roundId, int playerOneScore, int playerTwoScore, int playerThreeScore, int playerFourScore, String playerOneName, String playerTwoName, String playerThreeName, String playerFourName, int roundCount) {
        this.roundId = roundId;
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.playerThreeScore = playerThreeScore;
        this.playerFourScore = playerFourScore;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerThreeName = playerThreeName;
        this.playerFourName = playerFourName;
        this.roundCount = roundCount;
    }

    public Roundmodel(int playerOneScore, int playerTwoScore, int playerThreeScore, int playerFourScore, String playerOneName, String playerTwoName, String playerThreeName, String playerFourName, int gameId, int roundCount) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.playerThreeScore = playerThreeScore;
        this.playerFourScore = playerFourScore;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerThreeName = playerThreeName;
        this.playerFourName = playerFourName;
        this.gameId = gameId;
        this.roundCount = roundCount;
    }
    public Roundmodel(int playerOneScore, int playerTwoScore, int playerThreeScore, int playerFourScore, String playerOneName, String playerTwoName, String playerThreeName, String playerFourName, int roundCount) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
        this.playerThreeScore = playerThreeScore;
        this.playerFourScore = playerFourScore;
        this.playerOneName = playerOneName;
        this.playerTwoName = playerTwoName;
        this.playerThreeName = playerThreeName;
        this.playerFourName = playerFourName;
        this.roundCount = roundCount;
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
}
