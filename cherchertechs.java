import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class cherchertechs {
	
	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();	
		 driver.get("https://chercher.tech/practice/frames");
		 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().frame("iamframe");
		 //kilakudutha open aguthu atnala frames  open panna than kudumudiyum
		 
		 WebElement loc = driver.findElement(By.xpath("//input[@type='text']"));
		 loc.sendKeys("meenakshi");
		 
		 driver.switchTo().defaultContent();
		 
		 driver.switchTo().frame("frame2");
		 
		 WebElement to = driver.findElement(By.id("animals"));
		 Select s=new Select(to);
		 s.selectByIndex(2);
		 driver.switchTo().defaultContent(); 
		  
		 //frame2 to frame3 going but frame1 is also there in frame3 so that switching 1,3 frame same box
		 driver.switchTo().frame("iamframe");
		 driver.switchTo().frame("frame3");
		 
		 WebElement chk = driver.findElement(By.xpath("//*[@id='a']"));
		 chk.click();
		 
		 driver.switchTo().parentFrame();
		 loc.sendKeys("sundaram");
		 
		 
		 

	}

}
