package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.CheckboxDemoPage;
import pom.pages.seleniumEasy.SelectDropdownDemoPage;
import pom.tests.TestBase;

public class SelectDropdownDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        SelectDropdownDemoPage.open("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
    }

    @Test
    private void testSelectListDemo() {
        String expectedWeekOfDay = "Tuesday";   //Tuesday
        String actualMessage = "";              // Day selected: - Tuesday

        SelectDropdownDemoPage.clickDayFromDropdown(expectedWeekOfDay);
        actualMessage = SelectDropdownDemoPage.readMessageOfListDropdown();


        Assert.assertTrue(
                actualMessage.contains(expectedWeekOfDay),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        expectedWeekOfDay
                )
        );
    }


}


//    @Test
//    private void testMultiSelectListDemo(){
//        String expectedState = "Florida";
//        String acutalFistSelectedMessage = "";
//
//        SelectDropdownDemoPage.clickDayFromDropdown();
//
//    }

