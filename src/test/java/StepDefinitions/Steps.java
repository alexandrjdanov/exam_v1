package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;

public class Steps {

    WebDriver driver;
    @Given("the user is on the apparel page")
    public void apparelPageIsOpened() {
        System.out.println("Users is on apparel page");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        driver.get("https://shop.md/en/apparel");
    }

    @When("the user click search button, write {word} and press ENTER")
    public void search(String string) {
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/button[1]/span"));
        searchButton.click();

        WebElement searchText = driver.findElement(By.xpath("//*[@id=\"search_widget\"]/form/div/div/div[1]/div/input"));
        searchText.sendKeys("Shirt", Keys.ENTER);

        WebElement viewResults = driver.findElement(By.xpath("//*[@id=\"link-search-page\"]"));
        viewResults.click();
    }

    @Then("page with results is displayed")
    public void resultsAreDisplayed() {
        assertEquals("https://shop.md/en/search?search_query=Shirt", driver.getCurrentUrl());
        driver.quit();
    }
}
