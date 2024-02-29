package org.pojo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class AdactinLoginPojo extends BaseClass {
	public AdactinLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement element;

	public WebElement getElement() {
		return element;
	}
    	@FindBy(id = "password")	
    
    private WebElement enterpass;
	public WebElement getEnterpass() {
		return  enterpass;
	}

	@FindBy(name = "login")
	private WebElement clkbtn;

	public WebElement getClkbtn() {
		return clkbtn;
	}

}
