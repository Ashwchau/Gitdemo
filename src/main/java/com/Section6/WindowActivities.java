package Section6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {


public static void main(String[] args) {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:/Users/Ashwchau/OneDrive - Capgemini/Documents/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://google.com");
driver.navigate().to("https://rahulshettyacademy.com");
driver.navigate().back();
driver.navigate().forward();

}
}

