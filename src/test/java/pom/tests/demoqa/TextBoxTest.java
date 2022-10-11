package pom.tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.demoqa.TestBoxPage;
import pom.pages.seleniumEasy.FirstFormDemoPage;
import pom.tests.TestBase;

public class TextBoxTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        FirstFormDemoPage.open("https://demoqa.com/text-box");
    }

    @Test
    private void testInputFullName() {
        String expectedFullName = "Ingrida Gu";
        String actualFullName;
        // TODO: wright all actions fro elements here
        TestBoxPage.enterFullName(expectedFullName);
        TestBoxPage.clickButtonSubmit();
        actualFullName = TestBoxPage.readMessage();

        Assert.assertTrue(
                actualFullName.contains(expectedFullName),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualFullName,
                        expectedFullName
                )
        );
    }

    @Test
    private void testInputEmail() {
        String expectedUserEmail = "ingrida.gurskyte@gmail.com";
        String actualUserEmail;

        TestBoxPage.enterEmail(expectedUserEmail);
        TestBoxPage.clickButtonSubmit();
        actualUserEmail = TestBoxPage.readEmail();

        // TODO: wright all actions fro elements here
        Assert.assertTrue(
                actualUserEmail.contains(expectedUserEmail),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualUserEmail,
                        expectedUserEmail
                )
        );
    }

    @Test
    private void testInputCurrentAddress() {
        String expectedCurrentAddress = "Gedimino str.";
        String actualCurrentAddress;

        TestBoxPage.enterCurrentAddress(expectedCurrentAddress);
        TestBoxPage.clickButtonSubmit();
        actualCurrentAddress = TestBoxPage.readCurrentAddress();

        // TODO: wright all actions fro elements here
        Assert.assertTrue(
                actualCurrentAddress.contains(expectedCurrentAddress),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualCurrentAddress,
                        expectedCurrentAddress
                )
        );
    }
}
