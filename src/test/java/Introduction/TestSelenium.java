package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium {

    WebDriver driver;

    @BeforeMethod
    private void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
        options.addArguments("headless");   // kad testas vyktu backgrounde, neatidarytu narsykles - MAN VEIKIA SU SIUO METODU ENALBED

        driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/text-box");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    // vykdys testa tol, kol viska uzkraus
    }

    @Test
    private void testInputFullName() {
        String expectedFullName = "Ingrida Gurskyte";
        String actualFullName;

        WebElement inputFullName =
                driver.findElement(By.xpath("//input[@id='userName']"));
        inputFullName.sendKeys(expectedFullName);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
        buttonSubmit.click();

        WebElement textName = driver.findElement(By.xpath("//*[@id='name']"));
        actualFullName = textName.getText();

//        Assert.assertEquals(actualFullName, expectedFullName);  - netinka nes tekas skiriasi
        // expectedFullName = "Ingrida Gurskyte"
        // actualFullName = "Name:Ingrida Gurskyte"

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
    private void testInputEmail(){
        String expectedEmail = "ingrida.gurskyte@gmail.com";
        String actualEmail;
        WebElement inputEmail =
                driver.findElement(By.xpath("//input[@id='userEmail']"));
        inputEmail.sendKeys(expectedEmail);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
        buttonSubmit.click();

        WebElement textName = driver.findElement(By.xpath("//*[@id='email']"));
        actualEmail = textName.getText();

        Assert.assertTrue(
                actualEmail.contains(expectedEmail),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualEmail,
                        expectedEmail
                )
        );
    }
// //*[@id='currentAddress']
    @Test
    private void testInputCurrentAddress(){
        String expectedCurrentAddress = "Gedimino pilis";
        String actualCurrentAddress;

        WebElement inputCurrentAddress =
                driver.findElement(By.xpath("//*[@id='currentAddress']"));
        inputCurrentAddress.sendKeys(expectedCurrentAddress);

        WebElement buttonSubmit = driver.findElement(By.xpath("//*[@id='submit']"));
        buttonSubmit.click();

        WebElement textName = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        actualCurrentAddress = textName.getText();

        Assert.assertTrue(
                actualCurrentAddress.contains(expectedCurrentAddress),
                String.format(
                        "Actual [%s]; Expected [%s]",
                        actualCurrentAddress,
                        expectedCurrentAddress
                )
        );

    }

    @AfterMethod
    private void close() {
        driver.quit();
    }
}


