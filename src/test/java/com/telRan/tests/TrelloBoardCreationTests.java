package com.telRan.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TrelloBoardCreationTests extends TestsBase {
    @Test
    public void boardCreationTest(){
        int before = app.getBoardsCount();
        app.clickOnButtonPlus();
        app.selectCreateBoard();
        app.fillBoardForm("Second board", "public");
        app.confirmBoardCreation();
        app.returnOnHomePage();
        int after = app.getBoardsCount();
        System.out.println("was: " + before + " now: " + after);
        Assert.assertEquals(after, before+1);
        //
    }


}
