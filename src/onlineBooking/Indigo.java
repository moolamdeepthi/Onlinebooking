package onlineBooking;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Indigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://book.goindigo.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='GB']")).click();
		List<WebElement>oneway=driver.findElements(By.xpath(".//*[@class='form-radio']"));
		System.out.println(oneway.size());
		oneway.get(1).click();
		WebElement dropdown =  driver.findElement(By.xpath(".//*[@id='edit-pax']"));
		Select pax = new Select(dropdown);
		pax.selectByIndex(3);
		driver.findElement(By.xpath(".//*[@id='bookingenquiry-form']/div/div/div/div[6]/div/div/label")).sendKeys("24-02-2016");
		List<WebElement>inputdata=driver.findElements(By.xpath(".//*[@class='input form-text']"));
		System.out.println(inputdata.size());
		inputdata.get(0).sendKeys("10-3-2016");
		WebElement Namedropdown = driver.findElement(By.xpath(".//*[@id='edit-name']"));
		Select NameDd= new Select(Namedropdown);
		NameDd.selectByIndex(2);
		List<WebElement>firstname=driver.findElements(By.xpath(".//*[@class='input form-text']"));
		firstname.get(1).sendKeys("deepthi");
		List<WebElement>middlename=driver.findElements(By.xpath(".//*[@class='input form-text']"));
		middlename.get(2).sendKeys(" ");
		List<WebElement>lastname=driver.findElements(By.xpath(".//*[@class='input form-text']"));
		lastname.get(3).sendKeys("moolam ");
		List<WebElement>email=driver.findElements(By.xpath(".//*[@class='input form-text']"));
		email.get(4).sendKeys("deepthi.moolam@gmail.com");
		List<WebElement>mobilenum=driver.findElements(By.xpath(".//*[@class='input form-text']"));
		mobilenum.get(5).sendKeys("08624-221088 ");
		List<WebElement>telephone=driver.findElements(By.xpath(".//*[@class='input form-text']"));
		telephone.get(6).sendKeys("9999999999");
		List<WebElement>cityname=driver.findElements(By.xpath(".//*[@class='input form-text']"));
		cityname.get(7).sendKeys("Banglore");
		driver.findElement(By.xpath(".//*[@id='bookingenquiry-form']/div/div/div/div[6]/div/div/label")).sendKeys("24-02-2016");
	
	
	
	
	}

}
