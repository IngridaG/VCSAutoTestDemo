package pom.pages.seleniumEasy;

import org.openqa.selenium.By;
import pom.pages.Common;
import pom.pages.Locators;

public class FirstFormDemoPage {
    public static void open(String url) { Common.openUrl(url); }
//    public static void close() { Common.closeDriver(); }   //sita galima istrnti susitvakiius

    public static void sleep(int millis){
        Common.sleep(millis);
    }

    public static void enterFullName(String expectedFullName) {
        Common.sendKeysToElement(
                expectedFullName,
                Locators.SeleniumEasy.FirstFormDemo.enterFullName
        );
    }

    public static void clickButtonShowMessage() {
        Common.clickElement(
                Locators.SeleniumEasy.FirstFormDemo.clickButtonShowMessage
        );
    }

    public static String readMessage() {
        return Common.getElementText(
                Locators.SeleniumEasy.FirstFormDemo.readMessage
        );
    }
    public static void enterValueA(String value) {
        Common.sendKeysToElement(
                value,
                Locators.SeleniumEasy.FirstFormDemo.enterValueA
        );
    }

    public static void enterValueB(String value) {
        Common.sendKeysToElement(
                value,
                Locators.SeleniumEasy.FirstFormDemo.enterValueB
        );
    }
    public static void clickButtonGetTotal(){
        Common.clickElement(
                Locators.SeleniumEasy.FirstFormDemo.clickButtonGetTotal
        );

    }
    public static String readSumTotal() {
        return Common.getElementText(
                Locators.SeleniumEasy.FirstFormDemo.readSumTotal
        );
    }
}
