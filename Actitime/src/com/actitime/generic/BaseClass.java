package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public  static WebDriver driver;
@BeforeTest
public void openBrowser() throws EncryptedDocumentException, IOException {
	Reporter.log("create customer",true);
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterTest
public void closeBrowser() {
	Reporter.log("close browser",true);
	driver.close();
}
@BeforeMethod
public void login() throws EncryptedDocumentException, IOException {
	Reporter.log("login into the browser",true);
	FileLib f= new FileLib();
	String url = f.getExcelData("Create Customer", 1,6);
	String un = f.getExcelData("Create Customer", 1,7);
	String pwd = f.getExcelData("Create Customer", 1,8);
	driver.get(url);
	LoginPage l= new LoginPage(driver);
	l.setLogin(un, pwd);
}
@AfterMethod
public void logout() {
	Reporter.log("logout from the browser");
	HomePage h= new HomePage(driver);
	h.getLogoutbtn().click();
}
}
