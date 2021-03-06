package com.telRan.tests.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    SessionHelper session;
    BoardHelper board;
    HeaderHelper header;
    TeamHelper team;
    private String browser;

    public ApplicationManager(String browser)
    {
        this.browser = browser;
    }


    public void init()
    {
        if (browser.equals(BrowserType.CHROME))
        {
            wd = new ChromeDriver();
        } else if(browser.equals(BrowserType.FIREFOX))
        {
            wd = new FirefoxDriver();
        }

        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.manage().window().maximize();

        wd.navigate().to("https://trello.com/");
        session = new SessionHelper(wd);
        board = new BoardHelper(wd);
        header = new HeaderHelper(wd);
        team = new TeamHelper(wd);

    }

    public HeaderHelper header()
    {
        return header;
    }

    public SessionHelper session()
    {
        return session;
    }

    public BoardHelper board()
    {
        return board;
    }

    public TeamHelper team()
    {
        return team;
    }

    public void stop()
    {
        wd.quit();
    }


}
