package Pages;

import Locators.DropDownLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.*;

public class HomePage extends DropDownLocators {
    private WebDriver driver;
    private By firstName = By.cssSelector("[data-test-id='first-name']");
    private By middleName = By.cssSelector("[data-test-id='middle-name']");
    private By lastName = By.cssSelector("[data-test-id='last-name']");
    private By phoneNumber = By.cssSelector("[data-test-id='phone-number']");
    private By dob = By.cssSelector("[data-test-id='dob']");
    private By address = By.cssSelector("[data-test-id='address']");
    private By addNewUser = By.cssSelector("[data-test-id='submit-btn']");
    private By userCard = By.cssSelector("[data-test-id='user-card']");
    private String userFirstName = "Ben";
    private String userMiddleName = "Abram";
    private String userLastName = "Moshi";
    private String userPhoneNumber = "0234567887";
    private String month = "9";
    private String day = "03";
    private String year = "1956";
    private String userDob = day +month + year;
    private String userAddress = "P.O.Box 3311";


    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterFirstName(){
        driver.findElement(firstName).sendKeys(userFirstName);
    }
    public void enterMiddleName(){
        driver.findElement(middleName).sendKeys(userMiddleName);

    }
    public void enterLastName(){
        driver.findElement(lastName).sendKeys(userLastName);

    }
    public void enterPhoneNumber(){
        driver.findElement(phoneNumber).sendKeys(userPhoneNumber);

    }
    public void enterDOB(){
        driver.findElement(dob).sendKeys(userDob);

    }
    public void enterAddress(){
        driver.findElement(address).sendKeys(userAddress);

    }
    public void clickSUbmit(){
        driver.findElement(addNewUser).click();

    }
    public void assertAll(){
        driver.findElement(userCard).isDisplayed();
    }
    public void assertName(){
      String expectedName = driver.findElement(userCard).getText();
      String name = userFirstName + " " + userMiddleName + " " + userLastName;
      assertTrue(expectedName.contains(name));


    }
    public void assertAddress(){
        String expectedName = driver.findElement(userCard).getText();
        String address = userAddress;
        assertTrue(expectedName.contains(address));


    }
    public  void assertDOB(){
        String expectedName = driver.findElement(userCard).getText();
        String DOB = assertDay(day) + " "+assertMonth(month) +" "+ year;
        assertTrue(expectedName.contains(DOB));
    }
    public String assertDay(String day){
        if(day.equals("01")){
            day= 1+"st";
        }
        else if(day.equals("02")){
            day = 2+"nd";
        }
        else if(day.equals("03")){
            day = 3+"rd";
        }
        else{
            day = day+"th";
        }
        return day;

    }
    public String assertMonth(String  month) {
        switch (month) {
            case "1":
                return "January";
            case "2":
                return "February";
            case "3":
                return "March";
            case "4":
                return "April";
            case "5":
                return "May";
            case "6":
                return "June";
            case "7":
                return "July";
            case "8":
                return "August";
            case "9":
                return "September";
            case "10":
                return "October";
            case "11":
                return "November";
            case "12":
                return "December";
    }


        return month;
    }
    }
