package com.dreamersweekend.nemi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NemiDriverTest {

	@Test
	public void nemiDriverTest() {
		NemiDriver driver = new NemiDriver(Browser.FIREFOX);
		driver.get("https://www.google.com");
		NemiElement element = (NemiElement) driver.findElement(By.name("q"));
		driver.manage().window().maximize();
		driver.quit();

	}
}
