package pom.tests.seleniumEasy;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.seleniumEasy.FirstFormDemoPage;
import pom.pages.seleniumEasy.RadioButtonDemoPage;
import pom.tests.TestBase;

public class RadioButtonDemoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        RadioButtonDemoPage.open("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

    }

    @DataProvider(name = "DataProviderForTestRadioButtonDemo")
    public Object[][] provideDataForRadioButtonDemo() {
        return new Object[][]{
                {"Male"},
                {"Female"},
        };
    }

    @Test(dataProvider = "DataProviderForTestRadioButtonDemo")
    private void testRadioButtonDemo(String expectedGender) {
        String actualMessage = "";

        RadioButtonDemoPage.clickRadioButton(expectedGender);
        RadioButtonDemoPage.clickButtonGetCheckedValue();
        actualMessage = RadioButtonDemoPage.readRadioButtonMessage();

        Assert.assertTrue(
                actualMessage.contains(expectedGender),
                String.format(
                        "actual [%s]; expected [%s]",
                        actualMessage,
                        expectedGender
                )
        );
        FirstFormDemoPage.sleep(3000);
    }

    @DataProvider(name = "radioButtonGroup", parallel = true)
    public Object[][] radioButtonGroupGenderDataProvider() {
        return new Object[][]{
                {"Male", "0 - 5"},
                {"Male", "5 - 15"},
                {"Male", "15 - 50"},
                {"Female", "0 - 5"},
                {"Female", "5 - 15"},
                {"Female", "15 - 50"},
        };
    }

    @Test(dataProvider = "radioButtonGroup", threadPoolSize = 6)
    public void testRadioButtonGroupByGenderAndAgeGroup(String gender, String ageGroup) {
        String expectedGender = gender;
        String expectedAgeGroup = ageGroup;
        String actualMessage;

        RadioButtonDemoPage.clickRadioButtonGroupByGender(expectedGender);
        RadioButtonDemoPage.clickRadioButtonGroupByAge(expectedAgeGroup);
        RadioButtonDemoPage.clickGetValues();
        actualMessage = RadioButtonDemoPage.readGroupMessage();

        Assert.assertTrue(
                actualMessage.contains(expectedGender),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualMessage,
                        expectedGender
                )
        );
        Assert.assertTrue(
                actualMessage.contains(expectedAgeGroup),
                String.format(
                        "Actual: %s; Expected contains: %s",
                        actualMessage,
                        expectedAgeGroup
                )
        );
    }





    // Su single "Male" testas
    @Test
    public void testRadioButtonDemo() {

        String expectedGender = "Male";
        String actualMessage = "";

        RadioButtonDemoPage.clickRadioButton(expectedGender);
        RadioButtonDemoPage.clickButtonGetCheckedValue();
        actualMessage = RadioButtonDemoPage.readRadioButtonMessage();


        Assert.assertTrue(
                actualMessage.contains(expectedGender),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualMessage,
                        expectedGender
                )
        );
    }
}

