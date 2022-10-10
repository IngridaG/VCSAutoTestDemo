package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumEasy {
    WebDriver driver;

    @BeforeMethod
    private void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
//        options.addArguments("headless");   // kad testas vyktu backgrounde, neatidarytu narsykles - MAN VEIKIA SU SIUO METODU ENALBED

        driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //@Test                    // testas papild formos atidarymui
//private void test1(){
//    }
    @Test
    private void enterMessageTest() {
        String expectedMessageResult = "Labas visiems";
        String actualMessageResult;

        WebElement inputEnterMessage =
                driver.findElement(By.xpath("//input[@id='user-message']"));
        inputEnterMessage.sendKeys(expectedMessageResult);


        WebElement buttonShowMessage = driver.findElement(
                By.xpath("//button[text()='Show Message']"));
        buttonShowMessage.click();


        WebElement enteredMessageText = driver.findElement(By.xpath("//*[@id='display']"));
        actualMessageResult = enteredMessageText.getText();

        Assert.assertEquals(actualMessageResult, expectedMessageResult);
    }

    @Test
    public void twoInputFieldsSumPositive() {
        String expectedInputA = "5";
        String expectedInputB = "4";
        String expectedTotalAplusB = "9";
        String actualTotalAplusB;


        WebElement inputEnterA =
                driver.findElement(By.xpath("//input[@id='sum1']"));
        inputEnterA.sendKeys(expectedInputA);

        WebElement inputEnterB =
                driver.findElement(By.xpath("//input[@id='sum2']"));
        inputEnterB.sendKeys(expectedInputB);

        WebElement buttonGetTotal = driver.findElement(By.xpath("//button[text()='Get Total']"));
        buttonGetTotal.click();

        WebElement totalAPlusB = driver.findElement(By.xpath("//*[@id='displayvalue']"));
        actualTotalAplusB = totalAPlusB.getText();

        Assert.assertEquals(actualTotalAplusB, expectedTotalAplusB);
    }
    @Test
    public void twoInputFieldsSumNegative() {
        String expectedInputA = "Penki";
        String expectedInputB = "4";
        String expectedTotalAplusB = "NaN";
        String actualTotalAplusB;


        WebElement inputEnterA =
                driver.findElement(By.xpath("//input[@id='sum1']"));
        inputEnterA.sendKeys(expectedInputA);

        WebElement inputEnterB =
                driver.findElement(By.xpath("//input[@id='sum2']"));
        inputEnterB.sendKeys(expectedInputB);

        WebElement buttonGetTotal = driver.findElement(By.xpath("//button[text()='Get Total']"));
        buttonGetTotal.click();

        WebElement totalAPlusB = driver.findElement(By.xpath("//*[@id='displayvalue']"));
        actualTotalAplusB = totalAPlusB.getText();

        Assert.assertEquals(actualTotalAplusB, expectedTotalAplusB);
    }

    @AfterMethod
    private void close() {
        driver.quit();
    }
}



// a path: //input[@id='sum1']
// b path: //input[@id='sum2']
// mygtuko get total: //button[text()='Get Total']
// atsakymo lauko: //*[@id='displayvalue']


// https://demo.seleniumeasy.com/basic-first-form-demo.html - pasiprraktikuoti su dviem laukais testus

// suvedamos zinutes lauko suradimui: //button[text()='Show Message']
// dar viens variantas: //*[contains(text(),'Message')]
