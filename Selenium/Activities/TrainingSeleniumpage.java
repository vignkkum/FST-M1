package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TrainingSeleniumpage {
    public static void main(String args[]) throws InterruptedException {
    	//Driver Declaration 
    	//chrome
        WebDriver driver = new ChromeDriver();
        //firefox
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium");  
        WebElement Getstarted=driver.findElement(By.xpath("//button[@onclick='showContent()']"));
        System.out.println(Getstarted.getText());      
        Getstarted.click();
        WebElement Directory=driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println(Directory.getText());
        Thread.sleep(2000);
        driver.close();
    }
}
