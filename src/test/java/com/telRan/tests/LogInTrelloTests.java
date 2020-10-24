package com.telRan.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTrelloTests extends TestsBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if(app.isAvatarPresent()){
            app.logout();
        }
    }

    @Test
    public void loginAtlassianAccPositiveTest() throws InterruptedException {
        app.login("dumbalien86@gmail.com", "TrelloLO2020");

        Assert.assertTrue(app.isAvatarPresent());
    }

    @Test
    public void negativeLoginAtlassianAccPositiveTest() throws InterruptedException {
        app.login("dumbalien86@gmail.com", "TrelloLO");

        Assert.assertTrue(app.isLoginErrorPresent());
        Assert.assertFalse(app.isAvatarPresent());
    }

}
