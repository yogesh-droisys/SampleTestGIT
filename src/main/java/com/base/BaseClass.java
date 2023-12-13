package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	
	@BeforeTest
	public void loadConfig()
	{
		try {
			
			prop = new Properties();
			System.out.println("super constructor invoked");
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\Configuration\\Config.properties");
			prop.load(ip);
			
			System.out.println("driver: " + driver);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void lauchWeb() {
		WebDriverManager.chromedriver().setup();
		String browserName = prop.getProperty("browser");
		
		if (browserName.contains("Chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.contains("FireFox")) {
			driver = new FirefoxDriver();
		}  else if (browserName.contains("Edge")) {
			driver = new EdgeDriver();
		} 
		
		
		driver.get(prop.getProperty("url"));
		
	}


	public void click(WebDriver driver, WebElement ele) {
		// TODO Auto-generated method stub
		
	}
 

	
	
	

}
