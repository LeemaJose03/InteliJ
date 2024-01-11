package FirstPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

   public void launchBrowser(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.guvi.in");
        driver.manage().window().maximize();
        driver.close();

    }
}
