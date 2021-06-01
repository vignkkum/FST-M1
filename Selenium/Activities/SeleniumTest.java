package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String args[]) throws InterruptedException {
    	//Driver Declaration 
    	//chrome
        //WebDriver driver = new ChromeDriver();
        //firefox
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.close();
    }
}
