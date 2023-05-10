package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WebDriver driver;

   // @BeforeTest

    @BeforeTest

    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


    }

    public void waitfor(int sec){
        try {
            Thread.sleep(sec);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    @Test
    public void test1() {
        driver.navigate().to("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();



        WebElement firstNameBox = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstNameBox.sendKeys("suman");
        waitfor(3000);

        WebElement lastNamebox = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastNamebox.sendKeys("das");
        waitfor(3000);

        WebElement addressBox = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        addressBox.sendKeys("50-41 61th street, woodside");
        waitfor(3000);

    }




    @AfterTest

    public void teardown(){
        if (driver!=null);
        driver.close();
        driver.quit();

    }


}
