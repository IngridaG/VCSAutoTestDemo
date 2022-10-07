package Introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {
    @Test
    public void testDemoWedDriver(){
                                                         // is klases issikvieciam metoda
        WebDriverManager.chromedriver().setup();        // webdrivers reikalingas susetapinti manageri
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
}
