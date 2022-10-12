package pom.pages.demoqa;

import org.openqa.selenium.By;
import pom.pages.Common;
import pom.pages.Locators;

public class TextBoxPage {

//    public static void setUp() {
//        Common.setUpDriver();
//    }

    public static void open(String url) {
        Common.openUrl(url);
    }

//    public static void close() {
//        Common.closeDriver();
//    }

    public static void sleep(int millis){
        Common.sleep(millis);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                Locators.Demoqa.TextBox.inputFullName
        );
    }
    public static void clickButtonSubmit() {
        Common.clickElement(
                Locators.Demoqa.TextBox.buttonSubmit
        );
    }
    public static String readMessage() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.paragraphName
        );
    }
    public static void enterEmail(String expectedUserEmail) {
        Common.sendKeysToElement(
                expectedUserEmail,
                Locators.Demoqa.TextBox.inputEmail
        );
    }
    public static String readEmail() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.readEmail
        );
    }
    public static void enterCurrentAddress(String expectedCurrentAddress) {
        Common.sendKeysToElement(
                expectedCurrentAddress,
                Locators.Demoqa.TextBox.enterCurrentaddress
        );
    }
    public static String readCurrentAddress() {
        return Common.getElementText(
                Locators.Demoqa.TextBox.readCurrentAddress
        );
    }
}
