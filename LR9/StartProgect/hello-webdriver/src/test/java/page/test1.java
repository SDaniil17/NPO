package page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class test1 {

        private static final String HOMEPAGE_URL = "https://nbalance.by/";
        private WebDriver driver;
        private String pasteName;

        @FindBy(xpath = "//*[@id='search']")
        private WebElement searcharea;
        @FindBy(xpath = "//*[@class='site__head_inner']")
        private WebElement span;
        @FindBy(xpath = "//*[@id='menu-item-81']")
        private WebElement searchButton;
        @FindBy(xpath = "//*[@id='select2-postform-format-container']")
        private WebElement formatInput;
        @FindBy(xpath = "//*[@id='postform-name']")
        private WebElement pasteNameInput;
        @FindBy(xpath = "//*[@class='btn -big']")
        private WebElement btnConfirm;

        public test1(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public test1 openPage1(){
            driver.get(HOMEPAGE_URL);
            return this;
        }

        public boolean createPastebin1(String textArea, String pasteName){
            searchButton.click();
            return true;
        }



        public boolean verifyContentPaste1(){
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            return span.getText().equals("Контакты");
        }
    }
