package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
    public class testing_webpage {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.fitpeo.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.navigate().to("https://www.fitpeo.com/revenue-calculator");
            JavascriptExecutor j= (JavascriptExecutor)driver;
            j.executeScript("window.scrollBy(0,350)");
            WebElement handle=driver.findElement(By.xpath("//div[@class='MuiBox-root css-j7qwjs']/span/span[3]"));
            WebElement slider = driver.findElement(By.xpath("//div[@class='MuiBox-root css-j7qwjs']/span[1]/span[2]"));
            Actions actions = new Actions(driver);
            actions.dragAndDropBy(slider,108,0).build().perform();
            Thread.sleep(3000);
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=':R57alklff9da:']")));
            WebElement text_box=driver.findElement(By.xpath("//input[@id=':R57alklff9da:']"));
            text_box.clear();
            Thread.sleep(3000);
            text_box.sendKeys(Keys.chord(" +"));
            text_box.clear();
            text_box.sendKeys("560");
            Thread.sleep(3000);
            j.executeScript("window.scrollBy(0,600)");
            WebElement click57=driver.findElement(By.xpath("//div/label/span[text()=57]"));
            WebElement click19=driver.findElement(By.xpath("//div/label/span[text()=19.19]"));
            click57.click();click19.click();
            Thread.sleep(3000);
            j.executeScript("window.scrollBy(0,600)");
            WebElement click63=driver.findElement(By.xpath("//div/label/span[text()=63]"));
            click63.click();
            Thread.sleep(2000);
            WebElement click76=driver.findElement(By.xpath("//div/label/span[text()=14]"));
            j.executeScript("arguments[0].scrollIntoView();",click76);
            WebElement click75=driver.findElement(By.xpath("//div/label/span[text()=15]"));
            click75.click();
            text_box.clear();
            text_box.sendKeys(Keys.chord("+"));
            text_box.clear();
            text_box.sendKeys("820");
            WebElement element= driver.findElement(By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month:']"));
            WebElement element1= driver.findElement(By.xpath("//p[text()='Total Recurring Reimbursement for all Patients Per Month:']/p"));
            String s=element.getText();
            String s1=element.getText();
            System.out.println(s+" "+"\n"+s1);
            driver.quit();

        }

    }


