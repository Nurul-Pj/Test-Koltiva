package KoltivaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KoltivaTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.koltiva.com/");
		
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		delay(5);
		
		Actions act = new Actions(driver);
		WebElement dash = driver.findElement(By.xpath("//*[@id=\"comp-keidh9zf2label\"]"));
		act.moveToElement(dash).perform();
		
		delay(4);
		
		driver.findElement(By.xpath("//p[@id='comp-keidh9zfmoreContainer1label']")).click();
		System.out.println("Open to KoltiTrade");
		
		delay(2);
		
		String textVal = driver.findElement(By.xpath("//span[contains(text(),'Trading, Warehousing, and Distribution Services')]")).getText();
		System.out.println(textVal);
		
		delay(3);
		driver.quit();

	}
	
	static void delay (int detik) {
		try {
			Thread.sleep(1000*detik);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
