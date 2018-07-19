package com.krunal.zensar.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest {

    WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("FIREFOX")){
            System.setProperty("webdriver.gecko.driver","/Users/cnarayan/Documents/opia/zensar/src/main/resources/geckodriver");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("CHROME")){
            System.setProperty("webdriver.chrome.driver", "/Users/cnarayan/Documents/opia/zensar/src/main/resources/chromedriver");
            driver = new ChromeDriver();
        }
    }

//    @AfterMethod
//    public void tearDown() {
//
//    }

    @AfterClass
    public void td(){
        driver.close();
        driver.quit();
    }
}



