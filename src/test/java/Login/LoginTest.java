package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    //import chrome driver
    public void setup() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //import the selenium webDriver
        WebDriver driver = new ChromeDriver();
        //input project url
        driver.get("https://github.com/login");
        //waiting for globally
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        //maximize the window
        driver.manage().window().maximize();
        //get page tittle
        System.out.println(driver.getTitle());
        //locate username field
        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("festusakinyemi84@gmail.com");
        //locate password field
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("july1984");
        //click sign in button
        driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[12]")).click();
        Thread.sleep(10000);
        //close the browser after test
        driver.quit();
    }
    public static void main (String[] args) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setup();
    }
}
