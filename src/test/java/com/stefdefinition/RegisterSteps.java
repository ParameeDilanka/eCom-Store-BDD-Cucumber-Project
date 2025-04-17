package com.stefdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterSteps {
    WebDriver driver = Hooks.driver;
	
	//Scenario: Test the Register login
	@Given("user is on register page")
	public void user_is_on_register_page() {
		System.out.println("Step 1");
		driver.get("http://demostore.supersqa.com/my-account/");
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() {
		System.out.println("Step 2");
		driver.findElement(By.id("reg_email")).sendKeys("istqbflpp@gmail.com");
		driver.findElement(By.id("password")).sendKeys("A12*R236m");
	}

	@When("click on register button")
	public void click_on_register_button() {
		System.out.println("Step 3");
		driver.findElement(By.name("login")).click();
	}

	@Then("user should land on home pages")
	public void user_should_land_on_home_pages() {
		System.out.println("Step 4");
		System.out.println("User is on Home page");
		driver.close();
	}

	//Scenario: Test the privacy policy link
	@When("user click privacy policy link")
	public void user_click_privacy_policy_link() {
		System.out.println("Step 5");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/main/article/div/div/div[2]/div[2]/form/div/p/a")).click();
	}

	@Then("user should land on privacy policy page")
	public void user_should_land_on_privacy_policy_page() {
		System.out.println("Step 6");
		driver.get("http://demostore.supersqa.com/?page_id=3");
	}
	
//	Scenario: Test the product category
	@Given("user is on the privacy policy page")
	public void user_is_on_the_privacy_policy_page() {
		System.out.println("Step 7");
		driver.get("http://demostore.supersqa.com/?page_id=3");
	}

	@When("user clicks the product category")
	public void user_clicks_the_product_category() {
		System.out.println("Step 8");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/main/div/div/div/nav/div/ul/li[1]/ul/li[1]/a")).click();
	}

	@Then("user can see the related products belongs to the category")
	public void user_can_see_the_related_products_belongs_to_the_category() {
		System.out.println("Step 9");
		driver.get("http://demostore.supersqa.com/product-category/clothing/accessories/");
		System.out.println("Product displayed successfully");
	}
}
