package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addnewbtn;

@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newcustomerbtn;

@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @ class]")
private WebElement customernametxtfld;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement customerdescpntxtfld;

@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
private WebElement selectcustomerdd;

@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
private WebElement BigBangCompany;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createcustomerbtn;

@FindBy(xpath="(//div[@class='editButton'])[15]/../div[1]")
private WebElement actualcustomer;

public TaskPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getAddnewbtn() {
	return addnewbtn;
}

public WebElement getNewcustomerbtn() {
	return newcustomerbtn;
}

public WebElement getCustomernametxtfld() {
	return customernametxtfld;
}

public WebElement getCustomerdescpntxtfld() {
	return customerdescpntxtfld;
}

public WebElement getSelectcustomerdd() {
	return selectcustomerdd;
}

public WebElement getgetBigBangCompany() {
	return BigBangCompany;
}

public WebElement getCreatecustomerbtn() {
	return createcustomerbtn;
}

public WebElement getActualcustomer() {
	return actualcustomer;
}

}
