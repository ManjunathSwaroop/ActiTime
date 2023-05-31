package com.actitime.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMethods {
public void selectIndex(WebElement we, int i) {
	Select s= new Select(we);
	s.selectByIndex(i);
}
public void selectString(WebElement we,String text) {
	Select s= new Select(we);
	s.selectByVisibleText(text);
}
public void selectValue(WebElement we,String text ) {
	Select s= new Select(we);
	s.selectByValue(text);
}

}
