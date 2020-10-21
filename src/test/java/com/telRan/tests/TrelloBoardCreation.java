package com.telRan.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrelloBoardCreation extends TestsBase {
    @Test
    public void boardCreationTest(){
        int before = getBoardsCount();
        clickOnButtonPlus();
        selectCreateBoard();
        fillBoardForm("Second board", "public");
        confirmBoardCreation();
        returnOnHomePage();
        int after = getBoardsCount();
        System.out.println("was: " + before + " now: " + after);
        Assert.assertEquals(after, before+1);
    }

    public int getBoardsCount() {
        int res = wd.findElements(By.xpath("//*[@class='icon-lg icon-member']/../../..//li")).size()-1;
        return res;

    }

    public void returnOnHomePage() {
        new WebDriverWait(wd, 30).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".mod-list-add-button")));
        click(By.xpath("//*[@data-test-id='header-home-button']"));

    }

    public void confirmBoardCreation() {
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));

    }

    public void fillBoardForm(String boardName, String teamVisible) {
        type(By.xpath("//input[@data-test-id='create-board-title-input']"), boardName);
        click(By.cssSelector(".W6rMLOx8U0MrPx"));

        if(isElementPresent(By.cssSelector("._1eiLh4-SJ3G7CY"))) {
            click(By.xpath("//nav[@class='_1eiLh4-SJ3G7CY']//li[1]/button"));
        }

        click(By.cssSelector("button._1Lkx3EjS3wCrs7"));
        click(By.xpath("//*[@name='" + teamVisible + "']/../.."));

        if(teamVisible.equals("public")){
            click(By.cssSelector(".X6LMWvod566P68 button"));

        }
    }

    public void clickOnButtonPlus() {
        click(By.xpath("//button[@data-test-id='header-create-menu-button']"));
    }

    public void selectCreateBoard(){
        click(By.xpath("//button[@data-test-id='header-create-board-button']"));
    }




}
