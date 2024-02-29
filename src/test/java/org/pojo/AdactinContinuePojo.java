package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utils.BaseClass;

public class AdactinContinuePojo extends BaseClass {
	public AdactinContinuePojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	@FindBy(name = "continue")
	private WebElement con;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCon() {
		return con;
	}

}
