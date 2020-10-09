package aquality.selenium.template.cucumber.runners

import io.cucumber.testng.AbstractTestNGCucumberTests
import io.cucumber.testng.CucumberOptions
import org.testng.annotations.DataProvider

@CucumberOptions(
    features = ["src/test/java/aquality/selenium/template/cucumber/features"],
    glue = ["aquality.selenium.template.cucumber.hooks", "aquality.selenium.template.cucumber.transformations", "aquality.selenium.template.cucumber.stepdefinitions"],
    plugin = ["io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm", "aquality.tracking.integrations.cucumber5jvm.AqualityTrackingCucumber5Jvm"],
    strict = true,
    objectFactory = io.cucumber.guice.GuiceFactory::class
)
class TestRunner : AbstractTestNGCucumberTests() {

    @DataProvider(parallel = true)
    override fun scenarios(): Array<Array<Any>> {
        return super.scenarios()
    }
}
