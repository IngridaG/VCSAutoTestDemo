package pom.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pom.pages.Common;
import pom.utils.TestListener;

@Listeners(TestListener.class)      // cias Listenerio testavimo tisklais
public class TestBase {

    @BeforeMethod
    public void setUp() {
//TestBoxPage
//        FirstFormDemoPage.setUp();  //uz komentavom nes turim dvi svetaines,. Kai viena galima taip padaryti
        Common.setUpDriver();

    }

    @AfterMethod
    public void tearDown() {
        Common.closeDriver();
//        FirstFormDemoPage.close();
    }
}