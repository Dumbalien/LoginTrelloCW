package com.telRan.tests.tests;

import com.telRan.tests.fw.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestsBase {

    protected static ApplicationManager app =
            new ApplicationManager(System.getProperty("browser", BrowserType.CHROME));

    @BeforeSuite
    public void setUp() throws InterruptedException {
        app.init();
        app.session().login("dumbalien86@gmail.com", "TrelloLO2020");

    }

    @AfterSuite(enabled = false)
    public void tearDown() {
        app.stop();

    }

}
