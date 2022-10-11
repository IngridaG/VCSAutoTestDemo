package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.FirstFormDemoPage;
import pom.tests.TestBase;

public class FirstFormDemoTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        FirstFormDemoPage.open(
                "https://demo.seleniumeasy.com/basic-first-form-demo.html"
        );
    }

    @Test
    private void testInputFieldSeleniumEasy() {
        String expectedFullName = "Dailius";
        String actualFullName;

        FirstFormDemoPage.enterFullName(expectedFullName);
        FirstFormDemoPage.clickButtonShowMessage();
        actualFullName = FirstFormDemoPage.readMessage();

        Assert.assertEquals(actualFullName, expectedFullName);
    }

    @Test
    private void testTwoInputFieldsAdd5and5Values(){
        String input1 = "5";
        String input2 = "5";
        String expectedSumTotal = "10";
        String actualSumTotal;

        FirstFormDemoPage.enterValueA(input1);
        FirstFormDemoPage.enterValueB(input2);
        FirstFormDemoPage.clickButtonGetTotal();
        actualSumTotal = FirstFormDemoPage.readSumTotal();

        Assert.assertEquals(actualSumTotal,expectedSumTotal );
    }
}
