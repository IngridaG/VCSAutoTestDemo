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

    @Test
    private void testMultipleCheckboxStatusWithCheckedAll() {
        String expectedButtonText = "Uncheck All";
        String actualButtonText = "";
        boolean expectedCheckboxStatus = true;
        boolean actualCheckboxStatus = false;

        CheckboxDemoPage.clickButtonCheckAll();
        actualButtonText = CheckboxDemoPage.readValueOfUncheckAllButton();

        Assert.assertEquals(actualButtonText, expectedButtonText);
        actualCheckboxStatus = CheckboxDemoPage.checkStatusesOfSelectedCheckboxes(expectedCheckboxStatus);

        Assert.assertTrue(actualCheckboxStatus == expectedCheckboxStatus);
    }
}
