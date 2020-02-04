package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class leftNav {

    private WebDriver driver ;

    public leftNav(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }


}
