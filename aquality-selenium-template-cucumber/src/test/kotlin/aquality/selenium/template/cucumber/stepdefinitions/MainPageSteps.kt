package aquality.selenium.template.cucumber.stepdefinitions

import aquality.selenium.browser.AqualityServices
import aquality.selenium.template.configuration.Configuration
import aquality.selenium.template.forms.TopBarMenu
import aquality.selenium.template.forms.pages.MainPage
import io.cucumber.java.en.Given
import io.cucumber.java.en.When

class MainPageSteps {
    private var mainPage = MainPage()
    private var topBarMenu = TopBarMenu()

    @Given("Main page is opened")
    fun mainPageIsOpened() {
        AqualityServices.getBrowser().goTo(Configuration().startUrl)
    }

    @When("I open Contact us page")
    fun openContactUsPage() {
        mainPage.acceptCookies()
        topBarMenu.openHeaderMenu(TopBarMenu.Item.CONTACT_US)
    }
}