package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import n11.n11Project;
import org.openqa.selenium.By;

/**
 * created by MehmetBesli063 on 03.2019
 */
public class MyStepdefs extends n11Project {

    n11Project n11Project = new n11Project();

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        n11Project.goToN11LoginPage();
    }

    @And("^I enter username and password for login$")
    public void iEnterUsernameAndPasswordForLogin() throws Throwable {
        n11Project.enterUsernameAndPassword();
        n11Project.controlLoginPage();
    }

    @And("^I search product to buy$")
    public void iSearchProductToBuy() throws Throwable {
        n11Project.searchProduct();
        n11Project.controlSearchedProduct();
    }

    @And("^I go to the second page to choose$")
    public void iGoToTheSecondPageToChoose() throws Throwable {
        n11Project.gotoSecondPage();
        n11Project.getThirdProductName();
    }

    @And("^I add third product to favourite$")
    public void iAddThirdProductToFavourite() throws Throwable {
        n11Project.addThirdProductToFavourite();
    }

    @And("^I go to the favorite menu$")
    public void iGoToTheFavoriteMenu() throws Throwable {
        n11Project.gotoMyFavouriteProduct();
    }

    @And("^I click product that I added favourite before$")
    public void iClickProductThatIAddedFavouriteBefore() throws Throwable {
        n11Project.clickFavouriteProduct();
        n11Project.confirmSameProduct();
    }

    @And("^I delete product from favourite menu$")
    public void iDeleteProductFromFavouriteMenu() throws Throwable {
        n11Project.deleteProductFromFavourite();
        n11Project.controlDeletedOrNot();
        n11Project.closeDeleteConfirmMessagePopup();
    }

    @Then("^I log out from website$")
    public void iLogOutFromWebsite() throws Throwable {
        n11Project.Logout();
        n11Project.controlLogourOrNot();
    }

}