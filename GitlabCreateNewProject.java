import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitlabCreateNewProject implements Util {
	static{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	public static void main(String[] args){
		//open the browser
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//go to sign in link
		driver.get(URL);
		//enter username
		driver.findElement(By.id("user_login")).sendKeys(USERNAME);
		//enter password
		driver.findElement(By.id("user_password")).sendKeys(PASSWORD);
		//click login
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		//Clicking on new project link
		driver.findElement(By.linkText("New project")).click();
	
		driver.findElement(By.xpath("//body[@data-page='projects:new']")).click();
	
		driver.findElement(By.id("project_name")).sendKeys(PROJECT_NAME);
	
		//driver.findElement(By.id("project_path")).
	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	

}
