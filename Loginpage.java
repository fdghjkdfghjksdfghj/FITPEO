package demo1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\latha.py\\\\drivers\\\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.fitpeo.com");
        driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
      WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiSlider-root.MuiSlider-colorPrimary.MuiSlider-sizeMedium.css-16i48op\r\n"
      		+ "")));     
      //js.executeScript("arguments[0].scrollIntoView(true);", slider);
      WebElement latha =  driver.findElement(By.xpath("//span[@class='MuiSlider-track css-10opxo5']"));
      Actions act = new Actions(driver);
      act.clickAndHold(latha);
      act.moveByOffset(108, 0).build().perform();
      Thread.sleep(3000);
//      WebDriverWait wait1 = new WebDriverWait(driver, 10);
//      WebElement suggestion1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':rf:']"+ "")));  
//      suggestion1.clear();
//      suggestion1.sendKeys("560");
      WebElement sirivelu = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']"));
      sirivelu.clear();
      sirivelu.sendKeys("560");
       JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0, 800);");
      driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[1]")).click();
      driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[2]")).click();
      driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[3]")).click();
      driver.findElement(By.xpath("(//input[@class='PrivateSwitchBase-input css-1m9pwf3'])[8]")).click();
  
      try {
          WebElement text= driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 inter css-1bl0tdj'])[4]"));

          String text2 = text.getText();

          String value = text2.split(":")[1].trim();

          value = value.replace("$", "").replace(",", "");

          int numberValue = Integer.parseInt(value);

          int expectedValue = 110700;
          if (numberValue == expectedValue) {
              System.out.println(numberValue);
          } else {
              System.out.println(numberValue);
          }
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          System.out.println("output is gone");
      }
      WebElement value = driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 inter css-1bl0tdj'])[4]"));
      String valueText = value.getText();

      System.out.println(valueText);

      
       
	}
	


            
          


          	        }
	





