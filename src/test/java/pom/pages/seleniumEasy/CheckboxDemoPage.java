package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

import java.util.List;

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

    public static void clickButtonCheckAll() {
        Common.clickElement(Locators.SeleniumEasy.CheckboxDemo.buttonGroupCheckbox);
    }

    public static String readValueOfUncheckAllButton() {
        return Common.getElementAttributeValue(
                Locators.SeleniumEasy.CheckboxDemo.buttonGroupCheckbox,
                "value"
        );
    }

    public static boolean checkStatusesOfSelectedCheckboxes(boolean isStatusSet) {
        List<Boolean> statusList = Common.getStatusesOfSelectedCheckboxes(
                Locators.SeleniumEasy.CheckboxDemo.inputMultipleCheckbox
        );

        for (boolean status : statusList) {
            if (isStatusSet != status) return false;
        }
        return true;
    }
}
