package org.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter {
	WebDriver driver;
	//@Parameters({"email","pass"})

	@Test
	private void tc1(String email,String pass) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\Testng\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
	
		WebElement email1 = driver.findElement(By.id("email"));
		email1.sendKeys(email);
		WebElement pass1 = driver.findElement(By.id("pass"));
		pass1.sendKeys(pass);
		 WebElement btnlogin = driver.findElement(By.name("login"));
	     btnlogin.click();
	}
	
	}


