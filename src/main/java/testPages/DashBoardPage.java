package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardPage {


    WebDriver driver;
    public DashBoardPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how= How.XPATH, using="//div[@class='change_password_wrapper' ]//a[contains(text(),'Address')]")
    WebElement address;

    @FindBy(how= How.XPATH, using="//a[@class='btn btn-primary' ]")
    WebElement newAddressButton;

    @FindBy(how= How.XPATH, using="//div[@class='header-content']")
    WebElement userIcon;

    @FindBy(how= How.XPATH, using="//ul[@class='list-inline links']//a[@title='My Account']")
    WebElement myAccount;

    public void addAddress(){
        userIcon.click();
        myAccount.click();
    }


}
