package pom.pages.seleniumEasy;

import pom.pages.Common;
import pom.pages.Locators;

public class RadioButtonDemoPage {
    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void clickRadioButton(String gender) {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.inputByGender(gender));

    }

    public static void clickButtonGetCheckedValue() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.buttonCheckValue);
    }

    public static String readRadioButtonMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonDemo.paragraphRadioButton);
    }

    //    namu darbams:
    public static void clickRadioButtonGroupByGender(String gender) {
        Common.clickElement(
                Locators.SeleniumEasy.RadioButtonDemo.inputByGenderGroup(gender)
        );
    }

    public static void clickRadioButtonGroupByAge(String ageGroup) {
        Common.clickElement(
                Locators.SeleniumEasy.RadioButtonDemo.inputByAgeGroup(ageGroup)
        );
    }
    public static void clickGetValues() {
        Common.clickElement(Locators.SeleniumEasy.RadioButtonDemo.buttonGetValues);
    }

    public static String readGroupMessage() {
        return Common.getElementText(Locators.SeleniumEasy.RadioButtonDemo.paragraphGroupValue);
    }
}