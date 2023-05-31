package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(id="username")
private WebElement usernametxtbx;

@FindBy(name="pwd")
private WebElement passwordtxtbx;

@FindBy(xpath="//div[text()='Login ']")
private WebElement Loginbtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void setLogin(String un, String pwd) {
	usernametxtbx.sendKeys(un);
	passwordtxtbx.sendKeys(pwd);
	Loginbtn.click();
}

}
