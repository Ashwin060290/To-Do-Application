package ashwin.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class myApplicationTest {
	
	
	public void startWebDriver(){
		
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.navigate().to("http://localhost:8080/login.do");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("Priya");
		driver.findElement(By.name("pass")).clear();
		driver.findElement(By.name("pass")).sendKeys("mau");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.findElement(By.id("add")).click();
		driver.findElement(By.name("todo")).clear();
		driver.findElement(By.name("todo")).sendKeys("Testing");
		driver.findElement(By.name("add")).click();
		
		driver.findElement(By.id("delete")).click();
		Select dropdown = new Select(driver.findElement(By.name("deletetodo")));
		dropdown.selectByVisibleText("Testing");
		driver.findElement(By.name("Delete")).click();
		
		driver.findElement(By.id("logout")).click();
		
		driver.close();
		
	}

}
