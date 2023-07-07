package demo_package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class Annotations2 extends BaseClass {
	@Test
	public void loginWithValidCredetials() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("hjhd");
		driver.findElement(By.id("Password")).sendKeys("jdbckjsd");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		
	}
	@Test
	public void loginWithInvalidCredetials() throws InterruptedException {
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("jbdck");
		driver.findElement(By.id("Password")).sendKeys("jbccd");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(2000);
		
	}
	

}
