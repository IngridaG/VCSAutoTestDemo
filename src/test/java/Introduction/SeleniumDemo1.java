package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SeleniumDemo1 {
    @Test
    public void testDemoWebDriver(){

        WebDriverManager.chromedriver().setup();   // webdrivers reikalingas susetapinti manageri, kol kas darom kiekvienam teste
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vilniuscoding.lt/");

        try {
            driver.manage().window().fullscreen();
            Thread.sleep(3000);

            driver.manage().window().maximize();
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    @Test
    public void testClickKontaktaiOfVcsWebPage(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.vilniuscoding.lt/");
        driver.manage().window().maximize();

        WebElement linkKontaktai = driver.findElement(By.id("menu-item-3969"));
        linkKontaktai.click();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    @Test
    public void testClickKontaktaiOfVcsWebPageWithSmallWindow(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=600,3000");
        options.addArguments("--start-in-incognito");

        WebDriver driver = new ChromeDriver(options);           // options pasirinktus auksciau paduodam i drveri


        driver.get("https://www.vilniuscoding.lt/");            // paleidziame si inernet psl. su get metodu

        try {
            WebElement buttonBurger = driver.findElement(By.id("burger"));
            buttonBurger.click();

            Thread.sleep(2000);

            WebElement linkKontaktai = driver.findElement(By.id("menu-item-3969"));  // paspaudzia vcs kontaktu mygtuka, palaukia 5 s  uzdaro
            linkKontaktai.click();

            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}


