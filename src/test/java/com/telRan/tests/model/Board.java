package com.telRan.tests.model;

public class  Board {
    private  String boardName;
    private  String teamVision;

    public Board withBoardName(String boardName) {
        this.boardName = boardName;
        return this;
    }

    public Board withTeamVision(String team) {
        this.teamVision = team;
        return this;
    }

    public String getBoardName() {
        return boardName;
    }

    public String getTeamVision() {
        return teamVision;
    }
}
