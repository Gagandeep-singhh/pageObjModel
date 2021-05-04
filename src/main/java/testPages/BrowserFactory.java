package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class BrowserFactory {

    static WebDriver driver;


    public static WebDriver startBrowser(String browserName) {
        System.setProperty("webdriver.chrome.driver","/Users/gagandeepsingh/IdeaProjects/pageObj/src/drivers/chromedriver");
        driver = new ChromeDriver();

        // To maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // To open Gmail site
//        driver.get("https://www.true-elements.com/index.php?route=account/login");
//        driver.get(url);
        return driver;

    }


}
