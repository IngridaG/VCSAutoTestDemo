package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumDemo {
    WebDriver driver;

    @BeforeMethod
    private void setUp(){

        WebDriverManager.chromedriver().setup();        // webdrivers reikalingas susetapinti manageri
        driver = new ChromeDriver();          // kuriam driveri
        driver.get("https://www.vilniuscoding.lt/");
    }


    @Test
    public void testDemoWedDriver() {                       // testas skirtas atidaryti ir uzdaryti psl.
                                                             // is klases issikvieciam metoda
        WebDriverManager.chromedriver().setup();        // webdrivers reikalingas susetapinti manageri Chromas
        WebDriver driver = new ChromeDriver();          // kuriam driveri
        driver.get("https://www.vilniuscoding.lt/");         // paleidziame si inernet psl. su get metodu


        try {
            driver.manage().window().fullscreen();
            Thread.sleep(3000);              // palaukem 5 sekundes

            driver.manage().window().maximize();    //  uzkranam per visa ekrana
            Thread.sleep(3000);

        } catch (InterruptedException e) {              // catch yra prie try komandos
            e.printStackTrace();
        }
        driver.quit();                              // psl. po 5 sekundziu uzsdaro pats pagal sai komanda

    }
    @Test
    public void testClickKontaktaiOfVcsWebPage() {
        WebDriverManager.chromedriver().setup();            // webdrivers reikalingas susetapinti manageri
        WebDriver driver = new ChromeDriver();              // kuriam driveri

        driver.get("https://www.vilniuscoding.lt/");         // paleidziame si inernet psl. su get metodu
        driver.manage().window().maximize();                    // padideja psl. paspaudzia mygtuka Kontaktai ir skrolinia i apaca

        WebElement linkKontaktai = driver.findElement(By.id("menu-item-3969"));   // paspaudzia vcs kontaktu mygtuka, palaukia 5 s  uzdaro
        linkKontaktai.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }

    @Test
    public void testClickKontaktaiOfVcsWebPageSmallWindow() {
        WebDriverManager.chromedriver().setup();            // webdrivers reikalingas susetapinti manageri, kol kas darom kiekvienam teste

        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=600,3000");
        options.addArguments("--start-in-incognito");

        WebDriver driver = new ChromeDriver(options);              // options pasirinktus auksciau paduodam i drveri

        driver.get("https://www.vilniuscoding.lt/");         // paleidziame si inernet psl. su get metodu

        try {
        WebElement buttonBurger = driver.findElement(By.id("burger"));   // paspaudzia vcs kontaktu mygtuka, palaukia 5 s  uzdaro
        buttonBurger.click();

        Thread.sleep(2000);
        WebElement linkKontaktai = driver.findElement(By.id("menu-item-3969"));   // paspaudzia vcs kontaktu mygtuka, palaukia 5 s  uzdaro
             linkKontaktai.click();
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
@AfterMethod
    private void close(){
    driver.quit();
}
}
