import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class NewSeleniumTest {

    WebDriver driver;
    //before
    //init driver

    @BeforeMethod
    public void prepare(){
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    //test
    //navigate to google.com
    @Test
    public void testTest() throws InterruptedException {
        Thread.sleep(5000);
    }

    //after
    //quit browser
    @AfterTest
    public void afterTest()
    {
        driver.quit();
    }
}
