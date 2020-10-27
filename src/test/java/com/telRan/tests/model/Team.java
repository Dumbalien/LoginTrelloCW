package com.telRan.tests.model;

public class Team {
    private  String teamName;
    private  String type;

    public Team withTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public Team withType(String type) {
        this.type = type;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getType() {
        return type;
    }
}
