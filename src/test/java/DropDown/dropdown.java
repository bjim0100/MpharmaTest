package DropDown;



import Base.basetest;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class dropdown extends basetest {


    @Test
    public void login()throws Exception{
        HomePage homePage = new HomePage(driver);
        homePage.enterFirstName();
        homePage.enterMiddleName();
        homePage.enterLastName();
        homePage.enterPhoneNumber();
        homePage.enterDOB();
        homePage.enterAddress();
        homePage.clickSUbmit();
        homePage.assertAll();
        homePage.assertName();
        homePage.assertAddress();
        homePage.assertDOB();










    }
}
