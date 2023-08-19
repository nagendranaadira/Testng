package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.collect.ObjectArrays;

public class DataProvider {
	@Test(dataProvider= "sampledata")
	 public void tc100(String email,String password) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\Downloads\\Testng\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		
			WebElement email1 = driver.findElement(By.id("email"));
			email1.sendKeys(email);
			WebElement pass1 = driver.findElement(By.id("pass"));
			pass1.sendKeys(password);
			WebElement login = driver.findElement(By.name("login"));
			login.click();
			
		 }
         @DataProvoider(name="sampledata")
          public Object[][]data(){
			return new Object[][] {
				{"User1","test123"}, 
				{"User2","test456"},
				{"User3","test789"},
        	  
          };
}
}