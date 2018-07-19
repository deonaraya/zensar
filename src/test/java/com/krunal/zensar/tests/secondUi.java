package com.krunal.zensar.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class secondUi extends BaseTest {

    @Test
    public void tryfour() {
        driver.get("http://testng.org/");
        String title = driver.getTitle();
        System.out.println(title);
    }

    @Test
    public void trythree() {
        driver.get("http://www.walmart.com");
        String title = driver.getTitle();
        System.out.println(title);
    }

}

