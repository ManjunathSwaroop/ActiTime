package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
@Test
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("Create Customer",true);
	HomePage h= new HomePage(driver);
	h.getTasktab().click();
	TaskPage t= new TaskPage(driver);
	t.getAddnewbtn().click();
	t.getNewcustomerbtn().click();
	FileLib l= new FileLib();
	String customer = l.getExcelData("Create Customer", 1, 3);
	String description = l.getExcelData("Create Customer", 1, 4);
	t.getCustomernametxtfld().sendKeys(customer);
	t.getCustomerdescpntxtfld().sendKeys(description);
	t.getSelectcustomerdd().click();
	t.getgetBigBangCompany().click();
	t.getCreatecustomerbtn().click();
	String actualcust = t.getActualcustomer().getText();
	Assert.assertEquals(actualcust,customer);
	Thread.sleep(10000);
}
}
