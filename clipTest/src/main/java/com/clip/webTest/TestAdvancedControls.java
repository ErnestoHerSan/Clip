package com.clip.webTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAdvancedControls {

	public ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, 1000);
	Boolean result=false;
	Actions action = new Actions(driver);

	@Test
	public void testCheckbox() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/context_menu");
		driver.manage().window().maximize();
		action.contextClick(driver.findElement(By.id("hot-spot"))).perform();
		if(isAlertPresent(driver))
			result=true;
		Thread.sleep(2000);
		driver.close ();
		Assert.assertEquals(true, result);
	}

	public boolean isAlertPresent(WebDriver driver) {
		try {
			Alert alert=driver.switchTo().alert();
			alert.accept();
			return true;
		} catch (Exception Ex) {
			return false;
		}
	}
}
