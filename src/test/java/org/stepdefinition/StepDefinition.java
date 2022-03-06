package org.stepdefinition;

import org.adactinpagefactory.AdactinPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition extends AdactinPageFactory {
	
	@Given("^Open adactin and launch application$")
	public void pass_url() {
		url("https://adactinhotelapp.com/");
	}
	@When("^get into adactin site and book tickets$")
	public void find_elemeent() {
		getUser().sendKeys(xcel_read(1, 0));
		getPassword().sendKeys(xcel_read(1, 1));
		getLogin().click();
		pause();
		select(getLocation(), "Sydney");
		select(getHotels(), "Hotel Sunshine");
		select(getRoom_type(), "Standard");
		select(getNumber_of_Rooms(), "2 - Two");
		getCheck_in().sendKeys("20/03/2022");
		getCheck_outs().sendKeys("25/03/2022");
		select(getAdult_per_roon(), "2 - Two");
		select(getChildren_per_room(), "1 - One");
		getSerach().click();
		getRadio_button().click();
		getContin().click();
		getFirst_name().sendKeys("mukesh");
		getLast_name().sendKeys("T");
		getBilling_Address().sendKeys("Ayanavaram");
		getCard_number().sendKeys("4456-7796-4321_8754");
		select(getCard_type(), "VISA");
		select(getExpiry_month(), "February");
		select(getExpiry_year(), "2016");
		getCvv_number().sendKeys("765");
		getBook().click();
		
		
		
	}
	}
