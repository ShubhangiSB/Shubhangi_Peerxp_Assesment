import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewProject {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		//open the browser
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//go to sign in link
		driver.get("https://gitlab.com/users/sign_in");
		//enter username
		driver.findElement(By.id("user_login")).sendKeys("kate56");
		//enter password
		driver.findElement(By.id("user_password")).sendKeys("Joy@12345");
		//click login
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//Clicking on new project link
		driver.findElement(By.linkText("New project")).click();
		
		driver.findElement(By.xpath("//body[@data-page='projects:new']")).click();
		
		driver.findElement(By.id("project_name")).sendKeys("Rst");
		
		//driver.findElement(By.id("project_path")).
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.close();
		
		

		
		
		
		

}
}
