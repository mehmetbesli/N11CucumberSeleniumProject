package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import n11.n11Project;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * created by MehmetBesli063 on 02.2019
 */
public class Hook extends n11Project {

    @Before
    public void initializeTest() {
        System.out.println("-----------------------------");
        System.out.println("Opening chrome browser");

        System.setProperty("webdriver.chrome.driver", "D:\\BESLI\\chromedriver\\chromedriver.exe");

        driver = new ChromeDriver();

        // tum elementler icin maksimum 15 bekleyeck
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void closingTest(Scenario scenario) {

        if (scenario.isFailed()) {
            System.out.println(scenario.getName());
        } else {
            System.out.println("-----------------------------");
            System.out.println("Browser closing");
        }
        driver.quit();
    }
}