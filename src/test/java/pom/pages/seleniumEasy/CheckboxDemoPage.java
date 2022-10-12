package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

public class CheckboxDemoPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickSingleCheckbox() {
        Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.inputSingleCheckbox);
    }

    public static String readMessage() {
        return Common.getElementText(Locators.SeleniumEasy.CheckboxDemo.divMessageText);

    }
}
