package aquality.selenium.template.configuration

import aquality.selenium.browser.AqualityServices
import aquality.selenium.core.utilities.ISettingsFile
import aquality.selenium.core.utilities.JsonSettingsFile
import java.nio.file.Paths

class Environment {
    val currentEnvironment : ISettingsFile
        get() {
            val envName = AqualityServices.get(ISettingsFile::class.java).getValue("/environment") as String
            val resourcePath = Paths.get("environment", envName, "config.json");
            return JsonSettingsFile(resourcePath.toString())
        }
}