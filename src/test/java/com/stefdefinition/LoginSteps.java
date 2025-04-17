package com.stefdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver = Hooks.driver;

	//Scenario: Test the valid login
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Step 1");
		driver.get("http://demostore.supersqa.com/my-account/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Step 2");
		driver.findElement(By.id("username")).sendKeys("istqbflpp@gmail.com");
		driver.findElement(By.name("password")).sendKeys("A12*R236m");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("Step 3");
		driver.findElement(By.name("login")).click();

	}

	@Then("user should land on My Account page")
	public void user_should_land_on_home_page() {
		System.out.println("Step 4");
		System.out.println("User is on Home page");
	}
	
//	Scenario: Test the fogot password
	@When("user click lost your password link")
	public void user_click_lost_your_password_link() {
		System.out.println("Step 5");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/main/article/div/div/div[2]/div[1]/form/p[4]/a")).click();

	}

	@Then("user redirect to the lost password page")
	public void user_redirect_to_the_lost_password_page() {
		System.out.println("Step 6");
		System.out.println("User is on Lost Password page");

	}

	@Then("when user give email address")
	public void when_user_give_email_address() {
		System.out.println("Step 7");
		driver.findElement(By.id("user_login")).sendKeys("istqbflpp@gmail.com");

	}

	@Then("click the reset password button")
	public void click_the_reset_password_button() {
		System.out.println("Step 8");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/main/article/div/div/form/p[3]/button")).click();
	}

	@Then("success message display on the page")
	public void success_message_display_on_the_page() {
		System.out.println("Step 9");
		System.out.println("User is on Home page");
	}

}
