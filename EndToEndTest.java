package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndTest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		
		 int i = 1; 
		while(i<5) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
			
			//postoji jos jedna mogucnost da obelezimo vise clanova
			// for(int i=1 ; i<5 ; i++);
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		
		dropdown.selectByVisibleText("USD");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
		//moglao se i css pronaci tako sto bi u zagradu upisali : ("input[value='Search']")
		// mogao se i napraviti xpath, samo bi kod bio : ("//input[@value='Search']")
		// preporucuje se da se uvek koristi ID ako je moguce,jer je kod uvek jedinstvenn


	

	}

}
