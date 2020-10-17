import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		//open the browser
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//go to sign in link
		driver.get("https://gitlab.com/users/sign_in#register-pane");
		
		driver.findElement(By.id("new_user_first_name")).sendKeys("");
		
		driver.findElement(By.id("new_user_last_name")).sendKeys("r");
		
		driver.findElement(By.id("new_user_username")).sendKeys("qrsdfgh1");

		driver.findElement(By.id("new_user_email")).sendKeys("qr@gmail.com");
		
		driver.findElement(By.id("new_user_password")).sendKeys("Qr123456");
		
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		

		
		
		
		
		
		
		
		
	}
	

}
