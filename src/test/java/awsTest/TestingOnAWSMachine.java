package awsTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestingOnAWSMachine {

	@Test
	public void searchSelenium() throws MalformedURLException
	{
		FirefoxOptions opt = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://13.201.66.50:4444/"),opt);
		driver.manage().window().maximize();
		driver.get("https://www.journeytoautomation.org");
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search JourneyToAutomation']"));
		searchBox.sendKeys("Selenium");
		searchBox.sendKeys(Keys.RETURN);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}

