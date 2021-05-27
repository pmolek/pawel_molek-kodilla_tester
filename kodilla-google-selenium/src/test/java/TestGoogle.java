import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearch;


public class TestGoogle {

    static WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pmole\\IdeaProjects\\pawel_molek-kodilla_tester\\kodilla-google-selenium\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.pl");
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
}