package com.telRan.tests.tests;


import com.telRan.tests.model.Board;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestsBase {
    @Test
    public void boardCreationTest(){
        int before = app.board().getBoardsCount();
        app.header().clickOnButtonPlus();
        app.header().selectCreateBoard();
        app.board().fillBoardForm(new Board()
                .withBoardName("Second board")
                .withTeamVision("public"));
        app.board().confirmBoardCreation();
        app.header().returnOnHomePageFromBoard();
        int after = app.board().getBoardsCount();
        System.out.println("was: " + before + " now: " + after);
        Assert.assertEquals(after, before+1);
        //
    }

//    @Test
//    public void boardCreationTest2(){
//        app.header().clickOnButtonPlus();
//        app.header().selectCreateBoard();
//        app.board().fillBoardForm("third board", "private");
//        app.board().confirmBoardCreation();
//        app.header().returnOnHomePage();
//    }


}
