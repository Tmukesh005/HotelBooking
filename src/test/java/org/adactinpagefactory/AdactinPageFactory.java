package org.adactinpagefactory;

import org.baseadactin.BaseAdactin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPageFactory extends BaseAdactin {
	public AdactinPageFactory() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement Hotels;

	@FindBy(id = "room_type")
	private WebElement Room_type;

	@FindBy(id = "room_nos")
	private WebElement Number_of_Rooms;

	@FindBy(id = "datepick_in")
	private WebElement Check_in;

	@FindBy(id = "datepick_out")
	private WebElement Check_outs;

	@FindBy(id = "adult_room")
	private WebElement Adult_per_roon;

	@FindBy(id = "child_room")
	private WebElement children_per_room;

	@FindBy(id = "Submit")
	private WebElement serach;

	@FindBy(id = "radiobutton_0")
	private WebElement radio_button;

	@FindBy(id = "continue")
	private WebElement contin;

	@FindBy(id = "first_name")
	private WebElement first_name;

	@FindBy(id = "last_name")
	private WebElement last_name;

	@FindBy(id = "address")
	private WebElement Billing_Address;

	@FindBy(id = "cc_num")
	private WebElement card_number;

	@FindBy(id = "cc_type")
	private WebElement card_type;

	@FindBy(id = "cc_exp_month")
	private WebElement expiry_month;

	public WebElement getCvv_number() {
		return cvv_number;
	}

	public WebElement getBook() {
		return book;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement expiry_year;

	@FindBy(id = "cc_cvv")
	private WebElement cvv_number;

	@FindBy(id = "book_now")
	private WebElement book;

	public WebElement getExpiry_month() {
		return expiry_month;
	}

	public WebElement getExpiry_year() {
		return expiry_year;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBilling_Address() {
		return Billing_Address;
	}

	public WebElement getCard_number() {
		return card_number;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getContin() {
		return contin;
	}

	public WebElement getSerach() {
		return serach;
	}

	public WebElement getRadio_button() {
		return radio_button;
	}

	public WebElement getAdult_per_roon() {
		return Adult_per_roon;
	}

	public WebElement getChildren_per_room() {
		return children_per_room;
	}

	public WebElement getCheck_in() {
		return Check_in;
	}

	public WebElement getCheck_outs() {
		return Check_outs;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoom_type() {
		return Room_type;
	}

	public WebElement getNumber_of_Rooms() {
		return Number_of_Rooms;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
