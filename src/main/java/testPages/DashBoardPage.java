package testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class DashBoardPage {


    WebDriver driver;
    public DashBoardPage(WebDriver driver){
        this.driver=driver;
    }



    @FindBy(how= How.XPATH, using="//div[@class='header-content']")
    WebElement userIcon;

    @FindBy(how= How.XPATH, using="//ul[@class='list-inline links']//a[@title='My Account']")
    WebElement myAccount;

    @FindBy(how= How.XPATH, using="//div[@class='change_password_wrapper' ]//a[contains(text(),'Address')]")
    WebElement address;
    @FindBy(how= How.TAG_NAME, using= "a")
    List<WebElement> addlinks;

    public void goToDashboard(){
        userIcon.click();
        myAccount.click();



    }

    public void validateAllLinks(){
        for (int i=0;i<addlinks.size();i++){
            WebElement element = addlinks.get(i);
            String url = element.getAttribute("href");
            validateLink(url);
        }
    }

    public void validateLink(String urlLink){
        try{
            URL link = new URL(urlLink);
            HttpURLConnection httpcon = (HttpURLConnection)link.openConnection();
            httpcon.setConnectTimeout(2000);
            httpcon.connect();

            if (httpcon.getResponseCode()==200){
                System.out.println(urlLink+" - "+httpcon.getResponseMessage());
            }
            if(httpcon.getResponseCode()==404){
                System.out.println(urlLink+" - "+httpcon.getResponseMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
