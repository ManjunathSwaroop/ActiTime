package com.actitime.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions extends BaseClass {
public void mouseHover(WebElement we) {
	Actions a= new Actions(driver);
	a.moveToElement(we).perform();	
}
 
public void rightClick() {
	Actions a= new Actions(driver);
	a.contextClick();
} 
public void dragAndDrop(WebElement src,WebElement dest) {
	Actions a= new Actions(driver);
	a.dragAndDrop(src, dest);
}
public void doubleClick(WebElement we) {
	Actions a= new Actions(driver);
	a.doubleClick(we);
}
}
