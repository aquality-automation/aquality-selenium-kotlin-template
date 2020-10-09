package aquality.selenium.template.cucumber.stepdefinitions

import aquality.selenium.template.forms.pages.ContactUsPage
import aquality.selenium.template.models.ContactUsInfo
import io.cucumber.java.Transpose
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.testng.Assert.assertTrue

class ContactUsPageSteps {
    private var contactUsPage = ContactUsPage()

    @Then("Contact us page is opened")
    fun checkContactUsPageIsOpened() {
        assertTrue(contactUsPage.state().waitForDisplayed(), "Contact us page is opened")
    }

    @When("I fill contact form using following data:")
    fun fillContactUsPage(@Transpose contactUsInfo: ContactUsInfo) {
        contactUsPage.setName(contactUsInfo.name)
            .setCompany(contactUsInfo.company)
            .setPhone(contactUsInfo.phone)
            .setComment(contactUsInfo.comment)
    }

    @When("I accept Privacy and Cookies Policy")
    fun acceptPrivacyAndCookiesPolicy() {
        contactUsPage.checkPrivacyAndCookies()
    }

    @When("I click Send button")
    fun clickSendButton() {
        contactUsPage.clickSend()
    }

    @Then("Notification about empty fields is present")
    fun checkEmptyFieldWarning() {
        assertTrue(
            contactUsPage.isEmailValidationMessagePresent(),
            "Email validation message should be displayed"
        )
    }
}