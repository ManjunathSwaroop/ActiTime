package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//div[@id='container_tasks']")
private WebElement tasktab;

@FindBy(xpath="//a[@class='logout']")
private WebElement logoutbtn;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getTasktab() {
	return tasktab;
}

public WebElement getLogoutbtn() {
	return logoutbtn;
}

}
