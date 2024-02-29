package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class AdactinHotelBookingPojo extends BaseClass {
	public AdactinHotelBookingPojo() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(name="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement addressname;
	@FindBy(name="cc_num")
	private WebElement ccnum;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(name="cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(name="cc_cvv")
	private WebElement cccvv;
	@FindBy(name="book_now")
	private WebElement booknow;
	@FindBy(name="order_no")
	private WebElement orderno;
	@FindBy(name="logout")
	private WebElement logout;
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement hotelname;
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddressname() {
		return addressname;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}
	public WebElement getCcexpyear() {
		return ccexpyear;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getHotelname() {
		return hotelname;
	}

}
