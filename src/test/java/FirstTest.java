import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void userRegistration() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\1\\Desktop\\selenium\\idea\\src\\test\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://dev-1.clicktrans.pl/register-test/courier");
        WebElement name = driver.findElement(By.id("user_register_company_name"));
        name.sendKeys("Jan Kowalski");
        Thread.sleep(500);
        WebElement email = driver.findElement(By.id("user_register_email"));
        email.sendKeys("kowalski@wp.pl");
        Thread.sleep(500);
        WebElement lastname = driver.findElement(By.id("user_register_name"));
        lastname.sendKeys("Jan Kowalski");
        Thread.sleep(500);
        WebElement tel = driver.findElement(By.id("user_register_phone"));
        tel.sendKeys("678876678");
        Thread.sleep(500);
        WebElement password = driver.findElement(By.id("user_register_plainPassword"));
        password.sendKeys("12345678");
        Thread.sleep(500);
        WebElement first = driver.findElement(By.id("user_register_settings_agreementRegulations"));
        first.click();
        Thread.sleep(500);
        WebElement second = driver.findElement(By.id("user_register_settings_agreementPersonalData"));
        second.click();
        Thread.sleep(500);
        WebElement button = driver.findElement(By.id("user_register_submit"));
        button.click();
        Thread.sleep(500);
        boolean isAlertDisplay = driver.findElement(By.className("message")).isDisplayed();
        Assert.assertTrue(isAlertDisplay);
    }
}
