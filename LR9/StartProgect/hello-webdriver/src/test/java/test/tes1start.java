package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.PastebinHomePagePF;
import page.test1;

public class tes1start {

        private WebDriver driver;

        @BeforeMethod(alwaysRun = true)
        public void browserSetup(){
            driver = new ChromeDriver();
        }

        @Test(description = "Test creating pastbin")
        public void createPastebin1(){
            Assert.assertTrue(new test1(driver)
                    .openPage1()
                    .createPastebin1("Контакты"
                            , "helloweb"));
            Assert.assertFalse(new test1(driver)
                    .verifyContentPaste1());
        }

        @AfterTest(alwaysRun = true)
        public void browserShutdown(){
            driver.quit();
        }
    }
