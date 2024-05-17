package com.nation.qa.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.nation.qa.confiq.ConfiigurationDetails;


public class TestBaseNW
{
	public static WebDriver driver;
	public static void implicitewait() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(com.nation.qa.utility.TestUtilNw.IMPLICITE_WAIT));
	}

	
	@SuppressWarnings("deprecation")
	public static void initialization1()

	{
		// This is headless cod
		/*
		 * options.addArguments("--no-sandbox");
		 * options.addArguments("--disable-dev-shm-usage");
		 * options.addArguments("--headless", "--window-size=1368,768");
		 */

		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(com.nation.qa.utility.TestUtilNw.PAGE_LOAD_TIMEOUT,
				TimeUnit.SECONDS);
		driver.get(ConfiigurationDetails.URL);
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(ConfiigurationDetails.Username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(ConfiigurationDetails.Password);
		driver.findElement(By.xpath("//button[normalize-space()='Log In']")).click();
	}
	
}
