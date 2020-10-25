package com.telRan.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestsBase{

    @Test
    public void teamCreationFromHeader(){
        int before = app.team().getTeamCount();
        app.header().clickOnButtonPlus();
        app.header().selectCreateTeam();
        app.team().fillTeamCreationForm("QA 24", "education");
        app.team().submitTeamCreation();
        app.team().selectIWillDoThisLater();

        app.header().returnOnHomePageFromTeam();
        int after = app.team().getTeamCount();
        Assert.assertEquals(after, before);

    }
}
