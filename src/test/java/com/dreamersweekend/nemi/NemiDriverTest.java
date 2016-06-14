package com.dreamersweekend.nemi;

import org.testng.annotations.Test;

import com.dreamersweekend.with.With;

public class NemiDriverTest {

	@Test
	public void nemiDriverTest() {
		NemiDriver driver = new NemiDriver(Browser.CHROME);
		driver.get("https://www.google.com");
		//NemiElement element = driver.findElement(With.name("q"));
		driver.manage().window().maximize();
		NemiDriver driver1 = new NemiDriver(Browser.CHROME);
		driver1.get("https://www.flipkart.com");
		
		driver.quit();

	}
}
