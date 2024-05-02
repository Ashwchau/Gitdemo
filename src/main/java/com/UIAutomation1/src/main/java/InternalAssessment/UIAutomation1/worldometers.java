package InternalAssessment.UIAutomation1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class worldometers {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String xpath_current_population = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_population = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_thisyear_population = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		
		String xpath_today_thisYear_population = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/");
		
		int count = 1;
		while(count<=20) {
			System.out.println(count + " sec");
			if(count == 21) break;
			
		System.out.println("Current Population Count");
		printPopulationData(xpath_current_population);
		
		System.out.println("Today and This Year population count");
		printPopulationData(xpath_today_thisYear_population);
		System.out.println("=");
		Thread.sleep(1000);
		count++;

		}
	}
	
	public static void printPopulationData(String locator) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.findElements(By.xpath(locator))
				.stream()
						.forEach(a -> System.out.println(a.getText()));
		driver.quit();

		}

}