package pageObjectModel;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HRSalaryPage extends AbstractClass {

    WebDriver driver;
    applicationPage ap = new applicationPage();
    public HRSalaryPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);



    }

    @FindBy(xpath="//span[contains(text(),'Human Resources')]")

    private WebElement humanResource;

    @FindBy(xpath="(//span[contains(text(),'Setup')])[4]")

    private WebElement setup;

    @FindBy(xpath="//span[contains(text(),'Position Salary')]")

    private WebElement positionSalary;

    @FindBy(xpath="//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")

    private WebElement positionSalaryInputName;

    @FindAll({
            @FindBy(xpath="//ms-delete-button//button")
    })
    private List<WebElement> listOfDeleteButtons;

    // -----------------------------------------------------------------------------------------------------------------

    public void clickOnHumanResource(){
        clickFunction(humanResource);

    }

    public void clickOnSetup(){
        waitUntilVisibility(humanResource);
        clickFunction(setup);
    }

    public void clickOnPositionSalary(){
        clickFunction(positionSalary);
    }

    public void typePositionSalaryInputName(String name){
        sendkeysFunction(positionSalaryInputName, name);
    }

}
