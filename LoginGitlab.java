import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGitlab {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		//open the browser
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//go to sign in link
		driver.get("https://gitlab.com/users/sign_in");
		//enter username
		driver.findElement(By.id("user_login")).sendKeys("kate56");
		//enter password
		driver.findElement(By.id("user_password")).sendKeys("Joy@12345");
		//click login
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		driver.close();
		
		

			
	}

}
