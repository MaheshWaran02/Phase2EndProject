package stepdefs;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class AddToCardDefs {
	WebDriver driver = Hooks.driver;

	@When("click on what product i want")
	public void click_on_what_product_i_want() {
		WebElement Product = driver.findElement(By.className("inventory_item_name"));
		Product.click();
		
	}

	@When("Click on Add to cart")
	public void click_on_Add_to_cart()  {
		WebElement cart = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		cart.click();
		
	    
	}

	@When("Click on your Cart")
	public void click_on_your_Cart() throws InterruptedException {
		Thread.sleep(2000);
		WebElement MyCart = driver.findElement(By.className("shopping_cart_link"));
		MyCart.click();
		
	 
	}

	@When("Verify the Name of the product {string}")
	public void verify_the_Name_of_the_product(String ExpProduct) {
		WebElement ActProduct = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		Object productNameincart = ActProduct.getText();
		Assert.assertEquals(ExpProduct,productNameincart);
	    
	}
}


	