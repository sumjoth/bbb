package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Base {
	static WebDriver driver;

@Given("The user should be telecom homepage")
public void the_user_should_be_telecom_homepage() {
	System.out.println("Given-1");
	System.setProperty("webdriver.chrome.driver","E:\\\\\\\\Selenium\\\\\\\\Company\\\\\\\\driver\\\\\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
	driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
   
}

@When("The user provide validate details {string},{string},{string},{string},{string}")
public void the_user_provide_validate_details(String fname, String lname, String email, String address, String phone) {
	System.out.println("When-1");
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(fname);
	driver.findElement(By.id("lname")).sendKeys(lname);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(address);
	driver.findElement(By.id("telephoneno")).sendKeys(phone);
	driver.findElement(By.xpath("//input[@value='Submit']")).click();
   
}

@Then("The user validate the customer id generate")
public void the_user_validate_the_customer_id_generate() {
	System.out.println("Then-1");
	Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
}



}
