package pom.pages.demoqa;

import org.openqa.selenium.By;
import pom.pages.Common;

public class TestBoxPage {

    public static void setUp() {
        Common.setUp();
    }

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void close() {
        Common.close();
    }

    public static void sleep(int millis){
        Common.sleep(millis);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                By.xpath("//input[@id='userName']")
        );
    }
    public static void clickButtonSubmit() {
        Common.clickElement(
                By.xpath("//*[@id='submit']")
        );
    }
    public static String readMessage() {
        return Common.getElementText(
                By.xpath("//*[@id='name']")
        );
    }
    public static void enterEmail(String expectedUserEmail) {
        Common.sendKeysToElement(
                expectedUserEmail,
                By.xpath("//input[@id='userEmail']")
        );
    }
    public static String readEmail() {
        return Common.getElementText(
                By.xpath("//*[@id='email']")
        );
    }
    public static void enterCurrentAddress(String expectedCurrentAddress) {
        Common.sendKeysToElement(
                expectedCurrentAddress,
                By.xpath("//textarea[@id='currentAddress']")
        );
    }
    public static String readCurrentAddress() {
        return Common.getElementText(
                By.xpath("//p[@id='currentAddress']")
        );
    }
}
