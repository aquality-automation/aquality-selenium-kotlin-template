package aquality.selenium.template.cucumber.hooks

import aquality.selenium.browser.AqualityServices
import io.cucumber.java.After

class BrowserHooks {
    @After(order = 0)
    fun closeBrowser() {
        if (AqualityServices.isBrowserStarted()) {
            AqualityServices.getBrowser().quit()
        }
    }
}