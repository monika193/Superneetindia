import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SignIn1 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.superneetindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.xpath("/html/body/nav/div[4]/div[1]/a/div[2]")).click();
		WebElement dropdown =driver.findElement(By.name("LoginAs"));
		Select s= new Select(dropdown);
		s.selectByIndex(6);
		s.selectByValue("Scholarship");
		driver.findElement(By.id("emailid1")).sendKeys("test5@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("welcome@123");
		driver.findElement(By.xpath("//*[@id=\"form0\"]/div/button")).click();

	}

}
