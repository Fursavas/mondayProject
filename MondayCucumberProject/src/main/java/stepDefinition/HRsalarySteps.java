package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.HRSalaryPage;
import pageObjectModel.SignInPage;
import pageObjectModel.applicationPage;
import pageObjectModel.leftNav;
import utilities.Driver;
import utilities.ReadPropertiesFile;


import javax.naming.Name;
import java.util.concurrent.TimeUnit;

public class HRsalarySteps {

    leftNav lv = new leftNav();
    HRSalaryPage hr = new HRSalaryPage();
    WebDriver driver;
    SignInPage sip = new SignInPage();
    applicationPage ap = new applicationPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get(ReadPropertiesFile.getData("URL"));

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {

        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickonbuttonLogin();
    }

    @Given("^Click on human resources on top$")
    public void click_on_human_resources_on_top() throws Throwable {

        hr.clickOnHumanResource();
    }

    @Given("^Click on setup$")
    public void click_on_setup() throws Throwable {

        hr.clickOnSetup();
    }

    @Given("^Click on position salary$")
    public void click_on_position_salary() throws Throwable {

        hr.clickOnPositionSalary();
    }

    @Given("^Click on plus icon$")
    public void click_on_plus_icon() throws Throwable {
        ap.clickPlusButton();
    }

    @Given("^Type in new position salary \"([^\"]*)\"$")
    public void type_in_new_position_salary(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        hr.typePositionSalaryInputName(name);
    }

    @When("^Click on save button$")
    public void click_on_save_button() throws Throwable {
        ap.clickSaveButton();
    }

    @Then("^\"(.*?)\" should be displayed$")
    public void should_be_displayed(String name) throws Throwable {
        ap.nameIsCreated(name);
    }

    @Then("^Remove the data \"([^\"]*)\"$")
    public void remove_the_data(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ap.deletingElement(name);
    }

    @Then("^Verify data is removed \"([^\"]*)\"$")
    public void verify_data_is_removed(String name) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ap.verifingDeleted(name);
    }

}
