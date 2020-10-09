package aquality.selenium.template.cucumber.transformations

import aquality.selenium.template.models.ContactUsInfo
import io.cucumber.java.DataTableType

class DataTableTypeTransformations {

    @DataTableType
    fun getContactUsInfo(entry: Map<String, String>): ContactUsInfo {
        return ContactUsInfo(entry.getValue("Name"), entry.getValue("Company"), entry.getValue("Phone"),
            entry.getValue("Comment")
        )
    }
}