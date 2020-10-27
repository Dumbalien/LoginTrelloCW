package com.telRan.tests.tests;

import com.telRan.tests.model.Team;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestsBase{

    @Test
    public void teamCreationFromHeader(){
        int before = app.team().getTeamCount();
        app.header().clickOnButtonPlus();
        app.header().selectCreateTeam();
        app.team().fillTeamCreationForm(new Team()
                .withTeamName("QA 24")
                .withType("education"));
        app.team().submitTeamCreation();
        app.team().selectIWillDoThisLater();

        app.header().returnOnHomePageFromTeam();
        int after = app.team().getTeamCount();
        Assert.assertEquals(after, before);

    }
}
