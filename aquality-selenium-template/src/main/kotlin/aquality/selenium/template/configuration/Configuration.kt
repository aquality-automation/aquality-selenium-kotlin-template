package aquality.selenium.template.configuration

class Configuration {
    val startUrl : String
        get() = Environment().currentEnvironment.getValue("/startUrl") as String
}