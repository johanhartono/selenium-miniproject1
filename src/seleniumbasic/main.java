//Mini Project : Selenium Automation Login on OrangeHR Web App

package seleniumbasic;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//https://stackoverflow.com/questions/67257527/the-type-org-openqa-selenium-webdriver-is-not-accessible/69974272
//https://reflect.run/articles/how-to-deal-with-staleelementreferenceexception-in-selenium/
//
public class main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException { 
    //1.Define selected Browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--disable-features=OptimizationGuideModelDownloading,OptimizationHintsFetching,OptimizationTargetPrediction,OptimizationHints");
        WebDriver driver = new ChromeDriver(options);
        //Wait Implementation
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
   //2.get Browser URL
        driver.get("https://www.johanhartono.my.id/OrangeHR");
        driver.getTitle();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
   //3.Define Web Element
        
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));      
        WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("oxd-button")));
        //options.addArguments("--headless"); //github need this supaya tidak error
    
    //4. Execute Methods
       username.sendKeys("QATester1");
       password.sendKeys("@rangHR@2024");    
       login.click();
       
   	//5. Ending
       Thread.sleep(10000);
	   driver.close();
	}
	


}
