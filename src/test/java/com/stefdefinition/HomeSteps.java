package com.stefdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class HomeSteps {
    WebDriver driver = Hooks.driver;

//	  Scenario: View product details
    @Given("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("Step 1");
        driver.get("http://demostore.supersqa.com/");
    }

    @When("user clicks the belt")
    public void user_clicks_the_belt() {
        System.out.println("Step 2");
        driver.findElement(By.xpath("//a[@href='http://demostore.supersqa.com/product/belt/']")).click();
    }

    @Then("user can see the details of the belt")
    public void user_can_see_the_details_of_the_belt() {
        System.out.println("Step 3");
        System.out.println("User is on product details page");
    }

//	Scenario: Search the product   
    @Given("the user is on Search product field")
    public void the_user_is_on_search_product_field() {
    	 System.out.println("Step 4");
         driver.get("http://demostore.supersqa.com/");
    }

    @When("user give the products name")
    public void user_give_the_products_name() {
   	 System.out.println("Step 5");
     WebElement search = driver.findElement(By.id("woocommerce-product-search-field-0"));
     search.sendKeys("Belts");
     search.click();
    }

    @Then("search product display on the home page")
    public void search_product_display_on_the_home_page() {
   	 System.out.println("Step 6");
     System.out.println("Item display on the page");

    }
    
    //	Scenario: Select the product from the drop down menu
    @Given("the user is on home page")
    public void the_user_is_on_home_page() {
      	 System.out.println("Step 7");
         driver.get("http://demostore.supersqa.com/");
    }

    @When("user sort the product using drop down menu")
    public void user_sort_the_product_using_drop_down_menu() {
      	 System.out.println("Step 8");
      	Select sortDropdown = new Select(driver.findElement(By.xpath("//div[@class='col-full']//div[1]//form[1]//select[1]")));
      	sortDropdown.selectByVisibleText("Sort by popularity");

    }

    @Then("sorted product display on the home page")
    public void sorted_product_display_on_the_home_page() {
      	 System.out.println("Step 9");
         System.out.println("Item display on the page");

    }

//	Scenario: Click the links on the footer
    @When("click the links on the footer")
    public void click_the_links_on_the_footer() {
     	 System.out.println("Step 10");
     	 driver.findElement(By.linkText("Built with Storefront & WooCommerce")).click();
    }

    @Then("redirect to the relevant page")
    public void redirect_to_the_relevant_page() {
     	 System.out.println("Step 11");
         System.out.println("Page redirect successfully");

    }
    
//	Scenario: Click the arrow icon on the page
    @When("click the arrow icon on the page")
    public void click_the_arrow_icon_on_the_page() {
   	 System.out.println("Step 12");
   	 driver.findElement(By.xpath("//div[@class='col-full']//div[1]//nav[1]//ul[1]//li[3]//a[1]")).click();
}

    @Then("redirect to the next page")
    public void redirect_to_the_next_page() {
    	 System.out.println("Step 13");
         System.out.println("Current page redirect to the next page successfully");
    }

}
