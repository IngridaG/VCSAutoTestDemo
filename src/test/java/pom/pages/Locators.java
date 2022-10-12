package pom.pages;

import org.openqa.selenium.By;

public class Locators {      //lokatoriu dejimui kuriame inner klaseees lokatoriams

    public static class Demoqa {
        public static class TextBox {
            public static By inputFullName = By.xpath("//input[@id='userName']");
            public static By buttonSubmit = By.xpath("//*[@id='submit']");
            public static By paragraphName = By.xpath("//*[@id='name']");
            public static By inputEmail = By.xpath("//input[@id='userEmail']");
            public static By readEmail = By.xpath("//*[@id='email']");
            public static By enterCurrentaddress = By.xpath("//textarea[@id='currentAddress']");
            public static By readCurrentAddress = By.xpath("//p[@id='currentAddress']");

        }
    }

    public static class SeleniumEasy {
        public static class FirstFormDemo {
            public static By enterFullName = By.xpath("//input[@id='user-message']");
            public static By clickButtonShowMessage = By.xpath("//form[@id='get-input']//button");
            public static By readMessage = By.xpath("//span[@id='display']");
            public static By enterValueA = By.xpath("//input[@id='sum1']");
            public static By enterValueB = By.xpath("//input[@id='sum2']");
            public static By clickButtonGetTotal = By.xpath("//*[@id='gettotal']//button");
            public static By readSumTotal = By.xpath("//*[@id='displayvalue']");
        }


        public static class CheckboxDemo {

            public static By inputSingleCheckbox = By.xpath("//input[@id='isAgeSelected']");
            public static By divMessageText = By.xpath("//div[@id='txtAge']");
        }

        public static class SelectDropDownDemo {
            public static By selectDayOfWeek = By.xpath("//select[@id='multi-select']");
            public static By paragraphDayOfWeek = By.xpath("//p[@class='selected-value']");

//            public static By selectState = By.xpath("//select[@id='select-demo']");
        }


        public static class RadioButtonDemo {
            public static By buttonCheckValue = By.xpath("//button[@id='buttoncheck']");
            public static By paragraphRadioButton = By.xpath("//p[@class='radiobutton']");
            public static By buttonGetValues = By.xpath("(//button)[3]");
            public static By paragraphGroupValue = By.xpath("//*[@class='groupradiobutton']");

            public static By inputByGender(String gender) {
                return By.xpath(
                        String.format("//input[@value='%s' and @name='optradio']", gender)  // priims ir Male ir Female  ir dar daugiau jei butu. - pagal simobli %s, taip pakeistas xpath
                );                                                                          // veiks ir vietoje %s irasius Male. bet tik su Male.

            }
            public static By inputByGenderGroup(String gender) {
                return By.xpath(String.format("//*[@value='%s' and @name='gender']", gender));
            }

            public static By inputByAgeGroup(String ageGroup) {
                return By.xpath(String.format("//*[@value='%s' and @name='ageGroup']", ageGroup));
            }
        }
    }
}

