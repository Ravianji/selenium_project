package demo_package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class Annotations extends BaseClass {
	@Test
	public void loginWithValidCredetials() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("Demo@121");
		driver.findElement(By.id("Password")).sendKeys("demow@3012");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		syso
	}
	@Test
	public void loginWithInvalidCredetials() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("Demo@121");
		driver.findElement(By.id("Password")).sendKeys("demow@3012");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		
	}
	

}
