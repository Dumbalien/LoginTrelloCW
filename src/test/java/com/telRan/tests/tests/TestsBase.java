package com.telRan.tests.tests;

import com.telRan.tests.fw.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestsBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws InterruptedException {
        app.init();
        app.session().login("dumbalien86@gmail.com", "TrelloLO2020");

    }

    @AfterClass(enabled = false)
    public void tearDown() {
        app.stop();

    }

}
