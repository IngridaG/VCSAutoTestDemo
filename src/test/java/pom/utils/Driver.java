package pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static void setDriver() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(setUpOptions());
        driver.manage().deleteAllCookies();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void openUrl(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static void close() {
        driver.quit();
    }

    private static ChromeOptions setUpOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.75");
//        options.addArguments("headless");
        return options;
    }
}
