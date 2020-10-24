package com.telRan.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestsBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws InterruptedException {
        app.init();
        app.login("dumbalien86@gmail.com", "TrelloLO2020");

    }

    @AfterClass(enabled = false)
    public void tearDown() {
        app.stop();

    }

}
