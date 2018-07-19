import com.krunal.zensar.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class practiveOne {


    WebDriver driver;

    @Test
    public void oneTest(){

        System.setProperty("webdriver.chrome.driver", "/Users/cnarayan/Documents/opia/zensar/src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

        HomePage page = new HomePage(driver);
        page.clickBestCatalog();

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.clickPupularCatalog();


    }}
