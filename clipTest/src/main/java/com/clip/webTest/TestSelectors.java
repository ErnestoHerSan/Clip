package com.clip.webTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelectors {
	public ChromeDriver driver = new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver, 1000);
	Boolean result=false;
	Actions action = new Actions(driver);

	@Test
	public void testCheckbox() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"))));
		Select listDropdown = new Select (driver.findElement(By.id("dropdown")));
		listDropdown.selectByVisibleText("Option 2");
		if(Boolean.parseBoolean(driver.findElement(By.xpath("//*[@id=\"dropdown\"]/option[3]")).getAttribute("selected"))) 
			result=true;		 
		Thread.sleep(2000);
		driver.close();
		Assert.assertEquals(true, result);
	}
}

