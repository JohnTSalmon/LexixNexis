package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CommonPageObject {

    private static ChromeDriver driver;
    private static WebElement currentElement;

    static {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void open(String url ) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    static void findTagWithText(HtmlTag tag, String text) {
        currentElement = driver.findElement(By.xpath("//"+tag.getValue()+"[contains(text(), '"+text+"')]"));
    }

    static void findElementByLinkText(String linkText) {
        currentElement = driver.findElement(By.linkText(linkText));
    }
    static void click() {
        currentElement.click();
    }

    static boolean probe(By by) {
        boolean present = true;
        try {
            currentElement = driver.findElement(by);
        }
        catch( NoSuchElementException nsee ) {
            present = false;
        }
        return present;
    }
    static void urlContains( String linkURL ) {
        assertThat( driver.getCurrentUrl(), containsString(linkURL));
    }
    static void ascend() {
        currentElement = currentElement.findElement(By.xpath(".."));
    }
}