package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        WebElement category = driver.findElement(By.xpath("//*[@id=\"gh-cat-box\"]/select"));

        Select categoryNumber = new Select(category);
        categoryNumber.selectByValue("625");

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"gh-ac-box2\"]/input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
