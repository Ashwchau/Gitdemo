package InternalAssessment.UIAutomation1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class worldometers {
		// TODO Auto-generated method stub
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String xpath_current_population = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_population = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_thisyear_population = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		
		String xpath_today_thisYear_population = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		driver = new ChromeDriver();
driver.get("https://www.worldometers.info/world-population/");
		
		int count = 1;
		while(count<=4) {
			System.out.println(count + " sec");
			if(count == 5) break;
			
		System.out.println("current population count");
		printPopulationData(xpath_current_population);
		
		System.out.println("Today and This Year population coun");
		printPopulationData(xpath_today_thisYear_population);
		Thread.sleep(1000);
		count++;

		}
	}
	
	public static void printPopulationData(String locator) throws InterruptedException {
		driver
			.findElements(By.xpath(locator))
				.stream()
						.forEach(e -> System.out.println(e.getText()));

		}
	

}
