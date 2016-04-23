package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.dreamersweekend.nemi.NemiDriver;
import com.dreamersweekend.wrappers.Nemi;

public class JSCOmmandTest {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		//NemiDriver.setDriver(driver);
		Nemi nm = new Nemi();
		int height = nm.getAbsoluteHeight();
		System.out.println(height);
	}
}
