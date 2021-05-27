package com.kodilla.selenium.allegro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.By.cssSelector;

public class AllegroTestingAppCSS {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        WebElement category = driver.findElement(cssSelector("#gh-cat-box > select"));
        Select categoryNumber = new Select(category);
        categoryNumber.selectByValue("625");

        WebElement inputField = driver.findElement(cssSelector("#gh-ac-box2 > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebDriverWait webDriverWait = new WebDriverWait(driver, 3);
        List<WebElement> webElementsList = driver.findElements(cssSelector("#srp-river-results > ul > li > div > div.s-item__info.clearfix > a > h3"));

        System.out.println("number of search results: " + webElementsList.size());

        for (int i = 0; i < webElementsList.size(); i++) {
            System.out.println("product info: " + webElementsList.get(i).getText());
        }
    }
}
