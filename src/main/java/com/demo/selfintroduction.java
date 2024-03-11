package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selfintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking Browser
		//Chrome - ChromeDriver exten->Methods close get
		//Firefox - FirefoxDriver ->Methods close get
		//safari SaariDriver ->methods close get
		//WebDriver close get
		//WebDriver methods + class methods
		// step to invoke chrome driver
		//Selenium Manager
		
		//chromedriver.exe-> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:/Users/Ashwchau/OneDrive - Capgemini/Documents/chromedriver.exe");
		//webdriver.chrome.driver->value of path
		WebDriver driver = new ChromeDriver();
		
		
		
		//Firefox launch
		//geckodriver
		
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver", "C:/Users/Ashwchau/OneDrive - Capgemini/Documents/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//edge launch
		System.setProperty("webdriver.edge.driver", "C:/Users/Ashwchau/OneDrive - Capgemini/Documents/msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/");
		driver1.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		driver.close();
		driver1.close();
		//driver.quit();
	}

}
