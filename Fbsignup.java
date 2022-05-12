package week2.day2;

import java.time.Duration;


import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbsignup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vignesh");
		driver.findElement(By.name("lastname")).sendKeys("Subramani");
		driver.findElement(By.name("reg_email__")).sendKeys("9551718793");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vign2230");

		WebElement dob1 = driver.findElement(By.id("day"));
		Select d1 = new Select(dob1);
		d1.selectByIndex(13);

		WebElement dob2 = driver.findElement(By.id("month"));
		Select d2 = new Select(dob2);
		d2.selectByIndex(10);

		WebElement dob3  = driver.findElement(By.id("year"));
		Select d3 = new Select(dob3);
		d3.selectByValue("1999");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();

		//driver.close();

	}
}
