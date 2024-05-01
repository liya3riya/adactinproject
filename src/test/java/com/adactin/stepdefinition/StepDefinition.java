package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public static WebDriver driver = RunnerClass.driver;
	
	@Given("^User launch the Adactin web application\\.$")
	public void user_launch_the_Adactin_web_application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		  Thread.sleep(5000);
			
	}

	@When("^User enter the user name in the username field\\.$")
	public void user_enter_the_user_name_in_the_username_field() throws Throwable {
		
		 WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		
		 username.sendKeys("jivita04");
		  
		  Thread.sleep(2000);
	}

	@When("^User enter the password in the password field\\.$")
	public void user_enter_the_password_in_the_password_field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

	}

	@Then("^User after given the login details click the login button to navigate to search hotel page\\.$")
	public void user_after_given_the_login_details_click_the_login_button_to_navigate_to_search_hotel_page() throws Throwable {
		driver.findElement(By.xpath("//input[@type='Submit']")).click();

	}@When("^User have to select mandatory for preffered location in search hotel page\\.$")
	public void user_have_to_select_mandatory_for_preffered_location_in_search_hotel_page() throws Throwable {
		
		  WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		  
		  Select s = new Select(location);
		  
		  s.selectByValue("Los Angeles");
	}

	@When("^User have to select preffered hotels in search hotel page\\.$")
	public void user_have_to_select_preffered_hotels_in_search_hotel_page() throws Throwable {
		
		  
		  
		  WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		  
		  Select h = new Select(hotels);
		  
		  h.selectByValue("Hotel Sunshine");
	}

	@When("^User have to select preffered Room Type in search hotel page\\.$")
	public void user_have_to_select_preffered_Room_Type_in_search_hotel_page() throws Throwable {
		
		  WebElement room_type = driver.findElement(By.xpath("//select[@name='room_type']"));
		  
		  Select r = new Select(room_type);
		  
		  r.selectByValue("Deluxe");
	}

	@When("^User have to select mandatory for the number of rooms in search hotel page\\.$")
	public void user_have_to_select_mandatory_for_the_number_of_rooms_in_search_hotel_page() throws Throwable {
		
  WebElement noofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		  
		  Select  s1 = new Select(noofrooms);
		  
		  s1.selectByIndex(10);
		  
	}

	@When("^User have to select mandatory for adults per room in search hotel page\\.$")
	public void user_have_to_select_mandatory_for_adults_per_room_in_search_hotel_page() throws Throwable {
		
		 WebElement Adults_per_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
		  
		  Select  t = new Select(Adults_per_room);
		  
		  t.selectByIndex(4);
		  
	}

	@When("^User have to select children per room in search hotel page\\.$")
	public void user_have_to_select_children_per_room_in_search_hotel_page() throws Throwable {
		
		  
		  WebElement Children_per_Room = driver.findElement(By.xpath("//select[@id='child_room']"));
		  
		  Select  c = new Select(Children_per_Room);
		  
		  c.selectByIndex(4);
	}
	

	@Then("^After selcted all the fields and click search button to navigate select hotel page\\.$")
	public void after_selcted_all_the_fields_and_click_search_button_to_navigate_select_hotel_page() throws Throwable {
		
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Given("^User have to select mandatory the hotel from the select hotel page\\.$")
	public void user_have_to_select_mandatory_the_hotel_from_the_select_hotel_page() throws Throwable {
		
		  driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	}

	@Then("^User have to click continue button to navigate Book a hotel page\\.$")
	public void user_have_to_click_continue_button_to_navigate_Book_a_hotel_page() throws Throwable {
		
		  driver.findElement(By.xpath("//input[@name='continue']")).click();

	}

	@When("^User mandatory to enter the First name in First name field\\.$")
	public void user_mandatory_to_enter_the_First_name_in_First_name_field() throws Throwable {
	
		  driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Monish");
	}

	@When("^User mandatory to enter the Last name in Last name field\\.$")
	public void user_mandatory_to_enter_the_Last_name_in_Last_name_field() throws Throwable {
		
		  driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("TM");

	}

	@When("^User mandatory to enter the Billing Address in Billing Address field\\.$")
	public void user_mandatory_to_enter_the_Billing_Address_in_Billing_Address_field() throws Throwable {
		
		  driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("no 102,Prince village appartment,elaya street,tondiarpet,ch-81.");

	}

	@When("^User mandatory to enter the Credit Card No in Credit Card No field\\.$")
	public void user_mandatory_to_enter_the_Credit_Card_No_in_Credit_Card_No_field() throws Throwable {
		
		  driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("4569426771271478");

	}

	@When("^User mandatory to select the preffered credit card type to select in credit card type\\.$")
	public void user_mandatory_to_select_the_preffered_credit_card_type_to_select_in_credit_card_type() throws Throwable {
		
		  WebElement Credit_card_type = driver.findElement(By.xpath("//select[@name='cc_type']"));

		  Select  c = new Select(Credit_card_type);
		  
		  c.selectByIndex(2);
	}

	@When("^User mandatory to select the Expiry month to select in credit card type\\.$")
	public void user_mandatory_to_select_the_Expiry_month_to_select_in_credit_card_type() throws Throwable {
		

		  WebElement Expiry_date_month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		  
		  Select  e = new Select(Expiry_date_month);
		  
		  e.selectByIndex(8);	
	}
	
	@When("^User mandatory to select the Expiry year to select in credit card type\\.$")
	public void user_mandatory_to_select_the_Expiry_year_to_select_in_credit_card_type() throws Throwable {
		
		  
		  WebElement Expiry_date_year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		  
		  Select  f = new Select(Expiry_date_year);
		  
		  f.selectByIndex(14);
		  
	}

	@When("^User mandatory to enter the CVV number to enter in the CVV number\\.$")
	public void user_mandatory_to_enter_the_CVV_number_to_enter_in_the_CVV_number() throws Throwable {
		
		 driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("352");
		 	
	}

	@Then("^User have to click Search button to navigate Booking Confirmation page\\.$")
	public void user_have_to_click_Search_button_to_navigate_Booking_Confirmation_page() throws Throwable {
		
		 driver.findElement(By.xpath("//input[@name='book_now']")).click();

	}
	
	@Then("^: User to click my logout button to navigate Booked logout page\\.$")
	public void user_to_click_my_logout_button_to_navigate_Booked_logout_page() throws Throwable {
		
		 Thread.sleep(5000);
		 	
		 driver.findElement(By.xpath("//input[@name='logout']")).click();
	}

}
