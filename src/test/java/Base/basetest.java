package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class basetest {
public WebDriver driver;



    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");

        driver.manage().window().maximize();


    }
    @AfterClass
    public void tearDown(){

        driver.quit();
    }
}
