package com.telRan.tests.tests;

import org.testng.annotations.Test;

public class BoardModificationTests extends TestsBase {
    @Test
    public void modifyBoardTest(){
        app.board().clickOnTheFirstBoard();

        app.board().renameBoard();
    }
}
