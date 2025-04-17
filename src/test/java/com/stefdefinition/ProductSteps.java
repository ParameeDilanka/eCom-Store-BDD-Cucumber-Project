package com.stefdefinition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSteps {
	
	    WebDriver driver = Hooks.driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Scenario: Check the product category
	@Given("the user is on  product detail page")
	public void the_user_is_on_product_detail_page() {
		System.out.println("Step 1");
        driver.get("http://demostore.supersqa.com/product/album/");
	}

	@When("user click the category link")
	public void user_click_the_category_link() {
		System.out.println("Step 2");
		driver.findElement(By.linkText("Music")).click();
	}

	@Then("user will land on the category page")
	public void user_will_land_on_the_category_page() {
		System.out.println("Step 3");
        System.out.println("User will successfully land on the music category page");
	}
	
//	Scenario: Check the reviews in the product
	@When("user click the reviews link")
	public void user_click_the_reviews_link() {
		System.out.println("Step 4");
	   driver.findElement(By.xpath("//a[normalize-space()='Reviews (0)']")).click();
	}

	@Then("user will land on the review section")
	public void user_will_land_on_the_review_section() {
		System.out.println("Step 5");
        System.out.println("User will successfully land on the review section");
	}
}
