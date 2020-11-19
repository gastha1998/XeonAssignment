import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Q1. Write a program to automate grofers website (using selenium + core Java)
Step 1: Go to grofers
Step2: Select 2-3 item and them into your bag
Step3: Select Country
Step 4: If possible apply promo code
Step 5. Click on Place Order
 */

public class Grofers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		// Step - 1 : Go to Grofers:
		driver.get("https://grofers.com/cn/grocery-staples/cid/16");
		driver.manage().window().maximize();
		
		// Step - 3 : Select Country(as it popped up first)
		driver.findElement(By.xpath("//div[contains(text(),'New Delhi')]")).click();
		try {
		    Thread.sleep(5000);
		} catch (InterruptedException e) {
		    Thread.currentThread().interrupt();
		    return;
		}
		
		// Step - 2 : Add 3 items in the cart : 
		driver.findElement(By.xpath("(//span[contains(.,'Add To Cart')])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'Add To Cart')])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'Add To Cart')])[1]")).click();
		
		// Go to my cart:
		driver.findElementByCssSelector("span.item-count").click();
		
		// Proceed to checkout to place order
		driver.findElement(By.xpath("//button[contains(.,'Proceed to Checkout')]")).click();
		
		/* 
		   Step-4 and Step-5 can be done only after verifying OTP for a Number
		   In grofers they might have automated OTP verifying test case by hard-coding
		   the Number and OTP in the backend. Although there might be an alternative way
		   to do so.
		 */

	}

}
