package aquality.selenium.template.forms

import aquality.selenium.forms.Form
import org.openqa.selenium.By

abstract class BaseAppForm(locator: By, name: String) : Form(locator, name) {
    private val btnAcceptCookies = elementFactory.getButton(By.id("cookie_action_close_header"), "Accept cookies")

    fun acceptCookies() {
        btnAcceptCookies.click()
    }
}
