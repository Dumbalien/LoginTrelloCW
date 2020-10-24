package com.telRan.tests.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase {

    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void fillBoardForm(String boardName, String teamVisible) {
        type(By.xpath("//input[@data-test-id='create-board-title-input']"), boardName);
        click(By.cssSelector(".W6rMLOx8U0MrPx"));

        if (isElementPresent(By.cssSelector("._1eiLh4-SJ3G7CY"))) {
            click(By.xpath("//nav[@class='_1eiLh4-SJ3G7CY']//li[1]/button"));
        }

        click(By.cssSelector("button._1Lkx3EjS3wCrs7"));
        click(By.xpath("//*[@name='" + teamVisible + "']/../.."));

        if (teamVisible.equals("public")) {
            click(By.cssSelector(".X6LMWvod566P68 button"));

        }
    }

    public int getBoardsCount() {
        int res = wd.findElements(By.xpath("//*[@class='icon-lg icon-member']/../../..//li")).size() - 1;
        return res;

    }

    public void confirmBoardCreation() {
        click(By.cssSelector("[data-test-id='create-board-submit-button']"));

    }

    public void clickOnTheFirstBoard() {
        click(By.xpath("//*[@class='icon-lg icon-member']/../../..//li"));

    }

    public void renameBoard() {
        click(By.cssSelector(".js-rename-board"));
        wd.findElement(By.cssSelector(".js-board-name-input")).clear();
        wd.findElement(By.cssSelector(".js-board-name-input")).sendKeys("321" + Keys.ENTER);

    }
}
