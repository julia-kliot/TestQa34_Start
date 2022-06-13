import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test_1 {
    WebDriver wd;

    @Test
    public void start1(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedrivew","C:/Users/julia/Documents/QA/QA_Automation/QA/TestQa34_Start/chromedriver.exe");
        wd.navigate().to("https://trello.com/");

        wd.close();
        wd.quit();
    }
    @Test
    public void start2(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedrivew","C:/Users/julia/Documents/QA/QA_Automation/QA/TestQa34_Start/chromedriver.exe");
        wd.navigate().to("https://trello.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();
        wd.quit();

    }
    @Test
    public void start3() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        System.setProperty("webdriver.chromedrivew", "C:/Users/julia/Documents/QA/QA_Automation/QA/TestQa34_Start/chromedriver.exe");
        wd.navigate().to("https://trello.com/");

        //openloginform
        WebElement  login;
        login.click();

        //fill in login form
        WebElement emailTextbox;
        emailTextbox.click();
        emailTextbox.clear();
        emailTextbox.sendKeys("");

        //confirm email
        WebElement confirmLoginButton;
        confirmLoginButton.click();

        //fill in valid password
        WebElement passwordTextbox;
        passwordTextbox.click();
        passwordTextbox.clear();
        passwordTextbox.sendKeys("");

        //click loginButton
        WebElement logButton;
        logButton.click();
    }
    @Test
    public void test4(){
        //tag
        WebElement el= wd.findElement(By.tagName("a"));
        WebElement el2 = wd.findElement(By.id("skip-target"));
        WebElement el3 = wd.findElement(By.className("BigNavstyles__InnerHeader-sc-1mttgq7-2 kuxyBF"));
        WebElement el4 = wd.findElement(By.className("kuxyBF"));
        WebElement el5= wd.findElement(By.linkText("Log in"));
    }
}
