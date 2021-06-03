import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.RandomResult;

import static org.junit.Assert.assertEquals;


public class TestGoogle {

    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void shouldShowRandomSearchResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();

        GoogleResults googleResults = new GoogleResults(driver);
        WebElement webElement = googleResults.randomResult();
        RandomResult randomResult = new RandomResult(driver);

        WebElement randomWebElement = randomResult.randomPage(webElement);

        assertEquals(webElement, randomWebElement);
    }
}