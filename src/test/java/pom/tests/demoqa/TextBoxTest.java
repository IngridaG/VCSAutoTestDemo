package pom.tests.demoqa;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.pages.demoqa.TextBoxPage;
import pom.tests.TestBase;

public class TextBoxTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        TextBoxPage.open("https://demoqa.com/text-box");
    }

    @Test
    private void testInputFullName() {
        String expectedFullName = "Ingrida Gu";
        String actualFullName;

        TextBoxPage.enterFullName(expectedFullName);
        TextBoxPage.clickButtonSubmit();
        actualFullName = TextBoxPage.readMessage();

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

        TextBoxPage.enterEmail(expectedUserEmail);
        TextBoxPage.clickButtonSubmit();
        actualUserEmail = TextBoxPage.readEmail();


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

        TextBoxPage.enterCurrentAddress(expectedCurrentAddress);
        TextBoxPage.clickButtonSubmit();
        actualCurrentAddress = TextBoxPage.readCurrentAddress();


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
