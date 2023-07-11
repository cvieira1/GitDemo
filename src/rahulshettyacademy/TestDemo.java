package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

	@Test
	public void titleCheck() throws MalformedURLException {
	
		MutableCapabilities caps = new MutableCapabilities();
		WebDriver driver = new RemoteWebDriver(new URL("https://hub-cloud.browserstack.com/wd/hub"), caps);
		
		driver.get("https://rahulshettyacademy.com");
		Assert.assertTrue(driver.getTitle().matches("Selenium, API Testing, Software Testing & More QA Tutorials  | Rahul Shetty Academy"));
		System.out.println("postJira2");
		System.out.println("postJira3");
		System.out.println("postJira4");
		System.out.println("postJira5");
		System.out.println("postJira6");
		System.out.println("postJira7");
		
	}
	
}
