package pagesTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	// The test executed based on alphabetical order, if no priority given
	// (enabled = true) means The test case is not disable, it can run
	// (enabled = false) means The test case is disable, it is not running
	// priority = 1 means, this test case will run first, 2 means second .... ... so
	// on

	@Test(enabled = true)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}

	@Test(enabled = true)
	public void use_of_getTitle_method() {
		System.out.println("The Title of the page is: " + driver.getTitle());
	}
	
//	@Test(enabled = false)
//	public void use_of_getCurrentURL_method () throws InterruptedException {
//		driver.findElement(By.className("cms-newuser-reg")).click();
//		Thread.sleep(4000);
//		System.out.println("The current URL is: " + driver.getCurrentUrl());
//		System.out.println("The Title of the page is: " + driver.getTitle());
//	}
	
}
