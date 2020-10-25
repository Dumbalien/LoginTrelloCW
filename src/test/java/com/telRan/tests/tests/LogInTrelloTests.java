package com.telRan.tests.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTrelloTests extends TestsBase {

    @BeforeMethod
    public void ensurePreconditions(){
        if(app.header().isAvatarPresent()){
            app.header().logout();
        }
    }

    @Test
    public void loginAtlassianAccPositiveTest() throws InterruptedException {
        app.session().login("dumbalien86@gmail.com", "TrelloLO2020");

        Assert.assertTrue(app.header().isAvatarPresent());
    }

//    @Test
//    public void negativeLoginAtlassianAccPositiveTest() throws InterruptedException {
//        app.session().login("dumbalien86@gmail.com", "TrelloLO");
//
//        Assert.assertTrue(app.session().isLoginErrorPresent());
//        Assert.assertFalse(app.header().isAvatarPresent());
 //   }

}
