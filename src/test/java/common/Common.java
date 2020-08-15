package common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    public static WebDriver driver;

    public void startBrowser(String pageLink){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(pageLink);
    }

    public void closeBrowres(){
        driver.quit();
    }
}
