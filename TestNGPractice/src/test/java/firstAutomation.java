import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class firstAutomation  {

    WebDriverWait wait;
    ChromeOptions chromeOptions;
    FluentWait fluentWait;
    WebDriver wd;

    @Test
    public void successSignUp() throws MalformedURLException {

        chromeOptions = new ChromeOptions();
        wd = new RemoteWebDriver(new URL("http://192.168.29.11:4444"), chromeOptions);
        wd.get("https://demo.evershop.io/account/login");
        fluentWait = new FluentWait(wd)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5));
        wd.findElement(By.xpath("//a[@href='/account/register']")).click();
        wd.findElement(By.xpath("//input[@name= 'full_name']")).sendKeys("Anshika Srivastava");
        wd.findElement(By.xpath("//input[@name= 'email']")).sendKeys("anssri@gmail.com");
        wd.findElement(By.xpath("//input[@name= 'password']")).sendKeys("Pass123");
        wd.findElement(By.xpath("//input[@name= 'password']")).click();

        //popup functionality to be handled
    }

    @Test
    public void signOut(){



    }



}
