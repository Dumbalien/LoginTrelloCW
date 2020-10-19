package com.telRan.tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TrelloBoardCreation extends TestsBase {
    @Test
    public void boardCreationTest(){
        clickOnButtonPlus();
        selectCreateBoard();
        fillBoardForm("Second board", "public");
    }

    public void fillBoardForm(String boardName, String teamVisible) {
        type(By.xpath("//input[@data-test-id='create-board-title-input']"), boardName);
        click(By.cssSelector(".W6rMLOx8U0MrPx"));

        if(isElementPresent(By.cssSelector("._1eiLh4-SJ3G7CY"))) {
            click(By.xpath("//nav[@class='_1eiLh4-SJ3G7CY']//li[1]/button"));
        }

        click(By.cssSelector("button._1Lkx3EjS3wCrs7"));
        click(By.xpath("//*[@name='" + teamVisible + "']/../.."));

        if(isElementPresent(By.cssSelector(".X6LMWvod566P68"))){
            click(By.cssSelector(".X6LMWvod566P68 button"));

        }

        click(By.cssSelector("[data-test-id='create-board-submit-button']"));
    }

    public void clickOnButtonPlus() {
        click(By.xpath("//button[@data-test-id='header-create-menu-button']"));
    }

    public void selectCreateBoard(){
        click(By.xpath("//button[@data-test-id='header-create-board-button']"));
    }




}
