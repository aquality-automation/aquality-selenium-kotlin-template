package aquality.selenium.template.forms.pages

import aquality.selenium.template.forms.BaseAppForm
import org.openqa.selenium.By

class ContactUsPage : BaseAppForm(By.id("contact-us"), "Contact Us") {
    private val txbName = elementFactory.getTextBox(By.id("name"), "Name")
    private val txbCompany = elementFactory.getTextBox(By.id("company"), "Company")
    private val txbPhone = elementFactory.getTextBox(By.id("phone"), "Phone")
    private val txbComment = elementFactory.getTextBox(By.id("message"), "Comment")
    private val cmbPrivacy = elementFactory.getCheckBox(By.name("privacy"), "Privacy")
    private val btnSend = elementFactory.getButton(By.xpath("//input[@value='Send']"), "Send")
    private val lblEmailAlert = elementFactory.getLabel(
        By.xpath("//span[@role='alert']//preceding-sibling::input[@id='email']"),
        "Email validating message"
    )

    fun setName(name: String): ContactUsPage {
        txbName.clearAndType(name)
        return this
    }

    fun setCompany(company: String): ContactUsPage {
        txbCompany.clearAndType(company)
        return this
    }

    fun setPhone(phone: String): ContactUsPage {
        txbPhone.clearAndType(phone)
        return this
    }

    fun setComment(comment: String): ContactUsPage {
        txbComment.clearAndType(comment)
        return this
    }

    fun checkPrivacyAndCookies(): ContactUsPage {
        cmbPrivacy.check()
        return this
    }

    fun clickSend() {
        btnSend.click()
    }

    fun isEmailValidationMessagePresent(): Boolean {
        return lblEmailAlert.state().waitForDisplayed()
    }
}
