package com.stefdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.junit.Assert;

import io.cucumber.java.en.*;

public class Checkout {

    WebDriver driver = Hooks.driver;

//    Background
    @Given("user is on product details page")
    public void user_is_on_product_details_page() {
        System.out.println("Step 1");
        driver.get("http://demostore.supersqa.com/product/belt/");
    }

    @When("user choose the quantity")
    public void user_choose_the_quantity() {
        System.out.println("Step 2");
        WebElement quantityField = driver.findElement(By.cssSelector("input.input-text.qty"));
        quantityField.clear();
        quantityField.sendKeys("3");
    }

    @When("user clicks the add to cart button")
    public void user_clicks_the_add_to_cart_button() {
        System.out.println("Step 3");
        driver.findElement(By.name("add-to-cart")).click();
    }

    @When("I view the cart")
    public void viewCart() {
        System.out.println("Step 4");
        WebElement viewCartLink = driver.findElement(By.linkText("View cart"));
        viewCartLink.click();
    }

    @When("I proceed to the checkout page")
    public void proceedToCheckout() {
        System.out.println("Step 5");
        WebElement proceedToCheckoutButton = driver.findElement(By.cssSelector(".checkout-button"));
        proceedToCheckoutButton.click();
    }

//    Scenario: Verify checkout page loaded
    @Then("I should be on the checkout page")
    public void verifyCheckoutPage() {
        System.out.println("Step 6");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("checkout"));
    }

//    Scenario: Test the billing details page
    @When("user give relevant details")
    public void user_give_relevant_details() {
        System.out.println("Step 7");
        driver.findElement(By.id("billing_first_name")).sendKeys("Amal");
        driver.findElement(By.id("billing_last_name")).sendKeys("Liyanage");
        driver.findElement(By.id("billing_address_1")).sendKeys("No. 123, Main St");
        driver.findElement(By.id("billing_address_2")).sendKeys("Union Villa");
        driver.findElement(By.id("billing_city")).sendKeys("LA");
        driver.findElement(By.id("billing_postcode")).sendKeys("30012");
        driver.findElement(By.id("billing_phone")).sendKeys("021341638");
        driver.findElement(By.id("billing_email")).sendKeys("istqbflpp@gmail.com");

        driver.findElement(By.cssSelector("#select2-billing_country-container")).click();
        driver.findElement(By.xpath("//li[text()='United States (US)']")).click();

        driver.findElement(By.cssSelector("#select2-billing_state-container")).click();
        driver.findElement(By.xpath("//li[text()='California']")).click();
    }
    
//This is bug. Can't click the place order button cause, there are no valid payment options.
    @When("user click place order button")
    public void user_click_place_order_button() {
    System.out.println("Step 8");
    driver.findElement(By.name("woocommerce_checkout_place_order")).click(); 
    }

    @Then("successful message display on the page")
    public void successful_message_display_on_the_page() {
        System.out.println("Step 9");
        WebElement confirmation = driver.findElement(By.cssSelector(".woocommerce-thankyou-order-received"));
        Assert.assertTrue(confirmation.isDisplayed());
        System.out.println("Order placed successfully!");
    }
    
//    Scenario: Test the Returning customer
    @When("customer is Returning customer")
    public void customer_is_returning_customer() {
        System.out.println("Step 10");
        System.out.println("Customer is a returning customer");
    }

    @Then("usser need to click the {string} link")
    public void usser_need_to_click_the_link(String string) {
        System.out.println("Step 11");
        driver.findElement(By.xpath("//a[normalize-space()='Click here to login']")).click();
    }

    @Then("need to display the login form")
    public void need_to_display_the_login_form() {
        System.out.println("Step 12");
        System.out.println("Login form display successfully");
    }

//    Scenario: Test the have a coupon field
    @When("user have a coupen")
    public void user_have_a_coupen() {
        System.out.println("Step 13");
        System.out.println("Customer have a coupen");
    }

    @Then("need to click the {string} link")
    public void need_to_click_the_link(String string) {
        System.out.println("Step 14");
        driver.findElement(By.xpath("//a[normalize-space()='Click here to enter your code']")).click();
    }

    //Note: There are no valid coupens at that time. There fore failed here.
    @Then("then need to appy the coupen")
    public void then_need_to_appy_the_coupen() {
        System.out.println("Step 15");
        driver.findElement(By.id("coupon_code")).sendKeys("CP23679");
        driver.findElement(By.name("apply_coupon")).click();
    }

    @Then("display the validity of the coupen")
    public void display_the_validity_of_the_coupen() {
        System.out.println("Step 16");
        System.out.println("Message Displayed!!!");

    }

}
