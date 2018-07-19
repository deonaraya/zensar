package com.krunal.zensar.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class firstUi extends BaseTest {

    @Test
    public void trytwo(){
        driver.get("http://www.amazon.com");
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void tryone(){
        driver.get("http://www.adobe.com");
        String title = driver.getTitle();
        System.out.println(title);
    }








//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "/Users/cnarayan/Documents/opia/zensar/src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://www.adobe.com");
//        String title = driver.getTitle();
//        System.out.println(title);
//
//        driver.close();
//        driver.quit();
//
//    }
}
