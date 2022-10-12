package pom.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {         // pasirenkam tiesiog rasant onTest failue
        takeScreenshot();

    }

    private void takeScreenshot() {
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();   //castinam si objekta
        File screenshotRow = takesScreenshot.getScreenshotAs(OutputType.FILE);   //reikia screenshoto paramtrro, kad sukurtu screenshotto faila
                                                //faila reiks savinti: galima savinti i kompiiuteri pvz.: "Desktop/Screenshots" - nurodant tarp kabuciu eil.24
        String directory = "./screenshots";    //kitas savinimo budas: root direktorijoje sukurs nauja aplanka siuo pavadinimus ir paveksliukai saugosis ten

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH_mm_ss_SSS");
        String dateTime = localDateTime.format(formatter);

        File screenshotFile = new File(directory + "/screenshot" + dateTime + "_" + UUID.randomUUID() + ".png");
    //pilna dirsktorija su failoa pavadinimu bus ./screenshots/screenshot_01.png

        try {
            FileUtils.copyFile(screenshotRow, screenshotFile);    // nurodom is kur kopijuojam i kur
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
