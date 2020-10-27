package com.telRan.tests.fw;


import com.telRan.tests.model.Team;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamHelper extends HelperBase {


    public TeamHelper(WebDriver wd) {
        super(wd);
    }

    public void fillTeamCreationForm(Team team) {

        type(By.cssSelector("[data-test-id='header-create-team-name-input']"), team.getTeamName());
        click(By.cssSelector("[data-test-id='header-create-team-type-input']"));

        click(By.cssSelector("[data-test-id='header-create-team-type-input-" + team.getType() + "']"));
    }

    public void submitTeamCreation() {
        click(By.cssSelector("[data-test-id='header-create-team-submit-button']"));

    }

    public void selectIWillDoThisLater(){
        click(By.cssSelector("[data-test-id='show-later-button']"));
    }

    public int getTeamCount(){
        return wd.findElements(By.cssSelector("[data-test-id='home-team-tab-name']")).size();

    }
}
