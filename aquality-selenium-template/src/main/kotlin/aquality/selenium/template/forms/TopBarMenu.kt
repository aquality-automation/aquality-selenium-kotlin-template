package aquality.selenium.template.forms

import aquality.selenium.forms.Form
import org.openqa.selenium.By

class TopBarMenu : Form(By.id("masthead"), "Header") {

    fun openHeaderMenu(menuItem: Item){
        elementFactory.getButton(menuItem.menuItemLocator, menuItem.toString()).clickAndWait()
    }

    enum class Item(val menuItemLocator: By) {
        CONTACT_US(By.xpath("//div[@id='primary-navigation']//li[contains(@class, 'contact-us menu')]//a"))
    }
}