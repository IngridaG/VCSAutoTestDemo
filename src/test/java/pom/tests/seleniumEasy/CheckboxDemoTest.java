package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.CheckboxDemoPage;
import pom.tests.TestBase;
import pom.utils.TestListener;


public class CheckboxDemoTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        CheckboxDemoPage.open("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

    }

    @Test
    public void testSingleCheckboxDemo() {
        String expectedMessage = "Success - Check box is checked";
        String actualMessage = "";

        CheckboxDemoPage.clickSingleCheckbox();
        actualMessage = CheckboxDemoPage.readMessage();

        Assert.assertEquals(actualMessage, expectedMessage);


    }
}
